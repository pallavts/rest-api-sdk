let _setConfig = null;

const navigateEndpoint = (apiResourceId) => {
  document.location.hash = apiResourceId;
};

let shouldPatch = false;
let isApiMaticPortalReady = false;

const patchURLAndPlayground = async ({ baseUrl, accessToken }) => {
  // find the configure button element
  const configButtonElement = await getElementByIdAsync("code-config-button");
  if (!configButtonElement) return;
  configButtonElement.click(); // programatically click on configure button
  // Get all Form elements to control flickering the configuration form
  const formElements = document.querySelectorAll("form");
  const formElement = formElements[formElements.length - 1]?.parentElement;
  if (!formElement) return;
  formElement.style.display = "none";
  configButtonElement.style.display = "block";
  setTimeout(() => {
    // find the input element for to update base_url
    const inputElement = document.querySelector('input[label="base-url"]');
    if (!inputElement) return;
    const event = new Event("input", { bubbles: true }); // create an input event to update base_url
    const previousValue = inputElement.value;
    inputElement.value = baseUrl; // setup host and port url to input elment
    // eslint-disable-next-line no-underscore-dangle
    inputElement._valueTracker.setValue(previousValue);
    inputElement.dispatchEvent(event); // dispatch input elment
    inputElement.focus();
    const accesTokenInputElement = document.querySelector(
      'input[label="AccessToken"]'
    );
    if (!accesTokenInputElement) return;
    const accessTokenEvent = new Event("input", { bubbles: true }); // create an input event to update accesstoken
    const accessTokenPreviousValue = accesTokenInputElement.value;
    accesTokenInputElement.value = accessToken; // set it up access token get from api
    // eslint-disable-next-line no-underscore-dangle
    accesTokenInputElement._valueTracker.setValue(accessTokenPreviousValue);
    accesTokenInputElement.dispatchEvent(accessTokenEvent); // dispatch access token input elment
    accesTokenInputElement.focus();
    // to hide configure form finding titleElement and clicking programatically
    const titleElement = document.getElementsByClassName("sc-kEjbQP");
    if (!titleElement || titleElement.length === 0) return;
    titleElement[0].click();
    shouldPatch = false;
  });
};

const channel = new MessageChannel();
let playgroundConfig = null;

window.parent.postMessage({ type: "api-playground-ready" }, "*", [
  channel.port2,
]);

function getElementByIdAsync(id) {
  let maxTime = 2000;
  const STEP = 16;
  return new Promise((resolve) => {
    const interval = setInterval(() => {
      const element = document.getElementById(id);
      maxTime -= STEP;
      if (element || maxTime <= 0) {
        clearInterval(interval);
        resolve(element);
      }
    }, STEP);
  });
}

document.getElementsByClassName("portal-header")[0].style.display = "none";

const setAPIMaticPortalConfig = () => {
  APIMaticDevPortal.ready(({ setConfig }) => {
    isApiMaticPortalReady = true;
    setConfig((defaultConfig) => {
      return {
        ...defaultConfig,
        showFullCode: false,
        config: {
          ...defaultConfig.config,
          "Accept-Language": "Typescript",
          AccessToken: playgroundConfig.access,
          "base-url": playgroundConfig.baseUrl,
        },
      };
    });
  });
};

/** setting APIMatic Portal */
setAPIMaticPortalConfig();

window.addEventListener("hashchange", (e) => {
  if (!shouldPatch) {
    return;
  }
  setPlaygroundConfig(playgroundConfig);
});

window.addEventListener("message", (event) => {
  if (event.data?.type === "api-playground-config") {
    shouldPatch = true;
    playgroundConfig = event.data;
    if (playgroundConfig.apiResourceId) {
      navigateEndpoint(playgroundConfig.apiResourceId);
    }
  }
});

const setPlaygroundConfig = ({ baseUrl, access }) => {
  _setConfig((defaultConfig) => {
    return {
      ...defaultConfig,
      showFullCode: false,
      config: {
        ...defaultConfig.config,
        AccessToken: access,
        "base-url": baseUrl,
      },
    };
  });
};

window.test = (config) => {
  setPlaygroundConfig(playgroundConfig);
};

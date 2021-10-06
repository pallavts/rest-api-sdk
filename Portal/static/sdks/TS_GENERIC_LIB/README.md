
# Getting Started with TS Public RestAPI

## Installation

The following section explains how to use the TS Public RestAPILib library in a new project.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `contentType` | `string` | body content type for post request<br>*Default*: `'application/json'` |
| `acceptLanguage` | `string` | response format<br>*Default*: `'application/json'` |
| `baseUrl` | `string` | *Default*: `'https://localhost:443'` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.Production`** |
| `timeout` | `number` | Timeout for API calls.<br>*Default*: `0` |
| `accessToken` | `string` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```ts
const client = new Client({
  contentType: null,
  acceptLanguage: null,
  timeout: 0,
  environment: Environment.Production
  accessToken: 'AccessToken',
})
```

## Authorization

This API uses `OAuth 2 Bearer token`.

## List of APIs

* [Session](/doc/controllers/session.md)
* [User](/doc/controllers/user.md)

## Classes Documentation

* [ApiResponse](/doc/api-response.md)
* [ApiError](/doc/api-error.md)


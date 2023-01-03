
# Getting Started with ThoughtSpot Public REST API

## Install the Package

The package is compatible with Python versions `3 >=3.7, <= 3.10`.
Install the package from PyPi using the following pip command:

```python
pip install thoughtspot-rest-api-sdk==1.13.1
```

You can also view the package at:
https://pypi.python.org/pypi/thoughtspot-rest-api-sdk

## Test the SDK

You can test the generated SDK and the server with test cases. `unittest` is used as the testing framework and `pytest` is used as the test runner. You can run the tests as follows:

Navigate to the root directory of the SDK and run the following commands

```
pip install -r test-requirements.txt
pytest
```

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `base_url` | `string` | *Default*: `'https://localhost:443'` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `http_client_instance` | `HttpClient` | The Http Client passed from the sdk user for making requests |
| `override_http_client_configuration` | `bool` | The value which determines to override properties of the passed Http Client from the sdk user |
| `http_call_back` | `HttpCallBack` | The callback value that is invoked before and after an HTTP call is made to an endpoint |
| `timeout` | `float` | The value to use for connection timeout. <br> **Default: 60** |
| `max_retries` | `int` | The number of times to retry an endpoint call if it fails. <br> **Default: 0** |
| `backoff_factor` | `float` | A backoff factor to apply between attempts after the second try. <br> **Default: 2** |
| `retry_statuses` | `Array of int` | The http statuses on which retry is to be done. <br> **Default: [408, 413, 429, 500, 502, 503, 504, 521, 522, 524, 408, 413, 429, 500, 502, 503, 504, 521, 522, 524]** |
| `retry_methods` | `Array of string` | The http methods on which retry is to be done. <br> **Default: ['GET', 'PUT', 'GET', 'PUT']** |
| `skip_ssl_cert_verification` | `boolean` | Set to true to allow skipping ssl certificate verification |
| `access_token` | `string` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```python
from thoughtspotpublicrestapi.thoughtspotpublicrestapi_client import ThoughtspotpublicrestapiClient
from thoughtspotpublicrestapi.configuration import Environment

client = ThoughtspotpublicrestapiClient(
    access_token='AccessToken',
    environment=Environment.PRODUCTION,
    base_url = 'https://localhost:443',)
```

## Authorization

This API uses `OAuth 2 Bearer token`.

## List of APIs

* [User](doc/controllers/user.md)
* [Group](doc/controllers/group.md)
* [Metadata](doc/controllers/metadata.md)
* [Database](doc/controllers/database.md)
* [Connection](doc/controllers/connection.md)
* [Data](doc/controllers/data.md)
* [Logs](doc/controllers/logs.md)
* [Custom Actions](doc/controllers/custom-actions.md)
* [Security](doc/controllers/security.md)
* [Org](doc/controllers/org.md)
* [Session](doc/controllers/session.md)
* [Admin](doc/controllers/admin.md)
* [Report](doc/controllers/report.md)
* [Materialization](doc/controllers/materialization.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpResponse](doc/http-response.md)
* [HttpRequest](doc/http-request.md)


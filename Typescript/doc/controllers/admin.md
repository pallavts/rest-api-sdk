# Admin

```ts
const adminController = new AdminController(client);
```

## Class Name

`AdminController`

## Methods

* [Restapi V2 Update Cluster Config](../../doc/controllers/admin.md#restapi-v2-update-cluster-config)
* [Restapi V2 Reset User Password](../../doc/controllers/admin.md#restapi-v2-reset-user-password)
* [Restapi V2 Sync Principal](../../doc/controllers/admin.md#restapi-v2-sync-principal)
* [Restapi V2 Change Author of Objects](../../doc/controllers/admin.md#restapi-v2-change-author-of-objects)
* [Restapi V2 Assign Author to Objects](../../doc/controllers/admin.md#restapi-v2-assign-author-to-objects)
* [Restapi V2 Force Logout Users](../../doc/controllers/admin.md#restapi-v2-force-logout-users)


# Restapi V2 Update Cluster Config

To update the Thoughtspot cluster configuration, use this endpoint.

```ts
async restapiV2UpdateClusterConfig(
  body: TspublicRestV2AdminConfigurationUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminConfigurationUpdateRequest`](../../doc/models/tspublic-rest-v2-admin-configuration-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2AdminConfigurationUpdateRequest = {};

try {
  const { result, ...httpResponse } = await adminController.restapiV2UpdateClusterConfig(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Reset User Password

To reset the password of a ThoughtSpot user account, use this endpoint.

It is mandatory to use Authorization header with token of a user with admin access to successfully run this endpoint.

At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```ts
async restapiV2ResetUserPassword(
  body: TspublicRestV2AdminResetpasswordRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminResetpasswordRequest`](../../doc/models/tspublic-rest-v2-admin-resetpassword-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2AdminResetpasswordRequest = {
  newPassword: 'newPassword0',
};

try {
  const { result, ...httpResponse } = await adminController.restapiV2ResetUserPassword(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Sync Principal

To programmatically synchronize user accounts and user groups from external system with ThoughtSpot, use this endpoint.

The payload takes principals containing all users and groups present in the external system.

The users and user groups in Thoughtspot get updated for any matching inputs.

Any user and user group present in the input, but not present in the cluster, gets created in cluster.
n You can optionally choose to delete the user and groups from the cluster, that are not present in the input.

```ts
async restapiV2SyncPrincipal(
  body: TspublicRestV2AdminSyncprincipalRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<AdminsyncPrincipalResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminSyncprincipalRequest`](../../doc/models/tspublic-rest-v2-admin-syncprincipal-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`AdminsyncPrincipalResponse`](../../doc/models/adminsync-principal-response.md)

## Example Usage

```ts
const contentType = null;
const bodyPrincipalObject: unknown[] = ['{"key1":"val1","key2":"val2"}'];
const body: TspublicRestV2AdminSyncprincipalRequest = {
  principalObject: bodyPrincipalObject,
};

try {
  const { result, ...httpResponse } = await adminController.restapiV2SyncPrincipal(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Change Author of Objects

To programmatically change the owner of one or several objects from one user account to another, use this endpoint.

You might want to transfer ownership of objects owned by a user to another active user, when the account is removed from the ThoughtSpot application.

```ts
async restapiV2ChangeAuthorOfObjects(
  body: TspublicRestV2AdminChangeauthorRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminChangeauthorRequest`](../../doc/models/tspublic-rest-v2-admin-changeauthor-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyTsObjectId: string[] = ['tsObjectId7'];
const bodyFromUser: FromUserNameAndIDInput = {};

const bodyToUser: ToUserNameAndIDInput = {};

const body: TspublicRestV2AdminChangeauthorRequest = {
  tsObjectId: bodyTsObjectId,
  fromUser: bodyFromUser,
  toUser: bodyToUser,
};

try {
  const { result, ...httpResponse } = await adminController.restapiV2ChangeAuthorOfObjects(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Assign Author to Objects

To programmatically assign an author to one or several objects, use this endpoint.

Provide either user name or id as input. When both are given user id will be considered.

Requires administration privilege.

```ts
async restapiV2AssignAuthorToObjects(
  body: TspublicRestV2AdminAssignauthorRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminAssignauthorRequest`](../../doc/models/tspublic-rest-v2-admin-assignauthor-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyTsObjectId: string[] = ['tsObjectId7'];
const body: TspublicRestV2AdminAssignauthorRequest = {
  tsObjectId: bodyTsObjectId,
};

try {
  const { result, ...httpResponse } = await adminController.restapiV2AssignAuthorToObjects(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Force Logout Users

To logout one or more users from logged in session, use this endpoint. If no input is provided then all logged in users are force logged out.

Requires administration privilege

```ts
async restapiV2ForceLogoutUsers(
  body: TspublicRestV2AdminForcelogoutRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminForcelogoutRequest`](../../doc/models/tspublic-rest-v2-admin-forcelogout-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2AdminForcelogoutRequest = {};

try {
  const { result, ...httpResponse } = await adminController.restapiV2ForceLogoutUsers(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


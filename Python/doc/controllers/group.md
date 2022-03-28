# Group

```python
group_controller = client.group
```

## Class Name

`GroupController`

## Methods

* [Get Group](../../doc/controllers/group.md#get-group)
* [Create Group](../../doc/controllers/group.md#create-group)
* [Update Group](../../doc/controllers/group.md#update-group)
* [Delete Group](../../doc/controllers/group.md#delete-group)
* [Add Privileges to Group](../../doc/controllers/group.md#add-privileges-to-group)
* [Remove Privileges From Group](../../doc/controllers/group.md#remove-privileges-from-group)
* [Add Users to Group](../../doc/controllers/group.md#add-users-to-group)
* [Remove Users From Group](../../doc/controllers/group.md#remove-users-from-group)
* [Add Groups to Group](../../doc/controllers/group.md#add-groups-to-group)
* [Remove Groups From Group](../../doc/controllers/group.md#remove-groups-from-group)
* [Search Groups](../../doc/controllers/group.md#search-groups)


# Get Group

To get the details of a specific group by name or id, use this endpoint.

At least one value needed. When both are given,then id will be considered to fetch user information.

Permission: Requires administration privilege

```python
def get_group(self,
             name=None,
             id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the group |
| `id` | `string` | Query, Optional | The GUID of the group |

## Response Type

[`GroupResponse`](../../doc/models/group-response.md)

## Example Usage

```python
result = group_controller.get_group()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create Group

To programmatically create a group in the ThoughtSpot system, use this API endpoint.

Using this API, you can create a group and assign privileges and users.

For ease of user management and access control, ThoughtSpot administrations can create groups and assign privileges to these groups.

The privileges determine the actions that the users belonging to a group are allowed to do.

ThoughtSpot also has a default group called ALL_GROUP. When you create new group in ThoughtSpot, they are automatically added to ALL_GROUP. You cannot delete the ALL_GROUP or remove members from it.

Permission: Requires administration privilege

```python
def create_group(self,
                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupCreateRequest`](../../doc/models/tspublic-rest-v2-group-create-request.md) | Body, Required | - |

## Response Type

[`GroupResponse`](../../doc/models/group-response.md)

## Example Usage

```python
body = TspublicRestV2GroupCreateRequest()
body.name = 'name6'
body.display_name = 'displayName6'

result = group_controller.create_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Update Group

You can use this endpoint to programmatically modify an existing group.

To modify a group, you require admin user privileges.

At least one of id or name is required to update the group. When both are given, then id will be considered and group name will be updated.

Permission: Requires administration privilege

```python
def update_group(self,
                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupUpdateRequest`](../../doc/models/tspublic-rest-v2-group-update-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2GroupUpdateRequest()

result = group_controller.update_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete Group

To remove a group from the ThoughtSpot system, send a DELETE request to this endpoint.

At least one value needed. When both are given,then user id will be considered to fetch user information.

Permission: Requires administration privilege

```python
def delete_group(self,
                name=None,
                id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the group. |
| `id` | `string` | Query, Optional | The GUID of the group |

## Response Type

`bool`

## Example Usage

```python
result = group_controller.delete_group()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Add Privileges to Group

To programmatically add privileges to an existing group, use API endpoint.

When you assign privileges to a group, all the users under to this group inherits the privileges assigned to that group.

At least one of id or name of group is required. When both are given,then user id will be considered.

Permission: Requires administration privilege

```python
def add_privileges_to_group(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupAddprivilegeRequest`](../../doc/models/tspublic-rest-v2-group-addprivilege-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2GroupAddprivilegeRequest()

result = group_controller.add_privileges_to_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Remove Privileges From Group

To programmatically remove privileges from a group, use API endpoint.

The API removes only the privilege association. It does not delete the privilege or group from the Thoughtspot system.

At least one of id or name of group is required. When both are given,then user id will be considered.

Permission: Requires administration privilege

```python
def remove_privileges_from_group(self,
                                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupRemoveprivilegeRequest`](../../doc/models/tspublic-rest-v2-group-removeprivilege-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2GroupRemoveprivilegeRequest()

result = group_controller.remove_privileges_from_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Add Users to Group

To programmatically add existing ThoughtSpot users to a group, use this API endpoint.

hen you assign users to a group, the users inherits the privileges assigned to that group.

At least one of id or name of the group is required. When both are given,then user id will be considered.

Permission: Requires administration privilege

```python
def add_users_to_group(self,
                      body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupAdduserRequest`](../../doc/models/tspublic-rest-v2-group-adduser-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2GroupAdduserRequest()
body.users = []

body.users.append(UserNameAndIDInput())


result = group_controller.add_users_to_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Remove Users From Group

To programmatically remove users from a group, use API endpoint.

The API removes only the user association. It does not delete the users or group from the Thoughtspot system.

At least one of id or name of group is required. When both are given,then user id will be considered.

Permission: Requires administration privilege

```python
def remove_users_from_group(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupRemoveuserRequest`](../../doc/models/tspublic-rest-v2-group-removeuser-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2GroupRemoveuserRequest()
body.users = []

body.users.append(UserNameAndIDInput())


result = group_controller.remove_users_from_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Add Groups to Group

To programmatically add existing groups to a group, use API endpoint.

When you assign groups to a group, the group inherits the privileges assigned to those groups.

At least one of id or name of group is required. When both are given,then user id will be considered.

Permission: Requires administration privilege

```python
def add_groups_to_group(self,
                       body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupAddgroupRequest`](../../doc/models/tspublic-rest-v2-group-addgroup-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2GroupAddgroupRequest()
body.groups = []

body.groups.append(GroupNameAndIDInput())


result = group_controller.add_groups_to_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Remove Groups From Group

To programmatically remove groups from a group, use API endpoint.

The API removes only the group association. It does not delete the group from the Thoughtspot system.

At least one of id or name of group is required. When both are given,then user id will be considered.

Permission: Requires administration privilege

```python
def remove_groups_from_group(self,
                            body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupRemovegroupRequest`](../../doc/models/tspublic-rest-v2-group-removegroup-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2GroupRemovegroupRequest()
body.groups = []

body.groups.append(GroupNameAndIDInput())


result = group_controller.remove_groups_from_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Groups

To get the details of a specific group account or all groups in the ThoughtSpot system use this end point.

If no inputs are provided, then all groups are included in the response.

Permission: Requires administration privilege

```python
def search_groups(self,
                 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2GroupSearchRequest`](../../doc/models/tspublic-rest-v2-group-search-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2GroupSearchRequest()

result = group_controller.search_groups(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Group

```python
group_controller = client.group
```

## Class Name

`GroupController`

## Methods

* [Get Group](/doc/controllers/group.md#get-group)
* [Create Group](/doc/controllers/group.md#create-group)
* [Delete Group](/doc/controllers/group.md#delete-group)
* [Add Users to Group](/doc/controllers/group.md#add-users-to-group)
* [Remove Users From Group](/doc/controllers/group.md#remove-users-from-group)
* [Add Privileges to Group](/doc/controllers/group.md#add-privileges-to-group)
* [Search Groups](/doc/controllers/group.md#search-groups)


# Get Group

To get the details of a specific group by name or id, use this endpoint. At Least one value needed.  When both are given id will be considered to fetch user information.

```python
def get_group(self,
             name=None,
             id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the group |
| `id` | `string` | Query, Optional | The GUID of the group to query |

## Response Type

[`GroupResponse`](/doc/models/group-response.md)

## Example Usage

```python
result = group_controller.get_group()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Create Group

To programmatically create a group in the ThoughtSpot system use this API endpoint.  Using this API, you can create a group and assign privileges and users. For ease of user management and access control, ThoughtSpot administrators can create groups and assign privileges to these groups.  The privileges determine the actions that the users belonging to a group are allowed to do. ThoughtSpot also has a default group called ALL_GROUP.  When you create new group in ThoughtSpot, they are automatically added to ALL_GROUP. You cannot delete the ALL_GROUP or remove members from it.

```python
def create_group(self,
                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupCreateRequest`](/doc/models/api-rest-v2-group-create-request.md) | Body, Required | - |

## Response Type

[`GroupResponse`](/doc/models/group-response.md)

## Example Usage

```python
body = ApiRestV2GroupCreateRequest()
body.name = 'name6'
body.display_name = 'displayName6'

result = group_controller.create_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Delete Group

To remove a group from the ThoughtSpot system, use this endpoint.  At least one value of name or id is needed.  When both are given group id will be considered to delete.

```python
def delete_group(self,
                name=None,
                id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the group that you want to delete. |
| `id` | `string` | Query, Optional | The GUID of the group to delete. |

## Response Type

`bool`

## Example Usage

```python
result = group_controller.delete_group()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Add Users to Group

To programmatically add existing ThoughtSpot users to a group use API endpoint. When you assign users to a group, the users inherits the privileges assigned to that group. At least one of id or name of group is required. When both are given user id will be considered.

```python
def add_users_to_group(self,
                      body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupAdduserRequest`](/doc/models/api-rest-v2-group-adduser-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2GroupAdduserRequest()

result = group_controller.add_users_to_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Remove Users From Group

To programmatically remove users from a group, use this API endpoint.  The API removes only the user association. It does not delete the users or group from the Thoughtspot system.  At least one of id or name of group is required. When both are given, id will be considered.

```python
def remove_users_from_group(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupRemoveuserRequest`](/doc/models/api-rest-v2-group-removeuser-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2GroupRemoveuserRequest()

result = group_controller.remove_users_from_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Add Privileges to Group

To programmatically add privileges to an existing group, use API endpoint.  When you assign privileges to a group,  all the users under to this group inherits the privileges assigned from this group.  At least one of id or name of group is required. When both are given id will be considered.

```python
def add_privileges_to_group(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupAddprivilegeRequest`](/doc/models/api-rest-v2-group-addprivilege-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2GroupAddprivilegeRequest()

result = group_controller.add_privileges_to_group(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Search Groups

To get the details of a specific group account or all groups in the ThoughtSpot system use this end point. If no inputs are provided, then all groups are included in the response.

```python
def search_groups(self,
                 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2GroupSearchRequest`](/doc/models/api-rest-v2-group-search-request.md) | Body, Required | - |

## Response Type

[`List of GroupResponse`](/doc/models/group-response.md)

## Example Usage

```python
body = ApiRestV2GroupSearchRequest()

result = group_controller.search_groups(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


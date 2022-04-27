
# Tspublic Rest V2 Group Create Request

## Structure

`TspublicRestV2GroupCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Required | Name of the user group. The group name string must be unique. |
| `displayName` | `string` | Required | A unique display name string for the user group, for example, Developer group. |
| `visibility` | [`CreateGroupVisibilityEnum \| undefined`](../../doc/models/create-group-visibility-enum.md) | Optional | Visibility of the user group.<br><br>The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects.<br>**Default**: `CreateGroupVisibilityEnum.DEFAULT` |
| `description` | `string \| undefined` | Optional | Description text for the group. |
| `privileges` | [`CreateGroupPrivilegesEnum[] \| undefined`](../../doc/models/create-group-privileges-enum.md) | Optional | A JSON array of privileges assigned to the group |
| `groups` | [`GroupNameAndIDInput[] \| undefined`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |
| `users` | [`UserNameAndIDInput[] \| undefined`](../../doc/models/user-name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered |
| `type` | [`CreateGroupTypeEnum \| undefined`](../../doc/models/create-group-type-enum.md) | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `CreateGroupTypeEnum.LOCALGROUP` |

## Example (as JSON)

```json
{
  "name": "name0",
  "displayName": "displayName2",
  "visibility": null,
  "description": null,
  "privileges": null,
  "groups": null,
  "users": null,
  "type": null
}
```


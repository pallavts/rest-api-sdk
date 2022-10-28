
# Tspublic Rest V2 Org Search Request

## Structure

`TspublicRestV2OrgSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the organization. |
| `Id` | `int?` | Optional | The ID of the organization. |
| `ShowDeleted` | `bool?` | Optional | When set to true, the response will include the details of deleted organization also.<br>**Default**: `false` |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "showDeleted": null
}
```


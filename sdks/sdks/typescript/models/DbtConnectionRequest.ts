/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class DbtConnectionRequest {
    /**
    * Name of the connection.
    */
    'connection_name': string;
    /**
    * Name of the Database.
    */
    'database_name': string;
    /**
    * Mention type of Import
    */
    'import_type'?: DbtConnectionRequestImportTypeEnum;
    /**
    * Access token is mandatory when Import_Type is DBT_CLOUD.
    */
    'access_token'?: string;
    /**
    * DBT URL is mandatory when Import_Type is DBT_CLOUD.
    */
    'dbt_url'?: string;
    /**
    * Account ID is mandatory when Import_Type is DBT_CLOUD
    */
    'account_id'?: string;
    /**
    * Project ID is mandatory when Import_Type is DBT_CLOUD
    */
    'project_id'?: string;
    /**
    * DBT Environment ID\"
    */
    'dbt_env_id'?: string;
    /**
    * Name of the project
    */
    'project_name'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "connection_name",
            "baseName": "connection_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "database_name",
            "baseName": "database_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "import_type",
            "baseName": "import_type",
            "type": "DbtConnectionRequestImportTypeEnum",
            "format": ""
        },
        {
            "name": "access_token",
            "baseName": "access_token",
            "type": "string",
            "format": ""
        },
        {
            "name": "dbt_url",
            "baseName": "dbt_url",
            "type": "string",
            "format": ""
        },
        {
            "name": "account_id",
            "baseName": "account_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "project_id",
            "baseName": "project_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "dbt_env_id",
            "baseName": "dbt_env_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "project_name",
            "baseName": "project_name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DbtConnectionRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type DbtConnectionRequestImportTypeEnum = "DBT_CLOUD" ;


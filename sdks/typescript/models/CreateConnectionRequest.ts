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

export class CreateConnectionRequest {
    /**
    * Unique name for the connection.
    */
    'name': string;
    /**
    * Description of the connection.
    */
    'description'?: string;
    /**
    * Type of the data warehouse.
    */
    'dataWarehouseType': CreateConnectionRequestDataWarehouseTypeEnum;
    /**
    * Configuration of the data warehouse in JSON.
    */
    'dataWarehouseConfig': any;
    /**
    * Indicates whether to validate the connection details.
    */
    'validate'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "dataWarehouseType",
            "baseName": "data_warehouse_type",
            "type": "CreateConnectionRequestDataWarehouseTypeEnum",
            "format": ""
        },
        {
            "name": "dataWarehouseConfig",
            "baseName": "data_warehouse_config",
            "type": "any",
            "format": ""
        },
        {
            "name": "validate",
            "baseName": "validate",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateConnectionRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type CreateConnectionRequestDataWarehouseTypeEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" ;


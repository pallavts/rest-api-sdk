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

export class LogResponse {
    /**
    * Date timestamp of the log entry
    */
    'date': string;
    /**
    * Log data
    */
    'log': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "date",
            "baseName": "date",
            "type": "string",
            "format": ""
        },
        {
            "name": "log",
            "baseName": "log",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return LogResponse.attributeTypeMap;
    }

    public constructor() {
    }
}


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

/**
* CALLBACK Custom Action Type
*/
export class CALLBACK {
    /**
    * Reference name of the sdk. By default the value will be set to action name
    */
    'reference'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "reference",
            "baseName": "reference",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CALLBACK.attributeTypeMap;
    }

    public constructor() {
    }
}


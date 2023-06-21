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

import { CALLBACKInput } from '../models/CALLBACKInput';
import { URLInput } from '../models/URLInput';
import { HttpFile } from '../http/http';

/**
* Filter the action objects based on type
*/
export class TypeInput {
    'CALLBACK'?: CALLBACKInput;
    'URL'?: URLInput;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "CALLBACK",
            "baseName": "CALLBACK",
            "type": "CALLBACKInput",
            "format": ""
        },
        {
            "name": "URL",
            "baseName": "URL",
            "type": "URLInput",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return TypeInput.attributeTypeMap;
    }

    public constructor() {
    }
}


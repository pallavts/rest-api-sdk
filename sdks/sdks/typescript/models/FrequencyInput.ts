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

import { CronExpressionInput } from '../models/CronExpressionInput';
import { HttpFile } from '../http/http';

/**
* Configuration of schedule with cron expression
*/
export class FrequencyInput {
    'cron_expression': CronExpressionInput;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "cron_expression",
            "baseName": "cron_expression",
            "type": "CronExpressionInput",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FrequencyInput.attributeTypeMap;
    }

    public constructor() {
    }
}


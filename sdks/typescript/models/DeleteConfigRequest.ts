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

export class DeleteConfigRequest {
    /**
    *    Applicable when Orgs is enabled in the cluster      Indicator to consider cluster level or org level config. Set it to false to delete configuration from current org. If set to true, then the configuration at cluster level and orgs that inherited the configuration from cluster level will be deleted.     Version: 9.5.0.cl or later 
    */
    'cluster_level'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "cluster_level",
            "baseName": "cluster_level",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DeleteConfigRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


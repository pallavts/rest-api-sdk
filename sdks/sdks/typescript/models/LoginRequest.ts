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

export class LoginRequest {
    /**
    * Username of the ThoughtSpot user
    */
    'username'?: string;
    /**
    * Password of the user account
    */
    'password'?: string;
    /**
    * ID of the Org context to log in to. If Org ID is not specified, the user will be logged in to the Org context of their previous login session.
    */
    'org_identifier'?: string;
    /**
    * A flag to remember the user session. When set to true, a session cookie is created and used in subsequent API requests.
    */
    'remember_me'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "username",
            "baseName": "username",
            "type": "string",
            "format": ""
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string",
            "format": ""
        },
        {
            "name": "org_identifier",
            "baseName": "org_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "remember_me",
            "baseName": "remember_me",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return LoginRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


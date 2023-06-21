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

import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
import { HttpFile } from '../http/http';

export class ImportUser {
    /**
    * Unique ID or name of the user.
    */
    'userIdentifier': string;
    /**
    * Unique display name of the user.
    */
    'displayName': string;
    /**
    * Password of the user.
    */
    'password'?: string;
    /**
    * Type of the user account.
    */
    'accountType'?: ImportUserAccountTypeEnum;
    /**
    * Status of the user account.
    */
    'accountStatus'?: ImportUserAccountStatusEnum;
    /**
    * Email of the user.
    */
    'email'?: string;
    /**
    * Unique ID or name of the Orgs for the users.
    */
    'orgIdentifiers'?: Array<string>;
    /**
    * Unique ID or name of the User Groups of the users.
    */
    'groupIdentifiers'?: Array<string>;
    /**
    * Visibility of the users. The SHARABLE makes a users visible to other users and user groups, and thus allows them to share objects.
    */
    'visibility'?: ImportUserVisibilityEnum;
    /**
    * User preference for receiving email notifications on shared answers or liveboard.
    */
    'notifyOnShare'?: boolean;
    /**
    * The user preference for revisiting the onboarding experience.
    */
    'showOnboardingExperience'?: boolean;
    /**
    * The user preference for turning off the onboarding experience.
    */
    'onboardingExperienceCompleted'?: boolean;
    /**
    * Unique ID or name of the users home liveboard.
    */
    'homeLiveboardIdentifier'?: string;
    /**
    * Metadata objects to be assigned as favorites for the imported user.
    */
    'favoriteMetadata'?: Array<FavoriteMetadataInput>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "userIdentifier",
            "baseName": "user_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "displayName",
            "baseName": "display_name",
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
            "name": "accountType",
            "baseName": "account_type",
            "type": "ImportUserAccountTypeEnum",
            "format": ""
        },
        {
            "name": "accountStatus",
            "baseName": "account_status",
            "type": "ImportUserAccountStatusEnum",
            "format": ""
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "orgIdentifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "groupIdentifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "ImportUserVisibilityEnum",
            "format": ""
        },
        {
            "name": "notifyOnShare",
            "baseName": "notify_on_share",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "showOnboardingExperience",
            "baseName": "show_onboarding_experience",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "onboardingExperienceCompleted",
            "baseName": "onboarding_experience_completed",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "homeLiveboardIdentifier",
            "baseName": "home_liveboard_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "favoriteMetadata",
            "baseName": "favorite_metadata",
            "type": "Array<FavoriteMetadataInput>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ImportUser.attributeTypeMap;
    }

    public constructor() {
    }
}


export type ImportUserAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER" ;
export type ImportUserAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING" ;
export type ImportUserVisibilityEnum = "SHARABLE" | "NON_SHARABLE" ;


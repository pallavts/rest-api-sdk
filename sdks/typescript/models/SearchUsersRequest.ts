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
import { SortOptions } from '../models/SortOptions';
import { HttpFile } from '../http/http';

export class SearchUsersRequest {
    /**
    * GUID / name of the user to search
    */
    'user_identifier'?: string;
    /**
    * A unique display name string for the user account, usually their first and last name
    */
    'display_name'?: string;
    /**
    * A pattern to match case-insensitive name of the User object.
    */
    'name_pattern'?: string;
    /**
    * Visibility of the user
    */
    'visibility'?: SearchUsersRequestVisibilityEnum;
    /**
    * Email of the user account
    */
    'email'?: string;
    /**
    * GUID or name of the group to which the user belongs
    */
    'group_identifiers'?: Array<string>;
    /**
    * Privileges assigned to the user
    */
    'privileges'?: Array<SearchUsersRequestPrivilegesEnum>;
    /**
    * Type of the account
    */
    'account_type'?: SearchUsersRequestAccountTypeEnum;
    /**
    * Current status of the user account.
    */
    'account_status'?: SearchUsersRequestAccountStatusEnum;
    /**
    * User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet.
    */
    'notify_on_share'?: boolean | null;
    /**
    * The user preference for revisiting the onboarding experience
    */
    'show_onboarding_experience'?: boolean | null;
    /**
    * Indicates if the user has completed the onboarding walkthrough
    */
    'onboarding_experience_completed'?: boolean | null;
    /**
    * IDs or names of the Orgs to which the user belongs
    */
    'org_identifiers'?: Array<string>;
    /**
    * Unique ID or name of the user\'s home Liveboard.
    */
    'home_liveboard_identifier'?: string;
    /**
    * Metadata objects which are assigned as favorites of the user.
    */
    'favorite_metadata'?: Array<FavoriteMetadataInput>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included.
    */
    'record_size'?: number;
    'sort_options'?: SortOptions;
    /**
    * Filters by the role assigned to the user.
    */
    'role_identifiers'?: Array<string>;
    /**
    * Indicates if the user\'s favorite objects should be displayed.
    */
    'include_favorite_metadata'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "user_identifier",
            "baseName": "user_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "display_name",
            "baseName": "display_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "name_pattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "SearchUsersRequestVisibilityEnum",
            "format": ""
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "group_identifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<SearchUsersRequestPrivilegesEnum>",
            "format": ""
        },
        {
            "name": "account_type",
            "baseName": "account_type",
            "type": "SearchUsersRequestAccountTypeEnum",
            "format": ""
        },
        {
            "name": "account_status",
            "baseName": "account_status",
            "type": "SearchUsersRequestAccountStatusEnum",
            "format": ""
        },
        {
            "name": "notify_on_share",
            "baseName": "notify_on_share",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "show_onboarding_experience",
            "baseName": "show_onboarding_experience",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "onboarding_experience_completed",
            "baseName": "onboarding_experience_completed",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "org_identifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "home_liveboard_identifier",
            "baseName": "home_liveboard_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "favorite_metadata",
            "baseName": "favorite_metadata",
            "type": "Array<FavoriteMetadataInput>",
            "format": ""
        },
        {
            "name": "record_offset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "record_size",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "sort_options",
            "baseName": "sort_options",
            "type": "SortOptions",
            "format": ""
        },
        {
            "name": "role_identifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "include_favorite_metadata",
            "baseName": "include_favorite_metadata",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchUsersRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type SearchUsersRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE" ;
export type SearchUsersRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "ENABLESPOTAPPCREATION" | "PREVIEW_THOUGHTSPOT_SAGE" | "APPLICATION_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" ;
export type SearchUsersRequestAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER" ;
export type SearchUsersRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING" ;


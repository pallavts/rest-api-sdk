/**
 * TS Public RestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import {
  array,
  boolean,
  lazy,
  number,
  object,
  optional,
  Schema,
  string,
} from '../schema';
import { AuthorProperties, authorPropertiesSchema } from './authorProperties';
import {
  ModifiedProperties,
  modifiedPropertiesSchema,
} from './modifiedProperties';
import { OwenerProperties, owenerPropertiesSchema } from './owenerProperties';
import { StateEnum, stateEnumSchema } from './stateEnum';
import { TypeEnum, typeEnumSchema } from './typeEnum';
import { VisibilityEnum, visibilityEnumSchema } from './visibilityEnum';

export interface CreateUserResponce {
  /** Username of the user account */
  name?: string;
  /** Display name of the user account */
  displayName?: string;
  /** GUID of the user account */
  id?: string;
  /** Visibility of the user account */
  visibility?: VisibilityEnum;
  /** Email of the user account */
  mail?: string;
  /** Username of the owner of the user account */
  groups?: string[];
  /** Privileges assigned to user account */
  privileges?: string[];
  tags?: string[];
  /** Indicates if the user account is active or inactive */
  state?: StateEnum;
  /** Indicates if the email should be sent when object is shared with the user */
  notifyOnShare?: boolean;
  /** Indicates if the walk me should be shown when logging in */
  showWalkMe?: boolean;
  /** Indicates if the onboarding is completed for the user */
  analystOnboardingComplete?: boolean;
  /** Indicates if the use is logging in for the first time */
  firstLogin?: number;
  /** Indicates if the welcome email is sent to email associated with the user account */
  welcomeEmailSent?: boolean;
  /** Indicates if the user account is deleted */
  isDeleted?: boolean;
  /** Indicates if the user account is hidden */
  isHidden?: boolean;
  /** Indicates if the user account is from external system */
  isExternal?: boolean;
  isDeprecated?: boolean;
  /** Indicates if the all the properties of user account is provided */
  complete?: boolean;
  /** Indicates if the user account is super user */
  isSuperUser?: boolean;
  /** Indicates if the user account is system principal */
  isSystemPrincipal?: boolean;
  /** Indicates the type of user account */
  type?: TypeEnum;
  /** Indicates the type of parent object */
  parenttype?: string;
  /** Tenant id associated with the user account */
  tenantId?: string;
  indexVersion?: number;
  generationNum?: number;
  /** Date and time when user account was created */
  created?: number;
  /** Date and time of last modification of user account */
  modified?: number;
  author?: AuthorProperties;
  modifiedBy?: ModifiedProperties;
  owner?: OwenerProperties;
}

export const createUserResponceSchema: Schema<CreateUserResponce> = object({
  name: ['name', optional(string())],
  displayName: ['displayName', optional(string())],
  id: ['id', optional(string())],
  visibility: ['visibility', optional(visibilityEnumSchema)],
  mail: ['mail', optional(string())],
  groups: ['groups', optional(array(string()))],
  privileges: ['privileges', optional(array(string()))],
  tags: ['tags', optional(array(string()))],
  state: ['state', optional(stateEnumSchema)],
  notifyOnShare: ['notifyOnShare', optional(boolean())],
  showWalkMe: ['showWalkMe', optional(boolean())],
  analystOnboardingComplete: ['analystOnboardingComplete', optional(boolean())],
  firstLogin: ['firstLogin', optional(number())],
  welcomeEmailSent: ['welcomeEmailSent', optional(boolean())],
  isDeleted: ['isDeleted', optional(boolean())],
  isHidden: ['isHidden', optional(boolean())],
  isExternal: ['isExternal', optional(boolean())],
  isDeprecated: ['isDeprecated', optional(boolean())],
  complete: ['complete', optional(boolean())],
  isSuperUser: ['isSuperUser', optional(boolean())],
  isSystemPrincipal: ['isSystemPrincipal', optional(boolean())],
  type: ['type', optional(typeEnumSchema)],
  parenttype: ['parenttype', optional(string())],
  tenantId: ['tenantId', optional(string())],
  indexVersion: ['indexVersion', optional(number())],
  generationNum: ['generationNum', optional(number())],
  created: ['created', optional(number())],
  modified: ['modified', optional(number())],
  author: ['author', optional(lazy(() => authorPropertiesSchema))],
  modifiedBy: ['modifiedBy', optional(lazy(() => modifiedPropertiesSchema))],
  owner: ['owner', optional(lazy(() => owenerPropertiesSchema))],
});

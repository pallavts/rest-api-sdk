/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for GetTokenAccessLevelEnum
 */
export enum GetTokenAccessLevelEnum {
  FULL = 'FULL',
  REPORTBOOKVIEW = 'REPORT_BOOK_VIEW',
}

/**
 * Schema for GetTokenAccessLevelEnum
 */
export const getTokenAccessLevelEnumSchema: Schema<GetTokenAccessLevelEnum> = stringEnum(GetTokenAccessLevelEnum);

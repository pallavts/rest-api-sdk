/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for TsObjectSearchInputTypeEnum
 */
export enum TsObjectSearchInputTypeEnum {
  LIVEBOARD = 'LIVEBOARD',
  ANSWER = 'ANSWER',
  DATAOBJECT = 'DATAOBJECT',
  COLUMN = 'COLUMN',
}

/**
 * Schema for TsObjectSearchInputTypeEnum
 */
export const tsObjectSearchInputTypeEnumSchema: Schema<TsObjectSearchInputTypeEnum> = stringEnum(TsObjectSearchInputTypeEnum);

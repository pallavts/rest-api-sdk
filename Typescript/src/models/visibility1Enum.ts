/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for Visibility1Enum
 */
export enum Visibility1Enum {
  DEFAULT = 'DEFAULT',
  NONSHARABLE = 'NON_SHARABLE',
  SHARABLE = 'SHARABLE',
}

/**
 * Schema for Visibility1Enum
 */
export const visibility1EnumSchema: Schema<Visibility1Enum> = stringEnum(Visibility1Enum);

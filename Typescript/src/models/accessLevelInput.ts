/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';
import { AccessEnum, accessEnumSchema } from './accessEnum';
import { Type1Enum, type1EnumSchema } from './type1Enum';

export interface AccessLevelInput {
  /** Username or name of the user group */
  name?: string;
  /** GUID of the user or user group */
  id?: string;
  /** Type of access detail provided */
  type?: Type1Enum;
  /** Minimum access level that the specified user or user group has. If no input is provided then minimum access of READ_ONLY will be considered. */
  access?: AccessEnum;
}

export const accessLevelInputSchema: Schema<AccessLevelInput> = object({
  name: ['name', optional(string())],
  id: ['id', optional(string())],
  type: ['type', optional(type1EnumSchema)],
  access: ['access', optional(accessEnumSchema)],
});

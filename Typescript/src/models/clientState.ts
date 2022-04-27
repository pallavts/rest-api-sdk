/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface ClientState {
  /** Color assigned to the tag */
  color?: string;
}

export const clientStateSchema: Schema<ClientState> = object({
  color: ['color', optional(string())],
});

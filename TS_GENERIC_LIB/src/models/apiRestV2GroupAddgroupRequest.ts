/**
 * TS Public RestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, object, optional, Schema, string } from '../schema';

export interface ApiRestV2GroupAddgroupRequest {
  /** Name of the group */
  name?: string;
  /** The GUID of the group */
  id?: string;
  /** A JSON array of name of groups */
  groupNames?: string[];
}

export const apiRestV2GroupAddgroupRequestSchema: Schema<ApiRestV2GroupAddgroupRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    groupNames: ['groupNames', optional(array(string()))],
  }
);

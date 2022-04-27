/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface TableColumns {
  /** Name of the column */
  name?: string;
  /** Datatype of the column */
  dataType?: string;
}

export const tableColumnsSchema: Schema<TableColumns> = object({
  name: ['name', optional(string())],
  dataType: ['dataType', optional(string())],
});

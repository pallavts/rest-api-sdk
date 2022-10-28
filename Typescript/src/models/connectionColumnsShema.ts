/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import { TableColumns, tableColumnsSchema } from './tableColumns';

export interface ConnectionColumnsShema {
  /** Name of the table */
  name?: string;
  /** Name of the database */
  dbName?: string;
  /** Name of the schema */
  schemaName?: string;
  /** List of columns in the table */
  columns?: TableColumns[];
}

export const connectionColumnsShemaSchema: Schema<ConnectionColumnsShema> = object(
  {
    name: ['name', optional(string())],
    dbName: ['dbName', optional(string())],
    schemaName: ['schemaName', optional(string())],
    columns: ['columns', optional(array(lazy(() => tableColumnsSchema)))],
  }
);

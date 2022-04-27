/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, Schema, string } from '../schema';
import { TableInput, tableInputSchema } from './tableInput';

export interface TspublicRestV2ConnectionRemovetableRequest {
  /** GUID of the connection */
  id: string;
  table: TableInput[];
}

export const tspublicRestV2ConnectionRemovetableRequestSchema: Schema<TspublicRestV2ConnectionRemovetableRequest> = object(
  {
    id: ['id', string()],
    table: ['table', array(lazy(() => tableInputSchema))],
  }
);

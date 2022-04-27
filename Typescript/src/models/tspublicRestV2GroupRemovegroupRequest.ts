/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  GroupNameAndIDInput,
  groupNameAndIDInputSchema,
} from './groupNameAndIDInput';

export interface TspublicRestV2GroupRemovegroupRequest {
  /** Name of the group */
  name?: string;
  /** The GUID of the group */
  id?: string;
  /** A JSON array of group names or GUIDs or both. When both are given then id is considered */
  groups: GroupNameAndIDInput[];
}

export const tspublicRestV2GroupRemovegroupRequestSchema: Schema<TspublicRestV2GroupRemovegroupRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    groups: ['groups', array(lazy(() => groupNameAndIDInputSchema))],
  }
);

/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  UserNameAndIDInput,
  userNameAndIDInputSchema,
} from './userNameAndIDInput';

export interface TspublicRestV2GroupAdduserRequest {
  /** Name of the group */
  name?: string;
  /** The GUID of the group to query. */
  id?: string;
  /** Array of user name that you want to update in user group. */
  users: UserNameAndIDInput[];
}

export const tspublicRestV2GroupAdduserRequestSchema: Schema<TspublicRestV2GroupAdduserRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    users: ['users', array(lazy(() => userNameAndIDInputSchema))],
  }
);

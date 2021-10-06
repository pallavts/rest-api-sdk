/**
 * TS Public RestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { ApiResponse, RequestOptions } from '../core';
import { ErrorResponseError } from '../errors/errorResponseError';
import {
  ApiRestV2UserCreateRequest,
  apiRestV2UserCreateRequestSchema,
} from '../models/apiRestV2UserCreateRequest';
import {
  ApiRestV2UserUpdateRequest,
  apiRestV2UserUpdateRequestSchema,
} from '../models/apiRestV2UserUpdateRequest';
import {
  CreateUserResponce,
  createUserResponceSchema,
} from '../models/createUserResponce';
import {
  RestAPIUserDetail,
  restAPIUserDetailSchema,
} from '../models/restAPIUserDetail';
import { optional, string, unknown } from '../schema';
import { BaseController } from './baseController';

export class UserController extends BaseController {
  /**
   * To get the details of a specific user account by username or user id, use this endpoint. At Least
   * one value is needed.  When both are given, user id will be considered to fetch user information
   *
   * @param name
   * @param id
   * @return Response from the API call
   */
  async getUser(
    name?: string,
    id?: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<RestAPIUserDetail>> {
    const req = this.createRequest('GET', '/api/rest/v2/user');
    const mapped = req.prepareArgs({
      name: [name, optional(string())],
      id: [id, optional(string())],
    });
    req.query('name', mapped.name);
    req.query('id', mapped.id);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unautherized request');
    return req.callAsJson(restAPIUserDetailSchema, requestOptions);
  }

  /**
   * To programmatically create a user account in the ThoughtSpot system use this API endpoint. Using
   * this API, you can create a user and assign groups.
   * To create a user, you require admin user privileges.
   * All users created in the ThoughtSpot system are added to ALL_GROUP
   *
   * @param body
   * @return Response from the API call
   */
  async createUser(
    body?: ApiRestV2UserCreateRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<CreateUserResponce>> {
    const req = this.createRequest('POST', '/api/rest/v2/user/create');
    const mapped = req.prepareArgs({
      body: [body, optional(apiRestV2UserCreateRequestSchema)],
    });
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unautherized request');
    return req.callAsJson(createUserResponceSchema, requestOptions);
  }

  /**
   * You can use this endpoint to programmatically modify an existing user account.  To modify a user,
   * you require admin user privileges.
   * This API allows the following modifications to a user profile:
   * User name modifications
   * Password reset
   * User visibility for sharing objects
   * User preferences, such as viewing onboarding experience, subscribing to or unsubscribing from email
   * notifications, and so on.
   *
   * @param body
   * @return Response from the API call
   */
  async updateUser(
    body?: ApiRestV2UserUpdateRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<string>> {
    const req = this.createRequest('PUT', '/api/rest/v2/user/update');
    const mapped = req.prepareArgs({
      body: [body, optional(apiRestV2UserUpdateRequestSchema)],
    });
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unautherized request');
    return req.callAsText(requestOptions);
  }

  /**
   * To remove a user from the ThoughtSpot system, send a DELETE request to this endpoint. At Least one
   * value needed.  When both are given user id will be considered to fetch user information.
   *
   * @param name
   * @param id
   * @return Response from the API call
   */
  async deleteUser(
    name?: string,
    id?: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('DELETE', '/api/rest/v2/user/delete');
    const mapped = req.prepareArgs({
      name: [name, optional(string())],
      id: [id, optional(string())],
    });
    req.query('name', mapped.name);
    req.query('id', mapped.id);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unautherized request');
    return req.callAsJson(unknown(), requestOptions);
  }
}

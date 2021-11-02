/**
 * TS Public RestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { ApiResponse, RequestOptions } from '../core';
import { ErrorResponseError } from '../errors/errorResponseError';
import {
  ApiRestV2SessionGettokenRequest,
  apiRestV2SessionGettokenRequestSchema,
} from '../models/apiRestV2SessionGettokenRequest';
import {
  ApiRestV2SessionLoginRequest,
  apiRestV2SessionLoginRequestSchema,
} from '../models/apiRestV2SessionLoginRequest';
import {
  SessionInfoResponse,
  sessionInfoResponseSchema,
} from '../models/sessionInfoResponse';
import {
  SessionLoginResponse,
  sessionLoginResponseSchema,
} from '../models/sessionLoginResponse';
import { boolean } from '../schema';
import { BaseController } from './baseController';

export class SessionController extends BaseController {
  /**
   * To get session object information, use this endpoint
   *
   * @return Response from the API call
   */
  async sessionInfo(
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<SessionInfoResponse>> {
    const req = this.createRequest('GET', '/api/rest/v2/session');
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(sessionInfoResponseSchema, requestOptions);
  }

  /**
   * To programmatically login a user to ThoughtSpot, use this endpoint
   *
   * @param body
   * @return Response from the API call
   */
  async login(
    body: ApiRestV2SessionLoginRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<SessionLoginResponse>> {
    const req = this.createRequest('POST', '/api/rest/v2/session/login');
    const mapped = req.prepareArgs({
      body: [body, apiRestV2SessionLoginRequestSchema],
    });
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    req.authenticate(false);
    return req.callAsJson(sessionLoginResponseSchema, requestOptions);
  }

  /**
   * To programmatically create token for a user in ThoughtSpot, use this endpoint
   *
   * @param body
   * @return Response from the API call
   */
  async gettoken(
    body: ApiRestV2SessionGettokenRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<SessionLoginResponse>> {
    const req = this.createRequest('POST', '/api/rest/v2/session/gettoken');
    const mapped = req.prepareArgs({
      body: [body, apiRestV2SessionGettokenRequestSchema],
    });
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(sessionLoginResponseSchema, requestOptions);
  }

  /**
   * To log a user out of the current session, use this endpoint
   *
   * @return Response from the API call
   */
  async logout(
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest('POST', '/api/rest/v2/session/logout');
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    req.authenticate(false);
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To expire or revoke a token for a user, use this endpoint
   *
   * @return Response from the API call
   */
  async revoketoken(
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest('POST', '/api/rest/v2/session/revoketoken');
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }
}

/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { ApiResponse, RequestOptions } from '../core';
import { ErrorResponseError } from '../errors/errorResponseError';
import {
  ApiRestV2MetadataDependencyRequest,
  apiRestV2MetadataDependencyRequestSchema,
} from '../models/apiRestV2MetadataDependencyRequest';
import {
  ApiRestV2MetadataFavoriteAssignRequest,
  apiRestV2MetadataFavoriteAssignRequestSchema,
} from '../models/apiRestV2MetadataFavoriteAssignRequest';
import {
  ApiRestV2MetadataFavoriteUnassignRequest,
  apiRestV2MetadataFavoriteUnassignRequestSchema,
} from '../models/apiRestV2MetadataFavoriteUnassignRequest';
import {
  ApiRestV2MetadataHeaderSearchRequest,
  apiRestV2MetadataHeaderSearchRequestSchema,
} from '../models/apiRestV2MetadataHeaderSearchRequest';
import {
  ApiRestV2MetadataHomeliveboardAssignRequest,
  apiRestV2MetadataHomeliveboardAssignRequestSchema,
} from '../models/apiRestV2MetadataHomeliveboardAssignRequest';
import {
  ApiRestV2MetadataHomeliveboardUnassignRequest,
  apiRestV2MetadataHomeliveboardUnassignRequestSchema,
} from '../models/apiRestV2MetadataHomeliveboardUnassignRequest';
import {
  ApiRestV2MetadataTagAssignRequest,
  apiRestV2MetadataTagAssignRequestSchema,
} from '../models/apiRestV2MetadataTagAssignRequest';
import {
  ApiRestV2MetadataTagCreateRequest,
  apiRestV2MetadataTagCreateRequestSchema,
} from '../models/apiRestV2MetadataTagCreateRequest';
import {
  ApiRestV2MetadataTagUnassignRequest,
  apiRestV2MetadataTagUnassignRequestSchema,
} from '../models/apiRestV2MetadataTagUnassignRequest';
import {
  ApiRestV2MetadataTagUpdateRequest,
  apiRestV2MetadataTagUpdateRequestSchema,
} from '../models/apiRestV2MetadataTagUpdateRequest';
import {
  ApiRestV2MetadataTmlExportRequest,
  apiRestV2MetadataTmlExportRequestSchema,
} from '../models/apiRestV2MetadataTmlExportRequest';
import {
  ApiRestV2MetadataTmlImportRequest,
  apiRestV2MetadataTmlImportRequestSchema,
} from '../models/apiRestV2MetadataTmlImportRequest';
import {
  HomeLiveboardResponse,
  homeLiveboardResponseSchema,
} from '../models/homeLiveboardResponse';
import {
  MetadataTagResponse,
  metadataTagResponseSchema,
} from '../models/metadataTagResponse';
import { Type10Enum, type10EnumSchema } from '../models/type10Enum';
import { array, boolean, optional, string, unknown } from '../schema';
import { BaseController } from './baseController';

export class MetadataController extends BaseController {
  /**
   * To get details of a specific tag, use this endpoint. At least one of id or name of tag is required.
   * When both are given, then id will be considered.
   *
   * @param name Name of the tag
   * @param id   The GUID of the tag
   * @return Response from the API call
   */
  async getTag(
    name?: string,
    id?: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<MetadataTagResponse>> {
    const req = this.createRequest('GET', '/api/rest/v2/metadata/tag');
    const mapped = req.prepareArgs({
      name: [name, optional(string())],
      id: [id, optional(string())],
    });
    req.query('name', mapped.name);
    req.query('id', mapped.id);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(metadataTagResponseSchema, requestOptions);
  }

  /**
   * To programmatically create tags, use this endpoint
   *
   * @param body
   * @return Response from the API call
   */
  async createTag(
    body: ApiRestV2MetadataTagCreateRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<MetadataTagResponse>> {
    const req = this.createRequest('POST', '/api/rest/v2/metadata/tag/create');
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataTagCreateRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(metadataTagResponseSchema, requestOptions);
  }

  /**
   * To programmatically update tags, use this endpoint. At least one of id or name of tag is required.
   * When both are given, then id will be considered.
   *
   * @param body
   * @return Response from the API call
   */
  async updateTag(
    body: ApiRestV2MetadataTagUpdateRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest('PUT', '/api/rest/v2/metadata/tag/update');
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataTagUpdateRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To programmatically delete tags, use this endpoint. At least one of id or name of tag is required.
   * When both are given, then id will be considered.
   *
   * @param name Name of the tag
   * @param id   The GUID of the tag
   * @return Response from the API call
   */
  async deleteTag(
    name?: string,
    id?: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'DELETE',
      '/api/rest/v2/metadata/tag/delete'
    );
    const mapped = req.prepareArgs({
      name: [name, optional(string())],
      id: [id, optional(string())],
    });
    req.query('name', mapped.name);
    req.query('id', mapped.id);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To query the details of dependent objects and associate objects as dependents, you can use this API.
   * Dependency is defined as relation between referenced and referencing objects. A referencing object
   * is said to have a dependency on a referenced object, if the referenced object cannot be deleted
   * without first deleting the referencing object. For example, consider a worksheet W1 that has a
   * derived logical column C1 that has a reference to a base logical column C2. This can be shown
   * diagramatically as: W1-->C1-->C2. W1 has a dependency on C2 i.e. W1 is a referencing object and C2
   * is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion
   * of C2 will be prevented by the relationship between W1s column C1 and C2. Similarly C1 is said to
   * have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not
   * possible to delete C2 without first deleting C1
   *
   * @param body
   * @return Response from the API call
   */
  async getObjectDependency(
    body: ApiRestV2MetadataDependencyRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('POST', '/api/rest/v2/metadata/dependency');
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataDependencyRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * To programmatically assign tags to a metadata object, such as a liveboard, search answer, table,
   * worksheet, or view, use this endpoint.  At least one of id or name of tag is required. When both are
   * given, then id will be considered.
   *
   * @param body
   * @return Response from the API call
   */
  async assignTag(
    body: ApiRestV2MetadataTagAssignRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest('POST', '/api/rest/v2/metadata/tag/assign');
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataTagAssignRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table,
   * worksheet, or view, use this endpoint. At least one of id or name of tag is required. When both are
   * given, then id will be considered.
   *
   * @param body
   * @return Response from the API call
   */
  async unassignTag(
    body: ApiRestV2MetadataTagUnassignRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'POST',
      '/api/rest/v2/metadata/tag/unassign'
    );
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataTagUnassignRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To programmatically assign objects to favorites for a given user account, use this endpoint. At
   * least one of user id or username is required. When both are given, then id will be considered.
   *
   * @param body
   * @return Response from the API call
   */
  async assignFavorite(
    body: ApiRestV2MetadataFavoriteAssignRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'POST',
      '/api/rest/v2/metadata/favorite/assign'
    );
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataFavoriteAssignRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To programmatically unassign objects to favorites for a given user account, use this endpoint. At
   * least one of user id or username is required. When both are given, then id will be considered.Screen
   * reader support enabled.
   *
   * @param body
   * @return Response from the API call
   */
  async unassignFavorite(
    body: ApiRestV2MetadataFavoriteUnassignRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'POST',
      '/api/rest/v2/metadata/favorite/unassign'
    );
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataFavoriteUnassignRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint.
   * At least one of user id or username is required. When both are given, then id will be considered.
   *
   * @param userName
   * @param userId   The GUID of the user
   * @return Response from the API call
   */
  async getHomeliveboard(
    userName?: string,
    userId?: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<HomeLiveboardResponse>> {
    const req = this.createRequest(
      'GET',
      '/api/rest/v2/metadata/homeliveboard'
    );
    const mapped = req.prepareArgs({
      userName: [userName, optional(string())],
      userId: [userId, optional(string())],
    });
    req.query('userName', mapped.userName);
    req.query('userId', mapped.userId);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(homeLiveboardResponseSchema, requestOptions);
  }

  /**
   * To assign a specific liveboard as a home liveboard for a user, use this endpoint. At least one of
   * user id or username is required. When both are given, then id will be considered.
   *
   * @param body
   * @return Response from the API call
   */
  async assignHomeliveboard(
    body: ApiRestV2MetadataHomeliveboardAssignRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'POST',
      '/api/rest/v2/metadata/homeliveboard/assign'
    );
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataHomeliveboardAssignRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To unassign the home liveboard set for a user, use this endpoint. At least one of user id or
   * username is required. When both are given, then id will be considered.
   *
   * @param body
   * @return Response from the API call
   */
  async unassignHomeliveboard(
    body: ApiRestV2MetadataHomeliveboardUnassignRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'POST',
      '/api/rest/v2/metadata/homeliveboard/unassign'
    );
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataHomeliveboardUnassignRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To get a list of objects with incomplete metadata, use this endpoint
   *
   * @return Response from the API call
   */
  async getIncompleteObjects(
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('GET', '/api/rest/v2/metadata/incomplete');
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * To get header details for metadata objects, use this endpoint. You can provide as input selective
   * fields to get the data for.
   *
   * @param body
   * @return Response from the API call
   */
  async getObjectHeader(
    body: ApiRestV2MetadataHeaderSearchRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest(
      'POST',
      '/api/rest/v2/metadata/header/search'
    );
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataHeaderSearchRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * Use this endpoint to get header details of visualization charts for a given liveboard or answer. At
   * least one of id or name of liveboard or answer is required. When both are given, then id will be
   * considered.
   *
   * @param id The GUID of the liveboard or answer
   * @return Response from the API call
   */
  async getObjectVisualizationHeader(
    id: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown[]>> {
    const req = this.createRequest('GET', '/api/rest/v2/metadata/vizheaders');
    const mapped = req.prepareArgs({ id: [id, string()] });
    req.query('id', mapped.id);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(array(unknown()), requestOptions);
  }

  /**
   * Use this endpoint to get full details of metadata objects
   *
   * @param type                Type of the metadata object being searched. Valid values
   * @param id                  A JSON array of GUIDs of the objects.
   * @param showHidden          When set to true, returns details of the hidden objects, such as a
   *                                          column in a worksheet or a table.
   * @param dropQuestionDetails When set to true, the search assist data associated with a worksheet is
   *                                          not included in the API response. This attribute is applicable only for
   *                                          LOGICAL_TABLE data type.
   * @param version             Specify the version to retrieve the objects from. By default, the API
   *                                          returns metadata for all versions of the object.
   * @return Response from the API call
   */
  async getObjectDetail(
    type: Type10Enum,
    id: string[],
    showHidden?: boolean,
    dropQuestionDetails?: boolean,
    version?: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('GET', '/api/rest/v2/metadata/details');
    const mapped = req.prepareArgs({
      type: [type, type10EnumSchema],
      id: [id, array(string())],
      showHidden: [showHidden, optional(boolean())],
      dropQuestionDetails: [dropQuestionDetails, optional(boolean())],
      version: [version, optional(string())],
    });
    req.query('type', mapped.type);
    req.query('id', mapped.id);
    req.query('showHidden', mapped.showHidden);
    req.query('dropQuestionDetails', mapped.dropQuestionDetails);
    req.query('version', mapped.version);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint
   *
   * @param body
   * @return Response from the API call
   */
  async exportObjectTML(
    body: ApiRestV2MetadataTmlExportRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('POST', '/api/rest/v2/metadata/tml/export');
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataTmlExportRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint
   *
   * @param body
   * @return Response from the API call
   */
  async importObjectTML(
    body: ApiRestV2MetadataTmlImportRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('POST', '/api/rest/v2/metadata/tml/import');
    const mapped = req.prepareArgs({
      body: [body, apiRestV2MetadataTmlImportRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }
}

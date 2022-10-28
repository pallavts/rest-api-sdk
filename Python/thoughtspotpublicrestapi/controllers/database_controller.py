# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from thoughtspotpublicrestapi.api_helper import APIHelper
from thoughtspotpublicrestapi.configuration import Server
from thoughtspotpublicrestapi.controllers.base_controller import BaseController
from apimatic_core.request_builder import RequestBuilder
from apimatic_core.response_handler import ResponseHandler
from apimatic_core.types.parameter import Parameter
from thoughtspotpublicrestapi.http.http_method_enum import HttpMethodEnum
from apimatic_core.authentication.multiple.single_auth import Single
from apimatic_core.authentication.multiple.and_auth_group import And
from apimatic_core.authentication.multiple.or_auth_group import Or
from thoughtspotpublicrestapi.models.create_table_response import CreateTableResponse
from thoughtspotpublicrestapi.exceptions.error_response_exception import ErrorResponseException


class DatabaseController(BaseController):

    """A Controller to access Endpoints in the thoughtspotpublicrestapi API."""
    def __init__(self, config):
        super(DatabaseController, self).__init__(config)

    def restapi_v_2__get_schemas(self,
                                 database):
        """Does a GET request to /tspublic/rest/v2/database/schema.

        To list all the schemas in a database in Falcon, use this endpoint.

        Args:
            database (string): Name of the Falcon database

        Returns:
            list of string: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/database/schema')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('database')
                         .value(database)
                         .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__get_tables(self,
                                database,
                                schema):
        """Does a GET request to /tspublic/rest/v2/database/table.

        To list all the tables in a schema of a database in Falcon, use this
        endpoint.

        Args:
            database (string): Name of the Falcon database
            schema (string): Name of the schema in Falcon database

        Returns:
            list of string: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/database/table')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('database')
                         .value(database)
                         .is_required(True))
            .query_param(Parameter()
                         .key('schema')
                         .value(schema)
                         .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__get_table_details(self,
                                       database,
                                       table,
                                       schema=None):
        """Does a GET request to /tspublic/rest/v2/database/table/detail.

        Note: This endpoint is applicable only for on-prem deployments. 
        To provide details of a table in a schema of a database in Falcon, use
        this endpoint.

        Args:
            database (string): Name of the Falcon database
            table (string): Name of the table in Falcon database
            schema (string, optional): Name of the schema in Falcon database

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/database/table/detail')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('database')
                         .value(database)
                         .is_required(True))
            .query_param(Parameter()
                         .key('table')
                         .value(table)
                         .is_required(True))
            .query_param(Parameter()
                         .key('schema')
                         .value(schema))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__create_table(self,
                                  body):
        """Does a POST request to /tspublic/rest/v2/database/table/create.

        To create a table in Falcon, use this endpoint.

        Args:
            body (TspublicRestV2DatabaseTableCreateRequest): TODO: type
                description here.

        Returns:
            CreateTableResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/database/table/create')
            .http_method(HttpMethodEnum.POST)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(CreateTableResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__run_query(self,
                               body):
        """Does a POST request to /tspublic/rest/v2/database/table/runquery.

        To run a TQL statement in Falcon, use this endpoint. You can run only
        following type of statements - Table DDL alter and Table rows update
        and delete.

        Args:
            body (TspublicRestV2DatabaseTableRunqueryRequest): TODO: type
                description here.

        Returns:
            list of object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/database/table/runquery')
            .http_method(HttpMethodEnum.POST)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

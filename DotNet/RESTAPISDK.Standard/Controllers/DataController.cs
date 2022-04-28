// <copyright file="DataController.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard.Controllers
{
    using System;
    using System.Collections.Generic;
    using System.Dynamic;
    using System.Globalization;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading;
    using System.Threading.Tasks;
    using Newtonsoft.Json.Converters;
    using RESTAPISDK.Standard;
    using RESTAPISDK.Standard.Authentication;
    using RESTAPISDK.Standard.Exceptions;
    using RESTAPISDK.Standard.Http.Client;
    using RESTAPISDK.Standard.Http.Request;
    using RESTAPISDK.Standard.Http.Request.Configuration;
    using RESTAPISDK.Standard.Http.Response;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// DataController.
    /// </summary>
    public class DataController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DataController"/> class.
        /// </summary>
        /// <param name="config"> config instance. </param>
        /// <param name="httpClient"> httpClient. </param>
        /// <param name="authManagers"> authManager. </param>
        /// <param name="httpCallBack"> httpCallBack. </param>
        internal DataController(IConfiguration config, IHttpClient httpClient, IDictionary<string, IAuthManager> authManagers, HttpCallBack httpCallBack = null)
            : base(config, httpClient, authManagers, httpCallBack)
        {
        }

        /// <summary>
        /// To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint .
        ///  Permission: Requires at least view access to the dataobject and datadownloading privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object SearchQueryData(
                Models.TspublicRestV2DataSearchRequest body)
        {
            Task<object> t = this.SearchQueryDataAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint .
        ///  Permission: Requires at least view access to the dataobject and datadownloading privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> SearchQueryDataAsync(
                Models.TspublicRestV2DataSearchRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/data/search");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PostBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }

        /// <summary>
        /// To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint. .
        ///  Permission: Requires at least view access to the object and datadownloading privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object AnswerData(
                Models.TspublicRestV2DataAnswerRequest body)
        {
            Task<object> t = this.AnswerDataAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint. .
        ///  Permission: Requires at least view access to the object and datadownloading privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> AnswerDataAsync(
                Models.TspublicRestV2DataAnswerRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/data/answer");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PostBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }

        /// <summary>
        /// To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint .
        ///  Permission: Requires at least view access to the object and datadownloading privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object LiveboardData(
                Models.TspublicRestV2DataLiveboardRequest body)
        {
            Task<object> t = this.LiveboardDataAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint .
        ///  Permission: Requires at least view access to the object and datadownloading privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> LiveboardDataAsync(
                Models.TspublicRestV2DataLiveboardRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/data/liveboard");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PostBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }

        /// <summary>
        /// To retrieve the query SQL related to an Answer that is run on the data platform, you can use this endpoint. .
        ///  Permission: Requires at least view access to the object.
        /// </summary>
        /// <param name="id">Required parameter: The GUID of the Answer.</param>
        /// <returns>Returns the Models.AnswerQueryResponse response from the API call.</returns>
        public Models.AnswerQueryResponse AnswerQuerySql(
                string id)
        {
            Task<Models.AnswerQueryResponse> t = this.AnswerQuerySqlAsync(id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To retrieve the query SQL related to an Answer that is run on the data platform, you can use this endpoint. .
        ///  Permission: Requires at least view access to the object.
        /// </summary>
        /// <param name="id">Required parameter: The GUID of the Answer.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.AnswerQueryResponse response from the API call.</returns>
        public async Task<Models.AnswerQueryResponse> AnswerQuerySqlAsync(
                string id,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (id == null)
            {
                throw new ArgumentNullException("id", "The parameter \"id\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/data/answer/querysql");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "id", id },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
                { "Accept-Language", this.Config.AcceptLanguage },
                { "Content-Type", this.Config.ContentType },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Get(queryBuilder.ToString(), headers, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return ApiHelper.JsonDeserialize<Models.AnswerQueryResponse>(response.Body);
        }

        /// <summary>
        /// To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data platform, you can use this endpoint. .
        ///  Permission: Requires at least view access to the object.
        /// </summary>
        /// <param name="id">Required parameter: The GUID of the Liveboard.</param>
        /// <param name="vizId">Optional parameter: A JSON array of GUIDs of the visualizations in the Liveboard..</param>
        /// <returns>Returns the Models.LiveboardQueryResponse response from the API call.</returns>
        public Models.LiveboardQueryResponse LiveboardQuerySql(
                string id,
                List<string> vizId = null)
        {
            Task<Models.LiveboardQueryResponse> t = this.LiveboardQuerySqlAsync(id, vizId);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data platform, you can use this endpoint. .
        ///  Permission: Requires at least view access to the object.
        /// </summary>
        /// <param name="id">Required parameter: The GUID of the Liveboard.</param>
        /// <param name="vizId">Optional parameter: A JSON array of GUIDs of the visualizations in the Liveboard..</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.LiveboardQueryResponse response from the API call.</returns>
        public async Task<Models.LiveboardQueryResponse> LiveboardQuerySqlAsync(
                string id,
                List<string> vizId = null,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (id == null)
            {
                throw new ArgumentNullException("id", "The parameter \"id\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/data/liveboard/querysql");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "id", id },
                { "vizId", vizId },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
                { "Accept-Language", this.Config.AcceptLanguage },
                { "Content-Type", this.Config.ContentType },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Get(queryBuilder.ToString(), headers, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return ApiHelper.JsonDeserialize<Models.LiveboardQueryResponse>(response.Body);
        }
    }
}
// <copyright file="ReportController.cs" company="APIMatic">
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
    /// ReportController.
    /// </summary>
    public class ReportController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportController"/> class.
        /// </summary>
        /// <param name="config"> config instance. </param>
        /// <param name="httpClient"> httpClient. </param>
        /// <param name="authManagers"> authManager. </param>
        /// <param name="httpCallBack"> httpCallBack. </param>
        internal ReportController(IConfiguration config, IHttpClient httpClient, IDictionary<string, IAuthManager> authManagers, HttpCallBack httpCallBack = null)
            : base(config, httpClient, authManagers, httpCallBack)
        {
        }

        /// <summary>
        /// To programmatically download Answer data as a file, use this endpoint. .
        ///  The PDF will download data in the tabular format even if Answer is saved as chart. .
        ///  Permission: Requires at least view access to the object and datadownloading privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Stream response from the API call.</returns>
        public Stream AnswerReport(
                Models.TspublicRestV2ReportAnswerRequest body)
        {
            Task<Stream> t = this.AnswerReportAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically download Answer data as a file, use this endpoint. .
        ///  The PDF will download data in the tabular format even if Answer is saved as chart. .
        ///  Permission: Requires at least view access to the object and datadownloading privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Stream response from the API call.</returns>
        public async Task<Stream> AnswerReportAsync(
                Models.TspublicRestV2ReportAnswerRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/report/answer");

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
            HttpResponse response = await this.GetClientInstance().ExecuteAsBinaryAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
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

            return response.RawBody;
        }

        /// <summary>
        /// To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint .
        ///  Permission: Requires at least view access to the object and datadownloading privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Stream response from the API call.</returns>
        public Stream LiveboardReport(
                Models.TspublicRestV2ReportLiveboardRequest body)
        {
            Task<Stream> t = this.LiveboardReportAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint .
        ///  Permission: Requires at least view access to the object and datadownloading privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Stream response from the API call.</returns>
        public async Task<Stream> LiveboardReportAsync(
                Models.TspublicRestV2ReportLiveboardRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/report/liveboard");

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
            HttpResponse response = await this.GetClientInstance().ExecuteAsBinaryAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
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

            return response.RawBody;
        }
    }
}
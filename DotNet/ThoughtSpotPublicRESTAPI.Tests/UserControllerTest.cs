// <copyright file="UserControllerTest.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Tests
{
    using System;
    using System.Collections.Generic;
    using System.Globalization;
    using System.IO;
    using System.Threading.Tasks;
    using Newtonsoft.Json.Converters;
    using NUnit.Framework;
    using ThoughtSpotPublicRESTAPI.Standard;
    using ThoughtSpotPublicRESTAPI.Standard.Controllers;
    using ThoughtSpotPublicRESTAPI.Standard.Exceptions;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Client;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Response;
    using ThoughtSpotPublicRESTAPI.Standard.Utilities;
    using ThoughtSpotPublicRESTAPI.Tests.Helpers;

    /// <summary>
    /// UserControllerTest.
    /// </summary>
    [TestFixture]
    public class UserControllerTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests).
        /// </summary>
        private UserController controller;

        /// <summary>
        /// Setup test class.
        /// </summary>
        [OneTimeSetUp]
        public void SetUpDerived()
        {
            this.controller = this.Client.UserController;
        }

        /// <summary>
        /// To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed.  When both are given, user id will be considered to fetch user information.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestTestRestapiV2GetUser()
        {
            // Parameters for the API call
            string name = null;
            string id = null;

            // Perform API call
            Standard.Models.UserResponse result = null;
            try
            {
                result = await this.controller.RestapiV2GetUserAsync(name, id);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, this.HttpCallBackHandler.Response.StatusCode, "Status should be 200");

            // Test headers
            Dictionary<string, string> headers = new Dictionary<string, string>();
            headers.Add("Content-Type", "application/json");

            Assert.IsTrue(
                    TestHelper.AreHeadersProperSubsetOf (
                    headers,
                    this.HttpCallBackHandler.Response.Headers),
                    "Headers should match");
        }

        /// <summary>
        /// To remove a user from the ThoughtSpot system, use this endpoint.
        ///At Least one value needed.  When both are given user id will be considered to delete user..
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestTestRestapiV2DeleteUser()
        {
            // Parameters for the API call
            string name = null;
            string id = null;
            int? orgId = null;

            // Perform API call
            bool result = false;
            try
            {
                result = await this.controller.RestapiV2DeleteUserAsync(name, id, orgId);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, this.HttpCallBackHandler.Response.StatusCode, "Status should be 200");

            // Test headers
            Dictionary<string, string> headers = new Dictionary<string, string>();
            headers.Add("Content-Type", "application/json");

            Assert.IsTrue(
                    TestHelper.AreHeadersProperSubsetOf (
                    headers,
                    this.HttpCallBackHandler.Response.Headers),
                    "Headers should match");
        }
    }
}
// <copyright file="TspublicRestV2GroupRemoveuserRequest.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using ThoughtSpotPublicRESTAPI.Standard;
    using ThoughtSpotPublicRESTAPI.Standard.Utilities;

    /// <summary>
    /// TspublicRestV2GroupRemoveuserRequest.
    /// </summary>
    public class TspublicRestV2GroupRemoveuserRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2GroupRemoveuserRequest"/> class.
        /// </summary>
        public TspublicRestV2GroupRemoveuserRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2GroupRemoveuserRequest"/> class.
        /// </summary>
        /// <param name="users">users.</param>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        public TspublicRestV2GroupRemoveuserRequest(
            List<Models.UserNameAndIDInput> users,
            string name = null,
            string id = null)
        {
            this.Name = name;
            this.Id = id;
            this.Users = users;
        }

        /// <summary>
        /// Name of the group
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the group to query.
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Array of user name that you want to delete from user group.
        /// </summary>
        [JsonProperty("users")]
        public List<Models.UserNameAndIDInput> Users { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2GroupRemoveuserRequest : ({string.Join(", ", toStringOutput)})";
        }

        /// <inheritdoc/>
        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }

            if (obj == this)
            {
                return true;
            }

            return obj is TspublicRestV2GroupRemoveuserRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Users == null && other.Users == null) || (this.Users?.Equals(other.Users) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Users = {(this.Users == null ? "null" : $"[{string.Join(", ", this.Users)} ]")}");
        }
    }
}
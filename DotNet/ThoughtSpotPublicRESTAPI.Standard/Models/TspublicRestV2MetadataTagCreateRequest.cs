// <copyright file="TspublicRestV2MetadataTagCreateRequest.cs" company="APIMatic">
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
    /// TspublicRestV2MetadataTagCreateRequest.
    /// </summary>
    public class TspublicRestV2MetadataTagCreateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataTagCreateRequest"/> class.
        /// </summary>
        public TspublicRestV2MetadataTagCreateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataTagCreateRequest"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="color">color.</param>
        public TspublicRestV2MetadataTagCreateRequest(
            string name,
            string color = null)
        {
            this.Name = name;
            this.Color = color;
        }

        /// <summary>
        /// Name of the tag
        /// </summary>
        [JsonProperty("name")]
        public string Name { get; set; }

        /// <summary>
        /// Hex color code to be assigned to the tag
        /// </summary>
        [JsonProperty("color", NullValueHandling = NullValueHandling.Ignore)]
        public string Color { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2MetadataTagCreateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2MetadataTagCreateRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Color == null && other.Color == null) || (this.Color?.Equals(other.Color) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Color = {(this.Color == null ? "null" : this.Color == string.Empty ? "" : this.Color)}");
        }
    }
}
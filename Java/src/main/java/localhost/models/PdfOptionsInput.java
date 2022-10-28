/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PdfOptionsInput type.
 */
public class PdfOptionsInput {
    private OrientationEnum orientation;
    private Boolean truncateTables;
    private Boolean includeLogo;
    private String footerText;
    private Boolean includePageNumber;
    private Boolean includeCoverPage;
    private Boolean includeFilterPage;

    /**
     * Default constructor.
     */
    public PdfOptionsInput() {
    }

    /**
     * Initialization constructor.
     * @param  orientation  OrientationEnum value for orientation.
     * @param  truncateTables  Boolean value for truncateTables.
     * @param  includeLogo  Boolean value for includeLogo.
     * @param  footerText  String value for footerText.
     * @param  includePageNumber  Boolean value for includePageNumber.
     * @param  includeCoverPage  Boolean value for includeCoverPage.
     * @param  includeFilterPage  Boolean value for includeFilterPage.
     */
    public PdfOptionsInput(
            OrientationEnum orientation,
            Boolean truncateTables,
            Boolean includeLogo,
            String footerText,
            Boolean includePageNumber,
            Boolean includeCoverPage,
            Boolean includeFilterPage) {
        this.orientation = orientation;
        this.truncateTables = truncateTables;
        this.includeLogo = includeLogo;
        this.footerText = footerText;
        this.includePageNumber = includePageNumber;
        this.includeCoverPage = includeCoverPage;
        this.includeFilterPage = includeFilterPage;
    }

    /**
     * Getter for Orientation.
     * Page orientation for the PDF. Default: PORTRAIT
     * @return Returns the OrientationEnum
     */
    @JsonGetter("orientation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrientationEnum getOrientation() {
        return orientation;
    }

    /**
     * Setter for Orientation.
     * Page orientation for the PDF. Default: PORTRAIT
     * @param orientation Value for OrientationEnum
     */
    @JsonSetter("orientation")
    public void setOrientation(OrientationEnum orientation) {
        this.orientation = orientation;
    }

    /**
     * Getter for TruncateTables.
     * When set to true, only the first page of the tables is displayed in the file. This setting is
     * applicable only when generating report for specific visualization ids. Default: false
     * @return Returns the Boolean
     */
    @JsonGetter("truncateTables")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTruncateTables() {
        return truncateTables;
    }

    /**
     * Setter for TruncateTables.
     * When set to true, only the first page of the tables is displayed in the file. This setting is
     * applicable only when generating report for specific visualization ids. Default: false
     * @param truncateTables Value for Boolean
     */
    @JsonSetter("truncateTables")
    public void setTruncateTables(Boolean truncateTables) {
        this.truncateTables = truncateTables;
    }

    /**
     * Getter for IncludeLogo.
     * Include customized wide logo if available in the footer. Default: true
     * @return Returns the Boolean
     */
    @JsonGetter("includeLogo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeLogo() {
        return includeLogo;
    }

    /**
     * Setter for IncludeLogo.
     * Include customized wide logo if available in the footer. Default: true
     * @param includeLogo Value for Boolean
     */
    @JsonSetter("includeLogo")
    public void setIncludeLogo(Boolean includeLogo) {
        this.includeLogo = includeLogo;
    }

    /**
     * Getter for FooterText.
     * Footer text to include in the footer of each page of the PDF.
     * @return Returns the String
     */
    @JsonGetter("footerText")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFooterText() {
        return footerText;
    }

    /**
     * Setter for FooterText.
     * Footer text to include in the footer of each page of the PDF.
     * @param footerText Value for String
     */
    @JsonSetter("footerText")
    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    /**
     * Getter for IncludePageNumber.
     * When set to true, the page number is included in the footer of each page. Default: true
     * @return Returns the Boolean
     */
    @JsonGetter("includePageNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludePageNumber() {
        return includePageNumber;
    }

    /**
     * Setter for IncludePageNumber.
     * When set to true, the page number is included in the footer of each page. Default: true
     * @param includePageNumber Value for Boolean
     */
    @JsonSetter("includePageNumber")
    public void setIncludePageNumber(Boolean includePageNumber) {
        this.includePageNumber = includePageNumber;
    }

    /**
     * Getter for IncludeCoverPage.
     * When set to true, a cover page with the Liveboard title is added in the PDF. Default: true
     * @return Returns the Boolean
     */
    @JsonGetter("includeCoverPage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeCoverPage() {
        return includeCoverPage;
    }

    /**
     * Setter for IncludeCoverPage.
     * When set to true, a cover page with the Liveboard title is added in the PDF. Default: true
     * @param includeCoverPage Value for Boolean
     */
    @JsonSetter("includeCoverPage")
    public void setIncludeCoverPage(Boolean includeCoverPage) {
        this.includeCoverPage = includeCoverPage;
    }

    /**
     * Getter for IncludeFilterPage.
     * When set to true, a second page with a list of all applied filters is added in the PDF.
     * Default: true
     * @return Returns the Boolean
     */
    @JsonGetter("includeFilterPage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeFilterPage() {
        return includeFilterPage;
    }

    /**
     * Setter for IncludeFilterPage.
     * When set to true, a second page with a list of all applied filters is added in the PDF.
     * Default: true
     * @param includeFilterPage Value for Boolean
     */
    @JsonSetter("includeFilterPage")
    public void setIncludeFilterPage(Boolean includeFilterPage) {
        this.includeFilterPage = includeFilterPage;
    }

    /**
     * Converts this PdfOptionsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PdfOptionsInput [" + "orientation=" + orientation + ", truncateTables="
                + truncateTables + ", includeLogo=" + includeLogo + ", footerText=" + footerText
                + ", includePageNumber=" + includePageNumber + ", includeCoverPage="
                + includeCoverPage + ", includeFilterPage=" + includeFilterPage + "]";
    }

    /**
     * Builds a new {@link PdfOptionsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PdfOptionsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .orientation(getOrientation())
                .truncateTables(getTruncateTables())
                .includeLogo(getIncludeLogo())
                .footerText(getFooterText())
                .includePageNumber(getIncludePageNumber())
                .includeCoverPage(getIncludeCoverPage())
                .includeFilterPage(getIncludeFilterPage());
        return builder;
    }

    /**
     * Class to build instances of {@link PdfOptionsInput}.
     */
    public static class Builder {
        private OrientationEnum orientation;
        private Boolean truncateTables;
        private Boolean includeLogo;
        private String footerText;
        private Boolean includePageNumber;
        private Boolean includeCoverPage;
        private Boolean includeFilterPage;



        /**
         * Setter for orientation.
         * @param  orientation  OrientationEnum value for orientation.
         * @return Builder
         */
        public Builder orientation(OrientationEnum orientation) {
            this.orientation = orientation;
            return this;
        }

        /**
         * Setter for truncateTables.
         * @param  truncateTables  Boolean value for truncateTables.
         * @return Builder
         */
        public Builder truncateTables(Boolean truncateTables) {
            this.truncateTables = truncateTables;
            return this;
        }

        /**
         * Setter for includeLogo.
         * @param  includeLogo  Boolean value for includeLogo.
         * @return Builder
         */
        public Builder includeLogo(Boolean includeLogo) {
            this.includeLogo = includeLogo;
            return this;
        }

        /**
         * Setter for footerText.
         * @param  footerText  String value for footerText.
         * @return Builder
         */
        public Builder footerText(String footerText) {
            this.footerText = footerText;
            return this;
        }

        /**
         * Setter for includePageNumber.
         * @param  includePageNumber  Boolean value for includePageNumber.
         * @return Builder
         */
        public Builder includePageNumber(Boolean includePageNumber) {
            this.includePageNumber = includePageNumber;
            return this;
        }

        /**
         * Setter for includeCoverPage.
         * @param  includeCoverPage  Boolean value for includeCoverPage.
         * @return Builder
         */
        public Builder includeCoverPage(Boolean includeCoverPage) {
            this.includeCoverPage = includeCoverPage;
            return this;
        }

        /**
         * Setter for includeFilterPage.
         * @param  includeFilterPage  Boolean value for includeFilterPage.
         * @return Builder
         */
        public Builder includeFilterPage(Boolean includeFilterPage) {
            this.includeFilterPage = includeFilterPage;
            return this;
        }

        /**
         * Builds a new {@link PdfOptionsInput} object using the set fields.
         * @return {@link PdfOptionsInput}
         */
        public PdfOptionsInput build() {
            return new PdfOptionsInput(orientation, truncateTables, includeLogo, footerText,
                    includePageNumber, includeCoverPage, includeFilterPage);
        }
    }
}

/*
 * TSPublicRestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ApiRestV2SessionGettokenRequest type.
 */
public class ApiRestV2SessionGettokenRequest {
    private String userName;
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer tokenExpiryDuration;

    /**
     * Default constructor.
     */
    public ApiRestV2SessionGettokenRequest() {
    }

    /**
     * Initialization constructor.
     * @param  userName  String value for userName.
     * @param  password  String value for password.
     * @param  tokenExpiryDuration  Integer value for tokenExpiryDuration.
     */
    public ApiRestV2SessionGettokenRequest(
            String userName,
            String password,
            Integer tokenExpiryDuration) {
        this.userName = userName;
        this.password = password;
        this.tokenExpiryDuration = tokenExpiryDuration;
    }

    /**
     * Getter for UserName.
     * Username of the user account
     * @return Returns the String
     */
    @JsonGetter("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Setter for UserName.
     * Username of the user account
     * @param userName Value for String
     */
    @JsonSetter("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for Password.
     * The password of the user account
     * @return Returns the String
     */
    @JsonGetter("password")
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * The password of the user account
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for TokenExpiryDuration.
     * Provide duration in seconds after which the token should expire
     * @return Returns the Integer
     */
    @JsonGetter("tokenExpiryDuration")
    public Integer getTokenExpiryDuration() {
        return tokenExpiryDuration;
    }

    /**
     * Setter for TokenExpiryDuration.
     * Provide duration in seconds after which the token should expire
     * @param tokenExpiryDuration Value for Integer
     */
    @JsonSetter("tokenExpiryDuration")
    public void setTokenExpiryDuration(Integer tokenExpiryDuration) {
        this.tokenExpiryDuration = tokenExpiryDuration;
    }

    /**
     * Converts this ApiRestV2SessionGettokenRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiRestV2SessionGettokenRequest [" + "userName=" + userName + ", password="
                + password + ", tokenExpiryDuration=" + tokenExpiryDuration + "]";
    }

    /**
     * Builds a new {@link ApiRestV2SessionGettokenRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiRestV2SessionGettokenRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(userName, password)
                .tokenExpiryDuration(getTokenExpiryDuration());
        return builder;
    }

    /**
     * Class to build instances of {@link ApiRestV2SessionGettokenRequest}.
     */
    public static class Builder {
        private String userName;
        private String password;
        private Integer tokenExpiryDuration;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  userName  String value for userName.
         * @param  password  String value for password.
         */
        public Builder(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        /**
         * Setter for userName.
         * @param  userName  String value for userName.
         * @return Builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Setter for tokenExpiryDuration.
         * @param  tokenExpiryDuration  Integer value for tokenExpiryDuration.
         * @return Builder
         */
        public Builder tokenExpiryDuration(Integer tokenExpiryDuration) {
            this.tokenExpiryDuration = tokenExpiryDuration;
            return this;
        }

        /**
         * Builds a new {@link ApiRestV2SessionGettokenRequest} object using the set fields.
         * @return {@link ApiRestV2SessionGettokenRequest}
         */
        public ApiRestV2SessionGettokenRequest build() {
            return new ApiRestV2SessionGettokenRequest(userName, password, tokenExpiryDuration);
        }
    }
}

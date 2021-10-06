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
 * This is a model class for SessionAuthTokenResponse type.
 */
public class SessionAuthTokenResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String token;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tokenCreatedTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tokenExpiryDuration;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tokenType;

    /**
     * Default constructor.
     */
    public SessionAuthTokenResponse() {
    }

    /**
     * Initialization constructor.
     * @param  userName  String value for userName.
     * @param  token  String value for token.
     * @param  tokenCreatedTime  String value for tokenCreatedTime.
     * @param  tokenExpiryDuration  String value for tokenExpiryDuration.
     * @param  tokenType  String value for tokenType.
     */
    public SessionAuthTokenResponse(
            String userName,
            String token,
            String tokenCreatedTime,
            String tokenExpiryDuration,
            String tokenType) {
        this.userName = userName;
        this.token = token;
        this.tokenCreatedTime = tokenCreatedTime;
        this.tokenExpiryDuration = tokenExpiryDuration;
        this.tokenType = tokenType;
    }

    /**
     * Getter for UserName.
     * Username of the user account for which token is generated
     * @return Returns the String
     */
    @JsonGetter("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Setter for UserName.
     * Username of the user account for which token is generated
     * @param userName Value for String
     */
    @JsonSetter("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for Token.
     * Bearer token generated. This will be blank when token type is Cookie
     * @return Returns the String
     */
    @JsonGetter("token")
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * Bearer token generated. This will be blank when token type is Cookie
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Getter for TokenCreatedTime.
     * Date and time at which the token is generated
     * @return Returns the String
     */
    @JsonGetter("tokenCreatedTime")
    public String getTokenCreatedTime() {
        return tokenCreatedTime;
    }

    /**
     * Setter for TokenCreatedTime.
     * Date and time at which the token is generated
     * @param tokenCreatedTime Value for String
     */
    @JsonSetter("tokenCreatedTime")
    public void setTokenCreatedTime(String tokenCreatedTime) {
        this.tokenCreatedTime = tokenCreatedTime;
    }

    /**
     * Getter for TokenExpiryDuration.
     * Duration in seconds after which the token expires
     * @return Returns the String
     */
    @JsonGetter("tokenExpiryDuration")
    public String getTokenExpiryDuration() {
        return tokenExpiryDuration;
    }

    /**
     * Setter for TokenExpiryDuration.
     * Duration in seconds after which the token expires
     * @param tokenExpiryDuration Value for String
     */
    @JsonSetter("tokenExpiryDuration")
    public void setTokenExpiryDuration(String tokenExpiryDuration) {
        this.tokenExpiryDuration = tokenExpiryDuration;
    }

    /**
     * Getter for TokenType.
     * Type of token generated
     * @return Returns the String
     */
    @JsonGetter("tokenType")
    public String getTokenType() {
        return tokenType;
    }

    /**
     * Setter for TokenType.
     * Type of token generated
     * @param tokenType Value for String
     */
    @JsonSetter("tokenType")
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * Converts this SessionAuthTokenResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SessionAuthTokenResponse [" + "userName=" + userName + ", token=" + token
                + ", tokenCreatedTime=" + tokenCreatedTime + ", tokenExpiryDuration="
                + tokenExpiryDuration + ", tokenType=" + tokenType + "]";
    }

    /**
     * Builds a new {@link SessionAuthTokenResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SessionAuthTokenResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .userName(getUserName())
                .token(getToken())
                .tokenCreatedTime(getTokenCreatedTime())
                .tokenExpiryDuration(getTokenExpiryDuration())
                .tokenType(getTokenType());
        return builder;
    }

    /**
     * Class to build instances of {@link SessionAuthTokenResponse}.
     */
    public static class Builder {
        private String userName;
        private String token;
        private String tokenCreatedTime;
        private String tokenExpiryDuration;
        private String tokenType;



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
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Setter for tokenCreatedTime.
         * @param  tokenCreatedTime  String value for tokenCreatedTime.
         * @return Builder
         */
        public Builder tokenCreatedTime(String tokenCreatedTime) {
            this.tokenCreatedTime = tokenCreatedTime;
            return this;
        }

        /**
         * Setter for tokenExpiryDuration.
         * @param  tokenExpiryDuration  String value for tokenExpiryDuration.
         * @return Builder
         */
        public Builder tokenExpiryDuration(String tokenExpiryDuration) {
            this.tokenExpiryDuration = tokenExpiryDuration;
            return this;
        }

        /**
         * Setter for tokenType.
         * @param  tokenType  String value for tokenType.
         * @return Builder
         */
        public Builder tokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        /**
         * Builds a new {@link SessionAuthTokenResponse} object using the set fields.
         * @return {@link SessionAuthTokenResponse}
         */
        public SessionAuthTokenResponse build() {
            return new SessionAuthTokenResponse(userName, token, tokenCreatedTime,
                    tokenExpiryDuration, tokenType);
        }
    }
}

package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.MDExternalError;
import com.salesforce.marketingcloud.C11398b;

/* renamed from: com.medallia.digital.mobilesdk.h4 */
class C10859h4 extends C10790e3 {

    /* renamed from: com.medallia.digital.mobilesdk.h4$a */
    enum C10860a {
        API_TOKEN_PARSE_ERROR(2001, r7, "Could not parse ApiToken"),
        API_TOKEN_PROPERTY_ID_NO_DATA(2002, r15, "Property id is missing"),
        API_TOKEN_TOKEN_FIELD_NO_DATA(2003, r4, "Token data is missing"),
        EMPTY_AUTH_GW(2004, r4, "Auth url is missing"),
        EMPTY_AUTH_GW_1(20041, MDExternalError.ExternalError.AUTHORIZATION_FAILED_17, "Auth url is missing"),
        AUTH_NETWORK_ERROR(2005, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE, "Authenticate network error"),
        AUTH_NETWORK_ERROR_1(20051, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_11, "Authenticate network error"),
        AUTH_TIMEOUT(2006, r16, "Authenticate timeout error"),
        API_TOKEN_EMPTY(2007, r7, "Api token is empty"),
        ACCESS_TOKEN_PARSE_LOCAL(2020, MDExternalError.ExternalError.AUTHORIZATION_FAILED_18, "Could not parse AccessToken"),
        ACCESS_TOKEN_PARSE(2021, MDExternalError.ExternalError.AUTHORIZATION_FAILED_19, "Could not parse AccessToken"),
        GET_CONFIG_EMPTY_ENDPOINT(2022, r4, "Get config url is missing"),
        ACCESS_PROPERTY_ID_NO_DATA(2023, r4, "Property id is missing"),
        CREATION_DATE_NO_DATA(2024, r4, "Create time is missing"),
        TTL_NO_DATA(2025, r4, "Ttl is missing"),
        ACCESS_TOKEN_TOKEN_FIELD_NO_DATA(2026, r4, "Token data is missing"),
        ACCESS_TOKEN_EMPTY(2027, r7, "Access token is empty"),
        UUID_EMPTY(2028, (int) null, "UUID is empty"),
        RESOURCE_EMPTY_ENDPOINT(2029, (int) null, "Resource endpoint is missing"),
        GET_CONFIG_ERROR(2041, r33, "Get configuration error"),
        CONFIGURATION_TIMEOUT(2042, r16, "Configuration timeout"),
        CONFIGURATION(2043, r4, "Could not create configuration"),
        EMPTY_CONFIGURATION(2044, r4, "Configuration is empty"),
        LOCAL_CONFIGURATION_IS_NOT_AVAILABLE(2045, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_13, "Local configuration file is not available"),
        LOCAL_CONFIGURATION_TS_IS_NOT_AVAILABLE(2046, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_14, "Local configuration timestamp is not available"),
        LOCAL_CONFIGURATION_IS_EXPIRED(2047, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_15, "Local configuration is expired"),
        REMOTE_CONFIGURATION_AUTH_FAILED(C11398b.f33142u, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_16, "Remote configuration authentication failed"),
        REMOTE_CONFIGURATION_IS_CORRUPTED(2049, (int) null, "Remote configuration is corrupted or not available"),
        SUBMIT_FEEDBACK_ERROR(2161, (int) null, "Submit feedback error"),
        FEEDBACK_TIMEOUT(2162, r16, "Feedback timeout"),
        FEEDBACK_PARSE_ERROR(2163, (int) null, "Could not parse feedback"),
        SUBMIT_FEEDBACK_EMPTY_ENDPOINT(2164, (int) null, "Empty submit feedback endpoint"),
        EMPTY_FEEDBACK(2165, (int) null, "Feedback contains no data"),
        DESERIALIZE_FEEDBACK(2166, (int) null, "Deserialize Feedback failed"),
        DESERIALIZE_FEEDBACK_PAYLOAD(2167, (int) null, "Deserialize Feedback payload failed"),
        SUBMIT_ANALYTICS_ERROR(2171, (int) null, "Submit analytics error"),
        SUBMIT_ANALYTICS_EMPTY_ENDPOINT(2172, (int) null, "Empty submit analytics endpoint"),
        SUBMIT_ANALYTICS_ABOVE_MAX_SIZE(2173, (int) null, "Analytics elements is above max size element"),
        GET_RESOURCE_ERROR(2181, (int) null, "Get resource failed"),
        GET_RESOURCE_TIMEOUT(2182, r16, "Get resource timeout"),
        NO_INTERNET_CONNECTION_AVAILABLE(2183, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_13, "Internet connection is not available"),
        LL_GET_PRESIGNED_URL_ERROR(2401, (int) null, "LL get presigned Url error"),
        LL_UPLOADING_MEDIA_ERROR(2402, (int) null, "LL uploading media error"),
        LL_PROCESSING_MEDIA_ERROR(2403, (int) null, "LL processing media error"),
        LL_PROCESSING_MEDIA_END_POINT(2404, (int) null, "Empty process media endpoint"),
        LL_EMPTY_MEDIA_DATA_OBJECT(2405, (int) null, "Empty media data object"),
        LL_SUBMIT_MEDIA_FEEDBACK_FAILED(2406, (int) null, "Submit media feedback failed"),
        SUBMIT_MEDIA_FEEDBACK_EMPTY_ENDPOINT(2407, (int) null, "Submit media feedback empty endpoint"),
        LL_NO_CONNECTION_AVAILABLE(2408, (int) null, "Error no Connection Available"),
        QUARANTINE_VALIDATION_ERROR(2501, (int) null, "Quarantine Validation Error"),
        QUARANTINE_VALIDATION_EMPTY_ENDPOINT(2502, (int) null, "Quarantine Validation Empty Endpoint Error"),
        QUARANTINE_VALIDATION_TIMEOUT(2503, (int) null, "Quarantine Validation TIMEOUT"),
        QUARANTINE_C_UUID_EMPTY_ENDPOINT(2504, (int) null, "Quarantine CUUID Empty Endpoint Error"),
        QUARANTINE_NETWORK_ERROR(2505, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_14, "Internet connection is not available");
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f31144a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f31145b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final MDExternalError.ExternalError f31146c;

        private C10860a(int i, MDExternalError.ExternalError externalError, String str) {
            this.f31144a = i;
            this.f31145b = str;
            this.f31146c = externalError;
        }

        /* renamed from: a */
        public int mo28413a() {
            return this.f31144a;
        }

        public String toString() {
            return this.f31145b;
        }

        /* renamed from: b */
        public String mo28414b() {
            return this.f31145b;
        }
    }

    protected C10859h4(C10860a aVar) {
        super(aVar.f31144a, aVar.f31146c, aVar.f31145b);
    }
}

package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

public class MedalliaDigitalClientConfigurationContract extends C10875i0 {
    private long accessTokenValidationBufferTime;
    private Boolean analyticsEnabled;
    private String analyticsEndPoint;
    private C10894j analyticsV2ConfigurationContract;
    private Boolean blockNetworkInForm;
    private String getConfigEndPoint;
    private Integer httpRequestTimeout;
    private Integer maxAuthRetryAttempts;
    private Integer maxHttpRequestRetryAttempts;
    private C11099t4 mediaCaptureConfiguration;
    private String ocqCUuidUrlPrefix;
    private String quarantineValidationEndpoint;
    private String submitUrlPrefix;
    private String submitUrlSuffix;

    MedalliaDigitalClientConfigurationContract(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (jSONObject2.has("maxHttpRequestRetryAttempts") && !jSONObject2.isNull("maxHttpRequestRetryAttempts")) {
                this.maxHttpRequestRetryAttempts = Integer.valueOf(jSONObject2.getInt("maxHttpRequestRetryAttempts"));
            }
            if (jSONObject2.has("maxAuthRetryAttempts") && !jSONObject2.isNull("maxAuthRetryAttempts")) {
                this.maxAuthRetryAttempts = Integer.valueOf(jSONObject2.getInt("maxAuthRetryAttempts"));
            }
            if (jSONObject2.has("httpRequestTimeout") && !jSONObject2.isNull("httpRequestTimeout")) {
                this.httpRequestTimeout = Integer.valueOf(jSONObject2.getInt("httpRequestTimeout"));
            }
            if (jSONObject2.has("getConfigEndPoint") && !jSONObject2.isNull("getConfigEndPoint")) {
                this.getConfigEndPoint = jSONObject2.getString("getConfigEndPoint");
            }
            if (jSONObject2.has("submitUrlPrefix") && !jSONObject2.isNull("submitUrlPrefix")) {
                this.submitUrlPrefix = jSONObject2.getString("submitUrlPrefix");
            }
            if (jSONObject2.has("submitUrlSuffix") && !jSONObject2.isNull("submitUrlSuffix")) {
                this.submitUrlSuffix = jSONObject2.getString("submitUrlSuffix");
            }
            if (jSONObject2.has("blockNetworkInForm") && !jSONObject2.isNull("blockNetworkInForm")) {
                this.blockNetworkInForm = Boolean.valueOf(jSONObject2.getBoolean("blockNetworkInForm"));
            }
            if (jSONObject2.has("analyticsEndPoint") && !jSONObject2.isNull("analyticsEndPoint")) {
                this.analyticsEndPoint = jSONObject2.getString("analyticsEndPoint");
            }
            if (jSONObject2.has("analyticsEnabled") && !jSONObject2.isNull("analyticsEnabled")) {
                this.analyticsEnabled = Boolean.valueOf(jSONObject2.getBoolean("analyticsEnabled"));
            }
            if (jSONObject2.has("accessTokenValidationBufferTime") && !jSONObject2.isNull("accessTokenValidationBufferTime")) {
                this.accessTokenValidationBufferTime = jSONObject2.getLong("accessTokenValidationBufferTime");
            }
            if (jSONObject2.has("analyticsV2ConfigurationContract") && !jSONObject2.isNull("analyticsV2ConfigurationContract")) {
                this.analyticsV2ConfigurationContract = new C10894j(jSONObject2.getJSONObject("analyticsV2ConfigurationContract"));
            }
            if (jSONObject2.has("mediaCaptureConfiguration") && !jSONObject2.isNull("mediaCaptureConfiguration")) {
                this.mediaCaptureConfiguration = new C11099t4(jSONObject2.getJSONObject("mediaCaptureConfiguration"));
            }
            if (jSONObject2.has("quarantineValidationEndpoint") && !jSONObject2.isNull("quarantineValidationEndpoint")) {
                this.quarantineValidationEndpoint = jSONObject2.getString("quarantineValidationEndpoint");
            }
            if (jSONObject2.has("ocqCuuidUrlPrefix") && !jSONObject2.isNull("ocqCuuidUrlPrefix")) {
                this.ocqCUuidUrlPrefix = jSONObject2.getString("ocqCuuidUrlPrefix");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public long getAccessTokenValidationBufferTime() {
        return this.accessTokenValidationBufferTime;
    }

    /* access modifiers changed from: protected */
    public String getAnalyticsEndPoint() {
        return this.analyticsEndPoint;
    }

    /* access modifiers changed from: package-private */
    public C10894j getAnalyticsV2ConfigurationContract() {
        return this.analyticsV2ConfigurationContract;
    }

    public Boolean getBlockNetworkInForm() {
        return this.blockNetworkInForm;
    }

    /* access modifiers changed from: protected */
    public String getGetConfigEndPoint() {
        return this.getConfigEndPoint;
    }

    /* access modifiers changed from: protected */
    public Integer getHttpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    /* access modifiers changed from: protected */
    public Integer getMaxAuthRetryAttempts() {
        return this.maxAuthRetryAttempts;
    }

    /* access modifiers changed from: protected */
    public Integer getMaxHttpRequestRetryAttempts() {
        return this.maxHttpRequestRetryAttempts;
    }

    public C11099t4 getMediaCaptureConfiguration() {
        return this.mediaCaptureConfiguration;
    }

    public String getOcqCUuidUrlPrefix() {
        return this.ocqCUuidUrlPrefix;
    }

    public String getQuarantineValidationEndpoint() {
        return this.quarantineValidationEndpoint;
    }

    public String getSubmitUrlPrefix() {
        return this.submitUrlPrefix;
    }

    public String getSubmitUrlSuffix() {
        return this.submitUrlSuffix;
    }

    public Boolean isAnalyticsEnabled() {
        return this.analyticsEnabled;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"maxHttpRequestRetryAttempts\":");
            sb.append(this.maxHttpRequestRetryAttempts);
            sb.append(",\"maxAuthRetryAttempts\":");
            sb.append(this.maxAuthRetryAttempts);
            sb.append(",\"httpRequestTimeout\":");
            sb.append(this.httpRequestTimeout);
            sb.append(",\"getConfigEndPoint\":");
            sb.append(C11051p3.m40518c(this.getConfigEndPoint));
            sb.append(",\"submitUrlPrefix\":");
            sb.append(C11051p3.m40518c(this.submitUrlPrefix));
            sb.append(",\"submitUrlSuffix\":");
            sb.append(C11051p3.m40518c(this.submitUrlSuffix));
            sb.append(",\"blockNetworkInForm\":");
            sb.append(this.blockNetworkInForm);
            sb.append(",\"analyticsEndPoint\":");
            sb.append(C11051p3.m40518c(this.analyticsEndPoint));
            sb.append(",\"analyticsEnabled\":");
            sb.append(this.analyticsEnabled);
            sb.append(",\"accessTokenValidationBufferTime\":");
            sb.append(this.accessTokenValidationBufferTime);
            sb.append(",\"analyticsV2ConfigurationContract\":");
            C10894j jVar = this.analyticsV2ConfigurationContract;
            String str = "null";
            sb.append(jVar == null ? str : jVar.mo28506h());
            sb.append(",\"mediaCaptureConfiguration\":");
            C11099t4 t4Var = this.mediaCaptureConfiguration;
            if (t4Var != null) {
                str = t4Var.mo29012i();
            }
            sb.append(str);
            sb.append(",\"quarantineValidationEndpoint\":");
            sb.append(C11051p3.m40518c(this.quarantineValidationEndpoint));
            sb.append(",\"ocqCuuidUrlPrefix\":");
            sb.append(C11051p3.m40518c(this.ocqCUuidUrlPrefix));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}

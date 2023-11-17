package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

public class MedalliaDigitalBrainConfigurationContract extends C10875i0 {
    private boolean canBlockAfterOneSuccess;
    private boolean evaluateWithConfigurationFile;
    private Long formDisplayTimeout;
    private boolean isBlackBoxEnabled;
    private boolean isDistinct;
    private boolean isFeedbackSubmitIndicatorEnabled;
    private boolean isSessionPercentageSupportDouble;
    private boolean isTREV2Enabled;
    private long maxUserJourneyEventsSize;
    private Long offlineConfigurationExpirationTime;
    private boolean requestMediaCapturePermissions;
    private Long sessionInactivityTime;

    MedalliaDigitalBrainConfigurationContract() {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.isFeedbackSubmitIndicatorEnabled = true;
    }

    /* access modifiers changed from: protected */
    public Long getFormDisplayTimeout() {
        return this.formDisplayTimeout;
    }

    /* access modifiers changed from: protected */
    public long getMaxUserJourneyEventsSize() {
        return this.maxUserJourneyEventsSize;
    }

    /* access modifiers changed from: protected */
    public Long getOfflineConfigurationExpirationTime() {
        return this.offlineConfigurationExpirationTime;
    }

    /* access modifiers changed from: protected */
    public Long getSessionInactivityTime() {
        return this.sessionInactivityTime;
    }

    /* access modifiers changed from: protected */
    public boolean isBlackBoxEnabled() {
        return this.isBlackBoxEnabled;
    }

    /* access modifiers changed from: protected */
    public boolean isCanBlockAfterOneSuccess() {
        return this.canBlockAfterOneSuccess;
    }

    /* access modifiers changed from: protected */
    public boolean isDistinct() {
        return this.isDistinct;
    }

    /* access modifiers changed from: protected */
    public boolean isEvaluateWithConfigurationFile() {
        return this.evaluateWithConfigurationFile;
    }

    public boolean isFeedbackSubmitIndicatorEnabled() {
        return this.isFeedbackSubmitIndicatorEnabled;
    }

    public boolean isRequestMediaCapturePermissions() {
        return this.requestMediaCapturePermissions;
    }

    public boolean isSessionPercentageSupportDouble() {
        return this.isSessionPercentageSupportDouble;
    }

    /* access modifiers changed from: protected */
    public boolean isTREV2Enabled() {
        return this.isTREV2Enabled;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            return "{\"sessionInactivityTime\":" + this.sessionInactivityTime + ",\"formDisplayTimeout\":" + this.formDisplayTimeout + ",\"offlineConfigurationExpirationTime\":" + this.offlineConfigurationExpirationTime + ",\"isDistinct\":" + this.isDistinct + ",\"canBlockAfterOneSuccess\":" + this.canBlockAfterOneSuccess + ",\"maxUserJourneyEventsSize\":" + this.maxUserJourneyEventsSize + ",\"isBlackBoxEnabled\":" + this.isBlackBoxEnabled + ",\"evaluateWithConfigurationFile\":" + this.evaluateWithConfigurationFile + ",\"isTREV2Enabled\":" + this.isTREV2Enabled + ",\"requestMediaCapturePermissions\":" + this.requestMediaCapturePermissions + ",\"isFeedbackSubmitIndicatorEnabled\":" + this.isFeedbackSubmitIndicatorEnabled + ",\"isSessionPercentageSupportDouble\":" + this.isSessionPercentageSupportDouble + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    MedalliaDigitalBrainConfigurationContract(long j) {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.sessionInactivityTime = Long.valueOf(j);
    }

    MedalliaDigitalBrainConfigurationContract(long j, boolean z, boolean z2) {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.sessionInactivityTime = Long.valueOf(j);
        this.isDistinct = z;
        this.canBlockAfterOneSuccess = z2;
    }

    MedalliaDigitalBrainConfigurationContract(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        try {
            if (jSONObject2.has("sessionInactivityTime") && !jSONObject2.isNull("sessionInactivityTime")) {
                this.sessionInactivityTime = Long.valueOf(jSONObject2.getLong("sessionInactivityTime"));
            }
            if (jSONObject2.has("formDisplayTimeout") && !jSONObject2.isNull("formDisplayTimeout")) {
                this.formDisplayTimeout = Long.valueOf(jSONObject2.getLong("formDisplayTimeout"));
            }
            if (jSONObject2.has("offlineConfigurationExpirationTime") && !jSONObject2.isNull("offlineConfigurationExpirationTime")) {
                this.offlineConfigurationExpirationTime = Long.valueOf(jSONObject2.getLong("offlineConfigurationExpirationTime"));
            }
            if (jSONObject2.has("isDistinct") && !jSONObject2.isNull("isDistinct")) {
                this.isDistinct = jSONObject2.getBoolean("isDistinct");
            }
            if (jSONObject2.has("canBlockAfterOneSuccess") && !jSONObject2.isNull("canBlockAfterOneSuccess")) {
                this.canBlockAfterOneSuccess = jSONObject2.getBoolean("canBlockAfterOneSuccess");
            }
            if (jSONObject2.has("maxUserJourneyEventsSize") && !jSONObject2.isNull("maxUserJourneyEventsSize")) {
                this.maxUserJourneyEventsSize = jSONObject2.getLong("maxUserJourneyEventsSize");
            }
            if (jSONObject2.has("isBlackBoxEnabled") && !jSONObject2.isNull("isBlackBoxEnabled")) {
                this.isBlackBoxEnabled = jSONObject2.getBoolean("isBlackBoxEnabled");
            }
            if (jSONObject2.has("evaluateWithConfigurationFile") && !jSONObject2.isNull("evaluateWithConfigurationFile")) {
                this.evaluateWithConfigurationFile = jSONObject2.getBoolean("evaluateWithConfigurationFile");
            }
            if (jSONObject2.has("isTREV2Enabled") && !jSONObject2.isNull("isTREV2Enabled")) {
                this.isTREV2Enabled = jSONObject2.getBoolean("isTREV2Enabled");
            }
            if (jSONObject2.has("requestMediaCapturePermissions") && !jSONObject2.isNull("requestMediaCapturePermissions")) {
                this.requestMediaCapturePermissions = jSONObject2.getBoolean("requestMediaCapturePermissions");
            }
            if (jSONObject2.has("isSessionPercentageSupportDouble") && !jSONObject2.isNull("isSessionPercentageSupportDouble")) {
                this.isSessionPercentageSupportDouble = jSONObject2.getBoolean("isSessionPercentageSupportDouble");
            }
            if (!jSONObject2.has("isFeedbackSubmitIndicatorEnabled") || jSONObject2.isNull("isFeedbackSubmitIndicatorEnabled")) {
                this.isFeedbackSubmitIndicatorEnabled = true;
            } else {
                this.isFeedbackSubmitIndicatorEnabled = jSONObject2.getBoolean("isFeedbackSubmitIndicatorEnabled");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

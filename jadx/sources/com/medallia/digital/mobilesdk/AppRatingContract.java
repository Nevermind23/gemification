package com.medallia.digital.mobilesdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class AppRatingContract extends EngagementContract {
    private String appRatingId;
    private String appRatingLanguage;
    private String appRatingUrl;
    private String customParams;
    private boolean isAppRatingDirectApi;
    private boolean isDarkModeEnabled;

    AppRatingContract(String str, InviteData inviteData, JSONObject jSONObject, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        super(str, inviteData, jSONObject);
        this.appRatingId = str2;
        this.appRatingUrl = str3;
        this.customParams = str4;
        this.appRatingLanguage = str5;
        this.isDarkModeEnabled = z;
        this.isAppRatingDirectApi = z2;
    }

    /* access modifiers changed from: protected */
    public String getAppRatingId() {
        return this.appRatingId;
    }

    /* access modifiers changed from: protected */
    public String getAppRatingLanguage() {
        return this.appRatingLanguage;
    }

    /* access modifiers changed from: protected */
    public String getAppRatingUrl() {
        return this.appRatingUrl;
    }

    /* access modifiers changed from: protected */
    public boolean isAppRatingDirectApi() {
        return this.isAppRatingDirectApi;
    }

    /* access modifiers changed from: protected */
    public boolean isDarkModeEnabled() {
        return this.isDarkModeEnabled;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"appRatingId\":");
            sb.append(C11051p3.m40518c(this.appRatingId));
            sb.append(",\"inviteData\":");
            String str = "null";
            sb.append(getInviteData() != null ? getInviteData().toJsonString() : str);
            sb.append(",\"triggerData\":");
            if (getTriggerData() != null) {
                str = getTriggerData().toString();
            }
            sb.append(str);
            sb.append(",\"appRatingUrl\":");
            sb.append(C11051p3.m40518c(this.appRatingUrl));
            sb.append(",\"customParams\":");
            sb.append(C11051p3.m40518c(this.customParams));
            sb.append(",\"appRatingLanguage\":");
            sb.append(C11051p3.m40518c(this.appRatingLanguage));
            sb.append(",\"isDarkModeEnabled\":");
            sb.append(this.isDarkModeEnabled);
            sb.append(",\"isAppRatingDirectApi\":");
            sb.append(this.isAppRatingDirectApi);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    AppRatingContract(JSONObject jSONObject) {
        super(jSONObject);
        String str;
        try {
            if (jSONObject.has("appRatingId") && !jSONObject.isNull("appRatingId")) {
                this.appRatingId = jSONObject.getString("appRatingId");
            }
            if (jSONObject.has("appRatingUrl") && !jSONObject.isNull("appRatingUrl")) {
                this.appRatingUrl = jSONObject.getString("appRatingUrl");
            }
            if (jSONObject.has("customParams")) {
                if (jSONObject.get("customParams") instanceof JSONArray) {
                    str = jSONObject.getJSONArray("customParams").toString();
                } else if (jSONObject.get("customParams") instanceof JSONObject) {
                    str = jSONObject.getJSONObject("customParams").toString();
                } else if (jSONObject.get("customParams") instanceof String) {
                    str = C11051p3.m40517b(jSONObject.getString("customParams"));
                }
                this.customParams = str;
            }
            if (jSONObject.has("appRatingLanguage") && !jSONObject.isNull("appRatingLanguage")) {
                this.appRatingLanguage = jSONObject.getString("appRatingLanguage");
            }
            if (jSONObject.has("isDarkModeEnabled") && !jSONObject.isNull("isDarkModeEnabled")) {
                this.isDarkModeEnabled = jSONObject.getBoolean("isDarkModeEnabled");
            }
            if (jSONObject.has("isAppRatingDirectApi") && !jSONObject.isNull("isAppRatingDirectApi")) {
                this.isAppRatingDirectApi = jSONObject.getBoolean("isAppRatingDirectApi");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

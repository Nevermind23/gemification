package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SDKConfigurationFormContract extends EngagementContract {
    private String customParams;
    private String formId;
    private JSONObject formJson;
    private String formLanguage;
    private FormTriggerType formType;
    private FormViewType formViewType;
    private boolean isDarkModeEnabled;
    private boolean isPoweredByVisible;
    private String isPreloaded;
    private List<ResourceContract> resources;
    private String selectedFormHeaderTheme;
    private String templateDebugRemoteUrl;
    private String templateLocalUrl;
    private String templateRemoteUrl;
    private String title;
    private String titleBackgroundColor;
    private String titleTextColor;
    private String transitionType;
    private String urlVersion;

    protected SDKConfigurationFormContract() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected SDKConfigurationFormContract(String str, String str2, String str3, String str4, JSONObject jSONObject, List<ResourceContract> list, InviteData inviteData, JSONObject jSONObject2, String str5, FormTriggerType formTriggerType, String str6, String str7, String str8, FormViewType formViewType2, String str9, boolean z, boolean z2, String str10) {
        super(str2, inviteData, jSONObject2);
        String str11 = str2;
        InviteData inviteData2 = inviteData;
        JSONObject jSONObject3 = jSONObject2;
        this.formId = str;
        this.templateRemoteUrl = str3;
        this.templateLocalUrl = str4;
        this.formJson = jSONObject;
        this.resources = list;
        this.customParams = str5;
        this.formType = formTriggerType;
        this.title = str6;
        this.titleTextColor = str7;
        this.titleBackgroundColor = str8;
        this.formViewType = formViewType2 != null ? formViewType2 : FormViewType.none;
        this.isPreloaded = str9;
        this.isPoweredByVisible = z;
        this.isDarkModeEnabled = z2;
        this.selectedFormHeaderTheme = str10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.formId;
        String str2 = ((SDKConfigurationFormContract) obj).formId;
        return str != null ? str.equals(str2) : str2 == null;
    }

    /* access modifiers changed from: protected */
    public String getCustomParams() {
        return this.customParams;
    }

    public String getFormId() {
        return this.formId;
    }

    public JSONObject getFormJson() {
        if (this.formJson == null) {
            this.formJson = new JSONObject();
        }
        return this.formJson;
    }

    public String getFormLanguage() {
        return this.formLanguage;
    }

    public FormTriggerType getFormType() {
        return this.formType;
    }

    public FormViewType getFormViewType() {
        return this.formViewType;
    }

    /* access modifiers changed from: protected */
    public String getHeaderThemeName() {
        return this.selectedFormHeaderTheme;
    }

    public /* bridge */ /* synthetic */ InviteData getInviteData() {
        return super.getInviteData();
    }

    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    public List<ResourceContract> getResources() {
        return this.resources;
    }

    /* access modifiers changed from: protected */
    public String getTemplateDebugRemoteUrl() {
        return this.templateDebugRemoteUrl;
    }

    public String getTemplateLocalUrl() {
        return this.templateLocalUrl;
    }

    public String getTemplateRemoteUrl() {
        return this.templateRemoteUrl;
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        return this.title;
    }

    /* access modifiers changed from: protected */
    public String getTitleBackgroundColor() {
        return this.titleBackgroundColor;
    }

    /* access modifiers changed from: protected */
    public String getTitleTextColor() {
        return this.titleTextColor;
    }

    /* access modifiers changed from: protected */
    public String getUrlVersion() {
        return this.urlVersion;
    }

    public int hashCode() {
        String str = this.formId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isDarkModeEnabled() {
        return this.isDarkModeEnabled;
    }

    /* access modifiers changed from: protected */
    public boolean isPoweredByVisible() {
        return this.isPoweredByVisible;
    }

    /* access modifiers changed from: protected */
    public boolean isPreloaded() {
        if (TextUtils.isEmpty(this.isPreloaded)) {
            return false;
        }
        return Boolean.parseBoolean(this.isPreloaded);
    }

    public String setFormLanguage(String str) {
        this.formLanguage = str;
        return str;
    }

    public void setTemplateLocalUrl(String str) {
        this.templateLocalUrl = str;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        String str;
        try {
            String str2 = "null";
            if (this.formType == null) {
                str = str2;
            } else {
                str = "\"" + this.formType + "\"";
            }
            if (this.formViewType != null) {
                str2 = "\"" + this.formViewType + "\"";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("{\"formId\":");
            sb.append(C11051p3.m40518c(this.formId));
            sb.append(",\"templateRemoteUrl\":");
            sb.append(C11051p3.m40518c(this.templateRemoteUrl));
            sb.append(",\"templateLocalUrl\":");
            sb.append(C11051p3.m40518c(this.templateLocalUrl));
            sb.append(",\"formJson\":");
            JSONObject jSONObject = this.formJson;
            String str3 = null;
            sb.append(jSONObject == null ? null : jSONObject.toString());
            sb.append(",\"resources\":");
            sb.append(ModelFactory.getInstance().getResourcesAsJsonString(this.resources));
            sb.append(",\"customParams\":");
            sb.append(C11051p3.m40518c(this.customParams));
            sb.append(",\"formType\":");
            sb.append(str);
            sb.append(",\"title\":");
            sb.append(C11051p3.m40518c(this.title));
            sb.append(",\"titleTextColor\":");
            sb.append(C11051p3.m40518c(this.titleTextColor));
            sb.append(",\"titleBackgroundColor\":");
            sb.append(C11051p3.m40518c(this.titleBackgroundColor));
            sb.append(",\"transitionType\":");
            sb.append(C11051p3.m40518c(this.transitionType));
            sb.append(",\"formViewType\":");
            sb.append(str2);
            sb.append(",\"name\":");
            sb.append(C11051p3.m40518c(getName()));
            sb.append(",\"inviteData\":");
            sb.append(getInviteData() != null ? getInviteData().toJsonString() : null);
            sb.append(",\"triggerData\":");
            if (getTriggerData() != null) {
                str3 = getTriggerData().toString();
            }
            sb.append(str3);
            sb.append(",\"isPreloaded\":");
            sb.append(C11051p3.m40518c(this.isPreloaded));
            sb.append(",\"formLanguage\":");
            sb.append(C11051p3.m40518c(this.formLanguage));
            sb.append(",\"urlVersion\":");
            sb.append(C11051p3.m40518c(this.urlVersion));
            sb.append(",\"templateDebugRemoteUrl\":");
            sb.append(C11051p3.m40518c(this.templateDebugRemoteUrl));
            sb.append(",\"isPoweredByVisible\":");
            sb.append(this.isPoweredByVisible);
            sb.append(",\"isDarkModeEnabled\":");
            sb.append(this.isDarkModeEnabled);
            sb.append(",\"selectedFormHeaderTheme\":");
            sb.append(C11051p3.m40518c(this.selectedFormHeaderTheme));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SDKConfigurationFormContract(JSONObject jSONObject) {
        super(jSONObject);
        String str;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "selectedFormHeaderTheme";
        String str3 = "isDarkModeEnabled";
        String str4 = "showPoweredBy";
        String str5 = "templateDebugRemoteUrl";
        String str6 = "urlVersion";
        try {
            if (jSONObject2.has("formId") && !jSONObject2.isNull("formId")) {
                this.formId = jSONObject2.getString("formId");
            }
            if (jSONObject2.has("templateRemoteUrl") && !jSONObject2.isNull("templateRemoteUrl")) {
                this.templateRemoteUrl = jSONObject2.getString("templateRemoteUrl");
            }
            if (jSONObject2.has("templateLocalUrl") && !jSONObject2.isNull("templateLocalUrl")) {
                this.templateLocalUrl = jSONObject2.getString("templateLocalUrl");
            }
            if (jSONObject2.has("formJson") && !jSONObject2.isNull("formJson")) {
                this.formJson = jSONObject2.getJSONObject("formJson");
            }
            if (jSONObject2.has("customParams")) {
                if (jSONObject2.get("customParams") instanceof JSONArray) {
                    str = jSONObject2.getJSONArray("customParams").toString();
                } else if (jSONObject2.get("customParams") instanceof JSONObject) {
                    str = jSONObject2.getJSONObject("customParams").toString();
                } else if (jSONObject2.get("customParams") instanceof String) {
                    str = C11051p3.m40517b(jSONObject2.getString("customParams"));
                }
                this.customParams = str;
            }
            if (jSONObject2.has("title") && !jSONObject2.isNull("title")) {
                this.title = jSONObject2.getString("title");
            }
            if (jSONObject2.has("titleTextColor") && !jSONObject2.isNull("titleTextColor")) {
                this.titleTextColor = jSONObject2.getString("titleTextColor");
            }
            if (jSONObject2.has("titleBackgroundColor") && !jSONObject2.isNull("titleBackgroundColor")) {
                this.titleBackgroundColor = jSONObject2.getString("titleBackgroundColor");
            }
            if (jSONObject2.has("transitionType") && !jSONObject2.isNull("transitionType")) {
                this.transitionType = jSONObject2.getString("transitionType");
            }
            if (jSONObject2.has("formType") && !jSONObject2.isNull("formType")) {
                this.formType = FormTriggerType.fromString(jSONObject2.getString("formType"));
            }
            if (jSONObject2.has("formViewType") && !jSONObject2.isNull("formViewType")) {
                this.formViewType = FormViewType.fromString(jSONObject2.getString("formViewType"));
            }
            if (jSONObject2.has("resources") && !jSONObject2.isNull("resources")) {
                this.resources = ModelFactory.getInstance().getResourcesArray(jSONObject2.getJSONArray("resources"));
            }
            if (jSONObject2.has("isPreloaded") && !jSONObject2.isNull("isPreloaded")) {
                this.isPreloaded = jSONObject2.getString("isPreloaded");
            }
            if (jSONObject2.has("formLanguage") && !jSONObject2.isNull("formLanguage")) {
                this.formLanguage = jSONObject2.getString("formLanguage");
            }
            String str7 = str6;
            if (jSONObject2.has(str7) && !jSONObject2.isNull(str7)) {
                this.urlVersion = jSONObject2.getString(str7);
            }
            String str8 = str5;
            if (jSONObject2.has(str8) && !jSONObject2.isNull(str8)) {
                this.templateDebugRemoteUrl = jSONObject2.getString(str8);
            }
            if (this.formJson != null) {
                JSONObject jSONObject3 = new JSONObject(this.formJson.toString()).getJSONObject("settings").getJSONObject("formMobileSettingsContract");
                String str9 = str4;
                if (jSONObject3.has(str9) && !jSONObject3.isNull(str9)) {
                    this.isPoweredByVisible = jSONObject3.getBoolean(str9);
                }
            }
            String str10 = str3;
            if (jSONObject2.has(str10) && !jSONObject2.isNull(str10)) {
                this.isDarkModeEnabled = jSONObject2.getBoolean(str10);
            }
            String str11 = str2;
            if (jSONObject2.has(str11) && !jSONObject2.isNull(str11)) {
                this.selectedFormHeaderTheme = jSONObject2.getString(str11);
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

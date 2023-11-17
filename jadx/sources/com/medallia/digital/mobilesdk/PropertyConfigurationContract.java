package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class PropertyConfigurationContract extends C10711a<SDKConfigurationFormContract> {
    private boolean isOCQEnabled;
    private ArrayList<String> omniChannelRulesIds;
    private HashMap<String, C10919j7> themes;

    protected PropertyConfigurationContract(String str, String str2, List<ResourceContract> list, List<SDKConfigurationFormContract> list2, HashMap<String, Boolean> hashMap, List<AppRatingContract> list3, HashMap<String, C10919j7> hashMap2) {
        super(str, str2, list, list2, hashMap, list3);
        this.themes = hashMap2;
    }

    public ArrayList<String> getOmniChannelRulesIds() {
        return this.omniChannelRulesIds;
    }

    /* access modifiers changed from: protected */
    public HashMap<String, C10919j7> getThemes() {
        return this.themes;
    }

    public boolean isOCQEnabled() {
        return this.isOCQEnabled;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            return "{\"formJsonFileLocalUrl\":" + C11051p3.m40518c(getFormJsonFileLocalUrl()) + ",\"globalConfigurationFileLocalUrl\":" + C11051p3.m40518c(getGlobalConfigurationFileLocalUrl()) + ",\"formFileLocationQueryParam\":" + C11051p3.m40518c(getFormFileLocationQueryParam()) + ",\"preloadFormJsonFileLocalUrl\":" + C11051p3.m40518c(getPreloadFormJsonFileLocalUrl()) + ",\"globalResources\":" + ModelFactory.getInstance().getResourcesAsJsonString(getGlobalResources()) + ",\"forms\":" + ModelFactory.getInstance().getFormsAsJsonString(getForms()) + ",\"provisions\":" + ModelFactory.getInstance().getProvisionsAsJsonString(getProvisions()) + ",\"appRatings\":" + ModelFactory.getInstance().getAppRatingsAsJsonString(getAppRatings()) + ",\"isLocalizationEnable\":" + isLocalizationEnable() + ",\"themes\":" + ModelFactory.getInstance().getThemesMapAsJsonString(getThemes()) + ",\"isNewLiveFormEnable\":" + isNewLiveFormEnable() + ",\"isOCQEnabled\":" + isOCQEnabled() + ",\"omniChannelRulesIds\":" + ModelFactory.getInstance().getStringArrayAsJsonString(getOmniChannelRulesIds()) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    PropertyConfigurationContract(JSONObject jSONObject) {
        super(jSONObject);
        try {
            if (jSONObject.has("forms") && !jSONObject.isNull("forms")) {
                setForms(ModelFactory.getInstance().getFormContractsArray(jSONObject.getJSONArray("forms")));
            }
            if (jSONObject.has("themes") && !jSONObject.isNull("themes")) {
                this.themes = ModelFactory.getInstance().getStringThemeMap(jSONObject.getJSONObject("themes"));
            }
            if (jSONObject.has("isOCQEnabled") && !jSONObject.isNull("isOCQEnabled")) {
                this.isOCQEnabled = jSONObject.getBoolean("isOCQEnabled");
            }
            if (jSONObject.has("omniChannelRulesIds") && !jSONObject.isNull("omniChannelRulesIds")) {
                this.omniChannelRulesIds = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("omniChannelRulesIds"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

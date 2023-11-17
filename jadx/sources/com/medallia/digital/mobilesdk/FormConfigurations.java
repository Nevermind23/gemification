package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class FormConfigurations {
    private ArrayList<String> feedbackPayloadExcludedTypes;
    private ArrayList<String> feedbackPayloadTypes;
    private boolean inheritOrientation;
    private boolean isPinchGestureEnabled;
    private Long loadFormIndicatorDelay;
    private int maxFontSize;
    private int minFontSize;
    private ArrayList<String> redirectLinks;
    private boolean vulnEnabled;

    protected FormConfigurations(Long l, ArrayList<String> arrayList) {
        this.loadFormIndicatorDelay = l;
        this.feedbackPayloadTypes = arrayList;
    }

    /* access modifiers changed from: protected */
    public ArrayList<String> getFeedbackPayloadExcludedTypes() {
        return this.feedbackPayloadExcludedTypes;
    }

    /* access modifiers changed from: protected */
    public ArrayList<String> getFeedbackPayloadTypes() {
        return this.feedbackPayloadTypes;
    }

    /* access modifiers changed from: protected */
    public Long getLoadFormIndicatorDelay() {
        return this.loadFormIndicatorDelay;
    }

    public int getMaxFontSize() {
        return this.maxFontSize;
    }

    public int getMinFontSize() {
        return this.minFontSize;
    }

    public ArrayList<String> getRedirectLinks() {
        return this.redirectLinks;
    }

    /* access modifiers changed from: protected */
    public boolean isInheritOrientation() {
        return this.inheritOrientation;
    }

    public boolean isPinchGestureEnabled() {
        return this.isPinchGestureEnabled;
    }

    /* access modifiers changed from: protected */
    public boolean isVulnEnabled() {
        return this.vulnEnabled;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        return "{\"loadFormIndicatorDelay\":" + this.loadFormIndicatorDelay + ",\"feedbackPayloadTypes\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.feedbackPayloadTypes) + ",\"feedbackPayloadExcludedTypes\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.feedbackPayloadExcludedTypes) + ",\"vulnEnabled\":" + this.vulnEnabled + ",\"inheritOrientation\":" + this.inheritOrientation + ",\"redirectLinks\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.redirectLinks) + ",\"isPinchGestureEnabled\":" + this.isPinchGestureEnabled + ",\"minFontSize\":" + this.minFontSize + ",\"maxFontSize\":" + this.maxFontSize + "}";
    }

    protected FormConfigurations(Long l, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.loadFormIndicatorDelay = l;
        this.feedbackPayloadTypes = arrayList;
        this.feedbackPayloadExcludedTypes = arrayList2;
    }

    FormConfigurations(JSONObject jSONObject) {
        try {
            if (jSONObject.has("loadFormIndicatorDelay") && !jSONObject.isNull("loadFormIndicatorDelay")) {
                this.loadFormIndicatorDelay = Long.valueOf(jSONObject.getLong("loadFormIndicatorDelay"));
            }
            if (jSONObject.has("feedbackPayloadTypes") && !jSONObject.isNull("feedbackPayloadTypes")) {
                this.feedbackPayloadTypes = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("feedbackPayloadTypes"));
            }
            if (jSONObject.has("feedbackPayloadExcludedTypes") && !jSONObject.isNull("feedbackPayloadExcludedTypes")) {
                this.feedbackPayloadExcludedTypes = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("feedbackPayloadExcludedTypes"));
            }
            if (jSONObject.has("vulnEnabled") && !jSONObject.isNull("vulnEnabled")) {
                this.vulnEnabled = jSONObject.getBoolean("vulnEnabled");
            }
            if (jSONObject.has("inheritOrientation") && !jSONObject.isNull("inheritOrientation")) {
                this.inheritOrientation = jSONObject.getBoolean("inheritOrientation");
            }
            if (jSONObject.has("redirectLinks") && !jSONObject.isNull("redirectLinks")) {
                this.redirectLinks = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("redirectLinks"));
            }
            if (jSONObject.has("isPinchGestureEnabled") && !jSONObject.isNull("isPinchGestureEnabled")) {
                this.isPinchGestureEnabled = jSONObject.getBoolean("isPinchGestureEnabled");
            }
            if (jSONObject.has("minFontSize") && !jSONObject.isNull("minFontSize")) {
                this.minFontSize = jSONObject.getInt("minFontSize");
            }
            if (jSONObject.has("maxFontSize") && !jSONObject.isNull("maxFontSize")) {
                this.maxFontSize = jSONObject.getInt("maxFontSize");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

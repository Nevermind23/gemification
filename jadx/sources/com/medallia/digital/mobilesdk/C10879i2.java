package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.i2 */
final class C10879i2 {

    /* renamed from: a */
    private static final String f31218a = "CSAT";

    C10879i2() {
    }

    /* renamed from: a */
    protected static JSONObject m39714a(JSONObject jSONObject, FormConfigurations formConfigurations) {
        boolean z;
        if (formConfigurations == null || formConfigurations.getFeedbackPayloadExcludedTypes() == null || formConfigurations.getFeedbackPayloadExcludedTypes().isEmpty()) {
            return new JSONObject();
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("components");
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<String> feedbackPayloadExcludedTypes = formConfigurations.getFeedbackPayloadExcludedTypes();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("type") && !feedbackPayloadExcludedTypes.contains(jSONObject2.getString("type"))) {
                    if (jSONObject2.has("role")) {
                        if (f31218a.equals(jSONObject2.getString("role"))) {
                            z = true;
                            jSONObject2.put("isCsat", z);
                            jSONArray2.put(jSONObject2);
                        }
                    }
                    z = false;
                    jSONObject2.put("isCsat", z);
                    jSONArray2.put(jSONObject2);
                }
            }
            jSONObject.put("components", jSONArray2);
            return jSONObject;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }
}

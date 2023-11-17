package com.facetec.sdk;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facetec.sdk.db */
final class C2937db {

    /* renamed from: d */
    static JSONArray f9837d = new JSONArray();

    static {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", C2942de.YOUR_ZOOM_IMAGE_OVERRIDE);
            jSONObject.put("overrideKey", "ac_ryzi");
            jSONObject.put("overrideValue", "cd0681bd-4522-4177-a3c7-1fa93e14734b");
            jSONObject.put("minValue", (Object) null);
            jSONObject.put("maxValue", (Object) null);
            f9837d.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", C2942de.CLICKABLE_READY_SCREEN_SUBTEXT);
            jSONObject2.put("overrideKey", "ac_crs");
            jSONObject2.put("overrideValue", "6880e254-93ce-11ea-bb37-0242ac130002");
            jSONObject2.put("minValue", (Object) null);
            jSONObject2.put("maxValue", (Object) null);
            f9837d.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", C2942de.UNCONSTRAINED_GUIDANCE_STRING_LENGTHS);
            jSONObject3.put("overrideKey", "ac_ugsl");
            jSONObject3.put("overrideValue", "235dbd17-7bff-44de-a5ce-e59595d04799");
            jSONObject3.put("minValue", (Object) null);
            jSONObject3.put("maxValue", (Object) null);
            f9837d.put(jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("type", C2942de.STANDALONE_IDSCAN_WATERMARK_CUSTOMIZATION);
            jSONObject4.put("overrideKey", "ac_idbic");
            jSONObject4.put("overrideValue", "f9c81685-ae63-47cc-a4fb-08469d7ea860");
            jSONObject4.put("minValue", (Object) null);
            jSONObject4.put("maxValue", (Object) null);
            f9837d.put(jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("type", C2942de.ENABLE_SCREEN_CAPTURING);
            jSONObject5.put("overrideKey", "ac_esc");
            jSONObject5.put("overrideValue", "eb71b779-1756-49e8-ab9c-3dcca09b87b5");
            jSONObject5.put("minValue", (Object) null);
            jSONObject5.put("maxValue", (Object) null);
            f9837d.put(jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("type", C2942de.DEV_MODE_TAG);
            jSONObject6.put("overrideKey", "ac_dmt");
            jSONObject6.put("overrideValue", "44a72141-b436-44f4-b49d-4541445833ce");
            jSONObject6.put("minValue", (Object) null);
            jSONObject6.put("maxValue", (Object) null);
            f9837d.put(jSONObject6);
        } catch (Exception unused) {
        }
    }

    C2937db() {
    }

    /* renamed from: d */
    static void m12221d(C2942de deVar) {
        if (deVar == C2942de.ENABLE_SCREEN_CAPTURING) {
            C2797ar.m10878a("\n********************************************************************************************\n********************************************************************************************\n********************************************************************************************\n* WARNING: You have configured a development-only feature flag for FaceTecCustomization.   *\n* This is only supported for custom builds and cannot be released to Google Play.          *\n********************************************************************************************\n********************************************************************************************\n********************************************************************************************\n\n");
        }
    }
}

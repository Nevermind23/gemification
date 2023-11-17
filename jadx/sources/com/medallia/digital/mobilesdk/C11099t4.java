package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.t4 */
public class C11099t4 implements Serializable {

    /* renamed from: a */
    private String f31928a;

    /* renamed from: b */
    private String f31929b;

    /* renamed from: c */
    private String f31930c;

    /* renamed from: d */
    private String f31931d;

    /* renamed from: e */
    private String f31932e;

    /* renamed from: f */
    private String f31933f;

    /* renamed from: g */
    private ArrayList<String> f31934g;

    /* renamed from: h */
    private ArrayList<String> f31935h;

    C11099t4(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.f31928a = str;
        this.f31929b = str2;
        this.f31930c = str3;
        this.f31931d = str4;
        this.f31932e = str5;
        this.f31933f = str6;
        this.f31934g = arrayList;
        this.f31935h = arrayList2;
    }

    /* renamed from: a */
    public String mo29004a() {
        return this.f31930c;
    }

    /* renamed from: b */
    public String mo29005b() {
        return this.f31928a;
    }

    /* renamed from: c */
    public String mo29006c() {
        return this.f31931d;
    }

    /* renamed from: d */
    public String mo29007d() {
        return this.f31929b;
    }

    /* renamed from: e */
    public ArrayList<String> mo29008e() {
        return this.f31934g;
    }

    /* renamed from: f */
    public String mo29009f() {
        return this.f31933f;
    }

    /* renamed from: g */
    public ArrayList<String> mo29010g() {
        return this.f31935h;
    }

    /* renamed from: h */
    public String mo29011h() {
        return this.f31932e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo29012i() {
        try {
            return "{\"channelId\":" + C11051p3.m40518c(this.f31928a) + ",\"domain\":" + C11051p3.m40518c(this.f31929b) + ",\"apiKey\":" + C11051p3.m40518c(this.f31930c) + ",\"channelUrlsPrefix\":" + C11051p3.m40518c(this.f31931d) + ",\"uploadUrlSuffix\":" + C11051p3.m40518c(this.f31932e) + ",\"presignedUrlSuffix\":" + C11051p3.m40518c(this.f31933f) + ",\"namedFilters\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.f31934g) + ",\"unSupportedVideoFormats\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.f31935h) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    C11099t4(JSONObject jSONObject) {
        try {
            if (jSONObject.has("channelId") && !jSONObject.isNull("channelId")) {
                this.f31928a = jSONObject.getString("channelId");
            }
            if (jSONObject.has("domain") && !jSONObject.isNull("domain")) {
                this.f31929b = jSONObject.getString("domain");
            }
            if (jSONObject.has("apiKey") && !jSONObject.isNull("apiKey")) {
                this.f31930c = jSONObject.getString("apiKey");
            }
            if (jSONObject.has("channelUrlsPrefix") && !jSONObject.isNull("channelUrlsPrefix")) {
                this.f31931d = jSONObject.getString("channelUrlsPrefix");
            }
            if (jSONObject.has("uploadUrlSuffix") && !jSONObject.isNull("uploadUrlSuffix")) {
                this.f31932e = jSONObject.getString("uploadUrlSuffix");
            }
            if (jSONObject.has("presignedUrlSuffix") && !jSONObject.isNull("presignedUrlSuffix")) {
                this.f31933f = jSONObject.getString("presignedUrlSuffix");
            }
            if (jSONObject.has("namedFilters") && !jSONObject.isNull("namedFilters")) {
                this.f31934g = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("namedFilters"));
            }
            if (jSONObject.has("unSupportedVideoFormats") && !jSONObject.isNull("unSupportedVideoFormats")) {
                this.f31935h = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("unSupportedVideoFormats"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

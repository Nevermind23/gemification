package com.facetec.sdk;

import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facetec.sdk.ac */
final class C2769ac {

    /* renamed from: a */
    int f8773a = -1;

    /* renamed from: b */
    int f8774b = -1;

    /* renamed from: c */
    byte[] f8775c = new byte[0];

    /* renamed from: d */
    private long f8776d = new Date().getTime();

    /* renamed from: e */
    int f8777e = -1;

    C2769ac() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo8808a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("i", this.f8774b);
            jSONObject.put("sid", this.f8773a);
            jSONObject.put("ct", this.f8776d);
            jSONObject.put("h", this.f8777e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}

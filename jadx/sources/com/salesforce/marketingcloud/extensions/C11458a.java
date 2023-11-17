package com.salesforce.marketingcloud.extensions;

import kotlin.jvm.internal.C41536l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.extensions.a */
public final class C11458a {
    /* renamed from: a */
    public static final String m41872a(JSONObject jSONObject, String str) {
        C41536l.m120489i(jSONObject, "<this>");
        C41536l.m120489i(str, "name");
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}

package com.salesforce.marketingcloud.messages;

import com.salesforce.marketingcloud.location.LatLon;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.messages.a */
public final class C11603a {
    /* renamed from: a */
    public static final LatLon m42345a(JSONObject jSONObject) {
        C41536l.m120489i(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("refreshCenter");
        C41536l.m120488h(jSONObject2, "getJSONObject(\"refreshCenter\")");
        return new LatLon(jSONObject2);
    }

    /* renamed from: b */
    public static final int m42346b(JSONObject jSONObject) {
        C41536l.m120489i(jSONObject, "<this>");
        return jSONObject.getInt("refreshRadius");
    }
}

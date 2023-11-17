package com.salesforce.marketingcloud.analytics.piwama;

import he1.C41238w;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.piwama.e */
public final class C11375e implements C11373c {

    /* renamed from: a */
    private final Date f33046a;

    /* renamed from: b */
    private final boolean f33047b;

    /* renamed from: c */
    private final List<String> f33048c;

    public C11375e(Date date, boolean z, List<String> list) {
        C41536l.m120489i(date, "timestamp");
        C41536l.m120489i(list, "objectIds");
        this.f33046a = date;
        this.f33047b = z;
        this.f33048c = list;
    }

    /* renamed from: a */
    public String mo29811a() {
        return "app_open";
    }

    /* renamed from: b */
    public String mo29814b() {
        return "track_event";
    }

    /* renamed from: c */
    public int mo29815c() {
        return 0;
    }

    /* renamed from: d */
    public Date mo29816d() {
        return this.f33046a;
    }

    /* renamed from: e */
    public JSONObject mo29817e() {
        JSONObject jSONObject = new JSONObject();
        mo29813a(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("open_from_push", this.f33047b);
        if (!this.f33048c.isEmpty()) {
            jSONObject2.put("message_ids", new JSONArray(this.f33048c));
        }
        C41238w wVar = C41238w.f97225a;
        jSONObject.put("details", jSONObject2);
        return jSONObject;
    }

    /* renamed from: a */
    public /* synthetic */ String mo29812a(String str, String str2, boolean z) {
        return C11389m.m41651a(this, str, str2, z);
    }

    /* renamed from: a */
    public /* synthetic */ void mo29813a(JSONObject jSONObject) {
        C11389m.m41652b(this, jSONObject);
    }
}

package com.salesforce.marketingcloud.analytics.piwama;

import java.util.Date;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.piwama.b */
public final class C11372b implements C11373c {

    /* renamed from: a */
    private final Date f33044a;

    public C11372b(Date date) {
        C41536l.m120489i(date, "timestamp");
        this.f33044a = date;
    }

    /* renamed from: a */
    public String mo29811a() {
        return "app_close";
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
        return this.f33044a;
    }

    /* renamed from: e */
    public JSONObject mo29817e() {
        JSONObject jSONObject = new JSONObject();
        mo29813a(jSONObject);
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

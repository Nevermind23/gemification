package com.salesforce.marketingcloud.events;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.events.e */
public final class C11435e {

    /* renamed from: a */
    private final String f33263a;

    /* renamed from: b */
    private final String f33264b;

    /* renamed from: c */
    private final String f33265c;

    public C11435e(String str, String str2, String str3) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str3, "type");
        this.f33263a = str;
        this.f33264b = str2;
        this.f33265c = str3;
    }

    /* renamed from: a */
    public static /* synthetic */ C11435e m41798a(C11435e eVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f33263a;
        }
        if ((i & 2) != 0) {
            str2 = eVar.f33264b;
        }
        if ((i & 4) != 0) {
            str3 = eVar.f33265c;
        }
        return eVar.mo29899a(str, str2, str3);
    }

    /* renamed from: b */
    public final String mo29901b() {
        return this.f33264b;
    }

    /* renamed from: c */
    public final String mo29902c() {
        return this.f33265c;
    }

    /* renamed from: d */
    public final String mo29903d() {
        return this.f33264b;
    }

    /* renamed from: e */
    public final String mo29904e() {
        return this.f33263a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11435e)) {
            return false;
        }
        C11435e eVar = (C11435e) obj;
        return C41536l.m120484d(this.f33263a, eVar.f33263a) && C41536l.m120484d(this.f33264b, eVar.f33264b) && C41536l.m120484d(this.f33265c, eVar.f33265c);
    }

    /* renamed from: f */
    public final String mo29906f() {
        return this.f33265c;
    }

    /* renamed from: g */
    public final JSONObject mo29907g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", mo29904e());
        if (mo29903d() != null) {
            jSONObject.put("activityInstanceId", mo29903d());
        }
        jSONObject.put("type", mo29906f());
        return jSONObject;
    }

    public int hashCode() {
        int hashCode = this.f33263a.hashCode() * 31;
        String str = this.f33264b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f33265c.hashCode();
    }

    public String toString() {
        return "Outcome(id=" + this.f33263a + ", activityInstanceId=" + this.f33264b + ", type=" + this.f33265c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11435e(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3);
    }

    /* renamed from: a */
    public final C11435e mo29899a(String str, String str2, String str3) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str3, "type");
        return new C11435e(str, str2, str3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11435e(org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = "id"
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r1 = "json.getString(\"id\")"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            java.lang.String r1 = "activityInstanceId"
            java.lang.String r1 = r4.optString(r1)
            java.lang.String r2 = "json.optString(\"activityInstanceId\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r1 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r2 = "type"
            java.lang.String r4 = r4.getString(r2)
            java.lang.String r2 = "json.getString(\"type\")"
            kotlin.jvm.internal.C41536l.m120488h(r4, r2)
            r3.<init>(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.events.C11435e.<init>(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final String mo29900a() {
        return this.f33263a;
    }
}

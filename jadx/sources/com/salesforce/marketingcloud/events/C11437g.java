package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.events.g */
public final class C11437g {

    /* renamed from: a */
    private final int f33266a;

    /* renamed from: b */
    private final String f33267b;

    /* renamed from: c */
    private final C11438a f33268c;

    /* renamed from: d */
    private final C11439b f33269d;

    /* renamed from: e */
    private final String f33270e;

    /* renamed from: com.salesforce.marketingcloud.events.g$a */
    public enum C11438a {
        EQ,
        NEQ,
        LT,
        GT,
        LTEQ,
        GTEQ,
        REGEX
    }

    /* renamed from: com.salesforce.marketingcloud.events.g$b */
    public enum C11439b {
        INT,
        DOUBLE,
        BOOL,
        STRING
    }

    public C11437g(int i, String str, C11438a aVar, C11439b bVar, String str2) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(aVar, "operator");
        C41536l.m120489i(bVar, "valueType");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        this.f33266a = i;
        this.f33267b = str;
        this.f33268c = aVar;
        this.f33269d = bVar;
        this.f33270e = str2;
    }

    /* renamed from: a */
    public final int mo29911a() {
        return this.f33266a;
    }

    /* renamed from: b */
    public final String mo29913b() {
        return this.f33267b;
    }

    /* renamed from: c */
    public final C11438a mo29914c() {
        return this.f33268c;
    }

    /* renamed from: d */
    public final C11439b mo29915d() {
        return this.f33269d;
    }

    /* renamed from: e */
    public final String mo29916e() {
        return this.f33270e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11437g)) {
            return false;
        }
        C11437g gVar = (C11437g) obj;
        return this.f33266a == gVar.f33266a && C41536l.m120484d(this.f33267b, gVar.f33267b) && this.f33268c == gVar.f33268c && this.f33269d == gVar.f33269d && C41536l.m120484d(this.f33270e, gVar.f33270e);
    }

    /* renamed from: f */
    public final int mo29918f() {
        return this.f33266a;
    }

    /* renamed from: g */
    public final String mo29919g() {
        return this.f33267b;
    }

    /* renamed from: h */
    public final C11438a mo29920h() {
        return this.f33268c;
    }

    public int hashCode() {
        return (((((((this.f33266a * 31) + this.f33267b.hashCode()) * 31) + this.f33268c.hashCode()) * 31) + this.f33269d.hashCode()) * 31) + this.f33270e.hashCode();
    }

    /* renamed from: i */
    public final String mo29922i() {
        return this.f33270e;
    }

    /* renamed from: j */
    public final C11439b mo29923j() {
        return this.f33269d;
    }

    /* renamed from: k */
    public final JSONObject mo29924k() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", mo29918f());
        jSONObject.put("key", mo29919g());
        jSONObject.put("operator", mo29920h().name());
        jSONObject.put("valueType", mo29923j().name());
        jSONObject.put(C11755a.C11756a.f34100b, mo29922i());
        return jSONObject;
    }

    public String toString() {
        return "Rule(index=" + this.f33266a + ", key=" + this.f33267b + ", operator=" + this.f33268c + ", valueType=" + this.f33269d + ", value=" + this.f33270e + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11437g(org.json.JSONObject r9) {
        /*
            r8 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            java.lang.String r0 = "index"
            r1 = 0
            int r3 = r9.optInt(r0, r1)
            java.lang.String r0 = "key"
            java.lang.String r4 = r9.getString(r0)
            java.lang.String r0 = "json.getString(\"key\")"
            kotlin.jvm.internal.C41536l.m120488h(r4, r0)
            java.lang.String r0 = "operator"
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r1 = "getString(name)"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            com.salesforce.marketingcloud.events.g$a r5 = com.salesforce.marketingcloud.events.C11437g.C11438a.valueOf(r0)
            java.lang.String r0 = "valueType"
            java.lang.String r0 = r9.getString(r0)
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            com.salesforce.marketingcloud.events.g$b r6 = com.salesforce.marketingcloud.events.C11437g.C11439b.valueOf(r0)
            java.lang.String r0 = "value"
            java.lang.String r7 = r9.getString(r0)
            java.lang.String r9 = "json.getString(\"value\")"
            kotlin.jvm.internal.C41536l.m120488h(r7, r9)
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.events.C11437g.<init>(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final C11437g mo29912a(int i, String str, C11438a aVar, C11439b bVar, String str2) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(aVar, "operator");
        C41536l.m120489i(bVar, "valueType");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        return new C11437g(i, str, aVar, bVar, str2);
    }

    /* renamed from: a */
    public static /* synthetic */ C11437g m41807a(C11437g gVar, int i, String str, C11438a aVar, C11439b bVar, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gVar.f33266a;
        }
        if ((i2 & 2) != 0) {
            str = gVar.f33267b;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            aVar = gVar.f33268c;
        }
        C11438a aVar2 = aVar;
        if ((i2 & 8) != 0) {
            bVar = gVar.f33269d;
        }
        C11439b bVar2 = bVar;
        if ((i2 & 16) != 0) {
            str2 = gVar.f33270e;
        }
        return gVar.mo29912a(i, str3, aVar2, bVar2, str2);
    }
}

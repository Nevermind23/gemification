package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import com.medallia.digital.mobilesdk.C11089s6;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.i */
class C10874i extends C10785e0 {

    /* renamed from: a */
    private String f31189a;

    /* renamed from: b */
    private String f31190b;

    /* renamed from: c */
    private long f31191c;

    /* renamed from: d */
    private JSONObject f31192d;

    /* renamed from: e */
    private Lifetime f31193e;

    /* renamed from: f */
    private GroupType f31194f;

    C10874i(String str, GroupType groupType, Lifetime lifetime, String str2, long j, String str3) {
        try {
            this.f31189a = str2;
            this.f31193e = lifetime;
            this.f31194f = groupType;
            this.f31191c = j;
            this.f31190b = str3;
            this.f31192d = new JSONObject(str);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo28453a() {
        return this.f31189a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public GroupType mo28455b() {
        return this.f31194f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Lifetime mo28456c() {
        return this.f31193e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public JSONObject mo28457d() {
        return this.f31192d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo28458e() {
        return this.f31190b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo28459f() {
        return this.f31191c;
    }

    /* access modifiers changed from: protected */
    public C10785e0.C10786a getDataTableObjectType() {
        return C10785e0.C10786a.AnalyticsData;
    }

    public String toJsonString() {
        try {
            return "{\"eventName\":" + C11051p3.m40518c(this.f31189a) + ",\"lifetime\":" + C11051p3.m40518c(this.f31193e.toString()) + ",\"groupType\":" + C11051p3.m40518c(this.f31194f.toString()) + ",\"timestamp\":" + this.f31191c + ",\"sessionId\":" + C11051p3.m40518c(this.f31190b) + ",\"payload\":" + this.f31192d.toString() + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(C10749b8.m39170a(this.f31191c));
        sb.append("]");
        JSONObject jSONObject = this.f31192d;
        sb.append(jSONObject != null ? jSONObject.toString() : "null");
        return sb.toString();
    }

    C10874i(String str, JSONObject jSONObject, GroupType groupType, Lifetime lifetime) {
        this.f31190b = C11089s6.m40668b().mo28975a(C11089s6.C11090a.SESSION_ID, "");
        this.f31189a = str;
        this.f31191c = System.currentTimeMillis();
        this.f31193e = lifetime;
        this.f31194f = groupType;
        this.f31192d = jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28454a(String str) {
        this.f31190b = str;
    }

    C10874i(JSONObject jSONObject, GroupType groupType, Lifetime lifetime, String str, String str2, long j) {
        try {
            this.f31189a = str;
            this.f31193e = lifetime;
            this.f31194f = groupType;
            this.f31191c = j;
            this.f31190b = str2;
            this.f31192d = jSONObject;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

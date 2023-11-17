package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.b */
class C10730b extends C11015n3 {

    /* renamed from: b */
    private String f30664b;

    /* renamed from: c */
    private long f30665c;

    /* renamed from: d */
    private long f30666d;

    /* renamed from: e */
    private long f30667e;

    protected C10730b(String str) {
        super(str);
        try {
            JSONObject jSONObject = new JSONObject(C11032o3.m40431c(str));
            if (jSONObject.has("getConfigUrl") && !jSONObject.isNull("getConfigUrl")) {
                this.f30664b = jSONObject.getString("getConfigUrl");
            }
            if (jSONObject.has("createTime") && !jSONObject.isNull("createTime")) {
                this.f30666d = jSONObject.getLong("createTime");
            }
            if (jSONObject.has("ttl") && !jSONObject.isNull("ttl")) {
                this.f30667e = jSONObject.getLong("ttl");
            }
            if (jSONObject.has("propertyId") && !jSONObject.isNull("propertyId")) {
                this.f30665c = jSONObject.getLong("propertyId");
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28092a(long j) {
        this.f30665c = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo28093b() {
        return this.f30666d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo28094c() {
        return this.f30664b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo28095d() {
        return this.f30665c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo28096e() {
        return this.f30667e;
    }

    protected C10730b(String str, String str2, long j, long j2, long j3) {
        super(str);
        this.f30664b = str2;
        this.f30665c = j;
        this.f30666d = j2;
        this.f30667e = j3;
    }
}

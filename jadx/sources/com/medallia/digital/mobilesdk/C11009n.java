package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.n */
class C11009n extends C11015n3 {

    /* renamed from: b */
    private long f31618b;

    /* renamed from: c */
    private String f31619c;

    protected C11009n(String str) {
        super(str);
        try {
            JSONObject jSONObject = new JSONObject(C11032o3.m40431c(str));
            if (jSONObject.has("propertyId") && !jSONObject.isNull("propertyId")) {
                this.f31618b = jSONObject.getLong("propertyId");
            }
            if (jSONObject.has("authUrl") && !jSONObject.isNull("authUrl")) {
                this.f31619c = jSONObject.getString("authUrl");
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28776b() {
        return this.f31619c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28777c() {
        return this.f31618b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof C11009n)) {
            return false;
        }
        String a = mo28827a();
        String a2 = ((C11009n) obj).mo28827a();
        return a != null ? a.equals(a2) : a2 == null;
    }

    public int hashCode() {
        if (mo28827a() != null) {
            return mo28827a().hashCode();
        }
        return 0;
    }

    protected C11009n(String str, long j, String str2) {
        super(str);
        this.f31618b = j;
        this.f31619c = str2;
    }
}

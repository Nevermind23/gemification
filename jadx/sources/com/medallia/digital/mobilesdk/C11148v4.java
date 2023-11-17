package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.v4 */
class C11148v4 {

    /* renamed from: c */
    private static final int f32050c = 31;

    /* renamed from: a */
    private String f32051a;

    /* renamed from: b */
    private String f32052b;

    C11148v4(JSONObject jSONObject) {
        try {
            if (jSONObject.has("key") && !jSONObject.isNull("key")) {
                this.f32051a = jSONObject.getString("key");
            }
            if (jSONObject.has("presignedUrl") && !jSONObject.isNull("presignedUrl")) {
                this.f32052b = jSONObject.getString("presignedUrl");
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: a */
    public String mo29086a() {
        return this.f32051a;
    }

    /* renamed from: b */
    public String mo29087b() {
        return this.f32052b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo29088c() {
        try {
            return "{\"key\":" + C11051p3.m40518c(this.f32051a) + ",\"presignedUrl\":" + C11051p3.m40518c(this.f32052b) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11148v4 v4Var = (C11148v4) obj;
        String str = this.f32051a;
        if (str == null ? v4Var.f32051a != null : !str.equals(v4Var.f32051a)) {
            return false;
        }
        String str2 = this.f32052b;
        String str3 = v4Var.f32052b;
        if (str2 != null) {
            if (!str2.equals(str3)) {
                return true;
            }
        } else if (str3 != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f32051a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32052b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}

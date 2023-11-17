package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.f1 */
class C10803f1 implements Serializable {

    /* renamed from: f */
    private static final int f30935f = 31;

    /* renamed from: a */
    private String f30936a;

    /* renamed from: b */
    private String f30937b;

    /* renamed from: c */
    private String f30938c;

    /* renamed from: d */
    private String f30939d;

    /* renamed from: e */
    private String f30940e;

    C10803f1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("invitationTitle") && !jSONObject.isNull("invitationTitle")) {
                this.f30936a = jSONObject.getString("invitationTitle");
            }
            if (jSONObject.has("invitationDescription") && !jSONObject.isNull("invitationDescription")) {
                this.f30937b = jSONObject.getString("invitationDescription");
            }
            if (jSONObject.has("provideButtonText") && !jSONObject.isNull("provideButtonText")) {
                this.f30938c = jSONObject.getString("provideButtonText");
            }
            if (jSONObject.has("declineButtonText") && !jSONObject.isNull("declineButtonText")) {
                this.f30939d = jSONObject.getString("declineButtonText");
            }
            if (jSONObject.has("laterButtonText") && !jSONObject.isNull("laterButtonText")) {
                this.f30940e = jSONObject.getString("laterButtonText");
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28288a() {
        return this.f30939d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28289b() {
        return this.f30937b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo28290c() {
        return this.f30936a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo28291d() {
        return this.f30940e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28292e() {
        return this.f30938c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10803f1 f1Var = (C10803f1) obj;
        String str = this.f30936a;
        if (str == null ? f1Var.f30936a != null : !str.equals(f1Var.f30936a)) {
            return false;
        }
        String str2 = this.f30937b;
        if (str2 == null ? f1Var.f30937b != null : !str2.equals(f1Var.f30937b)) {
            return false;
        }
        String str3 = this.f30938c;
        if (str3 == null ? f1Var.f30938c != null : !str3.equals(f1Var.f30938c)) {
            return false;
        }
        String str4 = this.f30939d;
        if (str4 == null ? f1Var.f30939d != null : !str4.equals(f1Var.f30939d)) {
            return false;
        }
        String str5 = this.f30940e;
        String str6 = f1Var.f30940e;
        return str5 == null ? str6 == null : str5.equals(str6);
    }

    /* renamed from: f */
    public String mo28294f() {
        try {
            return "{\"invitationTitle\":" + C11051p3.m40519d(this.f30936a) + ",\"invitationDescription\":" + C11051p3.m40519d(this.f30937b) + ",\"provideButtonText\":" + C11051p3.m40518c(this.f30938c) + ",\"declineButtonText\":" + C11051p3.m40518c(this.f30939d) + ",\"laterButtonText\":" + C11051p3.m40518c(this.f30940e) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public int hashCode() {
        String str = this.f30936a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30937b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30938c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f30939d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f30940e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}

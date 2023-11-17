package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.k7 */
public class C10939k7 {

    /* renamed from: a */
    private C11002m5 f31425a;

    /* renamed from: b */
    private C11002m5 f31426b;

    public C10939k7(C11002m5 m5Var, C11002m5 m5Var2) {
        this.f31425a = m5Var;
        this.f31426b = m5Var2;
    }

    /* renamed from: a */
    public C11002m5 mo28636a() {
        return this.f31426b;
    }

    /* renamed from: b */
    public C11002m5 mo28637b() {
        return this.f31425a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo28638c() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"light\":");
            C11002m5 m5Var = this.f31425a;
            String str = "null";
            sb.append(m5Var == null ? str : m5Var.mo28761b());
            sb.append(",\"dark\":");
            C11002m5 m5Var2 = this.f31426b;
            if (m5Var2 != null) {
                str = m5Var2.mo28761b();
            }
            sb.append(str);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public C10939k7(JSONObject jSONObject) {
        try {
            if (jSONObject.has("light") && !jSONObject.isNull("light")) {
                this.f31425a = new C11002m5(jSONObject.getJSONObject("light"));
            }
            if (jSONObject.has("dark") && !jSONObject.isNull("dark")) {
                this.f31426b = new C11002m5(jSONObject.getJSONObject("dark"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

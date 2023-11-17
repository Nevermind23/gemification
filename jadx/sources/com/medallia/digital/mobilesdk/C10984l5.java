package com.medallia.digital.mobilesdk;

import com.salesforce.marketingcloud.UrlHandler;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.l5 */
public class C10984l5 implements Serializable {

    /* renamed from: a */
    private C10772d1 f31546a;

    /* renamed from: b */
    private C10770d f31547b;

    /* renamed from: c */
    private C11230y7 f31548c;

    public C10984l5(C10772d1 d1Var, C10770d dVar, C11230y7 y7Var) {
        this.f31546a = d1Var;
        this.f31547b = dVar;
        this.f31548c = y7Var;
    }

    /* renamed from: a */
    public C10770d mo28697a() {
        return this.f31547b;
    }

    /* renamed from: b */
    public C10772d1 mo28698b() {
        return this.f31546a;
    }

    /* renamed from: c */
    public C11230y7 mo28699c() {
        return this.f31548c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo28700d() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"core\":");
            C10772d1 d1Var = this.f31546a;
            String str = "null";
            sb.append(d1Var == null ? str : d1Var.mo28241c());
            sb.append(",\"action\":");
            C10770d dVar = this.f31547b;
            sb.append(dVar == null ? str : dVar.mo28238c());
            sb.append(",\"typography\":");
            C11230y7 y7Var = this.f31548c;
            if (y7Var != null) {
                str = y7Var.mo29237d();
            }
            sb.append(str);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public C10984l5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("core") && !jSONObject.isNull("core")) {
                this.f31546a = new C10772d1(jSONObject.getJSONObject("core"));
            }
            if (jSONObject.has(UrlHandler.ACTION) && !jSONObject.isNull(UrlHandler.ACTION)) {
                this.f31547b = new C10770d(jSONObject.getJSONObject(UrlHandler.ACTION));
            }
            if (jSONObject.has("typography") && !jSONObject.isNull("typography")) {
                this.f31548c = new C11230y7(jSONObject.getJSONObject("typography"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

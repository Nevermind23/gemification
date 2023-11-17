package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.z3 */
class C11238z3 extends C10875i0 {

    /* renamed from: a */
    private ArrayList<String> f32581a;

    /* renamed from: b */
    private ResourceContract f32582b;

    /* renamed from: c */
    private ResourceContract f32583c;

    /* renamed from: d */
    private String f32584d;

    /* renamed from: e */
    private String f32585e;

    /* renamed from: f */
    private String f32586f;

    C11238z3(ArrayList<String> arrayList, ResourceContract resourceContract, String str, String str2, String str3) {
        this.f32581a = arrayList;
        this.f32582b = resourceContract;
        this.f32584d = str;
        this.f32585e = str2;
        this.f32586f = str3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo29246a() {
        return this.f32581a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo29247b() {
        return this.f32586f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo29248c() {
        return this.f32584d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo29249d() {
        return this.f32585e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ResourceContract mo29250e() {
        return this.f32582b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ResourceContract mo29251f() {
        return this.f32583c;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"availableLanguages\":");
        sb.append(ModelFactory.getInstance().getStringArrayAsJsonString(this.f32581a));
        sb.append(",\"resource\":");
        ResourceContract resourceContract = this.f32582b;
        String str = null;
        sb.append(resourceContract == null ? null : resourceContract.toJsonString());
        sb.append(",\"staticResource\":");
        ResourceContract resourceContract2 = this.f32583c;
        if (resourceContract2 != null) {
            str = resourceContract2.toJsonString();
        }
        sb.append(str);
        sb.append(",\"fileNamePattern\":");
        sb.append(C11051p3.m40518c(this.f32584d));
        sb.append(",\"localePlaceHolderInPattern\":");
        sb.append(C11051p3.m40518c(this.f32585e));
        sb.append(",\"defaultLocaleName\":");
        sb.append(C11051p3.m40518c(this.f32586f));
        sb.append("}");
        return sb.toString();
    }

    C11238z3(JSONObject jSONObject) {
        try {
            if (jSONObject.has("availableLanguages") && !jSONObject.isNull("availableLanguages")) {
                this.f32581a = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("availableLanguages"));
            }
            if (jSONObject.has("resource") && !jSONObject.isNull("resource")) {
                this.f32582b = new ResourceContract(jSONObject.getJSONObject("resource"));
            }
            if (jSONObject.has("staticResource") && !jSONObject.isNull("staticResource")) {
                this.f32583c = new ResourceContract(jSONObject.getJSONObject("staticResource"));
            }
            if (jSONObject.has("fileNamePattern") && !jSONObject.isNull("fileNamePattern")) {
                this.f32584d = jSONObject.getString("fileNamePattern");
            }
            if (jSONObject.has("localePlaceHolderInPattern") && !jSONObject.isNull("localePlaceHolderInPattern")) {
                this.f32585e = jSONObject.getString("localePlaceHolderInPattern");
            }
            if (jSONObject.has("defaultLocaleName") && !jSONObject.isNull("defaultLocaleName")) {
                this.f32586f = jSONObject.getString("defaultLocaleName");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

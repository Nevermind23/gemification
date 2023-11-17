package com.medallia.digital.mobilesdk;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.q0 */
class C11063q0 {

    /* renamed from: a */
    private String f31815a;

    /* renamed from: b */
    private HashMap<String, String> f31816b;

    /* renamed from: c */
    private HashMap<String, String> f31817c;

    /* renamed from: d */
    private JSONObject f31818d;

    /* renamed from: e */
    private String f31819e;

    C11063q0() {
        this.f31819e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo28929a() {
        return this.f31818d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public HashMap<String, String> mo28930b() {
        return this.f31816b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public HashMap<String, String> mo28931c() {
        return this.f31817c;
    }

    /* renamed from: d */
    public String mo28932d() {
        return this.f31819e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28933e() {
        return this.f31815a;
    }

    C11063q0(String str) {
        this.f31819e = null;
        this.f31815a = str;
    }

    C11063q0(String str, HashMap<String, String> hashMap) {
        this.f31819e = null;
        this.f31815a = str;
        this.f31816b = hashMap;
    }

    C11063q0(String str, HashMap<String, String> hashMap, String str2) {
        this.f31815a = str;
        this.f31816b = hashMap;
        this.f31819e = str2;
    }

    C11063q0(String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, JSONObject jSONObject) {
        this.f31819e = null;
        this.f31815a = str;
        this.f31816b = hashMap;
        this.f31817c = hashMap2;
        this.f31818d = jSONObject;
    }

    C11063q0(String str, HashMap<String, String> hashMap, JSONObject jSONObject) {
        this.f31819e = null;
        this.f31815a = str;
        this.f31816b = hashMap;
        this.f31818d = jSONObject;
    }
}

package com.facetec.sdk;

import com.facetec.sdk.C2831bd;
import org.json.JSONObject;

/* renamed from: com.facetec.sdk.p3 */
public final /* synthetic */ class C3496p3 implements C2831bd.C2834d {

    /* renamed from: a */
    public final /* synthetic */ C2831bd f11360a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f11361b;

    public /* synthetic */ C3496p3(C2831bd bdVar, JSONObject jSONObject) {
        this.f11360a = bdVar;
        this.f11361b = jSONObject;
    }

    public final byte[] getIdScanBytes(String str) {
        return this.f11360a.m11245c(this.f11361b, str);
    }
}

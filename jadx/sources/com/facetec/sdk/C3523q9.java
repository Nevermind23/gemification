package com.facetec.sdk;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.facetec.sdk.q9 */
public final /* synthetic */ class C3523q9 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C2879cb f11404d;

    /* renamed from: e */
    public final /* synthetic */ Context f11405e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f11406f;

    public /* synthetic */ C3523q9(C2879cb cbVar, Context context, JSONObject jSONObject) {
        this.f11404d = cbVar;
        this.f11405e = context;
        this.f11406f = jSONObject;
    }

    public final void run() {
        this.f11404d.m11715c(this.f11405e, this.f11406f);
    }
}

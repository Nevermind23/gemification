package com.facetec.sdk;

import android.content.Context;
import com.facetec.sdk.FaceTecSDK;

/* renamed from: com.facetec.sdk.y5 */
public final /* synthetic */ class C3696y5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f11740d;

    /* renamed from: e */
    public final /* synthetic */ Context f11741e;

    /* renamed from: f */
    public final /* synthetic */ FaceTecSDK.InitializeCallback f11742f;

    /* renamed from: g */
    public final /* synthetic */ String f11743g;

    /* renamed from: h */
    public final /* synthetic */ String f11744h;

    public /* synthetic */ C3696y5(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback, String str2, String str3) {
        this.f11740d = str;
        this.f11741e = context;
        this.f11742f = initializeCallback;
        this.f11743g = str2;
        this.f11744h = str3;
    }

    public final void run() {
        C2840bg.m11372e(this.f11740d, this.f11741e, this.f11742f, this.f11743g, this.f11744h);
    }
}

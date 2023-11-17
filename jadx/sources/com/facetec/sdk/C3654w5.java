package com.facetec.sdk;

import android.content.Context;
import com.facetec.sdk.FaceTecSDK;

/* renamed from: com.facetec.sdk.w5 */
public final /* synthetic */ class C3654w5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f11671d;

    /* renamed from: e */
    public final /* synthetic */ Context f11672e;

    /* renamed from: f */
    public final /* synthetic */ FaceTecSDK.InitializeCallback f11673f;

    public /* synthetic */ C3654w5(boolean z, Context context, FaceTecSDK.InitializeCallback initializeCallback) {
        this.f11671d = z;
        this.f11672e = context;
        this.f11673f = initializeCallback;
    }

    public final void run() {
        C2840bg.m11357b(this.f11671d, this.f11672e, this.f11673f);
    }
}

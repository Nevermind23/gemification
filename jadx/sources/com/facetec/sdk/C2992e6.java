package com.facetec.sdk;

import android.content.Context;
import com.facetec.sdk.FaceTecSDK;

/* renamed from: com.facetec.sdk.e6 */
public final /* synthetic */ class C2992e6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f10123d;

    /* renamed from: e */
    public final /* synthetic */ Context f10124e;

    /* renamed from: f */
    public final /* synthetic */ FaceTecSDK.InitializeCallback f10125f;

    public /* synthetic */ C2992e6(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback) {
        this.f10123d = str;
        this.f10124e = context;
        this.f10125f = initializeCallback;
    }

    public final void run() {
        C2840bg.m11371e(this.f10123d, this.f10124e, this.f10125f);
    }
}

package com.facetec.sdk;

import android.content.Context;
import com.facetec.sdk.C2802au;
import com.facetec.sdk.FaceTecSDK;

/* renamed from: com.facetec.sdk.d6 */
public final /* synthetic */ class C2932d6 implements C2802au.C2807e {

    /* renamed from: a */
    public final /* synthetic */ Context f9831a;

    /* renamed from: b */
    public final /* synthetic */ FaceTecSDK.InitializeCallback f9832b;

    public /* synthetic */ C2932d6(Context context, FaceTecSDK.InitializeCallback initializeCallback) {
        this.f9831a = context;
        this.f9832b = initializeCallback;
    }

    public final void onCompletion(C2802au.C2805a aVar) {
        C2840bg.m11352b(this.f9831a, this.f9832b, aVar);
    }
}

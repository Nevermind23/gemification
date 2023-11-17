package com.facetec.sdk;

import android.hardware.Camera;

/* renamed from: com.facetec.sdk.w0 */
public final /* synthetic */ class C3649w0 implements Camera.AutoFocusCallback {

    /* renamed from: d */
    public final /* synthetic */ C2783aj f11664d;

    public /* synthetic */ C3649w0(C2783aj ajVar) {
        this.f11664d = ajVar;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        this.f11664d.m10786c(z, camera);
    }
}

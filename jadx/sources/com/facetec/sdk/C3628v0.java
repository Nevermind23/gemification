package com.facetec.sdk;

import android.hardware.Camera;

/* renamed from: com.facetec.sdk.v0 */
public final /* synthetic */ class C3628v0 implements Camera.AutoFocusMoveCallback {

    /* renamed from: a */
    public final /* synthetic */ C2783aj f11625a;

    public /* synthetic */ C3628v0(C2783aj ajVar) {
        this.f11625a = ajVar;
    }

    public final void onAutoFocusMoving(boolean z, Camera camera) {
        this.f11625a.m10791d(z, camera);
    }
}

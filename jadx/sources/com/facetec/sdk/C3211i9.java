package com.facetec.sdk;

import android.hardware.Sensor;

/* renamed from: com.facetec.sdk.i9 */
public final /* synthetic */ class C3211i9 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C2860bu f10511d;

    /* renamed from: e */
    public final /* synthetic */ Sensor f10512e;

    public /* synthetic */ C3211i9(C2860bu buVar, Sensor sensor) {
        this.f10511d = buVar;
        this.f10512e = sensor;
    }

    public final void run() {
        this.f10511d.m11662c(this.f10512e);
    }
}

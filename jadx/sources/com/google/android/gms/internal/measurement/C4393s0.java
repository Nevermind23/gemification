package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
public abstract class C4393s0 extends C4342p0 implements C4410t0 {
    /* renamed from: x */
    public static C4410t0 m16613x(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof C4410t0) {
            return (C4410t0) queryLocalInterface;
        }
        return new C4376r0(iBinder);
    }
}

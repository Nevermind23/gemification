package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
public final class C4376r0 extends C4325o0 implements C4410t0 {
    C4376r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: P1 */
    public final Bundle mo13514P1(Bundle bundle) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, bundle);
        Parcel x = mo13412x(1, k);
        Bundle bundle2 = (Bundle) C4359q0.m16484a(x, Bundle.CREATOR);
        x.recycle();
        return bundle2;
    }
}

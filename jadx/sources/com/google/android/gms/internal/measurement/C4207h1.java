package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.h1 */
public abstract class C4207h1 extends C4342p0 implements C4224i1 {
    public C4207h1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo13050k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C4359q0.m16486c(parcel);
        mo12891H1((Bundle) C4359q0.m16484a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.k1 */
public abstract class C4258k1 extends C4342p0 implements C4275l1 {
    public C4258k1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo13050k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            C4359q0.m16486c(parcel);
            mo13274C(parcel.readString(), parcel.readString(), (Bundle) C4359q0.m16484a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int b = mo13275b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}

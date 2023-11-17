package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
public final class C4241j1 extends C4325o0 implements C4275l1 {
    C4241j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: C */
    public final void mo13274C(String str, String str2, Bundle bundle, long j) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeString(str2);
        C4359q0.m16487d(k, bundle);
        k.writeLong(j);
        mo13413y(1, k);
    }

    /* renamed from: b */
    public final int mo13275b() {
        Parcel x = mo13412x(2, mo13411k());
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }
}

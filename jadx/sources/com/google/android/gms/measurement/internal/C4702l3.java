package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.internal.C3958b;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.l3 */
public final class C4702l3 extends C3958b {
    public C4702l3(Context context, Looper looper, C3958b.C3959a aVar, C3958b.C3960b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo7049J() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo7050K() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: q */
    public final int mo7053q() {
        return C3943d.f12557a;
    }

    /* renamed from: x */
    public final /* synthetic */ IInterface mo7054x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof C8252f) {
            return (C8252f) queryLocalInterface;
        }
        return new C4647g3(iBinder);
    }
}

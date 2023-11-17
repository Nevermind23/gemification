package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import p182n6.C7254e;
import p182n6.C7256f;

/* renamed from: com.google.android.gms.common.internal.l */
final class C3974l implements C7256f {

    /* renamed from: b */
    private final IBinder f12691b;

    C3974l(IBinder iBinder) {
        this.f12691b = iBinder;
    }

    /* renamed from: C0 */
    public final void mo12274C0(C7254e eVar, GetServiceRequest getServiceRequest) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (eVar != null) {
                iBinder = eVar.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                C3984v.m15155a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f12691b.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f12691b;
    }
}

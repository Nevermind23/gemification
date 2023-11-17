package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.o0 */
public abstract class C4325o0 implements IInterface {

    /* renamed from: b */
    private final IBinder f13557b;

    /* renamed from: c */
    private final String f13558c;

    protected C4325o0(IBinder iBinder, String str) {
        this.f13557b = iBinder;
        this.f13558c = str;
    }

    public final IBinder asBinder() {
        return this.f13557b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo13411k() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13558c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo13412x(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f13557b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo13413y(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f13557b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

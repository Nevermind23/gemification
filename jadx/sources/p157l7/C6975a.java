package p157l7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: l7.a */
public abstract class C6975a implements IInterface {

    /* renamed from: b */
    private final IBinder f20849b;

    /* renamed from: c */
    private final String f20850c = "com.google.android.gms.tapandpay.internal.ITapAndPayService";

    protected C6975a(IBinder iBinder, String str) {
        this.f20849b = iBinder;
    }

    public final IBinder asBinder() {
        return this.f20849b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo21109k() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20850c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo21110x(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20849b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

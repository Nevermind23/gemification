package p053d7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d7.a */
public abstract class C5842a implements IInterface {

    /* renamed from: b */
    private final IBinder f18363b;

    /* renamed from: c */
    private final String f18364c = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    protected C5842a(IBinder iBinder, String str) {
        this.f18363b = iBinder;
    }

    public final IBinder asBinder() {
        return this.f18363b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo19062k() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18364c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo19063x(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18363b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

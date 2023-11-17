package p066e7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e7.a */
public abstract class C6037a implements IInterface {

    /* renamed from: b */
    private final IBinder f18820b;

    /* renamed from: c */
    private final String f18821c;

    protected C6037a(IBinder iBinder, String str) {
        this.f18820b = iBinder;
        this.f18821c = str;
    }

    public final IBinder asBinder() {
        return this.f18820b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo19527k() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18821c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo19528x(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18820b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo19529y(int i, Parcel parcel) {
        try {
            this.f18820b.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

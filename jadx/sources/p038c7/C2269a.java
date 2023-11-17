package p038c7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c7.a */
public abstract class C2269a implements IInterface {

    /* renamed from: b */
    private final IBinder f7076b;

    /* renamed from: c */
    private final String f7077c;

    protected C2269a(IBinder iBinder, String str) {
        this.f7076b = iBinder;
        this.f7077c = str;
    }

    public final IBinder asBinder() {
        return this.f7076b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo7316k() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7077c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo7317x(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7076b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

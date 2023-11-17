package p131j7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: j7.a */
public abstract class C6738a implements IInterface {

    /* renamed from: b */
    private final IBinder f20306b;

    /* renamed from: c */
    private final String f20307c;

    protected C6738a(IBinder iBinder, String str) {
        this.f20306b = iBinder;
        this.f20307c = str;
    }

    public final IBinder asBinder() {
        return this.f20306b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo20748k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f20306b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo20749x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20307c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo20750y(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20306b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

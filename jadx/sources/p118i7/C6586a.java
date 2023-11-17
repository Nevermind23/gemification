package p118i7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i7.a */
public abstract class C6586a implements IInterface {

    /* renamed from: b */
    private final IBinder f20097b;

    /* renamed from: c */
    private final String f20098c;

    protected C6586a(IBinder iBinder, String str) {
        this.f20097b = iBinder;
        this.f20098c = str;
    }

    public final IBinder asBinder() {
        return this.f20097b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo20581k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f20097b.transact(i, parcel, parcel, 0);
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
    public final void mo20582x(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20097b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo20583y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20098c);
        return obtain;
    }
}

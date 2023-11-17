package p092g7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g7.a */
public abstract class C6250a implements IInterface {

    /* renamed from: b */
    private final IBinder f19272b;

    /* renamed from: c */
    private final String f19273c;

    protected C6250a(IBinder iBinder, String str) {
        this.f19272b = iBinder;
        this.f19273c = str;
    }

    public final IBinder asBinder() {
        return this.f19272b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo19863k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f19272b.transact(i, parcel, parcel, 0);
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
    public final Parcel mo19864x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f19273c);
        return obtain;
    }
}

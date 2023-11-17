package p008a7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a7.a */
public abstract class C0062a implements IInterface {

    /* renamed from: b */
    private final IBinder f113b;

    /* renamed from: c */
    private final String f114c = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected C0062a(IBinder iBinder, String str) {
        this.f113b = iBinder;
    }

    public final IBinder asBinder() {
        return this.f113b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo117k() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f114c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo118x(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f113b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}

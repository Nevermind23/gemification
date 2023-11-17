package p157l7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: l7.y */
public abstract class C7012y extends Binder implements IInterface {
    protected C7012y(String str) {
        attachInterface(this, "com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo21123k(int i, Parcel parcel, Parcel parcel2, int i2);

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo21123k(i, parcel, parcel2, i2);
    }
}

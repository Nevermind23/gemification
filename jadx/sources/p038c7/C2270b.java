package p038c7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c7.b */
public abstract class C2270b extends Binder implements IInterface {
    protected C2270b(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo7319k(int i, Parcel parcel, Parcel parcel2, int i2);

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo7319k(i, parcel, parcel2, i2);
    }
}

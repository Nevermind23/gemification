package p131j7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: j7.i */
public abstract class C6746i extends Binder implements IInterface {
    protected C6746i(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo20769k(int i, Parcel parcel, Parcel parcel2, int i2);

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo20769k(i, parcel, parcel2, i2);
    }
}

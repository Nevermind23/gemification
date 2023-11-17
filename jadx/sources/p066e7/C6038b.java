package p066e7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e7.b */
public abstract class C6038b extends Binder implements IInterface {
    protected C6038b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public abstract boolean mo19530A2(int i, Parcel parcel, Parcel parcel2, int i2);

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo19530A2(i, parcel, parcel2, i2);
    }
}

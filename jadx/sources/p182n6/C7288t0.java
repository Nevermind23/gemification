package p182n6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p092g7.C6251b;
import p092g7.C6252c;
import p299w6.C8859b;

/* renamed from: n6.t0 */
public abstract class C7288t0 extends C6251b implements C7255e0 {
    public C7288t0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: x */
    public static C7255e0 m27940x(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C7255e0) {
            return (C7255e0) queryLocalInterface;
        }
        return new C7286s0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo19866k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C8859b b = mo12323b();
            parcel2.writeNoException();
            C6252c.m24823d(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int s = mo12326s();
            parcel2.writeNoException();
            parcel2.writeInt(s);
        }
        return true;
    }
}

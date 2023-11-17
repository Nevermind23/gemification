package p182n6;

import android.os.IBinder;
import android.os.IInterface;
import p092g7.C6251b;

/* renamed from: n6.h0 */
public abstract class C7263h0 extends C6251b implements C7265i0 {
    /* renamed from: x */
    public static C7265i0 m27891x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof C7265i0) {
            return (C7265i0) queryLocalInterface;
        }
        return new C7260g0(iBinder);
    }
}

package p008a7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: a7.e */
public abstract class C0066e extends C0063b implements C0067f {
    /* renamed from: k */
    public static C0067f m209k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof C0067f) {
            return (C0067f) queryLocalInterface;
        }
        return new C0065d(iBinder);
    }
}

package p131j7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: j7.g */
public abstract class C6744g extends C6746i implements C6745h {
    /* renamed from: x */
    public static C6745h m26279x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        if (queryLocalInterface instanceof C6745h) {
            return (C6745h) queryLocalInterface;
        }
        return new C6743f(iBinder);
    }
}

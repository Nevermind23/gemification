package p131j7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: j7.r */
public abstract class C6755r extends C6746i implements C6739b {
    /* renamed from: x */
    public static C6739b m26315x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof C6739b) {
            return (C6739b) queryLocalInterface;
        }
        return new C6754q(iBinder);
    }
}

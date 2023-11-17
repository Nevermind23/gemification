package p131j7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: j7.d */
public abstract class C6741d extends C6746i implements C6742e {
    /* renamed from: x */
    public static C6742e m26275x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        if (queryLocalInterface instanceof C6742e) {
            return (C6742e) queryLocalInterface;
        }
        return new C6740c(iBinder);
    }
}

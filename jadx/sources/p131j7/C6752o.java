package p131j7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: j7.o */
public abstract class C6752o extends C6746i implements C6753p {
    /* renamed from: x */
    public static C6753p m26296x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        if (queryLocalInterface instanceof C6753p) {
            return (C6753p) queryLocalInterface;
        }
        return new C6751n(iBinder);
    }
}

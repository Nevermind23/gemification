package p131j7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: j7.l */
public abstract class C6749l extends C6746i implements C6750m {
    /* renamed from: x */
    public static C6750m m26289x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface instanceof C6750m) {
            return (C6750m) queryLocalInterface;
        }
        return new C6748k(iBinder);
    }
}

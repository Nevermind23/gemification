package p183n7;

import android.os.IBinder;
import android.os.IInterface;
import p118i7.C6602m;

/* renamed from: n7.v */
public abstract class C7335v extends C6602m implements C7336w {
    /* renamed from: x */
    public static C7336w m27987x(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof C7336w) {
            return (C7336w) queryLocalInterface;
        }
        return new C7334u(iBinder);
    }
}

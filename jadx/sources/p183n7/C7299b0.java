package p183n7;

import android.os.IBinder;
import android.os.IInterface;
import p118i7.C6602m;

/* renamed from: n7.b0 */
public abstract class C7299b0 extends C6602m implements C7301c0 {
    /* renamed from: x */
    public static C7301c0 m27964x(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof C7301c0) {
            return (C7301c0) queryLocalInterface;
        }
        return new C7296a0(iBinder);
    }
}

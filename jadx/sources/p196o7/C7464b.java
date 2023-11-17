package p196o7;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p182n6.C7264i;
import p209p7.C7729a;

/* renamed from: o7.b */
public abstract class C7464b {

    /* renamed from: a */
    private static C7729a f21751a;

    /* renamed from: a */
    public static C7463a m28398a(LatLng latLng) {
        C7264i.m27903l(latLng, "latLng must not be null");
        try {
            return new C7463a(m28401d().mo22476C1(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public static C7463a m28399b(LatLng latLng, float f) {
        C7264i.m27903l(latLng, "latLng must not be null");
        try {
            return new C7463a(m28401d().mo22477V0(latLng, f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public static void m28400c(C7729a aVar) {
        f21751a = (C7729a) C7264i.m27902k(aVar);
    }

    /* renamed from: d */
    private static C7729a m28401d() {
        return (C7729a) C7264i.m27903l(f21751a, "CameraUpdateFactory is not initialized");
    }
}

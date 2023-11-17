package p222q7;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p131j7.C6750m;
import p182n6.C7264i;

/* renamed from: q7.b */
public abstract class C7897b {

    /* renamed from: a */
    private static C6750m f22865a;

    /* renamed from: a */
    public static C7896a m29875a(Bitmap bitmap) {
        C7264i.m27903l(bitmap, "image must not be null");
        try {
            return new C7896a(m29878d().mo20772Y(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public static C7896a m29876b(int i) {
        try {
            return new C7896a(m29878d().mo20771J0(i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public static void m29877c(C6750m mVar) {
        if (f22865a == null) {
            f22865a = (C6750m) C7264i.m27903l(mVar, "delegate must not be null");
        }
    }

    /* renamed from: d */
    private static C6750m m29878d() {
        return (C6750m) C7264i.m27903l(f22865a, "IBitmapDescriptorFactory is not initialized");
    }
}

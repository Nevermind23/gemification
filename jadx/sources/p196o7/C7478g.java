package p196o7;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
import p209p7.C7735d;

/* renamed from: o7.g */
public final class C7478g {

    /* renamed from: a */
    private final C7735d f21761a;

    C7478g(C7735d dVar) {
        this.f21761a = dVar;
    }

    /* renamed from: a */
    public VisibleRegion mo21896a() {
        try {
            return this.f21761a.mo22510g0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

package p222q7;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p131j7.C6753p;
import p182n6.C7264i;

/* renamed from: q7.c */
public final class C7898c {

    /* renamed from: a */
    private final C6753p f22866a;

    public C7898c(C6753p pVar) {
        this.f22866a = (C6753p) C7264i.m27902k(pVar);
    }

    /* renamed from: a */
    public void mo22868a(LatLng latLng) {
        try {
            C7264i.m27903l(latLng, "center must not be null.");
            this.f22866a.mo20773A1(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public void mo22869b(double d) {
        try {
            this.f22866a.mo20776h2(d);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7898c)) {
            return false;
        }
        try {
            return this.f22866a.mo20774Y1(((C7898c) obj).f22866a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f22866a.mo20775c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

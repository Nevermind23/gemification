package p222q7;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p131j7.C6742e;
import p182n6.C7264i;

/* renamed from: q7.e */
public final class C7900e {

    /* renamed from: a */
    private final C6742e f22868a;

    public C7900e(C6742e eVar) {
        this.f22868a = (C6742e) C7264i.m27902k(eVar);
    }

    /* renamed from: a */
    public void mo22886a() {
        try {
            this.f22868a.mo20766l();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7900e)) {
            return false;
        }
        try {
            return this.f22868a.mo20765d2(((C7900e) obj).f22868a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f22868a.mo20767u();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

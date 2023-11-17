package p222q7;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p131j7.C6739b;
import p182n6.C7264i;
import p299w6.C8859b;

/* renamed from: q7.d */
public final class C7899d {

    /* renamed from: a */
    private final C6739b f22867a;

    public C7899d(C6739b bVar) {
        this.f22867a = (C6739b) C7264i.m27902k(bVar);
    }

    /* renamed from: a */
    public LatLng mo22872a() {
        try {
            return this.f22867a.mo20755c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public String mo22873b() {
        try {
            return this.f22867a.mo20756e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public String mo22874c() {
        try {
            return this.f22867a.mo20763w();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public boolean mo22875d() {
        try {
            return this.f22867a.mo20758g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public void mo22876e() {
        try {
            this.f22867a.mo20760m();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7899d)) {
            return false;
        }
        try {
            return this.f22867a.mo20753U0(((C7899d) obj).f22867a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public void mo22878f(C7896a aVar) {
        if (aVar == null) {
            try {
                this.f22867a.mo20764z0((C8859b) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f22867a.mo20764z0(aVar.mo22867a());
        }
    }

    /* renamed from: g */
    public void mo22879g(LatLng latLng) {
        if (latLng != null) {
            try {
                this.f22867a.mo20754X0(latLng);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
    }

    /* renamed from: h */
    public void mo22880h(float f) {
        try {
            this.f22867a.mo20751K(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f22867a.mo20762v();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public void mo22882i(String str) {
        try {
            this.f22867a.mo20752K1(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public void mo22883j(String str) {
        try {
            this.f22867a.mo20757f2(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public void mo22884k(float f) {
        try {
            this.f22867a.mo20759l0(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public void mo22885l() {
        try {
            this.f22867a.mo20761r();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

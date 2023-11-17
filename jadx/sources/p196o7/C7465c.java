package p196o7;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.HashMap;
import p131j7.C6739b;
import p182n6.C7264i;
import p209p7.C7731b;
import p209p7.C7734c0;
import p209p7.C7738e0;
import p209p7.C7742g0;
import p209p7.C7743h;
import p209p7.C7745j;
import p209p7.C7749n;
import p209p7.C7751p;
import p209p7.C7761z;
import p222q7.C7898c;
import p222q7.C7899d;
import p222q7.C7900e;

/* renamed from: o7.c */
public class C7465c {

    /* renamed from: a */
    private final C7731b f21752a;

    /* renamed from: b */
    private final HashMap f21753b = new HashMap();

    /* renamed from: c */
    private C7480i f21754c;

    /* renamed from: o7.c$a */
    public interface C7466a {
        /* renamed from: e */
        View mo19080e(C7899d dVar);

        /* renamed from: g */
        View mo19082g(C7899d dVar);
    }

    /* renamed from: o7.c$b */
    public interface C7467b {
        /* renamed from: a */
        void mo171a();
    }

    /* renamed from: o7.c$c */
    public interface C7468c {
        /* renamed from: a */
        void mo21892a();
    }

    /* renamed from: o7.c$d */
    public interface C7469d {
        /* renamed from: a */
        void mo21893a(int i);
    }

    /* renamed from: o7.c$e */
    public interface C7470e {
        /* renamed from: h */
        void mo177h(C7899d dVar);
    }

    /* renamed from: o7.c$f */
    public interface C7471f {
        /* renamed from: a */
        void mo7336a(C7899d dVar);
    }

    /* renamed from: o7.c$g */
    public interface C7472g {
        /* renamed from: b */
        boolean mo172b(C7899d dVar);
    }

    /* renamed from: o7.c$h */
    public interface C7473h {
        /* renamed from: c */
        void mo19078c(C7899d dVar);

        /* renamed from: d */
        void mo19079d(C7899d dVar);

        /* renamed from: f */
        void mo19081f(C7899d dVar);
    }

    public C7465c(C7731b bVar) {
        this.f21752a = (C7731b) C7264i.m27902k(bVar);
    }

    /* renamed from: a */
    public final C7898c mo21872a(CircleOptions circleOptions) {
        try {
            C7264i.m27903l(circleOptions, "CircleOptions must not be null.");
            return new C7898c(this.f21752a.mo22492M(circleOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final C7899d mo21873b(MarkerOptions markerOptions) {
        try {
            C7264i.m27903l(markerOptions, "MarkerOptions must not be null.");
            C6739b c1 = this.f21752a.mo22499c1(markerOptions);
            if (c1 != null) {
                return new C7899d(c1);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final C7900e mo21874c(PolylineOptions polylineOptions) {
        try {
            C7264i.m27903l(polylineOptions, "PolylineOptions must not be null");
            return new C7900e(this.f21752a.mo22505s2(polylineOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final void mo21875d(C7463a aVar) {
        try {
            C7264i.m27903l(aVar, "CameraUpdate must not be null.");
            this.f21752a.mo22493M0(aVar.mo21871a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public final CameraPosition mo21876e() {
        try {
            return this.f21752a.mo22500d0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public final int mo21877f() {
        try {
            return this.f21752a.mo22504n1();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public final C7478g mo21878g() {
        try {
            return new C7478g(this.f21752a.mo22491K0());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public final C7480i mo21879h() {
        try {
            if (this.f21754c == null) {
                this.f21754c = new C7480i(this.f21752a.mo22502i2());
            }
            return this.f21754c;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public final void mo21880i(C7463a aVar) {
        try {
            C7264i.m27903l(aVar, "CameraUpdate must not be null.");
            this.f21752a.mo22494M1(aVar.mo21871a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public final void mo21881j(C7466a aVar) {
        if (aVar == null) {
            try {
                this.f21752a.mo22508z((C7761z) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f21752a.mo22508z(new C7485n(this, aVar));
        }
    }

    /* renamed from: k */
    public boolean mo21882k(MapStyleOptions mapStyleOptions) {
        try {
            return this.f21752a.mo22490I1(mapStyleOptions);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public final void mo21883l(int i) {
        try {
            this.f21752a.mo22506t0(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public final void mo21884m(C7467b bVar) {
        if (bVar == null) {
            try {
                this.f21752a.mo22498V1((C7734c0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f21752a.mo22498V1(new C7488q(this, bVar));
        }
    }

    /* renamed from: n */
    public final void mo21885n(C7468c cVar) {
        if (cVar == null) {
            try {
                this.f21752a.mo22496R((C7738e0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f21752a.mo22496R(new C7487p(this, cVar));
        }
    }

    /* renamed from: o */
    public final void mo21886o(C7469d dVar) {
        if (dVar == null) {
            try {
                this.f21752a.mo22507x0((C7742g0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f21752a.mo22507x0(new C7486o(this, dVar));
        }
    }

    /* renamed from: p */
    public final void mo21887p(C7470e eVar) {
        if (eVar == null) {
            try {
                this.f21752a.mo22497T0((C7743h) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f21752a.mo22497T0(new C7483l(this, eVar));
        }
    }

    /* renamed from: q */
    public final void mo21888q(C7471f fVar) {
        if (fVar == null) {
            try {
                this.f21752a.mo22495O1((C7745j) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f21752a.mo22495O1(new C7484m(this, fVar));
        }
    }

    /* renamed from: r */
    public final void mo21889r(C7472g gVar) {
        if (gVar == null) {
            try {
                this.f21752a.mo22503k2((C7749n) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f21752a.mo22503k2(new C7481j(this, gVar));
        }
    }

    /* renamed from: s */
    public final void mo21890s(C7473h hVar) {
        if (hVar == null) {
            try {
                this.f21752a.mo22501g2((C7751p) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f21752a.mo22501g2(new C7482k(this, hVar));
        }
    }

    /* renamed from: t */
    public final void mo21891t(int i, int i2, int i3, int i4) {
        try {
            this.f21752a.mo22509z1(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

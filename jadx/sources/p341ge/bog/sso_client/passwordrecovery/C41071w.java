package p341ge.bog.sso_client.passwordrecovery;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import gb1.C32388r;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35942i;

/* renamed from: ge.bog.sso_client.passwordrecovery.w */
public final class C41071w {

    /* renamed from: a */
    private final C41010c f96963a;

    /* renamed from: b */
    private final C41006a f96964b;

    /* renamed from: c */
    private final C41012d f96965c;

    /* renamed from: d */
    private final C41008b f96966d;

    /* renamed from: e */
    private final C41070v0 f96967e;

    /* renamed from: f */
    private final C41066t0 f96968f;

    /* renamed from: g */
    private final C41073w0 f96969g;

    /* renamed from: h */
    private final C41068u0 f96970h;

    /* renamed from: i */
    private final C41075x0 f96971i;

    /* renamed from: j */
    private C35942i f96972j = C35942i.UNKNOWN;

    /* renamed from: ge.bog.sso_client.passwordrecovery.w$a */
    public /* synthetic */ class C41072a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f96973a;

        static {
            int[] iArr = new int[C35942i.values().length];
            iArr[C35942i.UNKNOWN.ordinal()] = 1;
            iArr[C35942i.ONBOARDING.ordinal()] = 2;
            f96973a = iArr;
        }
    }

    public C41071w(C41010c cVar) {
        C41536l.m120489i(cVar, "context");
        this.f96963a = cVar;
        this.f96964b = new C41006a(cVar);
        this.f96965c = new C41012d(cVar);
        this.f96966d = new C41008b(cVar);
        this.f96967e = new C41070v0(cVar);
        this.f96968f = new C41066t0(cVar);
        this.f96969g = new C41073w0(cVar);
        this.f96970h = new C41068u0(cVar);
        this.f96971i = new C41075x0(cVar);
    }

    /* renamed from: c */
    private final void m119046c() {
        C41008b bVar;
        C41012d dVar;
        C41066t0 t0Var;
        C41070v0 v0Var;
        C41068u0 u0Var;
        C41073w0 w0Var;
        C41006a aVar = this.f96964b;
        C41075x0 x0Var = null;
        if (this.f96972j.mo88514g()) {
            bVar = this.f96966d;
        } else {
            bVar = null;
        }
        C32388r c = aVar.mo72876c(bVar);
        if (this.f96972j.mo88510b()) {
            dVar = this.f96965c;
        } else {
            dVar = null;
        }
        C32388r c2 = c.mo72876c(dVar);
        if (this.f96972j.mo88512e()) {
            t0Var = this.f96968f;
        } else {
            t0Var = null;
        }
        C32388r c3 = c2.mo72876c(t0Var);
        if (this.f96972j.mo88512e()) {
            v0Var = this.f96967e;
        } else {
            v0Var = null;
        }
        C32388r c4 = c3.mo72876c(v0Var);
        if (this.f96972j.mo88513f()) {
            u0Var = this.f96970h;
        } else {
            u0Var = null;
        }
        C32388r c5 = c4.mo72876c(u0Var);
        if (this.f96972j.mo88513f()) {
            w0Var = this.f96969g;
        } else {
            w0Var = null;
        }
        C32388r c6 = c5.mo72876c(w0Var);
        if (this.f96972j.mo88511c()) {
            x0Var = this.f96971i;
        }
        c6.mo72876c(x0Var);
    }

    /* renamed from: a */
    public final C41010c mo95469a() {
        return this.f96963a;
    }

    /* renamed from: b */
    public final C35942i mo95470b() {
        return this.f96972j;
    }

    /* renamed from: d */
    public final boolean mo95471d() {
        return !C41536l.m120484d(this.f96963a.mo95410b(), this.f96966d);
    }

    /* renamed from: e */
    public final void mo95472e() {
        C32388r b = this.f96963a.mo95410b();
        if (b != null) {
            b.mo72877d();
        }
    }

    /* renamed from: f */
    public final void mo95473f() {
        C32388r b = this.f96963a.mo95410b();
        if (b != null) {
            b.mo72878e(true);
        }
    }

    /* renamed from: g */
    public final void mo95474g(C35942i iVar) {
        C41536l.m120489i(iVar, C11755a.C11756a.f34100b);
        this.f96972j = iVar;
        m119046c();
        int i = C41072a.f96973a[iVar.ordinal()];
        if (i == 1) {
            C32388r.m95640j(this.f96964b, false, 1, (Object) null);
        } else if (i != 2) {
            C32388r.m95640j(this.f96966d, false, 1, (Object) null);
        } else {
            C32388r.m95640j(this.f96965c, false, 1, (Object) null);
        }
    }

    /* renamed from: h */
    public final void mo95475h() {
        m119046c();
        C32388r.m95640j(this.f96964b, false, 1, (Object) null);
    }
}

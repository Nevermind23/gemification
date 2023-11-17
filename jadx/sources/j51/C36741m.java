package j51;

import i51.C36356a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared2.session.SessionManager;
import qd0.C27775b;

/* renamed from: j51.m */
public final class C36741m {

    /* renamed from: a */
    private final C36356a f88639a;

    /* renamed from: b */
    private final C27775b f88640b;

    /* renamed from: c */
    private final SessionManager f88641c;

    public C36741m(C36356a aVar, C27775b bVar, SessionManager sessionManager) {
        C41536l.m120489i(aVar, "ssoRepository");
        C41536l.m120489i(bVar, "dataCleaner");
        C41536l.m120489i(sessionManager, "sessionManager");
        this.f88639a = aVar;
        this.f88640b = bVar;
        this.f88641c = sessionManager;
    }

    /* renamed from: a */
    public final void mo89566a() {
        this.f88641c.mo84764w(false);
        this.f88640b.mo67318a();
        this.f88639a.mo72564i();
    }
}

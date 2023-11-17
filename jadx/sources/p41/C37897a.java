package p41;

import d51.C31539b;
import d51.C31540c;
import kotlin.jvm.internal.C41536l;
import of1.C41866b;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41889f0;
import p341ge.bog.mobilebank.shared2.network.NetworkException;
import p341ge.bog.mobilebank.shared2.session.C34690a;
import p341ge.bog.mobilebank.shared2.session.SessionManager;
import t41.C38639a;

/* renamed from: p41.a */
public final class C37897a implements C41866b {

    /* renamed from: d */
    private final C31540c f90969d;

    /* renamed from: e */
    private final C31539b f90970e;

    /* renamed from: f */
    private final SessionManager f90971f;

    /* renamed from: g */
    private final C38639a f90972g;

    /* renamed from: h */
    private final boolean f90973h;

    public C37897a(C31540c cVar, C31539b bVar, SessionManager sessionManager, C38639a aVar, boolean z) {
        C41536l.m120489i(cVar, "isLoggedIn");
        C41536l.m120489i(bVar, "accessTokenRefresher");
        C41536l.m120489i(sessionManager, "sessionManager");
        C41536l.m120489i(aVar, "paramsProvider");
        this.f90969d = cVar;
        this.f90970e = bVar;
        this.f90971f = sessionManager;
        this.f90972g = aVar;
        this.f90973h = z;
    }

    /* renamed from: a */
    public C41869b0 mo91242a(C41889f0 f0Var, C41880d0 d0Var) {
        C38639a.C38646g gVar;
        C41536l.m120489i(d0Var, "response");
        if (!this.f90969d.invoke()) {
            throw NetworkException.PostLogoutSessionExpiredException.f83828d;
        } else if (C37898b.m111383b(d0Var) > 1) {
            this.f90971f.mo84762t(C34690a.EXPIRED_ON_REMOTE_SERVER);
            throw NetworkException.SessionExpiredException.f83830d;
        } else if (this.f90970e.invoke().mo94899h() == null) {
            if (this.f90973h) {
                gVar = C38639a.C38646g.C38647a.m113286i(this.f90972g.mo92280k(d0Var.mo96742e0()), false, 1, (Object) null);
            } else {
                gVar = C38639a.C38646g.C38647a.m113286i(this.f90972g.mo92279j(d0Var.mo96742e0()), false, 1, (Object) null);
            }
            return (C41869b0) gVar.get();
        } else {
            this.f90971f.mo84762t(C34690a.EXPIRED_ON_REMOTE_SERVER);
            throw NetworkException.SessionExpiredException.f83830d;
        }
    }
}

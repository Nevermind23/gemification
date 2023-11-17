package o41;

import cg1.C40446a;
import d51.C31539b;
import d51.C31540c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41866b;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41913p;
import of1.C41935w;
import of1.C41944z;
import p341ge.bog.mobilebank.shared2.session.SessionManager;
import p41.C37897a;
import q41.C38128a;
import q41.C38129b;
import r41.C38284a;
import s41.C38426a;
import t41.C38639a;
import t41.C38649b;
import v41.C39200a;

/* renamed from: o41.a */
public final class C37627a {

    /* renamed from: a */
    public static final C37627a f90395a = new C37627a();

    /* renamed from: o41.a$a */
    public static final class C37628a implements C41935w {

        /* renamed from: a */
        final /* synthetic */ C38639a f90396a;

        public C37628a(C38639a aVar) {
            this.f90396a = aVar;
        }

        /* renamed from: a */
        public final C41880d0 mo21294a(C41935w.C41936a aVar) {
            C41536l.m120489i(aVar, "chain");
            return aVar.mo97008a((C41869b0) C38649b.m113292a(this.f90396a.mo92279j(aVar.mo97011w())).get());
        }
    }

    /* renamed from: o41.a$b */
    public static final class C37629b implements C41935w {

        /* renamed from: a */
        final /* synthetic */ C38639a f90397a;

        public C37629b(C38639a aVar) {
            this.f90397a = aVar;
        }

        /* renamed from: a */
        public final C41880d0 mo21294a(C41935w.C41936a aVar) {
            C41536l.m120489i(aVar, "chain");
            return aVar.mo97008a((C41869b0) C38649b.m113292a(this.f90397a.mo92280k(aVar.mo97011w())).get());
        }
    }

    private C37627a() {
    }

    /* renamed from: a */
    public final C41866b mo90807a(C31540c cVar, C31539b bVar, SessionManager sessionManager, C38639a aVar) {
        C41536l.m120489i(cVar, "isLoggedIn");
        C41536l.m120489i(bVar, "accessTokenRefresher");
        C41536l.m120489i(sessionManager, "sessionManager");
        C41536l.m120489i(aVar, "paramsProvider");
        return new C37897a(cVar, bVar, sessionManager, aVar, false);
    }

    /* renamed from: b */
    public final C41944z.C41945a mo90808b(C38128a aVar) {
        C41536l.m120489i(aVar, "connectionCheckInterceptor");
        C41944z.C41945a aVar2 = new C41944z.C41945a();
        C41913p pVar = new C41913p();
        pVar.mo96881n(40);
        pVar.mo96880m(40);
        return aVar2.mo97103g(pVar).mo97079O(60, TimeUnit.SECONDS).mo97091a(aVar);
    }

    /* renamed from: c */
    public final C41944z mo90809c(C41944z.C41945a aVar, C38639a aVar2, C41866b bVar, C41935w wVar, C38284a aVar3) {
        C41536l.m120489i(aVar, "builder");
        C41536l.m120489i(aVar2, "paramsProvider");
        C41536l.m120489i(bVar, "accessTokenAuthenticator");
        C41536l.m120489i(aVar3, "responseInterceptor");
        return C38129b.m112246d(aVar.mo97091a(new C37628a(aVar2)).mo97093b(aVar3).mo97095c(bVar), wVar).mo97097d();
    }

    /* renamed from: d */
    public final C41935w mo90810d(C39200a aVar) {
        C41536l.m120489i(aVar, "isHTTPLoggingEnabled");
        if (!aVar.invoke()) {
            return null;
        }
        C40446a aVar2 = new C40446a((C40446a.C40448b) null, 1, (DefaultConstructorMarker) null);
        aVar2.mo94504c(C40446a.C40447a.BODY);
        return aVar2;
    }

    /* renamed from: e */
    public final C41866b mo90811e(C31540c cVar, C31539b bVar, SessionManager sessionManager, C38639a aVar) {
        C41536l.m120489i(cVar, "isLoggedIn");
        C41536l.m120489i(bVar, "accessTokenRefresher");
        C41536l.m120489i(sessionManager, "sessionManager");
        C41536l.m120489i(aVar, "paramsProvider");
        return new C37897a(cVar, bVar, sessionManager, aVar, true);
    }

    /* renamed from: f */
    public final C41944z mo90812f(C41944z.C41945a aVar, C38639a aVar2, C41866b bVar, C41935w wVar, C38426a aVar3) {
        C41536l.m120489i(aVar, "builder");
        C41536l.m120489i(aVar2, "paramsProvider");
        C41536l.m120489i(bVar, "accessTokenAuthenticator");
        C41536l.m120489i(aVar3, "responseInterceptor");
        return C38129b.m112246d(aVar.mo97091a(new C37629b(aVar2)).mo97093b(aVar3).mo97095c(bVar), wVar).mo97097d();
    }
}

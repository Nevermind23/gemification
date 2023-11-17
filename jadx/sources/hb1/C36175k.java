package hb1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import hb1.C36168e;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p114i3.C6526a;
import p204p2.C7664a;
import p204p2.C7667b;
import p204p2.C7671c;
import p217q2.C7842i;
import p217q2.C7843j;
import sso.queery.AuthQuery;
import ue1.C43075l;
import va1.C39311i;

/* renamed from: hb1.k */
public final class C36175k {

    /* renamed from: a */
    private final C7667b f87364a;

    /* renamed from: b */
    private final C39311i f87365b;

    /* renamed from: c */
    private final C40734b f87366c;

    /* renamed from: hb1.k$a */
    static final class C36176a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C36176a f87367d = new C36176a();

        C36176a() {
            super(1);
        }

        /* renamed from: a */
        public final C7671c invoke(C7671c cVar) {
            C41536l.m120489i(cVar, "$this$null");
            return cVar;
        }
    }

    /* renamed from: hb1.k$b */
    static final class C36177b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C36177b f87368d = new C36177b();

        C36177b() {
            super(1);
        }

        /* renamed from: a */
        public final C7671c invoke(C7671c cVar) {
            C41536l.m120489i(cVar, "$this$null");
            return cVar;
        }
    }

    public C36175k(C7667b bVar, C39311i iVar) {
        C41536l.m120489i(bVar, "apolloClient");
        C41536l.m120489i(iVar, "serverEndpointConfig");
        this.f87364a = bVar;
        this.f87365b = iVar;
        C40734b l = C40734b.m117921l(new C36172h(this));
        C41536l.m120488h(l, "defer {\n        createSi…  }.ignoreElement()\n    }");
        this.f87366c = l;
    }

    /* renamed from: f */
    public static /* synthetic */ C40734b m107582f(C36175k kVar, C7842i iVar, boolean z, C43075l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            lVar = C36176a.f87367d;
        }
        return kVar.mo88927e(iVar, z, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C40754t m107583h(C36175k kVar, C7842i iVar, C43075l lVar) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(iVar, "$query");
        C41536l.m120489i(lVar, "$configure");
        C7671c c = kVar.f87364a.mo22372c(iVar);
        C41536l.m120485e(c, "query(query)");
        C40749p c2 = C6526a.m25796c((C7664a) lVar.invoke(c));
        C41536l.m120485e(c2, "Rx2Apollo.from(this)");
        return c2.mo95025j0(new C36163a());
    }

    /* renamed from: j */
    public static /* synthetic */ C40762x m107584j(C36175k kVar, C7842i iVar, boolean z, C43075l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            lVar = C36177b.f87368d;
        }
        return kVar.mo88929i(iVar, z, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C40739f m107585k(C36175k kVar) {
        C41536l.m120489i(kVar, "this$0");
        return m107584j(kVar, new AuthQuery(kVar.f87365b.mo92939a(), kVar.f87365b.mo92940b()), false, (C43075l) null, 4, (Object) null).mo95062A(new C36173i()).mo95084m(new C36174j()).mo95092y();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final String m107586l(C7843j jVar) {
        String str;
        AuthQuery.Auth auth;
        C41536l.m120489i(jVar, "it");
        AuthQuery.Data data = (AuthQuery.Data) jVar.mo22784b();
        if (data == null || (auth = data.getAuth()) == null) {
            str = null;
        } else {
            str = auth.getToken();
        }
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Invalid token".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m107587m(String str) {
        C10146d0.C10159c.m37143b().setSsoToken$sso_client_release(str);
    }

    /* renamed from: e */
    public final C40734b mo88927e(C7842i iVar, boolean z, C43075l lVar) {
        C41536l.m120489i(iVar, "query");
        C41536l.m120489i(lVar, "configure");
        C40734b v = C40734b.m117926v(mo88928g(iVar, z, lVar));
        C41536l.m120488h(v, "fromObservable(createQue…RefreshToken, configure))");
        return v;
    }

    /* renamed from: g */
    public final C40749p mo88928g(C7842i iVar, boolean z, C43075l lVar) {
        C41536l.m120489i(iVar, "query");
        C41536l.m120489i(lVar, "configure");
        C40749p v = C40749p.m118055v(new C36171g(this, iVar, lVar));
        C41536l.m120488h(v, "defer {\n            apol…ableOperator())\n        }");
        if (!z) {
            return v;
        }
        C40749p p = v.mo95028p(new C36168e.C36169a(this.f87366c, v));
        C41536l.m120488h(p, "{\n            querySourc…)\n            )\n        }");
        return p;
    }

    /* renamed from: i */
    public final C40762x mo88929i(C7842i iVar, boolean z, C43075l lVar) {
        C41536l.m120489i(iVar, "query");
        C41536l.m120489i(lVar, "configure");
        C40762x w = C40762x.m118161w(mo88928g(iVar, z, lVar));
        C41536l.m120488h(w, "fromObservable(createQue…RefreshToken, configure))");
        return w;
    }
}

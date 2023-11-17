package dd1;

import ba1.C10146d0;
import ed1.C40735b0;
import ed1.C40762x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.sso_client.models.C35933a;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.Session;
import qa1.C27714f;
import ue1.C43075l;

/* renamed from: dd1.m0 */
public final class C40556m0 {

    /* renamed from: a */
    private final C27714f f96161a;

    /* renamed from: dd1.m0$a */
    static final class C40557a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35933a f96162d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40557a(C35933a aVar) {
            super(1);
            this.f96162d = aVar;
        }

        /* renamed from: a */
        public final void mo94586a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            C35933a aVar = this.f96162d;
            C41536l.m120488h(aVar, "accessToken");
            session.put$sso_client_release(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94586a((Session) obj);
            return C41238w.f97225a;
        }
    }

    public C40556m0(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96161a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final String m117323e() {
        String a = C10146d0.C10175f.m37216a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40735b0 m117324f(C40556m0 m0Var, String str) {
        C41536l.m120489i(m0Var, "this$0");
        C41536l.m120489i(str, "processReference");
        return m0Var.f96161a.mo67263b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m117325g(C35933a aVar) {
        C35962r.m107005c(C10146d0.C10159c.m37143b(), new C40557a(aVar));
    }

    /* renamed from: d */
    public final C40762x mo94585d() {
        C40762x m = C40762x.m118160v(new C40538j0()).mo95087r(new C40544k0(this)).mo95084m(new C40550l0());
        C41536l.m120488h(m, "fromCallable {\n         …(accessToken) }\n        }");
        return m;
    }
}

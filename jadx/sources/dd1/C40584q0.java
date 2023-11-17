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

/* renamed from: dd1.q0 */
public final class C40584q0 {

    /* renamed from: a */
    private final C27714f f96202a;

    /* renamed from: dd1.q0$a */
    static final class C40585a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35933a f96203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40585a(C35933a aVar) {
            super(1);
            this.f96203d = aVar;
        }

        /* renamed from: a */
        public final void mo94601a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            C35933a aVar = this.f96203d;
            C41536l.m120488h(aVar, "accessToken");
            session.put$sso_client_release(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94601a((Session) obj);
            return C41238w.f97225a;
        }
    }

    public C40584q0(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96202a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final String m117372e() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40735b0 m117373f(C40584q0 q0Var, String str) {
        C41536l.m120489i(q0Var, "this$0");
        C41536l.m120489i(str, "processReference");
        return q0Var.f96202a.mo67263b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m117374g(C35933a aVar) {
        C35962r.m107005c(C10146d0.C10159c.m37143b(), new C40585a(aVar));
    }

    /* renamed from: d */
    public final C40762x mo94600d() {
        C40762x m = C40762x.m118160v(new C40564n0()).mo95087r(new C40570o0(this)).mo95084m(new C40577p0());
        C41536l.m120488h(m, "fromCallable {\n         …(accessToken) }\n        }");
        return m;
    }
}

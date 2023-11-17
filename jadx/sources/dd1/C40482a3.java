package dd1;

import ba1.C10146d0;
import ed1.C40735b0;
import ed1.C40762x;
import he1.C41224m;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.sso_client.models.C35933a;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.Session;
import qa1.C27714f;
import ue1.C43075l;

/* renamed from: dd1.a3 */
public final class C40482a3 {

    /* renamed from: a */
    private final C27714f f96060a;

    /* renamed from: dd1.a3$a */
    static final class C40483a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35933a f96061d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40483a(C35933a aVar) {
            super(1);
            this.f96061d = aVar;
        }

        /* renamed from: a */
        public final void mo94536a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            C35933a aVar = this.f96061d;
            C41536l.m120488h(aVar, "accessToken");
            session.put$sso_client_release(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94536a((Session) obj);
            return C41238w.f97225a;
        }
    }

    public C40482a3(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96060a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C41224m m117214e() {
        String refreshToken$sso_client_release = C10146d0.C10159c.m37143b().getRefreshToken$sso_client_release();
        if (refreshToken$sso_client_release != null) {
            String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
            if (processReference$sso_client_release != null) {
                return new C41224m(refreshToken$sso_client_release, processReference$sso_client_release);
            }
            throw new IllegalStateException("Invalid processReference".toString());
        }
        throw new IllegalStateException("Invalid refreshToken".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40735b0 m117215f(C40482a3 a3Var, C41224m mVar) {
        C41536l.m120489i(a3Var, "this$0");
        C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
        String str = (String) mVar.mo95676b();
        return a3Var.f96060a.mo67283v(str, (String) mVar.mo95675a());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m117216g(C35933a aVar) {
        C35962r.m107005c(C10146d0.C10159c.m37143b(), new C40483a(aVar));
    }

    /* renamed from: d */
    public final C40762x mo94535d() {
        C40762x m = C40762x.m118160v(new C40628x2()).mo95087r(new C40633y2(this)).mo95084m(new C40638z2());
        C41536l.m120488h(m, "fromCallable {\n         …(accessToken) }\n        }");
        return m;
    }
}

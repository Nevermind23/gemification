package dd1;

import ba1.C10146d0;
import ed1.C40734b;
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

/* renamed from: dd1.i0 */
public final class C40531i0 {

    /* renamed from: a */
    private final C27714f f96121a;

    /* renamed from: dd1.i0$a */
    static final class C40532a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35933a f96122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40532a(C35933a aVar) {
            super(1);
            this.f96122d = aVar;
        }

        /* renamed from: a */
        public final void mo94568a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            C35933a aVar = this.f96122d;
            C41536l.m120488h(aVar, "accessToken");
            session.put$sso_client_release(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94568a((Session) obj);
            return C41238w.f97225a;
        }
    }

    public C40531i0(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96121a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final String m117280e() {
        String b = C10146d0.C10176g.m37221b();
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40735b0 m117281f(C40531i0 i0Var, String str) {
        C41536l.m120489i(i0Var, "this$0");
        C41536l.m120489i(str, "processReference");
        return i0Var.f96121a.mo67263b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m117282g(C35933a aVar) {
        C35962r.m107005c(C10146d0.C10159c.m37143b(), new C40532a(aVar));
    }

    /* renamed from: d */
    public final C40734b mo94567d() {
        C40734b y = C40762x.m118160v(new C40513f0()).mo95087r(new C40519g0(this)).mo95084m(new C40525h0()).mo95092y();
        C41536l.m120488h(y, "fromCallable {\n         …         .ignoreElement()");
        return y;
    }
}

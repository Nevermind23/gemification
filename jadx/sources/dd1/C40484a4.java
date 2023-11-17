package dd1;

import ba1.C10146d0;
import ed1.C40735b0;
import ed1.C40762x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.C35963s;
import p341ge.bog.sso_client.models.Session;
import qa1.C27714f;
import sso.type.AuthElementType;
import ue1.C43075l;

/* renamed from: dd1.a4 */
public final class C40484a4 {

    /* renamed from: a */
    private final C27714f f96062a;

    /* renamed from: dd1.a4$a */
    static final class C40485a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35963s f96063d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40485a(C35963s sVar) {
            super(1);
            this.f96063d = sVar;
        }

        /* renamed from: a */
        public final void mo94538a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setAvailableAuthTypes$sso_client_release(C41361y0.m120041m(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.TRUSTED_DEVICE));
            if (this.f96063d.mo88555a() != null) {
                session.setBiometricToken$sso_client_release(this.f96063d.mo88555a());
                session.setAvailableAuthTypes$sso_client_release(C41361y0.m120041m(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.BIOMETRY));
            }
            if (this.f96063d.mo88556b() != null) {
                session.setPassCodeToken$sso_client_release(this.f96063d.mo88556b());
                session.setAvailableAuthTypes$sso_client_release(C41361y0.m120041m(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.PASSCODE));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94538a((Session) obj);
            return C41238w.f97225a;
        }
    }

    public C40484a4(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96062a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final String m117222e() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40735b0 m117223f(C40484a4 a4Var, boolean z, String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(a4Var, "this$0");
        C41536l.m120489i(str, "$operationId");
        C41536l.m120489i(str2, "$operationReference");
        C41536l.m120489i(str4, "$scaAuthCode");
        C41536l.m120489i(str5, "processReference");
        return a4Var.f96062a.mo67276o(z, str, str2, str3, str5, str4);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m117224g(C35963s sVar) {
        C35962r.m107005c(C10146d0.C10159c.m37143b(), new C40485a(sVar));
    }

    /* renamed from: d */
    public final C40762x mo94537d(boolean z, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str4, "scaAuthCode");
        C40762x m = C40762x.m118160v(new C40629x3()).mo95087r(new C40634y3(this, z, str, str2, str3, str4)).mo95084m(new C40639z3());
        C41536l.m120488h(m, "fromCallable {\n         …          }\n            }");
        return m;
    }
}

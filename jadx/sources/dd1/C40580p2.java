package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40762x;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35939g;
import p341ge.bog.sso_client.models.Session;
import qa1.C27700a1;
import qa1.C27714f;
import sso.type.AuthElementType;

/* renamed from: dd1.p2 */
public final class C40580p2 {

    /* renamed from: a */
    private final C27714f f96195a;

    /* renamed from: b */
    private final C40597s0 f96196b;

    /* renamed from: c */
    private final C27700a1 f96197c;

    public C40580p2(C27714f fVar, C40597s0 s0Var, C27700a1 a1Var) {
        C41536l.m120489i(fVar, "loginRepository");
        C41536l.m120489i(s0Var, "getAuthTokenUseCase");
        C41536l.m120489i(a1Var, "storage");
        this.f96195a = fVar;
        this.f96196b = s0Var;
        this.f96197c = a1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final Session m117358e(String str, boolean z) {
        C41536l.m120489i(str, "$userName");
        return C10146d0.C10159c.f28157a.mo26691f(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40735b0 m117359f(C40580p2 p2Var, String str, String str2, Session session) {
        C41536l.m120489i(p2Var, "this$0");
        C41536l.m120489i(str, "$userName");
        C41536l.m120489i(str2, "$password");
        C41536l.m120489i(session, "it");
        C40734b b = p2Var.f96196b.mo94610b();
        C27714f fVar = p2Var.f96195a;
        Set<AuthElementType> availableAuthTypes$sso_client_release = C10146d0.C10159c.m37143b().getAvailableAuthTypes$sso_client_release();
        boolean z = false;
        if (availableAuthTypes$sso_client_release != null && availableAuthTypes$sso_client_release.contains(AuthElementType.TRUSTED_DEVICE)) {
            z = true;
        }
        return b.mo94898g(fVar.mo67269h(str, str2, z, C10146d0.C10177h.m37232a()).mo95084m(new C40572o2()));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m117360g(C35939g gVar) {
        Session b = C10146d0.C10159c.m37143b();
        C41536l.m120488h(gVar, "logInInfo");
        b.put$sso_client_release(gVar);
    }

    /* renamed from: d */
    public final C40762x mo94597d(String str, String str2, boolean z) {
        C41536l.m120489i(str, "userName");
        C41536l.m120489i(str2, "password");
        C40762x r = C40762x.m118160v(new C40559m2(str, z)).mo95087r(new C40566n2(this, str, str2));
        C41536l.m120488h(r, "fromCallable {\n         …             })\n        }");
        return r;
    }
}

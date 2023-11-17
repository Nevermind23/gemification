package dd1;

import ed1.C40734b;
import ed1.C40739f;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35933a;

/* renamed from: dd1.a0 */
public final class C40479a0 {

    /* renamed from: a */
    private final C40556m0 f96056a;

    /* renamed from: b */
    private final C40606t3 f96057b;

    public C40479a0(C40556m0 m0Var, C40606t3 t3Var) {
        C41536l.m120489i(m0Var, "getAndStoreAccessTokenUseCase");
        C41536l.m120489i(t3Var, "saveUserOnDeviceUseCase");
        this.f96056a = m0Var;
        this.f96057b = t3Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C40739f m117207c(boolean z, C40479a0 a0Var, C35933a aVar) {
        C41536l.m120489i(a0Var, "this$0");
        C41536l.m120489i(aVar, "accessTokens");
        if (z) {
            return a0Var.f96057b.mo94617c(aVar.mo88459b());
        }
        return C40734b.m117918i();
    }

    /* renamed from: b */
    public final C40734b mo94532b(boolean z) {
        C40734b s = this.f96056a.mo94585d().mo95088s(new C40635z(z, this));
        C41536l.m120488h(s, "getAndStoreAccessTokenUs…          }\n            }");
        return s;
    }
}

package dd1;

import ed1.C40734b;
import ed1.C40736c;
import ed1.C40739f;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35933a;

/* renamed from: dd1.y */
public final class C40630y {

    /* renamed from: a */
    private final C40590r f96252a;

    /* renamed from: b */
    private final C40584q0 f96253b;

    /* renamed from: c */
    private final C40606t3 f96254c;

    public C40630y(C40590r rVar, C40584q0 q0Var, C40606t3 t3Var) {
        C41536l.m120489i(rVar, "chooseRelatedCompanyUseCase");
        C41536l.m120489i(q0Var, "getAndStoreAccessTokenUseCase");
        C41536l.m120489i(t3Var, "saveUserOnDeviceUseCase");
        this.f96252a = rVar;
        this.f96253b = q0Var;
        this.f96254c = t3Var;
    }

    /* renamed from: d */
    public static /* synthetic */ C40734b m117445d(C40630y yVar, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 8) != 0) {
            z3 = false;
        }
        return yVar.mo94632c(str, z, z2, z3);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m117446e(C40736c cVar) {
        C41536l.m120489i(cVar, "it");
        cVar.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40739f m117447f(boolean z, C40630y yVar, C35933a aVar) {
        C41536l.m120489i(yVar, "this$0");
        C41536l.m120489i(aVar, "accessTokens");
        if (z) {
            return yVar.f96254c.mo94617c(aVar.mo88459b());
        }
        return C40734b.m117918i();
    }

    /* renamed from: c */
    public final C40734b mo94632c(String str, boolean z, boolean z2, boolean z3) {
        C40734b bVar;
        C41536l.m120489i(str, "clientKey");
        if (z2) {
            bVar = this.f96252a.mo94606d(str, z);
        } else {
            bVar = C40734b.m117920k(new C40620w());
        }
        C40734b d = bVar.mo94895d(this.f96253b.mo94600d().mo95088s(new C40625x(z3, this)));
        C41536l.m120488h(d, "if (chooseCompany) {\n   …}\n            }\n        )");
        return d;
    }
}

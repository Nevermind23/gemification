package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40749p;
import he1.C41224m;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.v4 */
public final class C40619v4 {

    /* renamed from: a */
    private final C27714f f96244a;

    public C40619v4(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96244a = fVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C40734b m117422d(C40619v4 v4Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return v4Var.mo94624c(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C41224m m117423e(String str) {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return new C41224m(processReference$sso_client_release, str);
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40739f m117424f(C40619v4 v4Var, String str, C41224m mVar) {
        C41536l.m120489i(v4Var, "this$0");
        C41536l.m120489i(str, "$password");
        C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
        return v4Var.f96244a.mo67281t(str, (String) mVar.mo95675a(), (String) mVar.mo95676b());
    }

    /* renamed from: c */
    public final C40734b mo94624c(String str, String str2) {
        C41536l.m120489i(str, "password");
        C40734b U = C40749p.m118031Z(new C40607t4(str2)).mo95006U(new C40613u4(this, str));
        C41536l.m120488h(U, "fromCallable {\n         …mpanyClientKey)\n        }");
        return U;
    }
}

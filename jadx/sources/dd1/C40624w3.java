package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import he1.C41224m;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.w3 */
public final class C40624w3 {

    /* renamed from: a */
    private final C27714f f96247a;

    public C40624w3(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96247a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C41224m m117439d() {
        String username = C10146d0.C10159c.m37143b().getUsername();
        if (username != null) {
            String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
            if (processReference$sso_client_release != null) {
                return new C41224m(username, processReference$sso_client_release);
            }
            throw new IllegalStateException("Invalid processReference".toString());
        }
        throw new IllegalStateException("Invalid username".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40739f m117440e(C40624w3 w3Var, String str, C41224m mVar) {
        C41536l.m120489i(w3Var, "this$0");
        C41536l.m120489i(str, "$passCode");
        C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
        return w3Var.f96247a.mo67278q(str, (String) mVar.mo95675a(), (String) mVar.mo95676b());
    }

    /* renamed from: c */
    public final C40734b mo94628c(String str) {
        C41536l.m120489i(str, "passCode");
        C40734b s = C40762x.m118160v(new C40612u3()).mo95088s(new C40618v3(this, str));
        C41536l.m120488h(s, "fromCallable {\n         …ocessReference)\n        }");
        return s;
    }
}

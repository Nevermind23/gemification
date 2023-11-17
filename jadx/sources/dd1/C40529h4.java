package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.h4 */
public final class C40529h4 {

    /* renamed from: a */
    private final C27714f f96119a;

    public C40529h4(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96119a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117273d() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40739f m117274e(C40529h4 h4Var, String str, String str2) {
        C41536l.m120489i(h4Var, "this$0");
        C41536l.m120489i(str, "$deviceId");
        C41536l.m120489i(str2, "processReference");
        return h4Var.f96119a.mo67286y(str, str2);
    }

    /* renamed from: c */
    public final C40734b mo94565c(String str) {
        C41536l.m120489i(str, "deviceId");
        C40734b s = C40762x.m118160v(new C40517f4()).mo95088s(new C40523g4(this, str));
        C41536l.m120488h(s, "fromCallable {\n         …e\n            )\n        }");
        return s;
    }
}

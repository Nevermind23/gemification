package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.w2 */
public final class C40623w2 {

    /* renamed from: a */
    private final C27714f f96246a;

    public C40623w2(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96246a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117434d() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40739f m117435e(C40623w2 w2Var, String str) {
        C41536l.m120489i(w2Var, "this$0");
        C41536l.m120489i(str, "processReference");
        return w2Var.f96246a.mo67282u(str);
    }

    /* renamed from: c */
    public final C40734b mo94627c() {
        C40734b s = C40762x.m118160v(new C40611u2()).mo95088s(new C40617v2(this));
        C41536l.m120488h(s, "fromCallable {\n         …,\n            )\n        }");
        return s;
    }
}

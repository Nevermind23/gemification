package dd1;

import ba1.C10146d0;
import ed1.C40735b0;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.y1 */
public final class C40632y1 {

    /* renamed from: a */
    private final C27714f f96256a;

    public C40632y1(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96256a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117452d() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40735b0 m117453e(C40632y1 y1Var, String str) {
        C41536l.m120489i(y1Var, "this$0");
        C41536l.m120489i(str, "processReference");
        return y1Var.f96256a.mo67275n(str);
    }

    /* renamed from: c */
    public final C40762x mo94634c() {
        C40762x r = C40762x.m118160v(new C40622w1()).mo95087r(new C40627x1(this));
        C41536l.m120488h(r, "fromCallable {\n         …ocessReference)\n        }");
        return r;
    }
}

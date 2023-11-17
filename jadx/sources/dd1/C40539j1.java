package dd1;

import ba1.C10146d0;
import ed1.C40735b0;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import qa1.C27700a1;
import qa1.C27714f;

/* renamed from: dd1.j1 */
public final class C40539j1 {

    /* renamed from: a */
    private final C27700a1 f96135a;

    /* renamed from: b */
    private final C27714f f96136b;

    public C40539j1(C27700a1 a1Var, C27714f fVar) {
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(fVar, "loginRepository");
        this.f96135a = a1Var;
        this.f96136b = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117306d() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40735b0 m117307e(C40539j1 j1Var, String str) {
        C41536l.m120489i(j1Var, "this$0");
        C41536l.m120489i(str, "processReference");
        return j1Var.f96136b.mo67274m(str);
    }

    /* renamed from: c */
    public final C40762x mo94575c() {
        C40762x r = C40762x.m118160v(new C40526h1()).mo95087r(new C40533i1(this));
        C41536l.m120488h(r, "fromCallable {\n         …ocessReference)\n        }");
        return r;
    }
}

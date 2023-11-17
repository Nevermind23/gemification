package dd1;

import ba1.C10146d0;
import ed1.C40735b0;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.v1 */
public final class C40616v1 {

    /* renamed from: a */
    private final C27714f f96240a;

    public C40616v1(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96240a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117417d() {
        String a = C10146d0.C10175f.m37216a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40735b0 m117418e(C40616v1 v1Var, String str) {
        C41536l.m120489i(v1Var, "this$0");
        C41536l.m120489i(str, "processReference");
        return v1Var.f96240a.mo67275n(str);
    }

    /* renamed from: c */
    public final C40762x mo94623c() {
        C40762x r = C40762x.m118160v(new C40604t1()).mo95087r(new C40610u1(this));
        C41536l.m120488h(r, "fromCallable {\n         …ocessReference)\n        }");
        return r;
    }
}

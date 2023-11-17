package dd1;

import ba1.C10146d0;
import ed1.C40735b0;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.s1 */
public final class C40598s1 {

    /* renamed from: a */
    private final C27714f f96217a;

    public C40598s1(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96217a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117392d() {
        String b = C10146d0.C10176g.m37221b();
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40735b0 m117393e(C40598s1 s1Var, String str, String str2) {
        C41536l.m120489i(s1Var, "this$0");
        C41536l.m120489i(str, "$preselected");
        C41536l.m120489i(str2, "processReference");
        return s1Var.f96217a.mo67259B(str, str2);
    }

    /* renamed from: c */
    public final C40762x mo94611c(String str) {
        C41536l.m120489i(str, "preselected");
        C40762x r = C40762x.m118160v(new C40586q1()).mo95087r(new C40592r1(this, str));
        C41536l.m120488h(r, "fromCallable {\n         …ocessReference)\n        }");
        return r;
    }
}

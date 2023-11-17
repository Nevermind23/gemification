package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40749p;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.s4 */
public final class C40601s4 {

    /* renamed from: a */
    private final C27714f f96223a;

    public C40601s4(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96223a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117397d() {
        String a = C10146d0.C10175f.m37216a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40739f m117398e(C40601s4 s4Var, String str, String str2) {
        C41536l.m120489i(s4Var, "this$0");
        C41536l.m120489i(str, "$password");
        C41536l.m120489i(str2, "processReference");
        return C27714f.C27715a.m85773b(s4Var.f96223a, str, str2, (String) null, 4, (Object) null);
    }

    /* renamed from: c */
    public final C40734b mo94612c(String str) {
        C41536l.m120489i(str, "password");
        C40734b U = C40749p.m118031Z(new C40589q4()).mo95006U(new C40595r4(this, str));
        C41536l.m120488h(U, "fromCallable {\n         …ocessReference)\n        }");
        return U;
    }
}

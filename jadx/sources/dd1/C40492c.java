package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.c */
public final class C40492c {

    /* renamed from: a */
    private final C27714f f96071a;

    public C40492c(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96071a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117232d() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40739f m117233e(C40492c cVar, String str) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(str, "processReference");
        return cVar.f96071a.mo67258A(str);
    }

    /* renamed from: c */
    public final C40734b mo94542c() {
        C40734b s = C40762x.m118160v(new C40478a()).mo95088s(new C40486b(this));
        C41536l.m120488h(s, "fromCallable {\n         …ocessReference)\n        }");
        return s;
    }
}

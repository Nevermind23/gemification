package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.m4 */
public final class C40561m4 {

    /* renamed from: a */
    private final C27714f f96167a;

    public C40561m4(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96167a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117335d() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40739f m117336e(C40561m4 m4Var, String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(m4Var, "this$0");
        C41536l.m120489i(str, "$operationId");
        C41536l.m120489i(str2, "$operationReference");
        C41536l.m120489i(str3, "$password");
        C41536l.m120489i(str4, "$scaAuthCode");
        C41536l.m120489i(str5, "processReference");
        return m4Var.f96167a.mo67273l(str, str2, str3, str5, str4);
    }

    /* renamed from: c */
    public final C40734b mo94589c(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "password");
        C41536l.m120489i(str4, "scaAuthCode");
        C40734b s = C40762x.m118160v(new C40548k4()).mo95088s(new C40554l4(this, str, str2, str3, str4));
        C41536l.m120488h(s, "fromCallable {\n         …,\n            )\n        }");
        return s;
    }
}

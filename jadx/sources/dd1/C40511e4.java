package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.e4 */
public final class C40511e4 {

    /* renamed from: a */
    private final C27714f f96103a;

    public C40511e4(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96103a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117255d() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40739f m117256e(C40511e4 e4Var, String str, BigDecimal bigDecimal, boolean z, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(e4Var, "this$0");
        C41536l.m120489i(str, "$deviceId");
        C41536l.m120489i(bigDecimal, "$deviceReference");
        C41536l.m120489i(str2, "$operationId");
        C41536l.m120489i(str3, "$operationReference");
        String str6 = str4;
        C41536l.m120489i(str6, "$scaAuthCode");
        String str7 = str5;
        C41536l.m120489i(str7, "processReference");
        return e4Var.f96103a.mo67260C(str, bigDecimal, z, str2, str3, str7, str6);
    }

    /* renamed from: c */
    public final C40734b mo94554c(String str, BigDecimal bigDecimal, boolean z, String str2, String str3, String str4) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(bigDecimal, "deviceReference");
        C41536l.m120489i(str2, "operationId");
        C41536l.m120489i(str3, "operationReference");
        String str5 = str4;
        C41536l.m120489i(str5, "scaAuthCode");
        C40734b s = C40762x.m118160v(new C40497c4()).mo95088s(new C40503d4(this, str, bigDecimal, z, str2, str3, str5));
        C41536l.m120488h(s, "fromCallable {\n         …,\n            )\n        }");
        return s;
    }
}

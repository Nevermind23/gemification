package dd1;

import ed1.C40735b0;
import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import qa1.C27700a1;
import qa1.C27752w0;

/* renamed from: dd1.t2 */
public final class C40605t2 {

    /* renamed from: a */
    private final C27752w0 f96226a;

    /* renamed from: b */
    private final C27700a1 f96227b;

    public C40605t2(C27752w0 w0Var, C27700a1 a1Var) {
        C41536l.m120489i(w0Var, "scaVerificationRepository");
        C41536l.m120489i(a1Var, "storage");
        this.f96226a = w0Var;
        this.f96227b = a1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final Long m117404d(C40605t2 t2Var) {
        C41536l.m120489i(t2Var, "this$0");
        DeviceIdentifier c = t2Var.f96227b.mo67242c();
        if (c != null) {
            return c.getDeviceId();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40735b0 m117405e(C40605t2 t2Var, String str, List list, boolean z, Long l) {
        C41536l.m120489i(t2Var, "this$0");
        C41536l.m120489i(str, "$operationReference");
        C41536l.m120489i(list, "$authElements");
        C41536l.m120489i(l, "deviceId");
        return t2Var.f96226a.mo67303a(String.valueOf(l.longValue()), str, list, z);
    }

    /* renamed from: c */
    public final C40762x mo94616c(String str, List list, boolean z) {
        C41536l.m120489i(str, "operationReference");
        C41536l.m120489i(list, "authElements");
        C40762x r = C40762x.m118160v(new C40593r2(this)).mo95087r(new C40599s2(this, str, list, z));
        C41536l.m120488h(r, "fromCallable {\n        s…Signature\n        )\n    }");
        return r;
    }
}

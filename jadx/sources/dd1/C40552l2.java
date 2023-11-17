package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40762x;
import he1.C41232r;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35939g;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p341ge.bog.sso_client.models.Session;
import qa1.C27700a1;
import qa1.C27714f;
import sso.type.AuthElementType;

/* renamed from: dd1.l2 */
public final class C40552l2 {

    /* renamed from: a */
    private final C27700a1 f96147a;

    /* renamed from: b */
    private final C27714f f96148b;

    /* renamed from: c */
    private final C40597s0 f96149c;

    public C40552l2(C27700a1 a1Var, C27714f fVar, C40597s0 s0Var) {
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(fVar, "loginRepository");
        C41536l.m120489i(s0Var, "getAuthTokenUseCase");
        this.f96147a = a1Var;
        this.f96148b = fVar;
        this.f96149c = s0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C41232r m117316e(C40552l2 l2Var) {
        String str;
        C41536l.m120489i(l2Var, "this$0");
        DeviceIdentifier c = l2Var.f96147a.mo67242c();
        if (c != null) {
            str = c.getExtCustomerId();
        } else {
            str = null;
        }
        if (str != null) {
            String username = C10146d0.C10159c.m37143b().getUsername();
            if (username != null) {
                String passCodeToken$sso_client_release = C10146d0.C10159c.m37143b().getPassCodeToken$sso_client_release();
                if (passCodeToken$sso_client_release != null) {
                    return new C41232r(str, username, passCodeToken$sso_client_release);
                }
                throw new IllegalStateException("Invalid token".toString());
            }
            throw new IllegalStateException("Invalid username".toString());
        }
        throw new IllegalStateException("Invalid extCustomerId".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40735b0 m117317f(C40552l2 l2Var, String str, C41232r rVar) {
        boolean z;
        C41536l.m120489i(l2Var, "this$0");
        C41536l.m120489i(str, "$passCode");
        C41536l.m120489i(rVar, "<name for destructuring parameter 0>");
        String str2 = (String) rVar.mo95688a();
        String str3 = (String) rVar.mo95689b();
        String str4 = (String) rVar.mo95690c();
        C40734b b = l2Var.f96149c.mo94610b();
        C27714f fVar = l2Var.f96148b;
        Set<AuthElementType> availableAuthTypes$sso_client_release = C10146d0.C10159c.m37143b().getAvailableAuthTypes$sso_client_release();
        if (availableAuthTypes$sso_client_release == null || !availableAuthTypes$sso_client_release.contains(AuthElementType.TRUSTED_DEVICE)) {
            z = false;
        } else {
            z = true;
        }
        return b.mo94898g(fVar.mo67268g(str2, str, str3, str4, z, C10146d0.C10177h.m37232a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m117318g(C35939g gVar) {
        Session b = C10146d0.C10159c.m37143b();
        C41536l.m120488h(gVar, "logInInfo");
        b.put$sso_client_release(gVar);
    }

    /* renamed from: d */
    public final C40762x mo94584d(String str) {
        C41536l.m120489i(str, "passCode");
        C40762x m = C40762x.m118160v(new C40534i2(this)).mo95087r(new C40540j2(this, str)).mo95084m(new C40546k2());
        C41536l.m120488h(m, "fromCallable {\n         ….put(logInInfo)\n        }");
        return m;
    }
}

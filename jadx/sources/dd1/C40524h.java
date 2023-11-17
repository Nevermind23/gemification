package dd1;

import ba1.C10146d0;
import ed1.C40762x;
import he1.C41232r;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35939g;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p341ge.bog.sso_client.models.Session;
import qa1.C27700a1;
import qa1.C27714f;

/* renamed from: dd1.h */
public final class C40524h {

    /* renamed from: a */
    private final C27700a1 f96114a;

    /* renamed from: b */
    private final C27714f f96115b;

    /* renamed from: c */
    private final C40597s0 f96116c;

    public C40524h(C27700a1 a1Var, C27714f fVar, C40597s0 s0Var) {
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(fVar, "loginRepository");
        C41536l.m120489i(s0Var, "getAuthTokenUseCase");
        this.f96114a = a1Var;
        this.f96115b = fVar;
        this.f96116c = s0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C41232r m117265e(C40524h hVar) {
        String str;
        C41536l.m120489i(hVar, "this$0");
        DeviceIdentifier c = hVar.f96114a.mo67242c();
        if (c != null) {
            str = c.getExtCustomerId();
        } else {
            str = null;
        }
        if (str != null) {
            String username = C10146d0.C10159c.m37143b().getUsername();
            if (username != null) {
                String biometricToken$sso_client_release = C10146d0.C10159c.m37143b().getBiometricToken$sso_client_release();
                if (biometricToken$sso_client_release != null) {
                    return new C41232r(str, username, biometricToken$sso_client_release);
                }
                throw new IllegalStateException("Invalid token".toString());
            }
            throw new IllegalStateException("Invalid username".toString());
        }
        throw new IllegalStateException("Invalid extCustomerId".toString());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r7.contains(sso.type.AuthElementType.TRUSTED_DEVICE) == true) goto L_0x003d;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final ed1.C40735b0 m117266f(dd1.C40524h r7, he1.C41232r r8) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            java.lang.String r0 = "<name for destructuring parameter 0>"
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)
            java.lang.Object r0 = r8.mo95688a()
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r8.mo95689b()
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r8 = r8.mo95690c()
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
            dd1.s0 r8 = r7.f96116c
            ed1.b r8 = r8.mo94610b()
            qa1.f r1 = r7.f96115b
            ge.bog.sso_client.models.Session r7 = ba1.C10146d0.C10159c.m37143b()
            java.util.Set r7 = r7.getAvailableAuthTypes$sso_client_release()
            r0 = 0
            if (r7 == 0) goto L_0x003c
            sso.type.AuthElementType r5 = sso.type.AuthElementType.TRUSTED_DEVICE
            boolean r7 = r7.contains(r5)
            r5 = 1
            if (r7 != r5) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r5 = r0
        L_0x003d:
            java.lang.String r6 = ba1.C10146d0.C10177h.m37232a()
            ed1.x r7 = r1.mo67277p(r2, r3, r4, r5, r6)
            ed1.x r7 = r8.mo94898g(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dd1.C40524h.m117266f(dd1.h, he1.r):ed1.b0");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m117267g(C35939g gVar) {
        Session b = C10146d0.C10159c.m37143b();
        C41536l.m120488h(gVar, "logInInfo");
        b.put$sso_client_release(gVar);
    }

    /* renamed from: d */
    public final C40762x mo94561d() {
        C40762x m = C40762x.m118160v(new C40504e(this)).mo95087r(new C40512f(this)).mo95084m(new C40518g());
        C41536l.m120488h(m, "fromCallable {\n         ….put(logInInfo)\n        }");
        return m;
    }
}

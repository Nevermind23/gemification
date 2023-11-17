package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40762x;
import he1.C41232r;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p341ge.bog.sso_client.models.Session;
import qa1.C27700a1;
import qa1.C27714f;
import sso.type.AuthElementType;
import sso.type.AuthTokenType;
import ue1.C43075l;

/* renamed from: dd1.e0 */
public final class C40505e0 {

    /* renamed from: a */
    private final C27700a1 f96095a;

    /* renamed from: b */
    private final C27714f f96096b;

    /* renamed from: dd1.e0$a */
    static final class C40506a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AuthTokenType f96097d;

        /* renamed from: e */
        final /* synthetic */ String f96098e;

        /* renamed from: dd1.e0$a$a */
        public /* synthetic */ class C40507a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f96099a;

            static {
                int[] iArr = new int[AuthTokenType.values().length];
                iArr[AuthTokenType.BIOMETRIC.ordinal()] = 1;
                iArr[AuthTokenType.PASSCODE.ordinal()] = 2;
                f96099a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40506a(AuthTokenType authTokenType, String str) {
            super(1);
            this.f96097d = authTokenType;
            this.f96098e = str;
        }

        /* renamed from: a */
        public final void mo94551a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            int i = C40507a.f96099a[this.f96097d.ordinal()];
            if (i == 1) {
                session.setBiometricToken$sso_client_release(this.f96098e);
                session.setAvailableAuthTypes$sso_client_release(C41361y0.m120041m(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.BIOMETRY));
            } else if (i == 2) {
                session.setPassCodeToken$sso_client_release(this.f96098e);
                session.setAvailableAuthTypes$sso_client_release(C41361y0.m120041m(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.PASSCODE));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94551a((Session) obj);
            return C41238w.f97225a;
        }
    }

    public C40505e0(C27700a1 a1Var, C27714f fVar) {
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(fVar, "loginRepository");
        this.f96095a = a1Var;
        this.f96096b = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C41232r m117246e(C40505e0 e0Var) {
        String str;
        C41536l.m120489i(e0Var, "this$0");
        DeviceIdentifier c = e0Var.f96095a.mo67242c();
        if (c != null) {
            str = c.getExtCustomerId();
        } else {
            str = null;
        }
        if (str != null) {
            String username = C10146d0.C10159c.m37143b().getUsername();
            if (username != null) {
                String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
                if (processReference$sso_client_release != null) {
                    return new C41232r(str, username, processReference$sso_client_release);
                }
                throw new IllegalStateException("Invalid processReference".toString());
            }
            throw new IllegalStateException("Invalid username".toString());
        }
        throw new IllegalStateException("Invalid extCustomerId".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40735b0 m117247f(C40505e0 e0Var, AuthTokenType authTokenType, C41232r rVar) {
        C41536l.m120489i(e0Var, "this$0");
        C41536l.m120489i(authTokenType, "$type");
        C41536l.m120489i(rVar, "<name for destructuring parameter 0>");
        String str = (String) rVar.mo95690c();
        return e0Var.f96096b.mo67284w((String) rVar.mo95688a(), str, (String) rVar.mo95689b(), authTokenType);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m117248g(AuthTokenType authTokenType, String str) {
        C41536l.m120489i(authTokenType, "$type");
        C35962r.m107005c(C10146d0.C10159c.m37143b(), new C40506a(authTokenType, str));
    }

    /* renamed from: d */
    public final C40734b mo94550d(AuthTokenType authTokenType) {
        C41536l.m120489i(authTokenType, "type");
        C40734b y = C40762x.m118160v(new C40487b0(this)).mo95087r(new C40493c0(this, authTokenType)).mo95084m(new C40499d0(authTokenType)).mo95092y();
        C41536l.m120488h(y, "fromCallable {\n         …        }.ignoreElement()");
        return y;
    }
}

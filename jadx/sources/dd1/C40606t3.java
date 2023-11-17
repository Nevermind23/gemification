package dd1;

import ba1.C10140b;
import ba1.C10190e;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import he1.C41224m;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import qa1.C27700a1;
import qa1.C27714f;

/* renamed from: dd1.t3 */
public final class C40606t3 {

    /* renamed from: a */
    private final C27700a1 f96228a;

    /* renamed from: b */
    private final C27714f f96229b;

    /* renamed from: c */
    private final C10140b f96230c;

    /* renamed from: d */
    private final C10190e f96231d;

    public C40606t3(C27700a1 a1Var, C27714f fVar, C10140b bVar, C10190e eVar) {
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(fVar, "loginRepository");
        C41536l.m120489i(bVar, "deviceInfo");
        C41536l.m120489i(eVar, "fcmTokenProvider");
        this.f96228a = a1Var;
        this.f96229b = fVar;
        this.f96230c = bVar;
        this.f96231d = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C41224m m117409d(C40606t3 t3Var, String str) {
        String str2;
        C41536l.m120489i(t3Var, "this$0");
        DeviceIdentifier c = t3Var.f96228a.mo67242c();
        if (c != null) {
            str2 = c.getExtCustomerId();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Invalid extCustomerId".toString());
        } else if (str != null) {
            return new C41224m(str2, str);
        } else {
            throw new IllegalArgumentException("Invalid accessToken".toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40739f m117410e(C40606t3 t3Var, C41224m mVar) {
        C41536l.m120489i(t3Var, "this$0");
        C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
        return t3Var.f96229b.mo67262a(String.valueOf(t3Var.f96230c.mo26662b()), t3Var.f96230c.mo26663c(), t3Var.f96230c.mo26665e(), (String) mVar.mo95675a(), t3Var.f96231d.mo26761a(), t3Var.f96230c.mo26667g(), (String) mVar.mo95676b());
    }

    /* renamed from: c */
    public final C40734b mo94617c(String str) {
        C40734b A = C40762x.m118160v(new C40594r3(this, str)).mo95088s(new C40600s3(this)).mo94882A();
        C41536l.m120488h(A, "fromCallable {\n         …      }.onErrorComplete()");
        return A;
    }
}

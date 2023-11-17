package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.r */
public final class C40590r {

    /* renamed from: a */
    private final C27714f f96207a;

    public C40590r(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96207a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final String m117382e() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40739f m117383f(C40590r rVar, String str, String str2) {
        C41536l.m120489i(rVar, "this$0");
        C41536l.m120489i(str, "$clientKey");
        C41536l.m120489i(str2, "processReference");
        return rVar.f96207a.mo67261D(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m117384g(boolean z, String str) {
        C41536l.m120489i(str, "$clientKey");
        if (z) {
            C10146d0.C10159c.m37143b().setSavedCompanyClientKey$sso_client_release(str);
        }
    }

    /* renamed from: d */
    public final C40734b mo94606d(String str, boolean z) {
        C41536l.m120489i(str, "clientKey");
        C40734b o = C40762x.m118160v(new C40569o()).mo95088s(new C40576p(this, str)).mo94902o(new C40583q(z, str));
        C41536l.m120488h(o, "fromCallable {\n         …y\n            }\n        }");
        return o;
    }
}

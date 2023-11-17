package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.UserContact;
import qa1.C27714f;
import sso.type.UserContactType;

/* renamed from: dd1.p3 */
public final class C40581p3 {

    /* renamed from: a */
    private final C27714f f96198a;

    public C40581p3(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96198a = fVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C40734b m117364d(C40581p3 p3Var, UserContact userContact, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return p3Var.mo94598c(userContact, str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final String m117365e(boolean z) {
        if (!z) {
            return "";
        }
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            return processReference$sso_client_release;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40739f m117366f(C40581p3 p3Var, UserContact userContact, String str, String str2) {
        boolean z;
        C41536l.m120489i(p3Var, "this$0");
        C41536l.m120489i(userContact, "$userContact");
        C41536l.m120489i(str2, "processReference");
        C27714f fVar = p3Var.f96198a;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = null;
        }
        return C27714f.C27715a.m85772a(fVar, userContact, str2, (String) null, (UserContactType) null, str, 12, (Object) null).mo95092y();
    }

    /* renamed from: c */
    public final C40734b mo94598c(UserContact userContact, String str, boolean z) {
        C41536l.m120489i(userContact, "userContact");
        C40734b s = C40762x.m118160v(new C40567n3(z)).mo95088s(new C40573o3(this, userContact, str));
        C41536l.m120488h(s, "fromCallable {\n         …ignoreElement()\n        }");
        return s;
    }
}

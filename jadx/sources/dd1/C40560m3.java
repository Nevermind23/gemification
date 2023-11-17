package dd1;

import ba1.C10146d0;
import ed1.C40735b0;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.UserContact;
import qa1.C27714f;
import sso.type.UserContactType;

/* renamed from: dd1.m3 */
public final class C40560m3 {

    /* renamed from: a */
    private final C27714f f96166a;

    public C40560m3(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96166a = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m117330d() {
        String a = C10146d0.C10175f.m37216a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40735b0 m117331e(C40560m3 m3Var, UserContact userContact, String str, UserContactType userContactType, String str2) {
        C41536l.m120489i(m3Var, "this$0");
        C41536l.m120489i(userContact, "$userContact");
        C41536l.m120489i(str, "$manuallyEnteredContact");
        C41536l.m120489i(userContactType, "$manuallyEnteredContactType");
        C41536l.m120489i(str2, "processReference");
        return C27714f.C27715a.m85772a(m3Var.f96166a, userContact, str2, str, userContactType, (String) null, 16, (Object) null);
    }

    /* renamed from: c */
    public final C40762x mo94588c(UserContact userContact, String str, UserContactType userContactType) {
        C41536l.m120489i(userContact, "userContact");
        C41536l.m120489i(str, "manuallyEnteredContact");
        C41536l.m120489i(userContactType, "manuallyEnteredContactType");
        C40762x r = C40762x.m118160v(new C40547k3()).mo95087r(new C40553l3(this, userContact, str, userContactType));
        C41536l.m120488h(r, "fromCallable {\n         …redContactType)\n        }");
        return r;
    }
}

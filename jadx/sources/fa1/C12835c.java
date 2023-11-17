package fa1;

import ba1.C10146d0;
import ea1.C12420a;
import ed1.C40762x;
import hb1.C36175k;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p217q2.C7833e;
import p217q2.C7843j;
import sso.queery.GetUsernamePolicyRulesQuery;
import ue1.C43075l;

/* renamed from: fa1.c */
public final class C12835c implements C12833a {

    /* renamed from: a */
    private final C36175k f37939a;

    public C12835c(C36175k kVar) {
        C41536l.m120489i(kVar, "apolloRxFactory");
        this.f37939a = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m48585c(C7843j jVar) {
        GetUsernamePolicyRulesQuery.LoginServices loginServices;
        GetUsernamePolicyRulesQuery.GetUsernamePolicyRules getUsernamePolicyRules;
        C41536l.m120489i(jVar, "resp");
        GetUsernamePolicyRulesQuery.Data data = (GetUsernamePolicyRulesQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null || (getUsernamePolicyRules = loginServices.getGetUsernamePolicyRules()) == null) {
            return null;
        }
        return C12420a.f37085a.mo33028a(getUsernamePolicyRules);
    }

    /* renamed from: a */
    public C40762x mo33487a() {
        C40762x A = C36175k.m107584j(this.f37939a, new GetUsernamePolicyRulesQuery(C7833e.f22754c.mo22769c(C10146d0.C10159c.m37143b().getProcessReference$sso_client_release())), false, (C43075l) null, 6, (Object) null).mo95062A(new C12834b());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }
}

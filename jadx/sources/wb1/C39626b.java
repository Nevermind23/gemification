package wb1;

import ed1.C40762x;
import hb1.C36175k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7843j;
import p485kc.C16341a;
import sso.queery.GetOnboardingIdentomatSessionTokenQuery;
import ue1.C43075l;
import xb1.C39833a;

/* renamed from: wb1.b */
public final class C39626b implements C39833a {

    /* renamed from: b */
    public static final C39627a f94134b = new C39627a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C36175k f94135a;

    /* renamed from: wb1.b$a */
    public static final class C39627a {
        private C39627a() {
        }

        public /* synthetic */ C39627a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C39626b(C36175k kVar) {
        C41536l.m120489i(kVar, "apolloRxFactory");
        this.f94135a = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final String m115121c(C7843j jVar) {
        String str;
        GetOnboardingIdentomatSessionTokenQuery.RegistrationServices registrationServices;
        GetOnboardingIdentomatSessionTokenQuery.GetOnboardingIdentomatSessionToken getOnboardingIdentomatSessionToken;
        C41536l.m120489i(jVar, "it");
        GetOnboardingIdentomatSessionTokenQuery.Data data = (GetOnboardingIdentomatSessionTokenQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (getOnboardingIdentomatSessionToken = registrationServices.getGetOnboardingIdentomatSessionToken()) == null) {
            str = null;
        } else {
            str = getOnboardingIdentomatSessionToken.getSessionToken();
        }
        if (str != null) {
            C16341a aVar = C16341a.f46171a;
            aVar.mo43323k(C40439w.m117103B(str, "\"", "", false, 4, (Object) null));
            aVar.mo43320h("https://widget.identomat.com/api/");
        }
        return str;
    }

    /* renamed from: a */
    public C40762x mo93287a(String str, String str2, boolean z) {
        C41536l.m120489i(str, "operationReference");
        C41536l.m120489i(str2, "processReference");
        C40762x A = C36175k.m107584j(this.f94135a, new GetOnboardingIdentomatSessionTokenQuery(str, str2, z), false, (C43075l) null, 6, (Object) null).mo95062A(new C39625a());
        C41536l.m120488h(A, "apolloRxFactory.createSi…          token\n        }");
        return A;
    }
}

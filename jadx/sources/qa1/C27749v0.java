package qa1;

import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40762x;
import hb1.C36175k;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7833e;
import p217q2.C7843j;
import sso.queery.AuthQuery;
import sso.queery.CheckCardDataQuery;
import sso.queery.ConfirmationOnTermsQuery;
import ue1.C43075l;
import va1.C39311i;

/* renamed from: qa1.v0 */
public final class C27749v0 implements C27739q0 {

    /* renamed from: c */
    private static final C27750a f70835c = new C27750a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C36175k f70836a;

    /* renamed from: b */
    private final C39311i f70837b;

    /* renamed from: qa1.v0$a */
    private static final class C27750a {
        private C27750a() {
        }

        public /* synthetic */ C27750a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C27749v0(C36175k kVar, C39311i iVar) {
        C41536l.m120489i(kVar, "apolloRxFactory");
        C41536l.m120489i(iVar, "serverEndpointConfig");
        this.f70836a = kVar;
        this.f70837b = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C40735b0 m85825g(C27749v0 v0Var, String str, String str2, String str3, String str4) {
        C41536l.m120489i(v0Var, "this$0");
        C41536l.m120489i(str, "$cardNo");
        C41536l.m120489i(str2, "$cardCvv");
        C41536l.m120489i(str3, "$expDate");
        C41536l.m120489i(str4, "it");
        return C36175k.m107584j(v0Var.f70836a, new CheckCardDataQuery(str, str2, str3, C7833e.f22754c.mo22767a()), false, (C43075l) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m85826h(C7843j jVar) {
        CheckCardDataQuery.RegistrationServices registrationServices;
        CheckCardDataQuery.CheckCardData checkCardData;
        Long l;
        CheckCardDataQuery.Data data = (CheckCardDataQuery.Data) jVar.mo22784b();
        if (data != null && (registrationServices = data.getRegistrationServices()) != null && (checkCardData = registrationServices.getCheckCardData()) != null) {
            String processReference = checkCardData.getProcessReference();
            if (processReference == null) {
                processReference = "";
            }
            C10146d0.C10175f.m37218c(processReference);
            BigDecimal userId = checkCardData.getUserId();
            if (userId != null) {
                l = Long.valueOf(userId.longValue());
            } else {
                l = null;
            }
            C10146d0.C10175f.m37219d(l);
        }
    }

    /* renamed from: i */
    private final C40762x m85827i() {
        C40762x m = C36175k.m107584j(this.f70836a, new AuthQuery(this.f70837b.mo92939a(), this.f70837b.mo92940b()), false, (C43075l) null, 6, (Object) null).mo95062A(new C27745t0()).mo95084m(new C27747u0());
        C41536l.m120488h(m, "apolloRxFactory\n        …urrent.ssoToken = token }");
        return m;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final String m85828j(C7843j jVar) {
        String str;
        AuthQuery.Auth auth;
        C41536l.m120489i(jVar, "it");
        AuthQuery.Data data = (AuthQuery.Data) jVar.mo22784b();
        if (data == null || (auth = data.getAuth()) == null) {
            str = null;
        } else {
            str = auth.getToken();
        }
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Invalid token".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m85829k(String str) {
        C10146d0.C10159c.m37143b().setSsoToken$sso_client_release(str);
    }

    /* renamed from: a */
    public C40734b mo67301a(String str) {
        C41536l.m120489i(str, "documentContent");
        C36175k kVar = this.f70836a;
        C7833e.C7834a aVar = C7833e.f22754c;
        return C36175k.m107582f(kVar, new ConfirmationOnTermsQuery(aVar.mo22767a(), aVar.mo22769c(C10146d0.C10175f.m37216a()), aVar.mo22769c("CONFIRMATION_ON_PL_CARD_PASSWORD_RECOVERY"), aVar.mo22769c(str)), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: b */
    public C40734b mo67302b(String str, String str2, String str3) {
        C41536l.m120489i(str, "cardNo");
        C41536l.m120489i(str2, "cardCvv");
        C41536l.m120489i(str3, "expDate");
        C40734b y = m85827i().mo95087r(new C27741r0(this, str, str2, str3)).mo95084m(new C27743s0()).mo95092y();
        C41536l.m120488h(y, "getAuthToken()\n         …         .ignoreElement()");
        return y;
    }
}

package ra1;

import android.content.Context;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10199i;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.FaceTecSDKStatus;
import ed1.C40734b;
import ed1.C40736c;
import ed1.C40762x;
import gb1.C32393w;
import hb1.C36175k;
import he1.C41224m;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7833e;
import p217q2.C7843j;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.sso_client.models.GetFaceTecTokenResponse;
import p341ge.bog.sso_client.models.LogFaceTecErrorResponse;
import p341ge.bog.sso_client.models.OnboardingAppKeysResponse;
import p341ge.bog.sso_client.models.ValidateOnboardingDataResponse;
import qa1.C27700a1;
import sso.queery.GetOnboardingAccessTokenQuery;
import sso.queery.GetOnboardingAppKeysQuery;
import sso.queery.LogOnboardingIdentificationErrorQuery;
import sso.queery.LogOnboardingIdentificationStartActionQuery;
import sso.queery.ValidateOnboardingDataQuery;
import ue1.C43075l;

/* renamed from: ra1.n */
public final class C27977n implements C27967d {

    /* renamed from: d */
    public static final C27978a f71201d = new C27978a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C36175k f71202a;

    /* renamed from: b */
    private final C10199i f71203b;

    /* renamed from: c */
    private final C27700a1 f71204c;

    /* renamed from: ra1.n$a */
    public static final class C27978a {
        private C27978a() {
        }

        public /* synthetic */ C27978a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ra1.n$b */
    public static final class C27979b extends FaceTecSDK.InitializeCallback {

        /* renamed from: a */
        final /* synthetic */ C40736c f71205a;

        /* renamed from: b */
        final /* synthetic */ Context f71206b;

        C27979b(C40736c cVar, Context context) {
            this.f71205a = cVar;
            this.f71206b = context;
        }

        public void onCompletion(boolean z) {
            if (z) {
                this.f71205a.onComplete();
            } else {
                this.f71205a.onError(new Throwable(FaceTecSDK.getStatus(this.f71206b).name()));
            }
        }
    }

    public C27977n(C36175k kVar, C10199i iVar, C27700a1 a1Var) {
        C41536l.m120489i(kVar, "apolloRxFactory");
        C41536l.m120489i(iVar, "localeManager");
        C41536l.m120489i(a1Var, "storage");
        this.f71202a = kVar;
        this.f71203b = iVar;
        this.f71204c = a1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m86351r(C7843j jVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final GetFaceTecTokenResponse m86352s(C7843j jVar) {
        GetOnboardingAccessTokenQuery.RegistrationServices registrationServices;
        GetOnboardingAccessTokenQuery.GetOnboardingAccessToken getOnboardingAccessToken;
        C41536l.m120489i(jVar, "it");
        GetOnboardingAccessTokenQuery.Data data = (GetOnboardingAccessTokenQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (getOnboardingAccessToken = registrationServices.getGetOnboardingAccessToken()) == null) {
            return null;
        }
        return new GetFaceTecTokenResponse(getOnboardingAccessToken.getAccessToken(), getOnboardingAccessToken.getOperationReference());
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m86353t(C27977n nVar, C40736c cVar) {
        C41536l.m120489i(nVar, "this$0");
        C41536l.m120489i(cVar, "emitter");
        C36175k.m107584j(nVar.f71202a, new GetOnboardingAppKeysQuery(PaymentServiceConfig.TYPE_MOBILE), false, (C43075l) null, 6, (Object) null).mo95062A(new C27971h()).mo95070I(new C27972i(nVar, cVar), new C27973j(nVar, cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final OnboardingAppKeysResponse m86354u(C7843j jVar) {
        GetOnboardingAppKeysQuery.RegistrationServices registrationServices;
        GetOnboardingAppKeysQuery.GetOnboardingAppKeys getOnboardingAppKeys;
        C41536l.m120489i(jVar, "it");
        GetOnboardingAppKeysQuery.Data data = (GetOnboardingAppKeysQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (getOnboardingAppKeys = registrationServices.getGetOnboardingAppKeys()) == null) {
            return null;
        }
        return new OnboardingAppKeysResponse(getOnboardingAppKeys.getServerKey());
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m86355v(C27977n nVar, C40736c cVar, OnboardingAppKeysResponse onboardingAppKeysResponse) {
        boolean z;
        C41536l.m120489i(nVar, "this$0");
        C41536l.m120489i(cVar, "$emitter");
        boolean z2 = false;
        if (onboardingAppKeysResponse != null) {
            String serverKey = onboardingAppKeysResponse.getServerKey();
            if (serverKey == null || C40439w.m117118v(serverKey)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                nVar.f71204c.mo67251k(onboardingAppKeysResponse.getServerKey());
            }
        }
        String d = nVar.f71204c.mo67243d();
        if (d == null || C40439w.m117118v(d)) {
            z2 = true;
        }
        if (!z2) {
            cVar.onComplete();
        } else {
            cVar.onError(new Throwable());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m86356w(C27977n nVar, C40736c cVar, Throwable th) {
        boolean z;
        C41536l.m120489i(nVar, "this$0");
        C41536l.m120489i(cVar, "$emitter");
        String d = nVar.f71204c.mo67243d();
        if (d == null || C40439w.m117118v(d)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            cVar.onComplete();
        } else {
            cVar.onError(new Throwable());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m86357x(Context context, C27977n nVar, C40736c cVar) {
        C41536l.m120489i(context, "$context");
        C41536l.m120489i(nVar, "this$0");
        C41536l.m120489i(cVar, "emitter");
        if (FaceTecSDK.getStatus(context) != FaceTecSDKStatus.INITIALIZED) {
            FaceTecSDK.setCustomization(C27981p.m86372a(context));
            FaceTecSDK.setLowLightCustomization(C27981p.m86374c(context));
            C27979b bVar = new C27979b(cVar, context);
            String d = nVar.f71204c.mo67243d();
            if (d == null) {
                d = "";
            }
            C27981p.m86376e(d, context, bVar);
            return;
        }
        cVar.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final LogFaceTecErrorResponse m86358y(String str, C7843j jVar) {
        LogOnboardingIdentificationErrorQuery.RegistrationServices registrationServices;
        LogOnboardingIdentificationErrorQuery.LogOnboardingIdentificationError logOnboardingIdentificationError;
        C41536l.m120489i(str, "$errorKey");
        C41536l.m120489i(jVar, "it");
        LogOnboardingIdentificationErrorQuery.Data data = (LogOnboardingIdentificationErrorQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (logOnboardingIdentificationError = registrationServices.getLogOnboardingIdentificationError()) == null) {
            return null;
        }
        return new LogFaceTecErrorResponse(logOnboardingIdentificationError.getErrorCode(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final ValidateOnboardingDataResponse m86359z(C7843j jVar) {
        ValidateOnboardingDataQuery.RegistrationServices registrationServices;
        ValidateOnboardingDataQuery.ValidateOnboardingData validateOnboardingData;
        C41536l.m120489i(jVar, "it");
        ValidateOnboardingDataQuery.Data data = (ValidateOnboardingDataQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (validateOnboardingData = registrationServices.getValidateOnboardingData()) == null) {
            return null;
        }
        return new ValidateOnboardingDataResponse(validateOnboardingData.getCustomerId(), validateOnboardingData.getCustomerType(), validateOnboardingData.getErrorCode(), validateOnboardingData.getErrorKey(), C32393w.m95664e(validateOnboardingData.getClientHasActualAddress()), validateOnboardingData.getScanResultBlob());
    }

    /* renamed from: a */
    public String mo67545a(String str) {
        C41536l.m120489i(str, "key");
        return C27981p.m86373b(str, this.f71203b.mo26767a());
    }

    /* renamed from: b */
    public C41224m mo67546b(Context context) {
        C41536l.m120489i(context, "context");
        return new C41224m(FaceTecSDK.getStatus(context).name(), C27981p.m86373b(FaceTecSDK.getStatus(context).name(), this.f71203b.mo26767a()));
    }

    /* renamed from: c */
    public C40734b mo67547c() {
        return C36175k.m107582f(this.f71202a, new LogOnboardingIdentificationStartActionQuery(C10146d0.C10176g.m37221b(), C10146d0.C10176g.m37223d()), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: d */
    public C40762x mo67548d(String str, String str2) {
        C41536l.m120489i(str, "errorKey");
        C41536l.m120489i(str2, "errorMessage");
        C36175k kVar = this.f71202a;
        String d = C10146d0.C10176g.m37223d();
        if (d == null) {
            d = "";
        }
        C40762x A = C36175k.m107584j(kVar, new LogOnboardingIdentificationErrorQuery(str, str2, d, C10146d0.C10176g.m37221b()), false, (C43075l) null, 6, (Object) null).mo95062A(new C27969f(str));
        C41536l.m120488h(A, "apolloRxFactory.createSi…          }\n            }");
        return A;
    }

    /* renamed from: e */
    public C40734b mo67549e(Context context, C10195g0 g0Var) {
        C41536l.m120489i(context, "context");
        FaceTecSDK.setDynamicStrings(C27981p.m86375d(this.f71203b.mo26767a(), g0Var));
        C40734b k = C40734b.m117920k(new C27974k(context, this));
        C41536l.m120488h(k, "create { emitter ->\n    …)\n            }\n        }");
        return k;
    }

    /* renamed from: f */
    public C40762x mo67550f(String str, String str2) {
        C41536l.m120489i(str, "contactValue");
        C41536l.m120489i(str2, "flowKey");
        C36175k kVar = this.f71202a;
        String e = C10146d0.C10176g.m37224e();
        C7833e.C7834a aVar = C7833e.f22754c;
        C40762x A = C36175k.m107584j(kVar, new GetOnboardingAccessTokenQuery(str, str2, e, aVar.mo22769c(C10146d0.C10176g.m37221b()), aVar.mo22769c(C27981p.f71213b), aVar.mo22769c(FaceTecSDK.createFaceTecAPIUserAgentString(""))), false, (C43075l) null, 6, (Object) null).mo95084m(new C27975l()).mo95062A(new C27976m());
        C41536l.m120488h(A, "apolloRxFactory.createSi…          }\n            }");
        return A;
    }

    /* renamed from: g */
    public C40734b mo67551g() {
        C40734b k = C40734b.m117920k(new C27968e(this));
        C41536l.m120488h(k, "create { emitter ->\n    …\n            })\n        }");
        return k;
    }

    /* renamed from: h */
    public C40762x mo67552h(String str, List list, String str2, List list2) {
        String str3 = str;
        C41536l.m120489i(str3, "xUserAgent");
        C36175k kVar = this.f71202a;
        String str4 = C27981p.f71213b;
        String a = C10146d0.C10176g.m37220a();
        C7833e.C7834a aVar = C7833e.f22754c;
        C40762x A = C36175k.m107584j(kVar, new ValidateOnboardingDataQuery(str4, str3, a, aVar.mo22769c((Object) null), aVar.mo22769c((Object) null), aVar.mo22769c((Object) null), aVar.mo22769c(list), aVar.mo22769c(str2), aVar.mo22769c(list2), aVar.mo22769c(C10146d0.C10176g.m37221b()), aVar.mo22769c(C10146d0.C10176g.m37223d())), false, (C43075l) null, 6, (Object) null).mo95062A(new C27970g());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }
}

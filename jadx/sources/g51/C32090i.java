package g51;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import ba1.C10146d0;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40736c;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import g91.C32335t0;
import g91.C32343x;
import h51.C36153a;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import i51.C36356a;
import iu0.C36546y;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import k51.C36873a;
import k51.C36874b;
import k51.C36875c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.ClientCategory;
import p341ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper;
import p341ge.bog.mobilebank.model.usrinfo.UserInfo;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.sso_client.models.C35940h;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.network.ApiException;
import p380ck.C10463g;
import p707as.C19273c;
import p748eu.C20292b;
import p758fu.C20557a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: g51.i */
public final class C32090i implements C36356a {

    /* renamed from: i */
    public static final C32091a f78930i = new C32091a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f78931a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Client f78932b;

    /* renamed from: c */
    private final PreferencesApiManager f78933c;

    /* renamed from: d */
    private final C36153a f78934d;

    /* renamed from: e */
    private final C20292b f78935e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C40765a f78936f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C40765a f78937g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C36875c f78938h;

    /* renamed from: g51.i$a */
    public static final class C32091a {
        private C32091a() {
        }

        public /* synthetic */ C32091a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g51.i$b */
    public /* synthetic */ class C32092b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78939a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.mobilebank.model.usrinfo.ClientCategory[] r0 = p341ge.bog.mobilebank.model.usrinfo.ClientCategory.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.model.usrinfo.ClientCategory r1 = p341ge.bog.mobilebank.model.usrinfo.ClientCategory.WEALTH_MANAGEMENT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.model.usrinfo.ClientCategory r1 = p341ge.bog.mobilebank.model.usrinfo.ClientCategory.SOLO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f78939a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g51.C32090i.C32092b.<clinit>():void");
        }
    }

    /* renamed from: g51.i$c */
    static final class C32093c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C32090i f78940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32093c(C32090i iVar) {
            super(0);
            this.f78940d = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m94551c(C32090i iVar, C40736c cVar) {
            C41536l.m120489i(iVar, "this$0");
            C41536l.m120489i(cVar, "it");
            iVar.m94513N(cVar);
        }

        /* renamed from: b */
        public final C40734b invoke() {
            C40734b k = C40734b.m117920k(new C32102j(this.f78940d));
            C41536l.m120488h(k, "create {\n               …fterSSO(it)\n            }");
            return k;
        }
    }

    /* renamed from: g51.i$d */
    static final class C32094d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32090i f78941d;

        /* renamed from: g51.i$d$a */
        static final class C32095a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C32095a f78942d = new C32095a();

            C32095a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(ClientInfoWrapper clientInfoWrapper, UserRestrictions userRestrictions) {
                C41536l.m120489i(clientInfoWrapper, "info");
                C41536l.m120489i(userRestrictions, "restrictions");
                return C41233s.m119492a(clientInfoWrapper, userRestrictions);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32094d(C32090i iVar) {
            super(1);
            this.f78941d = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m94554c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40735b0 invoke(ClientInfoWrapper clientInfoWrapper) {
            Long l;
            C40762x xVar;
            C41536l.m120489i(clientInfoWrapper, "clientInfo");
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            UserInfo client = clientInfoWrapper.getClient();
            Long l2 = null;
            if (client != null) {
                l = client.birthDate;
            } else {
                l = null;
            }
            C41536l.m120486f(l);
            if (timeInMillis - l.longValue() < 567979200000L) {
                C32090i iVar = this.f78941d;
                UserInfo client2 = clientInfoWrapper.getClient();
                if (client2 != null) {
                    l2 = client2.birthDate;
                }
                C41536l.m120486f(l2);
                xVar = iVar.m94508I(l2.longValue());
            } else {
                xVar = C40762x.m118162z(new UserRestrictions(C41341q.m119907j()));
                C41536l.m120488h(xVar, "just(UserRestrictions(listOf()))");
            }
            return C40762x.m118154T(C40762x.m118162z(clientInfoWrapper), xVar, new C32103k(C32095a.f78942d));
        }
    }

    /* renamed from: g51.i$e */
    static final class C32096e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32090i f78943d;

        /* renamed from: e */
        final /* synthetic */ C40736c f78944e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32096e(C32090i iVar, C40736c cVar) {
            super(1);
            this.f78943d = iVar;
            this.f78944e = cVar;
        }

        /* renamed from: a */
        public final void mo72574a(C41224m mVar) {
            String str;
            boolean z;
            ClientInfoWrapper clientInfoWrapper = (ClientInfoWrapper) mVar.mo95675a();
            UserRestrictions userRestrictions = (UserRestrictions) mVar.mo95676b();
            C35940h loginUserInInfo = C10146d0.C10159c.m37143b().getLoginUserInInfo();
            String str2 = null;
            if (loginUserInInfo != null) {
                str = loginUserInInfo.mo88506b();
            } else {
                str = null;
            }
            C35940h loginUserInInfo2 = C10146d0.C10159c.m37143b().getLoginUserInInfo();
            if (loginUserInInfo2 != null) {
                str2 = loginUserInInfo2.mo88505a();
            }
            String str3 = str2;
            boolean z2 = true;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (!(str3 == null || str3.length() == 0)) {
                    z2 = false;
                }
                if (!z2) {
                    this.f78943d.f78932b.userLoggedIn();
                    MedalliaDigital.enableIntercept();
                    long parseLong = Long.parseLong(str);
                    Long customerId = clientInfoWrapper.getClient().getCustomerId();
                    C41536l.m120488h(customerId, "clientInfo.client.customerId");
                    long longValue = customerId.longValue();
                    ClientCategory clientCategoryEnum = clientInfoWrapper.getClient().getClientCategoryEnum();
                    C41536l.m120488h(clientCategoryEnum, "clientInfo.client.clientCategoryEnum");
                    C36875c cVar = new C36875c(parseLong, str3, longValue, clientCategoryEnum);
                    this.f78943d.f78938h = cVar;
                    this.f78943d.f78932b.setLoginInfo(this.f78943d.mo72569n());
                    this.f78943d.f78932b.setUserInfo(clientInfoWrapper);
                    this.f78943d.f78932b.setUserRestrictions(userRestrictions);
                    C32090i iVar = this.f78943d;
                    C41536l.m120488h(clientInfoWrapper, "clientInfo");
                    iVar.m94517R(clientInfoWrapper);
                    this.f78943d.m94518S(cVar, clientInfoWrapper);
                    this.f78943d.m94519T();
                    this.f78944e.onComplete();
                    this.f78943d.f78936f.onNext(Boolean.TRUE);
                    return;
                }
            }
            this.f78943d.m94509J(new Throwable(C32343x.m95388F("text.identity.login.exception.auth_is_suspended", new Object[0])), this.f78944e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72574a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: g51.i$f */
    static final class C32097f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32090i f78945d;

        /* renamed from: e */
        final /* synthetic */ C40736c f78946e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32097f(C32090i iVar, C40736c cVar) {
            super(1);
            this.f78945d = iVar;
            this.f78946e = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C32090i iVar = this.f78945d;
            C41536l.m120488h(th, "it");
            iVar.m94509J(th, this.f78946e);
        }
    }

    /* renamed from: g51.i$g */
    static final class C32098g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C32098g f78947d = new C32098g();

        C32098g() {
            super(1);
        }

        /* renamed from: a */
        public final void mo72576a(BankApiResponse bankApiResponse) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72576a((BankApiResponse) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: g51.i$h */
    static final class C32099h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C32099h f78948d = new C32099h();

        C32099h() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: g51.i$i */
    static final class C32100i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32090i f78949d;

        /* renamed from: e */
        final /* synthetic */ C40736c f78950e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32100i(C32090i iVar, C40736c cVar) {
            super(1);
            this.f78949d = iVar;
            this.f78950e = cVar;
        }

        /* renamed from: a */
        public final void mo72578a(ClientInfoWrapper clientInfoWrapper) {
            this.f78949d.f78932b.setUserInfo(clientInfoWrapper);
            C32090i iVar = this.f78949d;
            C41536l.m120488h(clientInfoWrapper, "info");
            iVar.m94517R(clientInfoWrapper);
            this.f78950e.onComplete();
            this.f78949d.f78937g.onNext(C41238w.f97225a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72578a((ClientInfoWrapper) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: g51.i$j */
    static final class C32101j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40736c f78951d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32101j(C40736c cVar) {
            super(1);
            this.f78951d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f78951d.onError(th);
        }
    }

    public C32090i(IRetrofitService iRetrofitService, Client client, PreferencesApiManager preferencesApiManager, C36153a aVar, C20292b bVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(aVar, "userInfoMapper");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        this.f78931a = iRetrofitService;
        this.f78932b = client;
        this.f78933c = preferencesApiManager;
        this.f78934d = aVar;
        this.f78935e = bVar;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Boolean>()");
        this.f78936f = h1;
        C40765a h12 = C40765a.m118198h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f78937g = h12;
    }

    /* renamed from: H */
    private final C40762x m94507H() {
        C40762x<BankApiResponse<ClientInfoWrapper>> userInfo = this.f78931a.getUserInfo("CLIENTS_GET_CLIENT_INFO_V3");
        C41536l.m120488h(userInfo, "service.getUserInfo(SERVICE_CLIENTS_GET_CLIENT)");
        return C19273c.m64722h(userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final C40762x m94508I(long j) {
        C40762x<BankApiResponse<UserRestrictions>> userRestrictedServices = this.f78931a.getUserRestrictedServices("CLIENTS_CHILD_MBANK_GET_RESTRICTED_SERVICES", Long.valueOf(j));
        C41536l.m120488h(userRestrictedServices, "service.getUserRestricte…_RESTRICTIONS, birthDate)");
        return C19273c.m64722h(userRestrictedServices);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m94509J(Throwable th, C40736c cVar) {
        ApiException apiException;
        Integer num;
        Throwable th2 = th;
        cVar.onError(new Throwable());
        if (th2 instanceof ApiError) {
            ApiError apiError = (ApiError) th2;
            String code = apiError.mo84685a().getCode();
            if (code != null) {
                num = Integer.valueOf(Integer.parseInt(code));
            } else {
                num = null;
            }
            apiException = new ApiException(num, C32343x.m95388F(apiError.mo84685a().getKey(), new Object[0]), apiError.mo84685a().getKey(), (String) null, 8, (DefaultConstructorMarker) null);
        } else {
            String message = th.getMessage();
            String localizedMessage = th.getLocalizedMessage();
            Throwable cause = th.getCause();
            String message2 = th.getMessage();
            StackTraceElement[] stackTrace = th.getStackTrace();
            apiException = new ApiException(-1, message, "error: " + localizedMessage + "\ncause: " + cause + "\nmessage: " + message2 + "\n trace" + stackTrace, (String) null, 8, (DefaultConstructorMarker) null);
        }
        C10146d0.C10148b.m37106b(apiException);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final void m94510K() {
        Long deviceId;
        String l;
        C10463g F = C36546y.m108282F();
        DeviceIdentifier g = C10146d0.C10148b.m37109g();
        if (g != null && (deviceId = g.getDeviceId()) != null && (l = deviceId.toString()) != null) {
            F.mo27145P(l);
        }
    }

    /* renamed from: L */
    private final C10146d0.C10172e.C10173a m94511L(C10146d0.C10172e.C10173a aVar) {
        String str;
        C20557a a = this.f78935e.mo48774a("TMX_ORG_ID");
        String str2 = null;
        if (a != null) {
            str = a.mo49087d();
        } else {
            str = null;
        }
        C20557a a2 = this.f78935e.mo48774a("TMX_FP_SERVER");
        if (a2 != null) {
            str2 = a2.mo49087d();
        }
        if (str == null || str2 == null) {
            return aVar;
        }
        return aVar.mo26747o(str, str2);
    }

    /* renamed from: M */
    private final boolean m94512M() {
        return !C10146d0.C10159c.m37145e();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void m94513N(C40736c cVar) {
        C41536l.m120488h(m94507H().mo95087r(new C32085d(new C32094d(this))).mo95070I(new C32086e(new C32096e(this, cVar)), new C32087f(new C32097f(this, cVar))), "private fun loginAfterSS…emitter)\n        })\n    }");
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static final C40735b0 m94514O(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static final void m94515P(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m94516Q(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final void m94517R(ClientInfoWrapper clientInfoWrapper) {
        int i;
        String str;
        String str2;
        String str3;
        PreferencesApiManager preferencesApiManager = this.f78933c;
        ClientCategory clientCategoryEnum = clientInfoWrapper.getClient().getClientCategoryEnum();
        if (clientCategoryEnum == null) {
            i = -1;
        } else {
            i = C32092b.f78939a[clientCategoryEnum.ordinal()];
        }
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        preferencesApiManager.saveUserTheme(i2);
        PreferencesApiManager preferencesApiManager2 = this.f78933c;
        C37228a n = mo72569n();
        if (n != null) {
            str = n.mo90307d();
        } else {
            str = null;
        }
        preferencesApiManager2.saveUserName(str);
        this.f78933c.saveClientSegment(clientInfoWrapper.getClient().clientCategory);
        if (clientInfoWrapper.getVocativeNames() != null) {
            String str4 = clientInfoWrapper.getVocativeNames().f81383ge;
            C41536l.m120488h(str4, "clientInfoWrapper.vocativeNames.ge");
            String str5 = clientInfoWrapper.getVocativeNames().f81382en;
            C41536l.m120488h(str5, "clientInfoWrapper.vocativeNames.en");
            str3 = str4;
            str2 = str5;
        } else {
            str3 = "";
            str2 = str3;
        }
        this.f78933c.saveUserNames(this.f78932b.getLoginInfo().mo90307d(), clientInfoWrapper.getClient().firstName, clientInfoWrapper.getClient().getName(), clientInfoWrapper.getClient().firstNameInt, clientInfoWrapper.getClient().getNameInt(), str3, str2);
        int a = C32335t0.m95356a(clientInfoWrapper.getClient().getClientCategoryEnum());
        if (a != this.f78933c.getThemeType()) {
            this.f78933c.saveThemeType(a);
        }
        this.f78933c.setIsSoloClub(clientInfoWrapper.isSoloClub());
        this.f78933c.setIsSoloX(clientInfoWrapper.isSoloX());
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public final void m94518S(C36875c cVar, ClientInfoWrapper clientInfoWrapper) {
        String str;
        boolean z;
        C36546y.m108282F().mo27146Q(Long.valueOf(cVar.mo89815d()));
        C36546y.m108285N().mo89327t0(C10146d0.C10159c.m37143b().getToken(), String.valueOf(cVar.mo89815d()));
        C36546y.m108282F().mo27134E("password");
        UserInfo client = clientInfoWrapper.getClient();
        String str2 = null;
        if (client != null) {
            str = client.clientSubCategory;
        } else {
            str = null;
        }
        boolean z2 = false;
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C10463g F = C36546y.m108282F();
            UserInfo client2 = clientInfoWrapper.getClient();
            if (client2 != null) {
                str2 = client2.clientSubCategory;
            }
            F.mo27142M(str2);
        }
        String clientKey = clientInfoWrapper.getClient().getClientKey();
        if (clientKey == null || C40439w.m117118v(clientKey)) {
            z2 = true;
        }
        if (!z2) {
            C36546y.m108282F().mo27143N(clientInfoWrapper.getClient().getClientKey());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public final void m94519T() {
        C41536l.m120488h(this.f78931a.triggerLoginChanges(BankApi.SERVICE_COMMON_TRIGGER_LOGIN_CHANGES).mo95070I(new C32088g(C32098g.f78947d), new C32089h(C32099h.f78948d)), "service.triggerLoginChan…       .subscribe({}, {})");
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public static final void m94520U(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static final void m94521V(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static final void m94522W(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static final void m94523X(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40749p mo72556a() {
        return this.f78936f;
    }

    /* renamed from: b */
    public String mo72557b() {
        return C10146d0.C10159c.m37143b().getUserInfo().getAvatarUrl();
    }

    /* renamed from: c */
    public List mo72558c() {
        return this.f78934d.mo88910d(C10146d0.C10159c.m37143b().getUserInfo().getPhones());
    }

    /* renamed from: d */
    public C36873a mo72559d(boolean z) {
        T t;
        boolean z2;
        List<UserContact> mails = C10146d0.C10159c.m37143b().getUserInfo().getMails();
        if (mails == null) {
            return null;
        }
        Iterator<T> it = mails.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Boolean b = ((UserContact) t).mo88419b();
            boolean z3 = false;
            if (b != null) {
                z2 = b.booleanValue();
            } else {
                z2 = false;
            }
            if (z2 == z) {
                z3 = true;
                continue;
            }
            if (z3) {
                break;
            }
        }
        UserContact userContact = (UserContact) t;
        if (userContact != null) {
            return this.f78934d.mo88907a(userContact);
        }
        return null;
    }

    /* renamed from: e */
    public void mo72560e() {
        C10146d0.C10148b.m37118r();
    }

    /* renamed from: f */
    public C40734b mo72561f(int i, FragmentManager fragmentManager) {
        C41536l.m120489i(fragmentManager, "fragmentManager");
        return C10146d0.C10148b.m37112k(i, fragmentManager);
    }

    /* renamed from: g */
    public void mo72562g(Context context, C10146d0.C10172e.C10173a aVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(aVar, "builder");
        C10146d0.f28134c.mo26707c(context, m94511L(aVar.mo26741i(new C32093c(this))).mo26733a());
        C10146d0.C10148b.m37119t(new C32084c());
    }

    /* renamed from: h */
    public void mo72563h(C40736c cVar) {
        C41536l.m120489i(cVar, "emitter");
        C41536l.m120488h(C32343x.m95465l1(m94507H()).mo95070I(new C32082a(new C32100i(this, cVar)), new C32083b(new C32101j(cVar))), "override fun updateUserI…rror(it)\n        })\n    }");
    }

    /* renamed from: i */
    public void mo72564i() {
        C10146d0.C10148b.m37113l();
        this.f78938h = null;
        this.f78932b.clearSessionData();
        this.f78936f.onNext(Boolean.FALSE);
        C36546y.m108282F().mo27151r();
    }

    /* renamed from: j */
    public C36875c mo72565j() {
        return this.f78938h;
    }

    /* renamed from: k */
    public void mo72566k() {
        C10146d0.f28134c.mo26708d();
    }

    /* renamed from: l */
    public C40749p mo72567l() {
        return this.f78937g;
    }

    /* renamed from: m */
    public List mo72568m() {
        return this.f78934d.mo88908b(C10146d0.C10159c.m37143b().getUserInfo().getMails());
    }

    /* renamed from: n */
    public C37228a mo72569n() {
        C36875c cVar;
        if (!m94512M() || (cVar = this.f78938h) == null) {
            return null;
        }
        C41536l.m120486f(cVar);
        long d = cVar.mo89815d();
        String b = cVar.mo89813b();
        long c = cVar.mo89814c();
        String username = C10146d0.C10159c.m37143b().getUserInfo().getUsername();
        C41536l.m120486f(username);
        return new C37228a(d, b, c, username);
    }

    /* renamed from: o */
    public C36874b mo72570o(boolean z) {
        T t;
        boolean z2;
        List<UserContact> phones = C10146d0.C10159c.m37143b().getUserInfo().getPhones();
        if (phones == null) {
            return null;
        }
        Iterator<T> it = phones.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Boolean b = ((UserContact) t).mo88419b();
            boolean z3 = false;
            if (b != null) {
                z2 = b.booleanValue();
            } else {
                z2 = false;
            }
            if (z2 == z) {
                z3 = true;
                continue;
            }
            if (z3) {
                break;
            }
        }
        UserContact userContact = (UserContact) t;
        if (userContact != null) {
            return this.f78934d.mo88909c(userContact);
        }
        return null;
    }
}

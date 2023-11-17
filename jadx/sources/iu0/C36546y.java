package iu0;

import ae1.C40293a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.C0238h;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1644x;
import androidx.work.C1950b;
import androidx.work.C1954c;
import androidx.work.C1961f;
import androidx.work.C2075n;
import androidx.work.C2086r;
import androidx.work.C2094x;
import ba1.C10146d0;
import ca1.C10379a;
import com.google.firebase.crashlytics.C5263a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MDResultCallback;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.sfmcsdk.InitializationStatus;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkModuleConfig;
import d51.C31539b;
import f10.C20329a;
import g91.C32308h0;
import g91.C32316l;
import g91.C32330r0;
import g91.C32335t0;
import g91.C32340v0;
import g91.C32359z0;
import he0.C24981c;
import he1.C41238w;
import j51.C36735g;
import j51.C36736h;
import j51.C36739k;
import j51.C36742n;
import j51.C36744p;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import jg1.C41438c;
import jg1.C41452l;
import m11.C37196a;
import p111i0.C6502a;
import p337z7.Task;
import p341ge.bog.chat.data.ChatUser;
import p341ge.bog.mobilebank.broadcastreceiver.C13931a;
import p341ge.bog.mobilebank.eventbus.event.CcyRatesSuccessEvent;
import p341ge.bog.mobilebank.eventbus.event.ExternalUserStoredEvent;
import p341ge.bog.mobilebank.eventbus.events.MapObjectsEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.datareport.DataGatheringParams;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.widgets.atms.ServicePointsWidgetProvider;
import p341ge.bog.mobilebank.p975ui.widgets.rates.CurrencyRatesWidgetProvider;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RatesErrorEvent;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p341ge.bog.mobilebank.rest.model.BogUrlHelper;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.services.datagathering.InstalledAppsDataReportWorker;
import p341ge.bog.mobilebank.services.datagathering.LocationWifiDataReportWorker;
import p341ge.bog.mobilebank.shared2.environment.EnvironmentType;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p366bk.C10316e;
import p366bk.C10320i;
import p366bk.C10329r;
import p380ck.C10463g;
import p380ck.C10464h;
import p397dm.C12325c;
import p405eg.C12450f0;
import p419fg.C12874c;
import p653wf.C18569a;
import p726cs.C19792a;
import p748eu.C20291a;
import p748eu.C20292b;
import p748eu.C20293c;
import p748eu.C20295e;
import p758fu.C20557a;
import p851ou.C27082a;
import p851ou.C27084b;
import q61.C38134b;

/* renamed from: iu0.y */
public abstract class C36546y extends Application implements C1950b.C1953c, C12450f0 {

    /* renamed from: B */
    private static C10463g f88047B;

    /* renamed from: C */
    private static C36546y f88048C;

    /* renamed from: A */
    private final C12325c f88049A = new C12325c();

    /* renamed from: d */
    Client f88050d;

    /* renamed from: e */
    protected C41438c f88051e;

    /* renamed from: f */
    RootBankApiManager f88052f;

    /* renamed from: g */
    PreferencesApiManager f88053g;

    /* renamed from: h */
    RetrofitClient f88054h;

    /* renamed from: i */
    C19792a f88055i;

    /* renamed from: j */
    C20293c f88056j;

    /* renamed from: k */
    C20291a f88057k;

    /* renamed from: l */
    C20292b f88058l;

    /* renamed from: m */
    C18569a f88059m;

    /* renamed from: n */
    C27082a f88060n;

    /* renamed from: o */
    public C27084b f88061o;

    /* renamed from: p */
    C36742n f88062p;

    /* renamed from: q */
    C36739k f88063q;

    /* renamed from: r */
    C36736h f88064r;

    /* renamed from: s */
    C36735g f88065s;

    /* renamed from: t */
    C31539b f88066t;

    /* renamed from: u */
    C36744p f88067u;

    /* renamed from: v */
    C6502a f88068v;

    /* renamed from: w */
    TargetEnvironment f88069w;

    /* renamed from: x */
    C20295e f88070x;

    /* renamed from: y */
    private C35388f2 f88071y;

    /* renamed from: z */
    private C20329a f88072z;

    /* renamed from: iu0.y$a */
    class C36547a implements MDResultCallback {
        C36547a() {
        }

        public void onError(MDExternalError mDExternalError) {
        }

        public void onSuccess() {
            MedalliaDigital.setCustomParameter("clientType", "Individual");
            try {
                MedalliaDigital.setCustomParameter("buildType", "release");
                MedalliaDigital.setCustomParameter("clientKey", C36546y.m108285N().mo89317P().getExtCustomerId().substring(0, 30));
                String clientSegment = PreferencesApiManager.getInstance().getClientSegment();
                if (TextUtils.isEmpty(clientSegment)) {
                    clientSegment = "RB";
                }
                MedalliaDigital.setCustomParameter("segment", clientSegment);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: C */
    private Boolean m108279C() {
        if (!C32330r0.m95338m(this, "android.permission.ACCESS_FINE_LOCATION")) {
            return Boolean.FALSE;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(C32330r0.m95338m(this, "android.permission.ACCESS_BACKGROUND_LOCATION"));
    }

    /* renamed from: D */
    private void m108280D(C35388f2 f2Var) {
        if (f2Var == this.f88071y) {
            this.f88071y = null;
        }
    }

    /* renamed from: E */
    private void m108281E() {
        try {
            FileOutputStream openFileOutput = openFileOutput("bg_bck_up", 0);
            openFileOutput.write("io".getBytes());
            openFileOutput.close();
            this.f88053g.setSaveFcmVersionInstalled();
        } catch (Exception unused) {
        }
    }

    /* renamed from: F */
    public static synchronized C10463g m108282F() {
        C10463g gVar;
        synchronized (C36546y.class) {
            if (f88047B == null) {
                C36546y yVar = f88048C;
                f88047B = C10463g.m37997g(yVar, yVar.f88050d);
            }
            gVar = f88047B;
        }
        return gVar;
    }

    /* renamed from: G */
    private C10379a m108283G() {
        return new C36534m();
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public Drawable m108284H() {
        int i = C10329r.AppTheme;
        if (C32335t0.m95361f() == 1) {
            i = C10329r.SoloThemeBase;
        } else if (C32335t0.m95361f() == 2) {
            i = C10329r.WealthThemeBase;
        }
        int resourceId = getTheme().obtainStyledAttributes(i, new int[]{C10316e.app_logo}).getResourceId(0, 0);
        if (this.f88069w.getType() != EnvironmentType.PRODUCTION) {
            resourceId = C10320i.icons_24_general_setting;
        }
        return C0767a.m2895e(this, resourceId);
    }

    /* renamed from: N */
    public static C36546y m108285N() {
        return f88048C;
    }

    /* renamed from: Q */
    private void m108286Q() {
        String username = this.f88053g.getUsername();
        String authToken = this.f88053g.getAuthToken(username);
        Boolean isPasscodeEnabled = this.f88053g.isPasscodeEnabled();
        Boolean isFingerPrintEnabled = this.f88053g.isFingerPrintEnabled();
        String extCustomer = this.f88053g.getExtCustomer(true);
        C1644x xVar = new C1644x();
        xVar.mo4820l(new C36524c(this));
        this.f88063q.mo89565a(this, new C10146d0.C10172e.C10173a(C10146d0.C10172e.C10174b.WINDOWED).mo26740h(this.f88069w.getSso()).mo26734b(this.f88069w.getSsoChannel(), this.f88069w.getSsoSecret()).mo26746n(this.f88053g.isHttpRequestsLoggingEnabled()).mo26748p(username).mo26744l(extCustomer).mo26743k(authToken, isPasscodeEnabled.booleanValue(), isFingerPrintEnabled.booleanValue(), new C36525d(this, username)).mo26745m(xVar).mo26737e(new C36526e(this)).mo26739g(new C13931a()).mo26736d(new C36527f(), new C36528g(this)).mo26738f(C20329a.m66401i(this)).mo26735c(new C36529h()).mo26742j(m108283G()));
        this.f88053g.setExtCustomer((String) null);
    }

    /* renamed from: R */
    private boolean m108287R() {
        try {
            return new File(getFilesDir(), "bg_bck_up").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static /* synthetic */ void m108288S(String str, String str2, String str3, Bundle bundle, C10379a.C10381b bVar) {
        C10464h.C10465a aVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("event_name", str);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("label", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString(UrlHandler.ACTION, str2);
        }
        C10463g F = m108282F();
        if (bVar == C10379a.C10381b.FIREBASE) {
            aVar = C10464h.C10465a.FIREBASE;
        } else if (bVar == C10379a.C10381b.FACEBOOK) {
            aVar = C10464h.C10465a.FACEBOOK;
        } else {
            aVar = C10464h.C10465a.FACEBOOKANDFIREBASE;
        }
        F.mo27137H(str, str2, str3, bundle2, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m108289T(String str) {
        int i;
        this.f88053g.setLastUsedExtCustId(str);
        this.f88054h.setExtCustomerId(str);
        ExternalUserStoredEvent externalUserStoredEvent = new ExternalUserStoredEvent();
        if (str == null) {
            i = 40;
        } else {
            i = 20;
        }
        externalUserStoredEvent.setState(i);
        this.f88051e.mo96184m(externalUserStoredEvent);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ C41238w m108290U(String str) {
        this.f88053g.setAuthToken(str, "");
        this.f88053g.saveUserName("");
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ String m108291V() {
        return this.f88053g.getFcmToken();
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m108292W(Task task) {
        if (task.mo24873r()) {
            String str = (String) task.mo24869n();
            PreferencesApiManager.getInstance().saveFcmToken(str);
            m108329w0(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static /* synthetic */ void m108293X() {
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ void m108294Y(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m108295Z(Boolean bool) {
        if (bool.booleanValue()) {
            m108314m0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static /* synthetic */ void m108296a0(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m108297b0(Boolean bool) {
        if (bool.booleanValue()) {
            m108319q0();
        } else {
            this.f88059m.mo33788b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public static /* synthetic */ void m108298c0(C12874c cVar) {
        MedalliaDigital.setCustomParameter("event", "chat_ended");
        MedalliaDigital.setCustomParameter("chatUserId", cVar.mo33566a());
        MedalliaDigital.setCustomParameter("conversationId", cVar.mo33567b());
        MedalliaDigital.setCustomParameter("participantId", cVar.mo33569d());
        MedalliaDigital.setCustomParameter("chatFromNickname", cVar.mo33568c());
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public static /* synthetic */ boolean m108299d0(Throwable th) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public static /* synthetic */ void m108300e0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public static /* synthetic */ void m108301f0(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m108304h0(String str, String str2, SFMCSdk sFMCSdk) {
        sFMCSdk.identity.setProfileId(str);
        sFMCSdk.identity.setProfileAttribute("CustomContactKey", str);
        sFMCSdk.identity.setProfileAttribute("FcmToken", str2);
        if (m108279C().booleanValue() && this.f88053g.hasGeofenceEnabled()) {
            sFMCSdk.mo31149mp(new C36537p());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static /* synthetic */ C41238w m108306i0(InitializationStatus initializationStatus) {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ C41238w m108312l0(SFMCSdkModuleConfig.Builder builder) {
        builder.setPushModuleConfig(C24981c.m79849a(this.f88053g).build(this));
        return null;
    }

    /* renamed from: m0 */
    private void m108314m0() {
        C20557a a = this.f88058l.mo48774a("DATA_GATHERING_PARAMS");
        if (a != null && a.mo49085b() != null) {
            try {
                DataGatheringParams dataGatheringParams = (DataGatheringParams) new Gson().mo18165g(a.mo49085b(), DataGatheringParams.class);
                if (dataGatheringParams == null) {
                    C2094x.m8110g(this).mo6815a("DATA_GATHERING_WORKERS_TAG");
                    return;
                }
                m108327v0(LocationWifiDataReportWorker.class, "LOCATION_WIFI_DATA_REPORT_JOB", dataGatheringParams.getLocationDataSendPeriod());
                m108327v0(InstalledAppsDataReportWorker.class, "INSTALLED_APPS_INFO_REPORT_JOB", dataGatheringParams.getAppDataSendPeriod());
            } catch (JsonSyntaxException e) {
                C35388f2 f2Var = this.f88071y;
                if (f2Var != null) {
                    f2Var.mo74709H1(e);
                }
            }
        }
    }

    /* renamed from: q0 */
    private void m108319q0() {
        C32340v0.m95375a();
        C32308h0.m95236a();
        m108322s0();
        this.f88057k.mo48773a().mo94996P().mo95092y().mo94882A().mo94895d(this.f88061o.mo66336b().mo94883B(new C36530i())).mo94888G(new C36531j(), new C36532k());
        C32316l.m95278a(new C37196a.C37199c(C32316l.m95279b(this.f88053g.getDarkModeType())), m108282F());
    }

    /* renamed from: s0 */
    private void m108322s0() {
        if (this.f88050d.getUserInfo() != null && this.f88050d.getUserInfo().getClient() != null && this.f88050d.getUserInfo().getClient().getClientKey() != null) {
            String clientKey = this.f88050d.getUserInfo().getClient().getClientKey();
            this.f88053g.saveClientKey(clientKey);
            SFMCSdk.requestSdk(new C36535n(this, clientKey, this.f88053g.getFcmToken()));
        }
    }

    /* renamed from: u0 */
    private void m108325u0() {
        String W = C32359z0.m95552W(this);
        if (!TextUtils.isEmpty(W)) {
            PreferencesApiManager preferencesApiManager = this.f88053g;
            preferencesApiManager.saveFcmByDeviceID(W, preferencesApiManager.getFcmToken());
        }
    }

    /* renamed from: v0 */
    private void m108327v0(Class cls, String str, int i) {
        boolean z;
        C1961f fVar;
        C2094x g = C2094x.m8110g(this);
        if (i < 0) {
            g.mo6816b(str);
            return;
        }
        if (this.f88053g.getDataReportInterval(str) != i) {
            z = true;
        } else {
            z = false;
        }
        this.f88053g.setDataReportInterval(str, i);
        C2086r rVar = (C2086r) ((C2086r.C2087a) ((C2086r.C2087a) new C2086r.C2087a(cls, (long) i, TimeUnit.SECONDS).mo6986a("DATA_GATHERING_WORKERS_TAG")).mo6992i(new C1954c.C1955a().mo6721b(C2075n.CONNECTED).mo6720a())).mo6987b();
        if (z) {
            fVar = C1961f.REPLACE;
        } else {
            fVar = C1961f.KEEP;
        }
        g.mo6819f(str, fVar, rVar);
    }

    /* renamed from: w0 */
    private void m108329w0(String str) {
        if (str != null) {
            SFMCSdk.requestSdk(new C36544w(str));
        }
        SFMCSdk.configure(getApplicationContext(), SFMCSdkModuleConfig.build(new C36545x(this)), new C36523b());
    }

    /* renamed from: x0 */
    private void m108331x0() {
        MedalliaDigital.init(this, "eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhcGlUb2tlblYyIiwiYXV0aFVybCI6Imh0dHBzOi8vbW9iaWxlc2RrLWV1LmthbXB5bGUuY29tL2FwaS92MS9hY2Nlc3NUb2tlbiIsImNyZWF0ZVRpbWUiOjE1NTYyMjA5ODk3NzcsImFwaVRva2VuVjJWZXJzaW9uIjoyLCJwcm9wZXJ0eUlkIjozMDkxNTF9.cLwOK0RH2ul_yYJ4TETs2ZmQdVuCbfD0nbm1BQ0AYMd1cDrVdslM2b5FChtlpxDGR4YmTnTZKR-4SxAtBRFJwLRgZCm5h8vrfTYISVIwWzQf1d4VVReHYqkwvvBuK5oCcwRPp6v0zGx_P1blntsqtmOYAbiOyYdaV8vM7fTM-CbLrm960fxH-oHRDNV3uwvd6XG3-rq9qvVCSOb3VQ3hOx0XBzjIKqOXP28zmf4Xd7-DrAcqq_rTqa_KQmZa9Tf9KzdE5jWyTWuMAmRvk6fdsr4S5xqpJLKH33zJnPLyDSrVDJ-92vHEMQNC1byRl3hBF5C2jMYwDc4bg4dMNL4mxw", new C36547a());
    }

    /* renamed from: I */
    public C20292b mo89311I() {
        return this.f88058l;
    }

    /* renamed from: J */
    public ChatUser mo89312J(boolean z, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Long l = 0L;
        String str9 = "";
        if (!z) {
            str5 = str;
            str4 = str2;
        } else {
            str5 = str9;
            str4 = str5;
        }
        if (this.f88050d.isAuthorized()) {
            l = Long.valueOf(this.f88065s.mo89562a().mo90306c());
        }
        if (this.f88050d.getUserInfo() == null || this.f88050d.getUserInfo().getClient() == null) {
            str7 = str9;
            str6 = str7;
        } else {
            if (this.f88050d.getUserInfo().getClient().getFirstName() != null) {
                str8 = this.f88050d.getUserInfo().getClient().getFirstName();
            } else {
                str8 = str9;
            }
            if (this.f88050d.getUserInfo().getClient().getLastName() != null) {
                str9 = this.f88050d.getUserInfo().getClient().getLastName();
            }
            str6 = str9;
            str7 = str8;
        }
        return new ChatUser(l.longValue(), str5, str4, str7, str6, "Mobile Bank Android", C32359z0.m95535F(), String.valueOf(C32359z0.m95533D()), String.valueOf(496), this.f88053g.getLanguage().mo90433b(), BogUrlHelper.getChannel(this.f88050d.isAuthorized()), str3);
    }

    /* renamed from: K */
    public Client mo89313K() {
        return this.f88050d;
    }

    /* renamed from: L */
    public C35388f2 mo89314L() {
        return this.f88071y;
    }

    /* renamed from: M */
    public String mo89315M() {
        String extCustomer = this.f88053g.getExtCustomer();
        if (!this.f88050d.isAuthorized() || this.f88065s.mo89562a() == null || this.f88065s.mo89562a().mo90305b() == 0) {
            return extCustomer;
        }
        return String.valueOf(this.f88065s.mo89562a().mo90305b());
    }

    /* renamed from: O */
    public PreferencesApiManager mo89316O() {
        return this.f88053g;
    }

    /* renamed from: P */
    public RetrofitClient mo89317P() {
        return this.f88054h;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C20329a i = C20329a.m66401i(context);
        this.f88072z = i;
        Context f = i.mo48810f(context);
        Configuration configuration = new Configuration(f.getResources().getConfiguration());
        configuration.uiMode = 0;
        super.attachBaseContext(f.createConfigurationContext(configuration));
    }

    /* renamed from: e */
    public Context mo33061e(Context context) {
        return this.f88072z.mo26768b(context);
    }

    /* renamed from: f */
    public C1950b mo6708f() {
        return new C1950b.C1952b().mo6707b(this.f88068v).mo6706a();
    }

    /* renamed from: n0 */
    public void mo89319n0(C35388f2 f2Var) {
        m108280D(f2Var);
    }

    /* renamed from: o0 */
    public void mo89320o0(C35388f2 f2Var) {
        m108280D(f2Var);
    }

    @C41452l
    public void onCcyRatesErrorEvent(RatesErrorEvent ratesErrorEvent) {
        Intent intent = new Intent("ge.bog.mobilebank.ACTION_CURRENCY_RATES_UPDATED");
        intent.setClass(this, CurrencyRatesWidgetProvider.class);
        sendBroadcast(intent);
    }

    @C41452l
    public void onCcyRatesSuccessEvent(CcyRatesSuccessEvent ccyRatesSuccessEvent) {
        this.f88053g.syncCcyRates(ccyRatesSuccessEvent.getRates());
        Intent intent = new Intent("ge.bog.mobilebank.ACTION_CURRENCY_RATES_UPDATED");
        intent.setClass(this, CurrencyRatesWidgetProvider.class);
        sendBroadcast(intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C20329a aVar = this.f88072z;
        if (aVar != null && this.f88053g != null) {
            aVar.mo48810f(this);
        }
    }

    public void onCreate() {
        boolean z;
        String str;
        super.onCreate();
        C0238h.m789O(this.f88053g.getDarkModeType().getValue());
        C40293a.m116702A(new C36522a());
        m108331x0();
        f88048C = this;
        this.f88051e.mo96185q(this);
        C32335t0.m95369n(this);
        if (!this.f88053g.wasSaveFcmVersionInstalled()) {
            m108281E();
        } else if (!m108287R()) {
            String W = C32359z0.m95552W(this);
            if (!TextUtils.isEmpty(W)) {
                str = this.f88053g.getSavedFcmByDeviceId(W);
            } else {
                str = null;
            }
            this.f88053g.clearAllData();
            if (!TextUtils.isEmpty(str)) {
                this.f88053g.saveFcmByDeviceID(W, str);
            }
        }
        FirebaseMessaging.m20930l().mo17533o().mo24858c(new C36533l(this));
        m108286Q();
        this.f88070x.mo48778a();
        if (this.f88053g.getExtCustomer() != null) {
            m108325u0();
        }
        String userID = this.f88053g.getUserID();
        if (!TextUtils.isEmpty(userID)) {
            m108282F().mo27147R(userID);
        }
        if (this.f88053g.getCurrentDBVersion() == 30 && this.f88053g.getAppVersionCode() == 496) {
            z = false;
        } else {
            z = true;
        }
        this.f88057k.mo48773a().mo94996P().mo95092y().mo94882A().mo94895d(this.f88060n.mo66334b(z)).mo94888G(new C36538q(), new C36539r());
        if (this.f88053g.getExtCustomer() != null && System.currentTimeMillis() - this.f88053g.getMapsLastSyncDate() > C38134b.f91551b) {
            this.f88052f.getMapObjects(true);
        }
        this.f88053g.setAppVersionCode(496);
        this.f88057k.mo48773a().mo94983G0(new C36540s(this), new C36541t());
        m108282F().mo27144O(PreferencesApiManager.getInstance().getLanguage().mo90434c());
        this.f88062p.mo89567a().mo94981F0(new C36542u(this));
        this.f88059m.mo33791e().mo94981F0(new C36543v());
        registerReceiver(this.f88049A, new IntentFilter("android.intent.action.MY_PACKAGE_REPLACED"));
    }

    @C41452l
    public void onMapObjectsEvent(MapObjectsEvent mapObjectsEvent) {
        if (mapObjectsEvent.getState() == 20) {
            this.f88053g.syncMapObject(mapObjectsEvent.getMapObjects());
            Intent intent = new Intent("ge.bog.mobilebank.model.map.ACTION_MAP_OBJECTS_LOADED");
            intent.setClass(this, ServicePointsWidgetProvider.class);
            sendBroadcast(intent);
        }
    }

    /* renamed from: p0 */
    public void mo89325p0(C35388f2 f2Var) {
        this.f88071y = f2Var;
    }

    /* renamed from: r0 */
    public void mo89326r0() {
        this.f88067u.mo89568a();
    }

    /* renamed from: t0 */
    public void mo89327t0(String str, String str2) {
        this.f88053g.saveUserID(str2);
        C5263a.m20766a().mo17445e("keycloakSessionToken", str);
    }
}

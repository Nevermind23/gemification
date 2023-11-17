package com.medallia.digital.mobilesdk;

import android.os.Build;
import com.medallia.digital.mobilesdk.C10749b8;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11158w0;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.m4 */
final class C10998m4 implements C10769c8 {

    /* renamed from: A */
    private static final String f31569A = "60";

    /* renamed from: B */
    private static C10998m4 f31570B = null;

    /* renamed from: q */
    private static final String f31571q = "tre-version";

    /* renamed from: r */
    private static final String f31572r = "deviceModel";

    /* renamed from: s */
    private static final String f31573s = "osVersion";

    /* renamed from: t */
    private static final String f31574t = "sdkVersion";

    /* renamed from: u */
    private static final String f31575u = "osType";

    /* renamed from: v */
    private static final String f31576v = "deviceVendor";

    /* renamed from: w */
    private static final String f31577w = "locale";

    /* renamed from: x */
    private static final String f31578x = "mimeType";

    /* renamed from: y */
    private static final String f31579y = "customDomain";

    /* renamed from: z */
    private static final String f31580z = "ttlMinutes";

    /* renamed from: a */
    private C10812f6 f31581a = new C10812f6(this.f31583c, this.f31582b);

    /* renamed from: b */
    private int f31582b;

    /* renamed from: c */
    private int f31583c;

    /* renamed from: d */
    private String f31584d;

    /* renamed from: e */
    private String f31585e;

    /* renamed from: f */
    private String f31586f;

    /* renamed from: g */
    private String f31587g;

    /* renamed from: h */
    private long f31588h;

    /* renamed from: i */
    private long f31589i;

    /* renamed from: j */
    private C10894j f31590j = new C10894j(C11089s6.m40668b().mo28980a(C11089s6.C11090a.PREVIOUS_ANALYTICS_V2, false), C11089s6.m40668b().mo28980a(C11089s6.C11090a.PREVIOUS_SEND_USER_JOURNEY, false));

    /* renamed from: k */
    private C10819g f31591k;

    /* renamed from: l */
    private Boolean f31592l;

    /* renamed from: m */
    private int f31593m;

    /* renamed from: n */
    private int f31594n;

    /* renamed from: o */
    private C11099t4 f31595o;

    /* renamed from: p */
    private String f31596p;

    /* renamed from: com.medallia.digital.mobilesdk.m4$a */
    class C10999a implements C11158w0.C11160b {

        /* renamed from: a */
        final /* synthetic */ HashMap f31597a;

        C10999a(HashMap hashMap) {
            this.f31597a = hashMap;
        }

        /* renamed from: a */
        public C11063q0 mo28758a() {
            return new C11063q0(C10718a3.m39038c().mo28069a().mo28094c(), (HashMap<String, String>) null, this.f31597a, (JSONObject) null);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.m4$c */
    enum C11001c {
        API_TOKEN,
        ACCESS_TOKEN
    }

    private C10998m4() {
    }

    /* renamed from: a */
    private String m40263a() {
        return mo28731a(this.f31595o);
    }

    /* renamed from: g */
    private HashMap<String, String> m40265g() {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put(f31574t, URLEncoder.encode("4.1.5", "UTF-8"));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        try {
            hashMap.put(f31575u, URLEncoder.encode("android", "UTF-8"));
        } catch (Exception e2) {
            C10735b4.m39111c(e2.getMessage());
        }
        return hashMap;
    }

    /* renamed from: h */
    protected static C10998m4 m40266h() {
        if (f31570B == null) {
            f31570B = new C10998m4();
        }
        return f31570B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo28745b() {
        return this.f31588h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo28747c() {
        return this.f31586f;
    }

    public void clearAndDisconnect() {
        C10735b4.m39107a(C10998m4.class.getSimpleName());
        this.f31581a = null;
        f31570B = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C10894j mo28748d() {
        return this.f31590j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo28749e() {
        return this.f31593m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo28750f() {
        return this.f31594n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo28751i() {
        return this.f31583c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public long mo28752j() {
        return this.f31589i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C10812f6 mo28753k() {
        return this.f31581a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public String mo28754l() {
        return this.f31585e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo28755m() {
        return this.f31584d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo28756n() {
        return this.f31582b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String mo28757o() {
        return this.f31587g;
    }

    /* renamed from: com.medallia.digital.mobilesdk.m4$b */
    class C11000b implements C10796e6<String> {

        /* renamed from: a */
        final /* synthetic */ C10796e6 f31599a;

        C11000b(C10796e6 e6Var) {
            this.f31599a = e6Var;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            this.f31599a.mo27796a(h4Var);
        }

        /* renamed from: a */
        public void mo27797a(String str) {
            this.f31599a.mo27797a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28731a(C11099t4 t4Var) {
        return t4Var.mo29007d() + t4Var.mo29006c() + t4Var.mo29005b() + t4Var.mo29009f() + t4Var.mo29004a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28746b(C10796e6<Void> e6Var, JSONObject jSONObject) {
        C10735b4.m39109b("submitAnalytics V2 was called");
        Boolean bool = this.f31592l;
        if (bool != null && bool.booleanValue()) {
            new C11130u6(this.f31581a, new C11063q0(this.f31591k.mo28324c(), this.f31591k.mo28322a(), this.f31591k.mo28323b()), jSONObject, e6Var, true).mo28878c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HashMap<String, String> mo28732a(C11173w4 w4Var) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put(f31578x, w4Var.mo29141f());
            hashMap.put(f31579y, "true");
            hashMap.put(f31580z, f31569A);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28733a(int i, int i2, long j, long j2, int i3, int i4) {
        C10735b4.m39109b(m40266h().getClass().getSimpleName() + " initialized");
        mo28734a(i, i2, (String) null, j, j2, i3, i4, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28734a(int i, int i2, String str, long j, long j2, int i3, int i4, String str2) {
        this.f31582b = i;
        this.f31583c = i2;
        this.f31585e = str;
        this.f31587g = C11089s6.m40668b().mo28975a(C11089s6.C11090a.UUID_URL, (String) null);
        this.f31589i = j;
        this.f31588h = j2;
        this.f31593m = i3;
        this.f31594n = i4;
        this.f31584d = str2;
        C10812f6 f6Var = this.f31581a;
        if (f6Var != null) {
            f6Var.mo28307a(i2, i, j);
        }
        C10735b4.m39109b("MedalliaDigitalClient updated configuration");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28735a(ConfigurationContract configurationContract) {
        if (configurationContract != null && configurationContract.getSdkConfiguration() != null && configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() != null && configurationContract.getSdkConfiguration().getMedalliaDigitalClientConfig() != null) {
            this.f31589i = (configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime().longValue() <= 0) ? C10749b8.C10751b.f30743b : configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime().longValue();
            MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfig = configurationContract.getSdkConfiguration().getMedalliaDigitalClientConfig();
            if (medalliaDigitalClientConfig.getHttpRequestTimeout() != null) {
                this.f31582b = medalliaDigitalClientConfig.getHttpRequestTimeout().intValue();
            }
            if (medalliaDigitalClientConfig.getMaxHttpRequestRetryAttempts() != null) {
                this.f31583c = medalliaDigitalClientConfig.getMaxHttpRequestRetryAttempts().intValue();
            }
            if (!(medalliaDigitalClientConfig.getSubmitUrlPrefix() == null || medalliaDigitalClientConfig.getSubmitUrlSuffix() == null)) {
                this.f31585e = String.format("%s%s", new Object[]{medalliaDigitalClientConfig.getSubmitUrlPrefix(), medalliaDigitalClientConfig.getSubmitUrlSuffix()});
            }
            if (configurationContract.getConfigurationUUID() != null) {
                this.f31587g = configurationContract.getConfigurationUUID().getUrl();
            }
            this.f31588h = medalliaDigitalClientConfig.getAccessTokenValidationBufferTime();
            if (!(medalliaDigitalClientConfig.getAnalyticsV2ConfigurationContract() == null || medalliaDigitalClientConfig.getAnalyticsV2ConfigurationContract().mo28500b() == null)) {
                this.f31593m = medalliaDigitalClientConfig.getAnalyticsV2ConfigurationContract().mo28500b().intValue();
            }
            if (!(medalliaDigitalClientConfig.getAnalyticsV2ConfigurationContract() == null || medalliaDigitalClientConfig.getAnalyticsV2ConfigurationContract().mo28501c() == null)) {
                this.f31594n = medalliaDigitalClientConfig.getAnalyticsV2ConfigurationContract().mo28501c().intValue();
            }
            if (medalliaDigitalClientConfig.getMediaCaptureConfiguration() != null) {
                C11099t4 mediaCaptureConfiguration = medalliaDigitalClientConfig.getMediaCaptureConfiguration();
                this.f31595o = mediaCaptureConfiguration;
                if (!(mediaCaptureConfiguration.mo29004a() == null || this.f31595o.mo29005b() == null || this.f31595o.mo29007d() == null)) {
                    this.f31584d = m40263a();
                }
            }
            mo28734a(this.f31582b, this.f31583c, this.f31585e, this.f31589i, this.f31588h, this.f31593m, this.f31594n, this.f31584d);
            m40264a(medalliaDigitalClientConfig);
        }
    }

    /* renamed from: a */
    private void m40264a(MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfigurationContract) {
        if (medalliaDigitalClientConfigurationContract == null) {
            C10735b4.m39114f("MedalliaDigitalClientConfigurationContract is null");
            return;
        }
        if (medalliaDigitalClientConfigurationContract.getHttpRequestTimeout() != null) {
            this.f31582b = medalliaDigitalClientConfigurationContract.getHttpRequestTimeout().intValue();
        }
        if (medalliaDigitalClientConfigurationContract.getMaxHttpRequestRetryAttempts() != null) {
            this.f31583c = medalliaDigitalClientConfigurationContract.getMaxHttpRequestRetryAttempts().intValue();
        }
        boolean z = true;
        if (!(medalliaDigitalClientConfigurationContract.getSubmitUrlPrefix() == null || medalliaDigitalClientConfigurationContract.getSubmitUrlSuffix() == null)) {
            this.f31585e = String.format("%s%s", new Object[]{medalliaDigitalClientConfigurationContract.getSubmitUrlPrefix(), medalliaDigitalClientConfigurationContract.getSubmitUrlSuffix()});
        }
        Boolean isAnalyticsEnabled = medalliaDigitalClientConfigurationContract.isAnalyticsEnabled();
        this.f31592l = isAnalyticsEnabled;
        if (isAnalyticsEnabled != null) {
            z = isAnalyticsEnabled.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.f31592l = valueOf;
        C10819g gVar = null;
        this.f31586f = valueOf.booleanValue() ? medalliaDigitalClientConfigurationContract.getAnalyticsEndPoint() : null;
        if (this.f31592l.booleanValue() && medalliaDigitalClientConfigurationContract.getAnalyticsV2ConfigurationContract() != null) {
            gVar = medalliaDigitalClientConfigurationContract.getAnalyticsV2ConfigurationContract().mo28499a();
        }
        this.f31591k = gVar;
        if (medalliaDigitalClientConfigurationContract.getAnalyticsV2ConfigurationContract() != null) {
            this.f31590j = medalliaDigitalClientConfigurationContract.getAnalyticsV2ConfigurationContract();
            C11089s6.m40668b().mo28985b(C11089s6.C11090a.PREVIOUS_ANALYTICS_V2, this.f31590j.mo28503e());
            C11089s6.m40668b().mo28985b(C11089s6.C11090a.PREVIOUS_SEND_USER_JOURNEY, this.f31590j.mo28505g());
        }
        if (medalliaDigitalClientConfigurationContract.getMediaCaptureConfiguration() != null) {
            this.f31595o = medalliaDigitalClientConfigurationContract.getMediaCaptureConfiguration();
            this.f31584d = m40263a();
        }
        this.f31596p = medalliaDigitalClientConfigurationContract.getQuarantineValidationEndpoint();
        C10735b4.m39109b("MedalliaDigitalClientConfiguration updated");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28736a(C10796e6<Void> e6Var, JSONObject jSONObject) {
        C10735b4.m39109b("submitAnalytics was called");
        Boolean bool = this.f31592l;
        if (bool != null && bool.booleanValue()) {
            new C11130u6(this.f31581a, new C11063q0(this.f31586f, (HashMap<String, String>) null, m40265g(), (JSONObject) null), jSONObject, e6Var).mo28878c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28737a(C10812f6.C10813a aVar) {
        C10735b4.m39109b("getConfigurationUuid was called");
        String str = this.f31587g;
        if (!((str != null && !str.isEmpty()) || C11208y0.m41106c() == null || C11208y0.m41106c().mo29204a() == null || C11208y0.m41106c().mo29204a().configurationUUID == null)) {
            this.f31587g = C11208y0.m41106c().mo29204a().configurationUUID.getUrl();
        }
        new C10728a8(this.f31581a, this.f31587g).mo28091a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28738a(C10812f6 f6Var) {
        this.f31581a = f6Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28739a(C10826g2 g2Var, C10796e6<Void> e6Var) {
        C10735b4.m39109b("Submit Feedback called with feedback: " + g2Var);
        new C11153v6(this.f31581a, new C11063q0(this.f31585e, (HashMap<String, String>) null, m40265g(), (JSONObject) null), g2Var, e6Var).mo28878c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28740a(C11173w4 w4Var, C11099t4 t4Var, Boolean bool, C10796e6<String> e6Var) {
        C10735b4.m39109b("LivingLens Submit Media Feedback called with: " + w4Var.mo29138d());
        String str = this.f31584d;
        if (t4Var == null) {
            t4Var = this.f31595o;
        }
        C11099t4 t4Var2 = t4Var;
        if (bool.booleanValue()) {
            str = mo28731a(t4Var2);
        }
        new C11175w6(w4Var, t4Var2, this.f31581a, new C11063q0(str, (HashMap<String, String>) null, mo28732a(w4Var), (JSONObject) null), new C11000b(e6Var)).mo28878c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28741a(String str, C10796e6<C11235z0> e6Var) {
        C10735b4.m39109b("getConfiguration called with tre-version: " + str);
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(f31571q, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            C10735b4.m39111c(e.getMessage());
        }
        String str2 = Build.MANUFACTURER;
        if (str2 != null) {
            try {
                hashMap.put(f31576v, URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                C10735b4.m39111c(e2.getMessage());
            }
        }
        String str3 = Build.MODEL;
        if (str3 != null) {
            try {
                hashMap.put(f31572r, URLEncoder.encode(str3, "UTF-8"));
            } catch (Exception e3) {
                C10735b4.m39111c(e3.getMessage());
            }
        }
        String str4 = Build.VERSION.RELEASE;
        if (str4 != null) {
            try {
                hashMap.put(f31573s, URLEncoder.encode(str4, "UTF-8"));
            } catch (Exception e4) {
                C10735b4.m39111c(e4.getMessage());
            }
        }
        try {
            hashMap.put(f31574t, URLEncoder.encode("4.1.5", "UTF-8"));
        } catch (Exception e5) {
            C10735b4.m39111c(e5.getMessage());
        }
        try {
            String c = C11221y3.m41127d().mo29217c();
            if (c == null) {
                c = Locale.getDefault().toString();
            }
            hashMap.put("locale", URLEncoder.encode(c, "UTF-8"));
        } catch (UnsupportedEncodingException e6) {
            C10735b4.m39111c(e6.getMessage());
        }
        hashMap.putAll(m40265g());
        new C11158w0(this.f31581a, new C11063q0(this.f31587g, (HashMap<String, String>) null, m40265g(), (JSONObject) null), new C10999a(hashMap), e6Var).mo28878c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28742a(String str, String str2, C10796e6<File> e6Var) {
        mo28744a(false, str, str2, e6Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28743a(JSONObject jSONObject, C10796e6<C11174w5> e6Var) {
        C10735b4.m39109b("QuarantineValidationRules was called");
        new C11149v5(this.f31581a, new C11063q0(this.f31596p, m40265g(), jSONObject), e6Var).mo28878c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28744a(boolean z, String str, String str2, C10796e6<File> e6Var) {
        C10735b4.m39109b("getResource called with url: " + str);
        new C11200x2(this.f31581a, new C11063q0(str), str2, e6Var, z).mo28878c();
    }
}

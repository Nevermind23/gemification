package p341ge.bog.mobilebank.rest.model;

import ba1.C10146d0;
import cg1.C40446a;
import hd0.C24978b;
import i41.C36354b;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import k41.C36869a;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41913p;
import of1.C41931v;
import of1.C41935w;
import of1.C41944z;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.environment.EnvironmentType;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;

@Deprecated
/* renamed from: ge.bog.mobilebank.rest.model.RetrofitClient */
public class RetrofitClient {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int MAX_REQUEST = 40;
    public static final String USER_ADDRESS = "";
    private static RetrofitClient instance;
    private final C36869a deviceInfo;
    private final TargetEnvironment environment;
    private String extCustomerId;
    private final C36354b isInNightMode;
    private final PreferencesApiManager preferencesApiManager;

    public RetrofitClient(PreferencesApiManager preferencesApiManager2, C36869a aVar, TargetEnvironment targetEnvironment, C36354b bVar) {
        instance = this;
        this.isInNightMode = bVar;
        this.environment = targetEnvironment;
        this.deviceInfo = aVar;
        this.preferencesApiManager = preferencesApiManager2;
        this.extCustomerId = preferencesApiManager2.getLastUsedExtCustId();
    }

    private C41935w createBOGInterceptor(boolean z) {
        return new C34543a(this, z);
    }

    private C41944z createClient(long j, boolean z, boolean z2) {
        C41913p pVar = new C41913p();
        pVar.mo96881n(40);
        pVar.mo96880m(40);
        C41944z.C41945a aVar = new C41944z.C41945a();
        aVar.mo97080P(z);
        aVar.mo97079O(j, TimeUnit.SECONDS);
        aVar.mo97091a(createBOGInterceptor(z2));
        if (this.preferencesApiManager.isHttpRequestsLoggingEnabled()) {
            aVar.mo97091a(createLogging());
        }
        if (z2 || this.environment.getType() == EnvironmentType.TEST) {
            setUnsafeOkHttpClient(aVar);
        }
        return aVar.mo97103g(pVar).mo97097d();
    }

    private C40446a createLogging() {
        C40446a aVar = new C40446a();
        aVar.mo94505e(C40446a.C40447a.BODY);
        return aVar;
    }

    private String getFulURL(String str, Map<String, String> map) {
        BogUrlHelper bogUrlHelper = new BogUrlHelper(str, (String) null, isLoggedIn());
        StringBuilder sb = new StringBuilder(this.environment.getRbMiddleware());
        sb.append("?");
        sb.append("serviceId=");
        sb.append(str);
        sb.append(pupulateWithExtraData(bogUrlHelper));
        if (map != null) {
            for (String next : map.keySet()) {
                sb.append("&");
                sb.append(next);
                sb.append("=");
                sb.append(map.get(next));
            }
        }
        return sb.toString();
    }

    public static RetrofitClient getInstance() {
        return instance;
    }

    private String getSSOToken() {
        return C10146d0.C10159c.m37143b().getToken();
    }

    public static String getUrlWithExtras(String str, Map<String, String> map) {
        RetrofitClient retrofitClient = instance;
        if (retrofitClient != null) {
            return retrofitClient.getFulURL(str, map);
        }
        return null;
    }

    private boolean isLoggedIn() {
        return !C10146d0.C10159c.m37145e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C41880d0 lambda$createBOGInterceptor$0(boolean z, C41935w.C41936a aVar) {
        String str;
        String str2;
        String str3;
        C41869b0 w = aVar.mo97011w();
        C41931v j = w.mo96681j();
        BogUrlHelper bogUrlHelper = new BogUrlHelper(j.mo96961q(IRetrofitService.SERVICE_ID), j.mo96961q("essServiceId"), isLoggedIn());
        TargetEnvironment targetEnvironment = this.environment;
        if (z) {
            str = targetEnvironment.getDictionary();
        } else {
            str = targetEnvironment.getRbMiddleware();
        }
        C41931v m = C41931v.m121622m(str);
        C41931v.C41932a p = j.mo96956k().mo96969C(m.mo96964t()).mo96982e(m.mo96948d()).mo96993p(m.mo96954i());
        C41931v.C41932a b = p.mo96980b("channel", bogUrlHelper.getChannel()).mo96980b("userId", bogUrlHelper.getUserID()).mo96980b("userAddress", "");
        if (bogUrlHelper.essServiceIdRequiresEXT()) {
            str2 = "";
        } else {
            str2 = getSSOToken();
        }
        C41931v.C41932a b2 = b.mo96980b("keycloakSessionToken", str2);
        if (bogUrlHelper.shouldAttachExtCustomerId()) {
            str3 = this.extCustomerId;
        } else {
            str3 = "";
        }
        C41931v.C41932a b3 = b2.mo96980b("extCustomerId", str3).mo96980b("os", this.deviceInfo.mo89795c()).mo96980b("osVersion", this.deviceInfo.mo89796d()).mo96980b("appVersion", this.deviceInfo.mo89793a()).mo96980b("device", this.deviceInfo.mo89794b()).mo96980b("langCode", this.preferencesApiManager.getLanguage().mo90433b());
        b3.mo96980b("requestIndex", "" + BogUrlHelper.getNextRequestIndex()).mo96980b("darkMode", C24978b.m79846b(Boolean.valueOf(isDarkMode())).mo63391e());
        if (bogUrlHelper.shouldAttachExtCustomerId() && j.mo96961q("deviceId") == null) {
            p.mo96980b("deviceId", this.extCustomerId);
        }
        C41869b0.C41870a x = w.mo96679h().mo96706x(p.mo96981c());
        if (z) {
            x.mo96691i("channel", bogUrlHelper.getChannel());
        }
        return aVar.mo97008a(x.mo96684b());
    }

    public static String populateUrlWithExtraData(String str) {
        if (instance == null) {
            return null;
        }
        return str + instance.pupulateWithExtraData(new BogUrlHelper((String) null, (String) null, instance.isLoggedIn()));
    }

    private StringBuilder pupulateWithExtraData(BogUrlHelper bogUrlHelper) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("&channel=");
        sb.append(bogUrlHelper.getChannel());
        sb.append("&userId=");
        sb.append(bogUrlHelper.getUserID());
        sb.append("&os=");
        sb.append(this.deviceInfo.mo89795c());
        sb.append("&appVersion=");
        sb.append(this.deviceInfo.mo89793a());
        sb.append("&userAddress=");
        String str2 = "";
        sb.append(str2);
        sb.append("&keycloakSessionToken=");
        if (isLoggedIn()) {
            str = getSSOToken();
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append("&extCustomerId=");
        if (!isLoggedIn()) {
            str2 = this.extCustomerId;
        }
        sb.append(str2);
        sb.append("&langCode=");
        sb.append(this.preferencesApiManager.getLanguage().mo90433b());
        sb.append("&darkMode=");
        sb.append(C24978b.m79846b(Boolean.valueOf(isDarkMode())).mo63391e());
        return sb;
    }

    public static void setUnsafeOkHttpClient(C41944z.C41945a aVar) {
        try {
            TrustManager[] trustManagerArr = {new X509TrustManager() {
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }};
            SSLContext instance2 = SSLContext.getInstance("SSL");
            instance2.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
            aVar.mo97100e0(instance2.getSocketFactory(), (X509TrustManager) trustManagerArr[0]);
            aVar.mo97077M(new HostnameVerifier() {
                public boolean verify(String str, SSLSession sSLSession) {
                    return true;
                }
            });
        } catch (Exception unused) {
        }
    }

    public String getExtCustomerId() {
        return this.extCustomerId;
    }

    public boolean isDarkMode() {
        return this.isInNightMode.invoke();
    }

    public void setExtCustomerId(String str) {
        this.extCustomerId = str;
    }
}

package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.threatmetrix.TrustDefender.b0 */
public abstract class C11879b0 {

    /* renamed from: a */
    private static final String f34683a = C11907h.m43615j(C11879b0.class);

    /* renamed from: com.threatmetrix.TrustDefender.b0$a */
    public enum C11880a {
        ALG_PARAMETER_SPEC("java.security.spec.AlgorithmParameterSpec"),
        APPLICATION_INFO("android.content.pm.ApplicationInfo"),
        BUILD("android.os.Build"),
        CDMA_CELL_LOCATION("android.telephony.cdma.CdmaCellLocation"),
        CELL_LOCATION("android.telephony.CellLocation"),
        CELL_IDENTITY_CDMA("android.telephony.CellIdentityCdma"),
        CELL_IDENTITY_GSM("android.telephony.CellIdentityGsm"),
        CELL_IDENTITY_LTE("android.telephony.CellIdentityLte"),
        CELL_IDENTITY_WCDMA("android.telephony.CellIdentityWcdma"),
        CELL_INFO("android.telephony.CellInfo"),
        CELL_INFO_CDMA("android.telephony.CellInfoCdma"),
        CELL_INFO_GSM("android.telephony.CellInfoGsm"),
        CELL_INFO_LTE("android.telephony.CellInfoLte"),
        CELL_INFO_WCDMA("android.telephony.CellInfoWcdma"),
        CELL_SIGNAL_STRENGTH("android.telephony.CellSignalStrength"),
        CERTIFICATE("java.security.cert.Certificate"),
        CIPHER("javax.crypto.Cipher"),
        CONNECTIVITY_MANAGER("android.net.ConnectivityManager"),
        CRITERIA("android.location.Criteria"),
        DEVICE_POLICY_MANAGER("android.app.admin.DevicePolicyManager"),
        EC_GEN_KEY_SPEC("java.security.spec.ECGenParameterSpec"),
        FIREBASE_INSTANCE_ID("com.google.firebase.iid.FirebaseInstanceId"),
        GOOGLE_ADVERTISING_ID("com.google.android.gms.ads.identifier.AdvertisingIdClient"),
        GOOGLE_ADVERTISING_INFO("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"),
        GOOGLE_API("com.google.android.gms.common.api.Api"),
        GOOGLE_API_CLIENT("com.google.android.gms.common.api.GoogleApiClient"),
        GOOGLE_API_BUILDER("com.google.android.gms.common.api.GoogleApiClient$Builder"),
        GOOGLE_AVAILABILITY("com.google.android.gms.common.GoogleApiAvailability"),
        GOOGLE_CONNECTION_CALL_BACK("com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks"),
        GOOGLE_FAILED_CALL_BACK("com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener"),
        GOOGLE_LOCATION_LISTENER("com.google.android.gms.location.LocationListener"),
        GOOGLE_LOCATION_REQUEST("com.google.android.gms.location.LocationRequest"),
        GOOGLE_LOCATION_SERVICES("com.google.android.gms.location.LocationServices"),
        GOOGLE_PENDING_RESULT("com.google.android.gms.common.api.PendingResult"),
        GOOGLE_PLAY_UTILS("com.google.android.gms.common.GooglePlayServicesUtil"),
        GOOGLE_RESULT_CALL_BACK("com.google.android.gms.common.api.ResultCallback"),
        GOOGLE_SAFETY_NET("com.google.android.gms.safetynet.SafetyNet"),
        GOOGLE_SAFETY_NET_API("com.google.android.gms.safetynet.SafetyNetApi"),
        GOOGLE_SAFETY_NET_ATTEST_RESULT("com.google.android.gms.safetynet.SafetyNetApi$AttestationResult"),
        GOOGLE_STATUS("com.google.android.gms.common.api.Status"),
        GSM_CELL_LOCATION("android.telephony.gsm.GsmCellLocation"),
        JS_RESULT("android.webkit.JsResult"),
        KEY("java.security.Key"),
        KEY_CHAIN("android.security.KeyChain"),
        KEY_FACTORY("java.security.KeyFactory"),
        KEY_ENTRY("java.security.KeyStore$Entry"),
        KEY_GEN_PARAM_SPEC("android.security.keystore.KeyGenParameterSpec"),
        KEY_GEN_PARAM_SPEC_BUILDER("android.security.keystore.KeyGenParameterSpec$Builder"),
        KEY_INFO("android.security.keystore.KeyInfo"),
        KEY_PAIR("java.security.KeyPair"),
        KEY_PAIR_GENERATOR("java.security.KeyPairGenerator"),
        KEY_PAIR_GEN_SPEC("android.security.KeyPairGeneratorSpec"),
        KEY_PAIR_GEN_SPEC_BUILDER("android.security.KeyPairGeneratorSpec$Builder"),
        KEY_PROPERTIES("android.security.keystore.KeyProperties"),
        KEY_SPEC("java.security.spec.KeySpec"),
        KEY_STORE("java.security.KeyStore"),
        LOAD_STORE_PARAM("java.security.KeyStore$LoadStoreParameter"),
        LOCATION("android.location.Location"),
        LOCATION_LISTENER("android.location.LocationListener"),
        LOCATION_PROVIDER("android.location.LocationProvider"),
        NEIGHBOR_CELL_INFO("android.telephony.NeighboringCellInfo"),
        NETWORK_INFO("android.net.NetworkInfo"),
        PACKAGE_MANAGER("android.content.pm.PackageManager"),
        PACKAGE_INFO("android.content.pm.PackageInfo"),
        PACKAGE_ITEM_INFO("android.content.pm.PackageItemInfo"),
        PKCS8_ENC_KEY_SPEC("java.security.spec.PKCS8EncodedKeySpec"),
        POINT("android.graphics.Point"),
        POWER_MANAGER("android.os.PowerManager"),
        PRIVATE_KEY("java.security.PrivateKey"),
        PRIVATE_KEY_ENTRY("java.security.KeyStore$PrivateKeyEntry"),
        PROTECTION_PARAM("java.security.KeyStore$ProtectionParameter"),
        PUBLIC_KEY("java.security.PublicKey"),
        RSA_GEN_KEY_SPEC("java.security.spec.RSAKeyGenParameterSpec"),
        SETTING_SECURE("android.provider.Settings$Secure"),
        SETTING_GLOBAL("android.provider.Settings$Global"),
        SECRET_KEY_SPEC("javax.crypto.spec.SecretKeySpec"),
        SHARED_PREFERENCES("android.content.SharedPreferences"),
        SHARED_PREFERENCES_EDITOR("android.content.SharedPreferences$Editor"),
        SIGNATURE("java.security.Signature"),
        STAT_FS("android.os.StatFs"),
        STATE("android.net.NetworkInfo$State"),
        SUBSCRIPTION_INFO("android.telephony.SubscriptionInfo"),
        SUBSCRIPTION_MANAGER("android.telephony.SubscriptionManager"),
        SYSTEM_CLOCK("android.os.SystemClock"),
        SYSTEM_PROPERTIES("android.os.SystemProperties"),
        TELEPHONY_MANAGER("android.telephony.TelephonyManager"),
        VERSION("android.os.Build$VERSION"),
        VERSION_CODES("android.os.Build$VERSION_CODES"),
        WEB_CHROME_CLIENT("android.webkit.WebChromeClient"),
        WEB_SETTINGS("android.webkit.WebSettings"),
        WEB_SETTINGS_PLUGIN("android.webkit.WebSettings$PluginState"),
        WEB_VIEW("android.webkit.WebView"),
        WEB_VIEW_CLIENT("android.webkit.WebViewClient"),
        WIFI_INFO("android.net.wifi.WifiInfo"),
        WIFI_MANAGER("android.net.wifi.WifiManager"),
        WINDOW_MANAGER("android.view.WindowManager"),
        X_500_PRINCIPAL("javax.security.auth.x500.X500Principal"),
        X509_ENC_KEY_SPEC("java.security.spec.X509EncodedKeySpec"),
        JUNIT_NOT_FOO("com.threatmetrix.NotFoo"),
        JUNIT_FOO("com.threatmetrix.TrustDefender.WrapperHelperTest$Foo");
        

        /* renamed from: d */
        public final String f34785d;

        private C11880a(String str) {
            this.f34785d = str;
        }
    }

    /* renamed from: a */
    public static Object m43529a(Object obj, Method method, Object... objArr) {
        boolean z;
        Object obj2;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, objArr);
                z = false;
            } catch (Throwable unused) {
                C11907h.C11908a.m43627e(f34683a, "Can't invoke the method {} ", method.getName());
                z = true;
                obj2 = null;
            }
            if (!z) {
                return obj2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Object m43530b(Class cls, Class[] clsArr, Object[] objArr) {
        if (cls == null) {
            return null;
        }
        if ((clsArr != null && objArr == null) || (clsArr == null && objArr != null)) {
            return null;
        }
        if (clsArr != null && objArr != null && clsArr.length != objArr.length) {
            return null;
        }
        try {
            return cls.getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable unused) {
            C11907h.C11908a.m43627e(f34683a, "Can't create an instance of the class {}", cls.getName());
            return null;
        }
    }

    /* renamed from: c */
    public static Method m43531c(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Throwable unused) {
            C11907h.C11908a.m43626d(f34683a, "No such method: method name {} class name {} ", str, cls.getName());
            return null;
        }
    }

    /* renamed from: d */
    public static Object m43532d(ClassLoader classLoader, Class[] clsArr, InvocationHandler invocationHandler) {
        try {
            return Proxy.newProxyInstance(classLoader, clsArr, invocationHandler);
        } catch (Throwable unused) {
            C11907h.C11908a.m43627e(f34683a, "Can't create a proxy for class {}", clsArr[0].getName());
            return null;
        }
    }

    /* renamed from: e */
    public static Object m43533e(Class cls, String str, Object obj) {
        Field f = m43534f(cls, str);
        if (f != null) {
            return m43535g(obj, f);
        }
        return null;
    }

    /* renamed from: f */
    public static Field m43534f(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            C11907h.C11908a.m43626d(f34683a, "No such field {} in class {}", str, cls.getName());
            return null;
        }
    }

    /* renamed from: g */
    public static Object m43535g(Object obj, Field field) {
        if (field == null) {
            return null;
        }
        try {
            return field.get(obj);
        } catch (Throwable unused) {
            C11907h.C11908a.m43627e(f34683a, "Can't get the value of the field {}", field.getName());
            return null;
        }
    }

    /* renamed from: h */
    public static Field[] m43536h(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getDeclaredFields();
        } catch (Throwable unused) {
            C11907h.C11908a.m43627e(f34683a, "Can get declared fields of class {}", cls.getName());
            return null;
        }
    }

    /* renamed from: i */
    public static Class m43537i(C11880a aVar) {
        try {
            return Class.forName(aVar.f34785d);
        } catch (Throwable unused) {
            C11907h.C11908a.m43627e(f34683a, "No such class {}", aVar);
            return null;
        }
    }

    /* renamed from: j */
    public static Method m43538j(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            C11907h.C11908a.m43626d(f34683a, "No such method: method name {} class name {} ", str, cls.getName());
            return null;
        }
    }
}

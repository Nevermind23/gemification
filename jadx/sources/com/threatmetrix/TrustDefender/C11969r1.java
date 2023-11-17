package com.threatmetrix.TrustDefender;

import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.SparseIntArray;
import com.threatmetrix.TrustDefender.C11879b0;
import com.threatmetrix.TrustDefender.C11907h;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Date;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.r1 */
public class C11969r1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f35165a = C11907h.m43615j(C11969r1.class);

    /* renamed from: com.threatmetrix.TrustDefender.r1$a */
    public static class C11970a {

        /* renamed from: a */
        private static final Class f35166a;

        /* renamed from: b */
        private static final Class f35167b = C11879b0.m43537i(C11879b0.C11880a.CELL_INFO);

        /* renamed from: c */
        private static final Class f35168c = C11879b0.m43537i(C11879b0.C11880a.CELL_SIGNAL_STRENGTH);

        /* renamed from: d */
        private static final Class f35169d = C11879b0.m43537i(C11879b0.C11880a.NEIGHBOR_CELL_INFO);

        /* renamed from: e */
        private static final Class f35170e = C11879b0.m43537i(C11879b0.C11880a.SUBSCRIPTION_INFO);

        /* renamed from: f */
        private static final Class f35171f = C11879b0.m43537i(C11879b0.C11880a.SUBSCRIPTION_MANAGER);

        /* renamed from: g */
        private static final Class f35172g = C11879b0.m43537i(C11879b0.C11880a.CDMA_CELL_LOCATION);

        /* renamed from: h */
        private static final Class f35173h = C11879b0.m43537i(C11879b0.C11880a.GSM_CELL_LOCATION);

        /* renamed from: i */
        private static final boolean f35174i = m43936b(C11879b0.C11880a.CELL_INFO_CDMA, C11879b0.C11880a.CELL_IDENTITY_CDMA);

        /* renamed from: j */
        private static final boolean f35175j = m43936b(C11879b0.C11880a.CELL_INFO_GSM, C11879b0.C11880a.CELL_IDENTITY_GSM);

        /* renamed from: k */
        private static final boolean f35176k = m43936b(C11879b0.C11880a.CELL_INFO_LTE, C11879b0.C11880a.CELL_IDENTITY_LTE);

        /* renamed from: l */
        private static final boolean f35177l = m43936b(C11879b0.C11880a.CELL_INFO_WCDMA, C11879b0.C11880a.CELL_IDENTITY_WCDMA);

        /* renamed from: m */
        private static final boolean f35178m;

        static {
            Class i = C11879b0.m43537i(C11879b0.C11880a.TELEPHONY_MANAGER);
            f35166a = i;
            boolean z = false;
            if (!(C11879b0.m43537i(C11879b0.C11880a.CELL_LOCATION) == null || C11879b0.m43538j(i, "getCellLocation", new Class[0]) == null)) {
                z = true;
            }
            f35178m = z;
        }

        /* renamed from: a */
        public static boolean m43935a() {
            Class cls = f35169d;
            return (cls == null || C11879b0.m43538j(cls, "getCid", new Class[0]) == null || C11879b0.m43538j(cls, "getRssi", new Class[0]) == null) ? false : true;
        }

        /* renamed from: b */
        private static boolean m43936b(C11879b0.C11880a aVar, C11879b0.C11880a aVar2) {
            Class i = C11879b0.m43537i(aVar);
            return (C11879b0.m43537i(aVar2) == null || C11879b0.m43531c(i, "getCellSignalStrength", new Class[0]) == null || C11879b0.m43531c(i, "getCellIdentity", new Class[0]) == null) ? false : true;
        }

        /* renamed from: c */
        public static boolean m43937c() {
            return f35177l;
        }

        /* renamed from: d */
        public static boolean m43938d() {
            if (!f35178m) {
                return false;
            }
            Class cls = f35173h;
            return (C11879b0.m43538j(cls, "getCid", new Class[0]) == null || C11879b0.m43538j(cls, "getLac", new Class[0]) == null || C11879b0.m43538j(cls, "getPsc", new Class[0]) == null) ? false : true;
        }

        /* renamed from: e */
        public static boolean m43939e() {
            return f35175j;
        }

        /* renamed from: f */
        public static boolean m43940f() {
            Class cls = f35166a;
            return (cls == null || C11879b0.m43538j(cls, "getNetworkOperator", new Class[0]) == null || C11879b0.m43538j(cls, "getNetworkCountryIso", new Class[0]) == null || C11879b0.m43531c(cls, "getNetworkOperatorName", new Class[0]) == null) ? false : true;
        }

        /* renamed from: g */
        public static boolean m43941g() {
            Class cls = f35166a;
            return (cls == null || C11879b0.m43538j(cls, "getDataState", new Class[0]) == null || C11879b0.m43534f(cls, "DATA_CONNECTED") == null || C11879b0.m43534f(cls, "DATA_CONNECTING") == null || C11879b0.m43534f(cls, "DATA_SUSPENDED") == null) ? false : true;
        }

        /* renamed from: h */
        public static boolean m43942h() {
            return f35176k;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
            r2 = f35167b;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m43943i() {
            /*
                java.lang.Class r0 = f35166a
                r1 = 0
                if (r0 == 0) goto L_0x0022
                java.lang.Class r2 = f35168c
                if (r2 == 0) goto L_0x0022
                java.lang.Class r2 = f35167b
                if (r2 == 0) goto L_0x0022
                java.lang.String r3 = "isRegistered"
                java.lang.Class[] r4 = new java.lang.Class[r1]
                java.lang.reflect.Method r2 = com.threatmetrix.TrustDefender.C11879b0.m43538j(r2, r3, r4)
                if (r2 == 0) goto L_0x0022
                java.lang.String r2 = "getAllCellInfo"
                java.lang.Class[] r3 = new java.lang.Class[r1]
                java.lang.reflect.Method r0 = com.threatmetrix.TrustDefender.C11879b0.m43538j(r0, r2, r3)
                if (r0 == 0) goto L_0x0022
                r1 = 1
            L_0x0022:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11969r1.C11970a.m43943i():boolean");
        }

        /* renamed from: j */
        public static boolean m43944j() {
            if (!f35178m) {
                return false;
            }
            Class cls = f35172g;
            return (C11879b0.m43538j(cls, "getSystemId", new Class[0]) == null || C11879b0.m43538j(cls, "getBaseStationId", new Class[0]) == null || C11879b0.m43538j(cls, "getBaseStationLatitude", new Class[0]) == null || C11879b0.m43538j(cls, "getBaseStationLongitude", new Class[0]) == null) ? false : true;
        }

        /* renamed from: k */
        public static boolean m43945k() {
            return f35174i;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$b */
    public static class C11971b {

        /* renamed from: a */
        private static final boolean f35179a;

        /* renamed from: b */
        private static final boolean f35180b;

        /* renamed from: c */
        private static final boolean f35181c;

        /* renamed from: d */
        private static final boolean f35182d;

        /* renamed from: e */
        private static final boolean f35183e;

        /* renamed from: f */
        private static final boolean f35184f;

        static {
            Class i = C11879b0.m43537i(C11879b0.C11880a.CONNECTIVITY_MANAGER);
            Class i2 = C11879b0.m43537i(C11879b0.C11880a.NETWORK_INFO);
            Class i3 = C11879b0.m43537i(C11879b0.C11880a.WIFI_INFO);
            Class i4 = C11879b0.m43537i(C11879b0.C11880a.WIFI_MANAGER);
            Class i5 = C11879b0.m43537i(C11879b0.C11880a.STATE);
            boolean z = C11879b0.m43538j(i, "getActiveNetworkInfo", new Class[0]) != null;
            boolean z2 = C11879b0.m43538j(i2, "getState", new Class[0]) != null;
            boolean z3 = C11879b0.m43538j(i2, "getType", new Class[0]) != null;
            boolean z4 = C11879b0.m43538j(i2, "getExtraInfo", new Class[0]) != null;
            boolean z5 = C11879b0.m43538j(i3, "getBSSID", new Class[0]) != null;
            boolean z6 = C11879b0.m43538j(i3, "getSSID", new Class[0]) != null;
            boolean z7 = C11879b0.m43538j(i3, "getRssi", new Class[0]) != null;
            boolean z8 = C11879b0.m43538j(i4, "getConnectionInfo", new Class[0]) != null;
            boolean z9 = C11879b0.m43538j(i2, "isConnectedOrConnecting", new Class[0]) != null;
            boolean z12 = C11879b0.m43534f(i, "CONNECTIVITY_ACTION") != null;
            boolean z13 = C11879b0.m43534f(i, "TYPE_MOBILE") != null;
            boolean z14 = C11879b0.m43534f(i, "TYPE_WIFI") != null;
            boolean z15 = z8;
            boolean z16 = C11879b0.m43534f(i, "TYPE_BLUETOOTH") != null;
            boolean z17 = C11879b0.m43534f(i, "TYPE_ETHERNET") != null;
            boolean z18 = z7;
            boolean z19 = C11879b0.m43534f(i4, "NETWORK_STATE_CHANGED_ACTION") != null;
            boolean z22 = C11879b0.m43534f(i5, "CONNECTED") != null;
            f35179a = z && z9;
            boolean z23 = C11879b0.m43538j(i4, "getScanResults", new Class[0]) != null;
            f35183e = z23;
            f35184f = z23 && C11879b0.m43538j(i4, "startScan", new Class[0]) != null;
            f35180b = z12 && z22 && z2 && z4 && z3 && z13 && z14 && z17 && z16;
            f35181c = z19 && z22 && z5 && z6 && z18 && z2 && z4;
            f35182d = z15 && z5 && z6 && z18;
        }

        /* renamed from: a */
        public static boolean m43946a() {
            return f35182d;
        }

        /* renamed from: b */
        public static boolean m43947b() {
            return f35180b;
        }

        /* renamed from: c */
        public static boolean m43948c() {
            return f35183e;
        }

        /* renamed from: d */
        public static boolean m43949d() {
            return f35181c;
        }

        /* renamed from: e */
        public static boolean m43950e() {
            return f35179a;
        }

        /* renamed from: f */
        public static boolean m43951f() {
            return f35184f;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$c */
    public static class C11972c {

        /* renamed from: a */
        private static final boolean f35185a;

        /* renamed from: b */
        private static final boolean f35186b;

        /* renamed from: c */
        private static final boolean f35187c;

        static {
            boolean z;
            int i;
            boolean z2;
            int i2;
            boolean z3;
            int i3;
            boolean z4;
            int i4;
            boolean z5;
            int i5;
            boolean z6;
            int i6;
            boolean z7;
            int i7;
            boolean z8;
            int i8;
            boolean z9;
            int i9;
            Class i12 = C11879b0.m43537i(C11879b0.C11880a.CERTIFICATE);
            Class i13 = C11879b0.m43537i(C11879b0.C11880a.KEY_PAIR);
            Class i14 = C11879b0.m43537i(C11879b0.C11880a.KEY);
            Class i15 = C11879b0.m43537i(C11879b0.C11880a.KEY_STORE);
            Class i16 = C11879b0.m43537i(C11879b0.C11880a.LOAD_STORE_PARAM);
            Class i17 = C11879b0.m43537i(C11879b0.C11880a.PROTECTION_PARAM);
            Class i18 = C11879b0.m43537i(C11879b0.C11880a.KEY_ENTRY);
            Class i19 = C11879b0.m43537i(C11879b0.C11880a.PRIVATE_KEY_ENTRY);
            Class i22 = C11879b0.m43537i(C11879b0.C11880a.PRIVATE_KEY);
            Class i23 = C11879b0.m43537i(C11879b0.C11880a.KEY_PAIR_GENERATOR);
            Class i24 = C11879b0.m43537i(C11879b0.C11880a.ALG_PARAMETER_SPEC);
            Class i25 = C11879b0.m43537i(C11879b0.C11880a.KEY_CHAIN);
            Class i26 = C11879b0.m43537i(C11879b0.C11880a.SIGNATURE);
            Class i27 = C11879b0.m43537i(C11879b0.C11880a.KEY_PROPERTIES);
            Class i28 = C11879b0.m43537i(C11879b0.C11880a.KEY_PAIR_GEN_SPEC);
            Class i29 = C11879b0.m43537i(C11879b0.C11880a.KEY_PAIR_GEN_SPEC_BUILDER);
            Class i32 = C11879b0.m43537i(C11879b0.C11880a.X_500_PRINCIPAL);
            Class i33 = C11879b0.m43537i(C11879b0.C11880a.KEY_GEN_PARAM_SPEC);
            Class cls = i28;
            Class i34 = C11879b0.m43537i(C11879b0.C11880a.KEY_GEN_PARAM_SPEC_BUILDER);
            Class cls2 = i18;
            Class i35 = C11879b0.m43537i(C11879b0.C11880a.KEY_FACTORY);
            Class cls3 = i27;
            Class i36 = C11879b0.m43537i(C11879b0.C11880a.KEY_INFO);
            Class cls4 = i35;
            Class<String> cls5 = String.class;
            Class cls6 = i34;
            if (C11879b0.m43538j(i15, "getInstance", cls5) != null) {
                i = 1;
                z = true;
            } else {
                i = 1;
                z = false;
            }
            Class[] clsArr = new Class[i];
            clsArr[0] = i16;
            boolean z12 = C11879b0.m43538j(i15, "load", clsArr) != null;
            boolean z13 = C11879b0.m43538j(i15, "getEntry", cls5, i17) != null;
            boolean z14 = C11879b0.m43538j(i15, "getCertificate", cls5) != null;
            boolean z15 = C11879b0.m43538j(i15, "getCreationDate", cls5) != null;
            boolean z16 = C11879b0.m43538j(i19, "getPrivateKey", new Class[0]) != null;
            boolean z17 = z14;
            boolean z18 = C11879b0.m43538j(i14, "getAlgorithm", new Class[0]) != null;
            boolean z19 = C11879b0.m43538j(i13, "getPrivate", new Class[0]) != null;
            boolean z22 = C11879b0.m43538j(i13, "getPublic", new Class[0]) != null;
            boolean z23 = C11879b0.m43538j(i12, "getPublicKey", new Class[0]) != null;
            if (C11879b0.m43538j(i23, "generateKeyPair", new Class[0]) != null) {
                i2 = 2;
                z2 = true;
            } else {
                z2 = false;
                i2 = 2;
            }
            Class[] clsArr2 = new Class[i2];
            clsArr2[0] = cls5;
            clsArr2[1] = cls5;
            boolean z24 = C11879b0.m43538j(i23, "getInstance", clsArr2) != null;
            boolean z25 = C11879b0.m43538j(i23, "initialize", i24) != null;
            boolean z26 = C11879b0.m43538j(i26, "getInstance", cls5) != null;
            boolean z27 = C11879b0.m43538j(i26, "initSign", i22) != null;
            boolean z28 = C11879b0.m43538j(i26, "update", byte[].class) != null;
            if (C11879b0.m43538j(i26, "sign", new Class[0]) != null) {
                i3 = 1;
                z3 = true;
            } else {
                z3 = false;
                i3 = 1;
            }
            Class[] clsArr3 = new Class[i3];
            clsArr3[0] = cls5;
            int i37 = C11879b0.m43538j(i25, "isKeyAlgorithmSupported", clsArr3) != null ? i3 : 0;
            Class[] clsArr4 = new Class[i3];
            clsArr4[0] = cls5;
            int i38 = C11879b0.m43538j(i29, "setAlias", clsArr4) != null ? i3 : 0;
            Class[] clsArr5 = new Class[i3];
            clsArr5[0] = i32;
            if (C11879b0.m43538j(i29, "setSubject", clsArr5) != null) {
                i4 = 1;
                z4 = true;
            } else {
                i4 = 1;
                z4 = false;
            }
            Class[] clsArr6 = new Class[i4];
            clsArr6[0] = BigInteger.class;
            if (C11879b0.m43538j(i29, "setSerialNumber", clsArr6) != null) {
                i5 = 1;
                z5 = true;
            } else {
                i5 = 1;
                z5 = false;
            }
            Class[] clsArr7 = new Class[i5];
            Class<Date> cls7 = Date.class;
            clsArr7[0] = cls7;
            if (C11879b0.m43538j(i29, "setStartDate", clsArr7) != null) {
                i6 = 1;
                z6 = true;
            } else {
                i6 = 1;
                z6 = false;
            }
            Class[] clsArr8 = new Class[i6];
            clsArr8[0] = cls7;
            if (C11879b0.m43538j(i29, "setEndDate", clsArr8) != null) {
                i7 = 1;
                z7 = true;
            } else {
                i7 = 1;
                z7 = false;
            }
            Class[] clsArr9 = new Class[i7];
            clsArr9[0] = cls5;
            if (C11879b0.m43538j(i29, "setKeyType", clsArr9) != null) {
                i8 = 1;
                z8 = true;
            } else {
                i8 = 1;
                z8 = false;
            }
            Class[] clsArr10 = new Class[i8];
            clsArr10[0] = cls5;
            int i39 = C11879b0.m43538j(i25, "isBoundKeyAlgorithm", clsArr10) != null ? i8 : 0;
            Class[] clsArr11 = new Class[i8];
            Class<String[]> cls8 = String[].class;
            clsArr11[0] = cls8;
            int i42 = i39;
            Class cls9 = cls6;
            if (C11879b0.m43538j(cls9, "setDigests", clsArr11) != null) {
                i9 = 1;
                z9 = true;
            } else {
                i9 = 1;
                z9 = false;
            }
            Class[] clsArr12 = new Class[i9];
            clsArr12[0] = cls8;
            boolean z29 = C11879b0.m43538j(cls9, "setSignaturePaddings", clsArr12) != null;
            Class cls10 = cls4;
            boolean z32 = C11879b0.m43538j(cls10, "getInstance", cls5, cls5) != null;
            Class cls11 = i36;
            boolean z33 = C11879b0.m43538j(cls10, "getKeySpec", i14, Class.class) != null;
            boolean z34 = C11879b0.m43538j(cls11, "isInsideSecureHardware", new Class[0]) != null;
            boolean z35 = C11879b0.m43538j(cls11, "getOrigin", new Class[0]) != null;
            Class cls12 = cls3;
            boolean z36 = C11879b0.m43534f(cls12, "PURPOSE_SIGN") != null;
            boolean z37 = C11879b0.m43534f(cls12, "PURPOSE_ENCRYPT") != null;
            boolean z38 = C11879b0.m43534f(cls12, "DIGEST_SHA256") != null;
            boolean z39 = C11879b0.m43534f(cls12, "SIGNATURE_PADDING_RSA_PKCS1") != null;
            boolean z42 = C11879b0.m43534f(cls12, "ORIGIN_GENERATED") != null;
            boolean z43 = cls2 != null && i19 != null && i22 != null && z && z12 && z13 && z16 && z17 && z15 && z18 && z19 && z22 && z23 && z2 && z24 && z25 && i37 != 0;
            f35187c = z26 && z27 && z28 && z3;
            f35185a = z43 && cls != null && i38 != 0 && z4 && z5 && z6 && z7 && z8 && i42 != 0;
            f35186b = C11983n.C11984a.f35247c >= 23 && z43 && i33 != null && z9 && z29 && z32 && z33 && z34 && z35 && z36 && z37 && z38 && z39 && z42;
        }

        /* renamed from: a */
        public static boolean m43952a() {
            return f35186b;
        }

        /* renamed from: b */
        public static boolean m43953b() {
            return f35187c;
        }

        /* renamed from: c */
        public static boolean m43954c() {
            return f35185a;
        }

        /* renamed from: d */
        public static boolean m43955d() {
            return f35185a || f35186b;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$d */
    public static class C11973d {

        /* renamed from: a */
        private static final boolean f35188a;

        /* renamed from: b */
        private static final boolean f35189b;

        /* renamed from: c */
        private static final boolean f35190c;

        /* renamed from: d */
        private static final boolean f35191d;

        /* renamed from: e */
        private static final boolean f35192e;

        /* renamed from: f */
        private static final boolean f35193f;

        /* renamed from: g */
        private static final boolean f35194g;

        /* renamed from: h */
        private static final boolean f35195h;

        static {
            Class i = C11879b0.m43537i(C11879b0.C11880a.SETTING_SECURE);
            boolean z = false;
            Class<ContentResolver> cls = ContentResolver.class;
            Class<String> cls2 = String.class;
            f35188a = C11879b0.m43538j(i, "getString", cls, cls2) != null;
            f35189b = C11879b0.m43534f(i, "ANDROID_ID") != null;
            f35190c = C11879b0.m43534f(i, "ALLOW_MOCK_LOCATION") != null;
            f35191d = C11879b0.m43534f(i, "ADB_ENABLED") != null;
            f35192e = C11879b0.m43534f(i, "DEVELOPMENT_SETTINGS_ENABLED") != null;
            Class i2 = C11879b0.m43537i(C11879b0.C11880a.SETTING_GLOBAL);
            f35193f = C11879b0.m43538j(i2, "getString", cls, cls2) != null;
            f35194g = C11879b0.m43534f(i2, "ADB_ENABLED") != null;
            if (C11879b0.m43534f(i2, "DEVELOPMENT_SETTINGS_ENABLED") != null) {
                z = true;
            }
            f35195h = z;
        }

        /* renamed from: a */
        public static String m43956a(ContentResolver contentResolver, String str) {
            if (contentResolver != null && !C11921k0.m43739v(str) && f35188a) {
                try {
                    String string = Settings.Secure.getString(contentResolver, str);
                    if (string != null) {
                        return string;
                    }
                    if ("android_id".equals(str) && f35189b) {
                        return Settings.Secure.getString(contentResolver, "android_id");
                    }
                    if ("mock_location".equals(str) && f35190c) {
                        return Settings.Secure.getString(contentResolver, "mock_location");
                    }
                    if ("adb_enabled".equals(str) && f35191d) {
                        return Settings.Secure.getString(contentResolver, "adb_enabled");
                    }
                    if ("development_settings_enabled".equals(str) && f35192e) {
                        return Settings.Secure.getString(contentResolver, "development_settings_enabled");
                    }
                } catch (SecurityException e) {
                    String a = C11969r1.f35165a;
                    C11907h.C11908a.m43624b(a, "User refuse granting permission " + e.toString());
                    C12014y0.m44139c(e);
                } catch (Exception e2) {
                    C11907h.m43607b(C11969r1.f35165a, e2.toString());
                }
            }
            return null;
        }

        /* renamed from: b */
        public static String m43957b(ContentResolver contentResolver, String str) {
            if (contentResolver != null && !C11921k0.m43739v(str) && f35193f) {
                try {
                    if ("adb_enabled".equals(str) && f35194g) {
                        return Settings.Global.getString(contentResolver, "adb_enabled");
                    }
                    if ("development_settings_enabled".equals(str) && f35195h) {
                        return Settings.Global.getString(contentResolver, "development_settings_enabled");
                    }
                } catch (SecurityException e) {
                    String a = C11969r1.f35165a;
                    C11907h.C11908a.m43624b(a, "User refuse granting permission " + e.toString());
                    C12014y0.m44139c(e);
                } catch (Exception e2) {
                    C11907h.m43607b(C11969r1.f35165a, e2.toString());
                }
            }
            return null;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$e */
    public static class C11974e {

        /* renamed from: a */
        public static final boolean f35196a;

        /* renamed from: b */
        private static final SparseIntArray f35197b;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray(6);
            f35197b = sparseIntArray;
            Class i = C11879b0.m43537i(C11879b0.C11880a.DEVICE_POLICY_MANAGER);
            boolean z = false;
            if (C11879b0.m43538j(i, "getStorageEncryptionStatus", new Class[0]) != null) {
                z = true;
            }
            f35196a = z;
            Object e = C11879b0.m43533e(i, "ENCRYPTION_STATUS_UNSUPPORTED", (Object) null);
            if (e != null) {
                sparseIntArray.put(((Integer) e).intValue(), 1);
            }
            Object e2 = C11879b0.m43533e(i, "ENCRYPTION_STATUS_INACTIVE", (Object) null);
            if (e2 != null) {
                sparseIntArray.put(((Integer) e2).intValue(), 2);
            }
            Object e3 = C11879b0.m43533e(i, "ENCRYPTION_STATUS_ACTIVATING", (Object) null);
            if (e3 != null) {
                sparseIntArray.put(((Integer) e3).intValue(), 4);
            }
            Object e4 = C11879b0.m43533e(i, "ENCRYPTION_STATUS_ACTIVE", (Object) null);
            if (e4 != null) {
                sparseIntArray.put(((Integer) e4).intValue(), 8);
            }
            Object e5 = C11879b0.m43533e(i, "ENCRYPTION_STATUS_ACTIVE_DEFAULT_KEY", (Object) null);
            if (e5 != null) {
                sparseIntArray.put(((Integer) e5).intValue(), 32);
            }
            Object e6 = C11879b0.m43533e(i, "ENCRYPTION_STATUS_ACTIVE_PER_USER", (Object) null);
            if (e6 != null) {
                sparseIntArray.put(((Integer) e6).intValue(), 64);
            }
        }

        /* renamed from: a */
        public static int m43958a(Context context) {
            int i;
            if (!f35196a) {
                return 16;
            }
            try {
                Object systemService = context.getSystemService("device_policy");
                if ((systemService instanceof DevicePolicyManager) && (i = f35197b.get(((DevicePolicyManager) systemService).getStorageEncryptionStatus())) != 0) {
                    return i;
                }
                return 16;
            } catch (SecurityException e) {
                String a = C11969r1.f35165a;
                C11907h.C11908a.m43624b(a, "User refuse granting permission " + e.toString());
                C12014y0.m44139c(e);
                return 16;
            } catch (Exception e2) {
                C11907h.m43607b(C11969r1.f35165a, e2.toString());
                return 16;
            }
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$f */
    public class C11975f {

        /* renamed from: a */
        private PackageManager f35198a = null;

        public C11975f(Context context) {
            if (C11979j.f35216e) {
                try {
                    this.f35198a = context.getPackageManager();
                } catch (SecurityException e) {
                    String a = C11969r1.f35165a;
                    C11907h.C11908a.m43624b(a, "User refuse granting permission " + e.toString());
                    C12014y0.m44139c(e);
                } catch (Exception e2) {
                    C11907h.m43607b(C11969r1.f35165a, e2.toString());
                }
            }
        }

        /* renamed from: a */
        public boolean mo32039a(String str, int i) {
            PackageManager packageManager;
            if (!C11979j.f35216e || !C11979j.f35217f || (packageManager = this.f35198a) == null) {
                return false;
            }
            try {
                packageManager.getPackageInfo(str, i);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                C11907h.C11908a.m43626d(C11969r1.f35165a, "Invalid package name. {} {}", str, e);
                return false;
            } catch (SecurityException e2) {
                String a = C11969r1.f35165a;
                C11907h.C11908a.m43624b(a, "User refuse granting permission " + e2.toString());
                C12014y0.m44139c(e2);
                return false;
            } catch (Exception e3) {
                C11907h.m43607b(C11969r1.f35165a, e3.toString());
                return false;
            }
        }

        /* renamed from: b */
        public boolean mo32040b() {
            return C11979j.f35216e && C11979j.f35212a && this.f35198a != null;
        }

        /* renamed from: c */
        public boolean mo32041c(String str, String str2) {
            PackageManager packageManager;
            boolean z = false;
            if (C11979j.f35218g && (packageManager = this.f35198a) != null) {
                try {
                    if (packageManager.checkPermission(str, str2) == 0) {
                        z = true;
                    }
                } catch (SecurityException e) {
                    C11907h.C11908a.m43624b(C11969r1.f35165a, "User refuse granting permission " + e.toString());
                    C12014y0.m44139c(e);
                } catch (Exception e2) {
                    C11907h.m43607b(C11969r1.f35165a, e2.toString());
                }
            }
            if (!z) {
                C12014y0.m44137a(str);
            }
            return z;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$g */
    public private static class C11976g {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final boolean f35200a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static final boolean f35201b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static final boolean f35202c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final boolean f35203d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static final boolean f35204e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final boolean f35205f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final boolean f35206g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final boolean f35207h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final boolean f35208i;

        static {
            Class i = C11879b0.m43537i(C11879b0.C11880a.SHARED_PREFERENCES);
            boolean z = true;
            f35200a = i != null;
            Class i2 = C11879b0.m43537i(C11879b0.C11880a.SHARED_PREFERENCES_EDITOR);
            f35201b = i2 != null;
            Class<String> cls = String.class;
            Class cls2 = Integer.TYPE;
            f35203d = C11879b0.m43538j(i, "getInt", cls, cls2) != null;
            Class cls3 = Long.TYPE;
            f35204e = C11879b0.m43538j(i, "getLong", cls, cls3) != null;
            f35202c = C11879b0.m43538j(i, "getString", cls, cls) != null;
            f35207h = C11879b0.m43538j(i2, "putInt", cls, cls2) != null;
            f35206g = C11879b0.m43538j(i2, "putLong", cls, cls3) != null;
            f35205f = C11879b0.m43538j(i2, "putString", cls, cls) != null;
            if (C11879b0.m43538j(i2, "apply", new Class[0]) == null) {
                z = false;
            }
            f35208i = z;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$h */
    public static class C11977h {

        /* renamed from: a */
        private ApplicationInfo f35209a = null;

        public C11977h(C17603t tVar) {
            if (C11979j.f35212a && C11979j.f35213b) {
                this.f35209a = tVar.f49314a.getApplicationInfo();
            }
        }

        /* renamed from: a */
        public String mo32042a() {
            ApplicationInfo applicationInfo = this.f35209a;
            return applicationInfo != null ? applicationInfo.nativeLibraryDir : "";
        }

        /* renamed from: b */
        public String mo32043b() {
            ApplicationInfo applicationInfo = this.f35209a;
            return applicationInfo != null ? applicationInfo.dataDir : "";
        }

        /* renamed from: c */
        public String mo32044c() {
            ApplicationInfo applicationInfo = this.f35209a;
            return applicationInfo != null ? applicationInfo.sourceDir : "";
        }

        /* renamed from: d */
        public int mo32045d() {
            ApplicationInfo applicationInfo = this.f35209a;
            if (applicationInfo != null) {
                return applicationInfo.flags;
            }
            return 0;
        }

        /* renamed from: e */
        public int mo32046e() {
            ApplicationInfo applicationInfo = this.f35209a;
            if (applicationInfo != null) {
                return applicationInfo.uid;
            }
            return -1;
        }

        /* renamed from: f */
        public String mo32047f() {
            ApplicationInfo applicationInfo = this.f35209a;
            return applicationInfo != null ? applicationInfo.packageName : "";
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$i */
    public class C11978i {

        /* renamed from: a */
        private PackageInfo f35210a = null;

        public C11978i(Context context, String str, int i) {
            if (C11979j.f35217f && C11979j.f35216e) {
                try {
                    this.f35210a = context.getPackageManager().getPackageInfo(str, i);
                } catch (PackageManager.NameNotFoundException e) {
                    C11907h.C11908a.m43626d(C11969r1.f35165a, "Invalid package name. {} {}", str, e.toString());
                } catch (SecurityException e2) {
                    String a = C11969r1.f35165a;
                    C11907h.C11908a.m43624b(a, "User refuse granting permission " + e2.toString());
                    C12014y0.m44139c(e2);
                } catch (Exception e3) {
                    C11907h.m43607b(C11969r1.f35165a, e3.toString());
                }
            }
        }

        /* renamed from: a */
        public int mo32048a() {
            PackageInfo packageInfo;
            if (!C11979j.f35219h || (packageInfo = this.f35210a) == null) {
                return -1;
            }
            return packageInfo.versionCode;
        }

        /* renamed from: b */
        public String mo32049b() {
            PackageInfo packageInfo;
            if (!C11979j.f35220i || (packageInfo = this.f35210a) == null) {
                return null;
            }
            return packageInfo.versionName;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$j */
    public static class C11979j {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final boolean f35212a = (C11879b0.m43537i(C11879b0.C11880a.APPLICATION_INFO) != null);
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static final boolean f35213b;

        /* renamed from: c */
        public static final int f35214c = 1;

        /* renamed from: d */
        public static final int f35215d = 128;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static final boolean f35216e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final boolean f35217f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final boolean f35218g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final boolean f35219h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final boolean f35220i;

        static {
            Class i = C11879b0.m43537i(C11879b0.C11880a.PACKAGE_MANAGER);
            boolean z = false;
            f35216e = i != null;
            Class i2 = C11879b0.m43537i(C11879b0.C11880a.PACKAGE_INFO);
            f35217f = i2 != null;
            Class<String> cls = String.class;
            f35218g = C11879b0.m43538j(i, "checkPermission", cls, cls) != null;
            f35219h = C11879b0.m43534f(i2, "versionCode") != null;
            f35220i = C11879b0.m43534f(i2, "versionName") != null;
            if (C11879b0.m43537i(C11879b0.C11880a.PACKAGE_ITEM_INFO) != null) {
                z = true;
            }
            f35213b = z;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$k */
    public static class C11980k {
        /* renamed from: a */
        public static void m43986a(String str, String str2, SharedPreferences.Editor editor) {
            if (C11976g.f35205f) {
                editor.putString(str, str2);
            }
        }

        /* renamed from: b */
        public static long m43987b(SharedPreferences sharedPreferences, String str, long j) {
            return (!C11976g.f35200a || !C11976g.f35204e) ? j : sharedPreferences.getLong(str, j);
        }

        /* renamed from: c */
        public static boolean m43988c() {
            return C11976g.f35200a && C11976g.f35201b;
        }

        /* renamed from: d */
        public static void m43989d(String str, int i, SharedPreferences.Editor editor) {
            if (C11976g.f35207h) {
                editor.putInt(str, i);
            }
        }

        /* renamed from: e */
        public static int m43990e(SharedPreferences sharedPreferences, String str, int i) {
            return (!C11976g.f35200a || !C11976g.f35203d) ? i : sharedPreferences.getInt(str, i);
        }

        /* renamed from: f */
        public static String m43991f(SharedPreferences sharedPreferences, String str, String str2) {
            return (!C11976g.f35200a || !C11976g.f35202c) ? str2 : sharedPreferences.getString(str, str2);
        }

        /* renamed from: g */
        public static void m43992g(String str, long j, SharedPreferences.Editor editor) {
            if (C11976g.f35206g) {
                editor.putLong(str, j);
            }
        }

        /* renamed from: h */
        public static String m43993h(C17603t tVar, String str, String str2, String str3) {
            return (!C11976g.f35200a || !C11976g.f35202c) ? str3 : tVar.f49314a.getSharedPreferences(str, 0).getString(str2, str3);
        }

        /* renamed from: i */
        public static boolean m43994i() {
            return C11976g.f35202c && C11976g.f35205f;
        }

        /* renamed from: j */
        public static SharedPreferences.Editor m43995j(SharedPreferences sharedPreferences) {
            if (!C11976g.f35200a || !C11976g.f35201b || !C11976g.f35208i) {
                return null;
            }
            return sharedPreferences.edit();
        }

        /* renamed from: k */
        public static void m43996k(C17603t tVar, String str, String str2, String str3) {
            SharedPreferences.Editor edit;
            if (C11976g.f35200a && C11976g.f35201b && C11976g.f35208i && C11976g.f35205f && (edit = tVar.f49314a.getSharedPreferences(str, 0).edit()) != null) {
                edit.putString(str2, str3);
                edit.apply();
            }
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$l */
    public static class C11981l {

        /* renamed from: a */
        private static final boolean f35221a;

        /* renamed from: b */
        private static final boolean f35222b;

        static {
            Class i = C11879b0.m43537i(C11879b0.C11880a.POWER_MANAGER);
            boolean z = false;
            f35221a = C11879b0.m43538j(i, "isInteractive", new Class[0]) != null;
            if (C11879b0.m43538j(i, "isScreenOn", new Class[0]) != null) {
                z = true;
            }
            f35222b = z;
        }

        /* renamed from: a */
        public static boolean m43997a() {
            return f35222b;
        }

        /* renamed from: b */
        public static boolean m43998b() {
            return f35221a;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$m */
    public static class C11982m {

        /* renamed from: a */
        private static final boolean f35223a;

        /* renamed from: b */
        private static final boolean f35224b;

        static {
            Class i = C11879b0.m43537i(C11879b0.C11880a.CRITERIA);
            Class i2 = C11879b0.m43537i(C11879b0.C11880a.LOCATION);
            Class i3 = C11879b0.m43537i(C11879b0.C11880a.LOCATION_PROVIDER);
            Class i4 = C11879b0.m43537i(C11879b0.C11880a.LOCATION_LISTENER);
            Class cls = Integer.TYPE;
            boolean z = C11879b0.m43538j(i, "setAccuracy", cls) != null;
            Class cls2 = Boolean.TYPE;
            boolean z2 = C11879b0.m43538j(i, "setAltitudeRequired", cls2) != null;
            boolean z3 = C11879b0.m43538j(i, "setBearingAccuracy", cls) != null;
            boolean z4 = C11879b0.m43538j(i, "setCostAllowed", cls2) != null;
            boolean z5 = C11879b0.m43538j(i, "setSpeedAccuracy", cls) != null;
            boolean z6 = C11879b0.m43538j(i, "setSpeedRequired", cls2) != null;
            boolean z7 = C11879b0.m43538j(i, "setVerticalAccuracy", cls) != null;
            boolean z8 = C11879b0.m43538j(i, "setPowerRequirement", cls) != null;
            boolean z9 = C11879b0.m43538j(i2, "getTime", new Class[0]) != null;
            boolean z12 = C11879b0.m43538j(i2, "getProvider", new Class[0]) != null;
            boolean z13 = C11879b0.m43538j(i2, "getAccuracy", new Class[0]) != null;
            boolean z14 = C11879b0.m43538j(i2, "getLatitude", new Class[0]) != null;
            boolean z15 = C11879b0.m43538j(i2, "getLongitude", new Class[0]) != null;
            boolean z16 = C11879b0.m43534f(i, "NO_REQUIREMENT") != null;
            boolean z17 = C11879b0.m43534f(i, "POWER_LOW") != null;
            boolean z18 = z15;
            boolean z19 = C11879b0.m43534f(i, "ACCURACY_LOW") != null;
            boolean z22 = C11879b0.m43534f(i, "ACCURACY_COARSE") != null;
            boolean z23 = C11879b0.m43534f(i3, "AVAILABLE") != null;
            boolean z24 = C11879b0.m43534f(i3, "TEMPORARILY_UNAVAILABLE") != null;
            boolean z25 = C11879b0.m43534f(i3, "OUT_OF_SERVICE") != null;
            f35223a = z && z2 && z3 && z4 && z5 && z6 && z7 && z8 && z16 && z17 && z19 && z22;
            f35224b = i4 != null && z9 && z12 && z14 && z18 && z13 && z23 && z24 && z25;
        }

        /* renamed from: a */
        public static boolean m43999a() {
            return f35223a;
        }

        /* renamed from: b */
        public static boolean m44000b() {
            return f35224b;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$n */
    public static class C11983n {

        /* renamed from: a */
        public static final long f35225a;

        /* renamed from: b */
        public static final String f35226b;

        /* renamed from: c */
        public static final String f35227c;

        /* renamed from: d */
        public static final String f35228d;

        /* renamed from: e */
        public static final String f35229e;

        /* renamed from: f */
        public static final String f35230f;

        /* renamed from: g */
        public static final String f35231g;

        /* renamed from: h */
        public static final String f35232h;

        /* renamed from: i */
        public static final String f35233i;

        /* renamed from: j */
        public static final String f35234j;

        /* renamed from: k */
        public static final String f35235k;

        /* renamed from: l */
        public static final String f35236l;

        /* renamed from: m */
        public static final String f35237m;

        /* renamed from: n */
        public static final String f35238n;

        /* renamed from: o */
        public static final String f35239o;

        /* renamed from: p */
        public static final String f35240p;

        /* renamed from: q */
        public static final String[] f35241q;

        /* renamed from: r */
        public static final Method f35242r;

        /* renamed from: s */
        public static final Field f35243s;

        /* renamed from: t */
        private static final Class f35244t;

        /* renamed from: com.threatmetrix.TrustDefender.r1$n$a */
        public static class C11984a {

            /* renamed from: a */
            public static final String f35245a;

            /* renamed from: b */
            public static final String f35246b;

            /* renamed from: c */
            public static final int f35247c;

            /* renamed from: d */
            public static final String f35248d;

            static {
                Class i = C11879b0.m43537i(C11879b0.C11880a.VERSION);
                String str = null;
                f35245a = C11879b0.m43534f(i, "RELEASE") != null ? Build.VERSION.RELEASE : null;
                f35247c = C11879b0.m43534f(i, "SDK_INT") != null ? Build.VERSION.SDK_INT : -1;
                f35246b = C11879b0.m43534f(i, "CODENAME") != null ? Build.VERSION.CODENAME : null;
                if (C11879b0.m43534f(i, "SECURITY_PATCH") != null) {
                    str = Build.VERSION.SECURITY_PATCH;
                }
                f35248d = str;
            }
        }

        /* renamed from: com.threatmetrix.TrustDefender.r1$n$b */
        public static class C11985b {

            /* renamed from: a */
            public static final int f35249a = 8;

            /* renamed from: b */
            public static final int f35250b = 9;

            /* renamed from: c */
            public static final int f35251c = 10;

            /* renamed from: d */
            public static final int f35252d = 11;

            /* renamed from: e */
            public static final int f35253e = 12;

            /* renamed from: f */
            public static final int f35254f = 13;

            /* renamed from: g */
            public static final int f35255g = 14;

            /* renamed from: h */
            public static final int f35256h = 15;

            /* renamed from: i */
            public static final int f35257i = 16;

            /* renamed from: j */
            public static final int f35258j = 17;

            /* renamed from: k */
            public static final int f35259k = 18;

            /* renamed from: l */
            public static final int f35260l = 19;

            /* renamed from: m */
            public static final int f35261m = 20;

            /* renamed from: n */
            public static final int f35262n = 21;

            /* renamed from: o */
            public static final int f35263o = 22;

            /* renamed from: p */
            public static final int f35264p = 23;

            /* renamed from: q */
            public static final int f35265q = 24;

            /* renamed from: r */
            public static final int f35266r = 25;

            /* renamed from: s */
            public static final int f35267s = 26;

            /* renamed from: t */
            public static final int f35268t = 27;

            /* renamed from: u */
            public static final int f35269u = 28;

            /* renamed from: v */
            public static final int f35270v = 29;

            /* renamed from: w */
            public static final int f35271w = 30;

            /* renamed from: x */
            public static final int f35272x = 31;

            /* renamed from: y */
            private static final Class f35273y;

            static {
                Class i = C11879b0.m43537i(C11879b0.C11880a.VERSION_CODES);
                f35273y = i;
                C11879b0.m43534f(i, "FROYO");
                C11879b0.m43534f(i, "GINGERBREAD");
                C11879b0.m43534f(i, "GINGERBREAD_MR1");
                C11879b0.m43534f(i, "HONEYCOMB");
                C11879b0.m43534f(i, "HONEYCOMB_MR1");
                C11879b0.m43534f(i, "HONEYCOMB_MR2");
                C11879b0.m43534f(i, "ICE_CREAM_SANDWICH");
                C11879b0.m43534f(i, "ICE_CREAM_SANDWICH_MR1");
                C11879b0.m43534f(i, "JELLY_BEAN");
                C11879b0.m43534f(i, "JELLY_BEAN_MR1");
                C11879b0.m43534f(i, "JELLY_BEAN_MR2");
                C11879b0.m43534f(i, "KITKAT");
                C11879b0.m43534f(i, "KITKAT_WATCH");
                C11879b0.m43534f(i, "LOLLIPOP");
                C11879b0.m43534f(i, "LOLLIPOP_MR1");
                C11879b0.m43534f(i, "M");
                C11879b0.m43534f(i, "N");
                C11879b0.m43534f(i, "N_MR1");
                C11879b0.m43534f(i, "O");
                C11879b0.m43534f(i, "O_MR1");
                C11879b0.m43534f(i, "P");
                C11879b0.m43534f(i, "Q");
                C11879b0.m43534f(i, "R");
                C11879b0.m43534f(i, "S");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                com.threatmetrix.TrustDefender.b0$a r0 = com.threatmetrix.TrustDefender.C11879b0.C11880a.BUILD
                java.lang.Class r0 = com.threatmetrix.TrustDefender.C11879b0.m43537i(r0)
                f35244t = r0
                r1 = 0
                java.lang.Class[] r1 = new java.lang.Class[r1]
                java.lang.String r2 = "getSerial"
                java.lang.reflect.Method r1 = com.threatmetrix.TrustDefender.C11879b0.m43538j(r0, r2, r1)
                f35242r = r1
                java.lang.String r1 = "SUPPORTED_ABIS"
                java.lang.reflect.Field r1 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r1)
                f35243s = r1
                java.lang.String r2 = "TIME"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x0026
                long r2 = android.os.Build.TIME
                goto L_0x002b
            L_0x0026:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x002b:
                f35225a = r2
                java.lang.String r2 = "TYPE"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                r3 = 0
                if (r2 == 0) goto L_0x0039
                java.lang.String r2 = android.os.Build.TYPE
                goto L_0x003a
            L_0x0039:
                r2 = r3
            L_0x003a:
                f35226b = r2
                java.lang.String r2 = "TAGS"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x0047
                java.lang.String r2 = android.os.Build.TAGS
                goto L_0x0048
            L_0x0047:
                r2 = r3
            L_0x0048:
                f35227c = r2
                java.lang.String r2 = "HOST"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x0055
                java.lang.String r2 = android.os.Build.HOST
                goto L_0x0056
            L_0x0055:
                r2 = r3
            L_0x0056:
                f35228d = r2
                java.lang.String r2 = "BRAND"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x0063
                java.lang.String r2 = android.os.Build.BRAND
                goto L_0x0064
            L_0x0063:
                r2 = r3
            L_0x0064:
                f35229e = r2
                java.lang.String r2 = "USER"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x0071
                java.lang.String r2 = android.os.Build.USER
                goto L_0x0072
            L_0x0071:
                r2 = r3
            L_0x0072:
                f35230f = r2
                java.lang.String r2 = "ID"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x007f
                java.lang.String r2 = android.os.Build.ID
                goto L_0x0080
            L_0x007f:
                r2 = r3
            L_0x0080:
                f35231g = r2
                java.lang.String r2 = "SERIAL"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x008d
                java.lang.String r2 = android.os.Build.SERIAL
                goto L_0x008e
            L_0x008d:
                r2 = r3
            L_0x008e:
                f35232h = r2
                java.lang.String r2 = "DEVICE"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x009b
                java.lang.String r2 = android.os.Build.DEVICE
                goto L_0x009c
            L_0x009b:
                r2 = r3
            L_0x009c:
                f35233i = r2
                java.lang.String r2 = "MODEL"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x00a9
                java.lang.String r2 = android.os.Build.MODEL
                goto L_0x00aa
            L_0x00a9:
                r2 = r3
            L_0x00aa:
                f35234j = r2
                java.lang.String r2 = "DISPLAY"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x00b7
                java.lang.String r2 = android.os.Build.DISPLAY
                goto L_0x00b8
            L_0x00b7:
                r2 = r3
            L_0x00b8:
                f35235k = r2
                java.lang.String r2 = "PRODUCT"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x00c5
                java.lang.String r2 = android.os.Build.PRODUCT
                goto L_0x00c6
            L_0x00c5:
                r2 = r3
            L_0x00c6:
                f35236l = r2
                java.lang.String r2 = "MANUFACTURER"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x00d3
                java.lang.String r2 = android.os.Build.MANUFACTURER
                goto L_0x00d4
            L_0x00d3:
                r2 = r3
            L_0x00d4:
                f35237m = r2
                java.lang.String r2 = "BOARD"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x00e1
                java.lang.String r2 = android.os.Build.BOARD
                goto L_0x00e2
            L_0x00e1:
                r2 = r3
            L_0x00e2:
                f35238n = r2
                java.lang.String r2 = "CPU_ABI"
                java.lang.reflect.Field r2 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r2 == 0) goto L_0x00ef
                java.lang.String r2 = android.os.Build.CPU_ABI
                goto L_0x00f0
            L_0x00ef:
                r2 = r3
            L_0x00f0:
                f35239o = r2
                java.lang.String r2 = "CPU_ABI2"
                java.lang.reflect.Field r0 = com.threatmetrix.TrustDefender.C11879b0.m43534f(r0, r2)
                if (r0 == 0) goto L_0x00fd
                java.lang.String r0 = android.os.Build.CPU_ABI2
                goto L_0x00fe
            L_0x00fd:
                r0 = r3
            L_0x00fe:
                f35240p = r0
                if (r1 == 0) goto L_0x0109
                java.lang.Object r0 = com.threatmetrix.TrustDefender.C11879b0.m43535g(r3, r1)
                r3 = r0
                java.lang.String[] r3 = (java.lang.String[]) r3
            L_0x0109:
                f35241q = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11969r1.C11983n.<clinit>():void");
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r1$o */
    public static class C11986o {

        /* renamed from: a */
        private static final boolean f35274a;

        /* renamed from: b */
        private static final boolean f35275b;

        /* renamed from: c */
        private static final boolean f35276c;

        static {
            Class i = C11879b0.m43537i(C11879b0.C11880a.SYSTEM_CLOCK);
            boolean z = false;
            f35274a = C11879b0.m43538j(i, "uptimeMillis", new Class[0]) != null;
            f35275b = C11879b0.m43538j(i, "elapsedRealtime", new Class[0]) != null;
            if (C11879b0.m43538j(i, "elapsedRealtimeNanos", new Class[0]) != null) {
                z = true;
            }
            f35276c = z;
        }

        /* renamed from: a */
        public static boolean m44001a() {
            return f35276c;
        }

        /* renamed from: b */
        public static long m44002b() {
            if (f35274a) {
                return SystemClock.uptimeMillis();
            }
            return 0;
        }

        /* renamed from: c */
        public static long m44003c() {
            if (f35275b) {
                return SystemClock.elapsedRealtime();
            }
            return 0;
        }
    }
}

package p297w4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.C2642h;
import com.facebook.C2643i;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p115i4.C6569p;
import p334z4.C9207a;

/* renamed from: w4.a0 */
public abstract class C8769a0 {

    /* renamed from: a */
    private static int f24625a = 0;

    /* renamed from: b */
    private static long f24626b = -1;

    /* renamed from: c */
    private static long f24627c = -1;

    /* renamed from: d */
    private static long f24628d = -1;

    /* renamed from: e */
    private static String f24629e = "";

    /* renamed from: f */
    private static String f24630f = "";

    /* renamed from: g */
    private static String f24631g = "NoCarrier";

    /* renamed from: w4.a0$a */
    static class C8770a implements GraphRequest.C2612e {

        /* renamed from: a */
        final /* synthetic */ C8772c f24632a;

        /* renamed from: b */
        final /* synthetic */ String f24633b;

        C8770a(C8772c cVar, String str) {
            this.f24632a = cVar;
            this.f24633b = str;
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            if (hVar.mo8279g() != null) {
                this.f24632a.mo8222b(hVar.mo8279g().mo8164g());
                return;
            }
            C8844u.m32930b(this.f24633b, hVar.mo8280h());
            this.f24632a.mo8221a(hVar.mo8280h());
        }
    }

    /* renamed from: w4.a0$b */
    static class C8771b implements FilenameFilter {
        C8771b() {
        }

        public boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    /* renamed from: w4.a0$c */
    public interface C8772c {
        /* renamed from: a */
        void mo8221a(JSONObject jSONObject);

        /* renamed from: b */
        void mo8222b(FacebookException facebookException);
    }

    /* renamed from: w4.a0$d */
    public static class C8773d {

        /* renamed from: a */
        List f24634a;

        /* renamed from: b */
        List f24635b;

        /* renamed from: c */
        List f24636c;

        public C8773d(List list, List list2, List list3) {
            this.f24634a = list;
            this.f24635b = list2;
            this.f24636c = list3;
        }

        /* renamed from: a */
        public List mo24183a() {
            return this.f24635b;
        }

        /* renamed from: b */
        public List mo24184b() {
            return this.f24636c;
        }

        /* renamed from: c */
        public List mo24185c() {
            return this.f24634a;
        }
    }

    /* renamed from: A */
    public static Method m32628A(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: B */
    public static Method m32629B(String str, String str2, Class... clsArr) {
        try {
            return m32628A(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static Locale m32630C() {
        try {
            return C2626d.m10134e().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Object m32631D(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    /* renamed from: E */
    public static C8773d m32632E(JSONObject jSONObject) {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            if (!(optString2 == null || optString2.equals("installed") || (optString = optJSONObject.optString("status")) == null)) {
                if (optString.equals("granted")) {
                    arrayList.add(optString2);
                } else if (optString.equals("declined")) {
                    arrayList2.add(optString2);
                } else if (optString.equals("expired")) {
                    arrayList3.add(optString2);
                }
            }
        }
        return new C8773d(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: F */
    private static String m32633F(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        return sb.toString();
    }

    /* renamed from: G */
    private static String m32634G(String str, String str2) {
        return m32635H(str, str2.getBytes());
    }

    /* renamed from: H */
    private static String m32635H(String str, byte[] bArr) {
        try {
            return m32633F(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: I */
    public static Object m32636I(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: J */
    public static boolean m32637J() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", new Object[]{C2626d.m10135f()})));
            Context e = C2626d.m10134e();
            PackageManager packageManager = e.getPackageManager();
            String packageName = e.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m32638K(Context context) {
        AutofillManager a;
        if (Build.VERSION.SDK_INT >= 26 && (a = C8847x.m32937a(context.getSystemService(AutofillManager.class))) != null && a.isAutofillSupported() && a.isEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static boolean m32639L(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public static boolean m32640M(Uri uri) {
        if (uri == null || !"content".equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public static boolean m32641N(AccessToken accessToken) {
        return accessToken != null && accessToken.equals(AccessToken.m9965h());
    }

    /* renamed from: O */
    public static boolean m32642O() {
        Class<C8769a0> cls = C8769a0.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            JSONObject w = m32695w();
            if (w == null) {
                return false;
            }
            try {
                JSONArray jSONArray = w.getJSONArray("data_processing_options");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (jSONArray.getString(i).toLowerCase().equals("ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: P */
    public static boolean m32643P(Uri uri) {
        if (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public static boolean m32644Q(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: R */
    public static boolean m32645R(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: S */
    public static boolean m32646S(Uri uri) {
        if (uri == null || (!"http".equalsIgnoreCase(uri.getScheme()) && !"https".equalsIgnoreCase(uri.getScheme()) && !"fbstaging".equalsIgnoreCase(uri.getScheme()))) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public static List m32647T(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: U */
    public static void m32648U(String str, Exception exc) {
        if (C2626d.m10150u() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
    }

    /* renamed from: V */
    public static void m32649V(String str, String str2) {
        if (C2626d.m10150u() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: W */
    public static void m32650W(String str, String str2, Throwable th) {
        if (C2626d.m10150u() && !m32644Q(str)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: X */
    public static String m32651X(Map map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: Y */
    public static String m32652Y(String str) {
        return m32634G("MD5", str);
    }

    /* renamed from: Z */
    public static boolean m32653Z(Context context) {
        return m32638K(context);
    }

    /* renamed from: a */
    public static Map m32654a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: a0 */
    public static Bundle m32655a0(String str) {
        Bundle bundle = new Bundle();
        if (!m32644Q(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8"));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    m32648U("FacebookSDK", e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static boolean m32656b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b0 */
    public static boolean m32657b0(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
            return true;
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
            return true;
        }
    }

    /* renamed from: c */
    public static List m32658c(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: c0 */
    public static void m32659c0(Bundle bundle, String str, String str2) {
        if (!m32644Q(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: d */
    public static JSONObject m32660d(String str) {
        JSONObject a = C8844u.m32929a(str);
        if (a != null) {
            return a;
        }
        C2642h g = m32696x(str).mo8184g();
        if (g.mo8279g() != null) {
            return null;
        }
        return g.mo8280h();
    }

    /* renamed from: d0 */
    public static void m32661d0(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m32659c0(bundle, str, uri.toString());
        }
    }

    /* renamed from: e */
    public static Uri m32662e(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    builder.appendQueryParameter(next, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: e0 */
    public static String m32663e0(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[C11398b.f33142u];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            m32668h(bufferedInputStream);
                            m32668h(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m32668h(bufferedInputStream);
                    m32668h(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m32668h(bufferedInputStream);
                m32668h(inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m32668h(bufferedInputStream);
            m32668h(inputStreamReader);
            throw th;
        }
    }

    /* renamed from: f */
    private static void m32664f(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    instance.setCookie(str, split2[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                }
            }
            instance.removeExpiredCookie();
        }
    }

    /* renamed from: f0 */
    public static Map m32665f0(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: g */
    public static void m32666g(Context context) {
        m32664f(context, "facebook.com");
        m32664f(context, ".facebook.com");
        m32664f(context, "https://facebook.com");
        m32664f(context, "https://.facebook.com");
    }

    /* renamed from: g0 */
    private static void m32667g0() {
        try {
            if (m32682o()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f24628d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f24628d = m32672j((double) f24628d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static void m32668h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: h0 */
    private static int m32669h0() {
        int i = f24625a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new C8771b());
            if (listFiles != null) {
                f24625a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f24625a <= 0) {
            f24625a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f24625a;
    }

    /* renamed from: i */
    public static String m32670i(String str, String str2) {
        return m32644Q(str) ? str2 : str;
    }

    /* renamed from: i0 */
    private static void m32671i0(Context context) {
        if (f24631g.equals("NoCarrier")) {
            try {
                f24631g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    private static long m32672j(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: j0 */
    private static void m32673j0(Context context) {
        if (f24626b == -1 || System.currentTimeMillis() - f24626b >= 1800000) {
            f24626b = System.currentTimeMillis();
            m32675k0();
            m32671i0(context);
            m32677l0();
            m32667g0();
        }
    }

    /* renamed from: k */
    public static List m32674k(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: k0 */
    private static void m32675k0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f24629e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f24630f = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: l */
    public static Map m32676l(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: l0 */
    private static void m32677l0() {
        try {
            if (m32682o()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f24627c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f24627c = m32672j((double) f24627c);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m32678m(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0024 }
            r1.<init>(r6)     // Catch:{ all -> 0x0024 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r2 = 0
            r3 = r2
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0021 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            r1.close()
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r3
        L_0x0021:
            r7 = move-exception
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r7 = move-exception
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.close()
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.close()
        L_0x002f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p297w4.C8769a0.m32678m(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: m0 */
    public static void m32679m0(Runnable runnable) {
        try {
            C2626d.m10142m().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public static void m32680n(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: n0 */
    public static void m32681n0(JSONObject jSONObject, C8765a aVar, String str, boolean z) {
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", C2626d.m10133d());
        if (aVar != null) {
            if (aVar.mo24174g() != null) {
                jSONObject.put("attribution", aVar.mo24174g());
            }
            if (aVar.mo24172b() != null) {
                jSONObject.put("advertiser_id", aVar.mo24172b());
                jSONObject.put("advertiser_tracking_enabled", !aVar.mo24175k());
            }
            if (!aVar.mo24175k()) {
                String d = C6569p.m25910d();
                if (!d.isEmpty()) {
                    jSONObject.put("ud", d);
                }
            }
            if (aVar.mo24173f() != null) {
                jSONObject.put("installer_package", aVar.mo24173f());
            }
        }
    }

    /* renamed from: o */
    private static boolean m32682o() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: o0 */
    public static void m32683o0(JSONObject jSONObject, Context context) {
        String str;
        Locale locale;
        int i;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        m32673j0(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + "_" + locale.getCountry());
        jSONArray.put(f24629e);
        jSONArray.put(f24631g);
        double d = Utils.DOUBLE_EPSILON;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i4 = displayMetrics.widthPixels;
                try {
                    i2 = displayMetrics.heightPixels;
                    d = (double) displayMetrics.density;
                } catch (Exception unused3) {
                }
                int i5 = i2;
                i2 = i4;
                i = i5;
                jSONArray.put(i2);
                jSONArray.put(i);
                jSONArray.put(new DecimalFormat("#.##").format(d));
                jSONArray.put(m32669h0());
                jSONArray.put(f24627c);
                jSONArray.put(f24628d);
                jSONArray.put(f24630f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused4) {
        }
        i = 0;
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(m32669h0());
        jSONArray.put(f24627c);
        jSONArray.put(f24628d);
        jSONArray.put(f24630f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: p */
    public static String m32684p(int i) {
        return new BigInteger(i * 5, new Random()).toString(32);
    }

    /* renamed from: p0 */
    public static String m32685p0(byte[] bArr) {
        return m32635H("SHA-1", bArr);
    }

    /* renamed from: q */
    public static String m32686q(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return C11651j.f33767h;
        }
        return context.getClass().getSimpleName();
    }

    /* renamed from: q0 */
    public static String m32687q0(String str) {
        if (str == null) {
            return null;
        }
        return m32634G("SHA-256", str);
    }

    /* renamed from: r */
    public static String m32688r(Context context) {
        try {
            String g = C2626d.m10136g();
            if (g != null) {
                return g;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            return context.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: r0 */
    public static Collection m32689r0(Object... objArr) {
        return Collections.unmodifiableCollection(Arrays.asList(objArr));
    }

    /* renamed from: s */
    public static String m32690s() {
        Context e = C2626d.m10134e();
        if (e == null) {
            return null;
        }
        try {
            return e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: s0 */
    public static void m32691s0(Parcel parcel, Map map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    /* renamed from: t */
    public static Date m32692t(Bundle bundle, String str, Date date) {
        long j;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                j = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (j * 1000));
    }

    /* renamed from: u */
    public static long m32693u(Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = C2626d.m10134e().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            long j = query.getLong(columnIndex);
            query.close();
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: v */
    public static Locale m32694v() {
        Locale C = m32630C();
        if (C != null) {
            return C;
        }
        return Locale.getDefault();
    }

    /* renamed from: w */
    public static JSONObject m32695w() {
        Class<C8769a0> cls = C8769a0.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            String string = C2626d.m10134e().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", (String) null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: x */
    private static GraphRequest m32696x(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        return new GraphRequest((AccessToken) null, "me", bundle, C2643i.GET, (GraphRequest.C2612e) null);
    }

    /* renamed from: y */
    public static void m32697y(String str, C8772c cVar) {
        JSONObject a = C8844u.m32929a(str);
        if (a != null) {
            cVar.mo8221a(a);
            return;
        }
        C8770a aVar = new C8770a(cVar, str);
        GraphRequest x = m32696x(str);
        x.mo8178V(aVar);
        x.mo8185i();
    }

    /* renamed from: z */
    public static String m32698z(Context context) {
        C8775b0.m32716i(context, "context");
        C2626d.m10125C(context);
        return C2626d.m10135f();
    }
}

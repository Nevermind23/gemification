package p115i4;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.C2626d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p128j4.C6702c;
import p297w4.C8769a0;
import p334z4.C9207a;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: i4.p */
public abstract class C6569p {

    /* renamed from: a */
    private static final String f20039a = "p";

    /* renamed from: b */
    private static SharedPreferences f20040b;

    /* renamed from: c */
    private static AtomicBoolean f20041c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final ConcurrentHashMap f20042d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentHashMap f20043e = new ConcurrentHashMap();

    /* renamed from: i4.p$a */
    static class C6570a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f20044d;

        /* renamed from: e */
        final /* synthetic */ String f20045e;

        C6570a(String str, String str2) {
            this.f20044d = str;
            this.f20045e = str2;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    if (!C6569p.m25907a().get()) {
                        C6569p.m25908b();
                    }
                    C6569p.m25909c().edit().putString(this.f20044d, this.f20045e).apply();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ AtomicBoolean m25907a() {
        Class<C6569p> cls = C6569p.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f20041c;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m25908b() {
        Class<C6569p> cls = C6569p.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m25912f();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ SharedPreferences m25909c() {
        Class<C6569p> cls = C6569p.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f20040b;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static String m25910d() {
        Class<C6569p> cls = C6569p.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            if (!f20041c.get()) {
                m25912f();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f20042d);
            hashMap.putAll(m25911e());
            return C8769a0.m32651X(hashMap);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    private static Map m25911e() {
        Class<C6569p> cls = C6569p.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set b = C6702c.m26143b();
            for (String str : f20043e.keySet()) {
                if (b.contains(str)) {
                    hashMap.put(str, f20043e.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    private static synchronized void m25912f() {
        synchronized (C6569p.class) {
            if (!C9207a.m34024c(C6569p.class)) {
                try {
                    if (!f20041c.get()) {
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2626d.m10134e());
                        f20040b = defaultSharedPreferences;
                        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                        String string2 = f20040b.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                        f20042d.putAll(C8769a0.m32654a(string));
                        f20043e.putAll(C8769a0.m32654a(string2));
                        f20041c.set(true);
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, C6569p.class);
                }
            }
        }
    }

    /* renamed from: g */
    static void m25913g() {
        Class<C6569p> cls = C6569p.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (!f20041c.get()) {
                    m25912f();
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: h */
    private static String m25914h(String str, String str2) {
        String str3;
        Class<C6569p> cls = C6569p.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            String lowerCase = str2.trim().toLowerCase();
            if ("em".equals(str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(f20039a, "Setting email failure: this is not a valid email address");
                return "";
            } else if ("ph".equals(str)) {
                return lowerCase.replaceAll("[^0-9]", "");
            } else {
                if (!"ge".equals(str)) {
                    return lowerCase;
                }
                if (lowerCase.length() > 0) {
                    str3 = lowerCase.substring(0, 1);
                } else {
                    str3 = "";
                }
                if (!"f".equals(str3)) {
                    if (!"m".equals(str3)) {
                        Log.e(f20039a, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                }
                return str3;
            }
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: i */
    static void m25915i(Map map) {
        String[] strArr;
        Class<C6569p> cls = C6569p.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (!f20041c.get()) {
                    m25912f();
                }
                for (Map.Entry key : map.entrySet()) {
                    String str = (String) key.getKey();
                    String q0 = C8769a0.m32687q0(m25914h(str, ((String) map.get(str)).trim()));
                    ConcurrentHashMap concurrentHashMap = f20043e;
                    if (concurrentHashMap.containsKey(str)) {
                        String str2 = (String) concurrentHashMap.get(str);
                        if (str2 != null) {
                            strArr = str2.split(",");
                        } else {
                            strArr = new String[0];
                        }
                        HashSet hashSet = new HashSet(Arrays.asList(strArr));
                        if (!hashSet.contains(q0)) {
                            StringBuilder sb = new StringBuilder();
                            if (strArr.length == 0) {
                                sb.append(q0);
                            } else if (strArr.length < 5) {
                                sb.append(str2);
                                sb.append(",");
                                sb.append(q0);
                            } else {
                                for (int i = 1; i < 5; i++) {
                                    sb.append(strArr[i]);
                                    sb.append(",");
                                }
                                sb.append(q0);
                                hashSet.remove(strArr[0]);
                            }
                            f20043e.put(str, sb.toString());
                        } else {
                            return;
                        }
                    } else {
                        concurrentHashMap.put(str, q0);
                    }
                }
                m25916j("com.facebook.appevents.UserDataStore.internalUserData", C8769a0.m32651X(f20043e));
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: j */
    private static void m25916j(String str, String str2) {
        Class<C6569p> cls = C6569p.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C2626d.m10142m().execute(new C6570a(str, str2));
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}

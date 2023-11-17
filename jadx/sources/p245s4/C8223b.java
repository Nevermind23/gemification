package p245s4;

import android.content.SharedPreferences;
import com.facebook.C2626d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p297w4.C8769a0;
import p334z4.C9207a;

/* renamed from: s4.b */
abstract class C8223b {

    /* renamed from: a */
    private static final Map f23400a = new HashMap();

    /* renamed from: b */
    private static SharedPreferences f23401b;

    /* renamed from: c */
    private static final AtomicBoolean f23402c = new AtomicBoolean(false);

    /* renamed from: a */
    static void m30994a(String str, String str2) {
        Class<C8223b> cls = C8223b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (!f23402c.get()) {
                    m30996c();
                }
                Map map = f23400a;
                map.put(str, str2);
                f23401b.edit().putString("SUGGESTED_EVENTS_HISTORY", C8769a0.m32651X(map)).apply();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|(1:9)|17|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m30995b(android.view.View r4, java.lang.String r5) {
        /*
            java.lang.Class<s4.b> r0 = p245s4.C8223b.class
            boolean r1 = p334z4.C9207a.m34024c(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0039 }
            r1.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "text"
            r1.put(r3, r5)     // Catch:{ JSONException -> 0x0030 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0030 }
            r5.<init>()     // Catch:{ JSONException -> 0x0030 }
        L_0x0019:
            if (r4 == 0) goto L_0x002b
            java.lang.Class r3 = r4.getClass()     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ JSONException -> 0x0030 }
            r5.put(r3)     // Catch:{ JSONException -> 0x0030 }
            android.view.ViewGroup r4 = p154l4.C6888f.m26746j(r4)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0019
        L_0x002b:
            java.lang.String r4 = "classname"
            r1.put(r4, r5)     // Catch:{ JSONException -> 0x0030 }
        L_0x0030:
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0039 }
            java.lang.String r4 = p297w4.C8769a0.m32687q0(r4)     // Catch:{ all -> 0x0039 }
            return r4
        L_0x0039:
            r4 = move-exception
            p334z4.C9207a.m34023b(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p245s4.C8223b.m30995b(android.view.View, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    private static void m30996c() {
        Class<C8223b> cls = C8223b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                AtomicBoolean atomicBoolean = f23402c;
                if (!atomicBoolean.get()) {
                    SharedPreferences sharedPreferences = C2626d.m10134e().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                    f23401b = sharedPreferences;
                    f23400a.putAll(C8769a0.m32654a(sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "")));
                    atomicBoolean.set(true);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    static String m30997d(String str) {
        Class<C8223b> cls = C8223b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            Map map = f23400a;
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }
}

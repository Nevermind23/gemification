package p232r4;

import android.util.Log;
import com.facebook.C2626d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;
import p297w4.C8817m;
import p297w4.C8819n;
import p334z4.C9207a;

/* renamed from: r4.a */
public abstract class C8061a {

    /* renamed from: a */
    private static boolean f23228a = false;

    /* renamed from: b */
    private static final String f23229b = "r4.a";

    /* renamed from: c */
    private static final List f23230c = new ArrayList();

    /* renamed from: d */
    private static final Set f23231d = new CopyOnWriteArraySet();

    /* renamed from: r4.a$a */
    static class C8062a {

        /* renamed from: a */
        String f23232a;

        /* renamed from: b */
        Map f23233b;

        C8062a(String str, Map map) {
            this.f23232a = str;
            this.f23233b = map;
        }
    }

    /* renamed from: a */
    public static void m30562a() {
        Class<C8061a> cls = C8061a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f23228a = true;
                m30564c();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static String m30563b(String str, String str2) {
        Class<C8061a> cls = C8061a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            for (C8062a aVar : new ArrayList(f23230c)) {
                if (aVar != null) {
                    if (str.equals(aVar.f23232a)) {
                        for (String str3 : aVar.f23233b.keySet()) {
                            if (str2.equals(str3)) {
                                return (String) aVar.f23233b.get(str3);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            Log.w(f23229b, "getMatchedRuleType failed", e);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
        return null;
    }

    /* renamed from: c */
    private static void m30564c() {
        String h;
        Class<C8061a> cls = C8061a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C8817m o = C8819n.m32848o(C2626d.m10135f(), false);
                if (o != null && (h = o.mo24245h()) != null) {
                    if (!h.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(h);
                        f23230c.clear();
                        f23231d.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                                C8062a aVar = new C8062a(next, new HashMap());
                                if (optJSONObject != null) {
                                    aVar.f23233b = C8769a0.m32676l(optJSONObject);
                                    f23230c.add(aVar);
                                }
                                if (jSONObject2.has("process_event_name")) {
                                    f23231d.add(aVar.f23232a);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    private static boolean m30565d(String str) {
        Class<C8061a> cls = C8061a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return f23231d.contains(str);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: e */
    public static String m30566e(String str) {
        Class<C8061a> cls = C8061a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            if (!f23228a || !m30565d(str)) {
                return str;
            }
            return "_removed_";
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    public static void m30567f(Map map, String str) {
        Class<C8061a> cls = C8061a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (f23228a) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : new ArrayList(map.keySet())) {
                        String b = m30563b(str, str2);
                        if (b != null) {
                            hashMap.put(str2, b);
                            map.remove(str2);
                        }
                    }
                    if (hashMap.size() > 0) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                            map.put("_restrictedParams", jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}

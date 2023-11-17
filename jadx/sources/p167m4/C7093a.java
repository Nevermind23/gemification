package p167m4;

import com.facebook.C2626d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p115i4.C6535c;
import p297w4.C8769a0;
import p297w4.C8817m;
import p297w4.C8819n;
import p334z4.C9207a;

/* renamed from: m4.a */
public abstract class C7093a {

    /* renamed from: a */
    private static boolean f21053a = false;

    /* renamed from: b */
    private static final List f21054b = new ArrayList();

    /* renamed from: c */
    private static final Set f21055c = new HashSet();

    /* renamed from: m4.a$a */
    static class C7094a {

        /* renamed from: a */
        String f21056a;

        /* renamed from: b */
        List f21057b;

        C7094a(String str, List list) {
            this.f21056a = str;
            this.f21057b = list;
        }
    }

    /* renamed from: a */
    public static void m27380a() {
        Class<C7093a> cls = C7093a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f21053a = true;
                m27381b();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static synchronized void m27381b() {
        synchronized (C7093a.class) {
            if (!C9207a.m34024c(C7093a.class)) {
                try {
                    C8817m o = C8819n.m32848o(C2626d.m10135f(), false);
                    if (o != null) {
                        String h = o.mo24245h();
                        if (!h.isEmpty()) {
                            JSONObject jSONObject = new JSONObject(h);
                            f21054b.clear();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                if (jSONObject2 != null) {
                                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                                        f21055c.add(next);
                                    } else {
                                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                        C7094a aVar = new C7094a(next, new ArrayList());
                                        if (optJSONArray != null) {
                                            aVar.f21057b = C8769a0.m32674k(optJSONArray);
                                        }
                                        f21054b.add(aVar);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C9207a.m34023b(th, C7093a.class);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m27382c(Map map, String str) {
        Class<C7093a> cls = C7093a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (f21053a) {
                    ArrayList<String> arrayList = new ArrayList<>(map.keySet());
                    for (C7094a aVar : new ArrayList(f21054b)) {
                        if (aVar.f21056a.equals(str)) {
                            for (String str2 : arrayList) {
                                if (aVar.f21057b.contains(str2)) {
                                    map.remove(str2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static void m27383d(List list) {
        Class<C7093a> cls = C7093a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (f21053a) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (f21055c.contains(((C6535c) it.next()).mo20515e())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}

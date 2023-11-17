package p128j4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;
import p334z4.C9207a;

/* renamed from: j4.c */
public final class C6702c {

    /* renamed from: d */
    private static final Set f20232d = new CopyOnWriteArraySet();

    /* renamed from: a */
    private String f20233a;

    /* renamed from: b */
    private List f20234b;

    /* renamed from: c */
    private String f20235c;

    private C6702c(String str, List list, String str2) {
        this.f20233a = str;
        this.f20234b = list;
        this.f20235c = str2;
    }

    /* renamed from: a */
    private static void m26142a(JSONObject jSONObject) {
        Class<C6702c> cls = C6702c.class;
        if (!C9207a.m34024c(cls)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("k");
                        String optString2 = optJSONObject.optString("v");
                        if (!optString.isEmpty()) {
                            f20232d.add(new C6702c(next, Arrays.asList(optString.split(",")), optString2));
                        }
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static Set m26143b() {
        Class<C6702c> cls = C6702c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            HashSet hashSet = new HashSet();
            for (C6702c d : f20232d) {
                hashSet.add(d.mo20685d());
            }
            return hashSet;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    static Set m26144e() {
        Class<C6702c> cls = C6702c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return new HashSet(f20232d);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: g */
    static void m26145g(String str) {
        Class<C6702c> cls = C6702c.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f20232d.clear();
                m26142a(new JSONObject(str));
            } catch (JSONException unused) {
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List mo20684c() {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f20234b);
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo20685d() {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            return this.f20233a;
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo20686f() {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            return this.f20235c;
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }
}

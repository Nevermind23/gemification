package p297w4;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: w4.h */
public final class C8801h {

    /* renamed from: g */
    private static C8801h f24694g;

    /* renamed from: a */
    private final Map f24695a;

    /* renamed from: b */
    private final Map f24696b;

    /* renamed from: c */
    private final Map f24697c;

    /* renamed from: d */
    private final String f24698d;

    /* renamed from: e */
    private final String f24699e;

    /* renamed from: f */
    private final String f24700f;

    /* renamed from: w4.h$a */
    static class C8802a extends HashMap {
        C8802a() {
            put(2, (Object) null);
            put(4, (Object) null);
            put(9, (Object) null);
            put(17, (Object) null);
            put(341, (Object) null);
        }
    }

    /* renamed from: w4.h$b */
    static class C8803b extends HashMap {
        C8803b() {
            put(102, (Object) null);
            put(190, (Object) null);
            put(412, (Object) null);
        }
    }

    /* renamed from: w4.h$c */
    static /* synthetic */ class C8804c {

        /* renamed from: a */
        static final /* synthetic */ int[] f24701a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.FacebookRequestError$b[] r0 = com.facebook.FacebookRequestError.C2605b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24701a = r0
                com.facebook.FacebookRequestError$b r1 = com.facebook.FacebookRequestError.C2605b.OTHER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24701a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.FacebookRequestError$b r1 = com.facebook.FacebookRequestError.C2605b.LOGIN_RECOVERABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24701a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.FacebookRequestError$b r1 = com.facebook.FacebookRequestError.C2605b.TRANSIENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p297w4.C8801h.C8804c.<clinit>():void");
        }
    }

    C8801h(Map map, Map map2, Map map3, String str, String str2, String str3) {
        this.f24695a = map;
        this.f24696b = map2;
        this.f24697c = map3;
        this.f24698d = str;
        this.f24699e = str2;
        this.f24700f = str3;
    }

    /* renamed from: b */
    public static C8801h m32780b(JSONArray jSONArray) {
        String optString;
        if (jSONArray == null) {
            return null;
        }
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                if (optString.equalsIgnoreCase("other")) {
                    str = optJSONObject.optString("recovery_message", (String) null);
                    map = m32783f(optJSONObject);
                } else if (optString.equalsIgnoreCase("transient")) {
                    str2 = optJSONObject.optString("recovery_message", (String) null);
                    map2 = m32783f(optJSONObject);
                } else if (optString.equalsIgnoreCase("login_recoverable")) {
                    str3 = optJSONObject.optString("recovery_message", (String) null);
                    map3 = m32783f(optJSONObject);
                }
            }
        }
        return new C8801h(map, map2, map3, str, str2, str3);
    }

    /* renamed from: c */
    public static synchronized C8801h m32781c() {
        C8801h hVar;
        synchronized (C8801h.class) {
            if (f24694g == null) {
                f24694g = m32782d();
            }
            hVar = f24694g;
        }
        return hVar;
    }

    /* renamed from: d */
    private static C8801h m32782d() {
        return new C8801h((Map) null, new C8802a(), new C8803b(), (String) null, (String) null, (String) null);
    }

    /* renamed from: f */
    private static Map m32783f(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optInt = optJSONObject.optInt("code")) == 0)) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        int optInt2 = optJSONArray2.optInt(i2);
                        if (optInt2 != 0) {
                            hashSet.add(Integer.valueOf(optInt2));
                        }
                    }
                }
                hashMap.put(Integer.valueOf(optInt), hashSet);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public FacebookRequestError.C2605b mo24229a(int i, int i2, boolean z) {
        Set set;
        Set set2;
        Set set3;
        if (z) {
            return FacebookRequestError.C2605b.TRANSIENT;
        }
        Map map = this.f24695a;
        if (map != null && map.containsKey(Integer.valueOf(i)) && ((set3 = (Set) this.f24695a.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.C2605b.OTHER;
        }
        Map map2 = this.f24697c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i)) && ((set2 = (Set) this.f24697c.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.C2605b.LOGIN_RECOVERABLE;
        }
        Map map3 = this.f24696b;
        if (map3 == null || !map3.containsKey(Integer.valueOf(i)) || ((set = (Set) this.f24696b.get(Integer.valueOf(i))) != null && !set.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.C2605b.OTHER;
        }
        return FacebookRequestError.C2605b.TRANSIENT;
    }

    /* renamed from: e */
    public String mo24230e(FacebookRequestError.C2605b bVar) {
        int i = C8804c.f24701a[bVar.ordinal()];
        if (i == 1) {
            return this.f24698d;
        }
        if (i == 2) {
            return this.f24700f;
        }
        if (i != 3) {
            return null;
        }
        return this.f24699e;
    }
}

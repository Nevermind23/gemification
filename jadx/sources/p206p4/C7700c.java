package p206p4;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.GraphRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p180n4.C7226a;
import p193o4.C7445f;
import p245s4.C8225d;
import p297w4.C8769a0;
import p297w4.C8808k;
import p334z4.C9207a;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: p4.c */
public abstract class C7700c {

    /* renamed from: a */
    private static final Map f22382a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final Integer f22383b = 259200000;

    /* renamed from: c */
    private static final List f22384c = Arrays.asList(new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});

    /* renamed from: d */
    private static final List f22385d = Arrays.asList(new String[]{"none", "address", "health"});

    /* renamed from: p4.c$a */
    static class C7701a implements Runnable {
        C7701a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[Catch:{ Exception -> 0x0072, all -> 0x006e }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0050 A[Catch:{ Exception -> 0x0072, all -> 0x006e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "model_request_timestamp"
                java.lang.String r1 = "models"
                boolean r2 = p334z4.C9207a.m34024c(r7)
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                android.content.Context r2 = com.facebook.C2626d.m10134e()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
                r4 = 0
                android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r3 = 0
                java.lang.String r3 = r2.getString(r1, r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 == 0) goto L_0x002a
                boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r4 == 0) goto L_0x0024
                goto L_0x002a
            L_0x0024:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r4.<init>(r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                goto L_0x002f
            L_0x002a:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r4.<init>()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            L_0x002f:
                r5 = 0
                long r5 = r2.getLong(r0, r5)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                w4.k$d r3 = p297w4.C8808k.C8812d.ModelRequest     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                boolean r3 = p297w4.C8808k.m32797g(r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 == 0) goto L_0x0049
                int r3 = r4.length()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 == 0) goto L_0x0049
                boolean r3 = p206p4.C7700c.m29243a(r5)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 != 0) goto L_0x0067
            L_0x0049:
                org.json.JSONObject r4 = p206p4.C7700c.m29244b()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r4 != 0) goto L_0x0050
                return
            L_0x0050:
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r0.apply()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            L_0x0067:
                p206p4.C7700c.m29245c(r4)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                p206p4.C7700c.m29246d()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                goto L_0x0072
            L_0x006e:
                r0 = move-exception
                p334z4.C9207a.m34023b(r0, r7)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p206p4.C7700c.C7701a.run():void");
        }
    }

    /* renamed from: p4.c$b */
    static class C7702b implements Runnable {
        C7702b() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C8225d.m31005c();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: p4.c$c */
    static class C7703c implements Runnable {
        C7703c() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C7226a.m27804a();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: p4.c$d */
    static /* synthetic */ class C7704d {

        /* renamed from: a */
        static final /* synthetic */ int[] f22386a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                p4.c$e[] r0 = p206p4.C7700c.C7705e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22386a = r0
                p4.c$e r1 = p206p4.C7700c.C7705e.MTML_INTEGRITY_DETECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22386a     // Catch:{ NoSuchFieldError -> 0x001d }
                p4.c$e r1 = p206p4.C7700c.C7705e.MTML_APP_EVENT_PREDICTION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p206p4.C7700c.C7704d.<clinit>():void");
        }
    }

    /* renamed from: p4.c$e */
    public enum C7705e {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: a */
        public String mo22439a() {
            int i = C7704d.f22386a[ordinal()];
            return i != 1 ? i != 2 ? "Unknown" : "app_event_pred" : "integrity_detect";
        }

        /* renamed from: b */
        public String mo22440b() {
            int i = C7704d.f22386a[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i != 2) {
                return null;
            }
            return "MTML_APP_EVENT_PRED";
        }
    }

    /* renamed from: p4.c$f */
    private static class C7706f {

        /* renamed from: a */
        String f22390a;

        /* renamed from: b */
        String f22391b;

        /* renamed from: c */
        String f22392c;

        /* renamed from: d */
        int f22393d;

        /* renamed from: e */
        float[] f22394e;

        /* renamed from: f */
        File f22395f;

        /* renamed from: g */
        C7697b f22396g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Runnable f22397h;

        /* renamed from: p4.c$f$a */
        static class C7707a implements C7445f.C7446a {

            /* renamed from: a */
            final /* synthetic */ List f22398a;

            /* renamed from: p4.c$f$a$a */
            class C7708a implements C7445f.C7446a {

                /* renamed from: a */
                final /* synthetic */ C7706f f22399a;

                /* renamed from: b */
                final /* synthetic */ C7697b f22400b;

                C7708a(C7706f fVar, C7697b bVar) {
                    this.f22399a = fVar;
                    this.f22400b = bVar;
                }

                /* renamed from: a */
                public void mo21848a(File file) {
                    C7706f fVar = this.f22399a;
                    fVar.f22396g = this.f22400b;
                    fVar.f22395f = file;
                    if (fVar.f22397h != null) {
                        this.f22399a.f22397h.run();
                    }
                }
            }

            C7707a(List list) {
                this.f22398a = list;
            }

            /* renamed from: a */
            public void mo21848a(File file) {
                C7697b a = C7697b.m29239a(file);
                if (a != null) {
                    for (C7706f fVar : this.f22398a) {
                        C7706f.m29266e(fVar.f22392c, fVar.f22390a + "_" + fVar.f22393d + "_rule", new C7708a(fVar, a));
                    }
                }
            }
        }

        C7706f(String str, String str2, String str3, int i, float[] fArr) {
            this.f22390a = str;
            this.f22391b = str2;
            this.f22392c = str3;
            this.f22393d = i;
            this.f22394e = fArr;
        }

        /* renamed from: c */
        static C7706f m29264c(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                return new C7706f(jSONObject.getString("use_case"), jSONObject.getString("asset_uri"), jSONObject.optString("rules_uri", (String) null), jSONObject.getInt("version_id"), C7700c.m29247e(jSONObject.getJSONArray("thresholds")));
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: d */
        private static void m29265d(String str, int i) {
            File[] listFiles;
            File a = C7710e.m29283a();
            if (a != null && (listFiles = a.listFiles()) != null && listFiles.length != 0) {
                String str2 = str + "_" + i;
                for (File file : listFiles) {
                    String name = file.getName();
                    if (name.startsWith(str) && !name.startsWith(str2)) {
                        file.delete();
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static void m29266e(String str, String str2, C7445f.C7446a aVar) {
            File file = new File(C7710e.m29283a(), str2);
            if (str == null || file.exists()) {
                aVar.mo21848a(file);
            } else {
                new C7445f(str, file, aVar).execute(new String[0]);
            }
        }

        /* renamed from: f */
        static void m29267f(C7706f fVar, List list) {
            m29265d(fVar.f22390a, fVar.f22393d);
            m29266e(fVar.f22391b, fVar.f22390a + "_" + fVar.f22393d, new C7707a(list));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C7706f mo22441g(Runnable runnable) {
            this.f22397h = runnable;
            return this;
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m29243a(long j) {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return m29254l(j);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: b */
    static /* synthetic */ JSONObject m29244b() {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return m29251i();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m29245c(JSONObject jSONObject) {
        Class<C7700c> cls = C7700c.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m29248f(jSONObject);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m29246d() {
        Class<C7700c> cls = C7700c.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m29250h();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: e */
    static /* synthetic */ float[] m29247e(JSONArray jSONArray) {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return m29255m(jSONArray);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    private static void m29248f(JSONObject jSONObject) {
        Class<C7700c> cls = C7700c.class;
        if (!C9207a.m34024c(cls)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        C7706f c = C7706f.m29264c(jSONObject.getJSONObject(keys.next()));
                        if (c != null) {
                            f22382a.put(c.f22390a, c);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: g */
    public static void m29249g() {
        Class<C7700c> cls = C7700c.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C8769a0.m32679m0(new C7701a());
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: h */
    private static void m29250h() {
        Class<C7700c> cls = C7700c.class;
        if (!C9207a.m34024c(cls)) {
            try {
                ArrayList arrayList = new ArrayList();
                String str = null;
                int i = 0;
                for (Map.Entry entry : f22382a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    if (str2.equals(C7705e.MTML_APP_EVENT_PREDICTION.mo22440b())) {
                        C7706f fVar = (C7706f) entry.getValue();
                        str = fVar.f22391b;
                        i = Math.max(i, fVar.f22393d);
                        if (C8808k.m32797g(C8808k.C8812d.SuggestedEvents) && m29253k()) {
                            arrayList.add(fVar.mo22441g(new C7702b()));
                        }
                    }
                    if (str2.equals(C7705e.MTML_INTEGRITY_DETECT.mo22440b())) {
                        C7706f fVar2 = (C7706f) entry.getValue();
                        String str3 = fVar2.f22391b;
                        int max = Math.max(i, fVar2.f22393d);
                        if (C8808k.m32797g(C8808k.C8812d.IntelligentIntegrity)) {
                            arrayList.add(fVar2.mo22441g(new C7703c()));
                        }
                        str = str3;
                        i = max;
                    }
                }
                if (str != null && i > 0 && !arrayList.isEmpty()) {
                    C7706f.m29267f(new C7706f("MTML", str, (String) null, i, (float[]) null), arrayList);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: i */
    private static JSONObject m29251i() {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest J = GraphRequest.m10012J((AccessToken) null, String.format("%s/model_asset", new Object[]{C2626d.m10135f()}), (GraphRequest.C2612e) null);
            J.mo8182a0(true);
            J.mo8181Z(bundle);
            JSONObject h = J.mo8184g().mo8280h();
            if (h == null) {
                return null;
            }
            return m29256n(h);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: j */
    public static File m29252j(C7705e eVar) {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            C7706f fVar = (C7706f) f22382a.get(eVar.mo22440b());
            if (fVar == null) {
                return null;
            }
            return fVar.f22395f;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: k */
    private static boolean m29253k() {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            Locale C = C8769a0.m32630C();
            if (C == null || C.getLanguage().contains("en")) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: l */
    private static boolean m29254l(long j) {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls) || j == 0) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - j < ((long) f22383b.intValue())) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: m */
    private static float[] m29255m(JSONArray jSONArray) {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    fArr[i] = Float.parseFloat(jSONArray.getString(i));
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        return new org.json.JSONObject();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0063 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject m29256n(org.json.JSONObject r12) {
        /*
            java.lang.String r0 = "asset_uri"
            java.lang.String r1 = "thresholds"
            java.lang.String r2 = "version_id"
            java.lang.String r3 = "rules_uri"
            java.lang.String r4 = "use_case"
            java.lang.Class<p4.c> r5 = p206p4.C7700c.class
            boolean r6 = p334z4.C9207a.m34024c(r5)
            r7 = 0
            if (r6 == 0) goto L_0x0014
            return r7
        L_0x0014:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0069 }
            r6.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.String r8 = "data"
            org.json.JSONArray r12 = r12.getJSONArray(r8)     // Catch:{ JSONException -> 0x0063 }
            r8 = 0
        L_0x0020:
            int r9 = r12.length()     // Catch:{ JSONException -> 0x0063 }
            if (r8 >= r9) goto L_0x0062
            org.json.JSONObject r9 = r12.getJSONObject(r8)     // Catch:{ JSONException -> 0x0063 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0063 }
            r10.<init>()     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r11 = r9.getString(r2)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r2, r11)     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r11 = r9.getString(r4)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r4, r11)     // Catch:{ JSONException -> 0x0063 }
            org.json.JSONArray r11 = r9.getJSONArray(r1)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r1, r11)     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r11 = r9.getString(r0)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r0, r11)     // Catch:{ JSONException -> 0x0063 }
            boolean r11 = r9.has(r3)     // Catch:{ JSONException -> 0x0063 }
            if (r11 == 0) goto L_0x0058
            java.lang.String r11 = r9.getString(r3)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r3, r11)     // Catch:{ JSONException -> 0x0063 }
        L_0x0058:
            java.lang.String r9 = r9.getString(r4)     // Catch:{ JSONException -> 0x0063 }
            r6.put(r9, r10)     // Catch:{ JSONException -> 0x0063 }
            int r8 = r8 + 1
            goto L_0x0020
        L_0x0062:
            return r6
        L_0x0063:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ all -> 0x0069 }
            r12.<init>()     // Catch:{ all -> 0x0069 }
            return r12
        L_0x0069:
            r12 = move-exception
            p334z4.C9207a.m34023b(r12, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p206p4.C7700c.m29256n(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: o */
    public static String[] m29257o(C7705e eVar, float[][] fArr, String[] strArr) {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            C7706f fVar = (C7706f) f22382a.get(eVar.mo22440b());
            if (fVar != null) {
                if (fVar.f22396g != null) {
                    int length = strArr.length;
                    int length2 = fArr[0].length;
                    C7696a aVar = new C7696a(new int[]{length, length2});
                    for (int i = 0; i < length; i++) {
                        System.arraycopy(fArr[i], 0, aVar.mo22431b(), i * length2, length2);
                    }
                    C7696a d = fVar.f22396g.mo22435d(aVar, strArr, eVar.mo22439a());
                    float[] fArr2 = fVar.f22394e;
                    if (!(d == null || fArr2 == null || d.mo22431b().length == 0)) {
                        if (fArr2.length != 0) {
                            int i2 = C7704d.f22386a[eVar.ordinal()];
                            if (i2 == 1) {
                                return m29258p(d, fArr2);
                            }
                            if (i2 != 2) {
                                return null;
                            }
                            return m29259q(d, fArr2);
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: p */
    private static String[] m29258p(C7696a aVar, float[] fArr) {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            int c = aVar.mo22432c(0);
            int c2 = aVar.mo22432c(1);
            float[] b = aVar.mo22431b();
            String[] strArr = new String[c];
            if (c2 != fArr.length) {
                return null;
            }
            for (int i = 0; i < c; i++) {
                strArr[i] = "none";
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    if (b[(i * c2) + i2] >= fArr[i2]) {
                        strArr[i] = (String) f22385d.get(i2);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: q */
    private static String[] m29259q(C7696a aVar, float[] fArr) {
        Class<C7700c> cls = C7700c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            int c = aVar.mo22432c(0);
            int c2 = aVar.mo22432c(1);
            float[] b = aVar.mo22431b();
            String[] strArr = new String[c];
            if (c2 != fArr.length) {
                return null;
            }
            for (int i = 0; i < c; i++) {
                strArr[i] = "other";
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    if (b[(i * c2) + i2] >= fArr[i2]) {
                        strArr[i] = (String) f22384c.get(i2);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }
}

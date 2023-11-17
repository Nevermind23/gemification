package p310x4;

import android.os.Build;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;

/* renamed from: x4.b */
public final class C8955b {

    /* renamed from: a */
    private String f24961a;

    /* renamed from: b */
    private C8958c f24962b;

    /* renamed from: c */
    private JSONArray f24963c;

    /* renamed from: d */
    private String f24964d;

    /* renamed from: e */
    private String f24965e;

    /* renamed from: f */
    private String f24966f;

    /* renamed from: g */
    private Long f24967g;

    /* renamed from: x4.b$a */
    static /* synthetic */ class C8956a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24968a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                x4.b$c[] r0 = p310x4.C8955b.C8958c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24968a = r0
                x4.b$c r1 = p310x4.C8955b.C8958c.Analysis     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x001d }
                x4.b$c r1 = p310x4.C8955b.C8958c.CrashReport     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x4.b$c r1 = p310x4.C8955b.C8958c.CrashShield     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x0033 }
                x4.b$c r1 = p310x4.C8955b.C8958c.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p310x4.C8955b.C8956a.<clinit>():void");
        }
    }

    /* renamed from: x4.b$b */
    public static class C8957b {
        /* renamed from: a */
        public static C8955b m33220a(Throwable th, C8958c cVar) {
            return new C8955b(th, cVar, (C8956a) null);
        }

        /* renamed from: b */
        public static C8955b m33221b(JSONArray jSONArray) {
            return new C8955b(jSONArray, (C8956a) null);
        }

        /* renamed from: c */
        public static C8955b m33222c(File file) {
            return new C8955b(file, (C8956a) null);
        }
    }

    /* renamed from: x4.b$c */
    public enum C8958c {
        Unknown,
        Analysis,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: a */
        public String mo24377a() {
            int i = C8956a.f24968a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "analysis_log_";
        }

        public String toString() {
            int i = C8956a.f24968a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "Analysis";
        }
    }

    /* synthetic */ C8955b(File file, C8956a aVar) {
        this(file);
    }

    /* renamed from: c */
    private JSONObject m33212c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f24963c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.f24967g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private JSONObject m33213d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f24964d;
            if (str != null) {
                jSONObject.put(C11772k.C11773a.f34185q, str);
            }
            Long l = this.f24967g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.f24965e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f24966f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            C8958c cVar = this.f24962b;
            if (cVar != null) {
                jSONObject.put("type", cVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private JSONObject m33214e() {
        int i = C8956a.f24968a[this.f24962b.ordinal()];
        if (i == 1) {
            return m33212c();
        }
        if (i == 2 || i == 3 || i == 4) {
            return m33213d();
        }
        return null;
    }

    /* renamed from: f */
    private static C8958c m33215f(String str) {
        if (str.startsWith("crash_log_")) {
            return C8958c.CrashReport;
        }
        if (str.startsWith("shield_log_")) {
            return C8958c.CrashShield;
        }
        if (str.startsWith("thread_check_log_")) {
            return C8958c.ThreadCheck;
        }
        if (str.startsWith("analysis_log_")) {
            return C8958c.Analysis;
        }
        return C8958c.Unknown;
    }

    /* renamed from: a */
    public void mo24372a() {
        C8962d.m33227a(this.f24961a);
    }

    /* renamed from: b */
    public int mo24373b(C8955b bVar) {
        Long l = this.f24967g;
        if (l == null) {
            return -1;
        }
        Long l2 = bVar.f24967g;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    /* renamed from: g */
    public boolean mo24374g() {
        int i = C8956a.f24968a[this.f24962b.ordinal()];
        if (i != 1) {
            if ((i != 2 && i != 3 && i != 4) || this.f24966f == null || this.f24967g == null) {
                return false;
            }
            return true;
        } else if (this.f24963c == null || this.f24967g == null) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public void mo24375h() {
        if (mo24374g()) {
            C8962d.m33236j(this.f24961a, toString());
        }
    }

    public String toString() {
        JSONObject e = m33214e();
        if (e == null) {
            return null;
        }
        return e.toString();
    }

    /* synthetic */ C8955b(Throwable th, C8958c cVar, C8956a aVar) {
        this(th, cVar);
    }

    /* synthetic */ C8955b(JSONArray jSONArray, C8956a aVar) {
        this(jSONArray);
    }

    private C8955b(JSONArray jSONArray) {
        this.f24962b = C8958c.Analysis;
        this.f24967g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f24963c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(this.f24967g.toString());
        stringBuffer.append(".json");
        this.f24961a = stringBuffer.toString();
    }

    private C8955b(Throwable th, C8958c cVar) {
        this.f24962b = cVar;
        this.f24964d = C8769a0.m32690s();
        this.f24965e = C8962d.m33228b(th);
        this.f24966f = C8962d.m33230d(th);
        this.f24967g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.mo24377a());
        stringBuffer.append(this.f24967g.toString());
        stringBuffer.append(".json");
        this.f24961a = stringBuffer.toString();
    }

    private C8955b(File file) {
        String name = file.getName();
        this.f24961a = name;
        this.f24962b = m33215f(name);
        JSONObject h = C8962d.m33234h(this.f24961a, true);
        if (h != null) {
            this.f24967g = Long.valueOf(h.optLong("timestamp", 0));
            this.f24964d = h.optString(C11772k.C11773a.f34185q, (String) null);
            this.f24965e = h.optString("reason", (String) null);
            this.f24966f = h.optString("callstack", (String) null);
            this.f24963c = h.optJSONArray("feature_names");
        }
    }
}

package p068e9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p027b9.C2184f;
import p339z9.C9270e;

/* renamed from: e9.w */
public class C6114w implements C6115x {

    /* renamed from: g */
    private static final Pattern f18999g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    private static final String f19000h = Pattern.quote(C11110u2.f31950c);

    /* renamed from: a */
    private final C6116y f19001a;

    /* renamed from: b */
    private final Context f19002b;

    /* renamed from: c */
    private final String f19003c;

    /* renamed from: d */
    private final C9270e f19004d;

    /* renamed from: e */
    private final C6106s f19005e;

    /* renamed from: f */
    private String f19006f;

    public C6114w(Context context, String str, C9270e eVar, C6106s sVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f19002b = context;
            this.f19003c = str;
            this.f19004d = eVar;
            this.f19005e = sVar;
            this.f19001a = new C6116y();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    /* renamed from: b */
    private synchronized String m24442b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = m24445e(UUID.randomUUID().toString());
        C2184f f = C2184f.m8346f();
        f.mo7095i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    /* renamed from: c */
    static String m24443c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: d */
    private String m24444d() {
        try {
            return (String) C6107s0.m24419f(this.f19004d.mo17504a());
        } catch (Exception e) {
            C2184f.m8346f().mo7098l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: e */
    private static String m24445e(String str) {
        if (str == null) {
            return null;
        }
        return f18999g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m24446k(String str) {
        if (str == null || !str.startsWith("SYN_")) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private String m24447l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    /* renamed from: m */
    private String m24448m(String str) {
        return str.replaceAll(f19000h, "");
    }

    /* renamed from: a */
    public synchronized String mo19643a() {
        String str = this.f19006f;
        if (str != null) {
            return str;
        }
        C2184f.m8346f().mo7095i("Determining Crashlytics installation ID...");
        SharedPreferences s = C6063h.m24228s(this.f19002b);
        String string = s.getString("firebase.installation.id", (String) null);
        C2184f f = C2184f.m8346f();
        f.mo7095i("Cached Firebase Installation ID: " + string);
        if (this.f19005e.mo19637d()) {
            String d = m24444d();
            C2184f f2 = C2184f.m8346f();
            f2.mo7095i("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                if (string == null) {
                    d = m24443c();
                } else {
                    d = string;
                }
            }
            if (d.equals(string)) {
                this.f19006f = m24447l(s);
            } else {
                this.f19006f = m24442b(d, s);
            }
        } else if (m24446k(string)) {
            this.f19006f = m24447l(s);
        } else {
            this.f19006f = m24442b(m24443c(), s);
        }
        if (this.f19006f == null) {
            C2184f.m8346f().mo7097k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f19006f = m24442b(m24443c(), s);
        }
        C2184f f3 = C2184f.m8346f();
        f3.mo7095i("Crashlytics installation ID: " + this.f19006f);
        return this.f19006f;
    }

    /* renamed from: f */
    public String mo19644f() {
        return this.f19003c;
    }

    /* renamed from: g */
    public String mo19645g() {
        return this.f19001a.mo19649a(this.f19002b);
    }

    /* renamed from: h */
    public String mo19646h() {
        return String.format(Locale.US, "%s/%s", new Object[]{m24448m(Build.MANUFACTURER), m24448m(Build.MODEL)});
    }

    /* renamed from: i */
    public String mo19647i() {
        return m24448m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String mo19648j() {
        return m24448m(Build.VERSION.RELEASE);
    }
}

package p297w4;

import android.util.Log;
import com.facebook.C2626d;
import com.facebook.C2645k;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w4.r */
public class C8831r {

    /* renamed from: e */
    private static final HashMap f24793e = new HashMap();

    /* renamed from: a */
    private final C2645k f24794a;

    /* renamed from: b */
    private final String f24795b;

    /* renamed from: c */
    private StringBuilder f24796c;

    /* renamed from: d */
    private int f24797d = 3;

    public C8831r(C2645k kVar, String str) {
        C8775b0.m32717j(str, "tag");
        this.f24794a = kVar;
        this.f24795b = "FacebookSDK." + str;
        this.f24796c = new StringBuilder();
    }

    /* renamed from: e */
    public static void m32864e(C2645k kVar, int i, String str, String str2) {
        if (C2626d.m10154y(kVar)) {
            String l = m32870l(str2);
            if (!str.startsWith("FacebookSDK.")) {
                str = "FacebookSDK." + str;
            }
            Log.println(i, str, l);
            if (kVar == C2645k.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public static void m32865f(C2645k kVar, int i, String str, String str2, Object... objArr) {
        if (C2626d.m10154y(kVar)) {
            m32864e(kVar, i, str, String.format(str2, objArr));
        }
    }

    /* renamed from: g */
    public static void m32866g(C2645k kVar, String str, String str2) {
        m32864e(kVar, 3, str, str2);
    }

    /* renamed from: h */
    public static void m32867h(C2645k kVar, String str, String str2, Object... objArr) {
        if (C2626d.m10154y(kVar)) {
            m32864e(kVar, 3, str, String.format(str2, objArr));
        }
    }

    /* renamed from: j */
    public static synchronized void m32868j(String str) {
        synchronized (C8831r.class) {
            if (!C2626d.m10154y(C2645k.INCLUDE_ACCESS_TOKENS)) {
                m32869k(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    /* renamed from: k */
    public static synchronized void m32869k(String str, String str2) {
        synchronized (C8831r.class) {
            f24793e.put(str, str2);
        }
    }

    /* renamed from: l */
    private static synchronized String m32870l(String str) {
        synchronized (C8831r.class) {
            for (Map.Entry entry : f24793e.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    /* renamed from: m */
    private boolean m32871m() {
        return C2626d.m10154y(this.f24794a);
    }

    /* renamed from: a */
    public void mo24258a(String str) {
        if (m32871m()) {
            this.f24796c.append(str);
        }
    }

    /* renamed from: b */
    public void mo24259b(String str, Object... objArr) {
        if (m32871m()) {
            this.f24796c.append(String.format(str, objArr));
        }
    }

    /* renamed from: c */
    public void mo24260c(String str, Object obj) {
        mo24259b("  %s:\t%s\n", str, obj);
    }

    /* renamed from: d */
    public void mo24261d() {
        mo24262i(this.f24796c.toString());
        this.f24796c = new StringBuilder();
    }

    /* renamed from: i */
    public void mo24262i(String str) {
        m32864e(this.f24794a, this.f24797d, this.f24795b, str);
    }
}

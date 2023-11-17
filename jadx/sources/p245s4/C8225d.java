package p245s4;

import android.app.Activity;
import com.facebook.C2626d;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p193o4.C7431a;
import p206p4.C7700c;
import p297w4.C8817m;
import p297w4.C8819n;
import p334z4.C9207a;

/* renamed from: s4.d */
public abstract class C8225d {

    /* renamed from: a */
    private static final AtomicBoolean f23404a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final Set f23405b = new HashSet();

    /* renamed from: c */
    private static final Set f23406c = new HashSet();

    /* renamed from: s4.d$a */
    static class C8226a implements Runnable {
        C8226a() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    if (!C8225d.m31003a().get()) {
                        C8225d.m31003a().set(true);
                        C8225d.m31004b();
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ AtomicBoolean m31003a() {
        Class<C8225d> cls = C8225d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f23404a;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m31004b() {
        Class<C8225d> cls = C8225d.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m31006d();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m31005c() {
        synchronized (C8225d.class) {
            if (!C9207a.m34024c(C8225d.class)) {
                try {
                    C2626d.m10142m().execute(new C8226a());
                } catch (Throwable th) {
                    C9207a.m34023b(th, C8225d.class);
                }
            }
        }
    }

    /* renamed from: d */
    private static void m31006d() {
        String l;
        File j;
        Class<C8225d> cls = C8225d.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C8817m o = C8819n.m32848o(C2626d.m10135f(), false);
                if (o != null && (l = o.mo24249l()) != null) {
                    m31009g(l);
                    if ((!f23405b.isEmpty() || !f23406c.isEmpty()) && (j = C7700c.m29252j(C7700c.C7705e.MTML_APP_EVENT_PREDICTION)) != null) {
                        C8222a.m30983d(j);
                        Activity p = C7431a.m28282p();
                        if (p != null) {
                            m31010h(p);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: e */
    static boolean m31007e(String str) {
        Class<C8225d> cls = C8225d.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return f23406c.contains(str);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    static boolean m31008f(String str) {
        Class<C8225d> cls = C8225d.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return f23405b.contains(str);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: g */
    protected static void m31009g(String str) {
        Class<C8225d> cls = C8225d.class;
        if (!C9207a.m34024c(cls)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("production_events")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        f23405b.add(jSONArray.getString(i));
                    }
                }
                if (jSONObject.has("eligible_for_prediction_events")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        f23406c.add(jSONArray2.getString(i2));
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: h */
    public static void m31010h(Activity activity) {
        Class<C8225d> cls = C8225d.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (!f23404a.get() || !C8222a.m30985f() || (f23405b.isEmpty() && f23406c.isEmpty())) {
                    C8227e.m31016f(activity);
                } else {
                    C8227e.m31014d(activity);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}

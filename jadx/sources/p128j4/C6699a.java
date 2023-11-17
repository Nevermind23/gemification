package p128j4;

import android.app.Activity;
import com.facebook.C2626d;
import p297w4.C8765a;
import p297w4.C8769a0;
import p297w4.C8817m;
import p297w4.C8819n;
import p334z4.C9207a;

/* renamed from: j4.a */
public abstract class C6699a {

    /* renamed from: a */
    private static final String f20230a = "j4.a";

    /* renamed from: b */
    private static Boolean f20231b = Boolean.FALSE;

    /* renamed from: j4.a$a */
    static class C6700a implements Runnable {
        C6700a() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    if (!C8765a.m32620l(C2626d.m10134e())) {
                        C6699a.m26131a();
                        C6699a.m26132b(Boolean.TRUE);
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26131a() {
        Class<C6699a> cls = C6699a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m26135e();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m26132b(Boolean bool) {
        Class<C6699a> cls = C6699a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            f20231b = bool;
            return bool;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static void m26133c() {
        Class<C6699a> cls = C6699a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C2626d.m10142m().execute(new C6700a());
            } catch (Exception e) {
                C8769a0.m32648U(f20230a, e);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static void m26134d(Activity activity) {
        Class<C6699a> cls = C6699a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (!f20231b.booleanValue()) {
                    return;
                }
                if (!C6702c.m26144e().isEmpty()) {
                    C6703d.m26156h(activity);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: e */
    private static void m26135e() {
        String g;
        Class<C6699a> cls = C6699a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C8817m o = C8819n.m32848o(C2626d.m10135f(), false);
                if (o != null && (g = o.mo24244g()) != null) {
                    C6702c.m26145g(g);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}

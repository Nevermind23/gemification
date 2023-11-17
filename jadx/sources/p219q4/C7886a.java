package p219q4;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.C2626d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p115i4.C6535c;
import p297w4.C8769a0;
import p334z4.C9207a;

/* renamed from: q4.a */
public abstract class C7886a {

    /* renamed from: a */
    private static final Set f22841a = new HashSet(Arrays.asList(new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"}));

    /* renamed from: q4.a$a */
    static class C7887a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Context f22842d;

        /* renamed from: e */
        final /* synthetic */ String f22843e;

        /* renamed from: f */
        final /* synthetic */ String f22844f;

        C7887a(Context context, String str, String str2) {
            this.f22842d = context;
            this.f22843e = str;
            this.f22844f = str2;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    SharedPreferences sharedPreferences = this.f22842d.getSharedPreferences(this.f22843e, 0);
                    String str = this.f22844f + "pingForOnDevice";
                    if (sharedPreferences.getLong(str, 0) == 0) {
                        C7890c.m29861e(this.f22844f);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(str, System.currentTimeMillis());
                        edit.apply();
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: q4.a$b */
    static class C7888b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f22845d;

        /* renamed from: e */
        final /* synthetic */ C6535c f22846e;

        C7888b(String str, C6535c cVar) {
            this.f22845d = str;
            this.f22846e = cVar;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C7890c.m29859c(this.f22845d, Arrays.asList(new C6535c[]{this.f22846e}));
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m29850a(C6535c cVar) {
        boolean z;
        Class<C7886a> cls = C7886a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (!cVar.mo20513b() || !f22841a.contains(cVar.mo20515e())) {
                z = false;
            } else {
                z = true;
            }
            if ((!cVar.mo20513b()) || z) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m29851b() {
        boolean z;
        Class<C7886a> cls = C7886a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (C2626d.m10146q(C2626d.m10134e()) || C8769a0.m32642O()) {
                z = false;
            } else {
                z = true;
            }
            if (!z || !C7890c.m29858b()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: c */
    public static void m29852c(String str, C6535c cVar) {
        Class<C7886a> cls = C7886a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (m29850a(cVar)) {
                    C2626d.m10142m().execute(new C7888b(str, cVar));
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static void m29853d(String str, String str2) {
        Class<C7886a> cls = C7886a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                Context e = C2626d.m10134e();
                if (e != null && str != null && str2 != null) {
                    C2626d.m10142m().execute(new C7887a(e, str2, str));
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}

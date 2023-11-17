package p297w4;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.facebook.C2626d;
import p334z4.C9207a;

/* renamed from: w4.o */
public abstract class C8825o {

    /* renamed from: w4.o$a */
    static class C8826a implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ InstallReferrerClient f24786a;

        /* renamed from: b */
        final /* synthetic */ C8827b f24787b;

        C8826a(InstallReferrerClient installReferrerClient, C8827b bVar) {
            this.f24786a = installReferrerClient;
            this.f24787b = bVar;
        }

        /* renamed from: a */
        public void mo7635a(int i) {
            if (!C9207a.m34024c(this)) {
                if (i == 0) {
                    try {
                        String a = this.f24786a.mo7632a().mo7637a();
                        if (a != null && (a.contains("fb") || a.contains("facebook"))) {
                            this.f24787b.mo20541a(a);
                        }
                        C8825o.m32851a();
                    } catch (RemoteException unused) {
                    }
                } else if (i == 2) {
                    try {
                        C8825o.m32851a();
                    } catch (Throwable th) {
                        C9207a.m34023b(th, this);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo7636b() {
        }
    }

    /* renamed from: w4.o$b */
    public interface C8827b {
        /* renamed from: a */
        void mo20541a(String str);
    }

    /* renamed from: a */
    static /* synthetic */ void m32851a() {
        Class<C8825o> cls = C8825o.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m32855e();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static boolean m32852b() {
        Class<C8825o> cls = C8825o.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return C2626d.m10134e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: c */
    private static void m32853c(C8827b bVar) {
        Class<C8825o> cls = C8825o.class;
        if (!C9207a.m34024c(cls)) {
            try {
                InstallReferrerClient a = InstallReferrerClient.m9141b(C2626d.m10134e()).mo7634a();
                try {
                    a.mo7633c(new C8826a(a, bVar));
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static void m32854d(C8827b bVar) {
        Class<C8825o> cls = C8825o.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (!m32852b()) {
                    m32853c(bVar);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: e */
    private static void m32855e() {
        Class<C8825o> cls = C8825o.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C2626d.m10134e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}

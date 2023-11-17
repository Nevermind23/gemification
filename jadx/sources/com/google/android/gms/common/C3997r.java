package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import p130j6.C6736l;
import p182n6.C7263h0;
import p182n6.C7264i;
import p182n6.C7265i0;
import p260t6.C8399a;
import p260t6.C8409k;
import p299w6.C8862d;

/* renamed from: com.google.android.gms.common.r */
abstract class C3997r {

    /* renamed from: a */
    static final C3995p f12745a = new C3989j(C3993n.m15184y("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b */
    static final C3995p f12746b = new C3990k(C3993n.m15184y("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c */
    static final C3995p f12747c = new C3991l(C3993n.m15184y("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d */
    static final C3995p f12748d = new C3992m(C3993n.m15184y("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e */
    private static volatile C7265i0 f12749e;

    /* renamed from: f */
    private static final Object f12750f = new Object();

    /* renamed from: g */
    private static Context f12751g;

    /* renamed from: a */
    static C4012w m15191a(String str, C3993n nVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m15196f(str, nVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    static C4012w m15192b(String str, boolean z, boolean z2, boolean z3) {
        return m15197g(str, z, false, false, true);
    }

    /* renamed from: c */
    static /* synthetic */ String m15193c(boolean z, String str, C3993n nVar) {
        boolean z2;
        String str2;
        if (z || !m15196f(str, nVar, true, false).f12807a) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (true != z2) {
            str2 = "not allowed";
        } else {
            str2 = "debug cert rejected";
        }
        MessageDigest b = C8399a.m31524b("SHA-256");
        C7264i.m27902k(b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, C8409k.m31555a(b.digest(nVar.mo12322T1())), Boolean.valueOf(z), "12451000.false"});
    }

    /* renamed from: d */
    static synchronized void m15194d(Context context) {
        synchronized (C3997r.class) {
            if (f12751g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f12751g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    static boolean m15195e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m15198h();
            boolean c = f12749e.mo21636c();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return c;
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: f */
    private static C4012w m15196f(String str, C3993n nVar, boolean z, boolean z2) {
        try {
            m15198h();
            C7264i.m27902k(f12751g);
            try {
                if (f12749e.mo21637u1(new zzs(str, nVar, z, z2), C8862d.m32984T1(f12751g.getPackageManager()))) {
                    return C4012w.m15244b();
                }
                return new C4011v(new C3952i(z, str, nVar), (C6736l) null);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C4012w.m15246d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return C4012w.m15246d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [w6.b, android.os.IBinder] */
    /* renamed from: g */
    private static C4012w m15197g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C4012w wVar;
        zzq zzq;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C7264i.m27902k(f12751g);
            try {
                m15198h();
                zzo zzo = new zzo(str, z, false, C8862d.m32984T1(f12751g), false, true);
                if (z4) {
                    zzq = f12749e.mo21634R1(zzo);
                } else {
                    zzq = f12749e.mo21635Z1(zzo);
                }
                if (zzq.mo12392w()) {
                    wVar = C4012w.m15247f(zzq.mo12394x());
                } else {
                    String v = zzq.mo12391v();
                    if (zzq.mo12390R() == 4) {
                        nameNotFoundException = new PackageManager.NameNotFoundException();
                    } else {
                        nameNotFoundException = null;
                    }
                    if (v == null) {
                        v = "error checking package certificate";
                    }
                    wVar = C4012w.m15248g(zzq.mo12394x(), zzq.mo12390R(), v, nameNotFoundException);
                }
            } catch (DynamiteModule.LoadingException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                wVar = C4012w.m15246d("module init: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (RemoteException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            wVar = C4012w.m15246d("module call", e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return wVar;
    }

    /* renamed from: h */
    private static void m15198h() {
        if (f12749e == null) {
            C7264i.m27902k(f12751g);
            synchronized (f12750f) {
                if (f12749e == null) {
                    f12749e = C7263h0.m27891x(DynamiteModule.m15258e(f12751g, DynamiteModule.f12829f, "com.google.android.gms.googlecertificates").mo12397d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}

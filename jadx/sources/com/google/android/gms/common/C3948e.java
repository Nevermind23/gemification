package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.e */
public class C3948e {

    /* renamed from: c */
    private static C3948e f12582c;

    /* renamed from: a */
    private final Context f12583a;

    /* renamed from: b */
    private volatile String f12584b;

    public C3948e(Context context) {
        this.f12583a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C3948e m14975a(Context context) {
        C7264i.m27902k(context);
        synchronized (C3948e.class) {
            if (f12582c == null) {
                C3997r.m15194d(context);
                f12582c = new C3948e(context);
            }
        }
        return f12582c;
    }

    /* renamed from: d */
    static final C3993n m14976d(PackageInfo packageInfo, C3993n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C3994o oVar = new C3994o(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].equals(oVar)) {
                return nVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m14977e(PackageInfo packageInfo, boolean z) {
        C3993n nVar;
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                nVar = m14976d(packageInfo, C3996q.f12744a);
            } else {
                nVar = m14976d(packageInfo, C3996q.f12744a[0]);
            }
            if (nVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final C4012w m14978f(String str, boolean z, boolean z2) {
        C4012w wVar;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C4012w.m15245c("null pkg");
        }
        if (str.equals(this.f12584b)) {
            return C4012w.m15244b();
        }
        if (C3997r.m15195e()) {
            wVar = C3997r.m15192b(str, C3943d.m14964g(this.f12583a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f12583a.getPackageManager().getPackageInfo(str, 64);
                boolean g = C3943d.m14964g(this.f12583a);
                if (packageInfo == null) {
                    wVar = C4012w.m15245c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        wVar = C4012w.m15245c("single cert required");
                    } else {
                        C3994o oVar = new C3994o(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        C4012w a = C3997r.m15191a(str2, oVar, g, false);
                        if (!a.f12807a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C3997r.m15191a(str2, oVar, false, true).f12807a) {
                            wVar = a;
                        } else {
                            wVar = C4012w.m15245c("debuggable release cert app rejected");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                return C4012w.m15246d("no pkg ".concat(str), e);
            }
        }
        if (wVar.f12807a) {
            this.f12584b = str;
        }
        return wVar;
    }

    /* renamed from: b */
    public boolean mo12171b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m14977e(packageInfo, false)) {
            return true;
        }
        if (m14977e(packageInfo, true)) {
            if (C3943d.m14964g(this.f12583a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo12172c(int i) {
        C4012w wVar;
        int length;
        String[] packagesForUid = this.f12583a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            wVar = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C7264i.m27902k(wVar);
                    break;
                }
                wVar = m14978f(packagesForUid[i2], false, false);
                if (wVar.f12807a) {
                    break;
                }
                i2++;
            }
        } else {
            wVar = C4012w.m15245c("no pkgs");
        }
        wVar.mo12388e();
        return wVar.f12807a;
    }
}

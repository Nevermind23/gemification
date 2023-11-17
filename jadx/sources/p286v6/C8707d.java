package p286v6;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import p260t6.C8413o;

/* renamed from: v6.d */
public class C8707d {

    /* renamed from: a */
    protected final Context f24529a;

    public C8707d(Context context) {
        this.f24529a = context;
    }

    /* renamed from: a */
    public int mo24087a(String str) {
        return this.f24529a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int mo24088b(String str, String str2) {
        return this.f24529a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo mo24089c(String str, int i) {
        return this.f24529a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: d */
    public CharSequence mo24090d(String str) {
        return this.f24529a.getPackageManager().getApplicationLabel(this.f24529a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public PackageInfo mo24091e(String str, int i) {
        return this.f24529a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: f */
    public boolean mo24092f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C8705b.m32452a(this.f24529a);
        }
        if (!C8413o.m31570h() || (nameForUid = this.f24529a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f24529a.getPackageManager().isInstantApp(nameForUid);
    }

    /* renamed from: g */
    public final boolean mo24093g(int i, String str) {
        if (C8413o.m31566d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f24529a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f24529a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

package p068e9;

import android.content.Context;

/* renamed from: e9.y */
class C6116y {

    /* renamed from: a */
    private String f19007a;

    C6116y() {
    }

    /* renamed from: b */
    private static String m24456b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo19649a(Context context) {
        String str;
        if (this.f19007a == null) {
            this.f19007a = m24456b(context);
        }
        if ("".equals(this.f19007a)) {
            str = null;
        } else {
            str = this.f19007a;
        }
        return str;
    }
}

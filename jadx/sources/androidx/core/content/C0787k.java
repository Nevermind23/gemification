package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0691f;
import androidx.core.util.C1002c;

/* renamed from: androidx.core.content.k */
public abstract class C0787k {
    /* renamed from: a */
    public static int m2942a(Context context, String str, int i, int i2, String str2) {
        boolean z;
        int i3;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String c = C0691f.m2698c(str);
        if (c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid != i2 || !C1002c.m3509a(packageName, str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i3 = C0691f.m2696a(context, i2, c, str2);
        } else {
            i3 = C0691f.m2697b(context, c, str2);
        }
        if (i3 == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: b */
    public static int m2943b(Context context, String str) {
        return m2942a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}

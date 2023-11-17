package p203p1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.C2073m;

/* renamed from: p1.r */
public abstract class C7654r {

    /* renamed from: a */
    private static final String f22265a = C2073m.m8073i("PackageManagerHelper");

    /* renamed from: a */
    public static void m29095a(Context context, Class cls, boolean z) {
        int i;
        String str;
        String str2 = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            C2073m e = C2073m.m8071e();
            String str3 = f22265a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            sb.append(str);
            e.mo6959a(str3, sb.toString());
        } catch (Exception e2) {
            C2073m e3 = C2073m.m8071e();
            String str4 = f22265a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (!z) {
                str2 = "disabled";
            }
            sb2.append(str2);
            e3.mo6960b(str4, sb2.toString(), e2);
        }
    }
}

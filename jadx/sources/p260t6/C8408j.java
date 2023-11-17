package p260t6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.C3943d;

/* renamed from: t6.j */
public abstract class C8408j {

    /* renamed from: a */
    private static Boolean f23852a;

    /* renamed from: b */
    private static Boolean f23853b;

    /* renamed from: c */
    private static Boolean f23854c;

    /* renamed from: d */
    private static Boolean f23855d;

    /* renamed from: a */
    public static boolean m31548a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f23855d == null) {
            boolean z = false;
            if (C8413o.m31570h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f23855d = Boolean.valueOf(z);
        }
        return f23855d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m31549b() {
        int i = C3943d.f12557a;
        return "user".equals(Build.TYPE);
    }

    /* renamed from: c */
    public static boolean m31550c(Context context) {
        return m31554g(context.getPackageManager());
    }

    /* renamed from: d */
    public static boolean m31551d(Context context) {
        if (m31550c(context) && !C8413o.m31569g()) {
            return true;
        }
        if (m31552e(context)) {
            return !C8413o.m31570h() || C8413o.m31573k();
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m31552e(Context context) {
        if (f23853b == null) {
            boolean z = false;
            if (C8413o.m31568f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f23853b = Boolean.valueOf(z);
        }
        return f23853b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m31553f(Context context) {
        if (f23854c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f23854c = Boolean.valueOf(z);
        }
        return f23854c.booleanValue();
    }

    /* renamed from: g */
    public static boolean m31554g(PackageManager packageManager) {
        if (f23852a == null) {
            boolean z = false;
            if (C8413o.m31567e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f23852a = Boolean.valueOf(z);
        }
        return f23852a.booleanValue();
    }
}

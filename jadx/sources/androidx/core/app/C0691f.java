package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.f */
public abstract class C0691f {

    /* renamed from: androidx.core.app.f$a */
    static class C0692a {
        /* renamed from: a */
        static <T> T m2699a(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: b */
        static int m2700b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        static int m2701c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        static String m2702d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: androidx.core.app.f$b */
    static class C0693b {
        /* renamed from: a */
        static int m2703a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        static String m2704b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        static AppOpsManager m2705c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m2696a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m2697b(context, str, str2);
        }
        AppOpsManager c = C0693b.m2705c(context);
        int a = C0693b.m2703a(c, str, Binder.getCallingUid(), str2);
        if (a != 0) {
            return a;
        }
        return C0693b.m2703a(c, str, i, C0693b.m2704b(context));
    }

    /* renamed from: b */
    public static int m2697b(Context context, String str, String str2) {
        return C0692a.m2701c((AppOpsManager) C0692a.m2699a(context, AppOpsManager.class), str, str2);
    }

    /* renamed from: c */
    public static String m2698c(String str) {
        return C0692a.m2702d(str);
    }
}

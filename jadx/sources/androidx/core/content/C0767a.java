package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.C0676b1;
import androidx.core.content.res.C0808h;
import androidx.core.p016os.C0904b;
import androidx.core.p016os.C0914h;
import androidx.core.util.C1002c;
import java.io.File;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.content.a */
public class C0767a {

    /* renamed from: a */
    private static final Object f3398a = new Object();

    /* renamed from: b */
    private static final Object f3399b = new Object();

    /* renamed from: androidx.core.content.a$a */
    static class C0768a {
        /* renamed from: a */
        static void m2905a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m2906b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    static class C0769b {
        /* renamed from: a */
        static File[] m2907a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m2908b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m2909c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: androidx.core.content.a$c */
    static class C0770c {
        /* renamed from: a */
        static File m2910a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m2911b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m2912c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    static class C0771d {
        /* renamed from: a */
        static int m2913a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static <T> T m2914b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m2915c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$e */
    static class C0772e {
        /* renamed from: a */
        static Context m2916a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m2917b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m2918c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: androidx.core.content.a$f */
    static class C0773f {
        /* renamed from: a */
        static Intent m2919a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, C0767a.m2901k(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        /* renamed from: b */
        static ComponentName m2920b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: androidx.core.content.a$g */
    static class C0774g {
        /* renamed from: a */
        static Executor m2921a(Context context) {
            return context.getMainExecutor();
        }
    }

    protected C0767a() {
    }

    /* renamed from: a */
    public static int m2891a(Context context, String str) {
        C1002c.m3512d(str, "permission must be non-null");
        if (C0904b.m3331c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        if (C0676b1.m2677c(context).mo3119a()) {
            return 0;
        }
        return -1;
    }

    /* renamed from: b */
    public static Context m2892b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0772e.m2916a(context);
        }
        return null;
    }

    /* renamed from: c */
    public static int m2893c(Context context, int i) {
        return C0771d.m2913a(context, i);
    }

    /* renamed from: d */
    public static ColorStateList m2894d(Context context, int i) {
        return C0808h.m3030e(context.getResources(), i, context.getTheme());
    }

    /* renamed from: e */
    public static Drawable m2895e(Context context, int i) {
        return C0770c.m2911b(context, i);
    }

    /* renamed from: f */
    public static File[] m2896f(Context context) {
        return C0769b.m2907a(context);
    }

    /* renamed from: g */
    public static File[] m2897g(Context context, String str) {
        return C0769b.m2908b(context, str);
    }

    /* renamed from: h */
    public static Executor m2898h(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0774g.m2921a(context);
        }
        return C0914h.m3346a(new Handler(context.getMainLooper()));
    }

    /* renamed from: i */
    public static File m2899i(Context context) {
        return C0770c.m2912c(context);
    }

    /* renamed from: j */
    public static <T> T m2900j(Context context, Class<T> cls) {
        return C0771d.m2914b(context, cls);
    }

    /* renamed from: k */
    static String m2901k(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (C0787k.m2943b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    /* renamed from: l */
    public static boolean m2902l(Context context, Intent[] intentArr, Bundle bundle) {
        C0768a.m2905a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: m */
    public static void m2903m(Context context, Intent intent, Bundle bundle) {
        C0768a.m2906b(context, intent, bundle);
    }

    /* renamed from: n */
    public static void m2904n(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0773f.m2920b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}

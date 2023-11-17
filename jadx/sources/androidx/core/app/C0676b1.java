package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.core.app.b1 */
public final class C0676b1 {

    /* renamed from: c */
    private static final Object f3259c = new Object();

    /* renamed from: d */
    private static Set f3260d = new HashSet();

    /* renamed from: e */
    private static final Object f3261e = new Object();

    /* renamed from: a */
    private final Context f3262a;

    /* renamed from: b */
    private final NotificationManager f3263b;

    /* renamed from: androidx.core.app.b1$a */
    static class C0677a {
        /* renamed from: a */
        static boolean m2680a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        /* renamed from: b */
        static int m2681b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private C0676b1(Context context) {
        this.f3262a = context;
        this.f3263b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: c */
    public static C0676b1 m2677c(Context context) {
        return new C0676b1(context);
    }

    /* renamed from: a */
    public boolean mo3119a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0677a.m2680a(this.f3263b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f3262a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f3262a.getApplicationInfo();
        String packageName = this.f3262a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void mo3120b(String str, int i) {
        this.f3263b.cancel(str, i);
    }
}

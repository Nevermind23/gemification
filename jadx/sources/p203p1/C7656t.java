package p203p1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.C1950b;
import androidx.work.C2073m;
import androidx.work.C2094x;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: p1.t */
public abstract class C7656t {

    /* renamed from: a */
    private static final String f22267a;

    static {
        String i = C2073m.m8073i("ProcessUtils");
        C41536l.m120488h(i, "tagWithPrefix(\"ProcessUtils\")");
        f22267a = i;
    }

    /* renamed from: a */
    private static final String m29101a(Context context) {
        T t;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            return C7626b.f22216a.mo22332a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, C2094x.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            C41536l.m120486f(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            C2073m.m8071e().mo6960b(f22267a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((ActivityManager.RunningAppProcessInfo) t).pid == myPid) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) t;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m29102b(Context context, C1950b bVar) {
        boolean z;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(bVar, "configuration");
        String a = m29101a(context);
        String c = bVar.mo6693c();
        if (c == null || c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C41536l.m120484d(a, bVar.mo6693c());
        }
        return C41536l.m120484d(a, context.getApplicationInfo().processName);
    }
}

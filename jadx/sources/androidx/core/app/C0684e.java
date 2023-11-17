package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.e */
abstract class C0684e {

    /* renamed from: a */
    protected static final Class f3265a;

    /* renamed from: b */
    protected static final Field f3266b = m2686b();

    /* renamed from: c */
    protected static final Field f3267c = m2690f();

    /* renamed from: d */
    protected static final Method f3268d;

    /* renamed from: e */
    protected static final Method f3269e;

    /* renamed from: f */
    protected static final Method f3270f;

    /* renamed from: g */
    private static final Handler f3271g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.e$a */
    class C0685a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0688d f3272d;

        /* renamed from: e */
        final /* synthetic */ Object f3273e;

        C0685a(C0688d dVar, Object obj) {
            this.f3272d = dVar;
            this.f3273e = obj;
        }

        public void run() {
            this.f3272d.f3278d = this.f3273e;
        }
    }

    /* renamed from: androidx.core.app.e$b */
    class C0686b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Application f3274d;

        /* renamed from: e */
        final /* synthetic */ C0688d f3275e;

        C0686b(Application application, C0688d dVar) {
            this.f3274d = application;
            this.f3275e = dVar;
        }

        public void run() {
            this.f3274d.unregisterActivityLifecycleCallbacks(this.f3275e);
        }
    }

    /* renamed from: androidx.core.app.e$c */
    class C0687c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Object f3276d;

        /* renamed from: e */
        final /* synthetic */ Object f3277e;

        C0687c(Object obj, Object obj2) {
            this.f3276d = obj;
            this.f3277e = obj2;
        }

        public void run() {
            try {
                Method method = C0684e.f3268d;
                if (method != null) {
                    method.invoke(this.f3276d, new Object[]{this.f3277e, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C0684e.f3269e.invoke(this.f3276d, new Object[]{this.f3277e, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.e$d */
    private static final class C0688d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: d */
        Object f3278d;

        /* renamed from: e */
        private Activity f3279e;

        /* renamed from: f */
        private final int f3280f;

        /* renamed from: g */
        private boolean f3281g = false;

        /* renamed from: h */
        private boolean f3282h = false;

        /* renamed from: i */
        private boolean f3283i = false;

        C0688d(Activity activity) {
            this.f3279e = activity;
            this.f3280f = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f3279e == activity) {
                this.f3279e = null;
                this.f3282h = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f3282h && !this.f3283i && !this.f3281g && C0684e.m2692h(this.f3278d, this.f3280f, activity)) {
                this.f3283i = true;
                this.f3278d = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f3279e == activity) {
                this.f3281g = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a = m2685a();
        f3265a = a;
        f3268d = m2688d(a);
        f3269e = m2687c(a);
        f3270f = m2689e(a);
    }

    /* renamed from: a */
    private static Class m2685a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m2686b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m2687c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m2688d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m2689e(Class cls) {
        Class<Configuration> cls2 = Configuration.class;
        Class<List> cls3 = List.class;
        if (m2691g() && cls != null) {
            try {
                Class cls4 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, cls3, cls3, Integer.TYPE, cls4, cls2, cls2, cls4, cls4});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m2690f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m2691g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m2692h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f3267c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f3271g.postAtFrontOfQueue(new C0687c(f3266b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m2693i(Activity activity) {
        Object obj;
        Application application;
        C0688d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m2691g() && f3270f == null) {
            return false;
        } else {
            if (f3269e == null && f3268d == null) {
                return false;
            }
            try {
                Object obj2 = f3267c.get(activity);
                if (obj2 == null || (obj = f3266b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0688d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f3271g;
                handler.post(new C0685a(dVar, obj2));
                if (m2691g()) {
                    Method method = f3270f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C0686b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}

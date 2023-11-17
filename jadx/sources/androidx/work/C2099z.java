package androidx.work;

import android.content.Context;

/* renamed from: androidx.work.z */
public abstract class C2099z {

    /* renamed from: a */
    private static final String f6258a = C2073m.m8073i("WorkerFactory");

    /* renamed from: androidx.work.z$a */
    class C2100a extends C2099z {
        C2100a() {
        }

        /* renamed from: a */
        public C2068l mo6995a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static C2099z m8134c() {
        return new C2100a();
    }

    /* renamed from: a */
    public abstract C2068l mo6995a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final C2068l mo6996b(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        C2068l a = mo6995a(context, str, workerParameters);
        if (a == null) {
            try {
                cls = Class.forName(str).asSubclass(C2068l.class);
            } catch (Throwable th) {
                C2073m e = C2073m.m8071e();
                String str2 = f6258a;
                e.mo6962d(str2, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a = (C2068l) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    C2073m e2 = C2073m.m8071e();
                    String str3 = f6258a;
                    e2.mo6962d(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a == null || !a.isUsed()) {
            return a;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}

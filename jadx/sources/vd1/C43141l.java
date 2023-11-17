package vd1;

import androidx.lifecycle.C1612n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: vd1.l */
public abstract class C43141l {

    /* renamed from: a */
    public static final boolean f100648a;

    /* renamed from: b */
    public static final int f100649b;

    /* renamed from: c */
    static final AtomicReference f100650c = new AtomicReference();

    /* renamed from: d */
    static final Map f100651d = new ConcurrentHashMap();

    /* renamed from: vd1.l$a */
    static final class C43142a implements Runnable {
        C43142a() {
        }

        public void run() {
            Iterator it = new ArrayList(C43141l.f100651d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C43141l.f100651d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* renamed from: vd1.l$b */
    static final class C43143b implements C41405l {
        C43143b() {
        }

        /* renamed from: a */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    static {
        C43143b bVar = new C43143b();
        boolean b = m123754b(true, "rx2.purge-enabled", true, true, bVar);
        f100648a = b;
        f100649b = m123755c(b, "rx2.purge-period-seconds", 1, 1, bVar);
        m123756d();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m123753a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m123757e(f100648a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    static boolean m123754b(boolean z, String str, boolean z2, boolean z3, C41405l lVar) {
        if (!z) {
            return z3;
        }
        try {
            String str2 = (String) lVar.apply(str);
            if (str2 == null) {
                return z2;
            }
            return "true".equals(str2);
        } catch (Throwable unused) {
            return z2;
        }
    }

    /* renamed from: c */
    static int m123755c(boolean z, String str, int i, int i2, C41405l lVar) {
        if (!z) {
            return i2;
        }
        try {
            String str2 = (String) lVar.apply(str);
            if (str2 == null) {
                return i;
            }
            return Integer.parseInt(str2);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: d */
    public static void m123756d() {
        m123758f(f100648a);
    }

    /* renamed from: e */
    static void m123757e(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f100651d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: f */
    static void m123758f(boolean z) {
        if (z) {
            while (true) {
                AtomicReference atomicReference = f100650c;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C43136h("RxSchedulerPurge"));
                    if (C1612n.m5659a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                        C43142a aVar = new C43142a();
                        int i = f100649b;
                        newScheduledThreadPool.scheduleAtFixedRate(aVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }
}

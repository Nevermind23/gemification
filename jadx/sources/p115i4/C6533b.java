package p115i4;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C2626d;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p334z4.C9207a;

/* renamed from: i4.b */
abstract class C6533b {

    /* renamed from: a */
    private static final String f19965a = "b";

    /* renamed from: b */
    private static ReentrantReadWriteLock f19966b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static String f19967c;

    /* renamed from: d */
    private static volatile boolean f19968d = false;

    /* renamed from: i4.b$a */
    static class C6534a implements Runnable {
        C6534a() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C6533b.m25806c();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: b */
    public static String m25805b() {
        if (!f19968d) {
            Log.w(f19965a, "initStore should have been called before calling setUserID");
            m25806c();
        }
        f19966b.readLock().lock();
        try {
            return f19967c;
        } finally {
            f19966b.readLock().unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m25806c() {
        if (!f19968d) {
            f19966b.writeLock().lock();
            try {
                if (!f19968d) {
                    f19967c = PreferenceManager.getDefaultSharedPreferences(C2626d.m10134e()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", (String) null);
                    f19968d = true;
                    f19966b.writeLock().unlock();
                }
            } finally {
                f19966b.writeLock().unlock();
            }
        }
    }

    /* renamed from: d */
    public static void m25807d() {
        if (!f19968d) {
            C6564m.m25883b().execute(new C6534a());
        }
    }
}

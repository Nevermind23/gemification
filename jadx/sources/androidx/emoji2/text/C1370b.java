package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.emoji2.text.b */
abstract class C1370b {

    /* renamed from: androidx.emoji2.text.b$a */
    static class C1371a {
        /* renamed from: a */
        public static Handler m4711a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: b */
    static ThreadPoolExecutor m4708b(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C1369a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Thread m4709c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: d */
    static Handler m4710d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1371a.m4711a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}

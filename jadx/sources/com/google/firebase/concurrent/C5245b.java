package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.concurrent.b */
class C5245b implements ThreadFactory {

    /* renamed from: h */
    private static final ThreadFactory f16816h = Executors.defaultThreadFactory();

    /* renamed from: d */
    private final AtomicLong f16817d = new AtomicLong();

    /* renamed from: e */
    private final String f16818e;

    /* renamed from: f */
    private final int f16819f;

    /* renamed from: g */
    private final StrictMode.ThreadPolicy f16820g;

    C5245b(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f16818e = str;
        this.f16819f = i;
        this.f16820g = threadPolicy;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m20728b(Runnable runnable) {
        Process.setThreadPriority(this.f16819f);
        StrictMode.ThreadPolicy threadPolicy = this.f16820g;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = f16816h.newThread(new C5244a(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f16818e, Long.valueOf(this.f16817d.getAndIncrement())}));
        return newThread;
    }
}

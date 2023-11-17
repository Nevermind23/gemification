package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.medallia.digital.mobilesdk.m7 */
final class C11004m7 {

    /* renamed from: c */
    private static C11004m7 f31605c;

    /* renamed from: a */
    private final Executor f31606a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private final Executor f31607b = new C11006b();

    /* renamed from: com.medallia.digital.mobilesdk.m7$b */
    private static class C11006b implements Executor {

        /* renamed from: a */
        private final Handler f31608a;

        private C11006b() {
            this.f31608a = new Handler(Looper.getMainLooper());
        }

        public void execute(Runnable runnable) {
            this.f31608a.post(runnable);
        }
    }

    private C11004m7() {
    }

    /* renamed from: b */
    static C11004m7 m40304b() {
        if (f31605c == null) {
            f31605c = new C11004m7();
        }
        return f31605c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Executor mo28763a() {
        return this.f31606a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Executor mo28764c() {
        return this.f31607b;
    }
}

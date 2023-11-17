package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
final class C4157e2 implements ThreadFactory {

    /* renamed from: d */
    private final ThreadFactory f13205d = Executors.defaultThreadFactory();

    C4157e2(C4429u2 u2Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f13205d.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}

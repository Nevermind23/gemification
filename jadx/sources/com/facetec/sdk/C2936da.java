package com.facetec.sdk;

import java.util.TimerTask;

/* renamed from: com.facetec.sdk.da */
final class C2936da extends TimerTask {

    /* renamed from: a */
    private final Runnable f9836a;

    C2936da(Runnable runnable) {
        this.f9836a = runnable;
    }

    public final void run() {
        this.f9836a.run();
    }
}

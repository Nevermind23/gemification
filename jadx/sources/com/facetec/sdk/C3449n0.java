package com.facetec.sdk;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.facetec.sdk.n0 */
public final /* synthetic */ class C3449n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Timer f11294d;

    /* renamed from: e */
    public final /* synthetic */ TimerTask f11295e;

    /* renamed from: f */
    public final /* synthetic */ Runnable f11296f;

    public /* synthetic */ C3449n0(Timer timer, TimerTask timerTask, Runnable runnable) {
        this.f11294d = timer;
        this.f11295e = timerTask;
        this.f11296f = runnable;
    }

    public final void run() {
        C2780ai.m10760a(this.f11294d, this.f11295e, this.f11296f);
    }
}

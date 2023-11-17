package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* renamed from: com.google.firebase.perf.session.gauges.k */
public final /* synthetic */ class C5430k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C5431l f17304d;

    /* renamed from: e */
    public final /* synthetic */ Timer f17305e;

    public /* synthetic */ C5430k(C5431l lVar, Timer timer) {
        this.f17304d = lVar;
        this.f17305e = timer;
    }

    public final void run() {
        this.f17304d.m21559f(this.f17305e);
    }
}

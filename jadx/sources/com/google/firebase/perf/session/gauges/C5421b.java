package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* renamed from: com.google.firebase.perf.session.gauges.b */
public final /* synthetic */ class C5421b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C5422c f17281d;

    /* renamed from: e */
    public final /* synthetic */ Timer f17282e;

    public /* synthetic */ C5421b(C5422c cVar, Timer timer) {
        this.f17281d = cVar;
        this.f17282e = timer;
    }

    public final void run() {
        this.f17281d.m21544g(this.f17282e);
    }
}

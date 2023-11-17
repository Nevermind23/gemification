package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* renamed from: com.google.firebase.perf.session.gauges.j */
public final /* synthetic */ class C5429j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C5431l f17302d;

    /* renamed from: e */
    public final /* synthetic */ Timer f17303e;

    public /* synthetic */ C5429j(C5431l lVar, Timer timer) {
        this.f17302d = lVar;
        this.f17303e = timer;
    }

    public final void run() {
        this.f17302d.m21560g(this.f17303e);
    }
}

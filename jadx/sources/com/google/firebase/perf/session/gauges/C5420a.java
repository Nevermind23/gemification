package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* renamed from: com.google.firebase.perf.session.gauges.a */
public final /* synthetic */ class C5420a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C5422c f17279d;

    /* renamed from: e */
    public final /* synthetic */ Timer f17280e;

    public /* synthetic */ C5420a(C5422c cVar, Timer timer) {
        this.f17279d = cVar;
        this.f17280e = timer;
    }

    public final void run() {
        this.f17279d.m21545h(this.f17280e);
    }
}

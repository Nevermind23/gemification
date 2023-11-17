package com.google.firebase.perf.session.gauges;

import p225qa.C7957d;

/* renamed from: com.google.firebase.perf.session.gauges.e */
public final /* synthetic */ class C5424e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GaugeManager f17294d;

    /* renamed from: e */
    public final /* synthetic */ String f17295e;

    /* renamed from: f */
    public final /* synthetic */ C7957d f17296f;

    public /* synthetic */ C5424e(GaugeManager gaugeManager, String str, C7957d dVar) {
        this.f17294d = gaugeManager;
        this.f17295e = str;
        this.f17296f = dVar;
    }

    public final void run() {
        this.f17294d.lambda$startCollectingGauges$2(this.f17295e, this.f17296f);
    }
}

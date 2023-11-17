package com.google.firebase.perf.session.gauges;

import p225qa.C7957d;

/* renamed from: com.google.firebase.perf.session.gauges.d */
public final /* synthetic */ class C5423d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GaugeManager f17291d;

    /* renamed from: e */
    public final /* synthetic */ String f17292e;

    /* renamed from: f */
    public final /* synthetic */ C7957d f17293f;

    public /* synthetic */ C5423d(GaugeManager gaugeManager, String str, C7957d dVar) {
        this.f17291d = gaugeManager;
        this.f17292e = str;
        this.f17293f = dVar;
    }

    public final void run() {
        this.f17291d.lambda$stopCollectingGauges$3(this.f17292e, this.f17293f);
    }
}

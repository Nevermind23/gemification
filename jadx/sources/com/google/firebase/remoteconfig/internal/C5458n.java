package com.google.firebase.remoteconfig.internal;

import p260t6.C8402d;

/* renamed from: com.google.firebase.remoteconfig.internal.n */
public final /* synthetic */ class C5458n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C8402d f17432d;

    /* renamed from: e */
    public final /* synthetic */ String f17433e;

    /* renamed from: f */
    public final /* synthetic */ C5447g f17434f;

    public /* synthetic */ C5458n(C8402d dVar, String str, C5447g gVar) {
        this.f17432d = dVar;
        this.f17433e = str;
        this.f17434f = gVar;
    }

    public final void run() {
        this.f17432d.accept(this.f17433e, this.f17434f);
    }
}

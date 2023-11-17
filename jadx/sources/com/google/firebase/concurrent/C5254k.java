package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C5259p;

/* renamed from: com.google.firebase.concurrent.k */
public final /* synthetic */ class C5254k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C5258o f16849d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f16850e;

    /* renamed from: f */
    public final /* synthetic */ C5259p.C5261b f16851f;

    public /* synthetic */ C5254k(C5258o oVar, Runnable runnable, C5259p.C5261b bVar) {
        this.f16849d = oVar;
        this.f16850e = runnable;
        this.f16851f = bVar;
    }

    public final void run() {
        this.f16849d.m20746n(this.f16850e, this.f16851f);
    }
}

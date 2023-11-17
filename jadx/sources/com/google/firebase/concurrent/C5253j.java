package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C5259p;

/* renamed from: com.google.firebase.concurrent.j */
public final /* synthetic */ class C5253j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C5258o f16846d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f16847e;

    /* renamed from: f */
    public final /* synthetic */ C5259p.C5261b f16848f;

    public /* synthetic */ C5253j(C5258o oVar, Runnable runnable, C5259p.C5261b bVar) {
        this.f16846d = oVar;
        this.f16847e = runnable;
        this.f16848f = bVar;
    }

    public final void run() {
        this.f16846d.m20754v(this.f16847e, this.f16848f);
    }
}

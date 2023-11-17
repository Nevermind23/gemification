package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C5259p;

/* renamed from: com.google.firebase.concurrent.i */
public final /* synthetic */ class C5252i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C5258o f16843d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f16844e;

    /* renamed from: f */
    public final /* synthetic */ C5259p.C5261b f16845f;

    public /* synthetic */ C5252i(C5258o oVar, Runnable runnable, C5259p.C5261b bVar) {
        this.f16843d = oVar;
        this.f16844e = runnable;
        this.f16845f = bVar;
    }

    public final void run() {
        this.f16843d.m20752t(this.f16844e, this.f16845f);
    }
}

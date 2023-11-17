package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C5259p;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.concurrent.l */
public final /* synthetic */ class C5255l implements Callable {

    /* renamed from: d */
    public final /* synthetic */ C5258o f16852d;

    /* renamed from: e */
    public final /* synthetic */ Callable f16853e;

    /* renamed from: f */
    public final /* synthetic */ C5259p.C5261b f16854f;

    public /* synthetic */ C5255l(C5258o oVar, Callable callable, C5259p.C5261b bVar) {
        this.f16852d = oVar;
        this.f16853e = callable;
        this.f16854f = bVar;
    }

    public final Object call() {
        return this.f16852d.m20749q(this.f16853e, this.f16854f);
    }
}

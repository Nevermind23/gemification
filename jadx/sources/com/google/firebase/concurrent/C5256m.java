package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C5259p;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.concurrent.m */
public final /* synthetic */ class C5256m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Callable f16855d;

    /* renamed from: e */
    public final /* synthetic */ C5259p.C5261b f16856e;

    public /* synthetic */ C5256m(Callable callable, C5259p.C5261b bVar) {
        this.f16855d = callable;
        this.f16856e = bVar;
    }

    public final void run() {
        C5258o.m20748p(this.f16855d, this.f16856e);
    }
}

package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C5259p;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.c */
public final /* synthetic */ class C5246c implements C5259p.C5262c {

    /* renamed from: a */
    public final /* synthetic */ C5258o f16821a;

    /* renamed from: b */
    public final /* synthetic */ Callable f16822b;

    /* renamed from: c */
    public final /* synthetic */ long f16823c;

    /* renamed from: d */
    public final /* synthetic */ TimeUnit f16824d;

    public /* synthetic */ C5246c(C5258o oVar, Callable callable, long j, TimeUnit timeUnit) {
        this.f16821a = oVar;
        this.f16822b = callable;
        this.f16823c = j;
        this.f16824d = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo17412a(C5259p.C5261b bVar) {
        return this.f16821a.m20750r(this.f16822b, this.f16823c, this.f16824d, bVar);
    }
}

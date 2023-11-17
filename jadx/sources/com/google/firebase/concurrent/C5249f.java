package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C5259p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.f */
public final /* synthetic */ class C5249f implements C5259p.C5262c {

    /* renamed from: a */
    public final /* synthetic */ C5258o f16829a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f16830b;

    /* renamed from: c */
    public final /* synthetic */ long f16831c;

    /* renamed from: d */
    public final /* synthetic */ TimeUnit f16832d;

    public /* synthetic */ C5249f(C5258o oVar, Runnable runnable, long j, TimeUnit timeUnit) {
        this.f16829a = oVar;
        this.f16830b = runnable;
        this.f16831c = j;
        this.f16832d = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo17412a(C5259p.C5261b bVar) {
        return this.f16829a.m20747o(this.f16830b, this.f16831c, this.f16832d, bVar);
    }
}

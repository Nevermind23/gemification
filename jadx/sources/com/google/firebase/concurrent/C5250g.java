package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C5259p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.g */
public final /* synthetic */ class C5250g implements C5259p.C5262c {

    /* renamed from: a */
    public final /* synthetic */ C5258o f16833a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f16834b;

    /* renamed from: c */
    public final /* synthetic */ long f16835c;

    /* renamed from: d */
    public final /* synthetic */ long f16836d;

    /* renamed from: e */
    public final /* synthetic */ TimeUnit f16837e;

    public /* synthetic */ C5250g(C5258o oVar, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.f16833a = oVar;
        this.f16834b = runnable;
        this.f16835c = j;
        this.f16836d = j2;
        this.f16837e = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo17412a(C5259p.C5261b bVar) {
        return this.f16833a.m20755x(this.f16834b, this.f16835c, this.f16836d, this.f16837e, bVar);
    }
}

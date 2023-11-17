package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C5259p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.h */
public final /* synthetic */ class C5251h implements C5259p.C5262c {

    /* renamed from: a */
    public final /* synthetic */ C5258o f16838a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f16839b;

    /* renamed from: c */
    public final /* synthetic */ long f16840c;

    /* renamed from: d */
    public final /* synthetic */ long f16841d;

    /* renamed from: e */
    public final /* synthetic */ TimeUnit f16842e;

    public /* synthetic */ C5251h(C5258o oVar, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.f16838a = oVar;
        this.f16839b = runnable;
        this.f16840c = j;
        this.f16841d = j2;
        this.f16842e = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo17412a(C5259p.C5261b bVar) {
        return this.f16838a.m20753u(this.f16839b, this.f16840c, this.f16841d, this.f16842e, bVar);
    }
}

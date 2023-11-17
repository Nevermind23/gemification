package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.messaging.x0 */
public final /* synthetic */ class C5368x0 implements Callable {

    /* renamed from: d */
    public final /* synthetic */ Context f17125d;

    /* renamed from: e */
    public final /* synthetic */ ScheduledExecutorService f17126e;

    /* renamed from: f */
    public final /* synthetic */ FirebaseMessaging f17127f;

    /* renamed from: g */
    public final /* synthetic */ C5325f0 f17128g;

    /* renamed from: h */
    public final /* synthetic */ C5306a0 f17129h;

    public /* synthetic */ C5368x0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C5325f0 f0Var, C5306a0 a0Var) {
        this.f17125d = context;
        this.f17126e = scheduledExecutorService;
        this.f17127f = firebaseMessaging;
        this.f17128g = f0Var;
        this.f17129h = a0Var;
    }

    public final Object call() {
        return C5370y0.m21206i(this.f17125d, this.f17126e, this.f17127f, this.f17128g, this.f17129h);
    }
}

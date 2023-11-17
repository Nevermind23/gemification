package com.google.firebase.messaging;

import java.util.concurrent.ScheduledFuture;
import p337z7.C9219c;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.f1 */
public final /* synthetic */ class C5326f1 implements C9219c {

    /* renamed from: a */
    public final /* synthetic */ ScheduledFuture f17047a;

    public /* synthetic */ C5326f1(ScheduledFuture scheduledFuture) {
        this.f17047a = scheduledFuture;
    }

    public final void onComplete(Task task) {
        this.f17047a.cancel(false);
    }
}

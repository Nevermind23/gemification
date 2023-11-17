package com.google.firebase.messaging;

import android.content.Intent;
import p337z7.C9219c;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.h */
public final /* synthetic */ class C5331h implements C9219c {

    /* renamed from: a */
    public final /* synthetic */ C5333i f17060a;

    /* renamed from: b */
    public final /* synthetic */ Intent f17061b;

    public /* synthetic */ C5331h(C5333i iVar, Intent intent) {
        this.f17060a = iVar;
        this.f17061b = intent;
    }

    public final void onComplete(Task task) {
        this.f17060a.m21112d(this.f17061b, task);
    }
}

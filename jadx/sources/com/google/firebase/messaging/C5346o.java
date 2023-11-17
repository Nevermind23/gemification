package com.google.firebase.messaging;

import android.content.Intent;

/* renamed from: com.google.firebase.messaging.o */
public final /* synthetic */ class C5346o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C5348p f17075d;

    /* renamed from: e */
    public final /* synthetic */ Intent f17076e;

    public /* synthetic */ C5346o(C5348p pVar, Intent intent) {
        this.f17075d = pVar;
        this.f17076e = intent;
    }

    public final void run() {
        this.f17075d.m21151b(this.f17076e);
    }
}

package com.google.firebase.messaging;

import android.content.Intent;
import p337z7.C9227g;

/* renamed from: com.google.firebase.messaging.g */
public final /* synthetic */ class C5327g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C5333i f17048d;

    /* renamed from: e */
    public final /* synthetic */ Intent f17049e;

    /* renamed from: f */
    public final /* synthetic */ C9227g f17050f;

    public /* synthetic */ C5327g(C5333i iVar, Intent intent, C9227g gVar) {
        this.f17048d = iVar;
        this.f17049e = intent;
        this.f17050f = gVar;
    }

    public final void run() {
        this.f17048d.m21113e(this.f17049e, this.f17050f);
    }
}

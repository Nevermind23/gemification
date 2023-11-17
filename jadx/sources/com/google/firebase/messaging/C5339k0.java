package com.google.firebase.messaging;

import android.content.Context;
import p337z7.C9227g;

/* renamed from: com.google.firebase.messaging.k0 */
public final /* synthetic */ class C5339k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f17068d;

    /* renamed from: e */
    public final /* synthetic */ boolean f17069e;

    /* renamed from: f */
    public final /* synthetic */ C9227g f17070f;

    public /* synthetic */ C5339k0(Context context, boolean z, C9227g gVar) {
        this.f17068d = context;
        this.f17069e = z;
        this.f17070f = gVar;
    }

    public final void run() {
        C5341l0.m21123d(this.f17068d, this.f17069e, this.f17070f);
    }
}

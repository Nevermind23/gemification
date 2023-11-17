package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.messaging.j */
public final /* synthetic */ class C5336j implements Callable {

    /* renamed from: d */
    public final /* synthetic */ Context f17064d;

    /* renamed from: e */
    public final /* synthetic */ Intent f17065e;

    public /* synthetic */ C5336j(Context context, Intent intent) {
        this.f17064d = context;
        this.f17065e = intent;
    }

    public final Object call() {
        return Integer.valueOf(C5352q0.m21157b().mo17632g(this.f17064d, this.f17065e));
    }
}

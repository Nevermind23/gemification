package com.airbnb.lottie;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.o */
public final /* synthetic */ class C2341o implements Callable {

    /* renamed from: d */
    public final /* synthetic */ WeakReference f7399d;

    /* renamed from: e */
    public final /* synthetic */ Context f7400e;

    /* renamed from: f */
    public final /* synthetic */ int f7401f;

    /* renamed from: g */
    public final /* synthetic */ String f7402g;

    public /* synthetic */ C2341o(WeakReference weakReference, Context context, int i, String str) {
        this.f7399d = weakReference;
        this.f7400e = context;
        this.f7401f = i;
        this.f7402g = str;
    }

    public final Object call() {
        return C2344p.m9061H(this.f7399d, this.f7400e, this.f7401f, this.f7402g);
    }
}

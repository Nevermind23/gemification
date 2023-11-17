package androidx.work.impl;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: androidx.work.impl.p */
public final /* synthetic */ class C2040p implements Callable {

    /* renamed from: d */
    public final /* synthetic */ C2042r f6135d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f6136e;

    /* renamed from: f */
    public final /* synthetic */ String f6137f;

    public /* synthetic */ C2040p(C2042r rVar, ArrayList arrayList, String str) {
        this.f6135d = rVar;
        this.f6136e = arrayList;
        this.f6137f = str;
    }

    public final Object call() {
        return this.f6135d.m7959m(this.f6136e, this.f6137f);
    }
}

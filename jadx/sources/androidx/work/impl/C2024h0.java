package androidx.work.impl;

import java.util.List;
import java.util.Set;
import p190o1.C7399v;

/* renamed from: androidx.work.impl.h0 */
public final /* synthetic */ class C2024h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WorkDatabase f6080d;

    /* renamed from: e */
    public final /* synthetic */ C7399v f6081e;

    /* renamed from: f */
    public final /* synthetic */ C7399v f6082f;

    /* renamed from: g */
    public final /* synthetic */ List f6083g;

    /* renamed from: h */
    public final /* synthetic */ String f6084h;

    /* renamed from: i */
    public final /* synthetic */ Set f6085i;

    /* renamed from: j */
    public final /* synthetic */ boolean f6086j;

    public /* synthetic */ C2024h0(WorkDatabase workDatabase, C7399v vVar, C7399v vVar2, List list, String str, Set set, boolean z) {
        this.f6080d = workDatabase;
        this.f6081e = vVar;
        this.f6082f = vVar2;
        this.f6083g = list;
        this.f6084h = str;
        this.f6085i = set;
        this.f6086j = z;
    }

    public final void run() {
        C2026i0.m7924g(this.f6080d, this.f6081e, this.f6082f, this.f6083g, this.f6084h, this.f6085i, this.f6086j);
    }
}

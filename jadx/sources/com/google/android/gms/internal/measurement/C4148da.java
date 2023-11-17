package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.da */
final class C4148da extends C4182fa {
    /* synthetic */ C4148da(C4131ca caVar) {
        super((C4165ea) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12949a(Object obj, long j) {
        ((C4453v9) C4387rb.m16584k(obj, j)).mo13064q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12950b(Object obj, Object obj2, long j) {
        C4453v9 v9Var = (C4453v9) C4387rb.m16584k(obj, j);
        C4453v9 v9Var2 = (C4453v9) C4387rb.m16584k(obj2, j);
        int size = v9Var.size();
        int size2 = v9Var2.size();
        if (size > 0 && size2 > 0) {
            if (!v9Var.mo13068s()) {
                v9Var = v9Var.mo12866e(size2 + size);
            }
            v9Var.addAll(v9Var2);
        }
        if (size > 0) {
            v9Var2 = v9Var;
        }
        C4387rb.m16597x(obj, j, v9Var2);
    }
}

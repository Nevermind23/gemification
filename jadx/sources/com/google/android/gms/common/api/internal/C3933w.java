package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3847a;
import java.util.ArrayList;
import p156l6.C6962q;

/* renamed from: com.google.android.gms.common.api.internal.w */
final class C3933w extends C3869a0 {

    /* renamed from: e */
    private final ArrayList f12544e;

    /* renamed from: f */
    final /* synthetic */ C3872b0 f12545f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3933w(C3872b0 b0Var, ArrayList arrayList) {
        super(b0Var, (C6962q) null);
        this.f12545f = b0Var;
        this.f12544e = arrayList;
    }

    /* renamed from: a */
    public final void mo12005a() {
        C3872b0 b0Var = this.f12545f;
        b0Var.f12326a.f12468o.f12415p = C3872b0.m14628x(b0Var);
        ArrayList arrayList = this.f12544e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3872b0 b0Var2 = this.f12545f;
            ((C3847a.C3855f) arrayList.get(i)).mo11927n(b0Var2.f12340o, b0Var2.f12326a.f12468o.f12415p);
        }
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.internal.C3892h;
import p337z7.C9227g;

/* renamed from: com.google.android.gms.common.api.internal.y0 */
final class C3938y0 extends C3892h {

    /* renamed from: d */
    final /* synthetic */ C3892h.C3893a f12551d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3938y0(C3892h.C3893a aVar, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.f12551d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12073b(C3847a.C3849b bVar, C9227g gVar) {
        this.f12551d.f12429a.accept(bVar, gVar);
    }
}

package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.C3877d;
import com.google.android.gms.internal.location.C4081i;
import p337z7.C9227g;

/* renamed from: com.google.android.gms.location.e */
final class C4531e extends C4535i {

    /* renamed from: b */
    final /* synthetic */ C3877d f13967b;

    /* renamed from: c */
    final /* synthetic */ C4527a f13968c;

    C4531e(C4527a aVar, C3877d dVar) {
        this.f13968c = aVar;
        this.f13967b = dVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        C4081i iVar = (C4081i) obj;
        C9227g gVar = (C9227g) obj2;
        if (mo13987b()) {
            C4532f fVar = new C4532f(this.f13968c, gVar);
            C3877d.C3878a b = this.f13967b.mo12042b();
            if (b != null) {
                iVar.mo12801A0(b, fVar);
            }
        }
    }
}

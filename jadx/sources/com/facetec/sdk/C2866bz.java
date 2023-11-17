package com.facetec.sdk;

/* renamed from: com.facetec.sdk.bz */
public final class C2866bz extends C3004eg implements C3176gr {

    /* renamed from: a */
    private C3177gs f9409a;

    /* renamed from: b */
    private C3175gq f9410b;

    /* renamed from: e */
    private C2972dv f9411e;

    public C2866bz(C2972dv dvVar, C3175gq gqVar, C3177gs gsVar) {
        this.f9411e = dvVar;
        this.f9410b = gqVar;
        this.f9409a = gsVar;
    }

    /* renamed from: b */
    public final void mo8991b(C3160gb gbVar, Object obj) {
        if (obj == null) {
            gbVar.mo9318f();
        } else {
            this.f9409a.mo9364c(gbVar, obj == C3583t.ID_SCAN_MATCH ? 3 : obj == C3583t.FACE_SCAN ? 10 : obj == C3583t.ID_SCAN_ONLY ? 1 : -1);
        }
    }

    /* renamed from: d */
    public final Object mo8992d(C3143fx fxVar) {
        int a = this.f9410b.mo9362a(fxVar);
        if (a == 0) {
            return C3583t.ID_SCAN_MATCH;
        }
        if (a == 3) {
            return C3583t.FACE_SCAN;
        }
        if (a != 8) {
            return null;
        }
        return C3583t.ID_SCAN_ONLY;
    }
}

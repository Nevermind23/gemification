package com.facetec.sdk;

/* renamed from: com.facetec.sdk.gu */
public final class C3178gu implements C3013eo {

    /* renamed from: a */
    private static final C3172gn f10470a = new C3172gn();

    /* renamed from: e */
    private static final C3173go f10471e = new C3173go();

    /* renamed from: c */
    public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
        if (fwVar.mo9331a() == C3471o.class) {
            return new C2878ca(dvVar, f10470a, f10471e);
        }
        if (C3583t.class.isAssignableFrom(fwVar.mo9331a())) {
            return new C2866bz(dvVar, f10470a, f10471e);
        }
        return null;
    }
}

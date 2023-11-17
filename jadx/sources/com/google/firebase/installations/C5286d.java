package com.google.firebase.installations;

import p011aa.C0095d;
import p337z7.C9227g;

/* renamed from: com.google.firebase.installations.d */
class C5286d implements C5290g {

    /* renamed from: a */
    private final C5291h f16923a;

    /* renamed from: b */
    private final C9227g f16924b;

    public C5286d(C5291h hVar, C9227g gVar) {
        this.f16923a = hVar;
        this.f16924b = gVar;
    }

    /* renamed from: a */
    public boolean mo17510a(Exception exc) {
        this.f16924b.mo24886d(exc);
        return true;
    }

    /* renamed from: b */
    public boolean mo17511b(C0095d dVar) {
        if (!dVar.mo155k() || this.f16923a.mo17515f(dVar)) {
            return false;
        }
        this.f16924b.mo24885c(C5288f.m20883a().mo17500b(dVar.mo130b()).mo17502d(dVar.mo131c()).mo17501c(dVar.mo137h()).mo17499a());
        return true;
    }
}

package com.facetec.sdk;

/* renamed from: com.facetec.sdk.mt */
public abstract class C3438mt implements C3465nf {

    /* renamed from: e */
    private final C3465nf f11270e;

    public C3438mt(C3465nf nfVar) {
        if (nfVar != null) {
            this.f11270e = nfVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: c */
    public long mo9643c(C3431mm mmVar, long j) {
        return this.f11270e.mo9643c(mmVar, j);
    }

    public void close() {
        this.f11270e.close();
    }

    /* renamed from: e */
    public final C3465nf mo9920e() {
        return this.f11270e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.f11270e.toString());
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: c */
    public final C3463ne mo9644c() {
        return this.f11270e.mo9644c();
    }
}

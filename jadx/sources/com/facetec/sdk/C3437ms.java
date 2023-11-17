package com.facetec.sdk;

/* renamed from: com.facetec.sdk.ms */
public abstract class C3437ms implements C3461nc {

    /* renamed from: d */
    private final C3461nc f11269d;

    public C3437ms(C3461nc ncVar) {
        if (ncVar != null) {
            this.f11269d = ncVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: b */
    public void mo9671b(C3431mm mmVar, long j) {
        this.f11269d.mo9671b(mmVar, j);
    }

    /* renamed from: c */
    public final C3463ne mo9707c() {
        return this.f11269d.mo9707c();
    }

    public void close() {
        this.f11269d.close();
    }

    public void flush() {
        this.f11269d.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.f11269d.toString());
        sb.append(")");
        return sb.toString();
    }
}

package xy0;

import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.t */
public final class C39956t {

    /* renamed from: a */
    private final C39952p f94897a;

    /* renamed from: b */
    private final int f94898b;

    public C39956t(C39952p pVar, int i) {
        C41536l.m120489i(pVar, "loan");
        this.f94897a = pVar;
        this.f94898b = i;
    }

    /* renamed from: a */
    public final int mo93775a() {
        return this.f94898b;
    }

    /* renamed from: b */
    public final C39952p mo93776b() {
        return this.f94897a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39956t)) {
            return false;
        }
        C39956t tVar = (C39956t) obj;
        return C41536l.m120484d(this.f94897a, tVar.f94897a) && this.f94898b == tVar.f94898b;
    }

    public int hashCode() {
        return (this.f94897a.hashCode() * 31) + this.f94898b;
    }

    public String toString() {
        C39952p pVar = this.f94897a;
        int i = this.f94898b;
        return "LoanItem(loan=" + pVar + ", index=" + i + ")";
    }
}

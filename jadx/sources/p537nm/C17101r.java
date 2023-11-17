package p537nm;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nm.r */
public final class C17101r {

    /* renamed from: a */
    private final String f47882a;

    /* renamed from: b */
    private final long f47883b;

    public C17101r(String str, long j) {
        C41536l.m120489i(str, "ccy");
        this.f47882a = str;
        this.f47883b = j;
    }

    /* renamed from: a */
    public final String mo44474a() {
        return this.f47882a;
    }

    /* renamed from: b */
    public final long mo44475b() {
        return this.f47883b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17101r)) {
            return false;
        }
        C17101r rVar = (C17101r) obj;
        return C41536l.m120484d(this.f47882a, rVar.f47882a) && this.f47883b == rVar.f47883b;
    }

    public int hashCode() {
        return (this.f47882a.hashCode() * 31) + C7397t.m28148a(this.f47883b);
    }

    public String toString() {
        String str = this.f47882a;
        long j = this.f47883b;
        return "DebitCardCurrency(ccy=" + str + ", linkId=" + j + ")";
    }
}

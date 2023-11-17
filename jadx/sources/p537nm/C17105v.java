package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.v */
public final class C17105v {

    /* renamed from: a */
    private final C17103t f47896a;

    /* renamed from: b */
    private final C17103t f47897b;

    /* renamed from: c */
    private final Long f47898c;

    public C17105v(C17103t tVar, C17103t tVar2, Long l) {
        this.f47896a = tVar;
        this.f47897b = tVar2;
        this.f47898c = l;
    }

    /* renamed from: a */
    public final C17103t mo44496a() {
        return this.f47897b;
    }

    /* renamed from: b */
    public final C17103t mo44497b() {
        return this.f47896a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17105v)) {
            return false;
        }
        C17105v vVar = (C17105v) obj;
        return C41536l.m120484d(this.f47896a, vVar.f47896a) && C41536l.m120484d(this.f47897b, vVar.f47897b) && C41536l.m120484d(this.f47898c, vVar.f47898c);
    }

    public int hashCode() {
        C17103t tVar = this.f47896a;
        int i = 0;
        int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        C17103t tVar2 = this.f47897b;
        int hashCode2 = (hashCode + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        Long l = this.f47898c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        C17103t tVar = this.f47896a;
        C17103t tVar2 = this.f47897b;
        Long l = this.f47898c;
        return "DebitCardOrderListFees(plasticCardFee=" + tVar + ", digitalCardFee=" + tVar2 + ", orgId=" + l + ")";
    }
}

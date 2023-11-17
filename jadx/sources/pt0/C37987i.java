package pt0;

import p190o1.C7397t;

/* renamed from: pt0.i */
final class C37987i {

    /* renamed from: a */
    private final long f91290a;

    /* renamed from: b */
    private final int f91291b;

    public C37987i(long j, int i) {
        this.f91290a = j;
        this.f91291b = i;
    }

    /* renamed from: a */
    public final long mo91363a() {
        return this.f91290a;
    }

    /* renamed from: b */
    public final int mo91364b() {
        return this.f91291b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37987i)) {
            return false;
        }
        C37987i iVar = (C37987i) obj;
        return this.f91290a == iVar.f91290a && this.f91291b == iVar.f91291b;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.f91290a) * 31) + this.f91291b;
    }

    public String toString() {
        long j = this.f91290a;
        int i = this.f91291b;
        return "PiggyBankSubjectData(casServiceId=" + j + ", requestCode=" + i + ")";
    }
}

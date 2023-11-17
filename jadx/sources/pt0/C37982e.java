package pt0;

import kotlin.jvm.internal.C41536l;

/* renamed from: pt0.e */
final class C37982e {

    /* renamed from: a */
    private final Long f91289a;

    public C37982e(Long l) {
        this.f91289a = l;
    }

    /* renamed from: a */
    public final Long mo91339a() {
        return this.f91289a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37982e) && C41536l.m120484d(this.f91289a, ((C37982e) obj).f91289a);
    }

    public int hashCode() {
        Long l = this.f91289a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        Long l = this.f91289a;
        return "ClosePiggyBankAcctWrapper(acctKey=" + l + ")";
    }
}

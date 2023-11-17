package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.z */
public final class C17109z {

    /* renamed from: a */
    private final Long f47910a;

    /* renamed from: b */
    private final Long f47911b;

    public C17109z(Long l, Long l2) {
        this.f47910a = l;
        this.f47911b = l2;
    }

    /* renamed from: a */
    public final Long mo44521a() {
        return this.f47910a;
    }

    /* renamed from: b */
    public final Long mo44522b() {
        return this.f47911b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17109z)) {
            return false;
        }
        C17109z zVar = (C17109z) obj;
        return C41536l.m120484d(this.f47910a, zVar.f47910a) && C41536l.m120484d(this.f47911b, zVar.f47911b);
    }

    public int hashCode() {
        Long l = this.f47910a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f47911b;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Long l = this.f47910a;
        Long l2 = this.f47911b;
        return "DebitCardRegisterResult(cardId=" + l + ", registerCardResultCode=" + l2 + ")";
    }
}

package o70;

import p190o1.C7397t;

/* renamed from: o70.a */
public final class C26762a {

    /* renamed from: a */
    private final long f67424a;

    /* renamed from: b */
    private final boolean f67425b;

    public C26762a(long j, boolean z) {
        this.f67424a = j;
        this.f67425b = z;
    }

    /* renamed from: a */
    public final long mo65979a() {
        return this.f67424a;
    }

    /* renamed from: b */
    public final boolean mo65980b() {
        return this.f67425b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26762a)) {
            return false;
        }
        C26762a aVar = (C26762a) obj;
        return this.f67424a == aVar.f67424a && this.f67425b == aVar.f67425b;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f67424a) * 31;
        boolean z = this.f67425b;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public String toString() {
        long j = this.f67424a;
        boolean z = this.f67425b;
        return "CardBlockStatusModel(cardId=" + j + ", isCardBlocked=" + z + ")";
    }
}

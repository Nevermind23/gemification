package p565pm;

import p190o1.C7397t;

/* renamed from: pm.b */
public final class C17387b {

    /* renamed from: a */
    private final long f48781a;

    public C17387b(long j) {
        this.f48781a = j;
    }

    /* renamed from: a */
    public final long mo44899a() {
        return this.f48781a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17387b) && this.f48781a == ((C17387b) obj).f48781a;
    }

    public int hashCode() {
        return C7397t.m28148a(this.f48781a);
    }

    public String toString() {
        long j = this.f48781a;
        return "InstantCardActivationResult(cardId=" + j + ")";
    }
}

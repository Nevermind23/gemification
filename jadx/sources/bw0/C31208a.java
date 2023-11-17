package bw0;

/* renamed from: bw0.a */
public final class C31208a {

    /* renamed from: a */
    private final int f77550a;

    public C31208a(int i) {
        this.f77550a = i;
    }

    /* renamed from: a */
    public final int mo71428a() {
        return this.f77550a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31208a) && this.f77550a == ((C31208a) obj).f77550a;
    }

    public int hashCode() {
        return this.f77550a;
    }

    public String toString() {
        int i = this.f77550a;
        return "AmountLimit(p2pOneTimeLimit=" + i + ")";
    }
}

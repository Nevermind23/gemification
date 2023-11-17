package p155l5;

import java.util.List;

/* renamed from: l5.d */
final class C6901d extends C6915j {

    /* renamed from: a */
    private final List f20706a;

    C6901d(List list) {
        if (list != null) {
            this.f20706a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    /* renamed from: c */
    public List mo21012c() {
        return this.f20706a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6915j) {
            return this.f20706a.equals(((C6915j) obj).mo21012c());
        }
        return false;
    }

    public int hashCode() {
        return this.f20706a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f20706a + "}";
    }
}

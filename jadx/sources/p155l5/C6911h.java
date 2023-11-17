package p155l5;

/* renamed from: l5.h */
final class C6911h extends C6923n {

    /* renamed from: a */
    private final long f20739a;

    C6911h(long j) {
        this.f20739a = j;
    }

    /* renamed from: c */
    public long mo21060c() {
        return this.f20739a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6923n)) {
            return false;
        }
        if (this.f20739a == ((C6923n) obj).mo21060c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f20739a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f20739a + "}";
    }
}

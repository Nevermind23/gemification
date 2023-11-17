package com.google.firebase;

/* renamed from: com.google.firebase.a */
final class C5233a extends C5298l {

    /* renamed from: a */
    private final long f16781a;

    /* renamed from: b */
    private final long f16782b;

    /* renamed from: c */
    private final long f16783c;

    C5233a(long j, long j2, long j3) {
        this.f16781a = j;
        this.f16782b = j2;
        this.f16783c = j3;
    }

    /* renamed from: b */
    public long mo17395b() {
        return this.f16782b;
    }

    /* renamed from: c */
    public long mo17396c() {
        return this.f16781a;
    }

    /* renamed from: d */
    public long mo17397d() {
        return this.f16783c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5298l)) {
            return false;
        }
        C5298l lVar = (C5298l) obj;
        if (this.f16781a == lVar.mo17396c() && this.f16782b == lVar.mo17395b() && this.f16783c == lVar.mo17397d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f16781a;
        long j2 = this.f16782b;
        long j3 = this.f16783c;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f16781a + ", elapsedRealtime=" + this.f16782b + ", uptimeMillis=" + this.f16783c + "}";
    }
}

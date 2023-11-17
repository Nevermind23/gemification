package p181n5;

import p181n5.C7236g;

/* renamed from: n5.b */
final class C7230b extends C7236g {

    /* renamed from: a */
    private final C7236g.C7237a f21409a;

    /* renamed from: b */
    private final long f21410b;

    C7230b(C7236g.C7237a aVar, long j) {
        if (aVar != null) {
            this.f21409a = aVar;
            this.f21410b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: b */
    public long mo21598b() {
        return this.f21410b;
    }

    /* renamed from: c */
    public C7236g.C7237a mo21599c() {
        return this.f21409a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7236g)) {
            return false;
        }
        C7236g gVar = (C7236g) obj;
        if (!this.f21409a.equals(gVar.mo21599c()) || this.f21410b != gVar.mo21598b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f21410b;
        return ((this.f21409a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f21409a + ", nextRequestWaitMillis=" + this.f21410b + "}";
    }
}

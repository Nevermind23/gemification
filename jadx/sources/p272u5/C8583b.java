package p272u5;

import p168m5.C7118i;
import p168m5.C7129p;

/* renamed from: u5.b */
final class C8583b extends C8605k {

    /* renamed from: a */
    private final long f24336a;

    /* renamed from: b */
    private final C7129p f24337b;

    /* renamed from: c */
    private final C7118i f24338c;

    C8583b(long j, C7129p pVar, C7118i iVar) {
        this.f24336a = j;
        if (pVar != null) {
            this.f24337b = pVar;
            if (iVar != null) {
                this.f24338c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    /* renamed from: b */
    public C7118i mo23936b() {
        return this.f24338c;
    }

    /* renamed from: c */
    public long mo23937c() {
        return this.f24336a;
    }

    /* renamed from: d */
    public C7129p mo23938d() {
        return this.f24337b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8605k)) {
            return false;
        }
        C8605k kVar = (C8605k) obj;
        if (this.f24336a != kVar.mo23937c() || !this.f24337b.equals(kVar.mo23938d()) || !this.f24338c.equals(kVar.mo23936b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f24336a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f24337b.hashCode()) * 1000003) ^ this.f24338c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f24336a + ", transportContext=" + this.f24337b + ", event=" + this.f24338c + "}";
    }
}

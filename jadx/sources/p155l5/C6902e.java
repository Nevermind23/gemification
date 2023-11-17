package p155l5;

import p155l5.C6916k;

/* renamed from: l5.e */
final class C6902e extends C6916k {

    /* renamed from: a */
    private final C6916k.C6918b f20707a;

    /* renamed from: b */
    private final C6889a f20708b;

    /* renamed from: l5.e$b */
    static final class C6904b extends C6916k.C6917a {

        /* renamed from: a */
        private C6916k.C6918b f20709a;

        /* renamed from: b */
        private C6889a f20710b;

        C6904b() {
        }

        /* renamed from: a */
        public C6916k mo21021a() {
            return new C6902e(this.f20709a, this.f20710b);
        }

        /* renamed from: b */
        public C6916k.C6917a mo21022b(C6889a aVar) {
            this.f20710b = aVar;
            return this;
        }

        /* renamed from: c */
        public C6916k.C6917a mo21023c(C6916k.C6918b bVar) {
            this.f20709a = bVar;
            return this;
        }
    }

    /* renamed from: b */
    public C6889a mo21016b() {
        return this.f20708b;
    }

    /* renamed from: c */
    public C6916k.C6918b mo21017c() {
        return this.f20707a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6916k)) {
            return false;
        }
        C6916k kVar = (C6916k) obj;
        C6916k.C6918b bVar = this.f20707a;
        if (bVar != null ? bVar.equals(kVar.mo21017c()) : kVar.mo21017c() == null) {
            C6889a aVar = this.f20708b;
            if (aVar == null) {
                if (kVar.mo21016b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.mo21016b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        C6916k.C6918b bVar = this.f20707a;
        int i2 = 0;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        C6889a aVar = this.f20708b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f20707a + ", androidClientInfo=" + this.f20708b + "}";
    }

    private C6902e(C6916k.C6918b bVar, C6889a aVar) {
        this.f20707a = bVar;
        this.f20708b = aVar;
    }
}

package p272u5;

import p272u5.C8589e;

/* renamed from: u5.a */
final class C8579a extends C8589e {

    /* renamed from: b */
    private final long f24326b;

    /* renamed from: c */
    private final int f24327c;

    /* renamed from: d */
    private final int f24328d;

    /* renamed from: e */
    private final long f24329e;

    /* renamed from: f */
    private final int f24330f;

    /* renamed from: u5.a$b */
    static final class C8581b extends C8589e.C8590a {

        /* renamed from: a */
        private Long f24331a;

        /* renamed from: b */
        private Integer f24332b;

        /* renamed from: c */
        private Integer f24333c;

        /* renamed from: d */
        private Long f24334d;

        /* renamed from: e */
        private Integer f24335e;

        C8581b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C8589e mo23929a() {
            String str = "";
            if (this.f24331a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f24332b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f24333c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f24334d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f24335e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C8579a(this.f24331a.longValue(), this.f24332b.intValue(), this.f24333c.intValue(), this.f24334d.longValue(), this.f24335e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C8589e.C8590a mo23930b(int i) {
            this.f24333c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C8589e.C8590a mo23931c(long j) {
            this.f24334d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C8589e.C8590a mo23932d(int i) {
            this.f24332b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C8589e.C8590a mo23933e(int i) {
            this.f24335e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C8589e.C8590a mo23934f(long j) {
            this.f24331a = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo23921b() {
        return this.f24328d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo23922c() {
        return this.f24329e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo23923d() {
        return this.f24327c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo23924e() {
        return this.f24330f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8589e)) {
            return false;
        }
        C8589e eVar = (C8589e) obj;
        if (this.f24326b == eVar.mo23926f() && this.f24327c == eVar.mo23923d() && this.f24328d == eVar.mo23921b() && this.f24329e == eVar.mo23922c() && this.f24330f == eVar.mo23924e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo23926f() {
        return this.f24326b;
    }

    public int hashCode() {
        long j = this.f24326b;
        long j2 = this.f24329e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f24327c) * 1000003) ^ this.f24328d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f24330f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f24326b + ", loadBatchSize=" + this.f24327c + ", criticalSectionEnterTimeoutMs=" + this.f24328d + ", eventCleanUpAge=" + this.f24329e + ", maxBlobByteSizePerRow=" + this.f24330f + "}";
    }

    private C8579a(long j, int i, int i2, long j2, int i3) {
        this.f24326b = j;
        this.f24327c = i;
        this.f24328d = i2;
        this.f24329e = j2;
        this.f24330f = i3;
    }
}

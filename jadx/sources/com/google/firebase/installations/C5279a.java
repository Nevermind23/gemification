package com.google.firebase.installations;

import com.google.firebase.installations.C5288f;

/* renamed from: com.google.firebase.installations.a */
final class C5279a extends C5288f {

    /* renamed from: a */
    private final String f16898a;

    /* renamed from: b */
    private final long f16899b;

    /* renamed from: c */
    private final long f16900c;

    /* renamed from: com.google.firebase.installations.a$b */
    static final class C5281b extends C5288f.C5289a {

        /* renamed from: a */
        private String f16901a;

        /* renamed from: b */
        private Long f16902b;

        /* renamed from: c */
        private Long f16903c;

        C5281b() {
        }

        /* renamed from: a */
        public C5288f mo17499a() {
            String str = "";
            if (this.f16901a == null) {
                str = str + " token";
            }
            if (this.f16902b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f16903c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C5279a(this.f16901a, this.f16902b.longValue(), this.f16903c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C5288f.C5289a mo17500b(String str) {
            if (str != null) {
                this.f16901a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        /* renamed from: c */
        public C5288f.C5289a mo17501c(long j) {
            this.f16903c = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C5288f.C5289a mo17502d(long j) {
            this.f16902b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public String mo17493b() {
        return this.f16898a;
    }

    /* renamed from: c */
    public long mo17494c() {
        return this.f16900c;
    }

    /* renamed from: d */
    public long mo17495d() {
        return this.f16899b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5288f)) {
            return false;
        }
        C5288f fVar = (C5288f) obj;
        if (this.f16898a.equals(fVar.mo17493b()) && this.f16899b == fVar.mo17495d() && this.f16900c == fVar.mo17494c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f16899b;
        long j2 = this.f16900c;
        return ((((this.f16898a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f16898a + ", tokenExpirationTimestamp=" + this.f16899b + ", tokenCreationTimestamp=" + this.f16900c + "}";
    }

    private C5279a(String str, long j, long j2) {
        this.f16898a = str;
        this.f16899b = j;
        this.f16900c = j2;
    }
}

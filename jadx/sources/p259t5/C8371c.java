package p259t5;

import java.util.Set;
import p259t5.C8376f;

/* renamed from: t5.c */
final class C8371c extends C8376f.C8378b {

    /* renamed from: a */
    private final long f23780a;

    /* renamed from: b */
    private final long f23781b;

    /* renamed from: c */
    private final Set f23782c;

    /* renamed from: t5.c$b */
    static final class C8373b extends C8376f.C8378b.C8379a {

        /* renamed from: a */
        private Long f23783a;

        /* renamed from: b */
        private Long f23784b;

        /* renamed from: c */
        private Set f23785c;

        C8373b() {
        }

        /* renamed from: a */
        public C8376f.C8378b mo23572a() {
            String str = "";
            if (this.f23783a == null) {
                str = str + " delta";
            }
            if (this.f23784b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f23785c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C8371c(this.f23783a.longValue(), this.f23784b.longValue(), this.f23785c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C8376f.C8378b.C8379a mo23573b(long j) {
            this.f23783a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C8376f.C8378b.C8379a mo23574c(Set set) {
            if (set != null) {
                this.f23785c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        /* renamed from: d */
        public C8376f.C8378b.C8379a mo23575d(long j) {
            this.f23784b = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo23566b() {
        return this.f23780a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set mo23567c() {
        return this.f23782c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo23568d() {
        return this.f23781b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8376f.C8378b)) {
            return false;
        }
        C8376f.C8378b bVar = (C8376f.C8378b) obj;
        if (this.f23780a == bVar.mo23566b() && this.f23781b == bVar.mo23568d() && this.f23782c.equals(bVar.mo23567c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f23780a;
        long j2 = this.f23781b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f23782c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f23780a + ", maxAllowedDelay=" + this.f23781b + ", flags=" + this.f23782c + "}";
    }

    private C8371c(long j, long j2, Set set) {
        this.f23780a = j;
        this.f23781b = j2;
        this.f23782c = set;
    }
}

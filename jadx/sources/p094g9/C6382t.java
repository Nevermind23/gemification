package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.t */
final class C6382t extends C6285b0.C6297e.C6304d.C6320c {

    /* renamed from: a */
    private final Double f19592a;

    /* renamed from: b */
    private final int f19593b;

    /* renamed from: c */
    private final boolean f19594c;

    /* renamed from: d */
    private final int f19595d;

    /* renamed from: e */
    private final long f19596e;

    /* renamed from: f */
    private final long f19597f;

    /* renamed from: g9.t$b */
    static final class C6384b extends C6285b0.C6297e.C6304d.C6320c.C6321a {

        /* renamed from: a */
        private Double f19598a;

        /* renamed from: b */
        private Integer f19599b;

        /* renamed from: c */
        private Boolean f19600c;

        /* renamed from: d */
        private Integer f19601d;

        /* renamed from: e */
        private Long f19602e;

        /* renamed from: f */
        private Long f19603f;

        C6384b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6304d.C6320c mo20149a() {
            String str = "";
            if (this.f19599b == null) {
                str = str + " batteryVelocity";
            }
            if (this.f19600c == null) {
                str = str + " proximityOn";
            }
            if (this.f19601d == null) {
                str = str + " orientation";
            }
            if (this.f19602e == null) {
                str = str + " ramUsed";
            }
            if (this.f19603f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C6382t(this.f19598a, this.f19599b.intValue(), this.f19600c.booleanValue(), this.f19601d.intValue(), this.f19602e.longValue(), this.f19603f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6304d.C6320c.C6321a mo20150b(Double d) {
            this.f19598a = d;
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6304d.C6320c.C6321a mo20151c(int i) {
            this.f19599b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6304d.C6320c.C6321a mo20152d(long j) {
            this.f19603f = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6304d.C6320c.C6321a mo20153e(int i) {
            this.f19601d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public C6285b0.C6297e.C6304d.C6320c.C6321a mo20154f(boolean z) {
            this.f19600c = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: g */
        public C6285b0.C6297e.C6304d.C6320c.C6321a mo20155g(long j) {
            this.f19602e = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public Double mo20143b() {
        return this.f19592a;
    }

    /* renamed from: c */
    public int mo20144c() {
        return this.f19593b;
    }

    /* renamed from: d */
    public long mo20145d() {
        return this.f19597f;
    }

    /* renamed from: e */
    public int mo20146e() {
        return this.f19595d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6304d.C6320c)) {
            return false;
        }
        C6285b0.C6297e.C6304d.C6320c cVar = (C6285b0.C6297e.C6304d.C6320c) obj;
        Double d = this.f19592a;
        if (d != null ? d.equals(cVar.mo20143b()) : cVar.mo20143b() == null) {
            if (this.f19593b == cVar.mo20144c() && this.f19594c == cVar.mo20148g() && this.f19595d == cVar.mo20146e() && this.f19596e == cVar.mo20147f() && this.f19597f == cVar.mo20145d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo20147f() {
        return this.f19596e;
    }

    /* renamed from: g */
    public boolean mo20148g() {
        return this.f19594c;
    }

    public int hashCode() {
        int i;
        int i2;
        Double d = this.f19592a;
        if (d == null) {
            i = 0;
        } else {
            i = d.hashCode();
        }
        int i3 = (((i ^ 1000003) * 1000003) ^ this.f19593b) * 1000003;
        if (this.f19594c) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        long j = this.f19596e;
        long j2 = this.f19597f;
        return ((((((i3 ^ i2) * 1000003) ^ this.f19595d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f19592a + ", batteryVelocity=" + this.f19593b + ", proximityOn=" + this.f19594c + ", orientation=" + this.f19595d + ", ramUsed=" + this.f19596e + ", diskUsed=" + this.f19597f + "}";
    }

    private C6382t(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f19592a = d;
        this.f19593b = i;
        this.f19594c = z;
        this.f19595d = i2;
        this.f19596e = j;
        this.f19597f = j2;
    }
}

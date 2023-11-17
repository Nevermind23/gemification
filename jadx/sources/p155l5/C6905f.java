package p155l5;

import java.util.Arrays;
import p155l5.C6919l;

/* renamed from: l5.f */
final class C6905f extends C6919l {

    /* renamed from: a */
    private final long f20711a;

    /* renamed from: b */
    private final Integer f20712b;

    /* renamed from: c */
    private final long f20713c;

    /* renamed from: d */
    private final byte[] f20714d;

    /* renamed from: e */
    private final String f20715e;

    /* renamed from: f */
    private final long f20716f;

    /* renamed from: g */
    private final C6924o f20717g;

    /* renamed from: l5.f$b */
    static final class C6907b extends C6919l.C6920a {

        /* renamed from: a */
        private Long f20718a;

        /* renamed from: b */
        private Integer f20719b;

        /* renamed from: c */
        private Long f20720c;

        /* renamed from: d */
        private byte[] f20721d;

        /* renamed from: e */
        private String f20722e;

        /* renamed from: f */
        private Long f20723f;

        /* renamed from: g */
        private C6924o f20724g;

        C6907b() {
        }

        /* renamed from: a */
        public C6919l mo21034a() {
            String str = "";
            if (this.f20718a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f20720c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f20723f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C6905f(this.f20718a.longValue(), this.f20719b, this.f20720c.longValue(), this.f20721d, this.f20722e, this.f20723f.longValue(), this.f20724g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6919l.C6920a mo21035b(Integer num) {
            this.f20719b = num;
            return this;
        }

        /* renamed from: c */
        public C6919l.C6920a mo21036c(long j) {
            this.f20718a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C6919l.C6920a mo21037d(long j) {
            this.f20720c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C6919l.C6920a mo21038e(C6924o oVar) {
            this.f20724g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C6919l.C6920a mo21039f(byte[] bArr) {
            this.f20721d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C6919l.C6920a mo21040g(String str) {
            this.f20722e = str;
            return this;
        }

        /* renamed from: h */
        public C6919l.C6920a mo21041h(long j) {
            this.f20723f = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public Integer mo21024b() {
        return this.f20712b;
    }

    /* renamed from: c */
    public long mo21025c() {
        return this.f20711a;
    }

    /* renamed from: d */
    public long mo21026d() {
        return this.f20713c;
    }

    /* renamed from: e */
    public C6924o mo21027e() {
        return this.f20717g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6919l)) {
            return false;
        }
        C6919l lVar = (C6919l) obj;
        if (this.f20711a == lVar.mo21025c() && ((num = this.f20712b) != null ? num.equals(lVar.mo21024b()) : lVar.mo21024b() == null) && this.f20713c == lVar.mo21026d()) {
            byte[] bArr2 = this.f20714d;
            if (lVar instanceof C6905f) {
                bArr = ((C6905f) lVar).f20714d;
            } else {
                bArr = lVar.mo21029f();
            }
            if (Arrays.equals(bArr2, bArr) && ((str = this.f20715e) != null ? str.equals(lVar.mo21030g()) : lVar.mo21030g() == null) && this.f20716f == lVar.mo21031h()) {
                C6924o oVar = this.f20717g;
                if (oVar == null) {
                    if (lVar.mo21027e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.mo21027e())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte[] mo21029f() {
        return this.f20714d;
    }

    /* renamed from: g */
    public String mo21030g() {
        return this.f20715e;
    }

    /* renamed from: h */
    public long mo21031h() {
        return this.f20716f;
    }

    public int hashCode() {
        int i;
        int i2;
        long j = this.f20711a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f20712b;
        int i4 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j2 = this.f20713c;
        int hashCode = (((((i3 ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f20714d)) * 1000003;
        String str = this.f20715e;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        long j3 = this.f20716f;
        int i5 = (((hashCode ^ i2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C6924o oVar = this.f20717g;
        if (oVar != null) {
            i4 = oVar.hashCode();
        }
        return i5 ^ i4;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f20711a + ", eventCode=" + this.f20712b + ", eventUptimeMs=" + this.f20713c + ", sourceExtension=" + Arrays.toString(this.f20714d) + ", sourceExtensionJsonProto3=" + this.f20715e + ", timezoneOffsetSeconds=" + this.f20716f + ", networkConnectionInfo=" + this.f20717g + "}";
    }

    private C6905f(long j, Integer num, long j2, byte[] bArr, String str, long j3, C6924o oVar) {
        this.f20711a = j;
        this.f20712b = num;
        this.f20713c = j2;
        this.f20714d = bArr;
        this.f20715e = str;
        this.f20716f = j3;
        this.f20717g = oVar;
    }
}

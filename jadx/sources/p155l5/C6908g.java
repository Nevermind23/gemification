package p155l5;

import java.util.List;
import p155l5.C6921m;

/* renamed from: l5.g */
final class C6908g extends C6921m {

    /* renamed from: a */
    private final long f20725a;

    /* renamed from: b */
    private final long f20726b;

    /* renamed from: c */
    private final C6916k f20727c;

    /* renamed from: d */
    private final Integer f20728d;

    /* renamed from: e */
    private final String f20729e;

    /* renamed from: f */
    private final List f20730f;

    /* renamed from: g */
    private final C6928p f20731g;

    /* renamed from: l5.g$b */
    static final class C6910b extends C6921m.C6922a {

        /* renamed from: a */
        private Long f20732a;

        /* renamed from: b */
        private Long f20733b;

        /* renamed from: c */
        private C6916k f20734c;

        /* renamed from: d */
        private Integer f20735d;

        /* renamed from: e */
        private String f20736e;

        /* renamed from: f */
        private List f20737f;

        /* renamed from: g */
        private C6928p f20738g;

        C6910b() {
        }

        /* renamed from: a */
        public C6921m mo21052a() {
            String str = "";
            if (this.f20732a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f20733b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C6908g(this.f20732a.longValue(), this.f20733b.longValue(), this.f20734c, this.f20735d, this.f20736e, this.f20737f, this.f20738g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6921m.C6922a mo21053b(C6916k kVar) {
            this.f20734c = kVar;
            return this;
        }

        /* renamed from: c */
        public C6921m.C6922a mo21054c(List list) {
            this.f20737f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C6921m.C6922a mo21055d(Integer num) {
            this.f20735d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C6921m.C6922a mo21056e(String str) {
            this.f20736e = str;
            return this;
        }

        /* renamed from: f */
        public C6921m.C6922a mo21057f(C6928p pVar) {
            this.f20738g = pVar;
            return this;
        }

        /* renamed from: g */
        public C6921m.C6922a mo21058g(long j) {
            this.f20732a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C6921m.C6922a mo21059h(long j) {
            this.f20733b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public C6916k mo21042b() {
        return this.f20727c;
    }

    /* renamed from: c */
    public List mo21043c() {
        return this.f20730f;
    }

    /* renamed from: d */
    public Integer mo21044d() {
        return this.f20728d;
    }

    /* renamed from: e */
    public String mo21045e() {
        return this.f20729e;
    }

    public boolean equals(Object obj) {
        C6916k kVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6921m)) {
            return false;
        }
        C6921m mVar = (C6921m) obj;
        if (this.f20725a == mVar.mo21048g() && this.f20726b == mVar.mo21049h() && ((kVar = this.f20727c) != null ? kVar.equals(mVar.mo21042b()) : mVar.mo21042b() == null) && ((num = this.f20728d) != null ? num.equals(mVar.mo21044d()) : mVar.mo21044d() == null) && ((str = this.f20729e) != null ? str.equals(mVar.mo21045e()) : mVar.mo21045e() == null) && ((list = this.f20730f) != null ? list.equals(mVar.mo21043c()) : mVar.mo21043c() == null)) {
            C6928p pVar = this.f20731g;
            if (pVar == null) {
                if (mVar.mo21047f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.mo21047f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public C6928p mo21047f() {
        return this.f20731g;
    }

    /* renamed from: g */
    public long mo21048g() {
        return this.f20725a;
    }

    /* renamed from: h */
    public long mo21049h() {
        return this.f20726b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        long j = this.f20725a;
        long j2 = this.f20726b;
        int i5 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C6916k kVar = this.f20727c;
        int i6 = 0;
        if (kVar == null) {
            i = 0;
        } else {
            i = kVar.hashCode();
        }
        int i7 = (i5 ^ i) * 1000003;
        Integer num = this.f20728d;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        String str = this.f20729e;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        List list = this.f20730f;
        if (list == null) {
            i4 = 0;
        } else {
            i4 = list.hashCode();
        }
        int i12 = (i9 ^ i4) * 1000003;
        C6928p pVar = this.f20731g;
        if (pVar != null) {
            i6 = pVar.hashCode();
        }
        return i12 ^ i6;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f20725a + ", requestUptimeMs=" + this.f20726b + ", clientInfo=" + this.f20727c + ", logSource=" + this.f20728d + ", logSourceName=" + this.f20729e + ", logEvents=" + this.f20730f + ", qosTier=" + this.f20731g + "}";
    }

    private C6908g(long j, long j2, C6916k kVar, Integer num, String str, List list, C6928p pVar) {
        this.f20725a = j;
        this.f20726b = j2;
        this.f20727c = kVar;
        this.f20728d = num;
        this.f20729e = str;
        this.f20730f = list;
        this.f20731g = pVar;
    }
}

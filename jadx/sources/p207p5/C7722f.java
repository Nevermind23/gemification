package p207p5;

/* renamed from: p5.f */
public final class C7722f {

    /* renamed from: c */
    private static final C7722f f22438c = new C7723a().mo22472a();

    /* renamed from: a */
    private final long f22439a;

    /* renamed from: b */
    private final long f22440b;

    /* renamed from: p5.f$a */
    public static final class C7723a {

        /* renamed from: a */
        private long f22441a = 0;

        /* renamed from: b */
        private long f22442b = 0;

        C7723a() {
        }

        /* renamed from: a */
        public C7722f mo22472a() {
            return new C7722f(this.f22441a, this.f22442b);
        }

        /* renamed from: b */
        public C7723a mo22473b(long j) {
            this.f22442b = j;
            return this;
        }

        /* renamed from: c */
        public C7723a mo22474c(long j) {
            this.f22441a = j;
            return this;
        }
    }

    C7722f(long j, long j2) {
        this.f22439a = j;
        this.f22440b = j2;
    }

    /* renamed from: c */
    public static C7723a m29320c() {
        return new C7723a();
    }

    /* renamed from: a */
    public long mo22470a() {
        return this.f22440b;
    }

    /* renamed from: b */
    public long mo22471b() {
        return this.f22439a;
    }
}

package p207p5;

import p276u9.C8652c;

/* renamed from: p5.c */
public final class C7715c {

    /* renamed from: c */
    private static final C7715c f22414c = new C7716a().mo22457a();

    /* renamed from: a */
    private final long f22415a;

    /* renamed from: b */
    private final C7717b f22416b;

    /* renamed from: p5.c$a */
    public static final class C7716a {

        /* renamed from: a */
        private long f22417a = 0;

        /* renamed from: b */
        private C7717b f22418b = C7717b.REASON_UNKNOWN;

        C7716a() {
        }

        /* renamed from: a */
        public C7715c mo22457a() {
            return new C7715c(this.f22417a, this.f22418b);
        }

        /* renamed from: b */
        public C7716a mo22458b(long j) {
            this.f22417a = j;
            return this;
        }

        /* renamed from: c */
        public C7716a mo22459c(C7717b bVar) {
            this.f22418b = bVar;
            return this;
        }
    }

    /* renamed from: p5.c$b */
    public enum C7717b implements C8652c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: d */
        private final int f22427d;

        private C7717b(int i) {
            this.f22427d = i;
        }

        /* renamed from: i */
        public int mo19678i() {
            return this.f22427d;
        }
    }

    C7715c(long j, C7717b bVar) {
        this.f22415a = j;
        this.f22416b = bVar;
    }

    /* renamed from: c */
    public static C7716a m29301c() {
        return new C7716a();
    }

    /* renamed from: a */
    public long mo22455a() {
        return this.f22415a;
    }

    /* renamed from: b */
    public C7717b mo22456b() {
        return this.f22416b;
    }
}

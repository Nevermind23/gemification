package p230r2;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;

/* renamed from: r2.b */
public final class C8045b {

    /* renamed from: a */
    public static final C8046a f23192a = new C8046a(C8047b.CACHE_ONLY);

    /* renamed from: b */
    public static final C8048c f23193b = new C8048c(C8047b.NETWORK_ONLY, 0, (TimeUnit) null, false);

    /* renamed from: c */
    public static final C8046a f23194c = new C8046a(C8047b.CACHE_FIRST);

    /* renamed from: d */
    public static final C8046a f23195d = new C8046a(C8047b.NETWORK_FIRST);

    /* renamed from: e */
    public static final C8045b f23196e = new C8045b();

    /* renamed from: r2.b$a */
    public static final class C8046a extends C8048c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8046a(C8047b bVar) {
            super(bVar, 0, (TimeUnit) null, false);
            C41536l.m120490j(bVar, "fetchStrategy");
        }
    }

    /* renamed from: r2.b$b */
    public enum C8047b {
        CACHE_ONLY,
        NETWORK_ONLY,
        CACHE_FIRST,
        NETWORK_FIRST
    }

    /* renamed from: r2.b$c */
    public static class C8048c {

        /* renamed from: a */
        public final C8047b f23202a;

        /* renamed from: b */
        public final long f23203b;

        /* renamed from: c */
        public final TimeUnit f23204c;

        /* renamed from: d */
        public final boolean f23205d;

        public C8048c(C8047b bVar, long j, TimeUnit timeUnit, boolean z) {
            C41536l.m120490j(bVar, "fetchStrategy");
            this.f23202a = bVar;
            this.f23203b = j;
            this.f23204c = timeUnit;
            this.f23205d = z;
        }

        /* renamed from: a */
        public final long mo23211a() {
            TimeUnit timeUnit = this.f23204c;
            if (timeUnit != null) {
                return timeUnit.toMillis(this.f23203b);
            }
            return 0;
        }
    }

    private C8045b() {
    }
}

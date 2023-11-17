package ze1;

import ie1.C41332l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe1.C42193c;
import ve1.C43151a;

/* renamed from: ze1.f */
public abstract class C43422f implements Iterable, C43151a {

    /* renamed from: g */
    public static final C43423a f101284g = new C43423a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final long f101285d;

    /* renamed from: e */
    private final long f101286e;

    /* renamed from: f */
    private final long f101287f;

    /* renamed from: ze1.f$a */
    public static final class C43423a {
        private C43423a() {
        }

        public /* synthetic */ C43423a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C43422f(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f101285d = j;
            this.f101286e = C42193c.m122498d(j, j2, j3);
            this.f101287f = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: j */
    public final long mo102121j() {
        return this.f101285d;
    }

    /* renamed from: l */
    public final long mo102122l() {
        return this.f101286e;
    }

    /* renamed from: n */
    public C41332l0 iterator() {
        return new C43424g(this.f101285d, this.f101286e, this.f101287f);
    }
}

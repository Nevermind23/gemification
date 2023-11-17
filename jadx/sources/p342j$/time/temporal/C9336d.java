package p342j$.time.temporal;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.d */
final class C9336d extends C9339g {
    C9336d() {
        super("QUARTER_OF_YEAR", 1);
    }

    /* renamed from: e */
    public final C9347o mo25112e() {
        return C9347o.m34511i(1, 4);
    }

    /* renamed from: f */
    public final long mo25113f(TemporalAccessor temporalAccessor) {
        if (mo25114h(temporalAccessor)) {
            return (temporalAccessor.mo24918f(C9333a.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new C9346n("Unsupported field: QuarterOfYear");
    }

    /* renamed from: h */
    public final boolean mo25114h(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo24916b(C9333a.MONTH_OF_YEAR) && C9339g.m34484k(temporalAccessor);
    }

    /* renamed from: i */
    public final Temporal mo25115i(Temporal temporal, long j) {
        long f = mo25113f(temporal);
        mo25112e().mo25135b(this, j);
        C9333a aVar = C9333a.MONTH_OF_YEAR;
        return temporal.mo24930a(aVar, ((j - f) * 3) + temporal.mo24918f(aVar));
    }

    public final String toString() {
        return "QuarterOfYear";
    }
}

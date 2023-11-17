package p342j$.time.temporal;

import p342j$.time.chrono.C9295g;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.c */
final class C9335c extends C9339g {
    C9335c() {
        super("DAY_OF_QUARTER", 0);
    }

    /* renamed from: e */
    public final C9347o mo25112e() {
        return C9347o.m34513k(90, 92);
    }

    /* renamed from: f */
    public final long mo25113f(TemporalAccessor temporalAccessor) {
        if (mo25114h(temporalAccessor)) {
            int i = temporalAccessor.get(C9333a.DAY_OF_YEAR);
            int i2 = temporalAccessor.get(C9333a.MONTH_OF_YEAR);
            long f = temporalAccessor.mo24918f(C9333a.YEAR);
            int[] l = C9339g.f25873a;
            int i3 = (i2 - 1) / 3;
            C9295g.f25767a.getClass();
            return (long) (i - l[i3 + (C9295g.m34328a(f) ? 4 : 0)]);
        }
        throw new C9346n("Unsupported field: DayOfQuarter");
    }

    /* renamed from: h */
    public final boolean mo25114h(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo24916b(C9333a.DAY_OF_YEAR) && temporalAccessor.mo24916b(C9333a.MONTH_OF_YEAR) && temporalAccessor.mo24916b(C9333a.YEAR) && C9339g.m34484k(temporalAccessor);
    }

    /* renamed from: i */
    public final Temporal mo25115i(Temporal temporal, long j) {
        long f = mo25113f(temporal);
        mo25112e().mo25135b(this, j);
        C9333a aVar = C9333a.DAY_OF_YEAR;
        return temporal.mo24930a(aVar, (j - f) + temporal.mo24918f(aVar));
    }

    /* renamed from: j */
    public final C9347o mo25116j(TemporalAccessor temporalAccessor) {
        if (mo25114h(temporalAccessor)) {
            long f = temporalAccessor.mo24918f(C9339g.QUARTER_OF_YEAR);
            if (f != 1) {
                return f == 2 ? C9347o.m34511i(1, 91) : (f == 3 || f == 4) ? C9347o.m34511i(1, 92) : mo25112e();
            }
            long f2 = temporalAccessor.mo24918f(C9333a.YEAR);
            C9295g.f25767a.getClass();
            return C9295g.m34328a(f2) ? C9347o.m34511i(1, 91) : C9347o.m34511i(1, 90);
        }
        throw new C9346n("Unsupported field: DayOfQuarter");
    }

    public final String toString() {
        return "DayOfQuarter";
    }
}

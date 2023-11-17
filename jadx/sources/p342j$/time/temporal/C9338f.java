package p342j$.time.temporal;

import p342j$.time.LocalDate;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.f */
final class C9338f extends C9339g {
    C9338f() {
        super("WEEK_BASED_YEAR", 3);
    }

    /* renamed from: e */
    public final C9347o mo25112e() {
        return C9333a.YEAR.mo25112e();
    }

    /* renamed from: f */
    public final long mo25113f(TemporalAccessor temporalAccessor) {
        if (mo25114h(temporalAccessor)) {
            return (long) C9339g.m34490q(LocalDate.m34216n(temporalAccessor));
        }
        throw new C9346n("Unsupported field: WeekBasedYear");
    }

    /* renamed from: h */
    public final boolean mo25114h(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo24916b(C9333a.EPOCH_DAY) && C9339g.m34484k(temporalAccessor);
    }

    /* renamed from: i */
    public final Temporal mo25115i(Temporal temporal, long j) {
        if (mo25114h(temporal)) {
            int a = mo25112e().mo25134a(C9339g.WEEK_BASED_YEAR, j);
            LocalDate n = LocalDate.m34216n(temporal);
            C9333a aVar = C9333a.DAY_OF_WEEK;
            int i = n.get(aVar);
            int n2 = C9339g.m34487n(n);
            if (n2 == 53 && C9339g.m34491r(a) == 52) {
                n2 = 52;
            }
            LocalDate of = LocalDate.m34218of(a, 1, 4);
            return temporal.mo24933c(of.plusDays((long) (((n2 - 1) * 7) + (i - of.get(aVar)))));
        }
        throw new C9346n("Unsupported field: WeekBasedYear");
    }

    public final String toString() {
        return "WeekBasedYear";
    }
}

package p342j$.time.temporal;

import p342j$.lang.C9284a;
import p342j$.time.LocalDate;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.e */
final class C9337e extends C9339g {
    C9337e() {
        super("WEEK_OF_WEEK_BASED_YEAR", 2);
    }

    /* renamed from: e */
    public final C9347o mo25112e() {
        return C9347o.m34513k(52, 53);
    }

    /* renamed from: f */
    public final long mo25113f(TemporalAccessor temporalAccessor) {
        if (mo25114h(temporalAccessor)) {
            return (long) C9339g.m34487n(LocalDate.m34216n(temporalAccessor));
        }
        throw new C9346n("Unsupported field: WeekOfWeekBasedYear");
    }

    /* renamed from: h */
    public final boolean mo25114h(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo24916b(C9333a.EPOCH_DAY) && C9339g.m34484k(temporalAccessor);
    }

    /* renamed from: i */
    public final Temporal mo25115i(Temporal temporal, long j) {
        mo25112e().mo25135b(this, j);
        return temporal.mo24936h(C9284a.m34184k(j, mo25113f(temporal)), ChronoUnit.WEEKS);
    }

    /* renamed from: j */
    public final C9347o mo25116j(TemporalAccessor temporalAccessor) {
        if (mo25114h(temporalAccessor)) {
            return C9339g.m34486m(LocalDate.m34216n(temporalAccessor));
        }
        throw new C9346n("Unsupported field: WeekOfWeekBasedYear");
    }

    public final String toString() {
        return "WeekOfWeekBasedYear";
    }
}

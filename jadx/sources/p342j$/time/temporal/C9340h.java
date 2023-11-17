package p342j$.time.temporal;

import p342j$.lang.C9284a;

/* renamed from: j$.time.temporal.h */
enum C9340h implements C9345m {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    

    /* renamed from: a */
    private final String f25876a;

    private C9340h(String str) {
        this.f25876a = str;
    }

    /* renamed from: a */
    public final boolean mo25105a() {
        return false;
    }

    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.mo24938j(temporal2, this);
        }
        int i = C9334b.f25872a[ordinal()];
        if (i == 1) {
            TemporalField temporalField = C9341i.f25879c;
            return C9284a.m34184k(temporal2.mo24918f(temporalField), temporal.mo24918f(temporalField));
        } else if (i == 2) {
            return temporal.mo24938j(temporal2, ChronoUnit.MONTHS) / 3;
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    /* renamed from: c */
    public final boolean mo25107c() {
        return true;
    }

    /* renamed from: e */
    public final Temporal mo25108e(Temporal temporal, long j) {
        int i = C9334b.f25872a[ordinal()];
        if (i == 1) {
            TemporalField temporalField = C9341i.f25879c;
            return temporal.mo24930a(temporalField, C9284a.m34179f((long) temporal.get(temporalField), j));
        } else if (i == 2) {
            return temporal.mo24936h(j / 256, ChronoUnit.YEARS).mo24936h((j % 256) * 3, ChronoUnit.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    public final String toString() {
        return this.f25876a;
    }
}

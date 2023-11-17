package p342j$.time.temporal;

/* renamed from: j$.time.temporal.a */
public enum C9333a implements TemporalField {
    NANO_OF_SECOND("NanoOfSecond", C9347o.m34511i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", C9347o.m34511i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", C9347o.m34511i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", C9347o.m34511i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", C9347o.m34511i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", C9347o.m34511i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", C9347o.m34511i(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", C9347o.m34511i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", C9347o.m34511i(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", C9347o.m34511i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", C9347o.m34511i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", C9347o.m34511i(1, 12)),
    HOUR_OF_DAY("HourOfDay", C9347o.m34511i(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", C9347o.m34511i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", C9347o.m34511i(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", C9347o.m34511i(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", C9347o.m34511i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", C9347o.m34511i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", C9347o.m34513k(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", C9347o.m34513k(365, 366)),
    EPOCH_DAY("EpochDay", C9347o.m34511i(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", C9347o.m34513k(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", C9347o.m34511i(1, 53)),
    PROLEPTIC_MONTH("ProlepticMonth", C9347o.m34511i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", C9347o.m34513k(999999999, 1000000000)),
    YEAR("Year", C9347o.m34511i(-999999999, 999999999), 0),
    ERA("Era", C9347o.m34511i(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", C9347o.m34511i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", C9347o.m34511i(-64800, 64800));
    

    /* renamed from: a */
    private final String f25870a;

    /* renamed from: b */
    private final C9347o f25871b;

    private C9333a(String str, C9347o oVar) {
        this.f25870a = str;
        this.f25871b = oVar;
    }

    private C9333a(String str, C9347o oVar, int i) {
        this.f25870a = str;
        this.f25871b = oVar;
    }

    /* renamed from: a */
    public final boolean mo25110a() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    /* renamed from: c */
    public final boolean mo25111c() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    /* renamed from: e */
    public final C9347o mo25112e() {
        return this.f25871b;
    }

    /* renamed from: f */
    public final long mo25113f(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo24918f(this);
    }

    /* renamed from: h */
    public final boolean mo25114h(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo24916b(this);
    }

    /* renamed from: i */
    public final Temporal mo25115i(Temporal temporal, long j) {
        return temporal.mo24930a(this, j);
    }

    /* renamed from: j */
    public final C9347o mo25116j(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo24917e(this);
    }

    /* renamed from: k */
    public final int mo25126k(long j) {
        return this.f25871b.mo25134a(this, j);
    }

    /* renamed from: l */
    public final void mo25127l(long j) {
        this.f25871b.mo25135b(this, j);
    }

    public final String toString() {
        return this.f25870a;
    }
}

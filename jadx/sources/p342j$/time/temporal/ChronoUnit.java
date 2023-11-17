package p342j$.time.temporal;

/* renamed from: j$.time.temporal.ChronoUnit */
public enum ChronoUnit implements C9345m {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a */
    private final String f25860a;

    private ChronoUnit(String str) {
        this.f25860a = str;
    }

    /* renamed from: a */
    public final boolean mo25105a() {
        return compareTo(DAYS) < 0;
    }

    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.mo24938j(temporal2, this);
    }

    /* renamed from: c */
    public final boolean mo25107c() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    /* renamed from: e */
    public final Temporal mo25108e(Temporal temporal, long j) {
        return temporal.mo24936h(j, this);
    }

    public final String toString() {
        return this.f25860a;
    }
}

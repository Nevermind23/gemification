package df1;

import java.util.concurrent.TimeUnit;

/* renamed from: df1.e */
public enum C40655e {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    

    /* renamed from: d */
    private final TimeUnit f96291d;

    private C40655e(TimeUnit timeUnit) {
        this.f96291d = timeUnit;
    }

    /* renamed from: b */
    public final TimeUnit mo94647b() {
        return this.f96291d;
    }
}

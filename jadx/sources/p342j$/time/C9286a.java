package p342j$.time;

import java.io.Serializable;

/* renamed from: j$.time.a */
final class C9286a extends C9287b implements Serializable {

    /* renamed from: a */
    private final ZoneId f25765a;

    C9286a(ZoneId zoneId) {
        this.f25765a = zoneId;
    }

    /* renamed from: a */
    public final Instant mo25018a() {
        return Instant.m34199p(System.currentTimeMillis());
    }

    /* renamed from: b */
    public final long mo25019b() {
        return System.currentTimeMillis();
    }

    /* renamed from: d */
    public final ZoneId mo25020d() {
        return this.f25765a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9286a) {
            return this.f25765a.equals(((C9286a) obj).f25765a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25765a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f25765a + "]";
    }
}

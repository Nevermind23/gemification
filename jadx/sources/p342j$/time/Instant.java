package p342j$.time;

import java.io.Serializable;
import p342j$.lang.C9284a;
import p342j$.time.format.DateTimeFormatter;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.C9345m;
import p342j$.time.temporal.C9346n;
import p342j$.time.temporal.C9347o;
import p342j$.time.temporal.ChronoUnit;
import p342j$.time.temporal.Temporal;
import p342j$.time.temporal.TemporalAccessor;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.Instant */
public final class Instant implements Temporal, Comparable<Instant>, Serializable {

    /* renamed from: c */
    public static final Instant f25737c = new Instant(0, 0);

    /* renamed from: a */
    private final long f25738a;

    /* renamed from: b */
    private final int f25739b;

    static {
        m34200q(-31557014167219200L, 0);
        m34200q(31556889864403199L, 999999999);
    }

    private Instant(long j, int i) {
        this.f25738a = j;
        this.f25739b = i;
    }

    /* renamed from: l */
    private static Instant m34197l(long j, int i) {
        if ((((long) i) | j) == 0) {
            return f25737c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new C9288c("Instant exceeds minimum or maximum instant");
    }

    /* renamed from: m */
    public static Instant m34198m(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        if (temporalAccessor != null) {
            try {
                return m34200q(temporalAccessor.mo24918f(C9333a.INSTANT_SECONDS), (long) temporalAccessor.get(C9333a.NANO_OF_SECOND));
            } catch (C9288c e) {
                throw new C9288c("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
            }
        } else {
            throw new NullPointerException("temporal");
        }
    }

    /* renamed from: p */
    public static Instant m34199p(long j) {
        return m34197l(C9284a.m34183j(j, 1000), ((int) C9284a.m34181h(j, 1000)) * 1000000);
    }

    /* renamed from: q */
    public static Instant m34200q(long j, long j2) {
        return m34197l(C9284a.m34179f(j, C9284a.m34183j(j2, 1000000000)), (int) C9284a.m34181h(j2, 1000000000));
    }

    /* renamed from: r */
    private Instant m34201r(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m34200q(C9284a.m34179f(C9284a.m34179f(this.f25738a, j), j2 / 1000000000), ((long) this.f25739b) + (j2 % 1000000000));
    }

    /* renamed from: t */
    private long m34202t(Instant instant) {
        long k = C9284a.m34184k(instant.f25738a, this.f25738a);
        long j = (long) (instant.f25739b - this.f25739b);
        int i = (k > 0 ? 1 : (k == 0 ? 0 : -1));
        return (i <= 0 || j >= 0) ? (i >= 0 || j <= 0) ? k : k + 1 : k - 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r3 != r2.f25739b) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r3 != r2.f25739b) goto L_0x004c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p342j$.time.temporal.Temporal mo24930a(p342j$.time.temporal.TemporalField r3, long r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p342j$.time.temporal.C9333a
            if (r0 == 0) goto L_0x0064
            r0 = r3
            j$.time.temporal.a r0 = (p342j$.time.temporal.C9333a) r0
            r0.mo25127l(r4)
            int[] r1 = p342j$.time.C9296d.f25768a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x0053
            r1 = 2
            if (r0 == r1) goto L_0x0045
            r1 = 3
            if (r0 == r1) goto L_0x003b
            r1 = 4
            if (r0 != r1) goto L_0x0027
            long r0 = r2.f25738a
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0062
            int r3 = r2.f25739b
            goto L_0x004e
        L_0x0027:
            j$.time.temporal.n r4 = new j$.time.temporal.n
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported field: "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x003b:
            int r3 = (int) r4
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r4
            int r4 = r2.f25739b
            if (r3 == r4) goto L_0x0062
            goto L_0x004c
        L_0x0045:
            int r3 = (int) r4
            int r3 = r3 * 1000
            int r4 = r2.f25739b
            if (r3 == r4) goto L_0x0062
        L_0x004c:
            long r4 = r2.f25738a
        L_0x004e:
            j$.time.Instant r3 = m34197l(r4, r3)
            goto L_0x006a
        L_0x0053:
            int r3 = r2.f25739b
            long r0 = (long) r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0062
            long r0 = r2.f25738a
            int r3 = (int) r4
            j$.time.Instant r3 = m34197l(r0, r3)
            goto L_0x006a
        L_0x0062:
            r3 = r2
            goto L_0x006a
        L_0x0064:
            j$.time.temporal.Temporal r3 = r3.mo25115i(r2, r4)
            j$.time.Instant r3 = (p342j$.time.Instant) r3
        L_0x006a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.time.Instant.mo24930a(j$.time.temporal.TemporalField, long):j$.time.temporal.Temporal");
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m34272m(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.m34302m(this, zoneId);
    }

    /* renamed from: b */
    public final boolean mo24916b(TemporalField temporalField) {
        return temporalField instanceof C9333a ? temporalField == C9333a.INSTANT_SECONDS || temporalField == C9333a.NANO_OF_SECOND || temporalField == C9333a.MICRO_OF_SECOND || temporalField == C9333a.MILLI_OF_SECOND : temporalField != null && temporalField.mo25114h(this);
    }

    /* renamed from: c */
    public final Temporal mo24933c(LocalDate localDate) {
        return (Instant) localDate.mo24956k(this);
    }

    /* renamed from: e */
    public final C9347o mo24917e(TemporalField temporalField) {
        return C9284a.m34177d(this, temporalField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f25738a == instant.f25738a && this.f25739b == instant.f25739b;
    }

    /* renamed from: f */
    public final long mo24918f(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof C9333a)) {
            return temporalField.mo25113f(this);
        }
        int i2 = C9296d.f25768a[((C9333a) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.f25739b;
        } else if (i2 == 2) {
            i = this.f25739b / 1000;
        } else if (i2 == 3) {
            i = this.f25739b / 1000000;
        } else if (i2 == 4) {
            return this.f25738a;
        } else {
            throw new C9346n("Unsupported field: " + temporalField);
        }
        return (long) i;
    }

    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof C9333a)) {
            return C9284a.m34177d(this, temporalField).mo25134a(temporalField, temporalField.mo25113f(this));
        }
        int i = C9296d.f25768a[((C9333a) temporalField).ordinal()];
        if (i == 1) {
            return this.f25739b;
        }
        if (i == 2) {
            return this.f25739b / 1000;
        }
        if (i == 3) {
            return this.f25739b / 1000000;
        }
        if (i == 4) {
            C9333a.INSTANT_SECONDS.mo25126k(this.f25738a);
        }
        throw new C9346n("Unsupported field: " + temporalField);
    }

    /* renamed from: h */
    public final Temporal mo24936h(long j, C9345m mVar) {
        long j2;
        if (!(mVar instanceof ChronoUnit)) {
            return (Instant) mVar.mo25108e(this, j);
        }
        switch (C9296d.f25769b[((ChronoUnit) mVar).ordinal()]) {
            case 1:
                return m34201r(0, j);
            case 2:
                return m34201r(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return m34201r(j / 1000, (j % 1000) * 1000000);
            case 4:
                return mo24942s(j);
            case 5:
                j2 = 60;
                break;
            case 6:
                j2 = 3600;
                break;
            case 7:
                j2 = 43200;
                break;
            case 8:
                j2 = 86400;
                break;
            default:
                throw new C9346n("Unsupported unit: " + mVar);
        }
        j = C9284a.m34182i(j, j2);
        return mo24942s(j);
    }

    public final int hashCode() {
        long j = this.f25738a;
        return (this.f25739b * 51) + ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: i */
    public final Object mo24922i(C9344l lVar) {
        if (lVar == C9343k.m34503e()) {
            return ChronoUnit.NANOS;
        }
        if (lVar == C9343k.m34499a() || lVar == C9343k.m34505g() || lVar == C9343k.m34504f() || lVar == C9343k.m34502d() || lVar == C9343k.m34500b() || lVar == C9343k.m34501c()) {
            return null;
        }
        return lVar.mo25036a(this);
    }

    /* renamed from: j */
    public final long mo24938j(Temporal temporal, C9345m mVar) {
        Instant m = m34198m(temporal);
        if (!(mVar instanceof ChronoUnit)) {
            return mVar.between(this, m);
        }
        switch (C9296d.f25769b[((ChronoUnit) mVar).ordinal()]) {
            case 1:
                return C9284a.m34179f(C9284a.m34182i(C9284a.m34184k(m.f25738a, this.f25738a), 1000000000), (long) (m.f25739b - this.f25739b));
            case 2:
                return C9284a.m34179f(C9284a.m34182i(C9284a.m34184k(m.f25738a, this.f25738a), 1000000000), (long) (m.f25739b - this.f25739b)) / 1000;
            case 3:
                return C9284a.m34184k(m.mo24944u(), mo24944u());
            case 4:
                return m34202t(m);
            case 5:
                return m34202t(m) / 60;
            case 6:
                return m34202t(m) / 3600;
            case 7:
                return m34202t(m) / 43200;
            case 8:
                return m34202t(m) / 86400;
            default:
                throw new C9346n("Unsupported unit: " + mVar);
        }
    }

    /* renamed from: k */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.f25738a, instant.f25738a);
        return compare != 0 ? compare : this.f25739b - instant.f25739b;
    }

    /* renamed from: n */
    public final long mo24940n() {
        return this.f25738a;
    }

    /* renamed from: o */
    public final int mo24941o() {
        return this.f25739b;
    }

    /* renamed from: s */
    public final Instant mo24942s(long j) {
        return m34201r(j, 0);
    }

    public final String toString() {
        return DateTimeFormatter.f25774f.format(this);
    }

    /* renamed from: u */
    public final long mo24944u() {
        long i;
        int i2;
        long j = this.f25738a;
        if (j >= 0 || this.f25739b <= 0) {
            i = C9284a.m34182i(j, 1000);
            i2 = this.f25739b / 1000000;
        } else {
            i = C9284a.m34182i(j + 1, 1000);
            i2 = (this.f25739b / 1000000) - 1000;
        }
        return C9284a.m34179f(i, (long) i2);
    }
}

package p342j$.time;

import java.io.Serializable;
import p342j$.lang.C9284a;
import p342j$.time.chrono.C9290b;
import p342j$.time.chrono.C9295g;
import p342j$.time.chrono.ChronoLocalDate;
import p342j$.time.format.DateTimeFormatter;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.C9345m;
import p342j$.time.temporal.C9347o;
import p342j$.time.temporal.ChronoUnit;
import p342j$.time.temporal.Temporal;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.LocalDateTime */
public final class LocalDateTime implements Temporal, C9290b, Serializable {

    /* renamed from: c */
    public static final LocalDateTime f25745c = m34246s(LocalDate.f25740d, C9327h.f25845e);

    /* renamed from: d */
    public static final LocalDateTime f25746d = m34246s(LocalDate.f25741e, C9327h.f25846f);

    /* renamed from: a */
    private final LocalDate f25747a;

    /* renamed from: b */
    private final C9327h f25748b;

    private LocalDateTime(LocalDate localDate, C9327h hVar) {
        this.f25747a = localDate;
        this.f25748b = hVar;
    }

    /* renamed from: C */
    private LocalDateTime m34243C(LocalDate localDate, C9327h hVar) {
        return (this.f25747a == localDate && this.f25748b == hVar) ? this : new LocalDateTime(localDate, hVar);
    }

    /* renamed from: l */
    private int m34244l(LocalDateTime localDateTime) {
        int m = this.f25747a.mo24959m(localDateTime.f25747a);
        return m == 0 ? this.f25748b.compareTo(localDateTime.f25748b) : m;
    }

    /* renamed from: r */
    public static LocalDateTime m34245r(int i) {
        return new LocalDateTime(LocalDate.m34218of(i, 12, 31), C9327h.m34401q());
    }

    /* renamed from: s */
    public static LocalDateTime m34246s(LocalDate localDate, C9327h hVar) {
        if (localDate == null) {
            throw new NullPointerException("date");
        } else if (hVar != null) {
            return new LocalDateTime(localDate, hVar);
        } else {
            throw new NullPointerException("time");
        }
    }

    /* renamed from: t */
    public static LocalDateTime m34247t(long j, int i, ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            long j2 = (long) i;
            C9333a.NANO_OF_SECOND.mo25127l(j2);
            long p = j + ((long) zoneOffset.mo25008p());
            return new LocalDateTime(LocalDate.m34221t(C9284a.m34183j(p, 86400)), C9327h.m34402r((((long) ((int) C9284a.m34181h(p, 86400))) * 1000000000) + j2));
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: w */
    private LocalDateTime m34248w(LocalDate localDate, long j, long j2, long j3, long j4) {
        LocalDate localDate2;
        C9327h hVar;
        if ((j | j2 | j3 | j4) == 0) {
            hVar = this.f25748b;
            localDate2 = localDate;
        } else {
            long j5 = j / 24;
            long j6 = j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
            long j7 = (long) 1;
            long j8 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
            long w = this.f25748b.mo25099w();
            long j9 = (j8 * j7) + w;
            long j12 = C9284a.m34183j(j9, 86400000000000L) + (j6 * j7);
            long h = C9284a.m34181h(j9, 86400000000000L);
            hVar = h == w ? this.f25748b : C9327h.m34402r(h);
            localDate2 = localDate.plusDays(j12);
        }
        return m34243C(localDate2, hVar);
    }

    /* renamed from: A */
    public final C9327h mo24973A() {
        return this.f25748b;
    }

    /* renamed from: B */
    public final LocalDateTime mo24933c(LocalDate localDate) {
        return localDate instanceof LocalDate ? m34243C(localDate, this.f25748b) : localDate instanceof C9327h ? m34243C(this.f25747a, (C9327h) localDate) : localDate instanceof LocalDateTime ? (LocalDateTime) localDate : (LocalDateTime) localDate.mo24956k(this);
    }

    /* renamed from: D */
    public final LocalDateTime mo24930a(TemporalField temporalField, long j) {
        return temporalField instanceof C9333a ? ((C9333a) temporalField).mo25110a() ? m34243C(this.f25747a, this.f25748b.mo24930a(temporalField, j)) : m34243C(this.f25747a.mo24930a(temporalField, j), this.f25748b) : (LocalDateTime) temporalField.mo25115i(this, j);
    }

    /* renamed from: b */
    public final boolean mo24916b(TemporalField temporalField) {
        if (!(temporalField instanceof C9333a)) {
            return temporalField != null && temporalField.mo25114h(this);
        }
        C9333a aVar = (C9333a) temporalField;
        return aVar.mo25111c() || aVar.mo25110a();
    }

    /* renamed from: e */
    public final C9347o mo24917e(TemporalField temporalField) {
        if (!(temporalField instanceof C9333a)) {
            return temporalField.mo25116j(this);
        }
        if (!((C9333a) temporalField).mo25110a()) {
            return this.f25747a.mo24917e(temporalField);
        }
        C9327h hVar = this.f25748b;
        hVar.getClass();
        return C9284a.m34177d(hVar, temporalField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f25747a.equals(localDateTime.f25747a) && this.f25748b.equals(localDateTime.f25748b);
    }

    /* renamed from: f */
    public final long mo24918f(TemporalField temporalField) {
        return temporalField instanceof C9333a ? ((C9333a) temporalField).mo25110a() ? this.f25748b.mo24918f(temporalField) : this.f25747a.mo24918f(temporalField) : temporalField.mo25113f(this);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.format(this);
        }
        throw new NullPointerException("formatter");
    }

    public final int get(TemporalField temporalField) {
        return temporalField instanceof C9333a ? ((C9333a) temporalField).mo25110a() ? this.f25748b.get(temporalField) : this.f25747a.get(temporalField) : C9284a.m34175b(this, temporalField);
    }

    public final int hashCode() {
        return this.f25747a.hashCode() ^ this.f25748b.hashCode();
    }

    /* renamed from: i */
    public final Object mo24922i(C9344l lVar) {
        if (lVar == C9343k.m34500b()) {
            return this.f25747a;
        }
        if (lVar == C9343k.m34505g() || lVar == C9343k.m34504f() || lVar == C9343k.m34502d()) {
            return null;
        }
        if (lVar == C9343k.m34501c()) {
            return this.f25748b;
        }
        if (lVar != C9343k.m34499a()) {
            return lVar == C9343k.m34503e() ? ChronoUnit.NANOS : lVar.mo25036a(this);
        }
        this.f25747a.getClass();
        return C9295g.f25767a;
    }

    /* renamed from: j */
    public final long mo24938j(Temporal temporal, C9345m mVar) {
        LocalDateTime localDateTime;
        long j;
        long j2;
        long j3;
        long j4;
        if (temporal instanceof LocalDateTime) {
            localDateTime = (LocalDateTime) temporal;
        } else if (temporal instanceof ZonedDateTime) {
            localDateTime = ((ZonedDateTime) temporal).toLocalDateTime();
        } else if (temporal instanceof OffsetDateTime) {
            localDateTime = ((OffsetDateTime) temporal).toLocalDateTime();
        } else {
            try {
                localDateTime = new LocalDateTime(LocalDate.m34216n(temporal), C9327h.m34399m(temporal));
            } catch (C9288c e) {
                throw new C9288c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(mVar instanceof ChronoUnit)) {
            return mVar.between(this, localDateTime);
        }
        if (mVar.mo25105a()) {
            LocalDate localDate = this.f25747a;
            LocalDate localDate2 = localDateTime.f25747a;
            localDate.getClass();
            long g = localDate2.mo24948g() - localDate.mo24948g();
            int i = (g > 0 ? 1 : (g == 0 ? 0 : -1));
            if (i == 0) {
                return this.f25748b.mo24938j(localDateTime.f25748b, mVar);
            }
            long w = localDateTime.f25748b.mo25099w() - this.f25748b.mo25099w();
            if (i > 0) {
                j2 = g - 1;
                j = w + 86400000000000L;
            } else {
                j2 = g + 1;
                j = w - 86400000000000L;
            }
            switch (C9298f.f25772a[((ChronoUnit) mVar).ordinal()]) {
                case 1:
                    j2 = C9284a.m34182i(j2, 86400000000000L);
                    break;
                case 2:
                    j3 = C9284a.m34182i(j2, 86400000000L);
                    j4 = 1000;
                    break;
                case 3:
                    j3 = C9284a.m34182i(j2, 86400000);
                    j4 = 1000000;
                    break;
                case 4:
                    j3 = C9284a.m34182i(j2, 86400);
                    j4 = 1000000000;
                    break;
                case 5:
                    j3 = C9284a.m34182i(j2, 1440);
                    j4 = 60000000000L;
                    break;
                case 6:
                    j3 = C9284a.m34182i(j2, 24);
                    j4 = 3600000000000L;
                    break;
                case 7:
                    j3 = C9284a.m34182i(j2, 2);
                    j4 = 43200000000000L;
                    break;
            }
            j2 = j3;
            j /= j4;
            return C9284a.m34179f(j2, j);
        }
        LocalDate localDate3 = localDateTime.f25747a;
        boolean z = true;
        if (localDate3.isAfter(this.f25747a)) {
            if (localDateTime.f25748b.compareTo(this.f25748b) < 0) {
                localDate3 = localDate3.plusDays(-1);
                return this.f25747a.mo24938j(localDate3, mVar);
            }
        }
        if (localDate3.isBefore(this.f25747a)) {
            if (localDateTime.f25748b.compareTo(this.f25748b) <= 0) {
                z = false;
            }
            if (z) {
                localDate3 = localDate3.plusDays(1);
            }
        }
        return this.f25747a.mo24938j(localDate3, mVar);
    }

    /* renamed from: k */
    public final int compareTo(C9290b bVar) {
        if (bVar instanceof LocalDateTime) {
            return m34244l((LocalDateTime) bVar);
        }
        LocalDateTime localDateTime = (LocalDateTime) bVar;
        int l = this.f25747a.compareTo(localDateTime.f25747a);
        if (l != 0) {
            return l;
        }
        int k = this.f25748b.compareTo(localDateTime.f25748b);
        if (k != 0) {
            return k;
        }
        this.f25747a.getClass();
        C9295g gVar = C9295g.f25767a;
        localDateTime.f25747a.getClass();
        gVar.getClass();
        gVar.getClass();
        return 0;
    }

    /* renamed from: m */
    public final int mo24981m() {
        return this.f25748b.mo25092o();
    }

    /* renamed from: n */
    public final int mo24982n() {
        return this.f25748b.mo25093p();
    }

    /* renamed from: o */
    public final int mo24983o() {
        return this.f25747a.getYear();
    }

    /* renamed from: p */
    public final boolean mo24984p(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m34244l(localDateTime) > 0;
        }
        int i = (this.f25747a.mo24948g() > localDateTime.f25747a.mo24948g() ? 1 : (this.f25747a.mo24948g() == localDateTime.f25747a.mo24948g() ? 0 : -1));
        return i > 0 || (i == 0 && this.f25748b.mo25099w() > localDateTime.f25748b.mo25099w());
    }

    /* renamed from: q */
    public final boolean mo24985q(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m34244l(localDateTime) < 0;
        }
        int i = (this.f25747a.mo24948g() > localDateTime.f25747a.mo24948g() ? 1 : (this.f25747a.mo24948g() == localDateTime.f25747a.mo24948g() ? 0 : -1));
        return i < 0 || (i == 0 && this.f25748b.mo25099w() < localDateTime.f25748b.mo25099w());
    }

    public final String toString() {
        return this.f25747a.toString() + 'T' + this.f25748b.toString();
    }

    /* renamed from: u */
    public final LocalDateTime mo24936h(long j, C9345m mVar) {
        long j2 = j;
        C9345m mVar2 = mVar;
        if (!(mVar2 instanceof ChronoUnit)) {
            return (LocalDateTime) mVar2.mo25108e(this, j2);
        }
        switch (C9298f.f25772a[((ChronoUnit) mVar2).ordinal()]) {
            case 1:
                return m34248w(this.f25747a, 0, 0, 0, j);
            case 2:
                LocalDateTime C = m34243C(this.f25747a.plusDays(j2 / 86400000000L), this.f25748b);
                return C.m34248w(C.f25747a, 0, 0, 0, (j2 % 86400000000L) * 1000);
            case 3:
                LocalDateTime C2 = m34243C(this.f25747a.plusDays(j2 / 86400000), this.f25748b);
                return C2.m34248w(C2.f25747a, 0, 0, 0, (j2 % 86400000) * 1000000);
            case 4:
                return mo24988v(j);
            case 5:
                return m34248w(this.f25747a, 0, j, 0, 0);
            case 6:
                return m34248w(this.f25747a, j, 0, 0, 0);
            case 7:
                LocalDateTime C3 = m34243C(this.f25747a.plusDays(j2 / 256), this.f25748b);
                return C3.m34248w(C3.f25747a, (j2 % 256) * 12, 0, 0, 0);
            default:
                return m34243C(this.f25747a.mo24936h(j2, mVar2), this.f25748b);
        }
    }

    /* renamed from: v */
    public final LocalDateTime mo24988v(long j) {
        return m34248w(this.f25747a, 0, 0, j, 0);
    }

    /* renamed from: x */
    public final long mo24989x(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return ((((LocalDate) mo24991z()).mo24948g() * 86400) + ((long) mo24973A().mo25100x())) - ((long) zoneOffset.mo25008p());
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: y */
    public final LocalDate mo24990y() {
        return this.f25747a;
    }

    /* renamed from: z */
    public final ChronoLocalDate mo24991z() {
        return this.f25747a;
    }
}

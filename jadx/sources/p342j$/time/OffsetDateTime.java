package p342j$.time;

import java.io.Serializable;
import p342j$.lang.C9284a;
import p342j$.time.chrono.C9295g;
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

/* renamed from: j$.time.OffsetDateTime */
public final class OffsetDateTime implements Temporal, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f25749a;

    /* renamed from: b */
    private final ZoneOffset f25750b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f25745c;
        ZoneOffset zoneOffset = ZoneOffset.f25759g;
        localDateTime.getClass();
        m34271l(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f25746d;
        ZoneOffset zoneOffset2 = ZoneOffset.f25758f;
        localDateTime2.getClass();
        m34271l(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (localDateTime != null) {
            this.f25749a = localDateTime;
            if (zoneOffset != null) {
                this.f25750b = zoneOffset;
                return;
            }
            throw new NullPointerException("offset");
        }
        throw new NullPointerException("dateTime");
    }

    /* renamed from: l */
    public static OffsetDateTime m34271l(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    /* renamed from: m */
    public static OffsetDateTime m34272m(Instant instant, ZoneId zoneId) {
        if (instant == null) {
            throw new NullPointerException("instant");
        } else if (zoneId != null) {
            ZoneOffset d = zoneId.mo25005m().mo25157d(instant);
            return new OffsetDateTime(LocalDateTime.m34247t(instant.mo24940n(), instant.mo24941o(), d), d);
        } else {
            throw new NullPointerException("zone");
        }
    }

    /* renamed from: n */
    private OffsetDateTime m34273n(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f25749a != localDateTime || !this.f25750b.equals(zoneOffset)) ? new OffsetDateTime(localDateTime, zoneOffset) : this;
    }

    /* renamed from: a */
    public final Temporal mo24930a(TemporalField temporalField, long j) {
        ZoneOffset zoneOffset;
        LocalDateTime localDateTime;
        if (!(temporalField instanceof C9333a)) {
            return (OffsetDateTime) temporalField.mo25115i(this, j);
        }
        C9333a aVar = (C9333a) temporalField;
        int i = C9330k.f25855a[aVar.ordinal()];
        if (i == 1) {
            return m34272m(Instant.m34200q(j, (long) this.f25749a.mo24981m()), this.f25750b);
        }
        if (i != 2) {
            localDateTime = this.f25749a.mo24930a(temporalField, j);
            zoneOffset = this.f25750b;
        } else {
            localDateTime = this.f25749a;
            zoneOffset = ZoneOffset.m34292s(aVar.mo25126k(j));
        }
        return m34273n(localDateTime, zoneOffset);
    }

    /* renamed from: b */
    public final boolean mo24916b(TemporalField temporalField) {
        return (temporalField instanceof C9333a) || (temporalField != null && temporalField.mo25114h(this));
    }

    /* renamed from: c */
    public final Temporal mo24933c(LocalDate localDate) {
        if ((localDate instanceof LocalDate) || (localDate instanceof C9327h) || (localDate instanceof LocalDateTime)) {
            return m34273n(this.f25749a.mo24933c(localDate), this.f25750b);
        }
        if (localDate instanceof Instant) {
            return m34272m((Instant) localDate, this.f25750b);
        }
        if (localDate instanceof ZoneOffset) {
            return m34273n(this.f25749a, (ZoneOffset) localDate);
        }
        boolean z = localDate instanceof OffsetDateTime;
        TemporalAccessor temporalAccessor = localDate;
        if (!z) {
            temporalAccessor = localDate.mo24956k(this);
        }
        return (OffsetDateTime) temporalAccessor;
    }

    public final int compareTo(Object obj) {
        int i;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (this.f25750b.equals(offsetDateTime.f25750b)) {
            i = toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime());
        } else {
            i = Long.compare(this.f25749a.mo24989x(this.f25750b), offsetDateTime.f25749a.mo24989x(offsetDateTime.f25750b));
            if (i == 0) {
                i = this.f25749a.mo24973A().mo25092o() - offsetDateTime.f25749a.mo24973A().mo25092o();
            }
        }
        return i == 0 ? toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime()) : i;
    }

    /* renamed from: e */
    public final C9347o mo24917e(TemporalField temporalField) {
        return temporalField instanceof C9333a ? (temporalField == C9333a.INSTANT_SECONDS || temporalField == C9333a.OFFSET_SECONDS) ? temporalField.mo25112e() : this.f25749a.mo24917e(temporalField) : temporalField.mo25116j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f25749a.equals(offsetDateTime.f25749a) && this.f25750b.equals(offsetDateTime.f25750b);
    }

    /* renamed from: f */
    public final long mo24918f(TemporalField temporalField) {
        if (!(temporalField instanceof C9333a)) {
            return temporalField.mo25113f(this);
        }
        int i = C9330k.f25855a[((C9333a) temporalField).ordinal()];
        return i != 1 ? i != 2 ? this.f25749a.mo24918f(temporalField) : (long) this.f25750b.mo25008p() : this.f25749a.mo24989x(this.f25750b);
    }

    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof C9333a)) {
            return C9284a.m34175b(this, temporalField);
        }
        int i = C9330k.f25855a[((C9333a) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f25749a.get(temporalField) : this.f25750b.mo25008p();
        }
        throw new C9346n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    /* renamed from: h */
    public final Temporal mo24936h(long j, C9345m mVar) {
        return mVar instanceof ChronoUnit ? m34273n(this.f25749a.mo24936h(j, mVar), this.f25750b) : (OffsetDateTime) mVar.mo25108e(this, j);
    }

    public final int hashCode() {
        return this.f25749a.hashCode() ^ this.f25750b.hashCode();
    }

    /* renamed from: i */
    public final Object mo24922i(C9344l lVar) {
        if (lVar == C9343k.m34502d() || lVar == C9343k.m34504f()) {
            return this.f25750b;
        }
        if (lVar == C9343k.m34505g()) {
            return null;
        }
        return lVar == C9343k.m34500b() ? this.f25749a.mo24990y() : lVar == C9343k.m34501c() ? this.f25749a.mo24973A() : lVar == C9343k.m34499a() ? C9295g.f25767a : lVar == C9343k.m34503e() ? ChronoUnit.NANOS : lVar.mo25036a(this);
    }

    /* renamed from: j */
    public final long mo24938j(Temporal temporal, C9345m mVar) {
        OffsetDateTime offsetDateTime;
        if (temporal instanceof OffsetDateTime) {
            offsetDateTime = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset o = ZoneOffset.m34289o(temporal);
                LocalDate localDate = (LocalDate) temporal.mo24922i(C9343k.m34500b());
                C9327h hVar = (C9327h) temporal.mo24922i(C9343k.m34501c());
                offsetDateTime = (localDate == null || hVar == null) ? m34272m(Instant.m34198m(temporal), o) : new OffsetDateTime(LocalDateTime.m34246s(localDate, hVar), o);
            } catch (C9288c e) {
                throw new C9288c("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(mVar instanceof ChronoUnit)) {
            return mVar.between(this, offsetDateTime);
        }
        ZoneOffset zoneOffset = this.f25750b;
        if (!zoneOffset.equals(offsetDateTime.f25750b)) {
            offsetDateTime = new OffsetDateTime(offsetDateTime.f25749a.mo24988v((long) (zoneOffset.mo25008p() - offsetDateTime.f25750b.mo25008p())), zoneOffset);
        }
        return this.f25749a.mo24938j(offsetDateTime.f25749a, mVar);
    }

    /* renamed from: k */
    public final ZoneOffset mo24995k() {
        return this.f25750b;
    }

    public LocalDateTime toLocalDateTime() {
        return this.f25749a;
    }

    public final String toString() {
        return this.f25749a.toString() + this.f25750b.toString();
    }
}

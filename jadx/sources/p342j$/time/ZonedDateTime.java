package p342j$.time;

import java.io.Serializable;
import java.util.List;
import p342j$.time.chrono.C9291c;
import p342j$.time.chrono.C9293e;
import p342j$.time.chrono.C9295g;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.C9345m;
import p342j$.time.temporal.C9346n;
import p342j$.time.temporal.C9347o;
import p342j$.time.temporal.ChronoUnit;
import p342j$.time.temporal.Temporal;
import p342j$.time.temporal.TemporalField;
import p342j$.time.zone.C9349a;
import p342j$.time.zone.C9351c;

/* renamed from: j$.time.ZonedDateTime */
public final class ZonedDateTime implements Temporal, C9293e, Serializable {

    /* renamed from: a */
    private final LocalDateTime f25762a;

    /* renamed from: b */
    private final ZoneOffset f25763b;

    /* renamed from: c */
    private final ZoneId f25764c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f25762a = localDateTime;
        this.f25763b = zoneOffset;
        this.f25764c = zoneId;
    }

    /* renamed from: k */
    private static ZonedDateTime m34301k(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.mo25005m().mo25157d(Instant.m34200q(j, (long) i));
        return new ZonedDateTime(LocalDateTime.m34247t(j, i, d), zoneId, d);
    }

    /* renamed from: m */
    public static ZonedDateTime m34302m(Instant instant, ZoneId zoneId) {
        if (instant == null) {
            throw new NullPointerException("instant");
        } else if (zoneId != null) {
            return m34301k(instant.mo24940n(), instant.mo24941o(), zoneId);
        } else {
            throw new NullPointerException("zone");
        }
    }

    /* renamed from: n */
    public static ZonedDateTime m34303n(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        if (localDateTime == null) {
            throw new NullPointerException("localDateTime");
        } else if (zoneId == null) {
            throw new NullPointerException("zone");
        } else if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        } else {
            C9351c m = zoneId.mo25005m();
            List g = m.mo25160g(localDateTime);
            if (g.size() == 1) {
                zoneOffset = (ZoneOffset) g.get(0);
            } else if (g.size() == 0) {
                C9349a f = m.mo25159f(localDateTime);
                localDateTime = localDateTime.mo24988v(f.mo25148e().mo24924c());
                zoneOffset = f.mo25150f();
            } else if ((zoneOffset == null || !g.contains(zoneOffset)) && (zoneOffset = (ZoneOffset) g.get(0)) == null) {
                throw new NullPointerException("offset");
            }
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        if (zoneId != null) {
            C9286a aVar = new C9286a(zoneId);
            return m34302m(aVar.mo25018a(), aVar.mo25020d());
        }
        throw new NullPointerException("zone");
    }

    /* renamed from: o */
    private ZonedDateTime m34304o(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f25763b) || !this.f25764c.mo25005m().mo25160g(this.f25762a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f25762a, this.f25764c, zoneOffset);
    }

    /* renamed from: a */
    public final Temporal mo24930a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof C9333a)) {
            return (ZonedDateTime) temporalField.mo25115i(this, j);
        }
        C9333a aVar = (C9333a) temporalField;
        int i = C9332m.f25858a[aVar.ordinal()];
        return i != 1 ? i != 2 ? m34303n(this.f25762a.mo24930a(temporalField, j), this.f25764c, this.f25763b) : m34304o(ZoneOffset.m34292s(aVar.mo25126k(j))) : m34301k(j, this.f25762a.mo24981m(), this.f25764c);
    }

    /* renamed from: b */
    public final boolean mo24916b(TemporalField temporalField) {
        return (temporalField instanceof C9333a) || (temporalField != null && temporalField.mo25114h(this));
    }

    /* renamed from: c */
    public final Temporal mo24933c(LocalDate localDate) {
        LocalDateTime localDateTime;
        if (localDate instanceof LocalDate) {
            localDateTime = LocalDateTime.m34246s(localDate, this.f25762a.mo24973A());
        } else if (localDate instanceof C9327h) {
            localDateTime = LocalDateTime.m34246s(this.f25762a.mo24990y(), (C9327h) localDate);
        } else if (localDate instanceof LocalDateTime) {
            return m34303n((LocalDateTime) localDate, this.f25764c, this.f25763b);
        } else {
            if (localDate instanceof OffsetDateTime) {
                OffsetDateTime offsetDateTime = (OffsetDateTime) localDate;
                return m34303n(offsetDateTime.toLocalDateTime(), this.f25764c, offsetDateTime.mo24995k());
            } else if (!(localDate instanceof Instant)) {
                return localDate instanceof ZoneOffset ? m34304o((ZoneOffset) localDate) : (ZonedDateTime) localDate.mo24956k(this);
            } else {
                Instant instant = (Instant) localDate;
                return m34301k(instant.mo24940n(), instant.mo24941o(), this.f25764c);
            }
        }
        return m34303n(localDateTime, this.f25764c, this.f25763b);
    }

    public final int compareTo(Object obj) {
        ZonedDateTime zonedDateTime = (ZonedDateTime) ((C9293e) obj);
        int compare = Long.compare(mo25013p(), zonedDateTime.mo25013p());
        if (compare != 0) {
            return compare;
        }
        int o = mo25015r().mo25092o() - zonedDateTime.mo25015r().mo25092o();
        if (o != 0) {
            return o;
        }
        int k = toLocalDateTime().compareTo(zonedDateTime.toLocalDateTime());
        if (k != 0) {
            return k;
        }
        int compareTo = this.f25764c.mo25004l().compareTo(zonedDateTime.f25764c.mo25004l());
        if (compareTo != 0) {
            return compareTo;
        }
        mo25014q().getClass();
        C9295g gVar = C9295g.f25767a;
        zonedDateTime.mo25014q().getClass();
        gVar.getClass();
        gVar.getClass();
        return 0;
    }

    /* renamed from: e */
    public final C9347o mo24917e(TemporalField temporalField) {
        return temporalField instanceof C9333a ? (temporalField == C9333a.INSTANT_SECONDS || temporalField == C9333a.OFFSET_SECONDS) ? temporalField.mo25112e() : this.f25762a.mo24917e(temporalField) : temporalField.mo25116j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.f25762a.equals(zonedDateTime.f25762a) && this.f25763b.equals(zonedDateTime.f25763b) && this.f25764c.equals(zonedDateTime.f25764c);
    }

    /* renamed from: f */
    public final long mo24918f(TemporalField temporalField) {
        if (!(temporalField instanceof C9333a)) {
            return temporalField.mo25113f(this);
        }
        int i = C9332m.f25858a[((C9333a) temporalField).ordinal()];
        return i != 1 ? i != 2 ? this.f25762a.mo24918f(temporalField) : (long) this.f25763b.mo25008p() : mo25013p();
    }

    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof C9333a)) {
            return C9291c.m34326a(this, temporalField);
        }
        int i = C9332m.f25858a[((C9333a) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f25762a.get(temporalField) : this.f25763b.mo25008p();
        }
        throw new C9346n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    /* renamed from: h */
    public final Temporal mo24936h(long j, C9345m mVar) {
        if (!(mVar instanceof ChronoUnit)) {
            return (ZonedDateTime) mVar.mo25108e(this, j);
        }
        if (mVar.mo25107c()) {
            return m34303n(this.f25762a.mo24936h(j, mVar), this.f25764c, this.f25763b);
        }
        LocalDateTime u = this.f25762a.mo24936h(j, mVar);
        ZoneOffset zoneOffset = this.f25763b;
        ZoneId zoneId = this.f25764c;
        if (u == null) {
            throw new NullPointerException("localDateTime");
        } else if (zoneOffset == null) {
            throw new NullPointerException("offset");
        } else if (zoneId != null) {
            return zoneId.mo25005m().mo25160g(u).contains(zoneOffset) ? new ZonedDateTime(u, zoneId, zoneOffset) : m34301k(u.mo24989x(zoneOffset), u.mo24981m(), zoneId);
        } else {
            throw new NullPointerException("zone");
        }
    }

    public final int hashCode() {
        return (this.f25762a.hashCode() ^ this.f25763b.hashCode()) ^ Integer.rotateLeft(this.f25764c.hashCode(), 3);
    }

    /* renamed from: i */
    public final Object mo24922i(C9344l lVar) {
        if (lVar == C9343k.m34500b()) {
            return mo25014q();
        }
        if (lVar == C9343k.m34504f() || lVar == C9343k.m34505g()) {
            return this.f25764c;
        }
        if (lVar == C9343k.m34502d()) {
            return this.f25763b;
        }
        if (lVar == C9343k.m34501c()) {
            return mo25015r();
        }
        if (lVar != C9343k.m34499a()) {
            return lVar == C9343k.m34503e() ? ChronoUnit.NANOS : lVar.mo25036a(this);
        }
        mo25014q().getClass();
        return C9295g.f25767a;
    }

    /* renamed from: j */
    public final long mo24938j(Temporal temporal, C9345m mVar) {
        ZonedDateTime zonedDateTime;
        if (temporal instanceof ZonedDateTime) {
            zonedDateTime = (ZonedDateTime) temporal;
        } else {
            try {
                ZoneId k = ZoneId.m34284k(temporal);
                C9333a aVar = C9333a.INSTANT_SECONDS;
                zonedDateTime = temporal.mo24916b(aVar) ? m34301k(temporal.mo24918f(aVar), temporal.get(C9333a.NANO_OF_SECOND), k) : m34303n(LocalDateTime.m34246s(LocalDate.m34216n(temporal), C9327h.m34399m(temporal)), k, (ZoneOffset) null);
            } catch (C9288c e) {
                throw new C9288c("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(mVar instanceof ChronoUnit)) {
            return mVar.between(this, zonedDateTime);
        }
        ZoneId zoneId = this.f25764c;
        if (zoneId != null) {
            if (!zonedDateTime.f25764c.equals(zoneId)) {
                zonedDateTime = m34301k(zonedDateTime.f25762a.mo24989x(zonedDateTime.f25763b), zonedDateTime.f25762a.mo24981m(), zoneId);
            }
            return mVar.mo25107c() ? this.f25762a.mo24938j(zonedDateTime.f25762a, mVar) : OffsetDateTime.m34271l(this.f25762a, this.f25763b).mo24938j(OffsetDateTime.m34271l(zonedDateTime.f25762a, zonedDateTime.f25763b), mVar);
        }
        zonedDateTime.getClass();
        throw new NullPointerException("zone");
    }

    /* renamed from: l */
    public final ZoneOffset mo25012l() {
        return this.f25763b;
    }

    /* renamed from: p */
    public final long mo25013p() {
        return ((mo25014q().mo24948g() * 86400) + ((long) mo25015r().mo25100x())) - ((long) mo25012l().mo25008p());
    }

    /* renamed from: q */
    public final LocalDate mo25014q() {
        return this.f25762a.mo24990y();
    }

    /* renamed from: r */
    public final C9327h mo25015r() {
        return this.f25762a.mo24973A();
    }

    public LocalDateTime toLocalDateTime() {
        return this.f25762a;
    }

    public final String toString() {
        String str = this.f25762a.toString() + this.f25763b.toString();
        if (this.f25763b == this.f25764c) {
            return str;
        }
        return str + '[' + this.f25764c.toString() + ']';
    }
}

package p342j$.time.chrono;

import p342j$.lang.C9284a;
import p342j$.time.ZonedDateTime;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9346n;
import p342j$.time.temporal.TemporalAccessor;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.chrono.c */
public abstract /* synthetic */ class C9291c {
    /* renamed from: a */
    public static int m34326a(C9293e eVar, TemporalField temporalField) {
        if (!(temporalField instanceof C9333a)) {
            return C9284a.m34175b(eVar, temporalField);
        }
        int i = C9292d.f25766a[((C9333a) temporalField).ordinal()];
        if (i != 1) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) eVar;
            return i != 2 ? zonedDateTime.toLocalDateTime().get(temporalField) : zonedDateTime.mo25012l().mo25008p();
        }
        throw new C9346n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    /* renamed from: b */
    public static C9294f m34327b(TemporalAccessor temporalAccessor) {
        if (temporalAccessor != null) {
            C9294f fVar = (C9294f) temporalAccessor.mo24922i(C9343k.m34499a());
            return fVar != null ? fVar : C9295g.f25767a;
        }
        throw new NullPointerException("temporal");
    }
}

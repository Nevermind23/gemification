package p342j$.time.format;

import p342j$.lang.C9284a;
import p342j$.time.LocalDate;
import p342j$.time.ZoneId;
import p342j$.time.chrono.C9294f;
import p342j$.time.chrono.ChronoLocalDate;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.C9347o;
import p342j$.time.temporal.TemporalAccessor;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.u */
final class C9320u implements TemporalAccessor {

    /* renamed from: a */
    final /* synthetic */ ChronoLocalDate f25830a;

    /* renamed from: b */
    final /* synthetic */ TemporalAccessor f25831b;

    /* renamed from: c */
    final /* synthetic */ C9294f f25832c;

    /* renamed from: d */
    final /* synthetic */ ZoneId f25833d;

    C9320u(LocalDate localDate, TemporalAccessor temporalAccessor, C9294f fVar, ZoneId zoneId) {
        this.f25830a = localDate;
        this.f25831b = temporalAccessor;
        this.f25832c = fVar;
        this.f25833d = zoneId;
    }

    /* renamed from: b */
    public final boolean mo24916b(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f25830a;
        return (chronoLocalDate == null || !temporalField.mo25111c()) ? this.f25831b.mo24916b(temporalField) : chronoLocalDate.mo24916b(temporalField);
    }

    /* renamed from: e */
    public final C9347o mo24917e(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f25830a;
        return (chronoLocalDate == null || !temporalField.mo25111c()) ? this.f25831b.mo24917e(temporalField) : chronoLocalDate.mo24917e(temporalField);
    }

    /* renamed from: f */
    public final long mo24918f(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f25830a;
        return (chronoLocalDate == null || !temporalField.mo25111c()) ? this.f25831b.mo24918f(temporalField) : chronoLocalDate.mo24918f(temporalField);
    }

    public final /* synthetic */ int get(TemporalField temporalField) {
        return C9284a.m34175b(this, temporalField);
    }

    /* renamed from: i */
    public final Object mo24922i(C9344l lVar) {
        return lVar == C9343k.m34499a() ? this.f25832c : lVar == C9343k.m34505g() ? this.f25833d : lVar == C9343k.m34503e() ? this.f25831b.mo24922i(lVar) : lVar.mo25036a(this);
    }
}

package p342j$.time.temporal;

import p342j$.time.C9327h;
import p342j$.time.LocalDate;
import p342j$.time.ZoneId;
import p342j$.time.ZoneOffset;
import p342j$.time.chrono.C9294f;

/* renamed from: j$.time.temporal.j */
public final /* synthetic */ class C9342j implements C9344l {

    /* renamed from: a */
    public final /* synthetic */ int f25881a;

    public /* synthetic */ C9342j(int i) {
        this.f25881a = i;
    }

    /* renamed from: a */
    public final Object mo25036a(TemporalAccessor temporalAccessor) {
        C9342j jVar = C9343k.f25882a;
        switch (this.f25881a) {
            case 0:
                return (ZoneId) temporalAccessor.mo24922i(jVar);
            case 1:
                return (C9294f) temporalAccessor.mo24922i(C9343k.f25883b);
            case 2:
                return (C9345m) temporalAccessor.mo24922i(C9343k.f25884c);
            case 3:
                C9333a aVar = C9333a.OFFSET_SECONDS;
                if (temporalAccessor.mo24916b(aVar)) {
                    return ZoneOffset.m34292s(temporalAccessor.get(aVar));
                }
                return null;
            case 4:
                ZoneId zoneId = (ZoneId) temporalAccessor.mo24922i(jVar);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.mo24922i(C9343k.f25885d);
            case 5:
                C9333a aVar2 = C9333a.EPOCH_DAY;
                if (temporalAccessor.mo24916b(aVar2)) {
                    return LocalDate.m34221t(temporalAccessor.mo24918f(aVar2));
                }
                return null;
            default:
                C9333a aVar3 = C9333a.NANO_OF_DAY;
                if (temporalAccessor.mo24916b(aVar3)) {
                    return C9327h.m34402r(temporalAccessor.mo24918f(aVar3));
                }
                return null;
        }
    }
}

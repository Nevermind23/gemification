package p342j$.time.format;

import p342j$.time.ZoneId;
import p342j$.time.ZoneOffset;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.a */
public final /* synthetic */ class C9300a implements C9344l {
    /* renamed from: a */
    public final Object mo25036a(TemporalAccessor temporalAccessor) {
        int i = C9319t.f25822j;
        ZoneId zoneId = (ZoneId) temporalAccessor.mo24922i(C9343k.m34505g());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}

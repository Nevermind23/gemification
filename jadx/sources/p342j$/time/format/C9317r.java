package p342j$.time.format;

import p342j$.time.ZoneId;
import p342j$.time.temporal.C9344l;

/* renamed from: j$.time.format.r */
class C9317r implements C9306g {

    /* renamed from: a */
    private final C9344l f25816a;

    /* renamed from: b */
    private final String f25817b;

    C9317r(C9344l lVar, String str) {
        this.f25816a = lVar;
        this.f25817b = str;
    }

    /* renamed from: a */
    public boolean mo25039a(C9321v vVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) vVar.mo25081f(this.f25816a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.mo25004l());
        return true;
    }

    public final String toString() {
        return this.f25817b;
    }
}

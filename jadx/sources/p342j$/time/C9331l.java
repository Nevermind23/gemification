package p342j$.time;

import p342j$.time.zone.C9351c;
import p342j$.time.zone.C9355g;

/* renamed from: j$.time.l */
final class C9331l extends ZoneId {

    /* renamed from: b */
    private final String f25856b;

    /* renamed from: c */
    private final transient C9351c f25857c;

    C9331l(String str, C9351c cVar) {
        this.f25856b = str;
        this.f25857c = cVar;
    }

    /* renamed from: o */
    static C9331l m34429o(String str) {
        if (str != null) {
            int length = str.length();
            if (length >= 2) {
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                        throw new C9288c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                    }
                }
                return new C9331l(str, C9355g.m34559a(str, true));
            }
            throw new C9288c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        throw new NullPointerException("zoneId");
    }

    /* renamed from: l */
    public final String mo25004l() {
        return this.f25856b;
    }

    /* renamed from: m */
    public final C9351c mo25005m() {
        C9351c cVar = this.f25857c;
        return cVar != null ? cVar : C9355g.m34559a(this.f25856b, false);
    }
}

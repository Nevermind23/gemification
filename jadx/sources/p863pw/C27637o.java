package p863pw;

import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: pw.o */
public final class C27637o {

    /* renamed from: a */
    private final Map f70719a;

    public C27637o(Map map) {
        C41536l.m120489i(map, "cards");
        this.f70719a = map;
    }

    /* renamed from: a */
    public final Map mo67167a() {
        return this.f70719a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27637o) && C41536l.m120484d(this.f70719a, ((C27637o) obj).f70719a);
    }

    public int hashCode() {
        return this.f70719a.hashCode();
    }

    public String toString() {
        Map map = this.f70719a;
        return "CardsAndDetails(cards=" + map + ")";
    }
}

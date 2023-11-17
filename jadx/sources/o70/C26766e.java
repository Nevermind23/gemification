package o70;

import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: o70.e */
public final class C26766e {

    /* renamed from: a */
    private final Map f67477a;

    public C26766e(Map map) {
        C41536l.m120489i(map, "cards");
        this.f67477a = map;
    }

    /* renamed from: a */
    public final Map mo66048a() {
        return this.f67477a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26766e) && C41536l.m120484d(this.f67477a, ((C26766e) obj).f67477a);
    }

    public int hashCode() {
        return this.f67477a.hashCode();
    }

    public String toString() {
        Map map = this.f67477a;
        return "CardsAndDetailsModel(cards=" + map + ")";
    }
}

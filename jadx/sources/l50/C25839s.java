package l50;

import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: l50.s */
public final class C25839s {

    /* renamed from: a */
    private final Map f65786a;

    public C25839s(Map map) {
        C41536l.m120489i(map, "cards");
        this.f65786a = map;
    }

    /* renamed from: a */
    public final Map mo64603a() {
        return this.f65786a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25839s) && C41536l.m120484d(this.f65786a, ((C25839s) obj).f65786a);
    }

    public int hashCode() {
        return this.f65786a.hashCode();
    }

    public String toString() {
        Map map = this.f65786a;
        return "CardsAndDetailsUIModel(cards=" + map + ")";
    }
}

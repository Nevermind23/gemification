package p674xm;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xm.e */
public final class C18797e {

    /* renamed from: a */
    private final List f52530a;

    /* renamed from: b */
    private final int f52531b;

    public C18797e(List list, int i) {
        C41536l.m120489i(list, "cards");
        this.f52530a = list;
        this.f52531b = i;
    }

    /* renamed from: a */
    public final List mo46619a() {
        return this.f52530a;
    }

    /* renamed from: b */
    public final int mo46620b() {
        return this.f52531b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18797e)) {
            return false;
        }
        C18797e eVar = (C18797e) obj;
        return C41536l.m120484d(this.f52530a, eVar.f52530a) && this.f52531b == eVar.f52531b;
    }

    public int hashCode() {
        return (this.f52530a.hashCode() * 31) + this.f52531b;
    }

    public String toString() {
        List list = this.f52530a;
        int i = this.f52531b;
        return "CardOrderListData(cards=" + list + ", startingIndex=" + i + ")";
    }
}

package g90;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.consumerloanapplication.domain.lookup.model.Country;

/* renamed from: g90.b */
public final class C20780b {

    /* renamed from: a */
    private final Country f55991a;

    /* renamed from: b */
    private boolean f55992b;

    public C20780b(Country country, boolean z) {
        C41536l.m120489i(country, "country");
        this.f55991a = country;
        this.f55992b = z;
    }

    /* renamed from: a */
    public final Country mo49330a() {
        return this.f55991a;
    }

    /* renamed from: b */
    public final boolean mo49331b() {
        return this.f55992b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20780b)) {
            return false;
        }
        C20780b bVar = (C20780b) obj;
        return C41536l.m120484d(this.f55991a, bVar.f55991a) && this.f55992b == bVar.f55992b;
    }

    public int hashCode() {
        int hashCode = this.f55991a.hashCode() * 31;
        boolean z = this.f55992b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        Country country = this.f55991a;
        boolean z = this.f55992b;
        return "CountryRecyclerModel(country=" + country + ", isSelected=" + z + ")";
    }
}

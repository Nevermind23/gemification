package g90;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;

/* renamed from: g90.e */
public final class C20783e {

    /* renamed from: a */
    private final LookupUiModel f56010a;

    /* renamed from: b */
    private boolean f56011b;

    public C20783e(LookupUiModel lookupUiModel, boolean z) {
        C41536l.m120489i(lookupUiModel, "currency");
        this.f56010a = lookupUiModel;
        this.f56011b = z;
    }

    /* renamed from: a */
    public final LookupUiModel mo49353a() {
        return this.f56010a;
    }

    /* renamed from: b */
    public final boolean mo49354b() {
        return this.f56011b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20783e)) {
            return false;
        }
        C20783e eVar = (C20783e) obj;
        return C41536l.m120484d(this.f56010a, eVar.f56010a) && this.f56011b == eVar.f56011b;
    }

    public int hashCode() {
        int hashCode = this.f56010a.hashCode() * 31;
        boolean z = this.f56011b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        LookupUiModel lookupUiModel = this.f56010a;
        boolean z = this.f56011b;
        return "IncomeCurrencyModel(currency=" + lookupUiModel + ", isSelected=" + z + ")";
    }
}

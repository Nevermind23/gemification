package g90;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;

/* renamed from: g90.g */
public final class C20785g {

    /* renamed from: a */
    private final LookupUiModel f56018a;

    /* renamed from: b */
    private boolean f56019b;

    public C20785g(LookupUiModel lookupUiModel, boolean z) {
        C41536l.m120489i(lookupUiModel, "jobPosition");
        this.f56018a = lookupUiModel;
        this.f56019b = z;
    }

    /* renamed from: a */
    public final LookupUiModel mo49358a() {
        return this.f56018a;
    }

    /* renamed from: b */
    public final boolean mo49359b() {
        return this.f56019b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20785g)) {
            return false;
        }
        C20785g gVar = (C20785g) obj;
        return C41536l.m120484d(this.f56018a, gVar.f56018a) && this.f56019b == gVar.f56019b;
    }

    public int hashCode() {
        int hashCode = this.f56018a.hashCode() * 31;
        boolean z = this.f56019b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        LookupUiModel lookupUiModel = this.f56018a;
        boolean z = this.f56019b;
        return "JobPositionRecyclerModel(jobPosition=" + lookupUiModel + ", isSelected=" + z + ")";
    }
}

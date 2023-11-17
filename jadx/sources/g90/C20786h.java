package g90;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import kotlin.jvm.internal.C41536l;
import n41.C37353c;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.OrganizationUiModel;

/* renamed from: g90.h */
public final class C20786h {

    /* renamed from: a */
    private final OrganizationUiModel f56020a;

    /* renamed from: b */
    private boolean f56021b;

    /* renamed from: c */
    private C37353c f56022c;

    public C20786h(OrganizationUiModel organizationUiModel, boolean z, C37353c cVar) {
        C41536l.m120489i(organizationUiModel, "organization");
        C41536l.m120489i(cVar, C11772k.C11773a.f34182n);
        this.f56020a = organizationUiModel;
        this.f56021b = z;
        this.f56022c = cVar;
    }

    /* renamed from: a */
    public final C37353c mo49363a() {
        return this.f56022c;
    }

    /* renamed from: b */
    public final OrganizationUiModel mo49364b() {
        return this.f56020a;
    }

    /* renamed from: c */
    public final boolean mo49365c() {
        return this.f56021b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20786h)) {
            return false;
        }
        C20786h hVar = (C20786h) obj;
        return C41536l.m120484d(this.f56020a, hVar.f56020a) && this.f56021b == hVar.f56021b && this.f56022c == hVar.f56022c;
    }

    public int hashCode() {
        int hashCode = this.f56020a.hashCode() * 31;
        boolean z = this.f56021b;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f56022c.hashCode();
    }

    public String toString() {
        OrganizationUiModel organizationUiModel = this.f56020a;
        boolean z = this.f56021b;
        C37353c cVar = this.f56022c;
        return "OrganizationRecyclerModel(organization=" + organizationUiModel + ", isSelected=" + z + ", locale=" + cVar + ")";
    }
}

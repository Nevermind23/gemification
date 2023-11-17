package p674xm;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel;

/* renamed from: xm.l */
public final class C18810l {

    /* renamed from: a */
    private final ServiceCenterUiModel f52557a;

    /* renamed from: b */
    private final String f52558b;

    public C18810l(ServiceCenterUiModel serviceCenterUiModel, String str) {
        C41536l.m120489i(serviceCenterUiModel, "sc");
        C41536l.m120489i(str, "fullName");
        this.f52557a = serviceCenterUiModel;
        this.f52558b = str;
    }

    /* renamed from: a */
    public final String mo46647a() {
        return this.f52558b;
    }

    /* renamed from: b */
    public final ServiceCenterUiModel mo46648b() {
        return this.f52557a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18810l)) {
            return false;
        }
        C18810l lVar = (C18810l) obj;
        return C41536l.m120484d(this.f52557a, lVar.f52557a) && C41536l.m120484d(this.f52558b, lVar.f52558b);
    }

    public int hashCode() {
        return (this.f52557a.hashCode() * 31) + this.f52558b.hashCode();
    }

    public String toString() {
        ServiceCenterUiModel serviceCenterUiModel = this.f52557a;
        String str = this.f52558b;
        return "DebitCardServiceCenter(sc=" + serviceCenterUiModel + ", fullName=" + str + ")";
    }
}

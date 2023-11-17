package p817lq;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;

/* renamed from: lq.b */
public final class C26057b {

    /* renamed from: a */
    private final String f66153a;

    /* renamed from: b */
    private final String f66154b;

    /* renamed from: c */
    private final String f66155c;

    /* renamed from: d */
    private final LookupUiModel f66156d;

    /* renamed from: e */
    private final ServiceCenterUiModel f66157e;

    /* renamed from: f */
    private final ServiceCenterUiModel f66158f;

    /* renamed from: g */
    private final ServiceCenterUiModel f66159g;

    /* renamed from: h */
    private final LookupUiModel f66160h;

    /* renamed from: i */
    private final String f66161i;

    /* renamed from: j */
    private final C26058c f66162j;

    /* renamed from: k */
    private final Long f66163k;

    public C26057b(String str, String str2, String str3, LookupUiModel lookupUiModel, ServiceCenterUiModel serviceCenterUiModel, ServiceCenterUiModel serviceCenterUiModel2, ServiceCenterUiModel serviceCenterUiModel3, LookupUiModel lookupUiModel2, String str4, C26058c cVar, Long l) {
        C41536l.m120489i(str, "contactNumber");
        C41536l.m120489i(str2, "email");
        C41536l.m120489i(str3, "workPlace");
        C41536l.m120489i(lookupUiModel, "monthlyIncome");
        C41536l.m120489i(serviceCenterUiModel, "soloLoungeCity");
        C41536l.m120489i(serviceCenterUiModel2, "soloLoungeRegion");
        C41536l.m120489i(serviceCenterUiModel3, "soloLoungeBranch");
        C41536l.m120489i(lookupUiModel2, "paymentType");
        C41536l.m120489i(str4, "contractText");
        C41536l.m120489i(cVar, "status");
        this.f66153a = str;
        this.f66154b = str2;
        this.f66155c = str3;
        this.f66156d = lookupUiModel;
        this.f66157e = serviceCenterUiModel;
        this.f66158f = serviceCenterUiModel2;
        this.f66159g = serviceCenterUiModel3;
        this.f66160h = lookupUiModel2;
        this.f66161i = str4;
        this.f66162j = cVar;
        this.f66163k = l;
    }

    /* renamed from: a */
    public final String mo64962a() {
        return this.f66153a;
    }

    /* renamed from: b */
    public final String mo64963b() {
        return this.f66161i;
    }

    /* renamed from: c */
    public final Long mo64964c() {
        return this.f66163k;
    }

    /* renamed from: d */
    public final String mo64965d() {
        return this.f66154b;
    }

    /* renamed from: e */
    public final LookupUiModel mo64966e() {
        return this.f66156d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26057b)) {
            return false;
        }
        C26057b bVar = (C26057b) obj;
        return C41536l.m120484d(this.f66153a, bVar.f66153a) && C41536l.m120484d(this.f66154b, bVar.f66154b) && C41536l.m120484d(this.f66155c, bVar.f66155c) && C41536l.m120484d(this.f66156d, bVar.f66156d) && C41536l.m120484d(this.f66157e, bVar.f66157e) && C41536l.m120484d(this.f66158f, bVar.f66158f) && C41536l.m120484d(this.f66159g, bVar.f66159g) && C41536l.m120484d(this.f66160h, bVar.f66160h) && C41536l.m120484d(this.f66161i, bVar.f66161i) && this.f66162j == bVar.f66162j && C41536l.m120484d(this.f66163k, bVar.f66163k);
    }

    /* renamed from: f */
    public final LookupUiModel mo64968f() {
        return this.f66160h;
    }

    /* renamed from: g */
    public final ServiceCenterUiModel mo64969g() {
        return this.f66159g;
    }

    /* renamed from: h */
    public final C26058c mo64970h() {
        return this.f66162j;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.f66153a.hashCode() * 31) + this.f66154b.hashCode()) * 31) + this.f66155c.hashCode()) * 31) + this.f66156d.hashCode()) * 31) + this.f66157e.hashCode()) * 31) + this.f66158f.hashCode()) * 31) + this.f66159g.hashCode()) * 31) + this.f66160h.hashCode()) * 31) + this.f66161i.hashCode()) * 31) + this.f66162j.hashCode()) * 31;
        Long l = this.f66163k;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    /* renamed from: i */
    public final String mo64972i() {
        return this.f66155c;
    }

    public String toString() {
        String str = this.f66153a;
        String str2 = this.f66154b;
        String str3 = this.f66155c;
        LookupUiModel lookupUiModel = this.f66156d;
        ServiceCenterUiModel serviceCenterUiModel = this.f66157e;
        ServiceCenterUiModel serviceCenterUiModel2 = this.f66158f;
        ServiceCenterUiModel serviceCenterUiModel3 = this.f66159g;
        LookupUiModel lookupUiModel2 = this.f66160h;
        String str4 = this.f66161i;
        C26058c cVar = this.f66162j;
        Long l = this.f66163k;
        return "BecomeSoloRegistrationParams(contactNumber=" + str + ", email=" + str2 + ", workPlace=" + str3 + ", monthlyIncome=" + lookupUiModel + ", soloLoungeCity=" + serviceCenterUiModel + ", soloLoungeRegion=" + serviceCenterUiModel2 + ", soloLoungeBranch=" + serviceCenterUiModel3 + ", paymentType=" + lookupUiModel2 + ", contractText=" + str4 + ", status=" + cVar + ", depositAmount=" + l + ")";
    }
}

package z10;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferRefinanceUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel;

/* renamed from: z10.b */
public final class C30135b {

    /* renamed from: a */
    private C30132a f75987a;

    /* renamed from: b */
    private BigDecimal f75988b;

    /* renamed from: c */
    private List f75989c;

    /* renamed from: d */
    private ServiceCenterUiModel f75990d;

    /* renamed from: e */
    private ServiceCenterUiModel f75991e;

    /* renamed from: f */
    private ServiceCenterUiModel f75992f;

    /* renamed from: g */
    private boolean f75993g;

    public C30135b(C30132a aVar, BigDecimal bigDecimal, List list, ServiceCenterUiModel serviceCenterUiModel, ServiceCenterUiModel serviceCenterUiModel2, ServiceCenterUiModel serviceCenterUiModel3, boolean z) {
        C41536l.m120489i(aVar, "creditApplication");
        this.f75987a = aVar;
        this.f75988b = bigDecimal;
        this.f75989c = list;
        this.f75990d = serviceCenterUiModel;
        this.f75991e = serviceCenterUiModel2;
        this.f75992f = serviceCenterUiModel3;
        this.f75993g = z;
    }

    /* renamed from: a */
    public final ServiceCenterUiModel mo70450a() {
        return this.f75990d;
    }

    /* renamed from: b */
    public final C30132a mo70451b() {
        return this.f75987a;
    }

    /* renamed from: c */
    public final BigDecimal mo70452c() {
        return this.f75988b;
    }

    /* renamed from: d */
    public final boolean mo70453d() {
        return this.f75993g;
    }

    /* renamed from: e */
    public final List mo70454e() {
        return this.f75989c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30135b)) {
            return false;
        }
        C30135b bVar = (C30135b) obj;
        return C41536l.m120484d(this.f75987a, bVar.f75987a) && C41536l.m120484d(this.f75988b, bVar.f75988b) && C41536l.m120484d(this.f75989c, bVar.f75989c) && C41536l.m120484d(this.f75990d, bVar.f75990d) && C41536l.m120484d(this.f75991e, bVar.f75991e) && C41536l.m120484d(this.f75992f, bVar.f75992f) && this.f75993g == bVar.f75993g;
    }

    /* renamed from: f */
    public final ServiceCenterUiModel mo70456f() {
        return this.f75991e;
    }

    /* renamed from: g */
    public final ServiceCenterUiModel mo70457g() {
        return this.f75992f;
    }

    /* renamed from: h */
    public final BigDecimal mo70458h() {
        List list = this.f75989c;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((CreditOfferRefinanceUiModel) next).mo54096v()) {
                arrayList.add(next);
            }
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (Object next2 : arrayList) {
            C41536l.m120488h(bigDecimal, "sum");
            bigDecimal = bigDecimal.add(new BigDecimal(((CreditOfferRefinanceUiModel) next2).mo54080f()));
            C41536l.m120488h(bigDecimal, "this.add(other)");
        }
        C41536l.m120488h(bigDecimal, "sum");
        return bigDecimal;
    }

    public int hashCode() {
        int hashCode = this.f75987a.hashCode() * 31;
        BigDecimal bigDecimal = this.f75988b;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        List list = this.f75989c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ServiceCenterUiModel serviceCenterUiModel = this.f75990d;
        int hashCode4 = (hashCode3 + (serviceCenterUiModel == null ? 0 : serviceCenterUiModel.hashCode())) * 31;
        ServiceCenterUiModel serviceCenterUiModel2 = this.f75991e;
        int hashCode5 = (hashCode4 + (serviceCenterUiModel2 == null ? 0 : serviceCenterUiModel2.hashCode())) * 31;
        ServiceCenterUiModel serviceCenterUiModel3 = this.f75992f;
        if (serviceCenterUiModel3 != null) {
            i = serviceCenterUiModel3.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.f75993g;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo70460i() {
        boolean z;
        boolean z2;
        if (!this.f75987a.mo70448m(this.f75988b)) {
            return false;
        }
        if (!this.f75987a.mo70446k() || !(this.f75990d == null || this.f75991e == null || this.f75992f == null)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (!this.f75987a.mo70447l() || this.f75989c != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final C30135b mo70461j() {
        return new C30135b(this.f75987a, (BigDecimal) null, (List) null, (ServiceCenterUiModel) null, (ServiceCenterUiModel) null, (ServiceCenterUiModel) null, false, 126, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public final void mo70462k(ServiceCenterUiModel serviceCenterUiModel) {
        this.f75990d = serviceCenterUiModel;
    }

    /* renamed from: l */
    public final void mo70463l(C30132a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f75987a = aVar;
    }

    /* renamed from: m */
    public final void mo70464m(BigDecimal bigDecimal) {
        this.f75988b = bigDecimal;
    }

    /* renamed from: n */
    public final void mo70465n(boolean z) {
        this.f75993g = z;
    }

    /* renamed from: o */
    public final void mo70466o(List list) {
        this.f75989c = list;
    }

    /* renamed from: p */
    public final void mo70467p(ServiceCenterUiModel serviceCenterUiModel) {
        this.f75991e = serviceCenterUiModel;
    }

    /* renamed from: q */
    public final void mo70468q(ServiceCenterUiModel serviceCenterUiModel) {
        this.f75992f = serviceCenterUiModel;
    }

    public String toString() {
        C30132a aVar = this.f75987a;
        BigDecimal bigDecimal = this.f75988b;
        List list = this.f75989c;
        ServiceCenterUiModel serviceCenterUiModel = this.f75990d;
        ServiceCenterUiModel serviceCenterUiModel2 = this.f75991e;
        ServiceCenterUiModel serviceCenterUiModel3 = this.f75992f;
        boolean z = this.f75993g;
        return "CreditApplicationFormData(creditApplication=" + aVar + ", creditLimit=" + bigDecimal + ", refinanceInfo=" + list + ", city=" + serviceCenterUiModel + ", region=" + serviceCenterUiModel2 + ", serviceCenter=" + serviceCenterUiModel3 + ", needsCalculation=" + z + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C30135b(z10.C30132a r7, java.math.BigDecimal r8, java.util.List r9, p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r10, p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r11, p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r0 = r14 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r9
        L_0x000f:
            r3 = r14 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r10
        L_0x0016:
            r4 = r14 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r11
        L_0x001d:
            r5 = r14 & 32
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r12
        L_0x0023:
            r5 = r14 & 64
            if (r5 == 0) goto L_0x0029
            r5 = 1
            goto L_0x002a
        L_0x0029:
            r5 = r13
        L_0x002a:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r1
            r15 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z10.C30135b.<init>(z10.a, java.math.BigDecimal, java.util.List, ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel, ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel, ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

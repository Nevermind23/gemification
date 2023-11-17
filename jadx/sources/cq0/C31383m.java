package cq0;

import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32343x;
import hd0.C24978b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import m41.C37223a;
import oq0.C37707a;
import oq0.C37708b;
import oq0.C37709c;
import oq0.C37710d;
import oq0.C37711e;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.insuranceprovider.InsuranceProviderData;
import p603si.C17799b;
import qq0.C38234a;
import qq0.C38236b;
import sq0.C38508a;
import wp0.C39628a;

/* renamed from: cq0.m */
public final class C31383m {

    /* renamed from: a */
    public static final C31384a f77932a = new C31384a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private static final BigDecimal f77933b = new BigDecimal(100);

    /* renamed from: cq0.m$a */
    public static final class C31384a {
        private C31384a() {
        }

        public /* synthetic */ C31384a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final List m93299d(List list, C38234a aVar, C37124a aVar2) {
        C37124a aVar3;
        ArrayList arrayList = new ArrayList();
        ArrayList<RefinanceInfoUiModel> arrayList2 = new ArrayList<>();
        for (Object next : list) {
            if (C41536l.m120484d(((RefinanceInfoUiModel) next).mo73519s(), "BOG")) {
                arrayList2.add(next);
            }
        }
        ArrayList<RefinanceInfoUiModel> arrayList3 = new ArrayList<>();
        for (Object next2 : list) {
            if (!C41536l.m120484d(((RefinanceInfoUiModel) next2).mo73519s(), "BOG")) {
                arrayList3.add(next2);
            }
        }
        if (!arrayList2.isEmpty()) {
            if (aVar.mo91767f()) {
                aVar3 = C37124a.CL;
            } else {
                aVar3 = C37124a.RL;
            }
            arrayList.add(new C38508a.C38510b(C32343x.m95388F(aVar3.mo90077S(), new Object[0]), C32343x.m95388F(aVar3.mo90076R(), new Object[0])));
            ArrayList arrayList4 = new ArrayList(C41343r.m119925u(arrayList2, 10));
            for (RefinanceInfoUiModel refinanceInfoUiModel : arrayList2) {
                arrayList4.add(new C38508a.C38511c(refinanceInfoUiModel, C41536l.m120484d(refinanceInfoUiModel.mo73518r(), C24978b.YES.mo63391e()), aVar.mo91767f()));
            }
            arrayList.addAll(arrayList4);
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(new C38508a.C38510b(C32343x.m95388F("loan.activation.details.page.refinance.block.other.banks.header", new Object[0]), C32343x.m95388F("loan.activation.details.page.refinance.block.other.banks.explanatory", new Object[0])));
            ArrayList arrayList5 = new ArrayList(C41343r.m119925u(arrayList3, 10));
            for (RefinanceInfoUiModel refinanceInfoUiModel2 : arrayList3) {
                arrayList5.add(new C38508a.C38511c(refinanceInfoUiModel2, C41536l.m120484d(refinanceInfoUiModel2.mo73518r(), C24978b.YES.mo63391e()), aVar.mo91767f()));
            }
            arrayList.addAll(arrayList5);
            arrayList.add(C38508a.C38509a.f92310a);
        }
        return arrayList;
    }

    /* renamed from: e */
    private final ProviderInfoUiModel m93300e(GetDecisionUiModel getDecisionUiModel) {
        List d = getDecisionUiModel.mo73434d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) next;
            if ((!m93301f(getDecisionUiModel) || providerInfoUiModel.mo73482a() == null) && (!m93302g(getDecisionUiModel) || providerInfoUiModel.mo73483b() == null)) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 1) {
            return (ProviderInfoUiModel) C41358y.m120007W(arrayList);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m93301f(p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionUiModel r4) {
        /*
            r3 = this;
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionDetailsUiModel r0 = r4.mo73432a()
            java.lang.Double r0 = r0.mo73418i()
            boolean r0 = wq0.C39640a.m115205a(r0)
            r1 = 0
            if (r0 == 0) goto L_0x003f
            java.util.List r4 = r4.mo73434d()
            boolean r0 = r4 instanceof java.util.Collection
            r2 = 1
            if (r0 == 0) goto L_0x0020
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r4 = r1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r4 = r4.iterator()
        L_0x0024:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r4.next()
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel r0 = (p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel) r0
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel r0 = r0.mo73482a()
            if (r0 == 0) goto L_0x0038
            r0 = r2
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            if (r0 == 0) goto L_0x0024
            r4 = r2
        L_0x003c:
            if (r4 == 0) goto L_0x003f
            r1 = r2
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cq0.C31383m.m93301f(ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionUiModel):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m93302g(p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionUiModel r4) {
        /*
            r3 = this;
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionDetailsUiModel r0 = r4.mo73432a()
            qq0.b r0 = r0.mo73416h()
            qq0.b r1 = qq0.C38236b.N
            r2 = 0
            if (r0 == r1) goto L_0x003d
            java.util.List r4 = r4.mo73434d()
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L_0x001e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r4 = r2
            goto L_0x003a
        L_0x001e:
            java.util.Iterator r4 = r4.iterator()
        L_0x0022:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r4.next()
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel r0 = (p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel) r0
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel r0 = r0.mo73483b()
            if (r0 == 0) goto L_0x0036
            r0 = r1
            goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            if (r0 == 0) goto L_0x0022
            r4 = r1
        L_0x003a:
            if (r4 == 0) goto L_0x003d
            r2 = r1
        L_0x003d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cq0.C31383m.m93302g(ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionUiModel):boolean");
    }

    /* renamed from: a */
    public final C37707a mo71755a(GetDecisionUiModel getDecisionUiModel, C37124a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C37124a aVar2 = aVar;
        C41536l.m120489i(getDecisionUiModel, "decisionUiModel");
        C41536l.m120489i(aVar2, C11769i.C11770a.f34151n);
        boolean z6 = false;
        if (m93301f(getDecisionUiModel) || m93302g(getDecisionUiModel)) {
            z = true;
        } else {
            z = false;
        }
        ProviderInfoUiModel e = m93300e(getDecisionUiModel);
        boolean f = m93301f(getDecisionUiModel);
        List d = m93299d(getDecisionUiModel.mo73436e(), getDecisionUiModel.mo73433b(), aVar2);
        String k = getDecisionUiModel.mo73432a().mo73420k();
        String valueOf = String.valueOf(getDecisionUiModel.mo73432a().mo73419j());
        String str = C32343x.m95388F("loan.activation.details.page.details.block.amount.explanatory", new Object[0]) + " " + C32343x.m95410Q(getDecisionUiModel.mo73432a().mo73419j(), getDecisionUiModel.mo73432a().mo73420k(), false, 2, (Object) null);
        C37710d dVar = new C37710d(new C17799b.C17806g(f77933b, new BigDecimal(String.valueOf(getDecisionUiModel.mo73432a().mo73419j()))), str, false, getDecisionUiModel.mo73433b().mo91764b(), valueOf, getDecisionUiModel.mo73433b().mo91764b(), 4, (DefaultConstructorMarker) null);
        C37710d dVar2 = new C37710d((C17799b) null, (String) null, false, false, getDecisionUiModel.mo73432a().mo73424q(), getDecisionUiModel.mo73433b().mo91765c(), 15, (DefaultConstructorMarker) null);
        C37710d dVar3 = new C37710d((C17799b) null, (String) null, false, false, Integer.valueOf(getDecisionUiModel.mo73432a().mo73421l()), getDecisionUiModel.mo73433b().mo91768g(), 15, (DefaultConstructorMarker) null);
        C37709c cVar = new C37709c(d, !d.isEmpty(), true);
        C37710d dVar4 = new C37710d((C17799b) null, (String) null, false, z, e, getDecisionUiModel.mo73433b().mo91766e(), 7, (DefaultConstructorMarker) null);
        C37711e eVar = new C37711e(false, f, f);
        boolean g = m93302g(getDecisionUiModel);
        if (getDecisionUiModel.mo73432a().mo73416h() == C38236b.X) {
            z2 = true;
        } else {
            z2 = false;
        }
        C38236b h = getDecisionUiModel.mo73432a().mo73416h();
        C38236b bVar = C38236b.Y;
        if (h == bVar) {
            z3 = true;
        } else {
            z3 = false;
        }
        C37711e eVar2 = new C37711e(z2, g, z3);
        C37710d dVar5 = new C37710d((C17799b) null, (String) null, false, true, (Object) null, false, 55, (DefaultConstructorMarker) null);
        if (e != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (getDecisionUiModel.mo73432a().mo73416h() != bVar || e == null) {
            z5 = false;
        } else {
            z5 = true;
        }
        C37708b bVar2 = new C37708b(z4, z5);
        if (getDecisionUiModel.mo73432a().mo73408a() != C39628a.N) {
            z6 = true;
        }
        return new C37707a(k, dVar, dVar2, dVar3, cVar, eVar, eVar2, dVar4, dVar5, bVar2, z, z6, (C37223a) null, C11398b.f33143v, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final List mo71756b(GetDecisionUiModel getDecisionUiModel, String str, boolean z, boolean z2) {
        InsuranceInfoUiModel insuranceInfoUiModel;
        boolean z3;
        GetDecisionUiModel getDecisionUiModel2 = getDecisionUiModel;
        C41536l.m120489i(getDecisionUiModel, "decisionUiModel");
        List d = getDecisionUiModel.mo73434d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (true) {
            boolean z4 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) next;
            if ((z && providerInfoUiModel.mo73482a() != null) || !z) {
                z4 = true;
            }
            if (z4) {
                arrayList.add(next);
            }
        }
        ArrayList<ProviderInfoUiModel> arrayList2 = new ArrayList<>();
        for (Object next2 : arrayList) {
            ProviderInfoUiModel providerInfoUiModel2 = (ProviderInfoUiModel) next2;
            if ((!z2 || providerInfoUiModel2.mo73483b() == null) && z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
        for (ProviderInfoUiModel providerInfoUiModel3 : arrayList2) {
            String d2 = providerInfoUiModel3.mo73484d();
            String e = providerInfoUiModel3.mo73486e();
            InsuranceInfoUiModel insuranceInfoUiModel2 = null;
            if (!m93301f(getDecisionUiModel) || !z) {
                insuranceInfoUiModel = null;
            } else {
                insuranceInfoUiModel = providerInfoUiModel3.mo73482a();
            }
            if (m93302g(getDecisionUiModel) && z2) {
                insuranceInfoUiModel2 = providerInfoUiModel3.mo73483b();
            }
            String str2 = str;
            arrayList3.add(new InsuranceProviderData(d2, e, insuranceInfoUiModel, insuranceInfoUiModel2, C41536l.m120484d(providerInfoUiModel3.mo73484d(), str), z, z2));
        }
        return arrayList3;
    }

    /* renamed from: c */
    public final ProviderInfoUiModel mo71757c(GetDecisionUiModel getDecisionUiModel, String str) {
        Object obj;
        C41536l.m120489i(getDecisionUiModel, "decisionUiModel");
        C41536l.m120489i(str, "id");
        Iterator it = getDecisionUiModel.mo73434d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((ProviderInfoUiModel) obj).mo73484d(), str)) {
                break;
            }
        }
        return (ProviderInfoUiModel) obj;
    }
}

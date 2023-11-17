package ns0;

import fs0.C32003c;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel;
import p341ge.bog.mobilebank.loans.presentation.repayment.model.RepaymentDetailsUiModel;
import tr0.C38783d;
import tr0.C38784e;
import tr0.C38789j;

/* renamed from: ns0.b */
public final class C37458b {
    /* renamed from: c */
    private final OfferedPlanTypesUiModel m110356c(C38789j jVar) {
        C32003c a = C32003c.f78793e.mo72500a(jVar.mo92461a());
        String c = jVar.mo92463c();
        String str = "";
        if (c == null) {
            c = str;
        }
        String b = jVar.mo92462b();
        if (b != null) {
            str = b;
        }
        return new OfferedPlanTypesUiModel(a, c, str);
    }

    /* renamed from: d */
    private final RepaymentDetailsUiModel m110357d(C38784e eVar, String str) {
        return new RepaymentDetailsUiModel(eVar.mo92432a(), C32343x.m95410Q(eVar.mo92433b(), str, false, 2, (Object) null), eVar.mo92435d());
    }

    /* renamed from: a */
    public final List mo90590a(C38783d dVar) {
        List<C38784e> e;
        if (dVar == null || (e = dVar.mo92427e()) == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(e, 10));
        for (C38784e d : e) {
            arrayList.add(m110357d(d, dVar.mo92426d()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo90591b(C38783d dVar) {
        List<C38789j> f;
        if (dVar == null || (f = dVar.mo92429f()) == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(f, 10));
        for (C38789j c : f) {
            arrayList.add(m110356c(c));
        }
        return arrayList;
    }
}

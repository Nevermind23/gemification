package p341ge.bog.mobilebank.loans.presentation.historygraphics;

import g91.C32343x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import lr0.C37129d;
import o31.C37603j;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.C32648f;
import tr0.C38785f;
import tr0.C38787h;

/* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.c */
public final class C32645c {
    /* renamed from: b */
    private final C32648f.C32656h m96454b(C38785f fVar, boolean z) {
        C38787h hVar = (C38787h) C41358y.m120007W(fVar.mo92439a());
        int i = C37129d.history_item_image;
        BigDecimal a = hVar.mo92449a();
        long c = hVar.mo92451c();
        String b = hVar.mo92450b();
        String d = hVar.mo92452d();
        if (d == null) {
            d = "";
        }
        return new C32648f.C32656h(i, "text.loan.repayments.history.page.last.payment", c, a, b, d, z);
    }

    /* renamed from: c */
    static /* synthetic */ C32648f.C32656h m96455c(C32645c cVar, C38785f fVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return cVar.m96454b(fVar, z);
    }

    /* renamed from: d */
    private final C32648f.C32650b m96456d(C38785f fVar, String str) {
        return new C32648f.C32650b(C37129d.ic_pdf, C32343x.m95408P(fVar.mo92440b().mo92444a(), fVar.mo92440b().mo92445b()), str, "text.loan.repayments.history.page.total.amount", "text.loan.repayments.history.page.download.button");
    }

    /* renamed from: e */
    private final List m96457e(List list) {
        List<C38787h> R = C41358y.m120002R(list, 1);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(R, 10));
        for (C38787h hVar : R) {
            long c = hVar.mo92451c();
            BigDecimal a = hVar.mo92449a();
            String b = hVar.mo92450b();
            String d = hVar.mo92452d();
            if (d == null) {
                d = "";
            }
            arrayList.add(new C32648f.C32657i(c, a, b, d));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (C37603j.m110583f(((C32648f.C32657i) next).mo74256c())) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final List mo74211a(C38785f fVar, String str) {
        C41536l.m120489i(fVar, "result");
        C41536l.m120489i(str, "loanName");
        ArrayList arrayList = new ArrayList();
        if (fVar.mo92439a().isEmpty()) {
            arrayList.add(new C32648f.C32649a("text.loan.repayments.history.empty.state.text", "text.loan.repayments.history.empty.state.description"));
        } else {
            arrayList.add(m96456d(fVar, str));
            if (fVar.mo92439a().size() == 1) {
                arrayList.add(m96454b(fVar, false));
                arrayList.add(C32648f.C32651c.f80372a);
            } else {
                arrayList.add(m96455c(this, fVar, false, 2, (Object) null));
                arrayList.addAll(m96457e(fVar.mo92439a()));
                arrayList.add(C32648f.C32651c.f80372a);
            }
        }
        return arrayList;
    }
}

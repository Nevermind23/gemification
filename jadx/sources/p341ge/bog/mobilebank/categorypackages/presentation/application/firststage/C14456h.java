package p341ge.bog.mobilebank.categorypackages.presentation.application.firststage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.C14446f;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel;
import p455ho.C15547a;
import p455ho.C15549c;
import p567po.C17455a;
import p596rp.C17711b;
import p596rp.C17712c;
import p596rp.C17713d;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.h */
public final class C14456h {

    /* renamed from: a */
    public static final C14456h f42258a = new C14456h();

    private C14456h() {
    }

    /* renamed from: a */
    public final List mo40654a(C17455a aVar) {
        C41536l.m120489i(aVar, "<this>");
        ArrayList arrayList = new ArrayList();
        if (C15549c.m56157c(aVar.mo44954f())) {
            arrayList.add(new C14446f.C14453g("packages.application.I.personal.info.block.header", (String) null, 2, (DefaultConstructorMarker) null));
            if (aVar.mo44954f().contains(C15547a.EMPLOYER)) {
                arrayList.add(new C14446f.C14448b(aVar.mo44950c()));
            }
            if (aVar.mo44954f().contains(C15547a.MOBILE_PHONE)) {
                String e = aVar.mo44952e();
                C41536l.m120486f(e);
                arrayList.add(new C14446f.C14452f(e));
            }
            if (aVar.mo44954f().contains(C15547a.E_MAIL)) {
                if (aVar.mo44948a() != null) {
                    EmailUiModel a = aVar.mo44948a();
                    C41536l.m120486f(a);
                    arrayList.add(new C14446f.C14447a(a.mo40655a()));
                } else {
                    arrayList.add(C14446f.C14449c.f42233a);
                }
            }
        }
        if (aVar.mo44954f().contains(C15547a.FEE_PAYMENT_TYPE) && aVar.mo44951d() != null) {
            C17711b d = aVar.mo44951d();
            C41536l.m120486f(d);
            if (!d.mo45283d().isEmpty()) {
                C17711b d2 = aVar.mo44951d();
                C41536l.m120486f(d2);
                if (d2.mo45283d().size() == 1) {
                    C17711b d3 = aVar.mo44951d();
                    C41536l.m120486f(d3);
                    C17713d dVar = (C17713d) C41358y.m120007W(d3.mo45283d());
                    arrayList.add(new C14446f.C14453g("packages.application.I.payment.type.header", dVar.mo45293c().mo45287b()));
                    arrayList.add(new C14446f.C14451e(dVar));
                } else {
                    arrayList.add(new C14446f.C14453g("packages.application.I.payment.type.header", "packages.application.I.payment.2type.explanatory"));
                    C17711b d4 = aVar.mo44951d();
                    C41536l.m120486f(d4);
                    arrayList.add(new C14446f.C14450d(d4.mo45283d(), (C17712c) null, 2, (DefaultConstructorMarker) null));
                }
            }
        }
        return arrayList;
    }
}

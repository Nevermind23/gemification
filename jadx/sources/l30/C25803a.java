package l30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.C25627a;
import k30.C25628b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.CreditOfferLimitUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.LoanOfferLimitUiModel;
import p852ov.C27086a;
import p852ov.C27087b;
import p852ov.C27091e;
import p962yz.C30124a;

/* renamed from: l30.a */
public final class C25803a {
    /* renamed from: a */
    public final CreditOfferLimitUiModel mo64437a(C27086a aVar) {
        C41536l.m120489i(aVar, "entity");
        return new CreditOfferLimitUiModel(aVar.mo66342d(), aVar.mo66339a(), aVar.mo66341c(), aVar.mo66340b(), aVar.mo66343e(), aVar.mo66345f());
    }

    /* renamed from: b */
    public final LoanOfferLimitUiModel mo64438b(C27087b bVar) {
        C41536l.m120489i(bVar, "entity");
        return new LoanOfferLimitUiModel(bVar.mo66354f(), bVar.mo66350c(), bVar.mo66352e(), bVar.mo66351d(), bVar.mo66355g(), bVar.mo66356h(), bVar.mo66348a(), bVar.mo66349b());
    }

    /* renamed from: c */
    public final C25627a mo64439c(List list, C30124a aVar) {
        C41536l.m120489i(list, "offers");
        C41536l.m120489i(aVar, "status");
        return new C25627a(list, aVar.mo70424b(), aVar.mo70423a(), false, 8, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public final C25628b mo64440d(C27091e eVar) {
        C41536l.m120489i(eVar, "data");
        return new C25628b(eVar.mo66368b(), eVar.mo66367a());
    }

    /* renamed from: e */
    public final List mo64441e(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo64437a((C27086a) it.next()));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List mo64442f(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo64438b((C27087b) it.next()));
        }
        return arrayList;
    }
}

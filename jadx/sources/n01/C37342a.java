package n01;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import m01.C37187a;
import m01.C37188b;
import m01.C37189c;
import m01.C37192f;
import m70.C26150c;
import m70.C26153f;
import m70.C26156i;
import p341ge.bog.mobilebank.products.domain.model.CreditCardAccount;
import xy0.C39948l;

/* renamed from: n01.a */
public final class C37342a {
    /* renamed from: c */
    private final C37188b m110082c(C26150c cVar) {
        String d = cVar.mo65123d();
        String c = cVar.mo65122c();
        Long valueOf = Long.valueOf(cVar.mo65121b());
        String g = cVar.mo65127g();
        String l = cVar.mo65133l();
        List<C26153f> q = cVar.mo65138q();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(q, 10));
        for (C26153f d2 : q) {
            arrayList.add(m110083d(d2));
        }
        return new C37188b(d, c, valueOf, g, l, arrayList);
    }

    /* renamed from: d */
    private final C37189c m110083d(C26153f fVar) {
        return new C37189c(fVar.mo65165a(), fVar.mo65166b(), fVar.mo65167c());
    }

    /* renamed from: e */
    private final C37192f m110084e(CreditCardAccount creditCardAccount) {
        return new C37192f(Long.valueOf(creditCardAccount.mo81941a()), creditCardAccount.mo81942b(), creditCardAccount.mo81949h(), Double.valueOf(creditCardAccount.mo81943d()), creditCardAccount.mo81947f());
    }

    /* renamed from: a */
    public final List mo90424a(C39948l lVar) {
        C41536l.m120489i(lVar, "creditCardsWrapper");
        List<CreditCardAccount> a = lVar.mo93735b().mo93700a();
        if (a == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (CreditCardAccount e : a) {
            arrayList.add(m110084e(e));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C37187a mo90425b(C26156i iVar) {
        C41536l.m120489i(iVar, "accounts");
        List<C26150c> b = iVar.mo65189b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C26150c c : b) {
            arrayList.add(m110082c(c));
        }
        return new C37187a(arrayList);
    }
}

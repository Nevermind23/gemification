package u51;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m70.C26148a;
import p341ge.bog.mobilebank.products.domain.model.CreditCardAccount;
import q51.C38130a;

/* renamed from: u51.a */
public final class C39032a {
    /* renamed from: a */
    public final C38130a mo92693a(CreditCardAccount creditCardAccount, Long l) {
        boolean z;
        C41536l.m120489i(creditCardAccount, "account");
        long a = creditCardAccount.mo81941a();
        String b = creditCardAccount.mo81942b();
        String h = creditCardAccount.mo81949h();
        double d = creditCardAccount.mo81943d();
        String f = creditCardAccount.mo81947f();
        long a2 = creditCardAccount.mo81941a();
        if (l != null && a2 == l.longValue()) {
            z = true;
        } else {
            z = false;
        }
        return new C38130a(a, b, h, d, f, z, false, 64, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final C38130a mo92694b(C26148a aVar, Long l) {
        boolean z;
        C41536l.m120489i(aVar, "account");
        long b = aVar.mo65087b();
        String c = aVar.mo65088c();
        String w = aVar.mo65111w();
        double doubleValue = aVar.mo65093g().doubleValue();
        String h = aVar.mo65094h();
        long b2 = aVar.mo65087b();
        if (l != null && b2 == l.longValue()) {
            z = true;
        } else {
            z = false;
        }
        return new C38130a(b, c, w, doubleValue, h, z, aVar.mo65084F());
    }

    /* renamed from: c */
    public final List mo92695c(List list, Long l) {
        C41536l.m120489i(list, "accounts");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo92694b((C26148a) it.next(), l));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List mo92696d(List list, Long l) {
        C41536l.m120489i(list, "accounts");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo92693a((CreditCardAccount) it.next(), l));
        }
        return arrayList;
    }
}

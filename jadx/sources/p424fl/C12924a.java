package p424fl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37603j;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p563pk.C17375e;
import p669xh.C18763a;

/* renamed from: fl.a */
public final class C12924a {
    /* renamed from: a */
    public final List mo33677a(List list) {
        CreditCardView.C13273e eVar;
        List list2 = list;
        C41536l.m120489i(list2, "cards");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17375e eVar2 = (C17375e) it.next();
            String valueOf = String.valueOf(eVar2.mo44838d());
            String f = eVar2.mo44841f();
            if (f == null) {
                f = eVar2.mo44837c();
            }
            String str = f;
            String valueOf2 = String.valueOf(eVar2.mo44836b());
            String h = eVar2.mo44843h();
            String format = new SimpleDateFormat("MM/yy").format(new Date(eVar2.mo44845i()));
            C41536l.m120488h(format, "SimpleDateFormat(\"MM/yy\"…ormat(Date(card.expDate))");
            C18763a g = C37603j.m110584g(eVar2.mo44837c());
            if (g == null) {
                g = C18763a.VISA;
            }
            C18763a aVar = g;
            String a = eVar2.mo44839e().mo44849a();
            if (eVar2.mo44839e().mo44850b()) {
                eVar = CreditCardView.C13273e.BLACK;
            } else {
                eVar = CreditCardView.C13273e.WHITE;
            }
            CreditCardView.C13270b bVar = r3;
            CreditCardView.C13270b bVar2 = new CreditCardView.C13270b(valueOf, str, valueOf2, h, format, aVar, 0, a, false, false, eVar, (String) null, 2112, (DefaultConstructorMarker) null);
            arrayList.add(bVar);
        }
        return arrayList;
    }
}

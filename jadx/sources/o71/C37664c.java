package o71;

import g91.C32289b0;
import g91.C32343x;
import j71.C36748a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37603j;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p669xh.C18763a;

/* renamed from: o71.c */
public final class C37664c {
    /* renamed from: a */
    public final CreditCardView.C13270b mo90852a(C36748a aVar) {
        CreditCardView.C13273e eVar;
        String f;
        C41536l.m120489i(aVar, "activeCard");
        String valueOf = String.valueOf(aVar.mo89574c());
        String e = aVar.mo89576e();
        if (e == null && ((f = aVar.mo89578f()) == null || (e = C32343x.m95388F(f, new Object[0])) == null)) {
            e = aVar.mo89572a();
        }
        String str = e;
        C18763a g = C37603j.m110584g(aVar.mo89573b());
        if (g == null) {
            g = C18763a.VISA;
        }
        C18763a aVar2 = g;
        String format = new SimpleDateFormat("MM/yy").format(new Date(aVar.mo89579g()));
        String c = C32289b0.m95091c(aVar.mo89575d().mo89604a());
        if (aVar.mo89575d().mo89605b()) {
            eVar = CreditCardView.C13273e.BLACK;
        } else {
            eVar = CreditCardView.C13273e.WHITE;
        }
        String h = aVar.mo89580h();
        C41536l.m120488h(format, "format(Date(activeCard.expDate))");
        return new CreditCardView.C13270b(valueOf, str, (String) null, (String) null, format, aVar2, 0, c, false, false, eVar, h, 332, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final List mo90853b(List list) {
        C41536l.m120489i(list, "activeCards");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90852a((C36748a) it.next()));
        }
        return arrayList;
    }
}

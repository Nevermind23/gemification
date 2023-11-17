package gw0;

import bw0.C31209b;
import g91.C32289b0;
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

/* renamed from: gw0.a */
public final class C36085a {
    /* renamed from: a */
    private final CreditCardView.C13270b m107354a(C31209b bVar) {
        CreditCardView.C13273e eVar;
        String valueOf = String.valueOf(bVar.mo71435d());
        String k = bVar.mo71444k();
        C18763a g = C37603j.m110584g(bVar.mo71439g());
        if (g == null) {
            g = C18763a.VISA;
        }
        C18763a aVar = g;
        String format = new SimpleDateFormat("MM/yy").format(new Date(bVar.mo71442i()));
        String c = C32289b0.m95091c(bVar.mo71436e().mo89541d());
        if (bVar.mo71436e().mo89542e()) {
            eVar = CreditCardView.C13273e.BLACK;
        } else {
            eVar = CreditCardView.C13273e.WHITE;
        }
        CreditCardView.C13273e eVar2 = eVar;
        String valueOf2 = String.valueOf(bVar.mo71434c());
        String h = bVar.mo71440h();
        C41536l.m120488h(format, "format(Date(expDate))");
        return new CreditCardView.C13270b(valueOf, k, valueOf2, h, format, aVar, 0, c, false, false, eVar2, (String) null, 2112, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final List mo88821b(List list) {
        C41536l.m120489i(list, "cards");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m107354a((C31209b) it.next()));
        }
        return arrayList;
    }
}

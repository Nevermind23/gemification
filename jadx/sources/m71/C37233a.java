package m71;

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
import p341ge.bog.mobilebank.transportcard.domain.model.Card;
import p669xh.C18763a;

/* renamed from: m71.a */
public final class C37233a {
    /* renamed from: a */
    public final List mo90311a(List list) {
        CreditCardView.C13273e eVar;
        String f;
        List list2 = list;
        C41536l.m120489i(list2, "activeCards");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C36748a aVar = (C36748a) it.next();
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
            arrayList.add(new CreditCardView.C13270b((String) null, str, (String) null, (String) null, format, aVar2, 0, c, false, false, eVar, h, 77, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo90312b(List list) {
        CreditCardView.C13273e eVar;
        String cardNameDictionaryKey;
        List list2 = list;
        C41536l.m120489i(list2, "cards");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Card card = (Card) it.next();
            String valueOf = String.valueOf(card.getCardId());
            String cardName = card.getCardName();
            if (cardName == null && ((cardNameDictionaryKey = card.getCardNameDictionaryKey()) == null || (cardName = C32343x.m95388F(cardNameDictionaryKey, new Object[0])) == null)) {
                cardName = card.getCardClass();
            }
            String str = cardName;
            String valueOf2 = String.valueOf(card.getAvailableAmount());
            String ccy = card.getCcy();
            String format = new SimpleDateFormat("MM/yy").format(new Date(card.getExpDate()));
            C41536l.m120488h(format, "SimpleDateFormat(\"MM/yy\"…ormat(Date(card.expDate))");
            C18763a g = C37603j.m110584g(card.getCardType());
            if (g == null) {
                g = C18763a.VISA;
            }
            C18763a aVar = g;
            String a = card.getCardImage().mo89609a();
            if (card.getCardImage().mo89610b()) {
                eVar = CreditCardView.C13273e.BLACK;
            } else {
                eVar = CreditCardView.C13273e.WHITE;
            }
            CreditCardView.C13270b bVar = r3;
            CreditCardView.C13270b bVar2 = new CreditCardView.C13270b(valueOf, str, valueOf2, ccy, format, aVar, 0, a, false, false, eVar, (String) null, 2112, (DefaultConstructorMarker) null);
            arrayList.add(bVar);
        }
        return arrayList;
    }
}

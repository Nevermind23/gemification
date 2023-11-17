package p341ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails;

import g91.C32289b0;
import g91.C32343x;
import j71.C36748a;
import j71.C36753f;
import j71.C36758j;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l71.C37101k;
import o31.C37603j;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.mobilebank.transportcard.domain.interactor.PurchasePassUseCase;
import p341ge.bog.mobilebank.transportcard.domain.model.Card;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.C35069b;
import p669xh.C18763a;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.c */
public final class C35073c {
    /* renamed from: a */
    public final C35069b.C35072c mo85951a(C36758j jVar, C36748a aVar, C36753f fVar, Card card, boolean z) {
        String str;
        CreditCardView.C13270b bVar;
        String str2;
        boolean z2;
        String str3;
        CreditCardView.C13273e eVar;
        String f;
        C36748a aVar2 = aVar;
        C36753f fVar2 = fVar;
        C41536l.m120489i(jVar, "passType");
        C41536l.m120489i(aVar2, "selectedActiveCard");
        C41536l.m120489i(fVar2, "passDevice");
        C41536l.m120489i(card, "paymentCard");
        String F = C32343x.m95388F(jVar.mo89641b(), new Object[0]);
        String Q = C32343x.m95410Q(jVar.mo89640a(), "GEL", false, 2, (Object) null);
        C37101k.C37102a aVar3 = C37101k.f89272m;
        boolean z3 = true;
        String str4 = null;
        if (!C41536l.m120484d(aVar2, aVar3.mo90030a())) {
            String e = aVar.mo89576e();
            if (e == null && ((f = aVar.mo89578f()) == null || (e = C32343x.m95388F(f, new Object[0])) == null)) {
                e = aVar.mo89572a();
            }
            String str5 = e;
            C18763a g = C37603j.m110584g(aVar.mo89573b());
            if (g == null) {
                g = C18763a.VISA;
            }
            C18763a aVar4 = g;
            str = Q;
            String format = new SimpleDateFormat("MM/yy").format(new Date(aVar.mo89579g()));
            boolean z4 = !z;
            String c = C32289b0.m95091c(aVar.mo89575d().mo89604a());
            if (aVar.mo89575d().mo89605b()) {
                eVar = CreditCardView.C13273e.BLACK;
            } else {
                eVar = CreditCardView.C13273e.WHITE;
            }
            String h = aVar.mo89580h();
            C41536l.m120488h(format, "format(Date(selectedActiveCard.expDate))");
            bVar = new CreditCardView.C13270b((String) null, str5, (String) null, (String) null, format, aVar4, 0, c, false, z4, eVar, h, 77, (DefaultConstructorMarker) null);
        } else {
            str = Q;
            bVar = null;
        }
        if (!C41536l.m120484d(fVar2, aVar3.mo90031b())) {
            str2 = fVar.mo89615b();
        } else {
            str2 = null;
        }
        if (!C41536l.m120484d(fVar2, aVar3.mo90031b())) {
            z2 = fVar.mo89618e();
        } else {
            z2 = false;
        }
        CreditCardSmallPickerView.C13279b.C13281b bVar2 = new CreditCardSmallPickerView.C13279b.C13281b(card.getCardSmallImage().mo89609a(), (Integer) null, C32343x.m95410Q(card.getAvailableAmount(), card.getCcy(), false, 2, (Object) null), card.isDefault(), (String) null, 16, (DefaultConstructorMarker) null);
        if (C41536l.m120484d(aVar2, aVar3.mo90030a()) || aVar.mo89582i().size() == 1) {
            z3 = false;
        }
        if (!C41536l.m120484d(fVar2, aVar3.mo90031b())) {
            str3 = fVar.mo89614a();
        } else {
            str3 = null;
        }
        if (!C41536l.m120484d(fVar2, aVar3.mo90031b())) {
            str4 = fVar.mo89617d();
        }
        return new C35069b.C35072c(F, str, bVar, str2, z2, bVar2, z3, new PurchasePassUseCase.Param(str3, str4, jVar.mo89643d(), Long.valueOf(card.getAcctKey()), "TCC_PURCHASE_CARD_TRANSIT_PASS", (String) null, (String) null, (String) null, 224, (DefaultConstructorMarker) null));
    }
}

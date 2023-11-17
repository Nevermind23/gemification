package p398dn;

import g91.C32343x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.C14235a;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCurrencyUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResultDetailItem;
import p411em.C12490g;
import p537nm.C17085g0;
import p674xm.C18810l;
import p674xm.C18815q;
import p674xm.C18833r;
import p702zm.C19073b;
import p702zm.C19079d;

/* renamed from: dn.c */
public final class C12329c {

    /* renamed from: a */
    public static final C12329c f36974a = new C12329c();

    private C12329c() {
    }

    /* renamed from: a */
    public final List mo32918a(C14235a aVar, C18833r rVar) {
        String str;
        String str2;
        C17085g0 g0Var;
        C41536l.m120489i(aVar, "resources");
        C41536l.m120489i(rVar, "input");
        DebitCardUiModel d = aVar.mo39882d();
        List c = C41339p.m119898c();
        String F = C32343x.m95388F("applications.card.success.card", new Object[0]);
        String cardNameKey = d.getCardNameKey();
        if (cardNameKey == null || (str = C32343x.m95388F(cardNameKey, new Object[0])) == null) {
            str = d.getSubProductCode();
        }
        c.add(new OrderCardResultDetailItem.DetailItem(F, str));
        String str3 = null;
        if (!aVar.mo39886g().mo39791j() && !aVar.mo39886g().mo39792k()) {
            DebitCardRegTypeUiModel e = rVar.mo46764e().mo46669a();
            if (e != null) {
                g0Var = e.mo39595b();
            } else {
                g0Var = null;
            }
            if (g0Var == C17085g0.EXISTING_ACCOUNT && rVar.mo46763d().mo46669a() != null) {
                String c2 = rVar.mo46763d().mo46669a().mo65088c();
                if (c2 == null) {
                    c2 = rVar.mo46763d().mo46669a().mo65111w();
                }
                c.add(new OrderCardResultDetailItem.DetailItem(C32343x.m95388F("applications.card.success.acct.no", new Object[0]), c2));
            }
        }
        if (!aVar.mo39886g().mo39791j() && !aVar.mo39886g().mo39792k()) {
            String F2 = C32343x.m95388F("applications.card.success.main.ccy", new Object[0]);
            DebitCardCurrencyUiModel c3 = rVar.mo46766f().mo46669a();
            if (c3 == null || (str2 = c3.mo39510a()) == null) {
                str2 = "GEL";
            }
            c.add(new OrderCardResultDetailItem.DetailItem(F2, str2));
        }
        if (!aVar.mo39886g().mo39786f() && rVar.mo46771j().mo46669a() != null) {
            c.add(new OrderCardResultDetailItem.DetailItem(C32343x.m95388F("applications.card.success.name", new Object[0]), rVar.mo46771j().mo46669a()));
        }
        if (aVar.mo39886g().mo39786f()) {
            String F3 = C32343x.m95388F("applications.card.success.pin.receive.method", new Object[0]);
            DebitCardPinDeliveryTypeUiModel e2 = rVar.mo46775n().mo46669a();
            if (e2 != null) {
                str3 = e2.mo39562b();
            }
            c.add(new OrderCardResultDetailItem.DetailItem(F3, C32343x.m95388F(str3, new Object[0])));
            c.add(new OrderCardResultDetailItem.DetailItem(C32343x.m95388F("text.card.applications.pin.delivery.phone", new Object[0]), String.valueOf(rVar.mo46774m().mo46669a())));
        }
        return C41339p.m119896a(c);
    }

    /* renamed from: b */
    public final List mo32919b(C19073b bVar, C19079d dVar) {
        String str;
        C41536l.m120489i(bVar, "resources");
        C41536l.m120489i(dVar, "input");
        DebitCardUiModel a = bVar.mo47258a();
        List c = C41339p.m119898c();
        String F = C32343x.m95388F("applications.card.success.card", new Object[0]);
        String cardNameKey = a.getCardNameKey();
        if (cardNameKey == null || (str = C32343x.m95388F(cardNameKey, new Object[0])) == null) {
            str = a.getSubProductCode();
        }
        c.add(new OrderCardResultDetailItem.DetailItem(F, str));
        c.add(new OrderCardResultDetailItem.DetailItem(C32343x.m95388F("applications.card.success.pin.receive.method", new Object[0]), C32343x.m95388F("plc.pin.delivery.type.sms", new Object[0])));
        c.add(new OrderCardResultDetailItem.DetailItem(C32343x.m95388F("text.card.applications.pin.delivery.phone", new Object[0]), String.valueOf(dVar.mo47285e().mo47275a())));
        return C41339p.m119896a(c);
    }

    /* renamed from: c */
    public final List mo32920c(C14235a aVar, C18833r rVar) {
        String str;
        String str2;
        String str3;
        C18815q.C18832q qVar;
        C41536l.m120489i(aVar, "resources");
        C41536l.m120489i(rVar, "input");
        List c = C41339p.m119898c();
        if (rVar.mo46773l().mo46728e()) {
            String c2 = rVar.mo46777p().mo46669a();
            if (c2 == null) {
                c2 = aVar.mo39891k();
            }
            String c3 = rVar.mo46778q().mo46669a();
            if (c3 == null) {
                c3 = aVar.mo39892l();
            }
            c.add(new OrderCardResultDetailItem.DetailItem(C32343x.m95452h0(C12490g.delivery_receiver, new Object[0]), c2 + " " + c3));
            C12330d dVar = C12330d.f36975a;
            if (dVar.mo32927g(rVar.mo46780s().mo46669a())) {
                str3 = "text.applications.debitcard.delivery.person.phone.other";
            } else {
                str3 = "text.applications.debitcard.delivery.person.phone";
            }
            String F = C32343x.m95388F(str3, new Object[0]);
            if (dVar.mo32927g(rVar.mo46780s().mo46669a())) {
                qVar = rVar.mo46772k();
            } else {
                qVar = rVar.mo46779r();
            }
            c.add(new OrderCardResultDetailItem.DetailItem(F, String.valueOf(qVar.mo46669a())));
            c.add(new OrderCardResultDetailItem.DetailItem(C32343x.m95452h0(C12490g.delivery_receiver_address, new Object[0]), String.valueOf(rVar.mo46767g().mo46669a())));
        }
        if (rVar.mo46773l().mo46728e()) {
            str = "text.applications.debitcard.success.delivery.department";
        } else {
            str = "applications.card.service.center";
        }
        String F2 = C32343x.m95388F(str, new Object[0]);
        C18810l e = rVar.mo46783u().mo46669a();
        String str4 = null;
        if (e != null) {
            str2 = e.mo46647a();
        } else {
            str2 = null;
        }
        c.add(new OrderCardResultDetailItem.DetailItem(F2, String.valueOf(str2)));
        String F3 = C32343x.m95388F("applications.card.success.pin.receive.method", new Object[0]);
        DebitCardPinDeliveryTypeUiModel e2 = rVar.mo46775n().mo46669a();
        if (e2 != null) {
            str4 = e2.mo39562b();
        }
        c.add(new OrderCardResultDetailItem.DetailItem(F3, C32343x.m95388F(str4, new Object[0])));
        c.add(new OrderCardResultDetailItem.DetailItem(C32343x.m95388F("text.card.applications.pin.delivery.phone", new Object[0]), String.valueOf(rVar.mo46774m().mo46669a())));
        return C41339p.m119896a(c);
    }

    /* renamed from: d */
    public final List mo32921d(C19073b bVar, C19079d dVar) {
        C41536l.m120489i(bVar, "resources");
        C41536l.m120489i(dVar, "input");
        List c = C41339p.m119898c();
        String f = bVar.mo47263f();
        String g = bVar.mo47264g();
        String h0 = C32343x.m95452h0(C12490g.delivery_receiver, new Object[0]);
        c.add(new OrderCardResultDetailItem.DetailItem(h0, f + " " + g));
        c.add(new OrderCardResultDetailItem.DetailItem(C32343x.m95388F("text.applications.debitcard.delivery.person.phone", new Object[0]), String.valueOf(dVar.mo47285e().mo47275a())));
        c.add(new OrderCardResultDetailItem.DetailItem(C32343x.m95452h0(C12490g.delivery_receiver_address, new Object[0]), String.valueOf(dVar.mo47284d().mo47275a())));
        return C41339p.m119896a(c);
    }
}

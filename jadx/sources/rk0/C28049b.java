package rk0;

import g11.C32041b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import ok0.C27025a;
import ok0.C27026b;
import ok0.C27028d;
import p341ge.bog.designsystem.components.common.Color;
import p642vh.C18358g;
import pk0.C27551a;
import pk0.C27588d;
import pk0.C27594e;
import z21.C40141a;

/* renamed from: rk0.b */
public final class C28049b {

    /* renamed from: a */
    private final C28047a f71400a;

    public C28049b(C28047a aVar) {
        C41536l.m120489i(aVar, "hubItemTitlesMapper");
        this.f71400a = aVar;
    }

    /* renamed from: b */
    private final Color m86458b(C40141a aVar) {
        if (aVar instanceof C27551a.C27552a.C27562j) {
            return C18358g.m62729c(C27026b.f67850a);
        }
        return C18358g.m62727a(C27025a.f67848b);
    }

    /* renamed from: c */
    private final int m86459c(int i) {
        if (i == C27028d.f67862N) {
            return C27028d.icons_16_card_debit_fill;
        }
        if (i == C27028d.icons_24_card_credit_fill) {
            return C27028d.icons_16_card_credit_fill;
        }
        if (i == C27028d.f67864P) {
            return C27028d.f67876m;
        }
        if (i == C27028d.icons_24_deposit_piggy_bank_fill) {
            return C27028d.icons_16_deposit_piggy_bank_fill;
        }
        if (i == C27028d.f67868X) {
            return C27028d.icons_16_loan_loan_fill;
        }
        if (i == C27028d.f67874i0) {
            return C27028d.icons_16_system_star_fill;
        }
        if (i == C27028d.icons_24_solo) {
            return C27028d.icons_16_solo;
        }
        if (i == C27028d.f67866T) {
            return C27028d.icons_16_general_loyalty;
        }
        if (i == C27028d.f67865S) {
            return C27028d.f67878q;
        }
        if (i == C27028d.icons_24_general_chart) {
            return C27028d.f67877o;
        }
        if (i == C27028d.icons_24_payment_category_transportation) {
            return C27028d.icons_16_payment_category_transportation;
        }
        if (i == C27028d.icons_24_payment) {
            return C27028d.icons_16_payment;
        }
        if (i == C27028d.icons_24_payment_transfer_transfer_other_fill) {
            return C27028d.icons_16_payment_transfer_transfer_other_fill;
        }
        if (i == C27028d.f67870a0) {
            return C27028d.icons_16_payment_transfer_automatic;
        }
        if (i == C27028d.icons_24_payment_transfer_money_transfer) {
            return C27028d.f67859B;
        }
        if (i == C27028d.icons_24_payment_transfer_money_request) {
            return C27028d.icons_16_payment_transfer_money_request;
        }
        if (i == C27028d.icons_24_payment_transfer_bill_split) {
            return C27028d.icons_16_payment_transfer_bill_split;
        }
        if (i == C27028d.icons_24_general_pfm_fill) {
            return C27028d.icons_16_general_pfm_fill;
        }
        if (i == C27028d.icons_24_general_offer_fill) {
            return C27028d.icons_16_general_offer_fill;
        }
        if (i == C27028d.f67863O) {
            return C27028d.icons_16_contacts_pin;
        }
        if (i == C27028d.icons_24_payment_transfer_conversion) {
            return C27028d.icons_16_payment_transfer_conversion;
        }
        if (i == C27028d.icon_bog_business) {
            return C27028d.icon_bog_business_circle;
        }
        if (i == C27028d.icon_bog_scool) {
            return C27028d.f67873i;
        }
        if (i == C27028d.icon_bog_pay) {
            return C27028d.icon_bog_pay_circle;
        }
        return i;
    }

    /* renamed from: d */
    private final Color m86460d(Color color) {
        if (color != null) {
            return C18358g.m62729c(C27026b.f67851b);
        }
        return null;
    }

    /* renamed from: e */
    private final C27588d.C27591c.C27593b m86461e(C40141a aVar) {
        return new C27588d.C27591c.C27593b(aVar.mo66932d(), m86459c(aVar.mo66931b()), m86460d(aVar.mo66930a()), aVar, m86458b(aVar));
    }

    /* renamed from: f */
    private final C27588d.C27591c m86462f(C40141a aVar) {
        if (aVar instanceof C27551a) {
            return m86461e(aVar);
        }
        if (aVar instanceof C32041b) {
            return m86461e(aVar);
        }
        if (aVar instanceof C27594e.C27597b.C27598a) {
            return m86461e(aVar);
        }
        if (aVar instanceof C27594e.C27595a.C27596a) {
            return new C27588d.C27591c.C27592a(aVar.mo66932d(), aVar.mo66931b(), aVar.mo66930a(), ((C27594e.C27595a.C27596a) aVar).mo66966e());
        }
        throw new IllegalStateException("Unsupported item");
    }

    /* renamed from: a */
    public final List mo67594a(List list) {
        C41536l.m120489i(list, "hubItems");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            Class<? super Object> superclass = ((C40141a) next).getClass().getSuperclass();
            Object obj = linkedHashMap.get(superclass);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(superclass, obj);
            }
            ((List) obj).add(next);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Class cls = (Class) entry.getKey();
            List<C40141a> list2 = (List) entry.getValue();
            C28047a aVar = this.f71400a;
            C41536l.m120488h(cls, "clazz");
            arrayList.add(new C27588d.C27590b(aVar.mo67591a(cls)));
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list2, 10));
            for (C40141a f : list2) {
                arrayList2.add(Boolean.valueOf(arrayList.add(m86462f(f))));
            }
            arrayList.add(C27588d.C27589a.f70513a);
        }
        return arrayList;
    }
}

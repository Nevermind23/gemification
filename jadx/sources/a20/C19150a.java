package a20;

import hd0.C24978b;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditOfferRefinanceEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.ProductSourceEntity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditCardOfferDetailsUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferDecisionUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferRefinanceUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferUiModel;
import p913uu.C28937c;
import p913uu.C28939e;
import p913uu.C28940f;
import p913uu.C28941g;
import p913uu.C28942h;
import p913uu.C28944i;

/* renamed from: a20.a */
public final class C19150a {
    /* renamed from: a */
    public final CreditOfferRefinanceEntity mo47350a(CreditOfferRefinanceUiModel creditOfferRefinanceUiModel) {
        ProductSourceEntity productSourceEntity;
        YesNoApiEntity yesNoApiEntity;
        String name;
        C41536l.m120489i(creditOfferRefinanceUiModel, "refinanceInfo");
        C28944i t = creditOfferRefinanceUiModel.mo54093t();
        if (t == null || (name = t.name()) == null) {
            productSourceEntity = null;
        } else {
            productSourceEntity = ProductSourceEntity.valueOf(name);
        }
        ProductSourceEntity productSourceEntity2 = productSourceEntity;
        String h = creditOfferRefinanceUiModel.mo54082h();
        String m = creditOfferRefinanceUiModel.mo54088m();
        String k = creditOfferRefinanceUiModel.mo54086k();
        String p = creditOfferRefinanceUiModel.mo54089p();
        String l = creditOfferRefinanceUiModel.mo54087l();
        String f = creditOfferRefinanceUiModel.mo54080f();
        String d = creditOfferRefinanceUiModel.mo54076d();
        String e = creditOfferRefinanceUiModel.mo54078e();
        String i = creditOfferRefinanceUiModel.mo54084i();
        String r = creditOfferRefinanceUiModel.mo54091r();
        YesNoApiEntity valueOf = YesNoApiEntity.valueOf(creditOfferRefinanceUiModel.mo54092s().name());
        String g = creditOfferRefinanceUiModel.mo54081g();
        String u = creditOfferRefinanceUiModel.mo54095u();
        String q = creditOfferRefinanceUiModel.mo54090q();
        String j = creditOfferRefinanceUiModel.mo54085j();
        if (creditOfferRefinanceUiModel.mo54097w()) {
            yesNoApiEntity = YesNoApiEntity.YES;
        } else {
            yesNoApiEntity = YesNoApiEntity.NO;
        }
        return new CreditOfferRefinanceEntity(productSourceEntity2, h, m, k, p, l, f, d, e, i, r, valueOf, g, u, q, j, yesNoApiEntity, creditOfferRefinanceUiModel.mo54099x());
    }

    /* renamed from: b */
    public final CreditCardOfferDetailsUiModel mo47351b(C28937c cVar) {
        C41536l.m120489i(cVar, "creditCardOfferDetails");
        String o = cVar.mo68724o();
        String f = cVar.mo68714f();
        Double E = cVar.mo68704E();
        String D = cVar.mo68703D();
        Double w = cVar.mo68733w();
        String a = cVar.mo68708a();
        Double B = cVar.mo68701B();
        BigDecimal H = cVar.mo68707H();
        Long j = cVar.mo68719j();
        C41536l.m120486f(j);
        long longValue = j.longValue();
        String s = cVar.mo68728s();
        String k = cVar.mo68720k();
        String str = k;
        C41536l.m120486f(k);
        String c = cVar.mo68710c();
        String str2 = c;
        C41536l.m120486f(c);
        BigDecimal e = cVar.mo68712e();
        BigDecimal bigDecimal = e;
        C41536l.m120486f(e);
        Double r = cVar.mo68727r();
        Double F = cVar.mo68705F();
        String g = cVar.mo68715g();
        String str3 = g;
        C41536l.m120486f(g);
        String b = cVar.mo68709b();
        String str4 = b;
        C41536l.m120486f(b);
        String x = cVar.mo68734x();
        String i = cVar.mo68718i();
        String n = cVar.mo68723n();
        String G = cVar.mo68706G();
        String str5 = G;
        C41536l.m120486f(G);
        String q = cVar.mo68726q();
        String z = cVar.mo68736z();
        String p = cVar.mo68725p();
        String v = cVar.mo68732v();
        Integer C = cVar.mo68702C();
        String y = cVar.mo68735y();
        String A = cVar.mo68700A();
        BigDecimal l = cVar.mo68721l();
        BigDecimal m = cVar.mo68722m();
        String d = cVar.mo68711d();
        String h = cVar.mo68716h();
        String t = cVar.mo68729t();
        C41536l.m120486f(t);
        String u = cVar.mo68731u();
        C41536l.m120486f(u);
        return new CreditCardOfferDetailsUiModel(o, f, E, D, w, a, B, H, longValue, s, str, str2, bigDecimal, r, F, str3, str4, x, i, n, str5, q, z, p, v, C, y, A, l, m, d, h, t, u);
    }

    /* renamed from: c */
    public final CreditOfferDecisionUiModel mo47352c(C28940f fVar, C28942h hVar, OfferProductCode offerProductCode) {
        ArrayList arrayList;
        C41536l.m120489i(fVar, "creditOfferDecision");
        C41536l.m120489i(hVar, "operationType");
        C41536l.m120489i(offerProductCode, "limitCategory");
        C28939e c = fVar.mo68768c();
        C41536l.m120486f(c);
        CreditOfferUiModel e = mo47354e(c, hVar, offerProductCode);
        ArrayList<C28941g> e2 = fVar.mo68770e();
        if (e2 != null) {
            arrayList = new ArrayList(C41343r.m119925u(e2, 10));
            for (C28941g d : e2) {
                arrayList.add(mo47353d(d));
            }
        } else {
            arrayList = null;
        }
        C28937c d2 = fVar.mo68769d();
        C41536l.m120486f(d2);
        return new CreditOfferDecisionUiModel(e, arrayList, mo47351b(d2), fVar.mo68772f());
    }

    /* renamed from: d */
    public final CreditOfferRefinanceUiModel mo47353d(C28941g gVar) {
        boolean z;
        boolean z2;
        C41536l.m120489i(gVar, "refinanceInfo");
        C24978b n = gVar.mo68790n();
        C24978b bVar = C24978b.YES;
        if (n == bVar) {
            z = true;
        } else {
            z = false;
        }
        C28944i o = gVar.mo68791o();
        String e = gVar.mo68779e();
        String j = gVar.mo68786j();
        String h = gVar.mo68783h();
        String k = gVar.mo68787k();
        String i = gVar.mo68785i();
        String c = gVar.mo68777c();
        String a = gVar.mo68775a();
        String b = gVar.mo68776b();
        String f = gVar.mo68781f();
        String m = gVar.mo68789m();
        C24978b n2 = gVar.mo68790n();
        String d = gVar.mo68778d();
        String p = gVar.mo68792p();
        String l = gVar.mo68788l();
        String g = gVar.mo68782g();
        if (gVar.mo68793q() == bVar) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new CreditOfferRefinanceUiModel(o, e, j, h, k, i, c, a, b, f, m, n2, d, p, l, g, z2, gVar.mo68794r(), z);
    }

    /* renamed from: e */
    public final CreditOfferUiModel mo47354e(C28939e eVar, C28942h hVar, OfferProductCode offerProductCode) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        C28942h hVar2 = hVar;
        OfferProductCode offerProductCode2 = offerProductCode;
        C41536l.m120489i(eVar, "creditOffer");
        C41536l.m120489i(hVar2, "operationType");
        C41536l.m120489i(offerProductCode2, "limitCategory");
        if (!C41536l.m120484d(offerProductCode2, OfferProductCode.C21010EC.f56472f) || hVar2 != C28942h.NEW_CREDIT_CARD) {
            bigDecimal = new BigDecimal(eVar.mo68752d());
        } else {
            bigDecimal = new BigDecimal(eVar.mo68760j());
        }
        BigDecimal bigDecimal4 = bigDecimal;
        if (C41341q.m119910m(C28942h.INCREASE_CREDIT_CARD_LIMIT, C28942h.INCREASE_CREDIT_CARD_LIMIT_WITH_REFINANCE).contains(hVar2)) {
            String i = eVar.mo68759i();
            if (i != null) {
                bigDecimal2 = new BigDecimal(i);
                String e = eVar.mo68753e();
                String f = eVar.mo68755f();
                String a = eVar.mo68749a();
                String h = eVar.mo68757h();
                String n = eVar.mo68764n();
                String m = eVar.mo68763m();
                String g = eVar.mo68756g();
                String o = eVar.mo68765o();
                String l = eVar.mo68762l();
                String b = eVar.mo68750b();
                String c = eVar.mo68751c();
                C41536l.m120488h(bigDecimal2, "minLimit");
                return new CreditOfferUiModel(e, f, a, h, n, m, g, o, l, b, c, bigDecimal2, bigDecimal4);
            }
            bigDecimal3 = BigDecimal.ZERO;
        } else {
            bigDecimal3 = new BigDecimal(eVar.mo68761k());
        }
        bigDecimal2 = bigDecimal3;
        String e2 = eVar.mo68753e();
        String f2 = eVar.mo68755f();
        String a2 = eVar.mo68749a();
        String h2 = eVar.mo68757h();
        String n2 = eVar.mo68764n();
        String m2 = eVar.mo68763m();
        String g2 = eVar.mo68756g();
        String o2 = eVar.mo68765o();
        String l2 = eVar.mo68762l();
        String b2 = eVar.mo68750b();
        String c2 = eVar.mo68751c();
        C41536l.m120488h(bigDecimal2, "minLimit");
        return new CreditOfferUiModel(e2, f2, a2, h2, n2, m2, g2, o2, l2, b2, c2, bigDecimal2, bigDecimal4);
    }
}

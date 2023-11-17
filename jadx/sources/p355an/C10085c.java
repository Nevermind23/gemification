package p355an;

import b60.C19337a;
import c21.C31260a;
import g21.C32053a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cardapplications.presentation.model.C14235a;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardNicknameUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.insurance.DebitCardInsuranceInfoUiModel;
import p537nm.C17098o;
import p537nm.C17101r;
import p537nm.C17103t;
import p537nm.C17104u;
import p537nm.C17107x;
import p537nm.C17108y;
import p579qm.C17539c;

/* renamed from: an.c */
public final class C10085c {

    /* renamed from: a */
    private final C10088f f27850a;

    /* renamed from: b */
    private final C10093k f27851b;

    /* renamed from: c */
    private final C10095m f27852c;

    /* renamed from: d */
    private final C10098p f27853d;

    /* renamed from: e */
    private final C10084b f27854e;

    /* renamed from: f */
    private final C10103t f27855f;

    /* renamed from: g */
    private final C10094l f27856g;

    /* renamed from: h */
    private final C10096n f27857h;

    /* renamed from: i */
    private final C10097o f27858i;

    /* renamed from: j */
    private final C10090h f27859j;

    /* renamed from: k */
    private final C19337a f27860k;

    /* renamed from: l */
    private final C10087e f27861l;

    /* renamed from: m */
    private final C10091i f27862m;

    /* renamed from: n */
    private final C10092j f27863n;

    /* renamed from: o */
    private final C32053a f27864o;

    public C10085c(C10088f fVar, C10093k kVar, C10095m mVar, C10098p pVar, C10084b bVar, C10103t tVar, C10094l lVar, C10096n nVar, C10097o oVar, C10090h hVar, C19337a aVar, C10087e eVar, C10091i iVar, C10092j jVar, C32053a aVar2) {
        C10088f fVar2 = fVar;
        C10093k kVar2 = kVar;
        C10095m mVar2 = mVar;
        C10098p pVar2 = pVar;
        C10084b bVar2 = bVar;
        C10103t tVar2 = tVar;
        C10094l lVar2 = lVar;
        C10096n nVar2 = nVar;
        C10097o oVar2 = oVar;
        C10090h hVar2 = hVar;
        C19337a aVar3 = aVar;
        C10087e eVar2 = eVar;
        C10091i iVar2 = iVar;
        C10092j jVar2 = jVar;
        C32053a aVar4 = aVar2;
        C41536l.m120489i(fVar2, "currencyMapper");
        C41536l.m120489i(kVar2, "nicknameMapper");
        C41536l.m120489i(mVar2, "pinDeliveryMapper");
        C41536l.m120489i(pVar2, "regTypeMapper");
        C41536l.m120489i(bVar2, "appAccountMapper");
        C41536l.m120489i(tVar2, "debitCardTypeMapper");
        C41536l.m120489i(lVar2, "debitCardOrderTypeMapper");
        C41536l.m120489i(nVar2, "receiveTypeMapper");
        C41536l.m120489i(oVar2, "recipientTypeMapper");
        C41536l.m120489i(hVar2, "deliveryAddressUiMapper");
        C41536l.m120489i(aVar3, "serviceCentersMapper");
        C41536l.m120489i(eVar2, "csDefaultDepartmentsMapper");
        C41536l.m120489i(iVar2, "insuranceMapper");
        C41536l.m120489i(jVar2, "debitCardMapper");
        C41536l.m120489i(aVar4, "instantCardsUiMapper");
        this.f27850a = fVar2;
        this.f27851b = kVar2;
        this.f27852c = mVar2;
        this.f27853d = pVar2;
        this.f27854e = bVar2;
        this.f27855f = tVar2;
        this.f27856g = lVar2;
        this.f27857h = nVar2;
        this.f27858i = oVar2;
        this.f27859j = hVar2;
        this.f27860k = aVar3;
        this.f27861l = eVar2;
        this.f27862m = iVar2;
        this.f27863n = jVar2;
        this.f27864o = aVar4;
    }

    /* renamed from: a */
    public final C14235a mo26544a(C17539c cVar, OrderDebitCardData orderDebitCardData) {
        DebitCardNicknameUiModel debitCardNicknameUiModel;
        C41536l.m120489i(cVar, "orderDebitCardResources");
        C41536l.m120489i(orderDebitCardData, "appData");
        Map a = this.f27861l.mo26546a(cVar.mo45072h()).mo39474a();
        List<C17108y> s = cVar.mo45084s();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(s, 10));
        for (C17108y a2 : s) {
            arrayList.add(this.f27853d.mo26573a(a2));
        }
        List<C17098o> e = cVar.mo45068e();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(e, 10));
        for (C17098o a3 : e) {
            arrayList2.add(this.f27854e.mo26543a(a3));
        }
        List c = cVar.mo45066c();
        List<C17101r> i = cVar.mo45074i();
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(i, 10));
        for (C17101r a4 : i) {
            arrayList3.add(this.f27850a.mo26547a(a4));
        }
        List<C17107x> p = cVar.mo45081p();
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(p, 10));
        for (C17107x a5 : p) {
            arrayList4.add(this.f27852c.mo26570a(a5));
        }
        C17104u f = cVar.mo45070f();
        if (f != null) {
            debitCardNicknameUiModel = this.f27851b.mo26568a(f);
        } else {
            debitCardNicknameUiModel = null;
        }
        DebitCardNicknameUiModel debitCardNicknameUiModel2 = debitCardNicknameUiModel;
        List b = this.f27860k.mo47539b(cVar.mo45071g());
        List a6 = this.f27855f.mo26580a(cVar.mo45076k());
        List a7 = this.f27856g.mo26569a(cVar.mo45075j());
        List a8 = this.f27857h.mo26571a(cVar.mo45082q());
        List a9 = this.f27858i.mo26572a(cVar.mo45083r());
        List a12 = this.f27859j.mo26551a(cVar.mo45077l(), a);
        List o = cVar.mo45080o();
        DebitCardInsuranceInfoUiModel b2 = this.f27862m.mo26553b(cVar.mo45078m());
        DebitCardUiModel e2 = this.f27863n.mo26559e(cVar.mo45067d());
        List<C31260a> t = cVar.mo45085t();
        C32053a aVar = this.f27864o;
        ArrayList arrayList5 = new ArrayList(C41343r.m119925u(t, 10));
        for (C31260a a13 : t) {
            arrayList5.add(aVar.mo72551a(a13));
        }
        return new C14235a(arrayList, arrayList2, c, arrayList3, arrayList4, debitCardNicknameUiModel2, b, a6, a7, a8, a9, a12, o, b2, e2, (C17103t) null, arrayList5, orderDebitCardData, (String) null, (String) null, cVar.mo45079n(), 819200, (DefaultConstructorMarker) null);
    }
}

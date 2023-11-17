package p355an;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardBenefitUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardSmallImageUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardSubTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTextContainerUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardInfoUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;
import p537nm.C17078d0;
import p537nm.C17080e;
import p537nm.C17083f0;
import p537nm.C17084g;
import p537nm.C17086h;
import p537nm.C17087h0;
import p537nm.C17090i0;
import p537nm.C17093j0;
import p537nm.C17094k;
import p537nm.C17095l;
import p537nm.C17097n;
import p537nm.C17106w;

/* renamed from: an.j */
public final class C10092j {

    /* renamed from: a */
    private final C10101r f27865a;

    public C10092j(C10101r rVar) {
        C41536l.m120489i(rVar, "debitCardTextContainerMapper");
        this.f27865a = rVar;
    }

    /* renamed from: a */
    public final CardBenefitUiModel mo26555a(C17080e eVar) {
        C41536l.m120489i(eVar, "entity");
        return new CardBenefitUiModel(eVar.mo44302a(), eVar.mo44305d(), eVar.mo44304c(), eVar.mo44306e(), eVar.mo44303b());
    }

    /* renamed from: b */
    public final CardSmallImageUiModel mo26556b(C17094k kVar) {
        C41536l.m120489i(kVar, "cardSmallImage");
        return new CardSmallImageUiModel(kVar.mo44391b(), kVar.mo44390a());
    }

    /* renamed from: c */
    public final CardSubTypeUiModel mo26557c(C17095l lVar) {
        C41536l.m120489i(lVar, "cardSubType");
        return new CardSubTypeUiModel(lVar.mo44397c(), lVar.mo44399e(), lVar.mo44396b(), lVar.mo44398d(), lVar.mo44395a());
    }

    /* renamed from: d */
    public final DebitCardPayrollInfoUiModel mo26558d(C17106w wVar) {
        C41536l.m120489i(wVar, "debitCardPayrollInfo");
        return new DebitCardPayrollInfoUiModel(wVar.mo44502b(), wVar.mo44504d(), wVar.mo44503c(), wVar.mo44501a(), wVar.mo44505e());
    }

    /* renamed from: e */
    public final DebitCardUiModel mo26559e(C17097n nVar) {
        String str;
        boolean z;
        ArrayList arrayList;
        CardSmallImageUiModel cardSmallImageUiModel;
        C41536l.m120489i(nVar, "debitCard");
        String D = nVar.mo44411D();
        String F = nVar.mo44413F();
        String L = nVar.mo44419L();
        String N = nVar.mo44421N();
        String d = nVar.mo44425d();
        String G = nVar.mo44414G();
        String H = nVar.mo44415H();
        long A = nVar.mo44408A();
        String r = nVar.mo44441r();
        String J = nVar.mo44417J();
        String C = nVar.mo44410C();
        boolean O = nVar.mo44422O();
        String i = nVar.mo44432i();
        String c = nVar.mo44424c();
        String g = nVar.mo44429g();
        String k = nVar.mo44434k();
        String y = nVar.mo44449y();
        String M = nVar.mo44420M();
        String B = nVar.mo44409B();
        String v = nVar.mo44446v();
        String w = nVar.mo44447w();
        String x = nVar.mo44448x();
        String l = nVar.mo44435l();
        DebitCardTextContainerUiModel a = this.f27865a.mo26578a(nVar.mo44418K());
        List<C17095l> n = nVar.mo44437n();
        if (n != null) {
            z = O;
            str = C;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(n, 10));
            for (C17095l c2 : n) {
                arrayList2.add(mo26557c(c2));
            }
            arrayList = arrayList2;
        } else {
            str = C;
            z = O;
            arrayList = null;
        }
        boolean q = nVar.mo44440q();
        List<C17106w> p = nVar.mo44439p();
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(p, 10));
        for (C17106w d2 : p) {
            arrayList4.add(mo26558d(d2));
        }
        String j = nVar.mo44433j();
        boolean E = nVar.mo44412E();
        List<C17093j0> o = nVar.mo44438o();
        String str2 = j;
        ArrayList arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(C41343r.m119925u(o, 10));
        for (C17093j0 i2 : o) {
            arrayList6.add(mo26563i(i2));
        }
        String h = nVar.mo44430h();
        C17094k m = nVar.mo44436m();
        if (m != null) {
            cardSmallImageUiModel = mo26556b(m);
        } else {
            cardSmallImageUiModel = null;
        }
        C17078d0 s = nVar.mo44442s();
        String I = nVar.mo44416I();
        String u = nVar.mo44445u();
        List e = nVar.mo44426e();
        String t = nVar.mo44443t();
        boolean z2 = nVar.mo44450z();
        List<C17080e> f = nVar.mo44428f();
        ArrayList arrayList7 = new ArrayList(C41343r.m119925u(f, 10));
        for (C17080e a2 : f) {
            arrayList7.add(mo26555a(a2));
        }
        ArrayList arrayList8 = arrayList7;
        return new DebitCardUiModel(D, F, L, N, d, G, H, A, r, J, str, z, i, c, g, k, y, M, B, v, w, x, l, a, arrayList3, q, arrayList5, str2, E, arrayList6, h, cardSmallImageUiModel, s, I, u, z2, t, e, arrayList8);
    }

    /* renamed from: f */
    public final RecoverCardUiModel mo26560f(C17083f0 f0Var) {
        CardExternalFile cardExternalFile;
        CardExternalFile cardExternalFile2;
        C41536l.m120489i(f0Var, "recoverCard");
        long f = f0Var.mo44324f();
        long a = f0Var.mo44318a();
        long k = f0Var.mo44330k();
        String b = f0Var.mo44319b();
        String c = f0Var.mo44320c();
        String i = f0Var.mo44328i();
        String h = f0Var.mo44326h();
        String t = f0Var.mo44339t();
        String v = f0Var.mo44342v();
        String e = f0Var.mo44322e();
        Date l = f0Var.mo44331l();
        String j = f0Var.mo44329j();
        boolean x = f0Var.mo44344x();
        String s = f0Var.mo44338s();
        String g = f0Var.mo44325g();
        boolean m = f0Var.mo44332m();
        boolean u = f0Var.mo44341u();
        Long r = f0Var.mo44337r();
        String p = f0Var.mo44335p();
        String q = f0Var.mo44336q();
        C17086h n = f0Var.mo44333n();
        if (n != null) {
            cardExternalFile = mo26566l(n);
        } else {
            cardExternalFile = null;
        }
        C17086h d = f0Var.mo44321d();
        if (d != null) {
            cardExternalFile2 = mo26566l(d);
        } else {
            cardExternalFile2 = null;
        }
        return new RecoverCardUiModel(f, a, k, b, c, i, h, t, v, e, l, j, x, s, g, m, u, r, p, q, f0Var.mo44334o(), cardExternalFile, cardExternalFile2, f0Var.mo44343w());
    }

    /* renamed from: g */
    public final RegionUiModel mo26561g(C17087h0 h0Var) {
        C41536l.m120489i(h0Var, "region");
        return new RegionUiModel(h0Var.mo44358b(), h0Var.mo44359c(), h0Var.mo44357a());
    }

    /* renamed from: h */
    public final ScoolCardInfoUiModel mo26562h(C17090i0 i0Var) {
        C41536l.m120489i(i0Var, "scoolCardInfo");
        return new ScoolCardInfoUiModel(i0Var.mo44369e(), i0Var.mo44371f(), i0Var.mo44376j(), i0Var.mo44372g(), i0Var.mo44368d(), i0Var.mo44375i(), i0Var.mo44365a(), i0Var.mo44367c(), i0Var.mo44366b(), i0Var.mo44373h());
    }

    /* renamed from: i */
    public final ScoolCardOwnerUiModel mo26563i(C17093j0 j0Var) {
        C41536l.m120489i(j0Var, "scoolCardOwner");
        return new ScoolCardOwnerUiModel(j0Var.mo44381b(), j0Var.mo44382c(), j0Var.mo44384e(), j0Var.mo44383d(), j0Var.mo44386f(), j0Var.mo44380a(), j0Var.mo44387g());
    }

    /* renamed from: j */
    public final CardDailyLimitUiModel mo26564j(C17084g gVar) {
        C41536l.m120489i(gVar, "entity");
        return new CardDailyLimitUiModel(gVar.mo44346b(), gVar.mo44348d(), gVar.mo44345a(), gVar.mo44347c(), gVar.mo44349e());
    }

    /* renamed from: k */
    public final List mo26565k(List list) {
        C41536l.m120489i(list, "limits");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo26564j((C17084g) it.next()));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final CardExternalFile mo26566l(C17086h hVar) {
        C41536l.m120489i(hVar, "cardExternalFile");
        return new CardExternalFile(hVar.mo44354a(), hVar.mo44356c(), hVar.mo44355b());
    }

    /* renamed from: m */
    public final List mo26567m(List list) {
        C41536l.m120489i(list, "recoverCard");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo26560f((C17083f0) it.next()));
        }
        return arrayList;
    }
}

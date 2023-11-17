package p961yy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAccountUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusDepositAccountUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.CasTotalUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.PrloTicketUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.PrloTicketWrapperUiModel;
import p906ty.C28523a;
import p906ty.C28524b;
import p906ty.C28525c;
import p906ty.C28526d;
import p906ty.C28527e;
import p906ty.C28528f;
import p906ty.C28529g;
import p906ty.C28530h;
import p906ty.C28531i;
import p917uy.C28951a;
import p917uy.C28952b;
import p917uy.C28953c;

/* renamed from: yy.a */
public final class C30123a {
    /* renamed from: a */
    public final BonusAccountUiModel mo70410a(C28523a aVar) {
        C41536l.m120489i(aVar, "bonusAccount");
        return new BonusAccountUiModel(aVar.mo68135a(), aVar.mo68136b(), aVar.mo68138d(), aVar.mo68139e(), aVar.mo68137c());
    }

    /* renamed from: b */
    public final BonusAmexUiModel mo70411b(C28524b bVar) {
        C41536l.m120489i(bVar, "bonusAmex");
        return new BonusAmexUiModel(bVar.mo68147e(), bVar.mo68145c(), bVar.mo68149f(), bVar.mo68144b(), bVar.mo68146d(), bVar.mo68143a());
    }

    /* renamed from: c */
    public final BonusCasServiceUiModel mo70412c(C28525c cVar) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        C41536l.m120489i(cVar, "bonusCasService");
        Long i = cVar.mo68162i();
        Long h = cVar.mo68160h();
        String p = cVar.mo68169p();
        Long r = cVar.mo68171r();
        Double s = cVar.mo68172s();
        String q = cVar.mo68170q();
        Long d = cVar.mo68155d();
        String f = cVar.mo68158f();
        String t = cVar.mo68173t();
        String n = cVar.mo68167n();
        String e = cVar.mo68156e();
        String o = cVar.mo68168o();
        String c = cVar.mo68154c();
        Double u = cVar.mo68175u();
        Double b = cVar.mo68153b();
        String g = cVar.mo68159g();
        List<C28523a> a = cVar.mo68152a();
        if (a != null) {
            str = o;
            arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (C28523a a2 : a) {
                arrayList.add(mo70410a(a2));
            }
        } else {
            str = o;
            arrayList = null;
        }
        List<C28527e> k = cVar.mo68164k();
        if (k != null) {
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(k, 10));
            for (C28527e e2 : k) {
                arrayList3.add(mo70414e(e2));
            }
            arrayList2 = arrayList3;
        } else {
            arrayList2 = null;
        }
        return new BonusCasServiceUiModel(i, h, p, r, s, q, d, f, t, n, e, str, c, u, b, g, arrayList, arrayList2, cVar.mo68163j(), cVar.mo68165l(), cVar.mo68166m());
    }

    /* renamed from: d */
    public final BonusCashBackUiModel mo70413d(C28526d dVar) {
        C41536l.m120489i(dVar, "bonusCashBack");
        return new BonusCashBackUiModel(dVar.mo68186i(), Long.valueOf(dVar.mo68184h()), Long.valueOf(dVar.mo68188k()), dVar.mo68180e(), dVar.mo68182f(), dVar.mo68179d(), dVar.mo68178c(), dVar.mo68187j(), dVar.mo68176a(), dVar.mo68177b(), dVar.mo68183g());
    }

    /* renamed from: e */
    public final BonusDepositAccountUiModel mo70414e(C28527e eVar) {
        C41536l.m120489i(eVar, "bonusDepositAccount");
        return new BonusDepositAccountUiModel(eVar.mo68200i(), eVar.mo68198h(), eVar.mo68196f(), eVar.mo68194e(), eVar.mo68191b(), eVar.mo68203l(), eVar.mo68192c(), eVar.mo68190a(), eVar.mo68201j(), eVar.mo68193d(), eVar.mo68202k(), eVar.mo68197g());
    }

    /* renamed from: f */
    public final BonusPlusUiModel mo70415f(C28528f fVar) {
        C41536l.m120489i(fVar, "bonusPlus");
        return new BonusPlusUiModel(fVar.mo68217k(), fVar.mo68207c(), fVar.mo68218l(), fVar.mo68206b(), fVar.mo68216j(), fVar.mo68211f(), fVar.mo68212g(), fVar.mo68215i(), fVar.mo68213h(), fVar.mo68209e(), fVar.mo68208d(), fVar.mo68205a());
    }

    /* renamed from: g */
    public final BonusScoolUiModel mo70416g(C28529g gVar) {
        C41536l.m120489i(gVar, "bonusScool");
        return new BonusScoolUiModel(gVar.mo68222c(), gVar.mo68220a(), gVar.mo68224e(), gVar.mo68232k(), gVar.mo68223d(), gVar.mo68231j(), gVar.mo68233l(), gVar.mo68221b(), gVar.mo68227g(), gVar.mo68228h(), gVar.mo68230i(), gVar.mo68226f());
    }

    /* renamed from: h */
    public final BonusWrapperUiModel mo70417h(C28530h hVar) {
        BonusAmexUiModel bonusAmexUiModel;
        BonusPlusUiModel bonusPlusUiModel;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C41536l.m120489i(hVar, "bonusWrapper");
        C28524b a = hVar.mo68235a();
        BonusPrloUiModel bonusPrloUiModel = null;
        if (a != null) {
            bonusAmexUiModel = mo70411b(a);
        } else {
            bonusAmexUiModel = null;
        }
        C28528f e = hVar.mo68239e();
        if (e != null) {
            bonusPlusUiModel = mo70415f(e);
        } else {
            bonusPlusUiModel = null;
        }
        List<C28526d> d = hVar.mo68238d();
        if (d != null) {
            arrayList = new ArrayList(C41343r.m119925u(d, 10));
            for (C28526d d2 : d) {
                arrayList.add(mo70413d(d2));
            }
        } else {
            arrayList = null;
        }
        List<C28525c> b = hVar.mo68236b();
        if (b != null) {
            arrayList2 = new ArrayList(C41343r.m119925u(b, 10));
            for (C28525c c : b) {
                arrayList2.add(mo70412c(c));
            }
        } else {
            arrayList2 = null;
        }
        List<C28531i> c2 = hVar.mo68237c();
        if (c2 != null) {
            arrayList3 = new ArrayList(C41343r.m119925u(c2, 10));
            for (C28531i i : c2) {
                arrayList3.add(mo70418i(i));
            }
        } else {
            arrayList3 = null;
        }
        List<C28529g> g = hVar.mo68241g();
        if (g != null) {
            arrayList4 = new ArrayList(C41343r.m119925u(g, 10));
            for (C28529g g2 : g) {
                arrayList4.add(mo70416g(g2));
            }
        } else {
            arrayList4 = null;
        }
        int h = hVar.mo68242h();
        C28951a f = hVar.mo68240f();
        if (f != null) {
            bonusPrloUiModel = mo70419j(f);
        }
        return new BonusWrapperUiModel(bonusAmexUiModel, bonusPlusUiModel, arrayList, arrayList2, arrayList3, arrayList4, h, bonusPrloUiModel);
    }

    /* renamed from: i */
    public final CasTotalUiModel mo70418i(C28531i iVar) {
        C41536l.m120489i(iVar, "casTotal");
        return new CasTotalUiModel(iVar.mo68244b(), iVar.mo68243a(), iVar.mo68245c());
    }

    /* renamed from: j */
    public final BonusPrloUiModel mo70419j(C28951a aVar) {
        C41536l.m120489i(aVar, "bonusPrlo");
        long a = aVar.mo68804a();
        List<C28953c> b = aVar.mo68805b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C28953c l : b) {
            arrayList.add(mo70421l(l));
        }
        return new BonusPrloUiModel(a, arrayList);
    }

    /* renamed from: k */
    public final PrloTicketUiModel mo70420k(C28952b bVar) {
        C41536l.m120489i(bVar, "prloTicket");
        return new PrloTicketUiModel(bVar.mo68810b(), bVar.mo68809a(), bVar.mo68813e(), bVar.mo68812d(), Long.valueOf(bVar.mo68811c()));
    }

    /* renamed from: l */
    public final PrloTicketWrapperUiModel mo70421l(C28953c cVar) {
        C41536l.m120489i(cVar, "wrapper");
        long a = cVar.mo68817a();
        int b = cVar.mo68818b();
        List<C28952b> c = cVar.mo68819c();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(c, 10));
        for (C28952b k : c) {
            arrayList.add(mo70420k(k));
        }
        return new PrloTicketWrapperUiModel(a, b, arrayList);
    }

    /* renamed from: m */
    public final List mo70422m(List list) {
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo70414e((C28527e) it.next()));
        }
        return arrayList;
    }
}

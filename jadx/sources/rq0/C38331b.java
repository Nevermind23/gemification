package rq0;

import hd0.C24978b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionDetailsUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.RecommenderUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionDetailsUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.ScheduleInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.SummaryUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.RateTypeUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoUiModel;
import p852ov.C27088c;
import pq0.C37941a;
import qq0.C38234a;
import qq0.C38236b;
import wp0.C39628a;
import wp0.C39630b;
import wp0.C39631c;
import wp0.C39632d;
import wp0.C39633e;
import wp0.C39634f;
import wp0.C39635g;
import wp0.C39637h;
import wp0.C39638i;
import wp0.C39639j;

/* renamed from: rq0.b */
public final class C38331b {

    /* renamed from: rq0.b$a */
    public /* synthetic */ class C38332a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f91845a;

        static {
            int[] iArr = new int[C39635g.values().length];
            try {
                iArr[C39635g.PERCENTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f91845a = iArr;
        }
    }

    /* renamed from: a */
    private final ScheduleInfoUiModel m112629a(C39638i iVar) {
        return new ScheduleInfoUiModel(iVar.mo93374a(), iVar.mo93375b(), iVar.mo93376c(), iVar.mo93377d(), iVar.mo93378e(), iVar.mo93380f(), iVar.mo93381g(), iVar.mo93382h());
    }

    /* renamed from: b */
    private final SummaryUiModel m112630b(C39639j jVar) {
        return new SummaryUiModel(jVar.mo93387c(), jVar.mo93385a(), jVar.mo93388d(), jVar.mo93386b());
    }

    /* renamed from: c */
    private final InsuranceInfoUiModel m112631c(C39631c cVar) {
        return new InsuranceInfoUiModel(cVar.mo93323a(), cVar.mo93324b(), m112637k(cVar.mo93325c()));
    }

    /* renamed from: d */
    private final ProviderInfoUiModel m112632d(C39634f fVar) {
        InsuranceInfoUiModel insuranceInfoUiModel;
        InsuranceInfoUiModel insuranceInfoUiModel2;
        String str;
        C39631c a = fVar.mo93343a();
        if (a != null) {
            insuranceInfoUiModel = m112631c(a);
        } else {
            insuranceInfoUiModel = null;
        }
        C39631c b = fVar.mo93344b();
        if (b != null) {
            insuranceInfoUiModel2 = m112631c(b);
        } else {
            insuranceInfoUiModel2 = null;
        }
        String c = fVar.mo93345c();
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        if (C40440x.m117139M(language, "ka", false, 2, (Object) null)) {
            str = fVar.mo93346d();
        } else {
            str = fVar.mo93347e();
        }
        return new ProviderInfoUiModel(insuranceInfoUiModel, insuranceInfoUiModel2, c, str);
    }

    /* renamed from: e */
    private final RefinanceInfoUiModel m112633e(C39637h hVar) {
        String p;
        if ((hVar.mo93365l() == null && hVar.mo93360h() == null) || hVar.mo93353b() == null || hVar.mo93372s() == null || (p = hVar.mo93369p()) == null) {
            return null;
        }
        String h = hVar.mo93360h();
        String a = hVar.mo93352a();
        String e = hVar.mo93356e();
        String k = hVar.mo93364k();
        String i = hVar.mo93362i();
        String g = hVar.mo93359g();
        String l = hVar.mo93365l();
        String s = hVar.mo93372s();
        C24978b bVar = C24978b.YES;
        boolean d = C41536l.m120484d(s, bVar.mo63391e());
        String j = hVar.mo93363j();
        Double c = hVar.mo93354c();
        if (c == null) {
            return null;
        }
        double doubleValue = c.doubleValue();
        boolean d2 = C41536l.m120484d(hVar.mo93353b(), bVar.mo63391e());
        String f = hVar.mo93358f();
        String n = hVar.mo93367n();
        String o = hVar.mo93368o();
        String d3 = hVar.mo93355d();
        if (d3 == null) {
            return null;
        }
        return new RefinanceInfoUiModel(p, a, e, h, k, i, g, l, d, j, doubleValue, d2, f, n, o, d3, hVar.mo93370q(), hVar.mo93371r(), hVar.mo93366m());
    }

    /* renamed from: f */
    private final C38234a m112634f(C39633e eVar) {
        return C38234a.f91713i.mo91769a(eVar != null ? eVar.mo93339a() : null);
    }

    /* renamed from: h */
    private final CheckDecisionDetailsUiModel m112635h(C39630b bVar) {
        Double p = bVar.mo93311p();
        Double q = bVar.mo93312q();
        C41536l.m120486f(q);
        double doubleValue = q.doubleValue();
        String r = bVar.mo93313r();
        String str = r;
        C41536l.m120486f(r);
        Integer v = bVar.mo93318v();
        C41536l.m120486f(v);
        int intValue = v.intValue();
        Integer B = bVar.mo93290B();
        C41536l.m120486f(B);
        int intValue2 = B.intValue();
        Double D = bVar.mo93292D();
        Double b = bVar.mo93295b();
        Double j = bVar.mo93305j();
        Double k = bVar.mo93306k();
        Double l = bVar.mo93307l();
        Double u = bVar.mo93317u();
        String n = bVar.mo93309n();
        Double s = bVar.mo93314s();
        Double C = bVar.mo93291C();
        Double E = bVar.mo93293E();
        String A = bVar.mo93289A();
        Integer c = bVar.mo93296c();
        Double g = bVar.mo93301g();
        Double h = bVar.mo93302h();
        Long i = bVar.mo93304i();
        C39628a a = bVar.mo93294a();
        C41536l.m120486f(a);
        return new CheckDecisionDetailsUiModel(b, p, u, D, j, k, l, doubleValue, (Double) null, (Double) null, str, s, intValue, intValue2, C, E, A, n, c, g, h, i, a);
    }

    /* renamed from: j */
    private final GetDecisionDetailsUiModel m112636j(C39630b bVar) {
        C39628a a = bVar.mo93294a();
        C39628a aVar = a;
        C41536l.m120486f(a);
        Long d = bVar.mo93297d();
        String e = bVar.mo93298e();
        Double f = bVar.mo93300f();
        Double j = bVar.mo93305j();
        Double k = bVar.mo93306k();
        Double l = bVar.mo93307l();
        Double m = bVar.mo93308m();
        C38236b a2 = C38236b.f91724d.mo91770a(bVar.mo93309n());
        C38236b bVar2 = a2;
        C41536l.m120486f(a2);
        Double o = bVar.mo93310o();
        Double q = bVar.mo93312q();
        C41536l.m120486f(q);
        double doubleValue = q.doubleValue();
        String r = bVar.mo93313r();
        String str = r;
        C41536l.m120486f(r);
        Long t = bVar.mo93315t();
        Integer v = bVar.mo93318v();
        Integer x = bVar.mo93320x();
        C41536l.m120486f(x);
        int intValue = x.intValue();
        Integer z = bVar.mo93322z();
        C41536l.m120486f(z);
        int intValue2 = z.intValue();
        C27088c a3 = C27088c.f68041e.mo66360a(bVar.mo93289A());
        C41536l.m120486f(a3);
        return new GetDecisionDetailsUiModel(aVar, d, e, f, j, k, l, m, bVar2, o, doubleValue, str, t, v, intValue, intValue2, a3, bVar.mo93290B(), bVar.mo93293E());
    }

    /* renamed from: k */
    private final RateTypeUiModel m112637k(C39635g gVar) {
        if (C38332a.f91845a[gVar.ordinal()] == 1) {
            return RateTypeUiModel.PERCENTAGE;
        }
        return RateTypeUiModel.AMOUNT;
    }

    /* renamed from: g */
    public final C37941a mo91877g(C39632d dVar) {
        C41536l.m120489i(dVar, "entity");
        Integer e = dVar.mo93333e();
        if (e != null && e.intValue() == -202) {
            Double y = dVar.mo93329a().mo93321y();
            C41536l.m120486f(y);
            double doubleValue = y.doubleValue();
            Double w = dVar.mo93329a().mo93319w();
            C41536l.m120486f(w);
            double doubleValue2 = w.doubleValue();
            String r = dVar.mo93329a().mo93313r();
            C41536l.m120486f(r);
            return new RecommenderUiModel(doubleValue, doubleValue2, r);
        }
        CheckDecisionDetailsUiModel h = m112635h(dVar.mo93329a());
        List<C39637h> d = dVar.mo93332d();
        ArrayList arrayList = new ArrayList();
        for (C39637h e2 : d) {
            RefinanceInfoUiModel e3 = m112633e(e2);
            if (e3 != null) {
                arrayList.add(e3);
            }
        }
        List<C39634f> c = dVar.mo93331c();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(c, 10));
        for (C39634f d2 : c) {
            arrayList2.add(m112632d(d2));
        }
        return new CheckDecisionUiModel(h, arrayList, arrayList2);
    }

    /* renamed from: i */
    public final GetDecisionUiModel mo91878i(C39632d dVar) {
        C41536l.m120489i(dVar, "entity");
        GetDecisionDetailsUiModel j = m112636j(dVar.mo93329a());
        List<C39637h> d = dVar.mo93332d();
        ArrayList arrayList = new ArrayList();
        for (C39637h e : d) {
            RefinanceInfoUiModel e2 = m112633e(e);
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        List<C39634f> c = dVar.mo93331c();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(c, 10));
        for (C39634f d2 : c) {
            arrayList2.add(m112632d(d2));
        }
        SummaryUiModel b = m112630b(dVar.mo93336g());
        List j2 = C41341q.m119907j();
        C38234a f = m112634f((C39633e) C41358y.m120009Y(dVar.mo93330b()));
        C41536l.m120486f(f);
        List<C39638i> f2 = dVar.mo93335f();
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(f2, 10));
        for (C39638i a : f2) {
            arrayList3.add(m112629a(a));
        }
        return new GetDecisionUiModel(j, b, j2, arrayList, f, arrayList3, arrayList2);
    }
}

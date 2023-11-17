package kt0;

import g91.C32319m;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasHistoryItemUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasInfoSummaryUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasServiceInfoUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasServiceProductUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.DepositAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;
import zs0.C40248a;
import zs0.C40249b;
import zs0.C40250c;
import zs0.C40251d;
import zs0.C40252e;
import zs0.C40253f;
import zs0.C40254g;

/* renamed from: kt0.a */
public final class C36990a {
    /* renamed from: a */
    private final String m109492a(CasServiceProductUiModel casServiceProductUiModel) {
        Date j = casServiceProductUiModel.mo75061j();
        if (j != null) {
            return C32319m.m95299f(j, "dd.MM.yyyy");
        }
        return null;
    }

    /* renamed from: g */
    private final DepositAccountUiModel m109493g(C40254g gVar) {
        return new DepositAccountUiModel(gVar.mo94268a(), gVar.mo94269b(), gVar.mo94270c());
    }

    /* renamed from: i */
    public static /* synthetic */ CasAccountUiModel m109494i(C36990a aVar, C40248a aVar2, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return aVar.mo89927b(aVar2, str);
    }

    /* renamed from: b */
    public final CasAccountUiModel mo89927b(C40248a aVar, String str) {
        C41536l.m120489i(aVar, "entity");
        long j = aVar.mo94211j();
        long g = aVar.mo94208g();
        long a = aVar.mo94202a();
        String b = aVar.mo94203b();
        double e = aVar.mo94206e();
        String f = aVar.mo94207f();
        if (f == null) {
            f = str;
        }
        return new CasAccountUiModel(j, g, a, b, e, f, aVar.mo94212k(), aVar.mo94205d(), aVar.mo94204c(), aVar.mo94210i(), aVar.mo94209h());
    }

    /* renamed from: c */
    public final CasHistoryItemUiModel mo89928c(C40250c cVar) {
        C41536l.m120489i(cVar, "entity");
        return new CasHistoryItemUiModel(cVar.mo94222e(), cVar.mo94220c(), cVar.mo94221d(), cVar.mo94218a(), cVar.mo94219b());
    }

    /* renamed from: d */
    public final CasInfoSummaryUiModel mo89929d(C40251d dVar) {
        C41536l.m120489i(dVar, "entity");
        return new CasInfoSummaryUiModel(dVar.mo94226a(), dVar.mo94227b(), dVar.mo94228c());
    }

    /* renamed from: e */
    public final CasServiceInfoUiModel mo89930e(C40252e eVar) {
        C41536l.m120489i(eVar, "entity");
        List<C40251d> b = eVar.mo94233b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C40251d d : b) {
            arrayList.add(mo89929d(d));
        }
        List<C40253f> a = eVar.mo94232a();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(a, 10));
        for (C40253f f : a) {
            arrayList2.add(mo89931f(f));
        }
        return new CasServiceInfoUiModel(arrayList, arrayList2);
    }

    /* renamed from: f */
    public final CasServiceProductUiModel mo89931f(C40253f fVar) {
        C41536l.m120489i(fVar, "entity");
        long j = fVar.mo94250j();
        long i = fVar.mo94249i();
        String v = fVar.mo94263v();
        long x = fVar.mo94265x();
        double y = fVar.mo94266y();
        String w = fVar.mo94264w();
        long d = fVar.mo94242d();
        String f = fVar.mo94245f();
        String z = fVar.mo94267z();
        String p = fVar.mo94256p();
        String e = fVar.mo94243e();
        String r = fVar.mo94258r();
        String c = fVar.mo94241c();
        double A = fVar.mo94237A();
        Double B = fVar.mo94238B();
        double k = fVar.mo94251k();
        String m = fVar.mo94253m();
        double b = fVar.mo94240b();
        boolean t = fVar.mo94260t();
        Date u = fVar.mo94262u();
        Date s = fVar.mo94259s();
        boolean q = fVar.mo94257q();
        String g = fVar.mo94246g();
        String h = fVar.mo94247h();
        List<C40248a> a = fVar.mo94239a();
        long j2 = d;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C40248a b2 : a) {
            arrayList.add(mo89927b(b2, fVar.mo94241c()));
        }
        List<C40254g> l = fVar.mo94252l();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(l, 10));
        for (C40254g g2 : l) {
            arrayList2.add(m109493g(g2));
        }
        ArrayList arrayList3 = arrayList2;
        return new CasServiceProductUiModel(j, i, v, x, y, w, j2, f, z, p, e, r, c, A, B, k, m, b, t, u, s, q, g, h, arrayList, arrayList3, fVar.mo94254n(), fVar.mo94255o());
    }

    /* renamed from: h */
    public final CasDetailsUiModel mo89932h(C40249b bVar) {
        double d;
        Double r;
        C41536l.m120489i(bVar, "details");
        CasServiceProductUiModel f = mo89931f(bVar.mo94213a());
        long d2 = f.mo75052d();
        boolean z = !f.mo75062k();
        if (!f.mo75060i() || (r = f.mo75067r()) == null) {
            d = f.mo75066q();
        } else {
            d = r.doubleValue();
        }
        double e = f.mo75054e();
        List a = f.mo75050a();
        DepositAccountUiModel depositAccountUiModel = (DepositAccountUiModel) C41358y.m120007W(f.mo75056f());
        List<C40250c> b = bVar.mo94214b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C40250c c : b) {
            arrayList.add(mo89928c(c));
        }
        return new CasDetailsUiModel(d2, z, d, e, a, depositAccountUiModel, arrayList, m109492a(f), f.mo75064m(), f.mo75065p(), f.mo75063l(), f.mo75057g(), f.mo75058h());
    }
}

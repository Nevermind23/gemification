package o90;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g90.C20780b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.domain.lookup.model.Country;
import t80.C28324a;
import ue1.C43075l;

/* renamed from: o90.g1 */
public final class C26809g1 extends C21481a implements C26783b1, C26787c1 {

    /* renamed from: d */
    private final Country f67533d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28324a f67534e;

    /* renamed from: f */
    private final C26783b1 f67535f = this;

    /* renamed from: g */
    private final C26787c1 f67536g = this;

    /* renamed from: h */
    private final C1644x f67537h = new C1644x();

    /* renamed from: i */
    private final C1644x f67538i = new C1644x();

    /* renamed from: j */
    private final C1644x f67539j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final List f67540k = new ArrayList();

    /* renamed from: o90.g1$a */
    static final class C26810a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26809g1 f67541d;

        /* renamed from: o90.g1$a$a */
        /* synthetic */ class C26811a extends C41535k implements C43075l {
            C26811a(Object obj) {
                super(1, obj, C26809g1.class, "transformCountries", "transformCountries(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C26809g1) this.receiver).m83435ow(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26810a(C26809g1 g1Var) {
            super(1);
            this.f67541d = g1Var;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p O = this.f67541d.f67534e.mo67966a().mo95062A(new C26799f1(new C26811a(this.f67541d))).mo95075O();
            C41536l.m120488h(O, "getCountries()\n         …Countries).toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: o90.g1$b */
    static final class C26812b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26809g1 f67542d;

        /* renamed from: o90.g1$b$a */
        static final class C26813a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26809g1 f67543d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26813a(C26809g1 g1Var) {
                super(1);
                this.f67543d = g1Var;
            }

            /* renamed from: a */
            public final void mo66119a(List list) {
                this.f67543d.mo66111kw().mo4823o(list);
                List hw = this.f67543d.f67540k;
                C41536l.m120488h(list, "list");
                C32343x.m95475p(hw, list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo66119a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26812b(C26809g1 g1Var) {
            super(1);
            this.f67542d = g1Var;
        }

        /* renamed from: a */
        public final void mo66118a(C31128a aVar) {
            this.f67542d.mo66090Sa().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C26813a(this.f67542d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66118a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.g1$c */
    public interface C26814c {
        /* renamed from: a */
        C26809g1 mo32790a(Country country);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26809g1(Country country, C28324a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getCountries");
        this.f67533d = country;
        this.f67534e = aVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C26791d1(new C26810a(this)));
        C41536l.m120488h(L0, "merge(\n                o…le(RC_INIT)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C26795e1(new C26812b(this)));
        C41536l.m120488h(F0, "merge(\n                o…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m83430fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m83431gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public final List m83435ow(List list) {
        String str;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Country country = (Country) it.next();
            String a = country.mo55935a();
            Country country2 = this.f67533d;
            if (country2 != null) {
                str = country2.mo55935a();
            } else {
                str = null;
            }
            arrayList.add(new C20780b(country, C41536l.m120484d(a, str)));
        }
        return arrayList;
    }

    /* renamed from: Y2 */
    public void mo66110Y2(String str) {
        boolean z;
        boolean z2;
        C41536l.m120489i(str, "query");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1644x kw = mo66111kw();
            List list = this.f67540k;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                String a = ((C20780b) next).mo49330a().mo55935a();
                if (a != null) {
                    z2 = C40439w.m117107F(a, str, true);
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            kw.mo4823o(arrayList);
            return;
        }
        mo66111kw().mo4823o(this.f67540k);
    }

    /* renamed from: kw */
    public C1644x mo66111kw() {
        return this.f67538i;
    }

    /* renamed from: lw */
    public C1644x mo66090Sa() {
        return this.f67537h;
    }

    /* renamed from: mw */
    public C1644x mo66091h() {
        return this.f67539j;
    }

    /* renamed from: nw */
    public final C26787c1 mo66114nw() {
        return this.f67536g;
    }

    /* renamed from: uu */
    public void mo66115uu(Country country) {
        C41536l.m120489i(country, "selectedCountry");
        mo66091h().mo4823o(C32343x.m95466m(country));
    }
}

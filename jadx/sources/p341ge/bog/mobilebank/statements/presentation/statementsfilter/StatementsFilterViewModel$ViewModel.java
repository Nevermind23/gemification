package p341ge.bog.mobilebank.statements.presentation.statementsfilter;

import androidx.lifecycle.C1644x;
import d50.C19907a;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p51.C37900b;
import p51.C37902c;
import p750ew.C20300c;
import p863pw.C27638p;
import q51.C38131b;
import q51.C38132c;
import r51.C38285a;
import ue1.C43075l;
import ue1.C43080q;
import v51.C39202a0;
import v51.C39204b0;
import v51.C39206c0;
import v51.C39208d0;
import v51.C39210e0;
import v51.C39212f0;

/* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel */
public final class StatementsFilterViewModel$ViewModel extends C21481a implements C39202a0, C39204b0 {

    /* renamed from: t */
    public static final C34746e f83962t = new C34746e((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C37900b f83963d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C20300c f83964e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C37902c f83965f;

    /* renamed from: g */
    private final C39204b0 f83966g = this;

    /* renamed from: h */
    private final C39202a0 f83967h = this;

    /* renamed from: i */
    private final C1644x f83968i = new C1644x();

    /* renamed from: j */
    private final C1644x f83969j = new C1644x();

    /* renamed from: k */
    private final C1644x f83970k = new C1644x();

    /* renamed from: l */
    private final C1644x f83971l = new C1644x(Boolean.TRUE);

    /* renamed from: m */
    private final C1644x f83972m = new C1644x();

    /* renamed from: n */
    private final C1644x f83973n = new C1644x();

    /* renamed from: o */
    private final C1644x f83974o = new C1644x();

    /* renamed from: p */
    private final C1644x f83975p = new C1644x();

    /* renamed from: q */
    private final C1644x f83976q = new C1644x();

    /* renamed from: r */
    private final C1644x f83977r = new C1644x();

    /* renamed from: s */
    private final C1644x f83978s = new C1644x(Boolean.FALSE);

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel$a */
    static final class C34740a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterViewModel$ViewModel f83979d;

        /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel$a$a */
        static final class C34741a extends C41537m implements C43080q {

            /* renamed from: d */
            final /* synthetic */ StatementsFilterViewModel$ViewModel f83980d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34741a(StatementsFilterViewModel$ViewModel statementsFilterViewModel$ViewModel) {
                super(3);
                this.f83980d = statementsFilterViewModel$ViewModel;
            }

            /* renamed from: a */
            public final C34747f invoke(List list, List list2, C38285a aVar) {
                List list3;
                C41536l.m120489i(list, "categories");
                C41536l.m120489i(list2, "ccys");
                C41536l.m120489i(aVar, "accsAndCards");
                C37223a aVar2 = (C37223a) this.f83980d.mo84848Av().mo4814f();
                if (aVar2 == null || (list3 = (List) aVar2.mo90299d()) == null) {
                    list3 = C41341q.m119907j();
                }
                return new C34747f.C34749b(aVar, list, list2, list3);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34740a(StatementsFilterViewModel$ViewModel statementsFilterViewModel$ViewModel) {
            super(1);
            this.f83979d = statementsFilterViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C34747f m102124d(C43080q qVar, Object obj, Object obj2, Object obj3) {
            C41536l.m120489i(qVar, "$tmp0");
            return (C34747f) qVar.invoke(obj, obj2, obj3);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C34747f m102125e(Throwable th) {
            C41536l.m120489i(th, "it");
            return new C34747f.C34748a(th);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            boolean z;
            C41536l.m120489i(num, "reqCode");
            C40762x a = this.f83979d.f83964e.mo48784a();
            C40762x a2 = this.f83979d.f83965f.mo91245a();
            C37900b lw = this.f83979d.f83963d;
            if (num.intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            return C40762x.m118153S(a, a2, lw.mo91243b(z).mo94996P(), new C34779e(new C34741a(this.f83979d))).mo95065D(new C34780f()).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel$b */
    static final class C34742b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterViewModel$ViewModel f83981d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34742b(StatementsFilterViewModel$ViewModel statementsFilterViewModel$ViewModel) {
            super(1);
            this.f83981d = statementsFilterViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo84882a(C41205b bVar) {
            this.f83981d.mo84863d0().mo4823o(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84882a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel$c */
    static final class C34743c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterViewModel$ViewModel f83982d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34743c(StatementsFilterViewModel$ViewModel statementsFilterViewModel$ViewModel) {
            super(1);
            this.f83982d = statementsFilterViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f83982d.mo84875v1().mo4823o(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel$d */
    static final class C34744d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterViewModel$ViewModel f83983d;

        /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel$d$a */
        public static final class C34745a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(Integer.valueOf(((C27638p) obj).mo67173c()), Integer.valueOf(((C27638p) obj2).mo67173c()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34744d(StatementsFilterViewModel$ViewModel statementsFilterViewModel$ViewModel) {
            super(1);
            this.f83983d = statementsFilterViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo84884a(C34747f fVar) {
            List list;
            if (fVar instanceof C34747f.C34749b) {
                C34747f.C34749b bVar = (C34747f.C34749b) fVar;
                this.f83983d.mo84857J().mo4823o(C41358y.m120036z0(bVar.mo84890a().mo91833a()));
                this.f83983d.mo84856Im().mo4823o(C41358y.m120036z0(bVar.mo84890a().mo91834b()));
                this.f83983d.mo84851C1().mo4823o(C19907a.m65798b(bVar.mo84891b()));
                C1644x sw = this.f83983d.mo84860Vv();
                List t0 = C41358y.m120030t0(bVar.mo84892c(), new C34745a());
                C41224m mVar = (C41224m) this.f83983d.mo84860Vv().mo4814f();
                if (mVar == null || (list = (List) mVar.mo95680f()) == null) {
                    list = C41341q.m119907j();
                }
                sw.mo4823o(new C41224m(t0, list));
                this.f83983d.m102075Dw(bVar.mo84893d());
                this.f83983d.mo84863d0().mo4823o(Boolean.FALSE);
            } else if (fVar instanceof C34747f.C34748a) {
                this.f83983d.mo84875v1().mo4823o(((C34747f.C34748a) fVar).mo84886a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84884a((C34747f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel$e */
    public static final class C34746e {
        private C34746e() {
        }

        public /* synthetic */ C34746e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel$f */
    private static abstract class C34747f {

        /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel$f$a */
        public static final class C34748a extends C34747f {

            /* renamed from: a */
            private final Throwable f83984a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C34748a(Throwable th) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(th, "ex");
                this.f83984a = th;
            }

            /* renamed from: a */
            public final Throwable mo84886a() {
                return this.f83984a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C34748a) && C41536l.m120484d(this.f83984a, ((C34748a) obj).f83984a);
            }

            public int hashCode() {
                return this.f83984a.hashCode();
            }

            public String toString() {
                Throwable th = this.f83984a;
                return "Error(ex=" + th + ")";
            }
        }

        /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel$f$b */
        public static final class C34749b extends C34747f {

            /* renamed from: a */
            private final C38285a f83985a;

            /* renamed from: b */
            private final List f83986b;

            /* renamed from: c */
            private final List f83987c;

            /* renamed from: d */
            private final List f83988d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C34749b(C38285a aVar, List list, List list2, List list3) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(aVar, "accsAndCards");
                C41536l.m120489i(list, "categories");
                C41536l.m120489i(list2, "ccys");
                C41536l.m120489i(list3, "keyWords");
                this.f83985a = aVar;
                this.f83986b = list;
                this.f83987c = list2;
                this.f83988d = list3;
            }

            /* renamed from: a */
            public final C38285a mo84890a() {
                return this.f83985a;
            }

            /* renamed from: b */
            public final List mo84891b() {
                return this.f83986b;
            }

            /* renamed from: c */
            public final List mo84892c() {
                return this.f83987c;
            }

            /* renamed from: d */
            public final List mo84893d() {
                return this.f83988d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C34749b)) {
                    return false;
                }
                C34749b bVar = (C34749b) obj;
                return C41536l.m120484d(this.f83985a, bVar.f83985a) && C41536l.m120484d(this.f83986b, bVar.f83986b) && C41536l.m120484d(this.f83987c, bVar.f83987c) && C41536l.m120484d(this.f83988d, bVar.f83988d);
            }

            public int hashCode() {
                return (((((this.f83985a.hashCode() * 31) + this.f83986b.hashCode()) * 31) + this.f83987c.hashCode()) * 31) + this.f83988d.hashCode();
            }

            public String toString() {
                C38285a aVar = this.f83985a;
                List list = this.f83986b;
                List list2 = this.f83987c;
                List list3 = this.f83988d;
                return "Success(accsAndCards=" + aVar + ", categories=" + list + ", ccys=" + list2 + ", keyWords=" + list3 + ")";
            }
        }

        private C34747f() {
        }

        public /* synthetic */ C34747f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatementsFilterViewModel$ViewModel(C37900b bVar, C20300c cVar, C37902c cVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "accountsAndCardsUseCase");
        C41536l.m120489i(cVar, "categoriesUseCase");
        C41536l.m120489i(cVar2, "getCcyiesUseCase");
        this.f83963d = bVar;
        this.f83964e = cVar;
        this.f83965f = cVar2;
        C41205b F0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C39206c0(new C34740a(this))).mo95027o0(C40992a.m118827a()).mo94980F(new C39208d0(new C34742b(this))).mo94974C(new C39210e0(new C34743c(this))).mo94981F0(new C39212f0(new C34744d(this)));
        C41536l.m120488h(F0, "merge(\n                o…     }\n\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public final void m102075Dw(List list) {
        C37224b.m109966e(mo84848Av(), list);
    }

    /* renamed from: Ew */
    private final void m102076Ew(List list) {
        C1644x ww = mo84848Av();
        C37223a aVar = new C37223a(list);
        aVar.mo90296a();
        ww.mo4823o(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m102081hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m102082iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final void m102083jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m102084kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: xw */
    private final int m102089xw() {
        List list;
        C37223a aVar = (C37223a) mo84848Av().mo4814f();
        if (aVar == null || (list = (List) aVar.mo90299d()) == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: Aw */
    public C1644x mo84866po() {
        return this.f83973n;
    }

    /* renamed from: Bw */
    public C1644x mo84861Xg() {
        return this.f83974o;
    }

    /* renamed from: Cf */
    public void mo84852Cf(List list) {
        List list2;
        C41536l.m120489i(list, "ccys");
        C1644x sw = mo84860Vv();
        C41224m mVar = (C41224m) mo84860Vv().mo4814f();
        if (mVar == null || (list2 = (List) mVar.mo95678e()) == null) {
            list2 = C41341q.m119907j();
        }
        sw.mo4823o(new C41224m(list2, list));
    }

    /* renamed from: Cw */
    public C1644x mo84864hu() {
        return this.f83975p;
    }

    /* renamed from: Gl */
    public void mo84855Gl(HashSet hashSet) {
        boolean z;
        C41536l.m120489i(hashSet, "filteredCategories");
        HashSet hashSet2 = new HashSet();
        List<TransactionCategoryModel> list = (List) mo84851C1().mo4814f();
        if (list != null) {
            for (TransactionCategoryModel transactionCategoryModel : list) {
                List<TransactionCategoryModel> e = transactionCategoryModel.mo55079e();
                if (e == null || e.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (TransactionCategoryModel transactionCategoryModel2 : e) {
                        if (hashSet.contains(Long.valueOf(transactionCategoryModel2.mo55075a()))) {
                            hashSet2.add(new C41224m(Long.valueOf(transactionCategoryModel2.mo55075a()), transactionCategoryModel2.mo55082g()));
                        }
                    }
                } else if (hashSet.contains(Long.valueOf(transactionCategoryModel.mo55075a()))) {
                    hashSet2.add(new C41224m(Long.valueOf(transactionCategoryModel.mo55075a()), transactionCategoryModel.mo55082g()));
                }
            }
        }
        mo84864hu().mo4823o(hashSet2);
    }

    /* renamed from: Tf */
    public void mo84858Tf(HashSet hashSet) {
        Object obj;
        boolean z;
        C41536l.m120489i(hashSet, "filteredAccs");
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Long valueOf = Long.valueOf(longValue);
            List list = (List) mo84857J().mo4814f();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((C38131b) obj).mo91660a() == longValue) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C38131b bVar = (C38131b) obj;
                if (!(bVar == null || (r1 = bVar.mo91664e()) == null)) {
                    hashSet2.add(new C41224m(valueOf, r1));
                }
            }
            String str = "";
            hashSet2.add(new C41224m(valueOf, str));
        }
        mo84866po().mo4823o(hashSet2);
    }

    /* renamed from: Vk */
    public void mo84859Vk(String str) {
        List list;
        ArrayList arrayList = new ArrayList();
        C37223a aVar = (C37223a) mo84848Av().mo4814f();
        if (!(aVar == null || (list = (List) aVar.mo90299d()) == null)) {
            arrayList.addAll(list);
        }
        if (str != null) {
            arrayList.add(str);
        }
        m102076Ew(arrayList);
    }

    /* renamed from: bc */
    public void mo84862bc() {
        C1644x vw = mo84854Dl();
        boolean z = true;
        if (m102089xw() >= 1) {
            z = false;
        }
        vw.mo4823o(Boolean.valueOf(z));
    }

    /* renamed from: nn */
    public void mo84865nn(int i) {
        List list;
        ArrayList arrayList = new ArrayList();
        C37223a aVar = (C37223a) mo84848Av().mo4814f();
        if (!(aVar == null || (list = (List) aVar.mo90299d()) == null)) {
            arrayList.addAll(list);
        }
        arrayList.remove(i);
        m102076Ew(arrayList);
    }

    /* renamed from: pw */
    public C1644x mo84857J() {
        return this.f83968i;
    }

    /* renamed from: qc */
    public void mo84868qc(HashSet hashSet) {
        Object obj;
        boolean z;
        C41536l.m120489i(hashSet, "filteredCards");
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Long valueOf = Long.valueOf(longValue);
            List list = (List) mo84856Im().mo4814f();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((C38132c) obj).mo91669b() == longValue) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C38132c cVar = (C38132c) obj;
                if (!(cVar == null || (r1 = cVar.mo91668a()) == null)) {
                    hashSet2.add(new C41224m(valueOf, r1));
                }
            }
            String str = "";
            hashSet2.add(new C41224m(valueOf, str));
        }
        mo84861Xg().mo4823o(hashSet2);
    }

    /* renamed from: qw */
    public C1644x mo84856Im() {
        return this.f83969j;
    }

    /* renamed from: rw */
    public C1644x mo84851C1() {
        return this.f83970k;
    }

    /* renamed from: sr */
    public void mo84871sr() {
        m102076Ew(new ArrayList());
    }

    /* renamed from: sw */
    public C1644x mo84860Vv() {
        return this.f83976q;
    }

    /* renamed from: tw */
    public C1644x mo84875v1() {
        return this.f83972m;
    }

    /* renamed from: uw */
    public final C39202a0 mo84874uw() {
        return this.f83967h;
    }

    /* renamed from: vw */
    public C1644x mo84854Dl() {
        return this.f83978s;
    }

    /* renamed from: ww */
    public C1644x mo84848Av() {
        return this.f83977r;
    }

    /* renamed from: yw */
    public C1644x mo84863d0() {
        return this.f83971l;
    }

    /* renamed from: zw */
    public final C39204b0 mo84879zw() {
        return this.f83966g;
    }
}

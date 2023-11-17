package p341ge.bog.mobilebank.statements.presentation.landing;

import androidx.lifecycle.C1644x;
import b50.C19336c;
import com.salesforce.marketingcloud.C11398b;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import h50.C24882b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41232r;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.statements.presentation.OperationFilter;
import p784hw.C25074c;
import p793iw.C25263b;
import p793iw.C25264c;
import p891su.C28261a;
import r51.C38286b;
import t51.C38651a0;
import t51.C38653b0;
import t51.C38655c0;
import t51.C38657d0;
import t51.C38659e0;
import t51.C38669j;
import t51.C38671l;
import t51.C38702z;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.statements.presentation.landing.StatementsViewModel$ViewModel */
public final class StatementsViewModel$ViewModel extends C21481a implements C38702z, C38651a0 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C25074c f83912d;

    /* renamed from: e */
    private final C38702z f83913e = this;

    /* renamed from: f */
    private final C38651a0 f83914f = this;

    /* renamed from: g */
    private final C1644x f83915g = new C1644x();

    /* renamed from: h */
    private final C1644x f83916h = new C1644x(0);

    /* renamed from: i */
    private final C1644x f83917i;

    /* renamed from: j */
    private final C1644x f83918j;

    /* renamed from: k */
    private final C1644x f83919k;

    /* renamed from: l */
    private final C1644x f83920l;

    /* renamed from: m */
    private final C40767b f83921m;

    /* renamed from: n */
    private final C40767b f83922n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public List f83923o;

    /* renamed from: p */
    private boolean f83924p;

    /* renamed from: q */
    private boolean f83925q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public List f83926r;

    /* renamed from: s */
    private final OperationFilter f83927s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public OperationFilter f83928t;

    /* renamed from: ge.bog.mobilebank.statements.presentation.landing.StatementsViewModel$ViewModel$a */
    static final class C34719a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsViewModel$ViewModel f83929d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34719a(StatementsViewModel$ViewModel statementsViewModel$ViewModel) {
            super(1);
            this.f83929d = statementsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            Integer num;
            Integer num2;
            C41536l.m120489i(wVar, "it");
            this.f83929d.mo84820d0().mo4823o(Boolean.TRUE);
            String k = this.f83929d.f83928t.mo84802k();
            boolean z = false;
            if (k != null && k.length() > 0) {
                z = true;
            }
            if (z) {
                return C25074c.m80040d(this.f83929d.f83912d, (Long) null, (Long) null, (Integer) null, (Integer) null, 30, (List) null, (List) null, (List) null, this.f83929d.f83928t.mo84802k(), this.f83929d.f83926r, (List) null, false, (C28261a) null, true, 7407, (Object) null).mo95075O();
            }
            C25074c iw = this.f83929d.f83912d;
            long l = this.f83929d.f83928t.mo84803l();
            long f = this.f83929d.f83928t.mo84796f();
            List a = this.f83929d.f83928t.mo84790a();
            BigDecimal i = this.f83929d.f83928t.mo84800i();
            String str = null;
            if (i != null) {
                num = Integer.valueOf(i.intValue());
            } else {
                num = null;
            }
            BigDecimal h = this.f83929d.f83928t.mo84798h();
            if (h != null) {
                num2 = Integer.valueOf(h.intValue());
            } else {
                num2 = null;
            }
            List kw = this.f83929d.f83926r;
            List d = this.f83929d.f83928t.mo84792d();
            List b = this.f83929d.f83928t.mo84791b();
            List g = this.f83929d.f83928t.mo84797g();
            if (g != null) {
                str = (String) C41358y.m120009Y(g);
            }
            return C25074c.m80040d(iw, Long.valueOf(l), Long.valueOf(f), num, num2, 30, a, b, d, str, kw, this.f83929d.f83928t.mo84794e(), false, (C28261a) null, true, 6144, (Object) null).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.landing.StatementsViewModel$ViewModel$b */
    static final class C34720b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsViewModel$ViewModel f83930d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34720b(StatementsViewModel$ViewModel statementsViewModel$ViewModel) {
            super(1);
            this.f83930d = statementsViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f83930d.mo84820d0().mo4823o(Boolean.FALSE);
            this.f83930d.mo84823v1().mo4823o(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.landing.StatementsViewModel$ViewModel$c */
    static final class C34721c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsViewModel$ViewModel f83931d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34721c(StatementsViewModel$ViewModel statementsViewModel$ViewModel) {
            super(1);
            this.f83931d = statementsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo84833a(C25264c cVar) {
            this.f83931d.mo84820d0().mo4823o(Boolean.FALSE);
            C1644x Dw = this.f83931d.mo84814F6();
            BigDecimal c = cVar.mo63845c();
            if (c == null) {
                c = new BigDecimal(0);
            }
            BigDecimal e = cVar.mo63847e();
            if (e == null) {
                e = new BigDecimal(0);
            }
            Dw.mo4823o(C41233s.m119492a(c, e));
            C25263b bVar = (C25263b) C41358y.m120020j0(cVar.mo63846d());
            if (bVar != null) {
                this.f83931d.f83926r = bVar.mo63809M();
            }
            List<C25263b> d = cVar.mo63846d();
            StatementsViewModel$ViewModel statementsViewModel$ViewModel = this.f83931d;
            for (C25263b d2 : d) {
                statementsViewModel$ViewModel.f83923o.add(C38671l.m113338a(C24882b.m79536d(d2)));
            }
            this.f83931d.m101974tw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84833a((C25264c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.landing.StatementsViewModel$ViewModel$d */
    static final class C34722d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsViewModel$ViewModel f83932d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34722d(StatementsViewModel$ViewModel statementsViewModel$ViewModel) {
            super(1);
            this.f83932d = statementsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo84834a(String str) {
            StatementsViewModel$ViewModel.m101957Fw(this.f83932d, (Long) null, (Long) null, (List) null, (List) null, (List) null, str, (BigDecimal) null, (BigDecimal) null, (List) null, (Integer) null, (List) null, 2015, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84834a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatementsViewModel$ViewModel(C25074c cVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C25074c cVar2 = cVar;
        C41536l.m120489i(cVar2, "getTransactionsUseCase");
        this.f83912d = cVar2;
        C38286b bVar = C38286b.f91793a;
        this.f83917i = new C1644x(new C41232r(Long.valueOf(bVar.mo91843f(1)), Long.valueOf(bVar.mo91840c()), 1));
        this.f83918j = new C1644x(C41233s.m119492a(new BigDecimal(0), new BigDecimal(0)));
        this.f83919k = new C1644x(Boolean.TRUE);
        this.f83920l = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f83921m = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f83922n = h12;
        this.f83923o = new ArrayList();
        OperationFilter operationFilter = new OperationFilter(bVar.mo91843f(1), bVar.mo91840c(), (List) null, (List) null, (List) null, (String) null, (BigDecimal) null, (BigDecimal) null, (List) null, 1, (List) null, 1532, (DefaultConstructorMarker) null);
        this.f83927s = operationFilter;
        this.f83928t = operationFilter;
        m101972rw();
        m101968nw();
    }

    /* renamed from: Ew */
    private final void m101956Ew(Long l, Long l2, List list, List list2, List list3, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list4, Integer num, List list5) {
        long j;
        long j2;
        if (l != null) {
            j = l.longValue();
        } else {
            j = this.f83928t.mo84803l();
        }
        long j3 = j;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = this.f83928t.mo84796f();
        }
        this.f83928t = new OperationFilter(j3, j2, list, list2, list3, str, bigDecimal, bigDecimal2, list4, num, list5);
        mo84819c();
        mo84815O4().mo4823o(Integer.valueOf(m101975uw()));
    }

    /* renamed from: Fw */
    static /* synthetic */ void m101957Fw(StatementsViewModel$ViewModel statementsViewModel$ViewModel, Long l, Long l2, List list, List list2, List list3, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list4, Integer num, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        if ((i & 16) != 0) {
            list3 = null;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            bigDecimal = null;
        }
        if ((i & 128) != 0) {
            bigDecimal2 = null;
        }
        if ((i & C11398b.f33139r) != 0) {
            list4 = null;
        }
        if ((i & C11398b.f33140s) != 0) {
            num = null;
        }
        if ((i & C11398b.f33141t) != 0) {
            list5 = null;
        }
        statementsViewModel$ViewModel.m101956Ew(l, l2, list, list2, list3, str, bigDecimal, bigDecimal2, list4, num, list5);
    }

    /* renamed from: nw */
    private final void m101968nw() {
        C41205b F0 = this.f83921m.mo94989L0(new C38655c0(new C34719a(this))).mo95027o0(C40992a.m118827a()).mo94974C(new C38657d0(new C34720b(this))).mo94981F0(new C38659e0(new C34721c(this)));
        C41536l.m120488h(F0, "private fun addDataFetch…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final C40754t m101969ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m101970pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m101971qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: rw */
    private final void m101972rw() {
        C41205b F0 = this.f83922n.mo95032s(750, TimeUnit.MILLISECONDS).mo95027o0(C40992a.m118827a()).mo94981F0(new C38653b0(new C34722d(this)));
        C41536l.m120488h(F0, "private fun addDebounce(…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final void m101973sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public final void m101974tw() {
        boolean z;
        boolean z2;
        String k = this.f83928t.mo84802k();
        if (k == null || k.length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        List list = this.f83923o;
        ArrayList<C38669j> arrayList = new ArrayList<>();
        for (Object next : list) {
            C38669j jVar = (C38669j) next;
            if (z || ((jVar.mo92320e() == C19336c.POSITIVE || !this.f83924p) && (jVar.mo92320e() == C19336c.NEGATIVE || !this.f83925q))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C38669j a : arrayList) {
            C38286b.f91793a.mo91838a(arrayList2, a);
        }
        mo84816Sr().mo4823o(arrayList2);
    }

    /* renamed from: uw */
    private final int m101975uw() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.f83928t.mo84803l() != this.f83927s.mo84803l()) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f83928t.mo84796f() != this.f83927s.mo84796f()) {
            i++;
        }
        List a = this.f83928t.mo84790a();
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i++;
        }
        List b = this.f83928t.mo84791b();
        if (b == null || b.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i++;
        }
        List d = this.f83928t.mo84792d();
        if (d == null || d.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            i++;
        }
        if (!C32343x.m95488t0(this.f83928t.mo84800i(), new BigDecimal(0))) {
            i++;
        }
        if (this.f83928t.mo84798h() != null) {
            i++;
        }
        List e = this.f83928t.mo84794e();
        if (e == null || e.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            i++;
        }
        List g = this.f83928t.mo84797g();
        if (g != null && !g.isEmpty()) {
            z5 = false;
        }
        if (!z5) {
            return i + 1;
        }
        return i;
    }

    /* renamed from: Aw */
    public C1644x mo84815O4() {
        return this.f83916h;
    }

    /* renamed from: Bw */
    public final C38651a0 mo84811Bw() {
        return this.f83914f;
    }

    /* renamed from: Cw */
    public C1644x mo84816Sr() {
        return this.f83915g;
    }

    /* renamed from: Dw */
    public C1644x mo84814F6() {
        return this.f83918j;
    }

    /* renamed from: U5 */
    public void mo84817U5(boolean z, boolean z2) {
        this.f83924p = z;
        this.f83925q = z2;
        m101974tw();
    }

    /* renamed from: Y1 */
    public void mo84818Y1(String str) {
        C41536l.m120489i(str, "searchWord");
        this.f83922n.onNext(str);
    }

    /* renamed from: c */
    public void mo84819c() {
        this.f83926r = null;
        this.f83923o.clear();
        this.f83921m.onNext(C41238w.f97225a);
    }

    /* renamed from: o1 */
    public void mo84822o1() {
        this.f83921m.onNext(C41238w.f97225a);
    }

    /* renamed from: vw */
    public C1644x mo84821fc() {
        return this.f83917i;
    }

    /* renamed from: wh */
    public void mo84825wh(OperationFilter operationFilter) {
        C41536l.m120489i(operationFilter, "operationFilter");
        mo84821fc().mo4823o(new C41232r(Long.valueOf(operationFilter.mo84803l()), Long.valueOf(operationFilter.mo84796f()), operationFilter.mo84801j()));
        m101956Ew(Long.valueOf(operationFilter.mo84803l()), Long.valueOf(operationFilter.mo84796f()), operationFilter.mo84790a(), operationFilter.mo84791b(), operationFilter.mo84792d(), operationFilter.mo84802k(), operationFilter.mo84800i(), operationFilter.mo84798h(), operationFilter.mo84794e(), operationFilter.mo84801j(), operationFilter.mo84797g());
    }

    /* renamed from: ww */
    public final OperationFilter mo84826ww() {
        return this.f83927s;
    }

    /* renamed from: xc */
    public void mo84827xc() {
        this.f83928t = this.f83927s;
        C1644x vw = mo84821fc();
        C38286b bVar = C38286b.f91793a;
        vw.mo4823o(new C41232r(Long.valueOf(bVar.mo91843f(1)), Long.valueOf(bVar.mo91840c()), (Object) null));
        mo84815O4().mo4823o(0);
        mo84819c();
    }

    /* renamed from: xw */
    public C1644x mo84823v1() {
        return this.f83920l;
    }

    /* renamed from: yw */
    public final C38702z mo84829yw() {
        return this.f83913e;
    }

    /* renamed from: zw */
    public C1644x mo84820d0() {
        return this.f83919k;
    }
}

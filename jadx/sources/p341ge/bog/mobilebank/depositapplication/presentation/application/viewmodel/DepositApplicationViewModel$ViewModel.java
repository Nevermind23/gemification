package p341ge.bog.mobilebank.depositapplication.presentation.application.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41233s;
import he1.C41238w;
import ja0.C25364a;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import ka0.C25695d;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import pa0.C27487a;
import ra0.C27955a;
import ra0.C27956b;
import ra0.C27957c;
import ra0.C27958d;
import ra0.C27959e;
import ue1.C43075l;
import ue1.C43079p;
import xa0.C29664a;
import xa0.C29665b;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel */
public final class DepositApplicationViewModel$ViewModel extends C21481a implements C27955a, C27956b, C29664a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C25364a f60152d;

    /* renamed from: e */
    private final C29664a f60153e;

    /* renamed from: f */
    private final C27955a f60154f = this;

    /* renamed from: g */
    private final C27956b f60155g = this;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List f60156h;

    /* renamed from: i */
    private final C1644x f60157i = new C1644x();

    /* renamed from: j */
    private final C1644x f60158j = new C1644x();

    /* renamed from: k */
    private final C40767b f60159k;

    /* renamed from: l */
    private long f60160l;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel$a */
    public static final class C22817a implements Comparator {

        /* renamed from: d */
        final /* synthetic */ C25695d f60161d;

        public C22817a(C25695d dVar) {
            this.f60161d = dVar;
        }

        public final int compare(Object obj, Object obj2) {
            boolean z;
            boolean z2 = true;
            if (((DepositTypeDetailsUiModel) obj2).mo57218e() == this.f60161d) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (((DepositTypeDetailsUiModel) obj).mo57218e() != this.f60161d) {
                z2 = false;
            }
            return C41506d.m120406e(valueOf, Boolean.valueOf(z2));
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel$b */
    static final class C22818b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C22818b f60162d = new C22818b();

        C22818b() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(Integer num, String str) {
            C41536l.m120489i(num, "<anonymous parameter 0>");
            C41536l.m120489i(str, "prodType");
            return str;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel$c */
    static final class C22819c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationViewModel$ViewModel f60163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22819c(DepositApplicationViewModel$ViewModel depositApplicationViewModel$ViewModel) {
            super(1);
            this.f60163d = depositApplicationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "prodType");
            C40749p O = this.f60163d.f60152d.mo63953a(str).mo95075O();
            C41536l.m120488h(O, "getCurrencies(prodType)\n…          .toObservable()");
            return C31270e.m92879h(O, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel$d */
    static final class C22820d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationViewModel$ViewModel f60164d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22820d(DepositApplicationViewModel$ViewModel depositApplicationViewModel$ViewModel) {
            super(1);
            this.f60164d = depositApplicationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo56878a(C31128a aVar) {
            this.f60164d.mo56873z().mo4826r(aVar);
            DepositApplicationViewModel$ViewModel depositApplicationViewModel$ViewModel = this.f60164d;
            C41536l.m120488h(aVar, "result");
            depositApplicationViewModel$ViewModel.m74029rw(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56878a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel$e */
    static final class C22821e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f60165d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22821e(String str) {
            super(1);
            this.f60165d = str;
        }

        /* renamed from: a */
        public final C27487a invoke(C27487a aVar) {
            C41536l.m120489i(aVar, "$this$updateForm");
            return C27487a.m85254c(aVar, (DepositTypeDetailsUiModel) null, (C43075l) null, (BigDecimal) null, this.f60165d, (Date) null, (WithdrawalTypeUiModel) null, 55, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel$f */
    static final class C22822f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationViewModel$ViewModel f60166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22822f(DepositApplicationViewModel$ViewModel depositApplicationViewModel$ViewModel) {
            super(1);
            this.f60166d = depositApplicationViewModel$ViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo56880a(java.util.List r4) {
            /*
                r3 = this;
                java.lang.String r0 = "currencies"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel r0 = r3.f60166d
                pa0.a r0 = r0.mo56869ur()
                java.lang.String r0 = r0.mo66794h()
                ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel r1 = r3.f60166d
                pa0.a r1 = r1.mo56848Vt()
                if (r1 == 0) goto L_0x001c
                java.lang.String r1 = r1.mo66794h()
                goto L_0x001d
            L_0x001c:
                r1 = 0
            L_0x001d:
                boolean r2 = ie1.C41358y.m119999O(r4, r0)
                if (r2 == 0) goto L_0x0024
                goto L_0x004b
            L_0x0024:
                int r0 = r4.size()
                r2 = 1
                if (r0 != r2) goto L_0x0033
                java.lang.Object r4 = ie1.C41358y.m120007W(r4)
                r0 = r4
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x004b
            L_0x0033:
                boolean r0 = ie1.C41358y.m119999O(r4, r1)
                if (r0 == 0) goto L_0x003b
                r0 = r1
                goto L_0x004b
            L_0x003b:
                java.lang.String r0 = "GEL"
                boolean r1 = r4.contains(r0)
                if (r1 == 0) goto L_0x0044
                goto L_0x004b
            L_0x0044:
                java.lang.Object r4 = ie1.C41358y.m120009Y(r4)
                r0 = r4
                java.lang.String r0 = (java.lang.String) r0
            L_0x004b:
                ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel r4 = r3.f60166d
                r4.mo56854fi(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel.C22822f.mo56880a(java.util.List):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56880a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel$g */
    static final class C22823g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationViewModel$ViewModel f60167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22823g(DepositApplicationViewModel$ViewModel depositApplicationViewModel$ViewModel) {
            super(1);
            this.f60167d = depositApplicationViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60167d.mo56854fi((String) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel$h */
    /* synthetic */ class C22824h extends C41535k implements C43075l {
        C22824h(Object obj) {
            super(1, obj, DepositApplicationViewModel$ViewModel.class, "isValidAmount", "isValidAmount(Ljava/math/BigDecimal;)Z", 0);
        }

        /* renamed from: b */
        public final Boolean invoke(BigDecimal bigDecimal) {
            return Boolean.valueOf(((DepositApplicationViewModel$ViewModel) this.receiver).mo56868ub(bigDecimal));
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel$i */
    static final class C22825i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationViewModel$ViewModel f60168d;

        /* renamed from: e */
        final /* synthetic */ int f60169e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22825i(DepositApplicationViewModel$ViewModel depositApplicationViewModel$ViewModel, int i) {
            super(1);
            this.f60168d = depositApplicationViewModel$ViewModel;
            this.f60169e = i;
        }

        /* renamed from: a */
        public final C27487a invoke(C27487a aVar) {
            C41536l.m120489i(aVar, "$this$updateForm");
            List gw = this.f60168d.f60156h;
            if (gw == null) {
                C41536l.m120506z("deposits");
                gw = null;
            }
            return C27487a.m85254c(aVar, (DepositTypeDetailsUiModel) gw.get(this.f60169e), (C43075l) null, (BigDecimal) null, (String) null, (Date) null, (WithdrawalTypeUiModel) null, 62, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepositApplicationViewModel$ViewModel(C25364a aVar, C29664a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getCurrencies");
        C41536l.m120489i(aVar2, "depositFirstStepDelegate");
        this.f60152d = aVar;
        this.f60153e = aVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f60159k = h1;
        this.f60160l = -1;
        bindToLifecycle(init(aVar2));
        mo56844P8();
        m74025nw();
        mo56843Oe();
        mo56857hk();
    }

    /* renamed from: nw */
    private final void m74025nw() {
        C40749p L0 = C40749p.m118047l0(this.f60159k.mo95043y(), onRefresh().mo95014Y0(this.f60159k, new C27957c(C22818b.f60162d))).mo94989L0(new C27958d(new C22819c(this)));
        C41536l.m120488h(L0, "private fun observeDepos…ndToLifecycle()\n        }");
        C41205b F0 = mo56859in(C32343x.m95413R0(L0)).mo94981F0(new C27959e(new C22820d(this)));
        C41536l.m120488h(F0, "private fun observeDepos…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final String m74026ow(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (String) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final C40754t m74027pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m74028qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public final void m74029rw(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C22822f(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C22823g(this), 1, (Object) null);
    }

    /* renamed from: B8 */
    public void mo56837B8(C31128a aVar) {
        C41536l.m120489i(aVar, "newValue");
        this.f60153e.mo56837B8(aVar);
    }

    /* renamed from: E4 */
    public int mo56838E4() {
        List list = (List) mo56856h0().mo4814f();
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: Hc */
    public LiveData mo56839Hc() {
        return this.f60153e.mo56839Hc();
    }

    /* renamed from: Jk */
    public boolean mo56840Jk() {
        return this.f60153e.mo56840Jk();
    }

    /* renamed from: K */
    public void mo56841K(int i) {
        this.f60153e.mo56841K(i);
    }

    /* renamed from: Nr */
    public void mo56842Nr(String str, boolean z) {
        this.f60153e.mo56842Nr(str, z);
    }

    /* renamed from: Oe */
    public void mo56843Oe() {
        this.f60153e.mo56843Oe();
    }

    /* renamed from: P8 */
    public void mo56844P8() {
        this.f60153e.mo56844P8();
    }

    /* renamed from: Pn */
    public void mo56845Pn() {
        this.f60153e.mo56845Pn();
    }

    /* renamed from: Q6 */
    public void mo56846Q6() {
        this.f60153e.mo56846Q6();
    }

    /* renamed from: Up */
    public void mo56847Up(C31128a aVar) {
        C41536l.m120489i(aVar, "newValue");
        this.f60153e.mo56847Up(aVar);
    }

    /* renamed from: Vt */
    public C27487a mo56848Vt() {
        return this.f60153e.mo56848Vt();
    }

    /* renamed from: Yi */
    public Date mo56849Yi(int i) {
        return this.f60153e.mo56849Yi(i);
    }

    /* renamed from: Z3 */
    public LiveData mo56850Z3() {
        return this.f60153e.mo56850Z3();
    }

    /* renamed from: Z6 */
    public void mo56851Z6(String str) {
        this.f60153e.mo56851Z6(str);
    }

    /* renamed from: e */
    public LiveData mo56852e() {
        return this.f60153e.mo56852e();
    }

    /* renamed from: f5 */
    public LiveData mo56853f5() {
        return this.f60153e.mo56853f5();
    }

    /* renamed from: fi */
    public void mo56854fi(String str) {
        C29665b.C29666a.m90080c(this, new C22821e(str), false, 2, (Object) null);
    }

    /* renamed from: gv */
    public void mo56855gv() {
        this.f60153e.mo56855gv();
    }

    /* renamed from: hk */
    public void mo56857hk() {
        this.f60153e.mo56857hk();
    }

    /* renamed from: i9 */
    public void mo56858i9(C43075l lVar, boolean z) {
        C41536l.m120489i(lVar, "update");
        this.f60153e.mo56858i9(lVar, z);
    }

    /* renamed from: in */
    public C40749p mo56859in(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        return this.f60153e.mo56859in(pVar);
    }

    /* renamed from: jw */
    public C1644x mo56873z() {
        return this.f60158j;
    }

    /* renamed from: kh */
    public void mo56861kh(int i) {
        int i2 = i;
        List list = null;
        mo56847Up(new C31128a.C31131c(C41341q.m119907j(), 0, 2, (DefaultConstructorMarker) null));
        mo56837B8(new C31128a.C31131c(C41233s.m119492a(InterestRateUiModel.f60141i.mo56821a(), (Object) null), 0, 2, (DefaultConstructorMarker) null));
        if (!mo56840Jk()) {
            List list2 = this.f60156h;
            if (list2 == null) {
                C41536l.m120506z("deposits");
                list2 = null;
            }
            mo56865mk(new C27487a((DepositTypeDetailsUiModel) C41358y.m120007W(list2), new C22824h(this), (BigDecimal) null, (String) null, (Date) null, (WithdrawalTypeUiModel) null, 60, (DefaultConstructorMarker) null));
        } else {
            mo56867nf(C27487a.m85254c(mo56869ur(), (DepositTypeDetailsUiModel) null, (C43075l) null, (BigDecimal) null, (String) null, (Date) null, (WithdrawalTypeUiModel) null, 63, (Object) null));
            mo56865mk(C27487a.m85254c(mo56869ur(), (DepositTypeDetailsUiModel) null, (C43075l) null, (BigDecimal) null, (String) null, (Date) null, (WithdrawalTypeUiModel) null, 7, (Object) null));
            C29665b.C29666a.m90080c(this, new C22825i(this, i2), false, 2, (Object) null);
        }
        C40767b bVar = this.f60159k;
        List list3 = this.f60156h;
        if (list3 == null) {
            C41536l.m120506z("deposits");
        } else {
            list = list3;
        }
        bVar.onNext(((DepositTypeDetailsUiModel) list.get(i2)).mo57229p());
        mo56846Q6();
    }

    /* renamed from: kw */
    public C1644x mo56856h0() {
        return this.f60157i;
    }

    /* renamed from: lw */
    public final C27955a mo56863lw() {
        return this.f60154f;
    }

    /* renamed from: m */
    public LiveData mo56864m() {
        return this.f60153e.mo56864m();
    }

    /* renamed from: mk */
    public void mo56865mk(C27487a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f60153e.mo56865mk(aVar);
    }

    /* renamed from: mw */
    public final C27956b mo56866mw() {
        return this.f60155g;
    }

    /* renamed from: nf */
    public void mo56867nf(C27487a aVar) {
        this.f60153e.mo56867nf(aVar);
    }

    /* renamed from: ub */
    public boolean mo56868ub(BigDecimal bigDecimal) {
        return this.f60153e.mo56868ub(bigDecimal);
    }

    /* renamed from: ur */
    public C27487a mo56869ur() {
        return this.f60153e.mo56869ur();
    }

    /* renamed from: vi */
    public LiveData mo56870vi() {
        return this.f60153e.mo56870vi();
    }

    /* renamed from: ws */
    public void mo56871ws(long j) {
        this.f60153e.mo56871ws(j);
    }

    /* renamed from: y7 */
    public void mo56872y7(List list, C25695d dVar, long j) {
        C41536l.m120489i(list, "deposits");
        this.f60160l = j;
        this.f60156h = C41358y.m120030t0(list, new C22817a(dVar));
        C1644x kw = mo56856h0();
        List list2 = this.f60156h;
        if (list2 == null) {
            C41536l.m120506z("deposits");
            list2 = null;
        }
        kw.mo4823o(list2);
    }

    /* renamed from: z1 */
    public LiveData mo56874z1() {
        return this.f60153e.mo56874z1();
    }
}

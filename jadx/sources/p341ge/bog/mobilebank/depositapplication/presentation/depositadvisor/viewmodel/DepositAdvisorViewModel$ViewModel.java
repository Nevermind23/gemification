package p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import db0.C19956a;
import db0.C19960e;
import db0.C19961f;
import db0.C19962g;
import db0.C19963h;
import db0.C19964i;
import db0.C19965j;
import db0.C19966k;
import db0.C19967l;
import ed0.C20217b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import ja0.C25370f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ka0.C25695d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.UserInfo;
import p380ck.C10464h;
import ue1.C43075l;
import ue1.C43079p;
import za0.C30269a;
import za0.C30271b;
import za0.C30276d;
import za0.C30277e;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel */
public final class DepositAdvisorViewModel$ViewModel extends C21481a implements C19960e, C22948b {

    /* renamed from: p */
    public static final C22941e f60355p = new C22941e((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C20217b f60356d;

    /* renamed from: e */
    private final C25370f f60357e;

    /* renamed from: f */
    private final Client f60358f;

    /* renamed from: g */
    private final C30269a f60359g;

    /* renamed from: h */
    private final C19960e f60360h = this;

    /* renamed from: i */
    private final C22948b f60361i = this;

    /* renamed from: j */
    private List f60362j;

    /* renamed from: k */
    private final C1644x f60363k = new C1644x();

    /* renamed from: l */
    private final C1644x f60364l = new C1644x(C32343x.m95466m(C19956a.DEPOSIT_REASON));

    /* renamed from: m */
    private final C1644x f60365m = new C1644x();

    /* renamed from: n */
    private final C40767b f60366n;

    /* renamed from: o */
    private DepositTypeDetailsUiModel f60367o;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel$a */
    static final class C22937a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22937a f60368d = new C22937a();

        C22937a() {
            super(1);
        }

        /* renamed from: a */
        public final C41224m invoke(C19956a aVar) {
            C41536l.m120489i(aVar, "pageType");
            return C41233s.m119492a(-1, aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel$b */
    static final class C22938b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C22938b f60369d = new C22938b();

        C22938b() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(Integer num, C19956a aVar) {
            C41536l.m120489i(num, "requestCode");
            C41536l.m120489i(aVar, "pageType");
            return C41233s.m119492a(num, aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel$c */
    static final class C22939c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositAdvisorViewModel$ViewModel f60370d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22939c(DepositAdvisorViewModel$ViewModel depositAdvisorViewModel$ViewModel) {
            super(1);
            this.f60370d = depositAdvisorViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            int intValue = ((Number) mVar.mo95675a()).intValue();
            C19956a aVar = (C19956a) mVar.mo95676b();
            DepositAdvisorViewModel$ViewModel depositAdvisorViewModel$ViewModel = this.f60370d;
            C41536l.m120488h(aVar, "pageType");
            C40749p w = depositAdvisorViewModel$ViewModel.m74347Aw(aVar).mo95039w(200, TimeUnit.MILLISECONDS);
            C41536l.m120488h(w, "getObservable(pageType)\n…0, TimeUnit.MILLISECONDS)");
            return C31270e.m92879h(w, intValue);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel$d */
    static final class C22940d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositAdvisorViewModel$ViewModel f60371d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22940d(DepositAdvisorViewModel$ViewModel depositAdvisorViewModel$ViewModel) {
            super(1);
            this.f60371d = depositAdvisorViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo57084a(C31128a aVar) {
            this.f60371d.mo57077hs().mo4823o(C32343x.m95466m(aVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57084a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel$e */
    public static final class C22941e {
        private C22941e() {
        }

        public /* synthetic */ C22941e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel$f */
    public static final class C22942f {

        /* renamed from: a */
        private final ArrayList f60372a;

        /* renamed from: b */
        private final C25695d f60373b;

        /* renamed from: c */
        private final Long f60374c;

        public C22942f(ArrayList arrayList, C25695d dVar, Long l) {
            C41536l.m120489i(arrayList, "deposits");
            C41536l.m120489i(dVar, "recommendedDepositType");
            this.f60372a = arrayList;
            this.f60373b = dVar;
            this.f60374c = l;
        }

        /* renamed from: a */
        public final ArrayList mo57085a() {
            return this.f60372a;
        }

        /* renamed from: b */
        public final C25695d mo57086b() {
            return this.f60373b;
        }

        /* renamed from: c */
        public final Long mo57087c() {
            return this.f60374c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22942f)) {
                return false;
            }
            C22942f fVar = (C22942f) obj;
            return C41536l.m120484d(this.f60372a, fVar.f60372a) && this.f60373b == fVar.f60373b && C41536l.m120484d(this.f60374c, fVar.f60374c);
        }

        public int hashCode() {
            int hashCode = ((this.f60372a.hashCode() * 31) + this.f60373b.hashCode()) * 31;
            Long l = this.f60374c;
            return hashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            ArrayList arrayList = this.f60372a;
            C25695d dVar = this.f60373b;
            Long l = this.f60374c;
            return "DepositRecommendation(deposits=" + arrayList + ", recommendedDepositType=" + dVar + ", selectedPurposeId=" + l + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel$g */
    public /* synthetic */ class C22943g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60375a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f60376b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                db0.a[] r0 = db0.C19956a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                db0.a r2 = db0.C19956a.DEPOSIT_REASON     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                db0.a r3 = db0.C19956a.DEPOSIT_TERM     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                db0.a r3 = db0.C19956a.DEPOSIT_PURPOSE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f60375a = r0
                za0.e[] r0 = za0.C30277e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                za0.e r3 = za0.C30277e.SPECIFIED_DURATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                za0.e r1 = za0.C30277e.UNSPECIFIED_DURATION     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f60376b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel.C22943g.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel$h */
    /* synthetic */ class C22944h extends C41535k implements C43075l {
        C22944h(Object obj) {
            super(1, obj, C30269a.class, "transformDepositPeriod", "transformDepositPeriod(Ljava/util/List;)Lge/bog/mobilebank/depositapplication/presentation/depositadvisor/DepositAdvisorPageData;", 0);
        }

        /* renamed from: b */
        public final C30271b invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C30269a) this.receiver).mo70588b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel$i */
    /* synthetic */ class C22945i extends C41535k implements C43075l {
        C22945i(Object obj) {
            super(1, obj, C30269a.class, "transformDepositPoints", "transformDepositPoints(Ljava/util/List;)Lge/bog/mobilebank/depositapplication/presentation/depositadvisor/DepositAdvisorPageData;", 0);
        }

        /* renamed from: b */
        public final C30271b invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C30269a) this.receiver).mo70589c(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel$j */
    /* synthetic */ class C22946j extends C41535k implements C43075l {
        C22946j(Object obj) {
            super(1, obj, C30269a.class, "transformDepositPurposes", "transformDepositPurposes(Ljava/util/List;)Lge/bog/mobilebank/depositapplication/presentation/depositadvisor/DepositAdvisorPageData;", 0);
        }

        /* renamed from: b */
        public final C30271b invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C30269a) this.receiver).mo70590d(list);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepositAdvisorViewModel$ViewModel(C20217b bVar, C25370f fVar, Client client, C30269a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getLookup");
        C41536l.m120489i(fVar, "getDepositPurposeUseCase");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(aVar, "depositAdvisorHelper");
        this.f60356d = bVar;
        this.f60357e = fVar;
        this.f60358f = client;
        this.f60359g = aVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<AdvisorPageType>()");
        this.f60366n = h1;
        C41205b F0 = C40749p.m118047l0(h1.mo95026k0(new C19961f(C22937a.f60368d)), onRefresh().mo95014Y0(h1, new C19962g(C22938b.f60369d))).mo94989L0(new C19963h(new C22939c(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C19964i(new C22940d(this)));
        C41536l.m120488h(F0, "merge(\n                q…Value(result.asEvent()) }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public final C40749p m74347Aw(C19956a aVar) {
        int i = C22943g.f60375a[aVar.ordinal()];
        if (i == 1) {
            return m74366uw();
        }
        if (i == 2) {
            return m74364sw();
        }
        if (i == 3) {
            return m74368ww();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: Ew */
    private final void m74348Ew(String str, String str2) {
        C32343x.m95397J0(this, "deposit_application", str2, str, C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C41224m m74356kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C41224m m74357lw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C40754t m74358mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m74359nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: pw */
    private final void m74361pw(C30276d dVar, C30277e eVar) {
        DepositTypeDetailsUiModel depositTypeDetailsUiModel;
        List list = null;
        if (dVar == C30276d.SPECIFIC_GOAL) {
            List list2 = this.f60362j;
            if (list2 == null) {
                C41536l.m120506z("deposits");
            } else {
                list = list2;
            }
            this.f60367o = m74363rw(list, C25695d.ENLARG);
            return;
        }
        if (eVar == C30277e.UNSPECIFIED_DURATION) {
            UserInfo client = this.f60358f.getUserInfo().getClient();
            if (client.isSoloClient() || client.isSoloClubClient(this.f60358f.getUserInfo().getActivePackageName())) {
                List list3 = this.f60362j;
                if (list3 == null) {
                    C41536l.m120506z("deposits");
                } else {
                    list = list3;
                }
                depositTypeDetailsUiModel = m74363rw(list, C25695d.PREMIUM);
            } else {
                List list4 = this.f60362j;
                if (list4 == null) {
                    C41536l.m120506z("deposits");
                } else {
                    list = list4;
                }
                depositTypeDetailsUiModel = m74363rw(list, C25695d.CALL);
            }
        } else {
            List list5 = this.f60362j;
            if (list5 == null) {
                C41536l.m120506z("deposits");
            } else {
                list = list5;
            }
            depositTypeDetailsUiModel = m74363rw(list, C25695d.TERM);
        }
        this.f60367o = depositTypeDetailsUiModel;
    }

    /* renamed from: qw */
    static /* synthetic */ void m74362qw(DepositAdvisorViewModel$ViewModel depositAdvisorViewModel$ViewModel, C30276d dVar, C30277e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = null;
        }
        if ((i & 2) != 0) {
            eVar = null;
        }
        depositAdvisorViewModel$ViewModel.m74361pw(dVar, eVar);
    }

    /* renamed from: rw */
    private final DepositTypeDetailsUiModel m74363rw(List list, C25695d dVar) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DepositTypeDetailsUiModel) obj).mo57218e() == dVar) {
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
        return (DepositTypeDetailsUiModel) obj;
    }

    /* renamed from: sw */
    private final C40749p m74364sw() {
        C40749p O = this.f60356d.mo48650b("DEPOSIT_APP_ADVISOR_2").mo95062A(new C19965j(new C22944h(this.f60359g))).mo95075O();
        C41536l.m120488h(O, "getLookup(DEPOSIT_APP_AD…          .toObservable()");
        return O;
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final C30271b m74365tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C30271b) lVar.invoke(obj);
    }

    /* renamed from: uw */
    private final C40749p m74366uw() {
        C40749p O = this.f60356d.mo48650b("DEPOSIT_APP_ADVISOR_1").mo95062A(new C19966k(new C22945i(this.f60359g))).mo95075O();
        C41536l.m120488h(O, "getLookup(DEPOSIT_APP_AD…          .toObservable()");
        return O;
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final C30271b m74367vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C30271b) lVar.invoke(obj);
    }

    /* renamed from: ww */
    private final C40749p m74368ww() {
        C40749p O = this.f60357e.mo63958a("").mo95062A(new C19967l(new C22946j(this.f60359g))).mo95075O();
        C41536l.m120488h(O, "getDepositPurposeUseCase…          .toObservable()");
        return O;
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final C30271b m74369xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C30271b) lVar.invoke(obj);
    }

    /* renamed from: A6 */
    public void mo48332A6(long j, String str) {
        C41536l.m120489i(str, "lookUpValue");
        C32343x.m95397J0(this, "deposit_application", str, "deposit_advisor_choose_purpose", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
        DepositTypeDetailsUiModel depositTypeDetailsUiModel = this.f60367o;
        if (depositTypeDetailsUiModel != null) {
            List list = this.f60362j;
            if (list == null) {
                C41536l.m120506z("deposits");
                list = null;
            }
            mo57076Pb().mo4823o(C32343x.m95466m(new C22942f(new ArrayList(list), depositTypeDetailsUiModel.mo57218e(), Long.valueOf(j))));
        }
    }

    /* renamed from: Bw */
    public final C22948b mo57073Bw() {
        return this.f60361i;
    }

    /* renamed from: Cw */
    public C1644x mo57077hs() {
        return this.f60363k;
    }

    /* renamed from: Dw */
    public C1644x mo57076Pb() {
        return this.f60365m;
    }

    /* renamed from: Zb */
    public void mo48333Zb(C30277e eVar) {
        C41536l.m120489i(eVar, "type");
        C19956a aVar = C19956a.DEPOSIT_PURPOSE;
        int i = C22943g.f60376b[eVar.ordinal()];
        if (i == 1) {
            m74348Ew("deposit_advisor_deposit_period", "specific_period");
        } else if (i == 2) {
            m74348Ew("deposit_advisor_deposit_period", "without_period");
        }
        mo57078lm().mo4823o(C32343x.m95466m(aVar));
        m74362qw(this, (C30276d) null, eVar, 1, (Object) null);
    }

    /* renamed from: ch */
    public void mo48334ch(C30276d dVar) {
        C19956a aVar;
        C41536l.m120489i(dVar, "type");
        if (dVar == C30276d.ADDITIONAL_MONEY) {
            m74348Ew("deposit_advisor_motive", "have_money");
            aVar = C19956a.DEPOSIT_TERM;
        } else {
            m74348Ew("deposit_advisor_motive", "have_goal");
            aVar = C19956a.DEPOSIT_PURPOSE;
        }
        mo57078lm().mo4823o(C32343x.m95466m(aVar));
        m74362qw(this, dVar, (C30277e) null, 2, (Object) null);
    }

    /* renamed from: g7 */
    public void mo48335g7(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "deposits");
        this.f60362j = arrayList;
    }

    /* renamed from: vq */
    public void mo48336vq(C19956a aVar) {
        C41536l.m120489i(aVar, "pageType");
        this.f60366n.onNext(aVar);
    }

    /* renamed from: yw */
    public final C19960e mo57079yw() {
        return this.f60360h;
    }

    /* renamed from: zw */
    public C1644x mo57078lm() {
        return this.f60364l;
    }
}

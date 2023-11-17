package p341ge.bog.mobilebank.cleanarch.presentation.home.viewmodel;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import b50.C19333a;
import c41.C31270e;
import com.google.gson.C5494h;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import d50.C19909b;
import de1.C40640a;
import e61.C31671d;
import e61.C31680j;
import e61.C31681k;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g61.C32104a;
import g91.C32333s0;
import g91.C32343x;
import gd1.C40992a;
import h50.C24882b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import hh0.C25012f;
import hh0.C25015i;
import i20.C25103c;
import i20.C25105e;
import ih0.C25208a;
import ih0.C25209b;
import iu0.C36546y;
import j20.C25307a;
import j20.C25309b;
import j20.C25310c;
import j51.C36735g;
import j70.C25346f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k20.C25573a0;
import k20.C25578b0;
import k20.C25579c;
import k20.C25580c0;
import k20.C25581d;
import k20.C25582d0;
import k20.C25583e;
import k20.C25584e0;
import k20.C25585f;
import k20.C25586f0;
import k20.C25587g;
import k20.C25588g0;
import k20.C25589h;
import k20.C25590h0;
import k20.C25591i;
import k20.C25592i0;
import k20.C25593j;
import k20.C25594j0;
import k20.C25595k;
import k20.C25596k0;
import k20.C25597l;
import k20.C25598l0;
import k20.C25599m;
import k20.C25600m0;
import k20.C25601n;
import k20.C25602n0;
import k20.C25603o;
import k20.C25604o0;
import k20.C25605p;
import k20.C25606p0;
import k20.C25607q;
import k20.C25608q0;
import k20.C25609r;
import k20.C25610r0;
import k20.C25611s;
import k20.C25612s0;
import k20.C25613t;
import k20.C25614t0;
import k20.C25615u;
import k20.C25616u0;
import k20.C25617v;
import k20.C25618v0;
import k20.C25619w;
import k20.C25620w0;
import k20.C25621x;
import k20.C25622x0;
import k20.C25623y;
import k20.C25624y0;
import k20.C25625z;
import k30.C25627a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l30.C25803a;
import l50.C25826f;
import l50.C25835o;
import l50.C25840t;
import m41.C37224b;
import m50.C26144b;
import m51.C37228a;
import md0.C26186e;
import md0.C26191f;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanners;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail;
import p341ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.C21770a;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.LoanInvoiceWrapper;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p380ck.C10463g;
import p724cq.C19786a;
import p724cq.C19787b;
import p729cv.C19797a;
import p729cv.C19799c;
import p729cv.C19801d;
import p737dt.C20100q;
import p738du.C20101a;
import p739dv.C20102a;
import p741dx.C20107a;
import p748eu.C20292b;
import p748eu.C20293c;
import p758fu.C20557a;
import p784hw.C25074c;
import p793iw.C25263b;
import p793iw.C25264c;
import p814kx.C25784a;
import p825ly.C26096a;
import p831mu.C26299a;
import p842nv.C26613e;
import p843nw.C26628j;
import p852ov.C27091e;
import p863pw.C27633k;
import p891su.C28261a;
import p925vv.C29167c;
import p936wv.C29581g;
import p951xz.C29877a;
import p951xz.C29878b;
import p951xz.C29879c;
import p960yx.C30122a;
import p962yz.C30124a;
import r70.C27946a;
import rm0.C28055c;
import ru0.C38345b;
import ru0.C38348d;
import su0.C38536a;
import su0.C38557c;
import t00.C28294b;
import u00.C28534b;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel */
public final class HomeFragmentViewModel extends C21481a {

    /* renamed from: n0 */
    public static final C21714a f57996n0 = new C21714a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public static final C25840t f57997o0 = new C25840t(new C25835o(new C25826f(new BigDecimal(0), (String) null), new ArrayList(), new ArrayList()), true, false, 4, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public static final C25103c f57998p0 = new C25103c(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, false, 32, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public static final ArrayList f57999q0 = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public static final C25627a f58000r0 = new C25627a(new ArrayList(), false, false, false, 12, (DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C25784a f58001A;

    /* renamed from: B */
    private final C25346f f58002B;

    /* renamed from: C */
    private final C38345b f58003C;

    /* renamed from: D */
    private final C38348d f58004D;

    /* renamed from: E */
    private final Gson f58005E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final PreferencesApiManager f58006F;

    /* renamed from: G */
    private final C30122a f58007G;

    /* renamed from: H */
    private final C26096a f58008H;

    /* renamed from: I */
    private final C20100q f58009I;

    /* renamed from: J */
    private final C27946a f58010J;

    /* renamed from: K */
    private final C31671d f58011K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C31681k f58012L;

    /* renamed from: M */
    private final C31680j f58013M;

    /* renamed from: N */
    private final C25015i f58014N;

    /* renamed from: O */
    private final C25012f f58015O;

    /* renamed from: P */
    private AtomicBoolean f58016P = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public LoansWrapper f58017Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final C1644x f58018R = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final C1644x f58019S = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final C1644x f58020T = new C1644x();

    /* renamed from: U */
    private final C1644x f58021U = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C1644x f58022V = new C1644x();

    /* renamed from: W */
    private final C1644x f58023W = new C1644x();

    /* renamed from: X */
    private final C1644x f58024X = new C1644x();

    /* renamed from: Y */
    private final C1644x f58025Y = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C1644x f58026Z = new C1644x();

    /* renamed from: a0 */
    private final C1644x f58027a0 = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final C1644x f58028b0 = new C1644x();

    /* renamed from: c0 */
    private final C40767b f58029c0;

    /* renamed from: d */
    private final C26628j f58030d;

    /* renamed from: d0 */
    private final C1644x f58031d0;

    /* renamed from: e */
    private final C19801d f58032e;

    /* renamed from: e0 */
    private final C1644x f58033e0;

    /* renamed from: f */
    private final C25074c f58034f;

    /* renamed from: f0 */
    private final C1644x f58035f0;

    /* renamed from: g */
    private final C19797a f58036g;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final C1644x f58037g0;

    /* renamed from: h */
    private final C19799c f58038h;

    /* renamed from: h0 */
    private final C1644x f58039h0;

    /* renamed from: i */
    private final C20107a f58040i;

    /* renamed from: i0 */
    private final C1644x f58041i0;

    /* renamed from: j */
    private final C26613e f58042j;

    /* renamed from: j0 */
    private final C1644x f58043j0;

    /* renamed from: k */
    private final C29167c f58044k;

    /* renamed from: k0 */
    private final C1644x f58045k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C29877a f58046l;

    /* renamed from: l0 */
    private final C1644x f58047l0;

    /* renamed from: m */
    private final C29878b f58048m;

    /* renamed from: m0 */
    private final C1644x f58049m0;

    /* renamed from: n */
    private final C20293c f58050n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C26144b f58051o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C25307a f58052p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C28294b f58053q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C25803a f58054r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C25309b f58055s;

    /* renamed from: t */
    private final C20292b f58056t;

    /* renamed from: u */
    private final C25310c f58057u;

    /* renamed from: v */
    private final C19786a f58058v;

    /* renamed from: w */
    private final C19787b f58059w;

    /* renamed from: x */
    private final C29879c f58060x;

    /* renamed from: y */
    private final C28055c f58061y;

    /* renamed from: z */
    private final C36735g f58062z;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$a */
    public static final class C21714a {
        private C21714a() {
        }

        public /* synthetic */ C21714a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25840t mo54237a() {
            return HomeFragmentViewModel.f57997o0;
        }

        /* renamed from: b */
        public final C25103c mo54238b() {
            return HomeFragmentViewModel.f57998p0;
        }

        /* renamed from: c */
        public final C25627a mo54239c() {
            return HomeFragmentViewModel.f58000r0;
        }

        /* renamed from: d */
        public final ArrayList mo54240d() {
            return HomeFragmentViewModel.f57999q0;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$a0 */
    static final class C21715a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58063d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21715a0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58063d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C21770a.C21771a invoke(C29581g gVar) {
            C41536l.m120489i(gVar, "it");
            return this.f58063d.f58055s.mo63873a(gVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$b */
    static final class C21716b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58064d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21716b(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58064d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C21503d invoke(C21503d dVar) {
            if (!this.f58064d.f58012L.invoke()) {
                dVar = new C21503d.C21506c(new C25105e(C41341q.m119907j()));
            }
            C41536l.m120488h(dVar, "if (!shouldShowBanners()…del(emptyList())) else it");
            return dVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$b0 */
    static final class C21717b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58065d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21717b0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58065d = homeFragmentViewModel;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            HomeFragmentViewModel homeFragmentViewModel = this.f58065d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(homeFragmentViewModel.f58054r.mo64440d((C27091e) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$c */
    static final class C21718c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58066d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$c$a */
        static final class C21719a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ HomeFragmentViewModel f58067d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21719a(HomeFragmentViewModel homeFragmentViewModel) {
                super(1);
                this.f58067d = homeFragmentViewModel;
            }

            /* renamed from: a */
            public final void mo54245a(boolean z) {
                this.f58067d.f58028b0.mo4823o(Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo54245a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$c$b */
        static final class C21720b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ HomeFragmentViewModel f58068d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21720b(HomeFragmentViewModel homeFragmentViewModel) {
                super(1);
                this.f58068d = homeFragmentViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f58068d.f58028b0.mo4823o(Boolean.FALSE);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21718c(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58066d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54244a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C21719a(this.f58066d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C21720b(this.f58066d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54244a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$c0 */
    /* synthetic */ class C21721c0 extends C41535k implements C43075l {
        C21721c0(Object obj) {
            super(1, obj, C1644x.class, "postValue", "postValue(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final void mo54247b(C25209b bVar) {
            ((C1644x) this.receiver).mo4823o(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54247b((C25209b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$d */
    static final class C21722d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21722d(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58069d = homeFragmentViewModel;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f58069d.m70349Nx(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$d0 */
    static final class C21723d0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21723d0 f58070d = new C21723d0();

        C21723d0() {
            super(1);
        }

        /* renamed from: a */
        public final void mo54249a(BankApiResponse bankApiResponse) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54249a((BankApiResponse) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$e */
    /* synthetic */ class C21724e extends C41535k implements C43075l {
        C21724e(Object obj) {
            super(1, obj, C26096a.class, "transform", "transformNboOffers(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C26096a) this.receiver).mo65015b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$e0 */
    static final class C21725e0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21725e0 f58071d = new C21725e0();

        C21725e0() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$f */
    /* synthetic */ class C21726f extends C41535k implements C43075l {
        C21726f(Object obj) {
            super(1, obj, C27946a.class, "transformStories", "transformStories(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C27946a) this.receiver).mo67514a(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$f0 */
    static final class C21727f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58072d;

        /* renamed from: e */
        final /* synthetic */ boolean f58073e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21727f0(HomeFragmentViewModel homeFragmentViewModel, boolean z) {
            super(1);
            this.f58072d = homeFragmentViewModel;
            this.f58073e = z;
        }

        /* renamed from: a */
        public final void mo54253a(C37228a aVar) {
            C21503d.C21506c cVar;
            C25840t tVar;
            C41536l.m120489i(aVar, "loginInfo");
            this.f58072d.f58006F.collapseAmount(String.valueOf(aVar.mo90305b()), this.f58073e);
            Object f = this.f58072d.f58018R.mo4814f();
            if (f instanceof C21503d.C21506c) {
                cVar = (C21503d.C21506c) f;
            } else {
                cVar = null;
            }
            if (cVar != null && (tVar = (C25840t) cVar.mo53701a()) != null) {
                C21484c.m69418j(this.f58072d.f58018R, C25840t.m81231b(tVar, (C25835o) null, this.f58073e, false, 5, (Object) null));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54253a((C37228a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$g */
    static final class C21728g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21728g f58074d = new C21728g();

        C21728g() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$g0 */
    static final class C21729g0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21729g0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58075d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C21503d invoke(C21503d dVar) {
            if (!this.f58075d.f58012L.invoke()) {
                dVar = new C21503d.C21506c(Boolean.FALSE);
            }
            C41536l.m120488h(dVar, "if (!shouldShowBanners()…ce.Success(false) else it");
            return dVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$h */
    static final class C21730h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21730h f58076d = new C21730h();

        C21730h() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return C41341q.m119907j();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$h0 */
    static final class C21731h0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21731h0 f58077d = new C21731h0();

        C21731h0() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$i */
    /* synthetic */ class C21732i extends C41535k implements C43075l {
        C21732i(Object obj) {
            super(1, obj, C30122a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C30122a) this.receiver).mo70409b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$i0 */
    static final class C21733i0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21733i0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58078d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final List invoke(Throwable th) {
            C41536l.m120489i(th, "throwable");
            HomeFragmentViewModel homeFragmentViewModel = this.f58078d;
            HomeFragmentViewModel.m70326Cy(homeFragmentViewModel, homeFragmentViewModel.f58020T, th, (Object) null, 2, (Object) null);
            return HomeFragmentViewModel.f57996n0.mo54240d();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$j */
    static final class C21734j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21734j(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58079d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54260a(List list) {
            C1644x wx = this.f58079d.f58037g0;
            C41536l.m120488h(list, "it");
            wx.mo4823o(new C21503d.C21506c(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54260a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$j0 */
    static final class C21735j0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21735j0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58080d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54261a(List list) {
            if (!C41536l.m120484d(list, HomeFragmentViewModel.f57996n0.mo54240d())) {
                HomeFragmentViewModel homeFragmentViewModel = this.f58080d;
                C1644x ux = homeFragmentViewModel.f58020T;
                C41536l.m120488h(list, "data");
                homeFragmentViewModel.m70338Iy(ux, list);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54261a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$k */
    static final class C21736k extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21736k f58081d = new C21736k();

        C21736k() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$k0 */
    static final class C21737k0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21737k0 f58082d = new C21737k0();

        C21737k0() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$l */
    static final class C21738l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58083d;

        /* renamed from: e */
        final /* synthetic */ boolean f58084e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21738l(HomeFragmentViewModel homeFragmentViewModel, boolean z) {
            super(1);
            this.f58083d = homeFragmentViewModel;
            this.f58084e = z;
        }

        /* renamed from: a */
        public final void mo54264a(C37228a aVar) {
            C21503d.C21506c cVar;
            C25840t tVar;
            C41536l.m120489i(aVar, "loginInfo");
            this.f58083d.f58006F.hideAmount(String.valueOf(aVar.mo90305b()), this.f58084e);
            Object f = this.f58083d.f58018R.mo4814f();
            if (f instanceof C21503d.C21506c) {
                cVar = (C21503d.C21506c) f;
            } else {
                cVar = null;
            }
            if (cVar != null && (tVar = (C25840t) cVar.mo53701a()) != null) {
                C21484c.m69418j(this.f58083d.f58018R, C25840t.m81231b(tVar, (C25835o) null, false, this.f58084e, 3, (Object) null));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54264a((C37228a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$l0 */
    static final class C21739l0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58085d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$l0$a */
        static final class C21740a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ HomeFragmentViewModel f58086d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21740a(HomeFragmentViewModel homeFragmentViewModel) {
                super(1);
                this.f58086d = homeFragmentViewModel;
            }

            /* renamed from: a */
            public final void mo54266a(List list) {
                HomeFragmentViewModel homeFragmentViewModel = this.f58086d;
                C41536l.m120488h(list, "offers");
                homeFragmentViewModel.m70362Sx(homeFragmentViewModel.m70424py(list));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo54266a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$l0$b */
        static final class C21741b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ HomeFragmentViewModel f58087d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21741b(HomeFragmentViewModel homeFragmentViewModel) {
                super(2);
                this.f58087d = homeFragmentViewModel;
            }

            /* renamed from: a */
            public final C25627a invoke(List list, C30124a aVar) {
                C41536l.m120489i(list, "offers");
                C41536l.m120489i(aVar, "criPermission");
                return this.f58087d.f58054r.mo64439c(list, aVar);
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$l0$c */
        static final class C21742c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ HomeFragmentViewModel f58088d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21742c(HomeFragmentViewModel homeFragmentViewModel) {
                super(1);
                this.f58088d = homeFragmentViewModel;
            }

            /* renamed from: a */
            public final C25627a invoke(Throwable th) {
                C41536l.m120489i(th, "throwable");
                HomeFragmentViewModel homeFragmentViewModel = this.f58088d;
                HomeFragmentViewModel.m70326Cy(homeFragmentViewModel, homeFragmentViewModel.f58026Z, th, (Object) null, 2, (Object) null);
                return HomeFragmentViewModel.f57996n0.mo54239c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21739l0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58085d = homeFragmentViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m70518e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final C25627a m70519f(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C25627a) pVar.invoke(obj, obj2);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final C25627a m70520g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C25627a) lVar.invoke(obj);
        }

        /* renamed from: d */
        public final C40754t invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return C40749p.m118037d1(C40749p.m118043h0(C41341q.m119907j()).mo94978E(new C21773b(new C21740a(this.f58085d))), C29877a.m90684b(this.f58085d.f58046l, false, 1, (Object) null), new C21774c(new C21741b(this.f58085d))).mo95027o0(C40992a.m118827a()).mo95035t0(new C21775d(new C21742c(this.f58085d)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$m */
    static final class C21743m extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21743m f58089d = new C21743m();

        C21743m() {
            super(1);
        }

        /* renamed from: a */
        public final void mo54269a(C27633k kVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54269a((C27633k) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$m0 */
    static final class C21744m0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58090d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21744m0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58090d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54270a(C25627a aVar) {
            if (!C41536l.m120484d(aVar, HomeFragmentViewModel.f57996n0.mo54239c())) {
                HomeFragmentViewModel homeFragmentViewModel = this.f58090d;
                C1644x tx = homeFragmentViewModel.f58026Z;
                C41536l.m120488h(aVar, "data");
                homeFragmentViewModel.m70338Iy(tx, aVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54270a((C25627a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$n */
    static final class C21745n extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21745n f58091d = new C21745n();

        C21745n() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$n0 */
    static final class C21746n0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21746n0 f58092d = new C21746n0();

        C21746n0() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$o */
    static final class C21747o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58093d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21747o(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58093d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54273a(C41205b bVar) {
            C21484c.m69417i(this.f58093d.f58022V, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54273a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$o0 */
    static final class C21748o0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21748o0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58094d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C25840t invoke(C27633k kVar) {
            C41536l.m120489i(kVar, "accountsWithCards");
            return this.f58094d.f58051o.mo65071l(kVar, this.f58094d.m70354Px(), this.f58094d.m70357Qx());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$p */
    static final class C21749p extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21749p f58095d = new C21749p();

        C21749p() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C25264c cVar) {
            C41536l.m120489i(cVar, "it");
            return C24882b.m79537e(cVar.mo63846d());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$p0 */
    static final class C21750p0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21750p0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58096d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C25840t invoke(Throwable th) {
            C41536l.m120489i(th, "throwable");
            HomeFragmentViewModel homeFragmentViewModel = this.f58096d;
            HomeFragmentViewModel.m70326Cy(homeFragmentViewModel, homeFragmentViewModel.f58018R, th, (Object) null, 2, (Object) null);
            return HomeFragmentViewModel.f57996n0.mo54237a();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$q */
    static final class C21751q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21751q(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58097d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54277a(List list) {
            HomeFragmentViewModel homeFragmentViewModel = this.f58097d;
            C1644x sx = homeFragmentViewModel.f58022V;
            C41536l.m120488h(list, "data");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C19333a.m64785d((AccountOperation) it.next()));
            }
            homeFragmentViewModel.m70338Iy(sx, arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54277a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$q0 */
    static final class C21752q0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21752q0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58098d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54278a(C25840t tVar) {
            if (!C41536l.m120484d(tVar, HomeFragmentViewModel.f57996n0.mo54237a())) {
                HomeFragmentViewModel homeFragmentViewModel = this.f58098d;
                C1644x qx = homeFragmentViewModel.f58018R;
                C41536l.m120488h(tVar, "data");
                homeFragmentViewModel.m70338Iy(qx, tVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54278a((C25840t) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$r */
    static final class C21753r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58099d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21753r(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58099d = homeFragmentViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            HomeFragmentViewModel homeFragmentViewModel = this.f58099d;
            C1644x sx = homeFragmentViewModel.f58022V;
            C41536l.m120488h(th, "it");
            HomeFragmentViewModel.m70326Cy(homeFragmentViewModel, sx, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$r0 */
    static final class C21754r0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21754r0 f58100d = new C21754r0();

        C21754r0() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$s */
    static final class C21755s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58101d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21755s(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58101d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C21503d invoke(C21503d dVar) {
            if (!this.f58101d.f58012L.invoke()) {
                dVar = new C21503d.C21506c(new C25627a(C41341q.m119907j(), false, false, false, 6, (DefaultConstructorMarker) null));
            }
            C41536l.m120488h(dVar, "if (!shouldShowBanners()…                ) else it");
            return dVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$s0 */
    static final class C21756s0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21756s0 f58102d = new C21756s0();

        C21756s0() {
            super(1);
        }

        /* renamed from: a */
        public final LoansWrapper invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return new LoansWrapper();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$t */
    static final class C21757t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58103d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21757t(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58103d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C21503d invoke(C21503d dVar) {
            if (!this.f58103d.f58012L.invoke()) {
                dVar = new C21503d.C21506c(C41341q.m119907j());
            }
            C41536l.m120488h(dVar, "if (!shouldShowBanners()…ss((emptyList())) else it");
            return dVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$t0 */
    static final class C21758t0 extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C21758t0 f58104d = new C21758t0();

        C21758t0() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(C20102a aVar, LoansWrapper loansWrapper) {
            C41536l.m120489i(aVar, "assetLiabilities");
            C41536l.m120489i(loansWrapper, "loans");
            return C41233s.m119492a(aVar, loansWrapper);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$u */
    static final class C21759u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58105d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21759u(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58105d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C21503d invoke(C21503d dVar) {
            if (!this.f58105d.f58012L.invoke()) {
                dVar = new C21503d.C21506c(C41341q.m119907j());
            }
            C41536l.m120488h(dVar, "if (!shouldShowBanners()…ss((emptyList())) else it");
            return dVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$u0 */
    static final class C21760u0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58106d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21760u0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58106d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C25103c invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            C20102a aVar = (C20102a) mVar.mo95675a();
            LoansWrapper loansWrapper = (LoansWrapper) mVar.mo95676b();
            this.f58106d.f58017Q = loansWrapper;
            C25307a gx = this.f58106d.f58052p;
            C41536l.m120488h(aVar, "assetLiabilities");
            return gx.mo63871c(aVar, this.f58106d.m70428qy(loansWrapper), this.f58106d.m70357Qx());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$v */
    static final class C21761v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58107d;

        /* renamed from: e */
        final /* synthetic */ C1644x f58108e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21761v(HomeFragmentViewModel homeFragmentViewModel, C1644x xVar) {
            super(1);
            this.f58107d = homeFragmentViewModel;
            this.f58108e = xVar;
        }

        /* renamed from: a */
        public final void mo54287a(Object obj) {
            this.f58107d.m70338Iy(this.f58108e, obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54287a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$v0 */
    static final class C21762v0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21762v0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58109d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C25103c invoke(Throwable th) {
            C41536l.m120489i(th, "throwable");
            HomeFragmentViewModel homeFragmentViewModel = this.f58109d;
            HomeFragmentViewModel.m70326Cy(homeFragmentViewModel, homeFragmentViewModel.f58019S, th, (Object) null, 2, (Object) null);
            return HomeFragmentViewModel.f57996n0.mo54238b();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$w */
    static final class C21763w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58110d;

        /* renamed from: e */
        final /* synthetic */ C1644x f58111e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21763w(HomeFragmentViewModel homeFragmentViewModel, C1644x xVar) {
            super(1);
            this.f58110d = homeFragmentViewModel;
            this.f58111e = xVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            HomeFragmentViewModel homeFragmentViewModel = this.f58110d;
            C1644x xVar = this.f58111e;
            C41536l.m120488h(th, "throwable");
            HomeFragmentViewModel.m70326Cy(homeFragmentViewModel, xVar, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$w0 */
    static final class C21764w0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58112d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21764w0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58112d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54290a(C25103c cVar) {
            if (!C41536l.m120484d(cVar, HomeFragmentViewModel.f57996n0.mo54238b())) {
                HomeFragmentViewModel homeFragmentViewModel = this.f58112d;
                C1644x rx = homeFragmentViewModel.f58019S;
                C41536l.m120488h(cVar, "data");
                homeFragmentViewModel.m70338Iy(rx, cVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54290a((C25103c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$x */
    static final class C21765x extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21765x f58113d = new C21765x();

        C21765x() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$x0 */
    static final class C21766x0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21766x0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58114d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54292a(C41205b bVar) {
            C21484c.m69417i(this.f58114d.f58022V, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54292a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$y */
    static final class C21767y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21767y(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58115d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final C28534b invoke(C26299a aVar) {
            C41536l.m120489i(aVar, "payments");
            return this.f58115d.f58053q.mo67923a(aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$y0 */
    static final class C21768y0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HomeFragmentViewModel f58116d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21768y0(HomeFragmentViewModel homeFragmentViewModel) {
            super(1);
            this.f58116d = homeFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54294a(C19909b bVar) {
            this.f58116d.mo54236wy();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54294a((C19909b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel$z */
    static final class C21769z extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21769z f58117d = new C21769z();

        C21769z() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C25264c cVar) {
            C41536l.m120489i(cVar, "it");
            List<C25263b> d = cVar.mo63846d();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(d, 10));
            for (C25263b d2 : d) {
                arrayList.add(C19333a.m64785d(C24882b.m79536d(d2)));
            }
            return arrayList;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeFragmentViewModel(C26628j jVar, C19801d dVar, C25074c cVar, C19797a aVar, C19799c cVar2, C20107a aVar2, C26613e eVar, C29167c cVar3, C29877a aVar3, C29878b bVar, C20293c cVar4, C26144b bVar2, C25307a aVar4, C28294b bVar3, C25803a aVar5, C25309b bVar4, C20292b bVar5, C25310c cVar5, C19786a aVar6, C19787b bVar6, C29879c cVar6, C28055c cVar7, C36735g gVar, C25784a aVar7, C25346f fVar, C38345b bVar7, C38348d dVar2, Gson gson, PreferencesApiManager preferencesApiManager, C30122a aVar8, C26096a aVar9, C20100q qVar, C27946a aVar10, C31671d dVar3, C31681k kVar, C31680j jVar2, C25015i iVar, C25012f fVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C26628j jVar3 = jVar;
        C19801d dVar4 = dVar;
        C25074c cVar8 = cVar;
        C19797a aVar11 = aVar;
        C19799c cVar9 = cVar2;
        C20107a aVar12 = aVar2;
        C26613e eVar2 = eVar;
        C29167c cVar10 = cVar3;
        C29877a aVar13 = aVar3;
        C29878b bVar8 = bVar;
        C20293c cVar11 = cVar4;
        C26144b bVar9 = bVar2;
        C25307a aVar14 = aVar4;
        C25309b bVar10 = bVar4;
        C41536l.m120489i(jVar3, "getAccountsAndCardsUseCase");
        C41536l.m120489i(dVar4, "getUpcomingPayments");
        C41536l.m120489i(cVar8, "getTransactions");
        C41536l.m120489i(aVar11, "getAssetLiability");
        C41536l.m120489i(cVar9, "getProductTypeList");
        C41536l.m120489i(aVar12, "getStudentCards");
        C41536l.m120489i(eVar2, "getOfferProducts");
        C41536l.m120489i(cVar10, "budgetingBannerUseCase");
        C41536l.m120489i(aVar13, "getCreditInfoPermission");
        C41536l.m120489i(bVar8, "getPendingProductConfirmations");
        C41536l.m120489i(cVar11, "getAppSettingsUseCase");
        C41536l.m120489i(bVar9, "accountsAndCardsMapper");
        C41536l.m120489i(aVar14, "assetLiabilityMapper");
        C41536l.m120489i(bVar3, "paymentsDataMapper");
        C41536l.m120489i(aVar5, "offersDataMapper");
        C41536l.m120489i(bVar4, "budgetingMapper");
        C41536l.m120489i(bVar5, "getAppSettingByNameUseCase");
        C41536l.m120489i(cVar5, "bannerDataMapper");
        C41536l.m120489i(aVar6, "nboBannerClick");
        C41536l.m120489i(bVar6, "nboBannerRemove");
        C41536l.m120489i(cVar6, "isCreditLoanAllowedUseCase");
        C41536l.m120489i(cVar7, "getJuniorRequestData");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(aVar7, "checkIfHasAvailableCardsForGooglePay");
        C41536l.m120489i(fVar, "getLoanWithDetails");
        C41536l.m120489i(bVar7, "getNboOffers");
        C41536l.m120489i(dVar2, "hideNboOffer");
        C41536l.m120489i(gson, "gson");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(aVar8, "juniorMapper");
        C41536l.m120489i(aVar9, "nboUiMapper");
        C41536l.m120489i(qVar, "transactionPropertyUpdateEventPoster");
        C41536l.m120489i(aVar10, "storyThumbnailsMapper");
        C41536l.m120489i(dVar3, "getStoriesAndContents");
        C41536l.m120489i(kVar, "shouldShowBanners");
        C41536l.m120489i(jVar2, "shouldFilterNBO");
        C41536l.m120489i(iVar, "shouldShowGamificationBanner");
        C41536l.m120489i(fVar2, "hideGamificationBanner");
        this.f58030d = jVar3;
        this.f58032e = dVar4;
        this.f58034f = cVar8;
        this.f58036g = aVar11;
        this.f58038h = cVar9;
        this.f58040i = aVar12;
        this.f58042j = eVar2;
        this.f58044k = cVar10;
        this.f58046l = aVar13;
        this.f58048m = bVar8;
        this.f58050n = cVar11;
        this.f58051o = bVar9;
        this.f58052p = aVar14;
        this.f58053q = bVar3;
        this.f58054r = aVar5;
        this.f58055s = bVar4;
        this.f58056t = bVar5;
        this.f58057u = cVar5;
        this.f58058v = aVar6;
        this.f58059w = bVar6;
        this.f58060x = cVar6;
        this.f58061y = cVar7;
        this.f58062z = gVar;
        this.f58001A = aVar7;
        this.f58002B = fVar;
        this.f58003C = bVar7;
        this.f58004D = dVar2;
        this.f58005E = gson;
        this.f58006F = preferencesApiManager;
        this.f58007G = aVar8;
        this.f58008H = aVar9;
        this.f58009I = qVar;
        this.f58010J = aVar10;
        this.f58011K = dVar3;
        this.f58012L = kVar;
        this.f58013M = jVar2;
        this.f58014N = iVar;
        this.f58015O = fVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Boolean>()");
        this.f58029c0 = h1;
        this.f58031d0 = new C1644x();
        this.f58033e0 = new C1644x();
        this.f58035f0 = new C1644x();
        this.f58037g0 = new C1644x();
        this.f58039h0 = new C1644x();
        this.f58041i0 = new C1644x();
        this.f58043j0 = new C1644x();
        this.f58045k0 = new C1644x();
        this.f58047l0 = new C1644x();
        this.f58049m0 = new C1644x();
        mo54201Bx();
        m70444uz();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ay */
    public static final void m70321Ay(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: By */
    private final void m70323By(C1644x xVar, Throwable th, Object obj) {
        String message = th.getMessage();
        if (message != null && C40439w.m117109H(message, "Parameter specified as non-null is null: method kotlin.jvm.internal.Intrinsics.checkNotNullParameter, ", false, 2, (Object) null)) {
            String substring = message.substring(102);
            C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
            String className = th.getStackTrace()[0].getClassName();
            C41536l.m120488h(className, "exClass");
            String substring2 = className.substring(Math.max(className.length() - 90, 0));
            C41536l.m120488h(substring2, "this as java.lang.String).substring(startIndex)");
            C36546y.m108282F().mo27156w("mbank_debug", substring, "home_service_fault", substring2);
        }
        C21484c.m69414f(xVar, th, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cx */
    public static final void m70325Cx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Cy */
    static /* synthetic */ void m70326Cy(HomeFragmentViewModel homeFragmentViewModel, C1644x xVar, Throwable th, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        homeFragmentViewModel.m70323By(xVar, th, obj);
    }

    /* renamed from: Dx */
    private final void m70328Dx() {
        C40749p k0 = C26186e.m81987e(C32343x.m95462k1(C38345b.C38346a.m112650a(this.f58003C, false, true, 1, (Object) null))).mo95026k0(new C25610r0(new C21722d(this))).mo95026k0(new C25612s0(new C21724e(this.f58008H)));
        C41536l.m120488h(k0, "private fun checkNboOffe… .bindToLifecycle()\n    }");
        bindToLifecycle(C31270e.m92876e(C31270e.m92879h(k0, -1), this.f58043j0));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ex */
    public static final List m70330Ex(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fx */
    public static final List m70332Fx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: Gx */
    private final void m70334Gx() {
        C40749p k0 = C26186e.m81987e(C32343x.m95462k1(C31671d.m93811e(this.f58011K, false, 1, (Object) null))).mo95026k0(new C25608q0(new C21726f(this.f58010J)));
        C41536l.m120488h(k0, "getStoriesAndContents()\n…Mapper::transformStories)");
        bindToLifecycle(C31270e.m92876e(C31270e.m92879h(k0, -1), this.f58045k0));
    }

    /* access modifiers changed from: private */
    /* renamed from: Hx */
    public static final List m70336Hx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iy */
    public final void m70338Iy(C1644x xVar, Object obj) {
        C21484c.m69418j(xVar, obj);
    }

    /* renamed from: Jy */
    private final C40734b m70340Jy(C40762x xVar, C1644x xVar2) {
        return xVar.mo95084m(new C25596k0(new C21761v(this, xVar2))).mo95082k(new C25598l0(new C21763w(this, xVar2))).mo95092y();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ky */
    public static final void m70342Ky(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lx */
    public static final void m70344Lx(HomeFragmentViewModel homeFragmentViewModel) {
        C41536l.m120489i(homeFragmentViewModel, "this$0");
        homeFragmentViewModel.m70328Dx();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ly */
    public static final void m70345Ly(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mx */
    public static final void m70347Mx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nx */
    public final List m70349Nx(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C38536a aVar = (C38536a) next;
            if (!this.f58013M.invoke() || aVar.mo92120B() != C38557c.OFFER) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ny */
    public static final void m70350Ny(HomeFragmentViewModel homeFragmentViewModel, boolean z) {
        C41536l.m120489i(homeFragmentViewModel, "this$0");
        homeFragmentViewModel.f58029c0.onNext(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: Oy */
    public static final C28534b m70352Oy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28534b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Px */
    public final boolean m70354Px() {
        String l;
        C37228a a = this.f58062z.mo89562a();
        if (a == null || (l = Long.valueOf(a.mo90305b()).toString()) == null) {
            return true;
        }
        return this.f58006F.isCollapsedAmount(l);
    }

    /* access modifiers changed from: private */
    /* renamed from: Py */
    public static final void m70355Py(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Qx */
    public final boolean m70357Qx() {
        String l;
        C37228a a = this.f58062z.mo89562a();
        if (a == null || (l = Long.valueOf(a.mo90305b()).toString()) == null) {
            return true;
        }
        return this.f58006F.isHiddenAmount(l);
    }

    /* access modifiers changed from: private */
    /* renamed from: Qy */
    public static final List m70358Qy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ry */
    public static final C21770a.C21771a m70360Ry(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C21770a.C21771a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sx */
    public final void m70362Sx(boolean z) {
        C5494h hVar;
        try {
            C20557a b = this.f58056t.mo48775b("NBO_BANNER");
            if (b != null) {
                hVar = b.mo49085b();
            } else {
                hVar = null;
            }
            NboBanners nboBanners = (NboBanners) this.f58005E.mo18165g(hVar, NboBanners.class);
            if (nboBanners != null) {
                m70338Iy(this.f58031d0, this.f58057u.mo63876e(nboBanners, "MBANK_AUTHORIZED_HOME", z));
            }
        } catch (JsonSyntaxException e) {
            m70326Cy(this, this.f58031d0, e, (Object) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Sy */
    public static final List m70363Sy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ty */
    public static final C26191f m70365Ty(Throwable th) {
        C41536l.m120489i(th, "it");
        return new C26191f.C26194c(C41341q.m119907j());
    }

    /* access modifiers changed from: private */
    /* renamed from: Uy */
    public static final C26191f m70367Uy(Throwable th) {
        C41536l.m120489i(th, "it");
        return new C26191f.C26194c(C41341q.m119907j());
    }

    /* renamed from: Vx */
    private final void m70369Vx() {
        C41205b G0 = C26186e.m81987e(this.f58061y.mo67598a(false)).mo95035t0(new C25600m0(C21730h.f58076d)).mo95026k0(new C25602n0(new C21732i(this.f58007G))).mo94983G0(new C25604o0(new C21734j(this)), new C25606p0(C21736k.f58081d));
        C41536l.m120488h(G0, "private fun getJuniorBan…).bindToLifecycle()\n    }");
        bindToLifecycle(G0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vy */
    public static final C26191f m70370Vy(Throwable th) {
        C41536l.m120489i(th, "it");
        return new C26191f.C26194c(C41341q.m119907j());
    }

    /* access modifiers changed from: private */
    /* renamed from: Wx */
    public static final List m70372Wx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Wy */
    public static final void m70373Wy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Xx */
    public static final List m70375Xx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Xy */
    public static final void m70376Xy(C43064a aVar, HomeFragmentViewModel homeFragmentViewModel) {
        C41536l.m120489i(homeFragmentViewModel, "this$0");
        if (aVar != null) {
            aVar.invoke();
        }
        homeFragmentViewModel.f58016P.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: Yx */
    public static final void m70378Yx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zx */
    public static final void m70380Zx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zy */
    public static final void m70381Zy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public static final void m70383az(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: bz */
    private final void m70385bz(C43075l lVar) {
        C37228a a = this.f58062z.mo89562a();
        if (a != null) {
            lVar.invoke(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ez */
    public static final C25840t m70391ez(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25840t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: fz */
    public static final C25840t m70394fz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25840t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gz */
    public static final void m70397gz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hz */
    public static final void m70400hz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iz */
    public static final LoansWrapper m70403iz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (LoansWrapper) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jz */
    public static final C41224m m70406jz(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: kz */
    public static final C25103c m70409kz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25103c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lz */
    public static final C25103c m70412lz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25103c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mz */
    public static final void m70415mz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nz */
    public static final void m70418nz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: oz */
    public static final List m70421oz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: py */
    public final boolean m70424py(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((OfferInfo) obj).getProductCode(), OfferProductCode.C21008CL.f56471f)) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: pz */
    public static final void m70425pz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qy */
    public final boolean m70428qy(LoansWrapper loansWrapper) {
        ArrayList<LoanDetailsWrapper> details;
        boolean z;
        if (!(loansWrapper == null || (details = loansWrapper.getDetails()) == null)) {
            for (LoanDetailsWrapper invoice : details) {
                LoanInvoiceWrapper invoice2 = invoice.getInvoice();
                if (invoice2 != null) {
                    z = C41536l.m120484d(invoice2.isOverdue, Boolean.TRUE);
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: qz */
    public static final void m70429qz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ry */
    private final void m70432ry(boolean z) {
        m70385bz(new C21738l(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: rz */
    public static final C40754t m70433rz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sz */
    public static final void m70436sz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ty */
    public static /* synthetic */ void m70439ty(HomeFragmentViewModel homeFragmentViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        homeFragmentViewModel.mo54234sy(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: tz */
    public static final void m70440tz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: uy */
    public static final void m70443uy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: uz */
    private final void m70444uz() {
        C41205b F0 = this.f58009I.mo48494a().mo94980F(new C25614t0(new C21766x0(this))).mo95027o0(C40640a.m117458b()).mo94981F0(new C25616u0(new C21768y0(this)));
        C41536l.m120488h(F0, "private fun subscribeTra…        }\n        )\n    }");
        addDisposable(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: vy */
    public static final void m70447vy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vz */
    public static final void m70448vz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: wz */
    public static final void m70451wz(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xy */
    public static final void m70454xy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: xz */
    private final void m70455xz(boolean z) {
        C21503d.C21506c cVar;
        C25103c cVar2;
        Object f = this.f58019S.mo4814f();
        if (f instanceof C21503d.C21506c) {
            cVar = (C21503d.C21506c) f;
        } else {
            cVar = null;
        }
        if (cVar != null && (cVar2 = (C25103c) cVar.mo53701a()) != null) {
            C21484c.m69418j(this.f58019S, C25103c.m80075b(cVar2, (List) null, (List) null, (List) null, (List) null, z, false, 47, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: yy */
    public static final List m70458yy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zy */
    public static final void m70461zy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Bx */
    public final void mo54201Bx() {
        Long l;
        boolean z;
        C40762x xVar;
        PreferencesApiManager preferencesApiManager = this.f58006F;
        C37228a a = this.f58062z.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        boolean isGooglePayBannerHidden = preferencesApiManager.isGooglePayBannerHidden(String.valueOf(l));
        if (!this.f58006F.deviceCanSupportGooglePay() || !C20101a.f54724a.mo48497a(this.f58056t)) {
            z = false;
        } else {
            z = true;
        }
        if (isGooglePayBannerHidden || !z) {
            xVar = C40762x.m118162z(Boolean.FALSE);
            C41536l.m120488h(xVar, "just(false)");
        } else {
            xVar = this.f58001A.invoke();
        }
        C41205b F0 = C31270e.m92880i(C32343x.m95465l1(xVar), -1).mo94981F0(new C25588g0(new C21718c(this)));
        C41536l.m120488h(F0, "fun checkGooglePay() {\n …}.bindToLifecycle()\n    }");
        bindToLifecycle(F0);
    }

    /* renamed from: Dy */
    public final void mo54202Dy(boolean z) {
        m70432ry(z);
        m70455xz(z);
    }

    /* renamed from: Eh */
    public final LiveData mo54203Eh() {
        return C1607m0.m5655c(this.f58026Z, new C21755s(this));
    }

    /* renamed from: Ey */
    public final void mo54204Ey() {
        this.f58015O.mo63416a(C25208a.DASHBOARD);
    }

    /* renamed from: Fy */
    public final void mo54205Fy() {
        ArrayList<LoanDetailsWrapper> details;
        ArrayList<Loan> loans;
        boolean z;
        LoansWrapper loansWrapper = this.f58017Q;
        if (loansWrapper != null && (details = loansWrapper.getDetails()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = details.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                LoanInvoiceWrapper invoice = ((LoanDetailsWrapper) next).getInvoice();
                if (invoice != null) {
                    z2 = C41536l.m120484d(invoice.isOverdue, Boolean.TRUE);
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    LoanDetailsWrapper loanDetailsWrapper = (LoanDetailsWrapper) C41358y.m120007W(arrayList);
                    LoansWrapper loansWrapper2 = this.f58017Q;
                    T t = null;
                    if (!(loansWrapper2 == null || (loans = loansWrapper2.getLoans()) == null)) {
                        C41536l.m120488h(loans, "loans");
                        Iterator<T> it2 = loans.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            T next2 = it2.next();
                            Loan loan = (Loan) next2;
                            if (loanDetailsWrapper == null || loan.getLoanKey() != loanDetailsWrapper.getLoanKey()) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                t = next2;
                                break;
                            }
                        }
                        t = (Loan) t;
                    }
                    if (t != null && loanDetailsWrapper != null) {
                        C37224b.m109965d(this.f58039h0, Long.valueOf(t.getLoanKey()));
                        return;
                    }
                    return;
                }
                C37224b.m109962a(this.f58041i0);
            }
        }
    }

    /* renamed from: Gy */
    public final void mo54206Gy(StoryGroupThumbnail storyGroupThumbnail, int i) {
        C41536l.m120489i(storyGroupThumbnail, "storyThumbnail");
        C37224b.m109965d(this.f58047l0, storyGroupThumbnail);
        String a = storyGroupThumbnail.mo54187a();
        if (a == null) {
            a = "";
        }
        C32104a.C32106b bVar = new C32104a.C32106b(a, storyGroupThumbnail.mo54188b(), Integer.valueOf(i));
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32333s0.m95355a(bVar, F);
    }

    /* renamed from: Hy */
    public final void mo54207Hy(StoryGroupThumbnail storyGroupThumbnail, int i) {
        C41536l.m120489i(storyGroupThumbnail, "story");
        C32104a.C32107c cVar = new C32104a.C32107c(storyGroupThumbnail.mo54188b(), i);
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32333s0.m95355a(cVar, F);
    }

    /* renamed from: Ix */
    public final void mo54208Ix(String str) {
        C41536l.m120489i(str, "serviceName");
        C41205b F = this.f58058v.mo48072a(str).mo95067F();
        C41536l.m120488h(F, "nboBannerClick(serviceNa…\n            .subscribe()");
        bindToLifecycle(F);
    }

    /* renamed from: Jx */
    public final void mo54209Jx() {
        Long l;
        PreferencesApiManager preferencesApiManager = this.f58006F;
        C37228a a = this.f58062z.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        preferencesApiManager.setHideGooglePayBanner(String.valueOf(l));
        this.f58028b0.mo4823o(Boolean.FALSE);
    }

    /* renamed from: Kx */
    public final void mo54210Kx(long j) {
        C41205b G = C32343x.m95459j1(this.f58004D.mo91882a(j)).mo94888G(new C25584e0(this), new C25586f0(C21728g.f58074d));
        C41536l.m120488h(G, "hideNboOffer(id)\n       …{ checkNboOffers() }, {})");
        bindToLifecycle(G);
    }

    /* renamed from: My */
    public final void mo54211My(boolean z, C43064a aVar, C43064a aVar2) {
        Long l;
        Client K;
        C37228a loginInfo;
        Client K2;
        boolean z2 = z;
        if (!this.f58016P.get()) {
            if (aVar != null) {
                aVar.invoke();
            }
            this.f58016P.set(true);
            C36546y N = C36546y.m108285N();
            if (!(N == null || (K2 = N.mo89313K()) == null)) {
                K2.requestNotificationsCount(this.f58006F.getFcmToken(), z2);
            }
            C40739f[] fVarArr = new C40739f[15];
            C20293c cVar = this.f58050n;
            C36546y N2 = C36546y.m108285N();
            if (N2 == null || (K = N2.mo89313K()) == null || (loginInfo = K.getLoginInfo()) == null) {
                l = null;
            } else {
                l = Long.valueOf(loginInfo.mo90306c());
            }
            C41536l.m120486f(l);
            fVarArr[0] = cVar.mo48776a(l.longValue()).mo94996P().mo95092y();
            fVarArr[1] = C40734b.m117924t(new C25618v0(this, z2));
            fVarArr[2] = this.f58030d.mo65882c(z2).mo94996P().mo95092y();
            fVarArr[3] = this.f58036g.mo48086b(z2).mo94996P().mo95092y();
            fVarArr[4] = this.f58038h.mo48088d(z2).mo94996P().mo95092y();
            C40762x A = C19801d.m65569b(this.f58032e, 0, (String) null, 3, (Object) null).mo95062A(new C25622x0(new C21767y(this)));
            C41536l.m120488h(A, "fun reloadAllServices(\n … .bindToLifecycle()\n    }");
            fVarArr[5] = m70340Jy(A, this.f58021U);
            C40762x A2 = C25074c.m80040d(this.f58034f, (Long) null, (Long) null, (Integer) null, (Integer) null, 10, (List) null, (List) null, (List) null, (String) null, (List) null, (List) null, true, (C28261a) null, false, 14319, (Object) null).mo95062A(new C25624y0(C21769z.f58117d));
            C41536l.m120488h(A2, "getTransactions(\n       …      }\n                }");
            fVarArr[6] = m70340Jy(A2, this.f58022V);
            C40762x A3 = this.f58044k.mo69008d().mo94996P().mo95062A(new C25581d(new C21715a0(this)));
            C41536l.m120488h(A3, "fun reloadAllServices(\n … .bindToLifecycle()\n    }");
            fVarArr[7] = m70340Jy(A3, this.f58023W);
            fVarArr[8] = m70340Jy(this.f58040i.mo48538a(), this.f58024X);
            C40762x A4 = this.f58042j.mo65868a().mo95062A(new C25583e(new C21717b0(this)));
            C41536l.m120488h(A4, "fun reloadAllServices(\n … .bindToLifecycle()\n    }");
            fVarArr[9] = m70340Jy(A4, this.f58025Y);
            fVarArr[10] = m70340Jy(this.f58048m.mo70150a(), this.f58027a0);
            fVarArr[11] = this.f58061y.mo67598a(z2).mo94996P().mo95065D(new C25585f()).mo95092y();
            fVarArr[12] = this.f58003C.mo91880a(z2, true).mo94996P().mo95065D(new C25587g()).mo95092y();
            fVarArr[13] = this.f58011K.mo72091d(z2).mo94996P().mo95065D(new C25589h()).mo95092y();
            fVarArr[14] = this.f58014N.mo63418c(C25208a.DASHBOARD).mo95084m(new C25591i(new C21721c0(this.f58049m0))).mo95092y();
            C41205b G = C40734b.m117928x(fVarArr).mo94882A().mo94906z(C40992a.m118827a()).mo94888G(new C25593j(aVar2, this), new C25620w0(C21765x.f58113d));
            C41536l.m120488h(G, "fun reloadAllServices(\n … .bindToLifecycle()\n    }");
            bindToLifecycle(G);
        }
    }

    /* renamed from: Ox */
    public final LiveData mo54212Ox() {
        return this.f58018R;
    }

    /* renamed from: Rx */
    public final LiveData mo54213Rx() {
        return this.f58019S;
    }

    /* renamed from: Tx */
    public final LiveData mo54214Tx() {
        return C1607m0.m5655c(this.f58031d0, new C21716b(this));
    }

    /* renamed from: Ux */
    public final LiveData mo54215Ux() {
        return this.f58023W;
    }

    /* renamed from: Yy */
    public final void mo54216Yy(String str) {
        C41536l.m120489i(str, "serviceName");
        C41205b I = this.f58059w.mo48073a(str).mo95070I(new C25590h0(C21723d0.f58070d), new C25592i0(C21725e0.f58071d));
        C41536l.m120488h(I, "nboBannerRemove(serviceN…       .subscribe({}, {})");
        bindToLifecycle(I);
    }

    /* renamed from: ay */
    public final LiveData mo54217ay() {
        return this.f58022V;
    }

    /* renamed from: cy */
    public final LiveData mo54218cy() {
        return this.f58041i0;
    }

    /* renamed from: cz */
    public final void mo54219cz(boolean z) {
        m70385bz(new C21727f0(this, z));
    }

    /* renamed from: dy */
    public final LiveData mo54220dy() {
        return this.f58043j0;
    }

    /* renamed from: dz */
    public final void mo54221dz() {
        C41205b G0 = C26628j.m83095d(this.f58030d, false, 1, (Object) null).mo95027o0(C40992a.m118827a()).mo95026k0(new C25595k(new C21748o0(this))).mo95035t0(new C25611s(new C21750p0(this))).mo94983G0(new C25613t(new C21752q0(this)), new C25615u(C21754r0.f58100d));
        C41536l.m120488h(G0, "fun subscribeToDataStrea…     checkStories()\n    }");
        bindToLifecycle(G0);
        C41205b G02 = C40749p.m118037d1(C19797a.m65560c(this.f58036g, false, 1, (Object) null), C26186e.m81987e(this.f58002B.mo63912a(false)).mo95035t0(new C25617v(C21756s0.f58102d)), new C25619w(C21758t0.f58104d)).mo95027o0(C40992a.m118827a()).mo95026k0(new C25621x(new C21760u0(this))).mo95035t0(new C25625z(new C21762v0(this))).mo94983G0(new C25573a0(new C21764w0(this)), new C25578b0(C21731h0.f58077d));
        C41536l.m120488h(G02, "fun subscribeToDataStrea…     checkStories()\n    }");
        bindToLifecycle(G02);
        C41205b G03 = C19799c.m65565e(this.f58038h, false, 1, (Object) null).mo95027o0(C40992a.m118827a()).mo95035t0(new C25597l(new C21733i0(this))).mo94983G0(new C25599m(new C21735j0(this)), new C25603o(C21737k0.f58082d));
        C41536l.m120488h(G03, "fun subscribeToDataStrea…     checkStories()\n    }");
        bindToLifecycle(G03);
        C41205b G04 = this.f58029c0.mo94989L0(new C25605p(new C21739l0(this))).mo94983G0(new C25607q(new C21744m0(this)), new C25609r(C21746n0.f58092d));
        C41536l.m120488h(G04, "fun subscribeToDataStrea…     checkStories()\n    }");
        bindToLifecycle(G04);
        m70369Vx();
        m70328Dx();
        m70334Gx();
    }

    /* renamed from: ey */
    public final LiveData mo54222ey() {
        return C1607m0.m5655c(this.f58025Y, new C21757t(this));
    }

    /* renamed from: fy */
    public final LiveData mo54223fy() {
        return this.f58047l0;
    }

    /* renamed from: gy */
    public final LiveData mo54224gy() {
        return C1607m0.m5655c(this.f58027a0, new C21759u(this));
    }

    /* renamed from: hy */
    public final LiveData mo54225hy() {
        return this.f58020T;
    }

    /* renamed from: iy */
    public final LiveData mo54226iy() {
        return this.f58049m0;
    }

    /* renamed from: jy */
    public final LiveData mo54227jy() {
        return this.f58037g0;
    }

    /* renamed from: ky */
    public final LiveData mo54228ky() {
        return this.f58035f0;
    }

    /* renamed from: ls */
    public final LiveData mo54229ls() {
        return this.f58028b0;
    }

    /* renamed from: ly */
    public final LiveData mo54230ly() {
        return this.f58039h0;
    }

    /* renamed from: my */
    public final LiveData mo54231my() {
        return this.f58045k0;
    }

    /* renamed from: ny */
    public final LiveData mo54232ny() {
        return C1607m0.m5655c(this.f58024X, new C21729g0(this));
    }

    /* renamed from: oy */
    public final LiveData mo54233oy() {
        return this.f58021U;
    }

    /* renamed from: sy */
    public final void mo54234sy(boolean z) {
        C41205b G0 = this.f58030d.mo65882c(z).mo95027o0(C40992a.m118827a()).mo94983G0(new C25580c0(C21743m.f58089d), new C25582d0(C21745n.f58091d));
        C41536l.m120488h(G0, "getAccountsAndCardsUseCa…       .subscribe({}, {})");
        bindToLifecycle(G0);
    }

    /* renamed from: v */
    public final LiveData mo54235v() {
        return this.f58033e0;
    }

    /* renamed from: wy */
    public final void mo54236wy() {
        C41205b I = C25074c.m80040d(this.f58034f, (Long) null, (Long) null, (Integer) null, (Integer) null, 10, (List) null, (List) null, (List) null, (String) null, (List) null, (List) null, true, (C28261a) null, false, 14319, (Object) null).mo95083l(new C25579c(new C21747o(this))).mo95063B(C40992a.m118827a()).mo95062A(new C25601n(C21749p.f58095d)).mo95070I(new C25623y(new C21751q(this)), new C25594j0(new C21753r(this)));
        C41536l.m120488h(I, "fun loadLastOperations()… .bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }
}

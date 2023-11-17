package p341ge.bog.mobilebank.galtandtaggart.presentation.trading;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import de1.C40640a;
import ed1.C40732a;
import ed1.C40741h;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import ee1.C40767b;
import g31.C32054a;
import g41.C32081a;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41238w;
import ie0.C25190j;
import if0.C25192a;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg0.C26203a;
import mg0.C26204b;
import mg0.C26205c;
import mg0.C26206d;
import mg0.C26207e;
import mg0.C26208f;
import mg0.C26209g;
import mg0.C26210h;
import mg0.C26211i;
import mg0.C26212j;
import mg0.C26213k;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p380ck.C10463g;
import ue1.C43075l;
import ue1.C43079p;
import we0.C29321a;
import we0.C29326c0;
import we0.C29330e0;
import we0.C29332f0;
import we0.C29353o;
import we0.C29362u;
import we0.C29368z;
import xe0.C29745c;
import xe0.C29750h;
import xe0.C29756n;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel */
public final class GTShareTradeDetailsViewModel$ViewModel extends C21481a implements C26203a, C26204b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29332f0 f61998d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29326c0 f61999e;

    /* renamed from: f */
    private final C29321a f62000f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C29330e0 f62001g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C29353o f62002h;

    /* renamed from: i */
    private final C29362u f62003i;

    /* renamed from: j */
    private final C29368z f62004j;

    /* renamed from: k */
    private final Client f62005k;

    /* renamed from: l */
    private final C26204b f62006l = this;

    /* renamed from: m */
    private final C26203a f62007m = this;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f62008n;

    /* renamed from: o */
    private AtomicInteger f62009o = new AtomicInteger();

    /* renamed from: p */
    private final C1644x f62010p = new C1644x();

    /* renamed from: q */
    private final C1644x f62011q = new C1644x();

    /* renamed from: r */
    private final C1644x f62012r = new C1644x();

    /* renamed from: s */
    private final C1644x f62013s = new C1644x();

    /* renamed from: t */
    private final C1644x f62014t = new C1644x();

    /* renamed from: u */
    private final C40765a f62015u;

    /* renamed from: v */
    private final C40741h f62016v;

    /* renamed from: w */
    private final C1644x f62017w;

    /* renamed from: x */
    private final C1644x f62018x;

    /* renamed from: y */
    private final C40767b f62019y;

    /* renamed from: z */
    private final C40765a f62020z;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$a */
    static final class C23843a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23843a(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
            super(1);
            this.f62021d = gTShareTradeDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92879h(C29326c0.m89402b(this.f62021d.f61999e, false, 1, (Object) null), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$b */
    static final class C23844b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23844b(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
            super(1);
            this.f62022d = gTShareTradeDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60820a(C31128a aVar) {
            this.f62022d.mo60813Vn().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60820a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$c */
    static final class C23845c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62023d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$c$a */
        static final class C23846a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C23846a f62024d = new C23846a();

            C23846a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C29756n nVar, C29750h hVar) {
                C41536l.m120489i(nVar, "metaData");
                C41536l.m120489i(hVar, "minimizedData");
                return new C41224m(nVar, hVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23845c(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
            super(1);
            this.f62023d = gTShareTradeDetailsViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m77042c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "symbol");
            this.f62023d.f62008n = str;
            C40749p O = C40762x.m118154T(this.f62023d.f62001g.mo69186a(str, false), this.f62023d.f61998d.mo69188a(str), new C23866a(C23846a.f62024d)).mo95075O();
            C41536l.m120488h(O, "zip(\n                   …          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$d */
    static final class C23847d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62025d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$d$a */
        static final class C23848a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62026d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23848a(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
                super(1);
                this.f62026d = gTShareTradeDetailsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60824a(C41224m mVar) {
                this.f62026d.mo60801Fo().mo4823o(new C31128a.C31131c(mVar.mo95680f(), 0, 2, (DefaultConstructorMarker) null));
                this.f62026d.mo60816o8().mo4823o(new C31128a.C31131c(mVar.mo95678e(), 0, 2, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60824a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$d$b */
        static final class C23849b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62027d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23849b(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
                super(1);
                this.f62027d = gTShareTradeDetailsViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f62027d.mo60801Fo().mo4823o(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$d$c */
        static final class C23850c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62028d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23850c(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
                super(1);
                this.f62028d = gTShareTradeDetailsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60826a(C41224m mVar) {
                this.f62028d.mo60801Fo().mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60826a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23847d(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
            super(1);
            this.f62025d = gTShareTradeDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60823a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23848a(this.f62025d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23849b(this.f62025d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23850c(this.f62025d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60823a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$e */
    static final class C23851e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23851e(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
            super(1);
            this.f62029d = gTShareTradeDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60827a(C41232r rVar) {
            Double d;
            double doubleValue = ((Number) rVar.mo95688a()).doubleValue();
            boolean booleanValue = ((Boolean) rVar.mo95689b()).booleanValue();
            C25192a aVar = (C25192a) rVar.mo95690c();
            GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel = this.f62029d;
            String sw = gTShareTradeDetailsViewModel$ViewModel.f62008n;
            Double d2 = null;
            if (sw == null) {
                C41536l.m120506z("currSymbol");
                sw = null;
            }
            if (booleanValue) {
                d = Double.valueOf(doubleValue);
            } else {
                d = null;
            }
            if (!booleanValue) {
                d2 = Double.valueOf(doubleValue);
            }
            gTShareTradeDetailsViewModel$ViewModel.m77019zw(sw, aVar, d, d2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60827a((C41232r) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$f */
    public /* synthetic */ class C23852f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62030a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                if0.a[] r0 = if0.C25192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                if0.a r1 = if0.C25192a.BUY_SHARE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                if0.a r1 = if0.C25192a.SELL_SHARE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f62030a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel.C23852f.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$g */
    static final class C23853g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62031d;

        /* renamed from: e */
        final /* synthetic */ int f62032e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23853g(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel, int i) {
            super(1);
            this.f62031d = gTShareTradeDetailsViewModel$ViewModel;
            this.f62032e = i;
        }

        /* renamed from: a */
        public final void mo60828a(C41205b bVar) {
            this.f62031d.mo60812Uv().mo4823o(Integer.valueOf(this.f62032e));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60828a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$h */
    static final class C23854h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23854h(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
            super(1);
            this.f62033d = gTShareTradeDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60829a(C31128a aVar) {
            this.f62033d.mo60818xn().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60829a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$i */
    static final class C23855i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62034d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$i$a */
        static final class C23856a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C23856a f62035d = new C23856a();

            C23856a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(List list, Boolean bool) {
                C41536l.m120489i(list, "defaultAmounts");
                C41536l.m120489i(bool, "marketIsOpen");
                return new C41224m(bool, list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23855i(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
            super(1);
            this.f62034d = gTShareTradeDetailsViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m77052c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(C25192a aVar) {
            C41536l.m120489i(aVar, "actionType");
            C40762x T = C40762x.m118154T(this.f62034d.f62002h.mo69203a(aVar), this.f62034d.m76996Ow(), new C23931b(C23856a.f62035d));
            C41536l.m120488h(T, "zip(\n                   …mounts)\n                }");
            return C31270e.m92880i(T, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel$j */
    static final class C23857j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsViewModel$ViewModel f62036d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23857j(GTShareTradeDetailsViewModel$ViewModel gTShareTradeDetailsViewModel$ViewModel) {
            super(1);
            this.f62036d = gTShareTradeDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C31270e.m92880i(this.f62036d.m76996Ow(), num.intValue()).mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95027o0(C40992a.m118827a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTShareTradeDetailsViewModel$ViewModel(C29332f0 f0Var, C29326c0 c0Var, C29321a aVar, C29330e0 e0Var, C29353o oVar, C29362u uVar, C29368z zVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(f0Var, "minimizedOnlineDataUseCase");
        C41536l.m120489i(c0Var, "getPortfolioOverviewUseCase");
        C41536l.m120489i(aVar, "calculateTradeDataUseCase");
        C41536l.m120489i(e0Var, "getShareMetaData");
        C41536l.m120489i(oVar, "getBuySellDefaultAmountsUseCase");
        C41536l.m120489i(uVar, "getGTMarketIsOpen");
        C41536l.m120489i(zVar, "getIsGTTradingAllowedOnClosedMarket");
        C41536l.m120489i(client, "client");
        this.f61998d = f0Var;
        this.f61999e = c0Var;
        this.f62000f = aVar;
        this.f62001g = e0Var;
        this.f62002h = oVar;
        this.f62003i = uVar;
        this.f62004j = zVar;
        this.f62005k = client;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Triple<Double, Boolean, GTActionType>>()");
        this.f62015u = h1;
        C40741h T0 = h1.mo95005T0(C40732a.LATEST);
        this.f62016v = T0;
        this.f62017w = new C1644x();
        this.f62018x = new C1644x();
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f62019y = h12;
        C40765a h13 = C40765a.m118198h1();
        C41536l.m120488h(h13, "create<GTActionType>()");
        this.f62020z = h13;
        C41205b F0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C26205c(new C23843a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C26206d(new C23844b(this)));
        C41536l.m120488h(F0, "merge(onRefresh(), onIni…result)\n                }");
        bindToLifecycle(F0);
        C41205b F02 = h12.mo94989L0(new C26207e(new C23845c(this))).mo95027o0(C40992a.m118827a()).mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo94981F0(new C26208f(new C23847d(this)));
        C41536l.m120488h(F02, "symbolSubject.switchMap …      }\n                }");
        bindToLifecycle(F02);
        C41205b C = T0.mo94928g(400, TimeUnit.MILLISECONDS).mo94923G(C40640a.m117458b()).mo94940w(C40992a.m118827a()).mo94920C(new C26209g(new C23851e(this)));
        C41536l.m120488h(C, "textInput\n              …  )\n                    }");
        addDisposable(C);
        m76992Cw();
        m76994Ew();
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m76990Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m76991Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Cw */
    private final void m76992Cw() {
        C40749p L0 = this.f62020z.mo94989L0(new C26213k(new C23855i(this)));
        C41536l.m120488h(L0, "private fun configureAct…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(C32343x.m95453h1(L0)), this.f62017w));
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final C40754t m76993Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ew */
    private final void m76994Ew() {
        C40749p L0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C26210h(new C23857j(this)));
        C41536l.m120488h(L0, "private fun configureMar…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f62018x));
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final C40754t m76995Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public final C40762x m76996Ow() {
        if (!this.f62004j.mo69216a()) {
            return this.f62003i.mo69210b();
        }
        C40762x z = C40762x.m118162z(Boolean.TRUE);
        C41536l.m120488h(z, "{\n                Single.just(true)\n            }");
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C40754t m77006mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m77007nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final C40754t m77008ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m77009pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m77010qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public final void m77019zw(String str, C25192a aVar, Double d, Double d2) {
        String str2;
        Double d3 = d;
        Double d4 = d2;
        int incrementAndGet = this.f62009o.incrementAndGet();
        if ((d3 == null || C41536l.m120482b(d3, Utils.DOUBLE_EPSILON)) && (d4 == null || C41536l.m120482b(d4, Utils.DOUBLE_EPSILON))) {
            mo60812Uv().mo4823o(Integer.valueOf(incrementAndGet));
            C1644x Gw = mo60818xn();
            BigDecimal valueOf = BigDecimal.valueOf(0);
            C41536l.m120488h(valueOf, "valueOf(this.toLong())");
            BigDecimal valueOf2 = BigDecimal.valueOf(0);
            C41536l.m120488h(valueOf2, "valueOf(this.toLong())");
            BigDecimal valueOf3 = BigDecimal.valueOf(0);
            C41536l.m120488h(valueOf3, "valueOf(this.toLong())");
            Gw.mo4823o(new C31128a.C31131c(new C29745c(valueOf, "USD", valueOf2, "USD", Utils.DOUBLE_EPSILON, incrementAndGet, valueOf3), 0, 2, (DefaultConstructorMarker) null));
            return;
        }
        C29321a aVar2 = this.f62000f;
        int i = C23852f.f62030a[aVar.ordinal()];
        if (i == 1) {
            str2 = "BUY";
        } else if (i == 2) {
            str2 = "SELL";
        } else {
            throw new IllegalStateException("Illegal Action Type");
        }
        C40749p O = aVar2.mo69177a(str, str2, d, "USD", d2, incrementAndGet).mo95075O();
        C41536l.m120488h(O, "calculateTradeDataUseCas…         ).toObservable()");
        C41205b F0 = C31270e.m92879h(O, 1).mo95027o0(C40992a.m118827a()).mo94980F(new C26211i(new C23853g(this, incrementAndGet))).mo94981F0(new C26212j(new C23854h(this)));
        C41536l.m120488h(F0, "private fun calculateTra…)\n            }\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: An */
    public void mo60800An(String str) {
        C41536l.m120489i(str, "symbol");
        this.f62019y.onNext(str);
    }

    /* renamed from: Gw */
    public C1644x mo60818xn() {
        return this.f62012r;
    }

    /* renamed from: Hw */
    public C1644x mo60812Uv() {
        return this.f62013s;
    }

    /* renamed from: I9 */
    public LiveData mo60804I9() {
        return this.f62017w;
    }

    /* renamed from: Iw */
    public C1644x mo60813Vn() {
        return this.f62010p;
    }

    /* renamed from: Jw */
    public final C26203a mo60806Jw() {
        return this.f62007m;
    }

    /* renamed from: Kw */
    public int mo60807Kw() {
        if (this.f62005k.getUserInfo().isSolo()) {
            return C25190j.gt_insufficient_shares_desc_solo;
        }
        return C25190j.gt_insufficient_shares_desc_rb;
    }

    /* renamed from: Lw */
    public C1644x mo60816o8() {
        return this.f62014t;
    }

    /* renamed from: Mw */
    public C1644x mo60801Fo() {
        return this.f62011q;
    }

    /* renamed from: Nw */
    public final C26204b mo60810Nw() {
        return this.f62006l;
    }

    /* renamed from: Pw */
    public void mo60811Pw(C25192a aVar, double d, boolean z) {
        C41536l.m120489i(aVar, "actionType");
        this.f62015u.onNext(new C41232r(Double.valueOf(d), Boolean.valueOf(z), aVar));
    }

    /* renamed from: e2 */
    public void mo60814e2(C25192a aVar, String str) {
        C41536l.m120489i(aVar, "actionType");
        C41536l.m120489i(str, "symbol");
        int i = C23852f.f62030a[aVar.ordinal()];
        if (i == 1) {
            C32054a.C32067m mVar = C32054a.C32067m.f78908f;
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            C32081a.m94499a(mVar, F, " ", str);
        } else if (i == 2) {
            C32054a.C32069o oVar = C32054a.C32069o.f78910f;
            C10463g F2 = C36546y.m108282F();
            C41536l.m120488h(F2, "getAnalytics()");
            C32081a.m94499a(oVar, F2, " ", str);
        } else {
            throw new IllegalStateException("Illegal Action Type");
        }
    }

    /* renamed from: kt */
    public void mo60815kt(C25192a aVar) {
        C41536l.m120489i(aVar, "actionType");
        this.f62020z.onNext(aVar);
    }

    /* renamed from: u */
    public LiveData mo60817u() {
        return this.f62018x;
    }
}

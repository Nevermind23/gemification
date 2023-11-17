package p341ge.bog.mobilebank.galtandtaggart.presentation.exchange;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.salesforce.marketingcloud.UrlHandler;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g31.C32054a;
import g41.C32081a;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import if0.C25192a;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C25958e;
import lf0.C25960f;
import lf0.C25961g;
import lf0.C25962h;
import lf0.C25963i;
import lf0.C25964j;
import lf0.C25965k;
import lf0.C25966l;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;
import p341ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p380ck.C10463g;
import pc0.C27494a;
import ue1.C43075l;
import ue1.C43079p;
import ug0.C28786c;
import we0.C29337i;
import we0.C29338i0;
import we0.C29355p;
import we0.C29364v;
import we0.C29367y;
import xe0.C29746d;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel */
public final class GTMoneyExchangeViewModel$ViewModel extends C21481a implements C25958e, C25960f {

    /* renamed from: A */
    public static final C23410g f61201A = new C23410g((DefaultConstructorMarker) null);

    /* renamed from: B */
    private static final BigDecimal f61202B = BigDecimal.ZERO;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29355p f61203d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29367y f61204e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C29364v f61205f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C29337i f61206g;

    /* renamed from: h */
    private final C29338i0 f61207h;

    /* renamed from: i */
    private final C27494a f61208i;

    /* renamed from: j */
    private final C25960f f61209j = this;

    /* renamed from: k */
    private final C25958e f61210k = this;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public BigDecimal f61211l;

    /* renamed from: m */
    private BigDecimal f61212m;

    /* renamed from: n */
    private C25192a f61213n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f61214o;

    /* renamed from: p */
    private C41224m f61215p;

    /* renamed from: q */
    private final C1644x f61216q;

    /* renamed from: r */
    private final C1644x f61217r;

    /* renamed from: s */
    private final C1644x f61218s;

    /* renamed from: t */
    private final C1644x f61219t;

    /* renamed from: u */
    private final C1644x f61220u;

    /* renamed from: v */
    private final C1644x f61221v;

    /* renamed from: w */
    private final C1644x f61222w;

    /* renamed from: x */
    private final C1644x f61223x;

    /* renamed from: y */
    private final C40767b f61224y;

    /* renamed from: z */
    private final C40767b f61225z;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$a */
    static final class C23394a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61226d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$a$a */
        static final class C23395a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C23395a f61227d = new C23395a();

            C23395a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C29746d dVar, TransferAccounts transferAccounts) {
                C41536l.m120489i(dVar, "cashData");
                C41536l.m120489i(transferAccounts, "accounts");
                return new C41224m(dVar, transferAccounts);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23394a(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
            super(1);
            this.f61226d = gTMoneyExchangeViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m75797c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            C40749p O = C40762x.m118154T(C40762x.m118161w(this.f61226d.f61203d.mo69204a()), this.f61226d.f61204e.mo69215a(), new C23417a(C23395a.f61227d)).mo95075O();
            C41536l.m120488h(O, "zip(\n                   …          .toObservable()");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$b */
    static final class C23396b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61228d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$b$a */
        static final class C23397a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61229d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23397a(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
                super(1);
                this.f61229d = gTMoneyExchangeViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60215a(C41224m mVar) {
                C1644x xw = this.f61229d.mo60198J();
                Object f = mVar.mo95680f();
                C41536l.m120488h(f, "it.second");
                xw.mo4823o(new C31128a.C31131c(C28786c.m88248d((TransferAccounts) f, "USD"), 0, 2, (DefaultConstructorMarker) null));
                this.f61229d.mo60206qb().mo4823o(new C31128a.C31131c(mVar.mo95678e(), 0, 2, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60215a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$b$b */
        static final class C23398b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61230d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23398b(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
                super(1);
                this.f61230d = gTMoneyExchangeViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60216a(C41224m mVar) {
                this.f61230d.mo60198J().mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
                this.f61230d.mo60206qb().mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60216a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$b$c */
        static final class C23399c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61231d;

            /* renamed from: e */
            final /* synthetic */ C31128a f61232e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23399c(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel, C31128a aVar) {
                super(1);
                this.f61231d = gTMoneyExchangeViewModel$ViewModel;
                this.f61232e = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                Throwable th2 = th;
                this.f61231d.mo60198J().mo4823o(new C31128a.C31129a(th2, this.f61232e.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null));
                this.f61231d.mo60206qb().mo4823o(new C31128a.C31129a(th2, this.f61232e.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23396b(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
            super(1);
            this.f61228d = gTMoneyExchangeViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60214a(C31128a aVar) {
            C41536l.m120488h(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C23397a(this.f61228d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23398b(this.f61228d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23399c(this.f61228d, aVar), 1, (Object) null);
            this.f61228d.m75751Kw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60214a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$c */
    static final class C23400c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23400c(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
            super(1);
            this.f61233d = gTMoneyExchangeViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C25192a aVar) {
            C41536l.m120489i(aVar, UrlHandler.ACTION);
            C40749p O = this.f61233d.f61205f.mo69212a(aVar).mo95075O();
            C41536l.m120488h(O, "getGTOperationServiceIdU…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$d */
    static final class C23401d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61234d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$d$a */
        static final class C23402a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61235d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23402a(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
                super(1);
                this.f61235d = gTMoneyExchangeViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60220a(String str) {
                this.f61235d.f61214o = str;
                this.f61235d.mo60196I2().mo4823o(new C21503d.C21506c((Object) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60220a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$d$b */
        static final class C23403b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61236d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23403b(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
                super(1);
                this.f61236d = gTMoneyExchangeViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60221a(String str) {
                this.f61236d.mo60204i8().mo4823o(Boolean.TRUE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60221a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$d$c */
        static final class C23404c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61237d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23404c(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
                super(1);
                this.f61237d = gTMoneyExchangeViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f61237d.mo60204i8().mo4823o(Boolean.FALSE);
                this.f61237d.mo60196I2().mo4823o(new C21503d.C21504a(th, (Object) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23401d(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
            super(1);
            this.f61234d = gTMoneyExchangeViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60219a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23402a(this.f61234d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23403b(this.f61234d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23404c(this.f61234d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60219a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$e */
    static final class C23405e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23405e(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
            super(1);
            this.f61238d = gTMoneyExchangeViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(GTRepositoryImpl.GTMoneyExchangeParams gTMoneyExchangeParams) {
            C41536l.m120489i(gTMoneyExchangeParams, "params");
            C40749p f = this.f61238d.f61206g.mo69192b(this.f61238d.mo60191Ew(gTMoneyExchangeParams)).mo94897f(C40749p.m118043h0(Boolean.TRUE));
            C41536l.m120488h(f, "exchangeUseCase(getOtpPa…en(Observable.just(true))");
            return C31270e.m92879h(f, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$f */
    static final class C23406f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61239d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$f$a */
        static final class C23407a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61240d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23407a(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
                super(1);
                this.f61240d = gTMoneyExchangeViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Boolean bool) {
                this.f61240d.mo60196I2().mo4823o((Object) null);
                C1644x Bw = this.f61240d.mo60194Hs();
                BigDecimal ow = this.f61240d.f61211l;
                C41536l.m120486f(ow);
                Object f = this.f61240d.mo60200O1().mo4814f();
                C41536l.m120486f(f);
                String i = ((TransferAccountItem) f).mo52142i();
                C41536l.m120486f(i);
                String P = C32343x.m95408P(ow, i);
                Object f2 = this.f61240d.mo60200O1().mo4814f();
                C41536l.m120486f(f2);
                String d = ((TransferAccountItem) f2).mo52134d();
                if (d == null) {
                    d = "";
                }
                Bw.mo4823o(new C41224m(P, d));
                this.f61240d.mo60204i8().mo4823o(Boolean.FALSE);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$f$b */
        static final class C23408b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61241d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23408b(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
                super(1);
                this.f61241d = gTMoneyExchangeViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f61241d.mo60196I2().mo4823o(new C21503d.C21504a(th, (Object) null));
                this.f61241d.m75751Kw();
                this.f61241d.mo60204i8().mo4823o(Boolean.FALSE);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$f$c */
        static final class C23409c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTMoneyExchangeViewModel$ViewModel f61242d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23409c(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
                super(1);
                this.f61242d = gTMoneyExchangeViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Boolean bool) {
                this.f61242d.mo60204i8().mo4823o(Boolean.TRUE);
                this.f61242d.mo60196I2().mo4823o(new C21503d.C21505b((Object) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23406f(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel) {
            super(1);
            this.f61239d = gTMoneyExchangeViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60224a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23407a(this.f61239d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23408b(this.f61239d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23409c(this.f61239d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60224a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$g */
    public static final class C23410g {
        private C23410g() {
        }

        public /* synthetic */ C23410g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel$h */
    public /* synthetic */ class C23411h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61243a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                if0.a[] r0 = if0.C25192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                if0.a r1 = if0.C25192a.GET_MONEY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                if0.a r1 = if0.C25192a.DEPOSIT_MONEY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f61243a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel.C23411h.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTMoneyExchangeViewModel$ViewModel(C29355p pVar, C29367y yVar, C29364v vVar, C29337i iVar, C29338i0 i0Var, C27494a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(pVar, "getCashDataUseCase");
        C41536l.m120489i(yVar, "transferAccountsUseCase");
        C41536l.m120489i(vVar, "getGTOperationServiceIdUseCase");
        C41536l.m120489i(iVar, "exchangeUseCase");
        C41536l.m120489i(i0Var, "getUTMParametersUseCase");
        C41536l.m120489i(aVar, "otpParamsMapBuilder");
        this.f61203d = pVar;
        this.f61204e = yVar;
        this.f61205f = vVar;
        this.f61206g = iVar;
        this.f61207h = i0Var;
        this.f61208i = aVar;
        Boolean bool = Boolean.FALSE;
        this.f61215p = new C41224m(bool, bool);
        this.f61216q = new C1644x();
        this.f61217r = new C1644x();
        this.f61218s = new C1644x();
        this.f61219t = new C1644x();
        this.f61220u = new C1644x();
        this.f61221v = new C1644x();
        this.f61222w = new C1644x();
        this.f61223x = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<GTActionType>()");
        this.f61224y = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<GTRepositoryImpl.GTMoneyExchangeParams>()");
        this.f61225z = h12;
        C41205b F0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C25961g(new C23394a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C25962h(new C23396b(this)));
        C41536l.m120488h(F0, "merge(onRefresh(), onIni…State()\n                }");
        bindToLifecycle(F0);
        C41205b F02 = h1.mo94989L0(new C25963i(new C23400c(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C25964j(new C23401d(this)));
        C41536l.m120488h(F02, "actionRequestSubject.swi…      }\n                }");
        bindToLifecycle(F02);
        C41205b F03 = h12.mo94989L0(new C25965k(new C23405e(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C25966l(new C23406f(this)));
        C41536l.m120488h(F03, "actionConfirmSubject.swi…      }\n                }");
        bindToLifecycle(F03);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public final void m75751Kw() {
        mo60202d6().mo4823o(Boolean.valueOf(((Boolean) this.f61215p.mo95678e()).booleanValue() && ((Boolean) this.f61215p.mo95680f()).booleanValue()));
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final C40754t m75758jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m75759kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C40754t m75760lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m75761mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final C40754t m75762nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: ww */
    public static /* synthetic */ GTRepositoryImpl.GTMoneyExchangeParams m75770ww(GTMoneyExchangeViewModel$ViewModel gTMoneyExchangeViewModel$ViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return gTMoneyExchangeViewModel$ViewModel.mo60207vw(str, str2, str3);
    }

    /* renamed from: Aw */
    public C1644x mo60206qb() {
        return this.f61216q;
    }

    /* renamed from: Bw */
    public C1644x mo60194Hs() {
        return this.f61222w;
    }

    /* renamed from: Cw */
    public C1644x mo60205j5() {
        return this.f61220u;
    }

    /* renamed from: Dw */
    public final C25958e mo60190Dw() {
        return this.f61210k;
    }

    /* renamed from: Ew */
    public HashMap mo60191Ew(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f61208i.mo66809a(otpParams);
    }

    /* renamed from: Fw */
    public final C25960f mo60192Fw() {
        return this.f61209j;
    }

    /* renamed from: Gw */
    public C1644x mo60196I2() {
        return this.f61223x;
    }

    /* renamed from: Hw */
    public C1644x mo60200O1() {
        return this.f61221v;
    }

    /* renamed from: Iw */
    public void mo60197Iw(C25192a aVar) {
        BigDecimal bigDecimal;
        C29746d dVar;
        C41536l.m120489i(aVar, "actionType");
        C31128a aVar2 = (C31128a) mo60206qb().mo4814f();
        if (aVar2 == null || (dVar = (C29746d) aVar2.mo71340a()) == null || (bigDecimal = dVar.mo69771c()) == null) {
            bigDecimal = f61202B;
        }
        this.f61212m = bigDecimal;
        if (aVar == C25192a.GET_MONEY) {
            BigDecimal bigDecimal2 = this.f61211l;
            C41536l.m120486f(bigDecimal2);
            if (bigDecimal2.compareTo(this.f61212m) > 0) {
                C37224b.m109965d(mo60205j5(), new StringSource.Dictionary("gt.incorrect.withdaw.amount.error", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null));
                return;
            }
        }
        mo60204i8().mo4823o(Boolean.TRUE);
        this.f61213n = aVar;
        this.f61224y.onNext(aVar);
    }

    /* renamed from: Jw */
    public void mo60199Jw(BigDecimal bigDecimal) {
        boolean z;
        C41536l.m120489i(bigDecimal, "amount");
        this.f61211l = bigDecimal;
        Object e = this.f61215p.mo95678e();
        BigDecimal valueOf = BigDecimal.valueOf(0);
        C41536l.m120488h(valueOf, "valueOf(this.toLong())");
        if (bigDecimal.compareTo(valueOf) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f61215p = new C41224m(e, Boolean.valueOf(z));
        m75751Kw();
    }

    /* renamed from: Ph */
    public void mo60201Ph(C21503d dVar, String str, String str2, String str3) {
        C41536l.m120489i(dVar, "state");
        if (dVar instanceof C21503d.C21505b) {
            mo60196I2().mo4823o(new C21503d.C21505b((Object) null));
        } else if (dVar instanceof C21503d.C21504a) {
            mo60196I2().mo4823o(dVar);
        } else if (dVar instanceof C21503d.C21506c) {
            this.f61225z.onNext(mo60207vw(str, str2, str3));
        }
    }

    /* renamed from: hp */
    public void mo60203hp(TransferAccountItem transferAccountItem) {
        C41536l.m120489i(transferAccountItem, "acc");
        mo60200O1().mo4823o(transferAccountItem);
        this.f61215p = new C41224m(Boolean.TRUE, this.f61215p.mo95680f());
        m75751Kw();
    }

    /* renamed from: vw */
    public final GTRepositoryImpl.GTMoneyExchangeParams mo60207vw(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        C25192a aVar = this.f61213n;
        C41536l.m120486f(aVar);
        int i = C23411h.f61243a[aVar.ordinal()];
        if (i == 1) {
            str4 = "GT_TRANSFER_FROM_GT_ACCOUNT";
        } else if (i == 2) {
            str4 = "GT_TRANSFER_TO_GT_ACCOUNT";
        } else {
            throw new UnsupportedOperationException();
        }
        String str8 = str4;
        UtmParamsEntity a = this.f61207h.mo69193a();
        String S = C32359z0.m95548S(this.f61211l);
        C41536l.m120488h(S, "getNumberFormatPrecisionOfTwo(actionAmount)");
        Object f = mo60200O1().mo4814f();
        C41536l.m120486f(f);
        long m = ((TransferAccountItem) f).mo52146m();
        Object f2 = mo60200O1().mo4814f();
        C41536l.m120486f(f2);
        String i2 = ((TransferAccountItem) f2).mo52142i();
        C41536l.m120486f(i2);
        String str9 = this.f61214o;
        C41536l.m120486f(str9);
        if (a != null) {
            str5 = a.getMedium();
        } else {
            str5 = null;
        }
        if (a != null) {
            str6 = a.getSource();
        } else {
            str6 = null;
        }
        if (a != null) {
            str7 = a.getCampaign();
        } else {
            str7 = null;
        }
        return new GTRepositoryImpl.GTMoneyExchangeParams(S, m, i2, str9, str5, str6, str7, str8, str, str2, str3);
    }

    /* renamed from: w0 */
    public void mo60208w0(C25192a aVar) {
        C41536l.m120489i(aVar, "actionType");
        int i = C23411h.f61243a[aVar.ordinal()];
        if (i == 1) {
            C32054a.C32070p pVar = C32054a.C32070p.f78911f;
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            C32081a.m94499a(pVar, F, " ", " ");
        } else if (i == 2) {
            C32054a.C32068n nVar = C32054a.C32068n.f78909f;
            C10463g F2 = C36546y.m108282F();
            C41536l.m120488h(F2, "getAnalytics()");
            C32081a.m94499a(nVar, F2, " ", " ");
        } else {
            throw new IllegalStateException("Illegal Action Type");
        }
    }

    /* renamed from: xw */
    public C1644x mo60198J() {
        return this.f61217r;
    }

    /* renamed from: yw */
    public C1644x mo60202d6() {
        return this.f61218s;
    }

    /* renamed from: zw */
    public C1644x mo60204i8() {
        return this.f61219t;
    }
}

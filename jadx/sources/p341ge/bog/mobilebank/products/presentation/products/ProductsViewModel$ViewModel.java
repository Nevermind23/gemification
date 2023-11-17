package p341ge.bog.mobilebank.products.presentation.products;

import a01.C30419a0;
import a01.C30421b0;
import a01.C30423c0;
import a01.C30425d0;
import a01.C30427e0;
import a01.C30429f0;
import a01.C30431g0;
import a01.C30433h0;
import a01.C30435i0;
import a01.C30437j0;
import a01.C30439k0;
import a01.C30441l0;
import a01.C30443m0;
import a01.C30445n0;
import a01.C30447o0;
import a01.C30448p;
import a01.C30449p0;
import a01.C30450q;
import a01.C30451q0;
import a01.C30452r;
import a01.C30453r0;
import a01.C30454s;
import a01.C30455s0;
import a01.C30456t;
import a01.C30457t0;
import a01.C30458u;
import a01.C30460v;
import a01.C30462w;
import a01.C30463x;
import a01.C30464y;
import a01.C30465z;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b01.C31104a;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
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
import j70.C25352k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ky0.C37019f;
import l70.C25846a;
import m41.C37224b;
import md0.C26186e;
import md0.C26191f;
import ny0.C37508i;
import o70.C26766e;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.products.presentation.products.C34366d;
import p606sl.C17847m;
import p748eu.C20292b;
import p758fu.C20557a;
import q70.C27685a;
import q70.C27686b;
import ty0.C38864h;
import ty0.C38872j0;
import ty0.C38874k0;
import ty0.C38875l;
import ty0.C38876l0;
import ty0.C38878m0;
import ty0.C38887r;
import ty0.C38891t;
import ty0.C38893t0;
import ty0.C38894u;
import ty0.C38901y;
import ty0.C38902z;
import ue1.C43064a;
import ue1.C43075l;
import wh0.C29397e;
import wh0.C29407n;
import xs0.C39879r;
import xy0.C39941e;
import xy0.C39945i;
import xy0.C39948l;
import xy0.C39959w;
import xy0.C39960x;
import xy0.C39961y;
import zs0.C40252e;

/* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel */
public final class ProductsViewModel$ViewModel extends C21481a implements C30448p, C30450q {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C1644x f83169A = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C1644x f83170B = new C1644x();

    /* renamed from: C */
    private final C1644x f83171C = new C1644x();

    /* renamed from: D */
    private final C40767b f83172D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C40767b f83173E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C40767b f83174F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C40767b f83175G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C40767b f83176H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C40767b f83177I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C40767b f83178J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C40767b f83179K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C40767b f83180L;

    /* renamed from: M */
    private final C40767b f83181M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C40767b f83182N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C40767b f83183O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C40767b f83184P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C40767b f83185Q;

    /* renamed from: d */
    private final C25352k f83186d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C31104a f83187e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38864h f83188f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C38894u f83189g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C38891t f83190h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C37019f f83191i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C38901y f83192j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C38872j0 f83193k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C38902z f83194l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C38878m0 f83195m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C38876l0 f83196n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C38874k0 f83197o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C38893t0 f83198p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C38887r f83199q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C20292b f83200r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C39879r f83201s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C38875l f83202t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C29397e f83203u;

    /* renamed from: v */
    private final C29407n f83204v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final Client f83205w;

    /* renamed from: x */
    private final C30448p f83206x = this;

    /* renamed from: y */
    private final C30450q f83207y = this;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C1644x f83208z = new C1644x();

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$a */
    public /* synthetic */ class C34274a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83209a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                q70.a[] r0 = q70.C27685a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                q70.a r1 = q70.C27685a.ACC_TYPE_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                q70.a r1 = q70.C27685a.ACC_TYPE_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                q70.a r1 = q70.C27685a.ACC_TYPE_LOAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                q70.a r1 = q70.C27685a.ACC_TYPE_DEPOSIT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                q70.a r1 = q70.C27685a.ACC_TYPE_GT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                q70.a r1 = q70.C27685a.ACC_TYPE_PENSION     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                q70.a r1 = q70.C27685a.TYPE_GTP_TRADING     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                q70.a r1 = q70.C27685a.PIGGY_BANK     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                q70.a r1 = q70.C27685a.BNPL     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f83209a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel.C34274a.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$a0 */
    static final class C34275a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83210d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$a0$a */
        static final class C34276a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83211d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34276a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83211d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82669a(C39960x xVar) {
                int i;
                Object obj;
                boolean z;
                List list = (List) this.f83211d.mo70791ke().mo4814f();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C34366d) obj).mo82745b() == C27685a.ACC_TYPE_PENSION) {
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
                    C34366d dVar = (C34366d) obj;
                    if (dVar != null) {
                        i = dVar.mo82744a();
                        ProductsViewModel$ViewModel productsViewModel$ViewModel = this.f83211d;
                        C31104a fx = productsViewModel$ViewModel.f83187e;
                        C41536l.m120488h(xVar, "pensionAmount");
                        productsViewModel$ViewModel.m100881oy(fx.mo71315l(xVar, i));
                    }
                }
                i = 2;
                ProductsViewModel$ViewModel productsViewModel$ViewModel2 = this.f83211d;
                C31104a fx2 = productsViewModel$ViewModel2.f83187e;
                C41536l.m120488h(xVar, "pensionAmount");
                productsViewModel$ViewModel2.m100881oy(fx2.mo71315l(xVar, i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82669a((C39960x) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$a0$b */
        static final class C34277b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83212d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34277b(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83212d = productsViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f83212d.m100881oy(new C34366d.C34372f(C27685a.ACC_TYPE_PENSION));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34275a0(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83210d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82668a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34276a(this.f83210d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34277b(this.f83210d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82668a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$b */
    static final class C34278b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34278b(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83213d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            return C31270e.m92879h(C26186e.m81987e(this.f83213d.f83188f.mo63907a(C41341q.m119910m(2, 6).contains(num))), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$b0 */
    static final class C34279b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34279b0(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83214d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p O = this.f83214d.f83196n.mo92575a().mo95075O();
            C41536l.m120488h(O, "getPensionStatusUseCase(…          .toObservable()");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$c */
    static final class C34280c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83215d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$c$a */
        static final class C34281a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83216d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34281a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83216d = productsViewModel$ViewModel;
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo82674a(l70.C25846a r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r4.f83216d
                    androidx.lifecycle.LiveData r0 = r0.mo70791ke()
                    java.lang.Object r0 = r0.mo4814f()
                    java.util.List r0 = (java.util.List) r0
                    if (r0 == 0) goto L_0x003c
                    java.util.Iterator r0 = r0.iterator()
                L_0x0017:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L_0x0032
                    java.lang.Object r1 = r0.next()
                    r2 = r1
                    ge.bog.mobilebank.products.presentation.products.d r2 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r2
                    q70.a r2 = r2.mo82745b()
                    q70.a r3 = q70.C27685a.ACC_TYPE_ACCOUNT
                    if (r2 != r3) goto L_0x002e
                    r2 = 1
                    goto L_0x002f
                L_0x002e:
                    r2 = 0
                L_0x002f:
                    if (r2 == 0) goto L_0x0017
                    goto L_0x0033
                L_0x0032:
                    r1 = 0
                L_0x0033:
                    ge.bog.mobilebank.products.presentation.products.d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r1
                    if (r1 == 0) goto L_0x003c
                    int r0 = r1.mo82744a()
                    goto L_0x003d
                L_0x003c:
                    r0 = 2
                L_0x003d:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r1 = r4.f83216d
                    b01.a r1 = r1.f83187e
                    m70.i r2 = r5.mo64628a()
                    o70.e r5 = r5.mo64629b()
                    ge.bog.mobilebank.products.presentation.products.d r5 = r1.mo71308e(r2, r5, r0)
                    if (r5 == 0) goto L_0x0057
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r4.f83216d
                    r0.m100881oy(r5)
                    goto L_0x007d
                L_0x0057:
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r4.f83216d
                    androidx.lifecycle.x r0 = r0.f83208z
                    java.lang.Object r0 = r0.mo4814f()
                    java.util.List r0 = (java.util.List) r0
                    if (r0 == 0) goto L_0x006d
                    r5.addAll(r0)
                L_0x006d:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r4.f83216d
                    q70.a r1 = q70.C27685a.ACC_TYPE_ACCOUNT
                    r0.m100875my(r5, r1)
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r4.f83216d
                    androidx.lifecycle.x r0 = r0.f83208z
                    r0.mo4826r(r5)
                L_0x007d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel.C34280c.C34281a.mo82674a(l70.a):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82674a((C25846a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$c$b */
        static final class C34282b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83217d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34282b(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83217d = productsViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f83217d.m100881oy(new C34366d.C34372f(C27685a.ACC_TYPE_ACCOUNT));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34280c(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83215d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82673a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34281a(this.f83215d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34282b(this.f83215d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82673a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$c0 */
    static final class C34283c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83218d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$c0$a */
        static final class C34284a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83219d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34284a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83219d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82677a(C39961y yVar) {
                if (yVar.mo93792a()) {
                    this.f83219d.f83180L.onNext(C41238w.f97225a);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82677a((C39961y) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34283c0(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83218d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82676a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34284a(this.f83218d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82676a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$d */
    static final class C34285d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83220d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34285d(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83220d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            return C31270e.m92879h(C26186e.m81987e(this.f83220d.f83202t.mo92574a(C41341q.m119910m(2, 6).contains(num))), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$d0 */
    static final class C34286d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34286d0(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83221d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            return C31270e.m92879h(this.f83221d.f83201s.mo93581a(C41341q.m119910m(2, 6).contains(num)), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$e */
    static final class C34287e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83222d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$e$a */
        static final class C34288a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83223d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34288a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83223d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82681a(C17847m mVar) {
                int i;
                Object obj;
                boolean z;
                C41536l.m120489i(mVar, "bnpl");
                List list = (List) this.f83223d.mo70791ke().mo4814f();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C34366d) obj).mo82745b() == C27685a.BNPL) {
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
                    C34366d dVar = (C34366d) obj;
                    if (dVar != null) {
                        i = dVar.mo82744a();
                        ProductsViewModel$ViewModel productsViewModel$ViewModel = this.f83223d;
                        productsViewModel$ViewModel.m100881oy(productsViewModel$ViewModel.f83187e.mo71306c(mVar, i));
                    }
                }
                i = 2;
                ProductsViewModel$ViewModel productsViewModel$ViewModel2 = this.f83223d;
                productsViewModel$ViewModel2.m100881oy(productsViewModel$ViewModel2.f83187e.mo71306c(mVar, i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82681a((C17847m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$e$b */
        static final class C34289b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83224d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34289b(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83224d = productsViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f83224d.m100881oy(new C34366d.C34372f(C27685a.BNPL));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34287e(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83222d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82680a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34288a(this.f83222d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34289b(this.f83222d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82680a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$e0 */
    static final class C34290e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83225d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$e0$a */
        static final class C34291a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83226d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34291a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83226d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82684a(C40252e eVar) {
                int i;
                Object obj;
                boolean z;
                C41536l.m120489i(eVar, "info");
                List list = (List) this.f83226d.f83208z.mo4814f();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C34366d) obj).mo82745b() == C27685a.PIGGY_BANK) {
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
                    C34366d dVar = (C34366d) obj;
                    if (dVar != null) {
                        i = dVar.mo82744a();
                        ProductsViewModel$ViewModel productsViewModel$ViewModel = this.f83226d;
                        productsViewModel$ViewModel.m100881oy(productsViewModel$ViewModel.f83187e.mo71316m(eVar, i));
                    }
                }
                i = 2;
                ProductsViewModel$ViewModel productsViewModel$ViewModel2 = this.f83226d;
                productsViewModel$ViewModel2.m100881oy(productsViewModel$ViewModel2.f83187e.mo71316m(eVar, i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82684a((C40252e) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$e0$b */
        static final class C34292b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83227d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34292b(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83227d = productsViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f83227d.m100881oy(new C34366d.C34372f(C27685a.PIGGY_BANK));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34290e0(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83225d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82683a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34291a(this.f83225d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34292b(this.f83225d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82683a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$f */
    static final class C34293f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83228d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34293f(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83228d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C31270e.m92879h(C26186e.m81987e(this.f83228d.f83194l.mo92598a(C41341q.m119910m(2, 6).contains(num))), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$g */
    static final class C34294g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83229d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$g$a */
        static final class C34295a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83230d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34295a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83230d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82688a(C39941e eVar) {
                int i;
                Object obj;
                boolean z;
                C41536l.m120489i(eVar, "bonds");
                List list = (List) this.f83230d.mo70791ke().mo4814f();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C34366d) obj).mo82745b() == C27685a.ACC_TYPE_GT) {
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
                    C34366d dVar = (C34366d) obj;
                    if (dVar != null) {
                        i = dVar.mo82744a();
                        ProductsViewModel$ViewModel productsViewModel$ViewModel = this.f83230d;
                        productsViewModel$ViewModel.m100881oy(productsViewModel$ViewModel.f83187e.mo71309f(eVar, i));
                    }
                }
                i = 2;
                ProductsViewModel$ViewModel productsViewModel$ViewModel2 = this.f83230d;
                productsViewModel$ViewModel2.m100881oy(productsViewModel$ViewModel2.f83187e.mo71309f(eVar, i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82688a((C39941e) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$g$b */
        static final class C34296b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83231d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34296b(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83231d = productsViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f83231d.m100881oy(new C34366d.C34372f(C27685a.ACC_TYPE_GT));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34294g(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83229d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82687a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34295a(this.f83229d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34296b(this.f83229d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82687a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$h */
    static final class C34297h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83232d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34297h(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83232d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            String str;
            C41536l.m120489i(wVar, "it");
            C38887r Rw = this.f83232d.f83199q;
            C20557a b = this.f83232d.f83200r.mo48775b("MBANK_PENSION_CONTRACT_TYPE_ANDROID");
            if (b == null || (str = b.mo49087d()) == null) {
                str = "";
            }
            C40749p O = C38887r.m113705b(Rw, str, (Long) null, 2, (Object) null).mo95075O();
            C41536l.m120488h(O, "getContractUseCase(\n    …          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$i */
    static final class C34298i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83233d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$i$a */
        static final class C34299a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83234d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34299a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83234d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82692a(C39945i iVar) {
                C1644x kx = this.f83234d.f83170B;
                C41536l.m120488h(iVar, "contract");
                C37224b.m109965d(kx, iVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82692a((C39945i) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34298i(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83233d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82691a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34299a(this.f83233d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82691a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$j */
    static final class C34300j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34300j(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83235d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            return this.f83235d.f83189g.mo92591a(C41341q.m119910m(2, 6).contains(num));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$k */
    static final class C34301k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34301k(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83236d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82694a(C26191f fVar) {
            if (fVar instanceof C26191f.C26192a) {
                this.f83236d.m100881oy(new C34366d.C34372f(C27685a.ACC_TYPE_CREDIT_CARD));
            } else if (!C41536l.m120484d(fVar, C26191f.C26193b.f66398a) && (fVar instanceof C26191f.C26194c)) {
                this.f83236d.f83175G.onNext(C41238w.f97225a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82694a((C26191f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$l */
    static final class C34302l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34302l(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83237d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92879h(C26186e.m81987e(this.f83237d.f83190h.mo92588b(false)), 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$m */
    static final class C34303m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83238d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$m$a */
        static final class C34304a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83239d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34304a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83239d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82697a(C41224m mVar) {
                int i;
                Object obj;
                boolean z;
                C41536l.m120489i(mVar, "it");
                List list = (List) this.f83239d.mo70791ke().mo4814f();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C34366d) obj).mo82745b() == C27685a.ACC_TYPE_CREDIT_CARD) {
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
                    C34366d dVar = (C34366d) obj;
                    if (dVar != null) {
                        i = dVar.mo82744a();
                        ProductsViewModel$ViewModel productsViewModel$ViewModel = this.f83239d;
                        productsViewModel$ViewModel.m100881oy(productsViewModel$ViewModel.f83187e.mo71310g((C39948l) mVar.mo95678e(), (C26766e) mVar.mo95680f(), i));
                    }
                }
                i = 2;
                ProductsViewModel$ViewModel productsViewModel$ViewModel2 = this.f83239d;
                productsViewModel$ViewModel2.m100881oy(productsViewModel$ViewModel2.f83187e.mo71310g((C39948l) mVar.mo95678e(), (C26766e) mVar.mo95680f(), i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82697a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34303m(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83238d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82696a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34304a(this.f83238d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82696a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$n */
    static final class C34305n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34305n(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83240d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C31270e.m92879h(C26186e.m81987e(this.f83240d.f83191i.mo89942a(C41341q.m119910m(2, 6).contains(num))), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$o */
    static final class C34306o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83241d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$o$a */
        static final class C34307a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83242d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34307a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83242d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82700a(C37508i iVar) {
                int i;
                Object obj;
                boolean z;
                C41536l.m120489i(iVar, "deposits");
                List list = (List) this.f83242d.mo70791ke().mo4814f();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C34366d) obj).mo82745b() == C27685a.ACC_TYPE_DEPOSIT) {
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
                    C34366d dVar = (C34366d) obj;
                    if (dVar != null) {
                        i = dVar.mo82744a();
                        ProductsViewModel$ViewModel productsViewModel$ViewModel = this.f83242d;
                        productsViewModel$ViewModel.m100881oy(productsViewModel$ViewModel.f83187e.mo71311h(iVar, i));
                    }
                }
                i = 2;
                ProductsViewModel$ViewModel productsViewModel$ViewModel2 = this.f83242d;
                productsViewModel$ViewModel2.m100881oy(productsViewModel$ViewModel2.f83187e.mo71311h(iVar, i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82700a((C37508i) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$o$b */
        static final class C34308b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83243d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34308b(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83243d = productsViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f83243d.m100881oy(new C34366d.C34372f(C27685a.ACC_TYPE_DEPOSIT));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34306o(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83241d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82699a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34307a(this.f83241d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34308b(this.f83241d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82699a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$p */
    static final class C34309p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83244d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34309p(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83244d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            C40749p pVar;
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            String str = (String) mVar.mo95675a();
            int intValue = ((Number) mVar.mo95676b()).intValue();
            if (C41536l.m120484d(str, ProductType.PRODUCT_STATUS_APPROVED)) {
                pVar = C26186e.m81987e(this.f83244d.f83192j.mo92597a(C41341q.m119910m(2, 6).contains(Integer.valueOf(intValue))));
            } else {
                pVar = C40749p.m118043h0(str);
                C41536l.m120488h(pVar, "just(status)");
            }
            return C31270e.m92879h(pVar, intValue);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$q */
    static final class C34310q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83245d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$q$a */
        static final class C34311a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83246d;

            /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$q$a$a */
            static final class C34312a extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C34312a f83247d = new C34312a();

                C34312a() {
                    super(1);
                }

                /* renamed from: a */
                public final Boolean invoke(C34366d dVar) {
                    boolean z;
                    C41536l.m120489i(dVar, "it");
                    if (dVar.mo82745b() == C27685a.TYPE_GTP_TRADING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34311a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83246d = productsViewModel$ViewModel;
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo82704a(java.lang.Object r5) {
                /*
                    r4 = this;
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r4.f83246d
                    androidx.lifecycle.LiveData r0 = r0.mo70791ke()
                    java.lang.Object r0 = r0.mo4814f()
                    java.util.List r0 = (java.util.List) r0
                    if (r0 == 0) goto L_0x0037
                    java.util.Iterator r0 = r0.iterator()
                L_0x0012:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L_0x002d
                    java.lang.Object r1 = r0.next()
                    r2 = r1
                    ge.bog.mobilebank.products.presentation.products.d r2 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r2
                    q70.a r2 = r2.mo82745b()
                    q70.a r3 = q70.C27685a.TYPE_GTP_TRADING
                    if (r2 != r3) goto L_0x0029
                    r2 = 1
                    goto L_0x002a
                L_0x0029:
                    r2 = 0
                L_0x002a:
                    if (r2 == 0) goto L_0x0012
                    goto L_0x002e
                L_0x002d:
                    r1 = 0
                L_0x002e:
                    ge.bog.mobilebank.products.presentation.products.d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r1
                    if (r1 == 0) goto L_0x0037
                    int r0 = r1.mo82744a()
                    goto L_0x0038
                L_0x0037:
                    r0 = 2
                L_0x0038:
                    boolean r1 = r5 instanceof java.lang.String
                    if (r1 == 0) goto L_0x0090
                    java.lang.String r1 = "CLOSED"
                    boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r5, r1)
                    if (r1 != 0) goto L_0x0065
                    java.lang.String r1 = "NEW"
                    boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r5, r1)
                    if (r1 != 0) goto L_0x0065
                    java.lang.String r1 = "REJECTED"
                    boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r5, r1)
                    if (r1 == 0) goto L_0x0055
                    goto L_0x0065
                L_0x0055:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r1 = r4.f83246d
                    b01.a r2 = r1.f83187e
                    java.lang.String r5 = (java.lang.String) r5
                    ge.bog.mobilebank.products.presentation.products.d$e r5 = r2.mo71312i(r5, r0)
                    r1.m100881oy(r5)
                    goto L_0x00a3
                L_0x0065:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r5 = r4.f83246d
                    androidx.lifecycle.x r5 = r5.f83208z
                    java.lang.Object r5 = r5.mo4814f()
                    java.util.List r5 = (java.util.List) r5
                    if (r5 == 0) goto L_0x0079
                    java.util.List r5 = ie1.C41358y.m119991B0(r5)
                    if (r5 != 0) goto L_0x0081
                L_0x0079:
                    java.util.List r5 = ie1.C41341q.m119907j()
                    java.util.List r5 = ie1.C41358y.m119991B0(r5)
                L_0x0081:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$q$a$a r0 = p341ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel.C34310q.C34311a.C34312a.f83247d
                    boolean unused = ie1.C41352v.m119961F(r5, r0)
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r4.f83246d
                    androidx.lifecycle.x r0 = r0.f83208z
                    r0.mo4826r(r5)
                    goto L_0x00a3
                L_0x0090:
                    boolean r1 = r5 instanceof xy0.C39950n
                    if (r1 == 0) goto L_0x00a3
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r1 = r4.f83246d
                    b01.a r2 = r1.f83187e
                    xy0.n r5 = (xy0.C39950n) r5
                    ge.bog.mobilebank.products.presentation.products.d$e r5 = r2.mo71313j(r5, r0)
                    r1.m100881oy(r5)
                L_0x00a3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel.C34310q.C34311a.mo82704a(java.lang.Object):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82704a(obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$q$b */
        static final class C34313b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83248d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34313b(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83248d = productsViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f83248d.m100881oy(new C34366d.C34372f(C27685a.TYPE_GTP_TRADING));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34310q(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83245d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82703a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34311a(this.f83245d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34313b(this.f83245d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82703a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$r */
    static final class C34314r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83249d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34314r(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83249d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C29397e Xw = this.f83249d.f83203u;
            String clientKey = this.f83249d.f83205w.getUserInfo().getClient().getClientKey();
            C41536l.m120488h(clientKey, "client.userInfo.client.clientKey");
            return C31270e.m92879h(Xw.mo69238a(clientKey, C41341q.m119910m(2, 6).contains(num)), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$s */
    static final class C34315s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83250d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$s$a */
        static final class C34316a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83251d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34316a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83251d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82709a(List list) {
                C41536l.m120489i(list, PaymentServiceConfig.TYPE_GIFT_CARD);
                ProductsViewModel$ViewModel productsViewModel$ViewModel = this.f83251d;
                productsViewModel$ViewModel.m100881oy(productsViewModel$ViewModel.f83187e.mo71307d(list));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82709a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$s$b */
        static final class C34317b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83252d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34317b(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83252d = productsViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f83252d.m100881oy(new C34366d.C34372f(C27685a.GIFT_CARD_OWNER));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34315s(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83250d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82708a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34316a(this.f83250d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34317b(this.f83250d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82708a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$t */
    static final class C34318t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83253d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34318t(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83253d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            return C31270e.m92883l(this.f83253d.f83195m.mo63915a(C41341q.m119910m(2, 6).contains(num)), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$u */
    static final class C34319u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83254d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$u$a */
        static final class C34320a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83255d;

            /* renamed from: e */
            final /* synthetic */ int f83256e;

            /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$u$a$a */
            public /* synthetic */ class C34321a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f83257a;

                /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
                /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
                /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        q70.a[] r0 = q70.C27685a.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        q70.a r1 = q70.C27685a.ACC_TYPE_DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        q70.a r1 = q70.C27685a.ACC_TYPE_LOAN     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        q70.a r1 = q70.C27685a.ACC_TYPE_GT     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        q70.a r1 = q70.C27685a.ACC_TYPE_PENSION     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        q70.a r1 = q70.C27685a.TYPE_GTP_TRADING     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        q70.a r1 = q70.C27685a.ACC_TYPE_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x003d }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                        r2 = 6
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                    L_0x003d:
                        q70.a r1 = q70.C27685a.ACC_TYPE_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0046 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                        r2 = 7
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                    L_0x0046:
                        q70.a r1 = q70.C27685a.BNPL     // Catch:{ NoSuchFieldError -> 0x0050 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                        r2 = 8
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                    L_0x0050:
                        q70.a r1 = q70.C27685a.GIFT_CARD_OWNER     // Catch:{ NoSuchFieldError -> 0x005a }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                        r2 = 9
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                    L_0x005a:
                        f83257a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel.C34319u.C34320a.C34321a.<clinit>():void");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34320a(ProductsViewModel$ViewModel productsViewModel$ViewModel, int i) {
                super(1);
                this.f83255d = productsViewModel$ViewModel;
                this.f83256e = i;
            }

            /* JADX WARNING: Removed duplicated region for block: B:125:0x00d6 A[EDGE_INSN: B:125:0x00d6->B:51:0x00d6 ?: BREAK  , SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:129:0x019f A[EDGE_INSN: B:129:0x019f->B:93:0x019f ?: BREAK  , SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x00e2  */
            /* JADX WARNING: Removed duplicated region for block: B:62:0x00f8 A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:66:0x0125  */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x0132  */
            /* JADX WARNING: Removed duplicated region for block: B:74:0x0142  */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x0149  */
            /* JADX WARNING: Removed duplicated region for block: B:78:0x015a  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x018b  */
            /* JADX WARNING: Removed duplicated region for block: B:94:0x01a1  */
            /* JADX WARNING: Removed duplicated region for block: B:98:0x01be  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo82713a(java.util.List r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = "prodTypesResult"
                    kotlin.jvm.internal.C41536l.m120489i(r11, r0)
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r10.f83255d
                    eu.b r0 = r0.f83200r
                    java.lang.String r1 = "IS_GT_TRADING_ALLOWED"
                    fu.a r0 = r0.mo48775b(r1)
                    r1 = 0
                    if (r0 == 0) goto L_0x001f
                    java.lang.Boolean r0 = r0.mo49084a()
                    if (r0 == 0) goto L_0x001f
                    boolean r0 = r0.booleanValue()
                    goto L_0x0020
                L_0x001f:
                    r0 = r1
                L_0x0020:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r2 = r10.f83255d
                    q70.a r3 = q70.C27685a.TYPE_GTP_TRADING
                    java.lang.String r2 = r2.mo82667sx(r3)
                    java.lang.String r3 = "NEW"
                    r4 = 1
                    if (r0 == 0) goto L_0x006f
                    if (r2 == 0) goto L_0x0043
                    boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)
                    if (r5 != 0) goto L_0x0043
                    java.lang.String r5 = "REJECTED"
                    boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r5)
                    if (r2 == 0) goto L_0x003e
                    goto L_0x0043
                L_0x003e:
                    java.util.List r2 = ie1.C41358y.m119991B0(r11)
                    goto L_0x009a
                L_0x0043:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r5 = r11.iterator()
                L_0x004c:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto L_0x006a
                    java.lang.Object r6 = r5.next()
                    r7 = r6
                    q70.b r7 = (q70.C27686b) r7
                    q70.a r7 = r7.mo67222a()
                    q70.a r8 = q70.C27685a.TYPE_GTP_TRADING
                    if (r7 == r8) goto L_0x0063
                    r7 = r4
                    goto L_0x0064
                L_0x0063:
                    r7 = r1
                L_0x0064:
                    if (r7 == 0) goto L_0x004c
                    r2.add(r6)
                    goto L_0x004c
                L_0x006a:
                    java.util.List r2 = ie1.C41358y.m119991B0(r2)
                    goto L_0x009a
                L_0x006f:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r5 = r11.iterator()
                L_0x0078:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto L_0x0096
                    java.lang.Object r6 = r5.next()
                    r7 = r6
                    q70.b r7 = (q70.C27686b) r7
                    q70.a r7 = r7.mo67222a()
                    q70.a r8 = q70.C27685a.TYPE_GTP_TRADING
                    if (r7 == r8) goto L_0x008f
                    r7 = r4
                    goto L_0x0090
                L_0x008f:
                    r7 = r1
                L_0x0090:
                    if (r7 == 0) goto L_0x0078
                    r2.add(r6)
                    goto L_0x0078
                L_0x0096:
                    java.util.List r2 = ie1.C41358y.m119991B0(r2)
                L_0x009a:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r5 = r10.f83255d
                    b01.a r5 = r5.f83187e
                    java.util.List r2 = r5.mo71317n(r2)
                    boolean r5 = r2 instanceof java.util.Collection
                    if (r5 == 0) goto L_0x00b0
                    boolean r6 = r2.isEmpty()
                    if (r6 == 0) goto L_0x00b0
                L_0x00ae:
                    r6 = r4
                    goto L_0x00ce
                L_0x00b0:
                    java.util.Iterator r6 = r2.iterator()
                L_0x00b4:
                    boolean r7 = r6.hasNext()
                    if (r7 == 0) goto L_0x00ae
                    java.lang.Object r7 = r6.next()
                    ge.bog.mobilebank.products.presentation.products.d$d r7 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r7
                    q70.a r7 = r7.mo82745b()
                    q70.a r8 = q70.C27685a.ACC_TYPE_PENSION
                    if (r7 != r8) goto L_0x00ca
                    r7 = r4
                    goto L_0x00cb
                L_0x00ca:
                    r7 = r1
                L_0x00cb:
                    if (r7 == 0) goto L_0x00b4
                    r6 = r1
                L_0x00ce:
                    if (r5 == 0) goto L_0x00d8
                    boolean r5 = r2.isEmpty()
                    if (r5 == 0) goto L_0x00d8
                L_0x00d6:
                    r5 = r4
                    goto L_0x00f6
                L_0x00d8:
                    java.util.Iterator r5 = r2.iterator()
                L_0x00dc:
                    boolean r7 = r5.hasNext()
                    if (r7 == 0) goto L_0x00d6
                    java.lang.Object r7 = r5.next()
                    ge.bog.mobilebank.products.presentation.products.d$d r7 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r7
                    q70.a r7 = r7.mo82745b()
                    q70.a r8 = q70.C27685a.TYPE_GTP_TRADING
                    if (r7 != r8) goto L_0x00f2
                    r7 = r4
                    goto L_0x00f3
                L_0x00f2:
                    r7 = r1
                L_0x00f3:
                    if (r7 == 0) goto L_0x00dc
                    r5 = r1
                L_0x00f6:
                    if (r6 != 0) goto L_0x010b
                    if (r5 == 0) goto L_0x00fb
                    goto L_0x010b
                L_0x00fb:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r10.f83255d
                    androidx.lifecycle.x r0 = r0.f83208z
                    ge.bog.mobilebank.products.presentation.products.d$b r3 = p341ge.bog.mobilebank.products.presentation.products.C34366d.C34368b.f83320c
                    java.util.List r3 = ie1.C41358y.m120024n0(r2, r3)
                    r0.mo4826r(r3)
                    goto L_0x0176
                L_0x010b:
                    java.util.ArrayList r7 = new java.util.ArrayList
                    r7.<init>()
                    r7.addAll(r2)
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r8 = r10.f83255d
                    ge.bog.mobilebank.model.Client r8 = r8.f83205w
                    ge.bog.mobilebank.model.usrinfo.UserRestrictions r8 = r8.getUserRestrictions()
                    java.lang.String r9 = "MORE_OFFERS_AND_APPLICATIONS"
                    boolean r8 = r8.contains(r9)
                    if (r8 != 0) goto L_0x012a
                    ge.bog.mobilebank.products.presentation.products.d$b r8 = p341ge.bog.mobilebank.products.presentation.products.C34366d.C34368b.f83320c
                    r7.add(r8)
                L_0x012a:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r8 = r10.f83255d
                    boolean r8 = r8.m100878ny()
                    if (r8 == 0) goto L_0x0137
                    ge.bog.mobilebank.products.presentation.products.d$g r8 = p341ge.bog.mobilebank.products.presentation.products.C34366d.C34373g.f83332c
                    r7.add(r8)
                L_0x0137:
                    if (r5 == 0) goto L_0x0140
                    if (r0 == 0) goto L_0x0140
                    ge.bog.mobilebank.products.presentation.products.d$h r0 = p341ge.bog.mobilebank.products.presentation.products.C34366d.C34374h.f83333c
                    r7.add(r0)
                L_0x0140:
                    if (r6 == 0) goto L_0x0147
                    ge.bog.mobilebank.products.presentation.products.d$i r0 = p341ge.bog.mobilebank.products.presentation.products.C34366d.C34375i.f83334c
                    r7.add(r0)
                L_0x0147:
                    if (r6 == 0) goto L_0x0158
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r10.f83255d
                    ee1.b r0 = r0.f83179K
                    int r6 = r10.f83256e
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r0.onNext(r6)
                L_0x0158:
                    if (r5 == 0) goto L_0x016d
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r10.f83255d
                    ee1.b r0 = r0.f83182N
                    int r5 = r10.f83256e
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    he1.m r3 = he1.C41233s.m119492a(r3, r5)
                    r0.onNext(r3)
                L_0x016d:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r0 = r10.f83255d
                    androidx.lifecycle.x r0 = r0.f83208z
                    r0.mo4826r(r7)
                L_0x0176:
                    boolean r0 = r11 instanceof java.util.Collection
                    if (r0 == 0) goto L_0x0181
                    boolean r0 = r11.isEmpty()
                    if (r0 == 0) goto L_0x0181
                    goto L_0x019f
                L_0x0181:
                    java.util.Iterator r11 = r11.iterator()
                L_0x0185:
                    boolean r0 = r11.hasNext()
                    if (r0 == 0) goto L_0x019f
                    java.lang.Object r0 = r11.next()
                    q70.b r0 = (q70.C27686b) r0
                    q70.a r0 = r0.mo67222a()
                    q70.a r3 = q70.C27685a.PIGGY_BANK
                    if (r0 != r3) goto L_0x019b
                    r0 = r4
                    goto L_0x019c
                L_0x019b:
                    r0 = r1
                L_0x019c:
                    if (r0 == 0) goto L_0x0185
                    r1 = r4
                L_0x019f:
                    if (r1 == 0) goto L_0x01b0
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r11 = r10.f83255d
                    ee1.b r11 = r11.f83183O
                    int r0 = r10.f83256e
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r11.onNext(r0)
                L_0x01b0:
                    ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel r11 = r10.f83255d
                    int r0 = r10.f83256e
                    java.util.Iterator r1 = r2.iterator()
                L_0x01b8:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0254
                    java.lang.Object r2 = r1.next()
                    ge.bog.mobilebank.products.presentation.products.d$d r2 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r2
                    q70.a r3 = r2.mo82745b()
                    if (r3 != 0) goto L_0x01cc
                    r3 = -1
                    goto L_0x01d4
                L_0x01cc:
                    int[] r4 = p341ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel.C34319u.C34320a.C34321a.f83257a
                    int r3 = r3.ordinal()
                    r3 = r4[r3]
                L_0x01d4:
                    switch(r3) {
                        case 1: goto L_0x0247;
                        case 2: goto L_0x023a;
                        case 3: goto L_0x022d;
                        case 4: goto L_0x0223;
                        case 5: goto L_0x0208;
                        case 6: goto L_0x01fc;
                        case 7: goto L_0x01f0;
                        case 8: goto L_0x01e4;
                        case 9: goto L_0x01d8;
                        default: goto L_0x01d7;
                    }
                L_0x01d7:
                    goto L_0x01b8
                L_0x01d8:
                    ee1.b r2 = r11.f83185Q
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                    r2.onNext(r3)
                    goto L_0x01b8
                L_0x01e4:
                    ee1.b r2 = r11.f83184P
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                    r2.onNext(r3)
                    goto L_0x01b8
                L_0x01f0:
                    ee1.b r2 = r11.f83174F
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                    r2.onNext(r3)
                    goto L_0x01b8
                L_0x01fc:
                    ee1.b r2 = r11.f83173E
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                    r2.onNext(r3)
                    goto L_0x01b8
                L_0x0208:
                    ee1.b r3 = r11.f83182N
                    java.lang.Object r2 = r2.mo82751d()
                    java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
                    kotlin.jvm.internal.C41536l.m120487g(r2, r4)
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                    he1.m r2 = he1.C41233s.m119492a(r2, r4)
                    r3.onNext(r2)
                    goto L_0x01b8
                L_0x0223:
                    ee1.b r2 = r11.f83180L
                    he1.w r3 = he1.C41238w.f97225a
                    r2.onNext(r3)
                    goto L_0x01b8
                L_0x022d:
                    ee1.b r2 = r11.f83178J
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                    r2.onNext(r3)
                    goto L_0x01b8
                L_0x023a:
                    ee1.b r2 = r11.f83177I
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                    r2.onNext(r3)
                    goto L_0x01b8
                L_0x0247:
                    ee1.b r2 = r11.f83176H
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                    r2.onNext(r3)
                    goto L_0x01b8
                L_0x0254:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel.C34319u.C34320a.mo82713a(java.util.List):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82713a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34319u(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83254d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82712a(C31128a aVar) {
            this.f83254d.f83169A.mo4826r(aVar);
            int b = aVar.mo71341b();
            if (C41341q.m119910m(2, 6).contains(Integer.valueOf(b))) {
                this.f83254d.f83205w.updateClientProducts(false);
            }
            C41536l.m120488h(aVar, "productTypesResult");
            C31132b.m92648j(aVar, (int[]) null, new C34320a(this.f83254d, b), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82712a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$v */
    static final class C34322v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83258d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34322v(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83258d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C31270e.m92879h(C26186e.m81987e(this.f83258d.f83193k.mo92572a(C41341q.m119910m(2, 6).contains(num))), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$w */
    static final class C34323w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83259d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$w$a */
        static final class C34324a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83260d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34324a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83260d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82716a(C39959w wVar) {
                int i;
                Object obj;
                boolean z;
                C41536l.m120489i(wVar, "loans");
                List list = (List) this.f83260d.mo70791ke().mo4814f();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C34366d) obj).mo82745b() == C27685a.ACC_TYPE_LOAN) {
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
                    C34366d dVar = (C34366d) obj;
                    if (dVar != null) {
                        i = dVar.mo82744a();
                        ProductsViewModel$ViewModel productsViewModel$ViewModel = this.f83260d;
                        productsViewModel$ViewModel.m100881oy(productsViewModel$ViewModel.f83187e.mo71314k(wVar, i));
                    }
                }
                i = 2;
                ProductsViewModel$ViewModel productsViewModel$ViewModel2 = this.f83260d;
                productsViewModel$ViewModel2.m100881oy(productsViewModel$ViewModel2.f83187e.mo71314k(wVar, i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82716a((C39959w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$w$b */
        static final class C34325b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83261d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34325b(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83261d = productsViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f83261d.m100881oy(new C34366d.C34372f(C27685a.ACC_TYPE_LOAN));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34323w(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83259d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82715a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C34324a(this.f83259d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34325b(this.f83259d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82715a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$x */
    static final class C34326x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83262d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$x$a */
        static final class C34327a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C34327a f83263d = new C34327a();

            C34327a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34326x(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83262d = productsViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m100954c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t mo82718b(boolean z) {
            return this.f83262d.f83198p.mo92590a(z).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C34377e(C34327a.f83263d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo82718b(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$y */
    static final class C34328y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83264d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$y$a */
        static final class C34329a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductsViewModel$ViewModel f83265d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34329a(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
                super(1);
                this.f83265d = productsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82721a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f83265d.onRefresh(6);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82721a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34328y(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83264d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82720a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C34329a(this.f83264d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82720a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel$z */
    static final class C34330z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductsViewModel$ViewModel f83266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34330z(ProductsViewModel$ViewModel productsViewModel$ViewModel) {
            super(1);
            this.f83266d = productsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40749p O = this.f83266d.f83197o.mo92573a().mo95075O();
            C41536l.m120488h(O, "getPensionAmountUseCase(…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductsViewModel$ViewModel(C25352k kVar, C31104a aVar, C38864h hVar, C38894u uVar, C38891t tVar, C37019f fVar, C38901y yVar, C38872j0 j0Var, C38902z zVar, C38878m0 m0Var, C38876l0 l0Var, C38874k0 k0Var, C38893t0 t0Var, C38887r rVar, C20292b bVar, C39879r rVar2, C38875l lVar, C29397e eVar, C29407n nVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C25352k kVar2 = kVar;
        C31104a aVar2 = aVar;
        C38864h hVar2 = hVar;
        C38894u uVar2 = uVar;
        C38891t tVar2 = tVar;
        C37019f fVar2 = fVar;
        C38901y yVar2 = yVar;
        C38872j0 j0Var2 = j0Var;
        C38902z zVar2 = zVar;
        C38878m0 m0Var2 = m0Var;
        C38876l0 l0Var2 = l0Var;
        C38874k0 k0Var2 = k0Var;
        C38893t0 t0Var2 = t0Var;
        C39879r rVar3 = rVar2;
        C41536l.m120489i(kVar2, "reloadProductsUseCase");
        C41536l.m120489i(aVar2, "mapper");
        C41536l.m120489i(hVar2, "getAccountsAndCardsUseCase");
        C41536l.m120489i(uVar2, "getCreditCardsAndDetailsUseCase");
        C41536l.m120489i(tVar2, "getCreditCardsAndCardsUseCase");
        C41536l.m120489i(fVar2, "getDepositsAndBondsWithDetails");
        C41536l.m120489i(yVar2, "getGTDetailsUseCase");
        C41536l.m120489i(j0Var2, "getLoanWithDetailsUseCase");
        C41536l.m120489i(zVar2, "getGaltsUseCase");
        C41536l.m120489i(m0Var2, "getProductTypesUseCase");
        C41536l.m120489i(l0Var2, "getPensionStatusUseCase");
        C41536l.m120489i(k0Var2, "getPensionAmountUseCase");
        C41536l.m120489i(t0Var2, "sendPensionAccessUseCase");
        C41536l.m120489i(rVar, "getContractUseCase");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(rVar2, "getCasServiceInfo");
        C41536l.m120489i(lVar, "getBnplUseCase");
        C41536l.m120489i(eVar, "getGiftCards");
        C41536l.m120489i(nVar, "hasGiftCardsIntroAlreadySeenUseCase");
        C41536l.m120489i(client, "client");
        this.f83186d = kVar2;
        this.f83187e = aVar2;
        this.f83188f = hVar2;
        this.f83189g = uVar2;
        this.f83190h = tVar2;
        this.f83191i = fVar2;
        this.f83192j = yVar2;
        this.f83193k = j0Var2;
        this.f83194l = zVar2;
        this.f83195m = m0Var2;
        this.f83196n = l0Var2;
        this.f83197o = k0Var2;
        this.f83198p = t0Var2;
        this.f83199q = rVar;
        this.f83200r = bVar;
        this.f83201s = rVar2;
        this.f83202t = lVar;
        this.f83203u = eVar;
        this.f83204v = nVar;
        this.f83205w = client;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Boolean>()");
        this.f83172D = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Int>()");
        this.f83173E = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Int>()");
        this.f83174F = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Unit>()");
        this.f83175G = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<Int>()");
        this.f83176H = h15;
        C40767b h16 = C40767b.m118210h1();
        C41536l.m120488h(h16, "create<Int>()");
        this.f83177I = h16;
        C40767b h17 = C40767b.m118210h1();
        C41536l.m120488h(h17, "create<Int>()");
        this.f83178J = h17;
        C40767b h18 = C40767b.m118210h1();
        C41536l.m120488h(h18, "create<Int>()");
        this.f83179K = h18;
        C40767b h19 = C40767b.m118210h1();
        C41536l.m120488h(h19, "create<Unit>()");
        this.f83180L = h19;
        C40767b h110 = C40767b.m118210h1();
        C41536l.m120488h(h110, "create<Unit>()");
        this.f83181M = h110;
        C40767b h111 = C40767b.m118210h1();
        C41536l.m120488h(h111, "create<Pair<String?, Int>>()");
        this.f83182N = h111;
        C40767b h112 = C40767b.m118210h1();
        C41536l.m120488h(h112, "create<Int>()");
        this.f83183O = h112;
        C40767b h113 = C40767b.m118210h1();
        C41536l.m120488h(h113, "create<Int>()");
        this.f83184P = h113;
        C40767b h114 = C40767b.m118210h1();
        C41536l.m120488h(h114, "create<Int>()");
        this.f83185Q = h114;
        m100830Ux();
        m100794Cx();
        m100888tx();
        m100800Fx();
        m100806Ix();
        m100812Lx();
        m100836Xx();
        m100900zx();
        m100818Ox();
        m100860hy();
        m100851ey();
        m100842ay();
        m100869ky();
        m100894wx();
        m100824Rx();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ax */
    public static final C40754t m100790Ax(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bx */
    public static final void m100792Bx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Cx */
    private final void m100794Cx() {
        C41205b F0 = this.f83181M.mo94998Q(new C30465z(new C34297h(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30419a0(new C34298i(this)));
        C41536l.m120488h(F0, "private fun observeContr…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dx */
    public static final C40754t m100796Dx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ex */
    public static final void m100798Ex(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Fx */
    private final void m100800Fx() {
        C41205b F0 = this.f83174F.mo94998Q(new C30431g0(new C34300j(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30433h0(new C34301k(this)));
        C41536l.m120488h(F0, "private fun observeCredi…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gx */
    public static final C40754t m100802Gx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hx */
    public static final void m100804Hx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ix */
    private final void m100806Ix() {
        C41205b F0 = this.f83175G.mo94998Q(new C30421b0(new C34302l(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30425d0(new C34303m(this)));
        C41536l.m120488h(F0, "private fun observeCredi…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jx */
    public static final C40754t m100808Jx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kx */
    public static final void m100810Kx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Lx */
    private final void m100812Lx() {
        C41205b F0 = this.f83176H.mo94998Q(new C30460v(new C34305n(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30462w(new C34306o(this)));
        C41536l.m120488h(F0, "private fun observeDepos…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mx */
    public static final C40754t m100814Mx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nx */
    public static final void m100816Nx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ox */
    private final void m100818Ox() {
        C41205b F0 = this.f83182N.mo94998Q(new C30456t(new C34309p(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30458u(new C34310q(this)));
        C41536l.m120488h(F0, "private fun observeGTSub…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Px */
    public static final C40754t m100820Px(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Qx */
    public static final void m100822Qx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Rx */
    private final void m100824Rx() {
        C41205b F0 = this.f83185Q.mo94998Q(new C30443m0(new C34314r(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30445n0(new C34315s(this)));
        C41536l.m120488h(F0, "private fun observeGiftC…dToLifecycle()\n\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sx */
    public static final C40754t m100826Sx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tx */
    public static final void m100828Tx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ux */
    private final void m100830Ux() {
        C41205b F0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C30427e0(new C34318t(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30429f0(new C34319u(this)));
        C41536l.m120488h(F0, "private fun observeInit(…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vx */
    public static final C40754t m100832Vx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Wx */
    public static final void m100834Wx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Xx */
    private final void m100836Xx() {
        C41205b F0 = this.f83177I.mo94998Q(new C30455s0(new C34322v(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30457t0(new C34323w(this)));
        C41536l.m120488h(F0, "private fun observeLoans…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Yx */
    public static final C40754t m100838Yx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zx */
    public static final void m100840Zx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ay */
    private final void m100842ay() {
        C41205b F0 = this.f83172D.mo94998Q(new C30435i0(new C34326x(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30437j0(new C34328y(this)));
        C41536l.m120488h(F0, "private fun observePensi…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: cy */
    public static final C40754t m100845cy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: dy */
    public static final void m100848dy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ey */
    private final void m100851ey() {
        C41205b F0 = this.f83180L.mo94998Q(new C30439k0(new C34330z(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30441l0(new C34275a0(this)));
        C41536l.m120488h(F0, "private fun observePensi…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fy */
    public static final C40754t m100854fy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gy */
    public static final void m100857gy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hy */
    private final void m100860hy() {
        C41205b F0 = this.f83179K.mo94998Q(new C30463x(new C34279b0(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30464y(new C34283c0(this)));
        C41536l.m120488h(F0, "private fun observePensi…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: iy */
    public static final C40754t m100863iy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jy */
    public static final void m100866jy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ky */
    private final void m100869ky() {
        C40749p L0 = this.f83183O.mo94989L0(new C30454s(new C34286d0(this)));
        C41536l.m120488h(L0, "private fun observePiggy…\n            })\n        }");
        C32343x.m95487t(L0, (C43064a) null, (C43075l) null, new C34290e0(this), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: ly */
    public static final C40754t m100872ly(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: ge.bog.mobilebank.products.presentation.products.d} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: my */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m100875my(java.util.List r7, q70.C27685a r8) {
        /*
            r6 = this;
            java.util.Iterator r0 = r7.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            r5 = r1
            ge.bog.mobilebank.products.presentation.products.d r5 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r5
            q70.a r5 = r5.mo82745b()
            if (r5 != r8) goto L_0x001c
            r5 = r2
            goto L_0x001d
        L_0x001c:
            r5 = r3
        L_0x001d:
            if (r5 == 0) goto L_0x0004
            goto L_0x0021
        L_0x0020:
            r1 = r4
        L_0x0021:
            ge.bog.mobilebank.products.presentation.products.d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r1
            if (r1 == 0) goto L_0x0028
            r7.remove(r1)
        L_0x0028:
            if (r8 != 0) goto L_0x002c
            r8 = -1
            goto L_0x0034
        L_0x002c:
            int[] r0 = p341ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel.C34274a.f83209a
            int r8 = r8.ordinal()
            r8 = r0[r8]
        L_0x0034:
            switch(r8) {
                case 1: goto L_0x014f;
                case 2: goto L_0x012d;
                case 3: goto L_0x010b;
                case 4: goto L_0x00e8;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00a2;
                case 7: goto L_0x007f;
                case 8: goto L_0x005c;
                case 9: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0170
        L_0x0039:
            java.util.Iterator r7 = r7.iterator()
        L_0x003d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0058
            java.lang.Object r8 = r7.next()
            r0 = r8
            ge.bog.mobilebank.products.presentation.products.d r0 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r0
            q70.a r0 = r0.mo82745b()
            q70.a r1 = q70.C27685a.BNPL
            if (r0 != r1) goto L_0x0054
            r0 = r2
            goto L_0x0055
        L_0x0054:
            r0 = r3
        L_0x0055:
            if (r0 == 0) goto L_0x003d
            r4 = r8
        L_0x0058:
            ge.bog.mobilebank.products.presentation.products.d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r4
            goto L_0x0170
        L_0x005c:
            java.util.Iterator r7 = r7.iterator()
        L_0x0060:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x007b
            java.lang.Object r8 = r7.next()
            r0 = r8
            ge.bog.mobilebank.products.presentation.products.d r0 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r0
            q70.a r0 = r0.mo82745b()
            q70.a r1 = q70.C27685a.PIGGY_BANK
            if (r0 != r1) goto L_0x0077
            r0 = r2
            goto L_0x0078
        L_0x0077:
            r0 = r3
        L_0x0078:
            if (r0 == 0) goto L_0x0060
            r4 = r8
        L_0x007b:
            ge.bog.mobilebank.products.presentation.products.d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r4
            goto L_0x0170
        L_0x007f:
            java.util.Iterator r7 = r7.iterator()
        L_0x0083:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x009e
            java.lang.Object r8 = r7.next()
            r0 = r8
            ge.bog.mobilebank.products.presentation.products.d r0 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r0
            q70.a r0 = r0.mo82745b()
            q70.a r1 = q70.C27685a.TYPE_GTP_TRADING
            if (r0 != r1) goto L_0x009a
            r0 = r2
            goto L_0x009b
        L_0x009a:
            r0 = r3
        L_0x009b:
            if (r0 == 0) goto L_0x0083
            r4 = r8
        L_0x009e:
            ge.bog.mobilebank.products.presentation.products.d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r4
            goto L_0x0170
        L_0x00a2:
            java.util.Iterator r7 = r7.iterator()
        L_0x00a6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00c1
            java.lang.Object r8 = r7.next()
            r0 = r8
            ge.bog.mobilebank.products.presentation.products.d r0 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r0
            q70.a r0 = r0.mo82745b()
            q70.a r1 = q70.C27685a.ACC_TYPE_GT
            if (r0 != r1) goto L_0x00bd
            r0 = r2
            goto L_0x00be
        L_0x00bd:
            r0 = r3
        L_0x00be:
            if (r0 == 0) goto L_0x00a6
            r4 = r8
        L_0x00c1:
            ge.bog.mobilebank.products.presentation.products.d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r4
            goto L_0x0170
        L_0x00c5:
            java.util.Iterator r7 = r7.iterator()
        L_0x00c9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e4
            java.lang.Object r8 = r7.next()
            r0 = r8
            ge.bog.mobilebank.products.presentation.products.d r0 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r0
            q70.a r0 = r0.mo82745b()
            q70.a r1 = q70.C27685a.ACC_TYPE_PENSION
            if (r0 != r1) goto L_0x00e0
            r0 = r2
            goto L_0x00e1
        L_0x00e0:
            r0 = r3
        L_0x00e1:
            if (r0 == 0) goto L_0x00c9
            r4 = r8
        L_0x00e4:
            ge.bog.mobilebank.products.presentation.products.d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r4
            goto L_0x0170
        L_0x00e8:
            java.util.Iterator r7 = r7.iterator()
        L_0x00ec:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0107
            java.lang.Object r8 = r7.next()
            r0 = r8
            ge.bog.mobilebank.products.presentation.products.d r0 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r0
            q70.a r0 = r0.mo82745b()
            q70.a r1 = q70.C27685a.ACC_TYPE_LOAN
            if (r0 != r1) goto L_0x0103
            r0 = r2
            goto L_0x0104
        L_0x0103:
            r0 = r3
        L_0x0104:
            if (r0 == 0) goto L_0x00ec
            r4 = r8
        L_0x0107:
            ge.bog.mobilebank.products.presentation.products.d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r4
            goto L_0x0170
        L_0x010b:
            java.util.Iterator r7 = r7.iterator()
        L_0x010f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x012a
            java.lang.Object r8 = r7.next()
            r0 = r8
            ge.bog.mobilebank.products.presentation.products.d r0 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r0
            q70.a r0 = r0.mo82745b()
            q70.a r1 = q70.C27685a.ACC_TYPE_DEPOSIT
            if (r0 != r1) goto L_0x0126
            r0 = r2
            goto L_0x0127
        L_0x0126:
            r0 = r3
        L_0x0127:
            if (r0 == 0) goto L_0x010f
            r4 = r8
        L_0x012a:
            ge.bog.mobilebank.products.presentation.products.d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r4
            goto L_0x0170
        L_0x012d:
            java.util.Iterator r7 = r7.iterator()
        L_0x0131:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x014c
            java.lang.Object r8 = r7.next()
            r0 = r8
            ge.bog.mobilebank.products.presentation.products.d r0 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r0
            q70.a r0 = r0.mo82745b()
            q70.a r1 = q70.C27685a.ACC_TYPE_ACCOUNT
            if (r0 != r1) goto L_0x0148
            r0 = r2
            goto L_0x0149
        L_0x0148:
            r0 = r3
        L_0x0149:
            if (r0 == 0) goto L_0x0131
            r4 = r8
        L_0x014c:
            ge.bog.mobilebank.products.presentation.products.d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r4
            goto L_0x0170
        L_0x014f:
            java.util.Iterator r7 = r7.iterator()
        L_0x0153:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x016e
            java.lang.Object r8 = r7.next()
            r0 = r8
            ge.bog.mobilebank.products.presentation.products.d r0 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r0
            q70.a r0 = r0.mo82745b()
            q70.a r1 = q70.C27685a.ACC_TYPE_CREDIT_CARD
            if (r0 != r1) goto L_0x016a
            r0 = r2
            goto L_0x016b
        L_0x016a:
            r0 = r3
        L_0x016b:
            if (r0 == 0) goto L_0x0153
            r4 = r8
        L_0x016e:
            ge.bog.mobilebank.products.presentation.products.d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d) r4
        L_0x0170:
            if (r4 == 0) goto L_0x0176
            r7 = 2
            r4.mo82746c(r7)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel.m100875my(java.util.List, q70.a):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: ny */
    public final boolean m100878ny() {
        C20557a b = this.f83200r.mo48775b("CREDIT_LIMIT_APP");
        if (b != null) {
            return C41536l.m120484d(b.mo49084a(), Boolean.TRUE);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: oy */
    public final synchronized void m100881oy(C34366d dVar) {
        Object obj;
        boolean z;
        ArrayList arrayList = new ArrayList();
        List list = (List) this.f83208z.mo4814f();
        if (list != null) {
            arrayList.addAll(list);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C34366d) obj).mo82745b() == dVar.mo82745b()) {
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
        C34366d dVar2 = (C34366d) obj;
        if (dVar2 != null) {
            int indexOf = arrayList.indexOf(dVar2);
            if (!(dVar instanceof C34366d.C34372f)) {
                arrayList.set(indexOf, dVar);
            } else {
                m100875my(arrayList, dVar2.mo82745b());
                if (arrayList.isEmpty() || !(arrayList.get(0) instanceof C34366d.C34372f)) {
                    arrayList.add(0, dVar);
                }
            }
        }
        this.f83208z.mo4826r(arrayList);
    }

    /* renamed from: tx */
    private final void m100888tx() {
        C41205b F0 = this.f83173E.mo94998Q(new C30451q0(new C34278b(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30453r0(new C34280c(this)));
        C41536l.m120488h(F0, "private fun observeAccou…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ux */
    public static final C40754t m100890ux(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vx */
    public static final void m100892vx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: wx */
    private final void m100894wx() {
        C41205b F0 = this.f83184P.mo94998Q(new C30452r(new C34285d(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30423c0(new C34287e(this)));
        C41536l.m120488h(F0, "private fun observeBNPLS…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: xx */
    public static final C40754t m100896xx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yx */
    public static final void m100898yx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: zx */
    private final void m100900zx() {
        C41205b F0 = this.f83178J.mo94998Q(new C30447o0(new C34293f(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30449p0(new C34294g(this)));
        C41536l.m120488h(F0, "private fun observeBonds…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: Ev */
    public void mo70786Ev() {
        this.f83172D.onNext(Boolean.TRUE);
    }

    /* renamed from: Q1 */
    public LiveData mo70790Q1() {
        return this.f83170B;
    }

    /* renamed from: c */
    public void mo70787c() {
        this.f83186d.invoke();
    }

    /* renamed from: ke */
    public LiveData mo70791ke() {
        return this.f83208z;
    }

    /* renamed from: o2 */
    public LiveData mo70792o2() {
        return this.f83171C;
    }

    /* renamed from: qx */
    public final C30448p mo82665qx() {
        return this.f83206x;
    }

    /* renamed from: rb */
    public void mo70788rb() {
        this.f83181M.onNext(C41238w.f97225a);
    }

    /* renamed from: rx */
    public final C30450q mo82666rx() {
        return this.f83207y;
    }

    /* renamed from: sx */
    public final String mo82667sx(C27685a aVar) {
        Object obj;
        boolean z;
        C41536l.m120489i(aVar, "productType");
        C31128a aVar2 = (C31128a) this.f83169A.mo4814f();
        if (!(aVar2 instanceof C31128a.C31131c)) {
            return null;
        }
        Iterator it = ((Iterable) ((C31128a.C31131c) aVar2).mo71340a()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C27686b) obj).mo67222a() == aVar) {
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
        C27686b bVar = (C27686b) obj;
        if (bVar != null) {
            return bVar.mo67223b();
        }
        return null;
    }

    /* renamed from: t3 */
    public LiveData mo70793t3() {
        return this.f83169A;
    }

    /* renamed from: y2 */
    public void mo70789y2(long j) {
        C37224b.m109965d(this.f83171C, C41233s.m119492a(Boolean.valueOf(this.f83204v.mo69247a()), Long.valueOf(j)));
    }
}

package p341ge.bog.mobilebank.products.presentation.addnewproduct;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import j51.C36735g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import m51.C37228a;
import md0.C26186e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p825ly.C26096a;
import p951xz.C29879c;
import ru0.C38345b;
import ty0.C38885q;
import ue1.C43075l;
import xy0.C39935a0;
import xy0.C39944h;
import yy0.C40114c;
import yy0.C40115d;
import yy0.C40116e;
import yy0.C40117f;
import yy0.C40118g;

/* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel */
public final class AddNewProductViewModel$ViewModel extends C21481a implements C40114c, C40115d {

    /* renamed from: d */
    private final C38345b f82412d;

    /* renamed from: e */
    private final C38885q f82413e;

    /* renamed from: f */
    private final C29879c f82414f;

    /* renamed from: g */
    private final C36735g f82415g;

    /* renamed from: h */
    private final PreferencesApiManager f82416h;

    /* renamed from: i */
    private final C26096a f82417i;

    /* renamed from: j */
    private final C40114c f82418j = this;

    /* renamed from: k */
    private final C40115d f82419k = this;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f82420l = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f82421m = new C1644x();

    /* renamed from: n */
    private final C1644x f82422n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f82423o = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f82424p = new C1644x();

    /* renamed from: q */
    private final C1644x f82425q = new C1644x();

    /* renamed from: r */
    private final C1644x f82426r = new C1644x();

    /* renamed from: s */
    private final C1644x f82427s = new C1644x();

    /* renamed from: t */
    private final C1644x f82428t = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C1644x f82429u = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final List f82430v = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final List f82431w = new ArrayList();

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel$a */
    public /* synthetic */ class C33834a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f82432a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                xy0.a0[] r0 = xy0.C39935a0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xy0.a0 r1 = xy0.C39935a0.CAS_CLIENT_SERVICE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xy0.a0 r1 = xy0.C39935a0.DEP_LOAN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xy0.a0 r1 = xy0.C39935a0.INSURANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                xy0.a0 r1 = xy0.C39935a0.DEPOSIT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                xy0.a0 r1 = xy0.C39935a0.DEBIT_CARD     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                xy0.a0 r1 = xy0.C39935a0.BNPL_APPLICATION     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                xy0.a0 r1 = xy0.C39935a0.CREDIT_APPLICATION     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                xy0.a0 r1 = xy0.C39935a0.TRAVEL_CARD     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                xy0.a0 r1 = xy0.C39935a0.DD_STO     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                xy0.a0 r1 = xy0.C39935a0.INVESTMENT     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                f82432a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel.C33834a.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel$b */
    /* synthetic */ class C33835b extends C41535k implements C43075l {
        C33835b(Object obj) {
            super(1, obj, C26096a.class, "transform", "transformNboOffers(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C26096a) this.receiver).mo65015b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel$c */
    static final class C33836c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductViewModel$ViewModel f82433d;

        /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel$c$a */
        static final class C33837a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ AddNewProductViewModel$ViewModel f82434d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33837a(AddNewProductViewModel$ViewModel addNewProductViewModel$ViewModel) {
                super(1);
                this.f82434d = addNewProductViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82015a(List list) {
                this.f82434d.f82423o.mo4823o(list);
                List hw = this.f82434d.f82430v;
                C41536l.m120488h(list, "list");
                C32343x.m95475p(hw, list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82015a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33836c(AddNewProductViewModel$ViewModel addNewProductViewModel$ViewModel) {
            super(1);
            this.f82433d = addNewProductViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82014a(C31128a aVar) {
            this.f82433d.f82420l.mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C33837a(this.f82433d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82014a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel$d */
    static final class C33838d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductViewModel$ViewModel f82435d;

        /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel$d$a */
        static final class C33839a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ AddNewProductViewModel$ViewModel f82436d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33839a(AddNewProductViewModel$ViewModel addNewProductViewModel$ViewModel) {
                super(1);
                this.f82436d = addNewProductViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo82017a(List list) {
                boolean z;
                C41536l.m120489i(list, "list");
                this.f82436d.f82424p.mo4823o(list);
                C32343x.m95475p(this.f82436d.f82431w, list);
                AddNewProductViewModel$ViewModel addNewProductViewModel$ViewModel = this.f82436d;
                boolean z2 = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C39944h) it.next()).mo93713d() != C39935a0.CREDIT_APPLICATION || !addNewProductViewModel$ViewModel.m99514xw()) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z2) {
                    C37224b.m109962a(this.f82436d.f82429u);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82017a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33838d(AddNewProductViewModel$ViewModel addNewProductViewModel$ViewModel) {
            super(1);
            this.f82435d = addNewProductViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo82016a(C31128a aVar) {
            this.f82435d.f82421m.mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C33839a(this.f82435d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82016a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddNewProductViewModel$ViewModel(C38345b bVar, C38885q qVar, C29879c cVar, C36735g gVar, PreferencesApiManager preferencesApiManager, C26096a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getNboOffers");
        C41536l.m120489i(qVar, "getCommonProductTypesUseCase");
        C41536l.m120489i(cVar, "isCreditLoanAllowedUseCase");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(aVar, "nboUiMapper");
        this.f82412d = bVar;
        this.f82413e = qVar;
        this.f82414f = cVar;
        this.f82415g = gVar;
        this.f82416h = preferencesApiManager;
        this.f82417i = aVar;
        m99509ow();
        m99512rw();
    }

    /* renamed from: ow */
    private final void m99509ow() {
        C40749p k0 = C26186e.m81987e(C32343x.m95413R0(C38345b.C38346a.m112650a(this.f82412d, false, false, 1, (Object) null))).mo95026k0(new C40117f(new C33835b(this.f82417i)));
        C41536l.m120488h(k0, "getNboOffers(forHome = f…p(nboUiMapper::transform)");
        C41205b F0 = C31270e.m92879h(k0, -1).mo94981F0(new C40118g(new C33836c(this)));
        C41536l.m120488h(F0, "private fun checkNboOffe…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final List m99510pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m99511qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: rw */
    private final void m99512rw() {
        C41205b F0 = C31270e.m92880i(C32343x.m95415S0(this.f82413e.mo92583a()), -1).mo94981F0(new C40116e(new C33838d(this)));
        C41536l.m120488h(F0, "private fun getCommonPro…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final void m99513sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public final boolean m99514xw() {
        long j;
        PreferencesApiManager preferencesApiManager = this.f82416h;
        C37228a a = this.f82415g.mo89562a();
        if (a != null) {
            j = a.mo90305b();
        } else {
            j = 0;
        }
        long creditApplicationNotificationCloseDay = preferencesApiManager.getCreditApplicationNotificationCloseDay(j);
        if (creditApplicationNotificationCloseDay != -1) {
            if (TimeUnit.DAYS.convert(System.currentTimeMillis() - creditApplicationNotificationCloseDay, TimeUnit.MILLISECONDS) < 14) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Ad */
    public void mo81995Ad() {
        C37224b.m109962a(this.f82428t);
    }

    /* renamed from: C1 */
    public LiveData mo81996C1() {
        return this.f82421m;
    }

    /* renamed from: Ci */
    public LiveData mo81997Ci() {
        return this.f82427s;
    }

    /* renamed from: Hg */
    public LiveData mo81998Hg() {
        return this.f82428t;
    }

    /* renamed from: Jn */
    public LiveData mo81999Jn() {
        return this.f82424p;
    }

    /* renamed from: Qu */
    public void mo82000Qu(C39935a0 a0Var) {
        C41536l.m120489i(a0Var, "category");
        switch (C33834a.f82432a[a0Var.ordinal()]) {
            case 1:
                this.f82422n.mo4823o(C39935a0.CAS_CLIENT_SERVICE);
                return;
            case 2:
                this.f82422n.mo4823o(C39935a0.DEP_LOAN);
                return;
            case 3:
                this.f82422n.mo4823o(C39935a0.INSURANCE);
                return;
            case 4:
                this.f82422n.mo4823o(C39935a0.DEPOSIT);
                return;
            case 5:
                this.f82422n.mo4823o(C39935a0.DEBIT_CARD);
                return;
            case 6:
                this.f82422n.mo4823o(C39935a0.BNPL_APPLICATION);
                return;
            case 7:
                this.f82422n.mo4823o(C39935a0.CREDIT_APPLICATION);
                return;
            case 8:
                this.f82422n.mo4823o(C39935a0.TRAVEL_CARD);
                return;
            case 9:
                this.f82422n.mo4823o(C39935a0.DD_STO);
                return;
            case 10:
                this.f82422n.mo4823o(C39935a0.INVESTMENT);
                return;
            default:
                return;
        }
    }

    /* renamed from: S1 */
    public LiveData mo82001S1() {
        return this.f82426r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (cf1.C40440x.m117135K(r5.mo63611i(), r9, true) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (cf1.C40440x.m117135K(r5.mo63600h(), r9, true) == false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x001d A[SYNTHETIC] */
    /* renamed from: Y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo82002Y2(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            int r0 = r9.length()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x000f
            r0 = r2
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            if (r0 == 0) goto L_0x00c9
            java.util.List r0 = r8.f82430v
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x007a
            java.lang.Object r4 = r0.next()
            r5 = r4
            i20.f r5 = (i20.C25106f) r5
            boolean r6 = r5 instanceof i20.C25106f.C25108b
            if (r6 == 0) goto L_0x0053
            i20.f$b r5 = (i20.C25106f.C25108b) r5
            java.lang.String r6 = r5.mo63607f()
            boolean r6 = cf1.C40440x.m117135K(r6, r9, r2)
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = r5.mo63608g()
            boolean r6 = cf1.C40440x.m117135K(r6, r9, r2)
            if (r6 != 0) goto L_0x0051
            java.lang.String r5 = r5.mo63611i()
            boolean r5 = cf1.C40440x.m117135K(r5, r9, r2)
            if (r5 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r5 = r1
            goto L_0x006e
        L_0x0051:
            r5 = r2
            goto L_0x006e
        L_0x0053:
            boolean r6 = r5 instanceof i20.C25106f.C25107a
            if (r6 == 0) goto L_0x0074
            i20.f$a r5 = (i20.C25106f.C25107a) r5
            java.lang.String r6 = r5.mo63599g()
            boolean r6 = cf1.C40440x.m117135K(r6, r9, r2)
            if (r6 != 0) goto L_0x0051
            java.lang.String r5 = r5.mo63600h()
            boolean r5 = cf1.C40440x.m117135K(r5, r9, r2)
            if (r5 == 0) goto L_0x004f
            goto L_0x0051
        L_0x006e:
            if (r5 == 0) goto L_0x001d
            r3.add(r4)
            goto L_0x001d
        L_0x0074:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L_0x007a:
            java.util.List r0 = r8.f82431w
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0085:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00b4
            java.lang.Object r5 = r0.next()
            r6 = r5
            xy0.h r6 = (xy0.C39944h) r6
            java.lang.String r7 = r6.mo93711b()
            if (r7 == 0) goto L_0x009d
            boolean r7 = cf1.C40440x.m117135K(r7, r9, r2)
            goto L_0x009e
        L_0x009d:
            r7 = r1
        L_0x009e:
            if (r7 != 0) goto L_0x00ad
            java.lang.String r6 = r6.mo93714e()
            boolean r6 = cf1.C40440x.m117135K(r6, r9, r2)
            if (r6 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r6 = r1
            goto L_0x00ae
        L_0x00ad:
            r6 = r2
        L_0x00ae:
            if (r6 == 0) goto L_0x0085
            r4.add(r5)
            goto L_0x0085
        L_0x00b4:
            androidx.lifecycle.x r9 = r8.f82423o
            r9.mo4823o(r3)
            androidx.lifecycle.x r9 = r8.f82424p
            r9.mo4823o(r4)
            androidx.lifecycle.x r9 = r8.f82426r
            az0.a r0 = new az0.a
            r0.<init>(r3, r4)
            r9.mo4823o(r0)
            goto L_0x00e5
        L_0x00c9:
            androidx.lifecycle.x r9 = r8.f82423o
            java.util.List r0 = r8.f82430v
            r9.mo4823o(r0)
            androidx.lifecycle.x r9 = r8.f82424p
            java.util.List r0 = r8.f82431w
            r9.mo4823o(r0)
            androidx.lifecycle.x r9 = r8.f82426r
            az0.a r0 = new az0.a
            java.util.List r1 = r8.f82430v
            java.util.List r2 = r8.f82431w
            r0.<init>(r1, r2)
            r9.mo4823o(r0)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel.mo82002Y2(java.lang.String):void");
    }

    /* renamed from: b9 */
    public LiveData mo82003b9() {
        return this.f82423o;
    }

    /* renamed from: ft */
    public void mo82004ft() {
        C37224b.m109962a(this.f82427s);
    }

    /* renamed from: q9 */
    public void mo82005q9() {
        C37228a a = this.f82415g.mo89562a();
        if (a != null) {
            this.f82416h.setCreditApplicationNotificationCloseDay(a.mo90305b());
        }
    }

    /* renamed from: tw */
    public final C40114c mo82006tw() {
        return this.f82418j;
    }

    /* renamed from: ua */
    public LiveData mo82007ua() {
        return this.f82429u;
    }

    /* renamed from: uv */
    public LiveData mo82008uv() {
        return this.f82422n;
    }

    /* renamed from: uw */
    public LiveData mo82009uw() {
        return this.f82420l;
    }

    /* renamed from: v */
    public LiveData mo82010v() {
        return this.f82425q;
    }

    /* renamed from: vw */
    public final C40115d mo82011vw() {
        return this.f82419k;
    }

    /* renamed from: ww */
    public void mo82012ww() {
        bindToLifecycle(C31270e.m92876e(C31270e.m92880i(C32343x.m95415S0(this.f82414f.mo70151a()), -1), this.f82425q));
    }
}

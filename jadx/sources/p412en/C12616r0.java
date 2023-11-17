package p412en;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import j51.C36735g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import m51.C37228a;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardClientCountryInfoUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardPurposeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardInfoUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p355an.C10083a;
import p355an.C10092j;
import p380ck.C10463g;
import p523mm.C16734c1;
import p523mm.C16738e;
import p523mm.C16758m;
import p523mm.C16761n;
import p523mm.C16790v0;
import p523mm.C16795y;
import p537nm.C17071b;
import p537nm.C17074c;
import p537nm.C17090i0;
import p537nm.C17091j;
import p537nm.C17097n;
import p537nm.C17106w;
import p579qm.C17538b;
import p674xm.C18784b;
import p674xm.C18798f;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: en.r0 */
public final class C12616r0 extends C21481a implements C12536h0, C12542i0 {

    /* renamed from: A */
    private final C40767b f37444A;

    /* renamed from: B */
    private final C40767b f37445B;

    /* renamed from: C */
    private final ArrayList f37446C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public List f37447D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public List f37448E;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16758m f37449d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C36735g f37450e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C16795y f37451f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C16738e f37452g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C16761n f37453h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C16734c1 f37454i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C16790v0 f37455j;

    /* renamed from: k */
    private final Client f37456k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C10083a f37457l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C10092j f37458m;

    /* renamed from: n */
    private final C12536h0 f37459n = this;

    /* renamed from: o */
    private final C12542i0 f37460o = this;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f37461p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1644x f37462q = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1644x f37463r = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1644x f37464s = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f37465t = new C1644x();

    /* renamed from: u */
    private final C1644x f37466u = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C1644x f37467v = new C1644x();

    /* renamed from: w */
    private final C1644x f37468w = new C1644x();

    /* renamed from: x */
    private final C40767b f37469x;

    /* renamed from: y */
    private final C40767b f37470y;

    /* renamed from: z */
    private final C40767b f37471z;

    /* renamed from: en.r0$a */
    public /* synthetic */ class C12617a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37472a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                nm.b[] r0 = p537nm.C17071b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                nm.b r1 = p537nm.C17071b.STANDARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                nm.b r1 = p537nm.C17071b.INSTANT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                nm.b r1 = p537nm.C17071b.SCHOOL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                nm.b r1 = p537nm.C17071b.STUDENT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                nm.b r1 = p537nm.C17071b.RECOVER     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                nm.b r1 = p537nm.C17071b.PAYROLL     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                nm.b r1 = p537nm.C17071b.WISHCARD     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f37472a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p412en.C12616r0.C12617a.<clinit>():void");
        }
    }

    /* renamed from: en.r0$b */
    static final class C12618b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12616r0 f37473d;

        /* renamed from: en.r0$b$a */
        static final class C12619a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37474d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12619a(C12616r0 r0Var) {
                super(1);
                this.f37474d = r0Var;
            }

            /* renamed from: a */
            public final void mo33298a(C41205b bVar) {
                this.f37474d.m47927Ow(C17071b.RECOVER);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33298a((C41205b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.r0$b$b */
        /* synthetic */ class C12620b extends C41535k implements C43075l {
            C12620b(Object obj) {
                super(1, obj, C10092j.class, "transform", "transformRecoverCards(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C10092j) this.receiver).mo26567m(list);
            }
        }

        /* renamed from: en.r0$b$c */
        static final class C12621c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37475d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12621c(C12616r0 r0Var) {
                super(1);
                this.f37475d = r0Var;
            }

            /* renamed from: a */
            public final void mo33300a(List list) {
                this.f37475d.m47923Iw();
                C12616r0 r0Var = this.f37475d;
                C41536l.m120488h(list, "it");
                r0Var.f37448E = list;
                C37224b.m109965d(this.f37475d.f37467v, this.f37475d.f37457l.mo26541f(list));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33300a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.r0$b$d */
        static final class C12622d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37476d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12622d(C12616r0 r0Var) {
                super(1);
                this.f37476d = r0Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                this.f37476d.m47923Iw();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12618b(C12616r0 r0Var) {
            super(1);
            this.f37473d = r0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final void m47983f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final List m47984g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final void m47985h(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m47986i(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: e */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40734b y = C32343x.m95465l1(this.f37473d.f37455j.mo43911a()).mo95083l(new C12655s0(new C12619a(this.f37473d))).mo95062A(new C12660t0(new C12620b(this.f37473d.f37458m))).mo95084m(new C12665u0(new C12621c(this.f37473d))).mo95082k(new C12670v0(new C12622d(this.f37473d))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToG…ndToLifecycle()\n        }");
            return C31270e.m92878g(y, -1);
        }
    }

    /* renamed from: en.r0$c */
    static final class C12623c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Long f37477d;

        /* renamed from: e */
        final /* synthetic */ C12616r0 f37478e;

        /* renamed from: f */
        final /* synthetic */ String f37479f;

        /* renamed from: g */
        final /* synthetic */ String f37480g;

        /* renamed from: en.r0$c$a */
        static final class C12624a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C12624a f37481d = new C12624a();

            C12624a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(List list, List list2) {
                C41536l.m120489i(list, "types");
                C41536l.m120489i(list2, "cards");
                return C41233s.m119492a(list, list2);
            }
        }

        /* renamed from: en.r0$c$b */
        static final class C12625b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37482d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12625b(C12616r0 r0Var) {
                super(1);
                this.f37482d = r0Var;
            }

            /* renamed from: a */
            public final C41224m invoke(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                List<C17074c> list = (List) mVar.mo95675a();
                List list2 = (List) mVar.mo95676b();
                C41536l.m120488h(list, "types");
                C10083a uw = this.f37482d.f37457l;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                for (C17074c a : list) {
                    arrayList.add(uw.mo26536a(a));
                }
                C10092j nw = this.f37482d.f37458m;
                C41536l.m120488h(list2, "cards");
                return C41233s.m119492a(arrayList, nw.mo26567m(list2));
            }
        }

        /* renamed from: en.r0$c$c */
        static final class C12626c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37483d;

            /* renamed from: e */
            final /* synthetic */ boolean f37484e;

            /* renamed from: f */
            final /* synthetic */ Long f37485f;

            /* renamed from: g */
            final /* synthetic */ String f37486g;

            /* renamed from: h */
            final /* synthetic */ String f37487h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12626c(C12616r0 r0Var, boolean z, Long l, String str, String str2) {
                super(1);
                this.f37483d = r0Var;
                this.f37484e = z;
                this.f37485f = l;
                this.f37486g = str;
                this.f37487h = str2;
            }

            /* renamed from: a */
            public final void mo33305a(C41224m mVar) {
                this.f37483d.m47926Nw((List) mVar.mo95675a(), (List) mVar.mo95676b(), this.f37484e, this.f37485f, this.f37486g, this.f37487h);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33305a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.r0$c$d */
        static final class C12627d extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C12627d f37488d = new C12627d();

            C12627d() {
                super(1);
            }

            /* renamed from: a */
            public final List invoke(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                return (List) mVar.mo95675a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12623c(Long l, C12616r0 r0Var, String str, String str2) {
            super(1);
            this.f37477d = l;
            this.f37478e = r0Var;
            this.f37479f = str;
            this.f37480g = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final C41224m m47994f(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final C41224m m47995g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final void m47996h(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final List m47997i(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: e */
        public final C40754t invoke(Integer num) {
            boolean z;
            C40762x xVar;
            C41536l.m120489i(num, "it");
            if (this.f37477d != null) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            C40762x a = this.f37478e.f37452g.mo43867a();
            if (z2) {
                xVar = this.f37478e.f37455j.mo43911a();
            } else {
                xVar = C40762x.m118162z(C41341q.m119907j());
                C41536l.m120488h(xVar, "just(emptyList())");
            }
            return C40762x.m118154T(a, xVar, new C12675w0(C12624a.f37481d)).mo95062A(new C12683x0(new C12625b(this.f37478e))).mo95084m(new C12706y0(new C12626c(this.f37478e, z2, this.f37477d, this.f37479f, this.f37480g))).mo95062A(new C12711z0(C12627d.f37488d)).mo95075O();
        }
    }

    /* renamed from: en.r0$d */
    static final class C12628d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12628d f37489d = new C12628d();

        C12628d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo33307a(List list) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo33307a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: en.r0$e */
    static final class C12629e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12616r0 f37490d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12629e(C12616r0 r0Var) {
            super(1);
            this.f37490d = r0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C1644x Cw = this.f37490d.f37463r;
            C41536l.m120488h(th, "it");
            Cw.mo4823o(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: en.r0$f */
    static final class C12630f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12616r0 f37491d;

        /* renamed from: en.r0$f$a */
        /* synthetic */ class C12631a extends C41535k implements C43075l {
            C12631a(Object obj) {
                super(1, obj, C10083a.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/domain/oldmodel/CardOrderPurposeData;)Lge/bog/mobilebank/cardapplications/presentation/model/CardOrderPurposeDataUiModel;", 0);
            }

            /* renamed from: b */
            public final C18798f invoke(C17538b bVar) {
                C41536l.m120489i(bVar, "p0");
                return ((C10083a) this.receiver).mo26540e(bVar);
            }
        }

        /* renamed from: en.r0$f$b */
        /* synthetic */ class C12632b extends C41535k implements C43075l {
            C12632b(Object obj) {
                super(1, obj, C12616r0.class, "adjustPossiblePurposes", "adjustPossiblePurposes(Lge/bog/mobilebank/cardapplications/presentation/model/CardOrderPurposeDataUiModel;)Lge/bog/mobilebank/cardapplications/presentation/model/CardOrderPurposeDataUiModel;", 0);
            }

            /* renamed from: b */
            public final C18798f invoke(C18798f fVar) {
                C41536l.m120489i(fVar, "p0");
                return ((C12616r0) this.receiver).m47922Hw(fVar);
            }
        }

        /* renamed from: en.r0$f$c */
        static final class C12633c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37492d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12633c(C12616r0 r0Var) {
                super(1);
                this.f37492d = r0Var;
            }

            /* renamed from: a */
            public final void mo33312a(C41205b bVar) {
                this.f37492d.m47927Ow(C17071b.INSTANT);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33312a((C41205b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.r0$f$d */
        static final class C12634d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37493d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12634d(C12616r0 r0Var) {
                super(1);
                this.f37493d = r0Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                this.f37493d.m47923Iw();
            }
        }

        /* renamed from: en.r0$f$e */
        static final class C12635e extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37494d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12635e(C12616r0 r0Var) {
                super(1);
                this.f37494d = r0Var;
            }

            /* renamed from: a */
            public final void mo33314a(C18798f fVar) {
                this.f37494d.m47923Iw();
                C37224b.m109965d(this.f37494d.f37462q, fVar.mo46625c());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33314a((C18798f) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12630f(C12616r0 r0Var) {
            super(1);
            this.f37491d = r0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final C18798f m48009g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C18798f) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final C18798f m48010h(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C18798f) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m48011i(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m48012k(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m48013l(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: f */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40734b y = this.f37491d.f37449d.mo43880b().mo95062A(new C12493a1(new C12631a(this.f37491d.f37457l))).mo95062A(new C12499b1(new C12632b(this.f37491d))).mo95083l(new C12504c1(new C12633c(this.f37491d))).mo95082k(new C12509d1(new C12634d(this.f37491d))).mo95084m(new C12514e1(new C12635e(this.f37491d))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToI…ndToLifecycle()\n        }");
            return C31270e.m92878g(y, -1);
        }
    }

    /* renamed from: en.r0$g */
    static final class C12636g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12616r0 f37495d;

        /* renamed from: en.r0$g$a */
        static final class C12637a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37496d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12637a(C12616r0 r0Var) {
                super(1);
                this.f37496d = r0Var;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                C10092j nw = this.f37496d.f37458m;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(nw.mo26558d((C17106w) it.next()));
                }
                return arrayList;
            }
        }

        /* renamed from: en.r0$g$b */
        static final class C12638b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37497d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12638b(C12616r0 r0Var) {
                super(1);
                this.f37497d = r0Var;
            }

            /* renamed from: a */
            public final void mo33317a(C41205b bVar) {
                this.f37497d.m47927Ow(C17071b.PAYROLL);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33317a((C41205b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.r0$g$c */
        static final class C12639c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37498d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12639c(C12616r0 r0Var) {
                super(1);
                this.f37498d = r0Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                this.f37498d.m47923Iw();
            }
        }

        /* renamed from: en.r0$g$d */
        static final class C12640d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37499d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12640d(C12616r0 r0Var) {
                super(1);
                this.f37499d = r0Var;
            }

            /* renamed from: a */
            public final void mo33319a(List list) {
                this.f37499d.m47923Iw();
                this.f37499d.f37447D = list;
                if (list.size() == 1) {
                    C1644x xw = this.f37499d.f37461p;
                    C41536l.m120488h(list, "it");
                    C37224b.m109965d(xw, new CardApplicationTypeData.PayRollCardOrderData(((DebitCardPayrollInfoUiModel) C41358y.m120007W(list)).mo39548b(), ((DebitCardPayrollInfoUiModel) C41358y.m120007W(list)).mo39547a(), (RecoverCardUiModel) null, (StringSource) null, 12, (DefaultConstructorMarker) null));
                    return;
                }
                C1644x zw = this.f37499d.f37465t;
                C41536l.m120488h(list, "it");
                C37224b.m109965d(zw, list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33319a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12636g(C12616r0 r0Var) {
            super(1);
            this.f37495d = r0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final void m48023f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final void m48024g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final void m48025h(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: e */
        public final C40754t invoke(C41238w wVar) {
            C40762x xVar;
            C41536l.m120489i(wVar, "it");
            if (this.f37495d.f37447D != null) {
                List vw = this.f37495d.f37447D;
                if (vw == null) {
                    vw = C41341q.m119907j();
                }
                xVar = C40762x.m118162z(vw);
            } else {
                xVar = this.f37495d.f37453h.mo43882a().mo95062A(new C12527f1(new C12637a(this.f37495d)));
            }
            C40734b y = xVar.mo95083l(new C12532g1(new C12638b(this.f37495d))).mo95082k(new C12538h1(new C12639c(this.f37495d))).mo95084m(new C12543i1(new C12640d(this.f37495d))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToP…ndToLifecycle()\n        }");
            return C31270e.m92878g(y, -1);
        }
    }

    /* renamed from: en.r0$h */
    static final class C12641h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12616r0 f37500d;

        /* renamed from: en.r0$h$a */
        static final class C12642a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37501d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12642a(C12616r0 r0Var) {
                super(1);
                this.f37501d = r0Var;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                C10092j nw = this.f37501d.f37458m;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(nw.mo26559e((C17097n) it.next()));
                }
                return arrayList;
            }
        }

        /* renamed from: en.r0$h$b */
        static final class C12643b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C12643b f37502d = new C12643b();

            C12643b() {
                super(1);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "cards");
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DebitCardUiModel) it.next()).getClientChildren());
                }
                List w = C41343r.m119927w(arrayList);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object next : w) {
                    if (hashSet.add(Long.valueOf(((ScoolCardOwnerUiModel) next).mo39856a()))) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            }
        }

        /* renamed from: en.r0$h$c */
        static final class C12644c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37503d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12644c(C12616r0 r0Var) {
                super(1);
                this.f37503d = r0Var;
            }

            /* renamed from: a */
            public final void mo33323a(C41205b bVar) {
                this.f37503d.m47927Ow(C17071b.SCHOOL);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33323a((C41205b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.r0$h$d */
        static final class C12645d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37504d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12645d(C12616r0 r0Var) {
                super(1);
                this.f37504d = r0Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                this.f37504d.m47923Iw();
            }
        }

        /* renamed from: en.r0$h$e */
        static final class C12646e extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37505d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12646e(C12616r0 r0Var) {
                super(1);
                this.f37505d = r0Var;
            }

            /* renamed from: a */
            public final void mo33325a(List list) {
                C1644x Bw = this.f37505d.f37464s;
                C41536l.m120488h(list, "it");
                C37224b.m109965d(Bw, list);
                this.f37505d.m47923Iw();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33325a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12641h(C12616r0 r0Var) {
            super(1);
            this.f37500d = r0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final List m48034g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final void m48035h(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m48036i(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m48037k(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: f */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40734b y = C32343x.m95465l1(C16795y.m59259b(this.f37500d.f37451f, (List) null, false, (Long) null, (Long) null, (Boolean) null, (Boolean) null, false, 124, (Object) null)).mo95062A(new C12548j1(new C12642a(this.f37500d))).mo95062A(new C12579k1(C12643b.f37502d)).mo95083l(new C12584l1(new C12644c(this.f37500d))).mo95082k(new C12589m1(new C12645d(this.f37500d))).mo95084m(new C12594n1(new C12646e(this.f37500d))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToS…ndToLifecycle()\n        }");
            return C31270e.m92878g(y, -1);
        }
    }

    /* renamed from: en.r0$i */
    static final class C12647i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12616r0 f37506d;

        /* renamed from: en.r0$i$a */
        /* synthetic */ class C12648a extends C41535k implements C43075l {
            C12648a(Object obj) {
                super(1, obj, C10092j.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/domain/model/ScoolCardInfo;)Lge/bog/mobilebank/cardapplications/presentation/model/ScoolCardInfoUiModel;", 0);
            }

            /* renamed from: b */
            public final ScoolCardInfoUiModel invoke(C17090i0 i0Var) {
                C41536l.m120489i(i0Var, "p0");
                return ((C10092j) this.receiver).mo26562h(i0Var);
            }
        }

        /* renamed from: en.r0$i$b */
        static final class C12649b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12616r0 f37507d;

            /* renamed from: e */
            final /* synthetic */ Long f37508e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12649b(C12616r0 r0Var, Long l) {
                super(1);
                this.f37507d = r0Var;
                this.f37508e = l;
            }

            /* renamed from: a */
            public final void mo33328a(ScoolCardInfoUiModel scoolCardInfoUiModel) {
                C1644x xw = this.f37507d.f37461p;
                Long l = this.f37508e;
                C41536l.m120488h(l, "childKey");
                long longValue = l.longValue();
                C41536l.m120488h(scoolCardInfoUiModel, "it");
                C37224b.m109965d(xw, new CardApplicationTypeData.SchoolCardOrderData(longValue, scoolCardInfoUiModel, (JuniorRequestDataUiModel) null, (StringSource) null, 12, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33328a((ScoolCardInfoUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12647i(C12616r0 r0Var) {
            super(1);
            this.f37506d = r0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final ScoolCardInfoUiModel m48043d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (ScoolCardInfoUiModel) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m48044e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Long l) {
            Long l2;
            C41536l.m120489i(l, "childKey");
            C16734c1 ww = this.f37506d.f37454i;
            C37228a a = this.f37506d.f37450e.mo89562a();
            if (a != null) {
                l2 = Long.valueOf(a.mo90305b());
            } else {
                l2 = null;
            }
            C40734b y = ww.mo43863a(String.valueOf(l2), l.longValue()).mo95062A(new C12599o1(new C12648a(this.f37506d.f37458m))).mo95084m(new C12604p1(new C12649b(this.f37506d, l))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToV…ndToLifecycle()\n        }");
            return C31270e.m92878g(y, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12616r0(C16758m mVar, C36735g gVar, C16795y yVar, C16738e eVar, C16761n nVar, C16734c1 c1Var, C16790v0 v0Var, Client client, C10083a aVar, C10092j jVar, Long l, String str, String str2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(mVar, "getCardOrderTypeDataData");
        C41536l.m120489i(gVar, "loginInfo");
        C41536l.m120489i(yVar, "getDebitCardTypes");
        C41536l.m120489i(eVar, "getCardApplicationTypesUseCase");
        C41536l.m120489i(nVar, "getClientPayrollOrganizations");
        C41536l.m120489i(c1Var, "validateAndGetChildSchoolCard");
        C41536l.m120489i(v0Var, "getRecoverCards");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(jVar, "debitCardsMapper");
        this.f37449d = mVar;
        this.f37450e = gVar;
        this.f37451f = yVar;
        this.f37452g = eVar;
        this.f37453h = nVar;
        this.f37454i = c1Var;
        this.f37455j = v0Var;
        this.f37456k = client;
        this.f37457l = aVar;
        this.f37458m = jVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f37469x = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f37470y = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Unit>()");
        this.f37471z = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Long>()");
        this.f37444A = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<Unit>()");
        this.f37445B = h15;
        this.f37446C = new ArrayList();
        this.f37448E = C41341q.m119907j();
        m47930Rw(l, str, str2);
        m47934Vw();
        m47938Zw();
        m47936Xw();
        m47940bx();
        m47928Pw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public final C18798f m47922Hw(C18798f fVar) {
        boolean z;
        boolean isPayroll = this.f37456k.getUserInfo().getClient().isPayroll();
        List d = fVar.mo46626d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            CardPurposeUiModel cardPurposeUiModel = (CardPurposeUiModel) next;
            if (isPayroll || cardPurposeUiModel.mo39414a() != C17091j.PAYROLL) {
                z2 = true;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            CardPurposeUiModel cardPurposeUiModel2 = (CardPurposeUiModel) next2;
            if (fVar.mo46625c().mo39393e() || cardPurposeUiModel2.mo39414a() != C17091j.INSTANT) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next2);
            }
        }
        return C18798f.m63569b(fVar, arrayList2, (CardClientCountryInfoUiModel) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public final void m47923Iw() {
        this.f37463r.mo4823o(new C31128a.C31131c(this.f37446C, -1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$RecoverCardOrderData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$PayRollCardOrderData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$PayRollCardOrderData} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Lw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m47924Lw(long r12) {
        /*
            r11 = this;
            java.util.List r0 = r11.f37448E
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            r3 = r1
            ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel r3 = (p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel) r3
            long r3 = r3.mo39815e()
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 == 0) goto L_0x0006
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel r1 = (p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel) r1
            if (r1 == 0) goto L_0x0060
            androidx.lifecycle.x r12 = r11.f37461p
            java.lang.Long r13 = r1.mo39824l()
            if (r13 == 0) goto L_0x004b
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$PayRollCardOrderData r13 = new ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$PayRollCardOrderData
            java.lang.Long r0 = r1.mo39824l()
            long r4 = r0.longValue()
            long r2 = r1.mo39811a()
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r8 = 0
            r9 = 8
            r10 = 0
            r3 = r13
            r7 = r1
            r3.<init>(r4, r6, r7, r8, r9, r10)
            goto L_0x0051
        L_0x004b:
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$RecoverCardOrderData r13 = new ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$RecoverCardOrderData
            r0 = 2
            r13.<init>(r1, r2, r0, r2)
        L_0x0051:
            m41.C37224b.m109965d(r12, r13)
            xm.b$i r12 = new xm.b$i
            boolean r13 = r1.mo39819h()
            r12.<init>(r13)
            r11.m47925Mw(r12)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12616r0.m47924Lw(long):void");
    }

    /* renamed from: Mw */
    private final void m47925Mw(C18784b bVar) {
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        bVar.mo46587c(F);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Nw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m47926Nw(java.util.List r6, java.util.List r7, boolean r8, java.lang.Long r9, java.lang.String r10, java.lang.String r11) {
        /*
            r5 = this;
            androidx.lifecycle.x r0 = r5.f37463r
            b41.a$c r1 = new b41.a$c
            r2 = 0
            r3 = 2
            r4 = 0
            r1.<init>(r6, r2, r3, r4)
            r0.mo4823o(r1)
            java.util.ArrayList r0 = r5.f37446C
            g91.C32343x.m95475p(r0, r6)
            r5.f37448E = r7
            if (r8 == 0) goto L_0x004f
            java.util.Iterator r6 = r7.iterator()
        L_0x001a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0047
            java.lang.Object r7 = r6.next()
            ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel r7 = (p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel) r7
            long r10 = r7.mo39815e()
            if (r9 != 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            long r0 = r9.longValue()
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0037
            r8 = 1
            goto L_0x0038
        L_0x0037:
            r8 = r2
        L_0x0038:
            if (r8 == 0) goto L_0x001a
            long r6 = r7.mo39815e()
            r5.m47924Lw(r6)
            androidx.lifecycle.x r6 = r5.f37468w
            m41.C37224b.m109962a(r6)
            goto L_0x0087
        L_0x0047:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Collection contains no element matching the predicate."
            r6.<init>(r7)
            throw r6
        L_0x004f:
            if (r10 == 0) goto L_0x007b
            java.util.ArrayList r6 = r5.f37446C
            java.util.Iterator r6 = r6.iterator()
        L_0x0057:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0073
            java.lang.Object r7 = r6.next()
            r8 = r7
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel r8 = (p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel) r8
            nm.b r8 = r8.mo39368g()
            java.lang.String r8 = r8.mo44270e()
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r8, r10)
            if (r8 == 0) goto L_0x0057
            r4 = r7
        L_0x0073:
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel r4 = (p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel) r4
            if (r4 == 0) goto L_0x0087
            r5.mo33168s9(r4, r11)
            goto L_0x0087
        L_0x007b:
            if (r11 == 0) goto L_0x0087
            androidx.lifecycle.x r6 = r5.f37461p
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$StandardCardData r7 = new ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$StandardCardData
            r7.<init>(r11, r4, r3, r4)
            m41.C37224b.m109965d(r6, r7)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12616r0.m47926Nw(java.util.List, java.util.List, boolean, java.lang.Long, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public final void m47927Ow(C17071b bVar) {
        CardApplicationTypeDetailsUiModel cardApplicationTypeDetailsUiModel;
        C1644x xVar = this.f37463r;
        ArrayList<CardApplicationTypeDetailsUiModel> arrayList = this.f37446C;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (CardApplicationTypeDetailsUiModel cardApplicationTypeDetailsUiModel2 : arrayList) {
            if (cardApplicationTypeDetailsUiModel2.mo39368g() == bVar) {
                cardApplicationTypeDetailsUiModel = CardApplicationTypeDetailsUiModel.m52534b(cardApplicationTypeDetailsUiModel2, (C17071b) null, (String) null, (String) null, true, false, (List) null, 39, (Object) null);
            } else {
                cardApplicationTypeDetailsUiModel = CardApplicationTypeDetailsUiModel.m52534b(cardApplicationTypeDetailsUiModel2, (C17071b) null, (String) null, (String) null, false, false, (List) null, 47, (Object) null);
            }
            arrayList2.add(cardApplicationTypeDetailsUiModel);
        }
        xVar.mo4823o(new C31128a.C31131c(arrayList2, -1));
    }

    /* renamed from: Pw */
    private final void m47928Pw() {
        C40749p L0 = this.f37445B.mo94989L0(new C12547j0(new C12618b(this)));
        C41536l.m120488h(L0, "private fun subscribeToG…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f37466u));
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public static final C40754t m47929Qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Rw */
    private final void m47930Rw(Long l, String str, String str2) {
        C41205b G0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C12578k0(new C12623c(l, this, str, str2))).mo94983G0(new C12583l0(C12628d.f37489d), new C12588m0(new C12629e(this)));
        C41536l.m120488h(G0, "private fun subscribeToI…ndToLifecycle()\n        }");
        bindToLifecycle(G0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final C40754t m47931Sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public static final void m47932Tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final void m47933Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Vw */
    private final void m47934Vw() {
        C40749p L0 = this.f37469x.mo94989L0(new C12611q0(new C12630f(this)));
        C41536l.m120488h(L0, "private fun subscribeToI…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f37466u));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final C40754t m47935Ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Xw */
    private final void m47936Xw() {
        C40749p L0 = this.f37471z.mo94989L0(new C12598o0(new C12636g(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f37466u));
    }

    /* access modifiers changed from: private */
    /* renamed from: Yw */
    public static final C40754t m47937Yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Zw */
    private final void m47938Zw() {
        C40749p L0 = this.f37470y.mo94989L0(new C12593n0(new C12641h(this)));
        C41536l.m120488h(L0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f37466u));
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public static final C40754t m47939ax(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: bx */
    private final void m47940bx() {
        C40749p Q = this.f37444A.mo94998Q(new C12603p0(new C12647i(this)));
        C41536l.m120488h(Q, "private fun subscribeToV…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(Q, this.f37466u));
    }

    /* access modifiers changed from: private */
    /* renamed from: cx */
    public static final C40754t m47941cx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: F */
    public LiveData mo33169F() {
        return this.f37468w;
    }

    /* renamed from: Jv */
    public void mo33165Jv(ScoolCardOwnerUiModel scoolCardOwnerUiModel) {
        C41536l.m120489i(scoolCardOwnerUiModel, "child");
        this.f37444A.onNext(Long.valueOf(scoolCardOwnerUiModel.mo39856a()));
        m47925Mw(C18784b.C18794j.f52525c);
    }

    /* renamed from: Jw */
    public final C12536h0 mo33295Jw() {
        return this.f37459n;
    }

    /* renamed from: Kw */
    public final C12542i0 mo33296Kw() {
        return this.f37460o;
    }

    /* renamed from: Qc */
    public LiveData mo33170Qc() {
        return this.f37467v;
    }

    /* renamed from: R4 */
    public LiveData mo33171R4() {
        return this.f37464s;
    }

    /* renamed from: Se */
    public LiveData mo33172Se() {
        return this.f37461p;
    }

    /* renamed from: dn */
    public LiveData mo33173dn() {
        return this.f37463r;
    }

    /* renamed from: i */
    public LiveData mo33174i() {
        return this.f37466u;
    }

    /* renamed from: lh */
    public LiveData mo33175lh() {
        return this.f37465t;
    }

    /* renamed from: lj */
    public void mo33166lj(DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel) {
        C41536l.m120489i(debitCardPayrollInfoUiModel, "organization");
        C37224b.m109965d(this.f37461p, new CardApplicationTypeData.PayRollCardOrderData(debitCardPayrollInfoUiModel.mo39548b(), debitCardPayrollInfoUiModel.mo39547a(), (RecoverCardUiModel) null, (StringSource) null, 12, (DefaultConstructorMarker) null));
        m47925Mw(C18784b.C18792h.f52523c);
    }

    /* renamed from: pd */
    public void mo33167pd(CardRenewalListItem.CardRenewalCardItem cardRenewalCardItem) {
        C41536l.m120489i(cardRenewalCardItem, "card");
        m47924Lw(cardRenewalCardItem.mo39426d());
    }

    /* renamed from: s9 */
    public void mo33168s9(CardApplicationTypeDetailsUiModel cardApplicationTypeDetailsUiModel, String str) {
        StringSource.Dictionary dictionary;
        C41536l.m120489i(cardApplicationTypeDetailsUiModel, "type");
        String f = cardApplicationTypeDetailsUiModel.mo39367f();
        if (f != null) {
            dictionary = C34646b.m101748b(f, new Object[0]);
        } else {
            dictionary = null;
        }
        switch (C12617a.f37472a[cardApplicationTypeDetailsUiModel.mo39368g().ordinal()]) {
            case 1:
                C37224b.m109965d(this.f37461p, new CardApplicationTypeData.StandardCardData(str, dictionary));
                break;
            case 2:
                this.f37469x.onNext(C41238w.f97225a);
                break;
            case 3:
                this.f37470y.onNext(C41238w.f97225a);
                break;
            case 4:
                C1644x xVar = this.f37461p;
                List e = cardApplicationTypeDetailsUiModel.mo39365e();
                if (e == null) {
                    e = C41341q.m119907j();
                }
                C37224b.m109965d(xVar, new CardApplicationTypeData.StudentCardOrderData(e, dictionary));
                break;
            case 5:
                this.f37445B.onNext(C41238w.f97225a);
                break;
            case 6:
                this.f37471z.onNext(C41238w.f97225a);
                break;
            case 7:
                C37224b.m109965d(this.f37461p, new CardApplicationTypeData.WishCardData(dictionary));
                break;
        }
        m47925Mw(new C18784b.C18786b(cardApplicationTypeDetailsUiModel.mo39368g()));
    }

    /* renamed from: zs */
    public LiveData mo33176zs() {
        return this.f37462q;
    }
}

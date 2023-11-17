package pz0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c01.C31251a;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
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
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ky0.C37019f;
import l70.C25846a;
import m41.C37223a;
import m41.C37224b;
import md0.C26186e;
import ny0.C37508i;
import o70.C26766e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p606sl.C17847m;
import p951xz.C29879c;
import q70.C27685a;
import qz0.C38269a;
import sz0.C38607a;
import ty0.C38864h;
import ty0.C38872j0;
import ty0.C38875l;
import ty0.C38891t;
import ty0.C38902z;
import ue1.C43064a;
import ue1.C43075l;
import wh0.C29397e;
import wh0.C29407n;
import xs0.C39879r;
import xy0.C39941e;
import xy0.C39948l;
import xy0.C39959w;
import zs0.C40252e;

/* renamed from: pz0.v */
public final class C38072v extends C21481a implements C38067q, C38068r {

    /* renamed from: A */
    private final C40767b f91440A;

    /* renamed from: B */
    private final C1644x f91441B;

    /* renamed from: C */
    private final C1644x f91442C;

    /* renamed from: D */
    private final C1644x f91443D;

    /* renamed from: E */
    private final C1644x f91444E;

    /* renamed from: F */
    private final C1644x f91445F;

    /* renamed from: G */
    private final C1644x f91446G;

    /* renamed from: H */
    private final C1644x f91447H;

    /* renamed from: I */
    private final C1644x f91448I;

    /* renamed from: J */
    private final C1644x f91449J;

    /* renamed from: K */
    private final C1644x f91450K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C31251a f91451L;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C38864h f91452d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C38891t f91453e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C37019f f91454f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C38872j0 f91455g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C38902z f91456h;

    /* renamed from: i */
    private final C25352k f91457i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C29879c f91458j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C39879r f91459k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C38875l f91460l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C29397e f91461m;

    /* renamed from: n */
    private final C29407n f91462n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Client f91463o;

    /* renamed from: p */
    private final C27685a f91464p;

    /* renamed from: q */
    private final C38067q f91465q = this;

    /* renamed from: r */
    private final C38068r f91466r = this;

    /* renamed from: s */
    private final C40767b f91467s;

    /* renamed from: t */
    private final C40767b f91468t;

    /* renamed from: u */
    private final C40767b f91469u;

    /* renamed from: v */
    private final C40767b f91470v;

    /* renamed from: w */
    private final C40767b f91471w;

    /* renamed from: x */
    private final C40767b f91472x;

    /* renamed from: y */
    private final C40767b f91473y;

    /* renamed from: z */
    private final C40767b f91474z;

    /* renamed from: pz0.v$a */
    static final class C38073a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38073a(C38072v vVar) {
            super(1);
            this.f91475d = vVar;
        }

        /* renamed from: a */
        public final void mo91494a(Integer num) {
            C38072v vVar = this.f91475d;
            C27685a Ew = vVar.mo91483Ew();
            boolean z = num != null && num.intValue() == 2;
            C41536l.m120488h(num, "it");
            vVar.m111877Dw(Ew, z, num.intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91494a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: pz0.v$b */
    static final class C38074b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91476d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38074b(C38072v vVar) {
            super(1);
            this.f91476d = vVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40749p O = this.f91476d.f91458j.mo70151a().mo95075O();
            C41536l.m120488h(O, "isCreditAppAllowedUseCas…          .toObservable()");
            return C31270e.m92879h(O, -1);
        }
    }

    /* renamed from: pz0.v$c */
    private static final class C38075c {

        /* renamed from: a */
        private final boolean f91477a;

        /* renamed from: b */
        private final int f91478b;

        public C38075c(boolean z, int i) {
            this.f91477a = z;
            this.f91478b = i;
        }

        /* renamed from: a */
        public final boolean mo91496a() {
            return this.f91477a;
        }

        /* renamed from: b */
        public final int mo91497b() {
            return this.f91478b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38075c)) {
                return false;
            }
            C38075c cVar = (C38075c) obj;
            return this.f91477a == cVar.f91477a && this.f91478b == cVar.f91478b;
        }

        public int hashCode() {
            boolean z = this.f91477a;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f91478b;
        }

        public String toString() {
            boolean z = this.f91477a;
            int i = this.f91478b;
            return "ProductRequest(refresh=" + z + ", requestCode=" + i + ")";
        }
    }

    /* renamed from: pz0.v$d */
    public /* synthetic */ class C38076d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f91479a;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
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
                q70.a r1 = q70.C27685a.ACC_TYPE_DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                q70.a r1 = q70.C27685a.ACC_TYPE_LOAN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                q70.a r1 = q70.C27685a.ACC_TYPE_GT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                q70.a r1 = q70.C27685a.PIGGY_BANK     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                q70.a r1 = q70.C27685a.BNPL     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                q70.a r1 = q70.C27685a.GIFT_CARD_OWNER     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f91479a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pz0.C38072v.C38076d.<clinit>():void");
        }
    }

    /* renamed from: pz0.v$e */
    static final class C38077e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91480d;

        /* renamed from: pz0.v$e$a */
        static final class C38078a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C38072v f91481d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38078a(C38072v vVar) {
                super(1);
                this.f91481d = vVar;
            }

            /* renamed from: a */
            public final void mo91502a(C39959w wVar) {
                C31251a aVar;
                if (wVar.mo93784a().mo63386b() <= Utils.DOUBLE_EPSILON) {
                    aVar = C31251a.JUST_MY_LOANS;
                } else if (wVar.mo93784a().mo63386b() <= Utils.DOUBLE_EPSILON || wVar.mo93787d().mo63386b() <= Utils.DOUBLE_EPSILON) {
                    aVar = C31251a.COSIGNER_ONLY;
                } else {
                    aVar = C31251a.MY_AND_COSIGNER;
                }
                if (aVar != this.f91481d.f91451L) {
                    this.f91481d.f91451L = aVar;
                    C37224b.m109965d(this.f91481d.mo91474c4(), aVar);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo91502a((C39959w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38077e(C38072v vVar) {
            super(1);
            this.f91480d = vVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m111931c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40749p mo91501b(boolean z) {
            C40749p E = C26186e.m81987e(this.f91480d.f91455g.mo92572a(z)).mo94978E(new C38096w(new C38078a(this.f91480d)));
            C41536l.m120488h(E, "private fun subscribeToL…)\n            }\n        }");
            return E;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo91501b(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: pz0.v$f */
    static final class C38079f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38269a f91482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38079f(C38269a aVar) {
            super(1);
            this.f91482d = aVar;
        }

        /* renamed from: a */
        public final List invoke(C39959w wVar) {
            C38269a aVar = this.f91482d;
            C41536l.m120488h(wVar, "loans");
            return aVar.mo91812i(wVar);
        }
    }

    /* renamed from: pz0.v$g */
    static final class C38080g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f91483d;

        /* renamed from: e */
        final /* synthetic */ C43075l f91484e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38080g(C43075l lVar, C43075l lVar2) {
            super(1);
            this.f91483d = lVar;
            this.f91484e = lVar2;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C38075c cVar) {
            C41536l.m120489i(cVar, "request");
            C40749p k0 = ((C40749p) this.f91483d.invoke(Boolean.valueOf(cVar.mo91496a()))).mo95026k0(new C38097x(this.f91484e));
            C41536l.m120488h(k0, "useCase(request.refresh)…       .map(resultMapper)");
            return C31270e.m92879h(k0, cVar.mo91497b());
        }
    }

    /* renamed from: pz0.v$h */
    static final class C38081h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38081h(C38072v vVar) {
            super(1);
            this.f91485d = vVar;
        }

        /* renamed from: a */
        public final C40749p mo91505a(boolean z) {
            return this.f91485d.f91459k.mo93581a(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo91505a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: pz0.v$i */
    static final class C38082i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38269a f91486d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38082i(C38269a aVar) {
            super(1);
            this.f91486d = aVar;
        }

        /* renamed from: a */
        public final List invoke(C40252e eVar) {
            C41536l.m120489i(eVar, "it");
            return this.f91486d.mo91813j(eVar);
        }
    }

    /* renamed from: pz0.v$j */
    static final class C38083j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38083j(C38072v vVar) {
            super(1);
            this.f91487d = vVar;
        }

        /* renamed from: a */
        public final C40749p mo91507a(boolean z) {
            return C26186e.m81987e(this.f91487d.f91460l.mo92574a(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo91507a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: pz0.v$k */
    static final class C38084k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38269a f91488d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38084k(C38269a aVar) {
            super(1);
            this.f91488d = aVar;
        }

        /* renamed from: a */
        public final List invoke(C17847m mVar) {
            C41536l.m120489i(mVar, "it");
            return this.f91488d.mo91809f(mVar);
        }
    }

    /* renamed from: pz0.v$l */
    static final class C38085l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91489d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38085l(C38072v vVar) {
            super(1);
            this.f91489d = vVar;
        }

        /* renamed from: a */
        public final C40749p mo91509a(boolean z) {
            C29397e ow = this.f91489d.f91461m;
            String clientKey = this.f91489d.f91463o.getUserInfo().getClient().getClientKey();
            C41536l.m120488h(clientKey, "client.userInfo.client.clientKey");
            return ow.mo69238a(clientKey, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo91509a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: pz0.v$m */
    static final class C38086m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38269a f91490d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38086m(C38269a aVar) {
            super(1);
            this.f91490d = aVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f91490d.mo91806c(list);
        }
    }

    /* renamed from: pz0.v$n */
    static final class C38087n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91491d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38087n(C38072v vVar) {
            super(1);
            this.f91491d = vVar;
        }

        /* renamed from: a */
        public final void mo91511a(C41238w wVar) {
            C38072v vVar = this.f91491d;
            vVar.m111877Dw(vVar.mo91483Ew(), true, 6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91511a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: pz0.v$o */
    static final class C38088o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91492d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38088o(C38072v vVar) {
            super(1);
            this.f91492d = vVar;
        }

        /* renamed from: a */
        public final C40749p mo91512a(boolean z) {
            return C26186e.m81987e(this.f91492d.f91452d.mo63907a(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo91512a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: pz0.v$p */
    static final class C38089p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38269a f91493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38089p(C38269a aVar) {
            super(1);
            this.f91493d = aVar;
        }

        /* renamed from: a */
        public final List invoke(C25846a aVar) {
            C41536l.m120489i(aVar, "it");
            return this.f91493d.mo91807d(aVar.mo64628a(), aVar.mo64629b());
        }
    }

    /* renamed from: pz0.v$q */
    static final class C38090q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38090q(C38072v vVar) {
            super(1);
            this.f91494d = vVar;
        }

        /* renamed from: a */
        public final C40749p mo91514a(boolean z) {
            return C26186e.m81987e(this.f91494d.f91453e.mo92588b(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo91514a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: pz0.v$r */
    static final class C38091r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38269a f91495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38091r(C38269a aVar) {
            super(1);
            this.f91495d = aVar;
        }

        /* renamed from: a */
        public final List invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            return this.f91495d.mo91811h((C39948l) mVar.mo95675a(), (C26766e) mVar.mo95676b());
        }
    }

    /* renamed from: pz0.v$s */
    static final class C38092s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91496d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38092s(C38072v vVar) {
            super(1);
            this.f91496d = vVar;
        }

        /* renamed from: a */
        public final C40749p mo91516a(boolean z) {
            return C26186e.m81987e(this.f91496d.f91454f.mo89942a(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo91516a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: pz0.v$t */
    static final class C38093t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38269a f91497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38093t(C38269a aVar) {
            super(1);
            this.f91497d = aVar;
        }

        /* renamed from: a */
        public final List invoke(C37508i iVar) {
            C41536l.m120489i(iVar, "it");
            return this.f91497d.mo91808e(iVar);
        }
    }

    /* renamed from: pz0.v$u */
    static final class C38094u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38072v f91498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38094u(C38072v vVar) {
            super(1);
            this.f91498d = vVar;
        }

        /* renamed from: a */
        public final C40749p mo91518a(boolean z) {
            return C26186e.m81987e(this.f91498d.f91456h.mo92598a(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo91518a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: pz0.v$v */
    static final class C38095v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38269a f91499d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38095v(C38269a aVar) {
            super(1);
            this.f91499d = aVar;
        }

        /* renamed from: a */
        public final List invoke(C39941e eVar) {
            C41536l.m120489i(eVar, "it");
            return this.f91499d.mo91810g(eVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38072v(C38864h hVar, C38891t tVar, C37019f fVar, C38872j0 j0Var, C38902z zVar, C25352k kVar, C29879c cVar, C39879r rVar, C38875l lVar, C29397e eVar, C29407n nVar, Client client, C38269a aVar, C27685a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C38864h hVar2 = hVar;
        C38891t tVar2 = tVar;
        C37019f fVar2 = fVar;
        C38872j0 j0Var2 = j0Var;
        C38902z zVar2 = zVar;
        C25352k kVar2 = kVar;
        C29879c cVar2 = cVar;
        C39879r rVar2 = rVar;
        C38875l lVar2 = lVar;
        C29397e eVar2 = eVar;
        C29407n nVar2 = nVar;
        Client client2 = client;
        C27685a aVar3 = aVar2;
        C41536l.m120489i(hVar2, "getAccountsAndCardsUseCase");
        C41536l.m120489i(tVar2, "getCreditCardsAndCardsUseCase");
        C41536l.m120489i(fVar2, "getDepositsAndBonds");
        C41536l.m120489i(j0Var2, "getLoansWithDetailsUseCase");
        C41536l.m120489i(zVar2, "getGaltsUseCase");
        C41536l.m120489i(kVar2, "reloadProductsUseCase");
        C41536l.m120489i(cVar2, "isCreditAppAllowedUseCase");
        C41536l.m120489i(rVar2, "getCasInfo");
        C41536l.m120489i(lVar2, "getBnplList");
        C41536l.m120489i(eVar2, "getGiftCards");
        C41536l.m120489i(nVar2, "hasGiftCardsIntroAlreadySeenUseCase");
        C41536l.m120489i(client2, "client");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(aVar3, "productType");
        this.f91452d = hVar2;
        this.f91453e = tVar2;
        this.f91454f = fVar2;
        this.f91455g = j0Var2;
        this.f91456h = zVar2;
        this.f91457i = kVar2;
        this.f91458j = cVar2;
        this.f91459k = rVar2;
        this.f91460l = lVar2;
        this.f91461m = eVar2;
        this.f91462n = nVar2;
        this.f91463o = client2;
        this.f91464p = aVar3;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ProductRequest>()");
        this.f91467s = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<ProductRequest>()");
        this.f91468t = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<ProductRequest>()");
        this.f91469u = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<ProductRequest>()");
        this.f91470v = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<ProductRequest>()");
        this.f91471w = h15;
        C40767b h16 = C40767b.m118210h1();
        C41536l.m120488h(h16, "create<Unit>()");
        this.f91472x = h16;
        C40767b h17 = C40767b.m118210h1();
        C41536l.m120488h(h17, "create<ProductRequest>()");
        this.f91473y = h17;
        C40767b h18 = C40767b.m118210h1();
        C41536l.m120488h(h18, "create<ProductRequest>()");
        this.f91474z = h18;
        C40767b h19 = C40767b.m118210h1();
        C41536l.m120488h(h19, "create<ProductRequest>()");
        this.f91440A = h19;
        this.f91441B = new C1644x();
        this.f91442C = new C1644x();
        this.f91443D = new C1644x();
        this.f91444E = new C1644x();
        this.f91445F = new C1644x();
        this.f91446G = new C1644x();
        this.f91447H = new C1644x();
        this.f91448I = new C1644x();
        this.f91449J = new C1644x();
        this.f91450K = new C1644x();
        C40749p l0 = C40749p.m118047l0(onInit(), onRefresh());
        C41536l.m120488h(l0, "merge(onInit(), onRefresh())");
        C32343x.m95487t(l0, (C43064a) null, (C43075l) null, new C38073a(this), 3, (Object) null);
        m111881Mw(aVar);
        C40749p L0 = h16.mo94989L0(new C38071u(new C38074b(this)));
        C41536l.m120488h(L0, "newAppAllowedSubject.swi…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo91472Tp()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public final void m111877Dw(C27685a aVar, boolean z, int i) {
        C38075c cVar = new C38075c(z, i);
        switch (C38076d.f91479a[aVar.ordinal()]) {
            case 1:
                this.f91467s.onNext(cVar);
                return;
            case 2:
                this.f91468t.onNext(cVar);
                return;
            case 3:
                this.f91469u.onNext(cVar);
                return;
            case 4:
                this.f91470v.onNext(cVar);
                return;
            case 5:
                this.f91471w.onNext(cVar);
                return;
            case 6:
                this.f91473y.onNext(cVar);
                return;
            case 7:
                this.f91474z.onNext(cVar);
                return;
            case 8:
                this.f91440A.onNext(cVar);
                return;
            default:
                return;
        }
    }

    /* renamed from: Jw */
    private final void m111878Jw(C38269a aVar) {
        m111879Kw(this.f91470v, new C38077e(this), new C38079f(aVar));
    }

    /* renamed from: Kw */
    private final void m111879Kw(C40767b bVar, C43075l lVar, C43075l lVar2) {
        C40749p L0 = bVar.mo94989L0(new C38070t(new C38080g(lVar, lVar2)));
        C41536l.m120488h(L0, "useCase: (refresh: Boole…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, this.f91441B));
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final C40754t m111880Lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Mw */
    private final void m111881Mw(C38269a aVar) {
        C41205b F0 = this.f91457i.mo63917a().mo95027o0(C40992a.m118827a()).mo94981F0(new C38069s(new C38087n(this)));
        C41536l.m120488h(F0, "private fun subscribeToP…)\n            }\n        }");
        bindToLifecycle(F0);
        m111879Kw(this.f91467s, new C38088o(this), new C38089p(aVar));
        m111879Kw(this.f91468t, new C38090q(this), new C38091r(aVar));
        m111879Kw(this.f91469u, new C38092s(this), new C38093t(aVar));
        m111878Jw(aVar);
        m111879Kw(this.f91471w, new C38094u(this), new C38095v(aVar));
        m111879Kw(this.f91473y, new C38081h(this), new C38082i(aVar));
        m111879Kw(this.f91474z, new C38083j(this), new C38084k(aVar));
        m111879Kw(this.f91440A, new C38085l(this), new C38086m(aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final void m111882Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m111886gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Aw */
    public C1644x mo91476jd() {
        return this.f91446G;
    }

    /* renamed from: Bw */
    public C1644x mo91479re() {
        return this.f91444E;
    }

    /* renamed from: Cw */
    public final C38068r mo91482Cw() {
        return this.f91466r;
    }

    /* renamed from: Ew */
    public final C27685a mo91483Ew() {
        return this.f91464p;
    }

    /* renamed from: Fw */
    public C1644x mo91473Ua() {
        return this.f91445F;
    }

    /* renamed from: Gw */
    public C1644x mo91472Tp() {
        return this.f91442C;
    }

    /* renamed from: Hw */
    public void mo91486Hw() {
        int i = C38076d.f91479a[this.f91464p.ordinal()];
        if (i == 1 || i == 2) {
            mo91479re().mo4826r(C32343x.m95466m(Boolean.valueOf(this.f91463o.getUserInfo().getClient().isPayroll())));
        } else if (i == 3) {
            mo91476jd().mo4826r(new C37223a(C41238w.f97225a));
        } else if (i == 4) {
            mo91473Ua().mo4826r(new C37223a(C41238w.f97225a));
        } else if (i == 6) {
            mo91471Np().mo4823o(C32343x.m95466m(C41238w.f97225a));
        } else if (i == 7) {
            mo91477jf().mo4823o(C32343x.m95466m(C41238w.f97225a));
        }
    }

    /* renamed from: Iw */
    public void mo91487Iw(long j, int i) {
        C1644x ww = mo91470L7();
        int i2 = 1;
        int i3 = i - 1;
        int i4 = C38076d.f91479a[this.f91464p.ordinal()];
        if (i4 != 1) {
            i2 = 2;
            if (i4 != 2) {
                i2 = 4;
                if (i4 != 3) {
                    if (i4 != 4) {
                        i2 = 5;
                        if (i4 != 5) {
                            i2 = -1;
                        }
                    } else {
                        i2 = 3;
                    }
                }
            }
        }
        ww.mo4826r(C32343x.m95466m(new C38607a(j, i3, i2)));
    }

    /* renamed from: Y6 */
    public void mo91468Y6() {
        this.f91472x.onNext(C41238w.f97225a);
    }

    /* renamed from: f2 */
    public LiveData mo91475f2() {
        return this.f91441B;
    }

    /* renamed from: uw */
    public C1644x mo91471Np() {
        return this.f91447H;
    }

    /* renamed from: vw */
    public final C38067q mo91489vw() {
        return this.f91465q;
    }

    /* renamed from: ww */
    public C1644x mo91470L7() {
        return this.f91443D;
    }

    /* renamed from: xw */
    public C1644x mo91474c4() {
        return this.f91448I;
    }

    /* renamed from: y2 */
    public void mo91469y2(long j) {
        C37224b.m109965d(mo91478o2(), C41233s.m119492a(Boolean.valueOf(this.f91462n.mo69247a()), Long.valueOf(j)));
    }

    /* renamed from: yw */
    public C1644x mo91477jf() {
        return this.f91449J;
    }

    /* renamed from: zw */
    public C1644x mo91478o2() {
        return this.f91450K;
    }
}

package p341ge.bog.mobilebank.products.presentation.details.creditcard;

import a41.C30483b;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import ba1.C10146d0;
import bk0.C19393b;
import c41.C31270e;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import dk0.C20032b;
import dk0.C20033c;
import dk0.C20034d;
import e41.C31658b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import ek0.C20261a;
import g91.C32289b0;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import hy0.C36274h;
import ie1.C41324h0;
import iu0.C36546y;
import j70.C25352k;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jz0.C36852d;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import m50.C26145c;
import mz0.C37305a0;
import mz0.C37307b0;
import mz0.C37309c0;
import mz0.C37311d0;
import mz0.C37313e0;
import mz0.C37315f0;
import mz0.C37317g0;
import mz0.C37319h0;
import mz0.C37321i0;
import mz0.C37323j0;
import mz0.C37325k0;
import mz0.C37327l0;
import mz0.C37334s;
import mz0.C37335t;
import mz0.C37336u;
import mz0.C37337v;
import mz0.C37338w;
import mz0.C37339x;
import mz0.C37340y;
import mz0.C37341z;
import n70.C26374a;
import n70.C26375b;
import o70.C26763b;
import o70.C26764c;
import o70.C26765d;
import o70.C26766e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.products.model.CardExtraDetailsUIModel;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.cards.DigitalCardInfo;
import p341ge.bog.mobilebank.products.data.model.SCACardDetailsParams;
import p341ge.bog.mobilebank.products.domain.model.BillInfo;
import p341ge.bog.mobilebank.products.domain.model.CreditCardAccount;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d;
import p341ge.bog.mobilebank.products.presentation.details.models.CardUiModel;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p380ck.C10463g;
import p738du.C20101a;
import p748eu.C20292b;
import p784hw.C25074c;
import p793iw.C25264c;
import p891su.C28261a;
import pc0.C27494a;
import rz0.C38395a;
import sz0.C38607a;
import sz0.C38609c;
import ty0.C38868i0;
import ty0.C38870j;
import ty0.C38879n;
import ty0.C38883p;
import ty0.C38884p0;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import uy0.C39177a;
import uy0.C39178b;
import xy0.C39938b0;
import xy0.C39948l;

/* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f */
public final class C33969f extends C21481a implements C37334s, C33968e {

    /* renamed from: A */
    private final C1644x f82618A;

    /* renamed from: B */
    private final C1644x f82619B;

    /* renamed from: C */
    private final C1644x f82620C;

    /* renamed from: D */
    private final C1644x f82621D;

    /* renamed from: E */
    private final C1644x f82622E;

    /* renamed from: F */
    private final C1644x f82623F;

    /* renamed from: G */
    private final C1644x f82624G;

    /* renamed from: H */
    private final C1644x f82625H;

    /* renamed from: I */
    private final C1644x f82626I;

    /* renamed from: J */
    private final C1644x f82627J;

    /* renamed from: K */
    private final C1644x f82628K;

    /* renamed from: L */
    private final C1644x f82629L;

    /* renamed from: M */
    private final C1644x f82630M;

    /* renamed from: N */
    private final C1644x f82631N;

    /* renamed from: O */
    private final C1644x f82632O;

    /* renamed from: P */
    private final C1644x f82633P;

    /* renamed from: Q */
    private final C1644x f82634Q;

    /* renamed from: R */
    private final C40767b f82635R;

    /* renamed from: S */
    private final C40767b f82636S;

    /* renamed from: T */
    private final C40767b f82637T;

    /* renamed from: U */
    private final C40767b f82638U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final AtomicReference f82639V;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C38870j f82640d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C38879n f82641e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38868i0 f82642f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C25074c f82643g;

    /* renamed from: h */
    private final C31658b f82644h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C26145c f82645i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C38395a f82646j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final PreferencesApiManager f82647k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C20292b f82648l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C19393b f82649m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C38883p f82650n;

    /* renamed from: o */
    private final C39178b f82651o;

    /* renamed from: p */
    private final C39177a f82652p;

    /* renamed from: q */
    private final C27494a f82653q;

    /* renamed from: r */
    private final TargetEnvironment f82654r;

    /* renamed from: s */
    private final C37334s f82655s = this;

    /* renamed from: t */
    private final C33968e f82656t = this;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C41224m f82657u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public List f82658v = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C1644x f82659w;

    /* renamed from: x */
    private final LiveData f82660x;

    /* renamed from: y */
    private final C1644x f82661y;

    /* renamed from: z */
    private final C1644x f82662z;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$a */
    static final class C33970a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33970a f82663d = new C33970a();

        C33970a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$b */
    static final class C33971b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33971b f82664d = new C33971b();

        C33971b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$c */
    static final class C33972c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33972c f82665d = new C33972c();

        C33972c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$d */
    static final class C33973d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33973d f82666d = new C33973d();

        C33973d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$e */
    static final class C33974e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82667d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$e$a */
        static final class C33975a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C33975a f82668d = new C33975a();

            C33975a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C41224m mVar, List list) {
                C41536l.m120489i(mVar, "accountsAndCards");
                C41536l.m120489i(list, "closableAccounts");
                return C41233s.m119492a(mVar, list);
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$e$b */
        static final class C33976b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33969f f82669d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33976b(C33969f fVar) {
                super(1);
                this.f82669d = fVar;
            }

            /* renamed from: a */
            public final void mo82241a(C41205b bVar) {
                this.f82669d.mo82190e().mo4826r(Boolean.TRUE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82241a((C41205b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33974e(C33969f fVar) {
            super(1);
            this.f82667d = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C41224m m99997d(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m99998e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Boolean bool) {
            C41536l.m120489i(bool, "refresh");
            return C40749p.m118037d1(this.f82667d.f82640d.mo92570b(bool.booleanValue()), this.f82667d.f82650n.mo92580a(bool.booleanValue()), new C34001g(C33975a.f82668d)).mo94980F(new C34002h(new C33976b(this.f82667d)));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$f */
    static final class C33977f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82670d;

        /* renamed from: e */
        final /* synthetic */ long f82671e;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$f$a */
        static final class C33978a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33969f f82672d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33978a(C33969f fVar) {
                super(1);
                this.f82672d = fVar;
            }

            /* renamed from: a */
            public final void mo82243a(boolean z) {
                if (z) {
                    this.f82672d.m99858Cx();
                } else {
                    this.f82672d.mo82200Bx();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82243a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33977f(C33969f fVar, long j) {
            super(1);
            this.f82670d = fVar;
            this.f82671e = j;
        }

        /* renamed from: a */
        public final void mo82242a(C41224m mVar) {
            int i;
            C34007l lVar;
            Object obj;
            Integer num;
            long j;
            boolean z;
            C41224m mVar2 = (C41224m) mVar.mo95675a();
            List list = (List) mVar.mo95676b();
            this.f82670d.mo82190e().mo4826r(Boolean.FALSE);
            C33969f fVar = this.f82670d;
            C41536l.m120488h(mVar2, "accountsAndCards");
            fVar.f82657u = mVar2;
            C33969f fVar2 = this.f82670d;
            C41536l.m120488h(list, "closableAccounts");
            fVar2.f82658v = list;
            C1644x Pw = this.f82670d.f82659w;
            C33969f fVar3 = this.f82670d;
            C34007l lVar2 = (C34007l) Pw.mo4814f();
            List e = fVar3.f82646j.mo91914e(mVar2, new C33978a(fVar3));
            Iterator it = C41358y.m119995F0(e).iterator();
            while (true) {
                i = 0;
                lVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long a = ((C30483b) ((C41324h0) obj).mo95946d()).mo70820a();
                Long Ow = fVar3.m99906nx();
                if (Ow != null && a == Ow.longValue()) {
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
            C41324h0 h0Var = (C41324h0) obj;
            if (h0Var != null) {
                num = Integer.valueOf(h0Var.mo95945c());
            } else {
                num = null;
            }
            if (lVar2 != null) {
                if (num != null) {
                    i = num.intValue();
                }
                lVar = C34007l.m100026b(lVar2, new C33950d.C33967q(e, i), (C33950d.C33961k) null, (C33950d.C33951a) null, (C33950d.C33955e) null, (C33950d.C33966p) null, (C33950d.C33954d) null, (C33950d.C33952b) null, (List) null, (List) null, (Boolean) null, (Boolean) null, 0, (C33950d.C33957g) null, 8190, (Object) null);
            }
            Pw.mo4826r(lVar);
            C33969f fVar4 = this.f82670d;
            Long Ow2 = fVar4.m99906nx();
            if (Ow2 != null) {
                j = Ow2.longValue();
            } else {
                j = this.f82671e;
            }
            fVar4.m99860Dx(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82242a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$g */
    public interface C33979g {
        /* renamed from: a */
        C33969f mo32545a(long j);
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$h */
    /* synthetic */ class C33980h extends C41535k implements C43075l {

        /* renamed from: d */
        public static final C33980h f82673d = new C33980h();

        C33980h() {
            super(1, C34004j.class, "buildList", "buildList(Lge/bog/mobilebank/products/presentation/details/creditcard/ViewState;)Ljava/util/List;", 1);
        }

        /* renamed from: b */
        public final List invoke(C34007l lVar) {
            C41536l.m120489i(lVar, "p0");
            return C34004j.m100022b(lVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$i */
    static final class C33981i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82674d;

        /* renamed from: e */
        final /* synthetic */ long f82675e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33981i(C33969f fVar, long j) {
            super(1);
            this.f82674d = fVar;
            this.f82675e = j;
        }

        /* renamed from: a */
        public final C38609c invoke(C26374a aVar) {
            C41536l.m120489i(aVar, "it");
            return C33969f.m99923yx(this.f82674d, aVar, new C38609c.C38615f(this.f82675e), (C43064a) null, 4, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$j */
    static final class C33982j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82676d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$j$a */
        static final class C33983a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C33969f f82677d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33983a(C33969f fVar) {
                super(0);
                this.f82677d = fVar;
            }

            public final void invoke() {
                this.f82677d.onRefresh(6);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33982j(C33969f fVar) {
            super(1);
            this.f82676d = fVar;
        }

        /* renamed from: a */
        public final C38609c invoke(C26374a aVar) {
            C41536l.m120489i(aVar, "it");
            C33969f fVar = this.f82676d;
            return fVar.m99921xx(aVar, C38609c.C38612c.f92475a, new C33983a(fVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$k */
    static final class C33984k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82678d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33984k(C33969f fVar) {
            super(1);
            this.f82678d = fVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C39938b0 b0Var) {
            C41536l.m120489i(b0Var, "params");
            return this.f82678d.f82641e.mo92577a(b0Var.mo93673a()).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$l */
    static final class C33985l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33985l(C33969f fVar) {
            super(1);
            this.f82679d = fVar;
        }

        /* renamed from: a */
        public final void mo82248a(C41205b bVar) {
            this.f82679d.mo82194n2().mo4826r(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82248a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$m */
    static final class C33986m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82680d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33986m(C33969f fVar) {
            super(1);
            this.f82680d = fVar;
        }

        /* renamed from: a */
        public final void mo82249a(C26764c cVar) {
            C26765d dVar;
            String str;
            String c;
            Object obj;
            boolean z;
            C41224m Cw = this.f82680d.f82657u;
            if (Cw == null) {
                C41536l.m120506z("accountsAndCards");
                Cw = null;
            }
            List list = (List) ((C26766e) Cw.mo95680f()).mo66048a().get(this.f82680d.m99906nx());
            if (list != null) {
                C33969f fVar = this.f82680d;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    long j = ((C26765d) obj).mo66030j();
                    Long l = (Long) fVar.f82639V.get();
                    if (l != null && j == l.longValue()) {
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
                dVar = (C26765d) obj;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                this.f82680d.mo82194n2().mo4826r(new C31128a.C31129a(new IllegalArgumentException("Card can't be null"), 0, (Object) null, 6, (DefaultConstructorMarker) null));
                return;
            }
            C1644x Yw = this.f82680d.mo82194n2();
            CardExtraDetailsUIModel a = this.f82680d.f82645i.mo65072a(cVar.mo65991a(), cVar.mo65992b());
            String F = C32343x.m95388F(dVar.mo65996A(), new Object[0]);
            String i = dVar.mo66029i();
            String N = dVar.mo66009N();
            String J = dVar.mo66005J();
            C26763b f = dVar.mo66025f();
            if (f == null || (c = f.mo65986c()) == null) {
                str = null;
            } else {
                str = C32289b0.m95091c(c);
            }
            Yw.mo4826r(new C31128a.C31131c(new DigitalCardInfo(a, F, i, N, J, str), 0, 2, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82249a((C26764c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$n */
    static final class C33987n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33987n(C33969f fVar) {
            super(1);
            this.f82681d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C1644x Yw = this.f82681d.mo82194n2();
            C41536l.m120488h(th, "it");
            Yw.mo4826r(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$o */
    /* synthetic */ class C33988o extends C41535k implements C43075l {
        C33988o(Object obj) {
            super(1, obj, C38395a.class, "generateTokenRequests", "generateTokenRequests(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C38395a) this.receiver).mo91917i(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$p */
    static final class C33989p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33989p(C33969f fVar) {
            super(1);
            this.f82682d = fVar;
        }

        /* renamed from: a */
        public final C40754t invoke(List list) {
            C40762x xVar;
            C41536l.m120489i(list, "requests");
            if (this.f82682d.f82647k.deviceCanSupportGooglePay()) {
                xVar = this.f82682d.f82649m.mo47614a(list);
            } else {
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C20033c((C20032b) it.next(), new C20034d(C20261a.NOT_ADDED, (String) null, 2, (DefaultConstructorMarker) null)));
                }
                xVar = C40762x.m118162z(arrayList);
                C41536l.m120488h(xVar, "just(requests.map {\n    …))\n                    })");
            }
            return C31270e.m92880i(C32343x.m95465l1(xVar), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$q */
    static final class C33990q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82683d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$q$a */
        static final class C33991a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33969f f82684d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33991a(C33969f fVar) {
                super(1);
                this.f82684d = fVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: ge.bog.mobilebank.products.presentation.details.creditcard.d$g} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo82254a(java.util.List r22) {
                /*
                    r21 = this;
                    r0 = r21
                    r1 = r22
                    java.lang.String r2 = "results"
                    kotlin.jvm.internal.C41536l.m120489i(r1, r2)
                    boolean r2 = r22.isEmpty()
                    r3 = 1
                    r2 = r2 ^ r3
                    r4 = 0
                    if (r2 == 0) goto L_0x0044
                    boolean r2 = r1 instanceof java.util.Collection
                    if (r2 == 0) goto L_0x001e
                    boolean r2 = r22.isEmpty()
                    if (r2 == 0) goto L_0x001e
                L_0x001c:
                    r1 = r4
                    goto L_0x0040
                L_0x001e:
                    java.util.Iterator r1 = r22.iterator()
                L_0x0022:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x001c
                    java.lang.Object r2 = r1.next()
                    dk0.c r2 = (dk0.C20033c) r2
                    dk0.d r2 = r2.mo48411b()
                    ek0.a r2 = r2.mo48416b()
                    ek0.a r5 = ek0.C20261a.TOKEN_STATE_ACTIVE
                    if (r2 == r5) goto L_0x003c
                    r2 = r3
                    goto L_0x003d
                L_0x003c:
                    r2 = r4
                L_0x003d:
                    if (r2 == 0) goto L_0x0022
                    r1 = r3
                L_0x0040:
                    if (r1 == 0) goto L_0x0044
                    r1 = r3
                    goto L_0x0045
                L_0x0044:
                    r1 = r4
                L_0x0045:
                    ge.bog.mobilebank.products.presentation.details.creditcard.f r2 = r0.f82684d
                    ge.bog.mobilebank.rest.manager.PreferencesApiManager r2 = r2.f82647k
                    boolean r2 = r2.deviceCanSupportGooglePay()
                    if (r2 == 0) goto L_0x0074
                    du.a r2 = p738du.C20101a.f54724a
                    ge.bog.mobilebank.products.presentation.details.creditcard.f r5 = r0.f82684d
                    eu.b r5 = r5.f82648l
                    boolean r2 = r2.mo48497a(r5)
                    if (r2 == 0) goto L_0x0074
                    ge.bog.mobilebank.products.presentation.details.creditcard.f r2 = r0.f82684d
                    ge.bog.mobilebank.rest.manager.PreferencesApiManager r2 = r2.f82647k
                    ge.bog.mobilebank.products.presentation.details.creditcard.f r5 = r0.f82684d
                    java.lang.Long r5 = r5.m99906nx()
                    boolean r2 = r2.isGooglePayBannerHiddenForAccount(r5)
                    if (r2 != 0) goto L_0x0074
                    if (r1 == 0) goto L_0x0074
                    goto L_0x0075
                L_0x0074:
                    r3 = r4
                L_0x0075:
                    ge.bog.mobilebank.products.presentation.details.creditcard.f r1 = r0.f82684d
                    androidx.lifecycle.x r1 = r1.f82659w
                    ge.bog.mobilebank.products.presentation.details.creditcard.f r2 = r0.f82684d
                    androidx.lifecycle.x r2 = r2.f82659w
                    java.lang.Object r2 = r2.mo4814f()
                    r4 = r2
                    ge.bog.mobilebank.products.presentation.details.creditcard.l r4 = (p341ge.bog.mobilebank.products.presentation.details.creditcard.C34007l) r4
                    r2 = 0
                    if (r4 == 0) goto L_0x00a6
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    if (r3 == 0) goto L_0x009c
                    ge.bog.mobilebank.products.presentation.details.creditcard.d$g r2 = p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d.C33957g.f82588a
                L_0x009c:
                    r18 = r2
                    r19 = 4095(0xfff, float:5.738E-42)
                    r20 = 0
                    ge.bog.mobilebank.products.presentation.details.creditcard.l r2 = p341ge.bog.mobilebank.products.presentation.details.creditcard.C34007l.m100026b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
                L_0x00a6:
                    r1.mo4826r(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.creditcard.C33969f.C33990q.C33991a.mo82254a(java.util.List):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82254a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$q$b */
        static final class C33992b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33969f f82685d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33992b(C33969f fVar) {
                super(1);
                this.f82685d = fVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C1644x Pw = this.f82685d.f82659w;
                C34007l lVar = (C34007l) this.f82685d.f82659w.mo4814f();
                Pw.mo4826r(lVar != null ? C34007l.m100026b(lVar, (C33950d.C33967q) null, (C33950d.C33961k) null, (C33950d.C33951a) null, (C33950d.C33955e) null, (C33950d.C33966p) null, (C33950d.C33954d) null, (C33950d.C33952b) null, (List) null, (List) null, (Boolean) null, (Boolean) null, 0, (C33950d.C33957g) null, C11051p3.f31758b, (Object) null) : null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33990q(C33969f fVar) {
            super(1);
            this.f82683d = fVar;
        }

        /* renamed from: a */
        public final void mo82253a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C33991a(this.f82683d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33992b(this.f82683d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82253a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$r */
    static final class C33993r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82686d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$r$a */
        static final class C33994a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33969f f82687d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33994a(C33969f fVar) {
                super(1);
                this.f82687d = fVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                return this.f82687d.f82646j.mo91919m(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33993r(C33969f fVar) {
            super(1);
            this.f82686d = fVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "accKey");
            return this.f82686d.f82642f.mo92568b(l.longValue()).mo95075O().mo95026k0(new C34003i(new C33994a(this.f82686d)));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$s */
    static final class C33995s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33995s(C33969f fVar) {
            super(1);
            this.f82688d = fVar;
        }

        /* renamed from: a */
        public final void mo82258a(List list) {
            C34007l lVar;
            C1644x Pw = this.f82688d.f82659w;
            C34007l lVar2 = (C34007l) Pw.mo4814f();
            if (lVar2 != null) {
                List list2 = list;
                C41536l.m120488h(list2, "linkedLoans");
                lVar = C34007l.m100026b(lVar2, (C33950d.C33967q) null, (C33950d.C33961k) null, (C33950d.C33951a) null, (C33950d.C33955e) null, (C33950d.C33966p) null, (C33950d.C33954d) null, (C33950d.C33952b) null, list2, (List) null, (Boolean) null, (Boolean) null, 0, (C33950d.C33957g) null, 8063, (Object) null);
            } else {
                lVar = null;
            }
            Pw.mo4826r(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82258a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$t */
    static final class C33996t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82689d;

        /* renamed from: e */
        final /* synthetic */ Calendar f82690e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33996t(C33969f fVar, Calendar calendar) {
            super(1);
            this.f82689d = fVar;
            this.f82690e = calendar;
        }

        /* renamed from: a */
        public final C40754t invoke(List list) {
            C41536l.m120489i(list, "accKeys");
            C40749p O = C25074c.m80040d(this.f82689d.f82643g, Long.valueOf(this.f82690e.getTimeInMillis()), Long.valueOf(Calendar.getInstance().getTimeInMillis()), (Integer) null, (Integer) null, 10, list, (List) null, (List) null, (String) null, (List) null, (List) null, false, (C28261a) null, false, 16332, (Object) null).mo95075O();
            C41536l.m120488h(O, "getTransactions(\n       …         ).toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$u */
    static final class C33997u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33969f f82691d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$u$a */
        static final class C33998a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C1644x f82692d;

            /* renamed from: e */
            final /* synthetic */ C34007l f82693e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33998a(C1644x xVar, C34007l lVar) {
                super(1);
                this.f82692d = xVar;
                this.f82693e = lVar;
            }

            /* renamed from: a */
            public final void mo82261a(C25264c cVar) {
                C34007l lVar;
                C1644x xVar = this.f82692d;
                C34007l lVar2 = this.f82693e;
                if (lVar2 != null) {
                    lVar = C34007l.m100026b(lVar2, (C33950d.C33967q) null, (C33950d.C33961k) null, (C33950d.C33951a) null, (C33950d.C33955e) null, (C33950d.C33966p) null, (C33950d.C33954d) null, (C33950d.C33952b) null, (List) null, (List) null, Boolean.TRUE, Boolean.FALSE, 0, (C33950d.C33957g) null, 6655, (Object) null);
                } else {
                    lVar = null;
                }
                xVar.mo4826r(lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82261a((C25264c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$u$b */
        static final class C33999b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C1644x f82694d;

            /* renamed from: e */
            final /* synthetic */ C34007l f82695e;

            /* renamed from: f */
            final /* synthetic */ C33969f f82696f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33999b(C1644x xVar, C34007l lVar, C33969f fVar) {
                super(1);
                this.f82694d = xVar;
                this.f82695e = lVar;
                this.f82696f = fVar;
            }

            /* renamed from: a */
            public final void mo82262a(C25264c cVar) {
                C34007l lVar;
                C25264c cVar2 = cVar;
                C1644x xVar = this.f82694d;
                C34007l lVar2 = this.f82695e;
                if (lVar2 != null) {
                    C38395a Mw = this.f82696f.f82646j;
                    C41536l.m120488h(cVar2, "it");
                    List f = Mw.mo91915f(cVar2);
                    Boolean bool = Boolean.FALSE;
                    lVar = C34007l.m100026b(lVar2, (C33950d.C33967q) null, (C33950d.C33961k) null, (C33950d.C33951a) null, (C33950d.C33955e) null, (C33950d.C33966p) null, (C33950d.C33954d) null, (C33950d.C33952b) null, (List) null, f, bool, bool, 0, (C33950d.C33957g) null, 6399, (Object) null);
                } else {
                    lVar = null;
                }
                xVar.mo4826r(lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82262a((C25264c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.f$u$c */
        static final class C34000c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C1644x f82697d;

            /* renamed from: e */
            final /* synthetic */ C34007l f82698e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34000c(C1644x xVar, C34007l lVar) {
                super(1);
                this.f82697d = xVar;
                this.f82698e = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C1644x xVar = this.f82697d;
                C34007l lVar = this.f82698e;
                xVar.mo4826r(lVar != null ? C34007l.m100026b(lVar, (C33950d.C33967q) null, (C33950d.C33961k) null, (C33950d.C33951a) null, (C33950d.C33955e) null, (C33950d.C33966p) null, (C33950d.C33954d) null, (C33950d.C33952b) null, (List) null, (List) null, Boolean.FALSE, Boolean.TRUE, 0, (C33950d.C33957g) null, 6655, (Object) null) : null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33997u(C33969f fVar) {
            super(1);
            this.f82691d = fVar;
        }

        /* renamed from: a */
        public final void mo82260a(C31128a aVar) {
            C1644x Pw = this.f82691d.f82659w;
            C33969f fVar = this.f82691d;
            C34007l lVar = (C34007l) Pw.mo4814f();
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C33998a(Pw, lVar), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C33999b(Pw, lVar, fVar), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34000c(Pw, lVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82260a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33969f(C25352k kVar, C38884p0 p0Var, C38870j jVar, C38879n nVar, C38868i0 i0Var, C25074c cVar, C31658b bVar, C26145c cVar2, C38395a aVar, PreferencesApiManager preferencesApiManager, C20292b bVar2, C19393b bVar3, C38883p pVar, C39178b bVar4, C39177a aVar2, C27494a aVar3, TargetEnvironment targetEnvironment, long j) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C38870j jVar2 = jVar;
        C38879n nVar2 = nVar;
        C38868i0 i0Var2 = i0Var;
        C25074c cVar3 = cVar;
        C31658b bVar5 = bVar;
        C26145c cVar4 = cVar2;
        C38395a aVar4 = aVar;
        PreferencesApiManager preferencesApiManager2 = preferencesApiManager;
        C20292b bVar6 = bVar2;
        C19393b bVar7 = bVar3;
        C38883p pVar2 = pVar;
        C39178b bVar8 = bVar4;
        C39177a aVar5 = aVar2;
        TargetEnvironment targetEnvironment2 = targetEnvironment;
        C41536l.m120489i(kVar, "reloadProductsUseCase");
        C41536l.m120489i(p0Var, "reloadCardsUseCase");
        C41536l.m120489i(jVar2, "getAccountsAndCreditCardsUseCase");
        C41536l.m120489i(nVar2, "getCardExtraDetailsUseCase");
        C41536l.m120489i(i0Var2, "getLinkedLoansByAccountKeyUseCase");
        C41536l.m120489i(cVar3, "getTransactions");
        C41536l.m120489i(bVar5, "startTMXProfilingUseCase");
        C41536l.m120489i(cVar4, "cardExtraDetailsModelMapper");
        C41536l.m120489i(aVar4, "mapper");
        C41536l.m120489i(preferencesApiManager2, "preferencesApiManager");
        C41536l.m120489i(bVar6, "getAppSettingByName");
        C41536l.m120489i(bVar7, "checkIfCardsAreAddedToWallet");
        C41536l.m120489i(pVar2, "getClosableAccountUseCase");
        C41536l.m120489i(bVar8, "getValidateAccountBeforeDeactivationUseCase");
        C41536l.m120489i(aVar5, "getAccountDeactivationUseCase");
        C41536l.m120489i(aVar3, "otpParamsMapBuilder");
        C41536l.m120489i(targetEnvironment, "environment");
        this.f82640d = jVar2;
        this.f82641e = nVar2;
        this.f82642f = i0Var2;
        this.f82643g = cVar3;
        this.f82644h = bVar5;
        this.f82645i = cVar4;
        this.f82646j = aVar4;
        this.f82647k = preferencesApiManager2;
        this.f82648l = bVar6;
        this.f82649m = bVar7;
        this.f82650n = pVar2;
        this.f82651o = bVar8;
        this.f82652p = aVar5;
        this.f82653q = aVar3;
        this.f82654r = targetEnvironment;
        C1644x xVar = new C1644x(new C34007l((C33950d.C33967q) null, (C33950d.C33961k) null, (C33950d.C33951a) null, (C33950d.C33955e) null, (C33950d.C33966p) null, (C33950d.C33954d) null, (C33950d.C33952b) null, (List) null, (List) null, (Boolean) null, (Boolean) null, j, (C33950d.C33957g) null, 6143, (DefaultConstructorMarker) null));
        this.f82659w = xVar;
        this.f82660x = C1607m0.m5655c(xVar, C33980h.f82673d);
        this.f82661y = new C1644x();
        this.f82662z = new C1644x();
        this.f82618A = new C1644x();
        this.f82619B = new C1644x();
        this.f82620C = new C1644x();
        this.f82621D = new C1644x();
        this.f82622E = new C1644x();
        this.f82623F = new C1644x();
        this.f82624G = new C1644x();
        this.f82625H = new C1644x();
        this.f82626I = new C1644x();
        this.f82627J = new C1644x();
        this.f82628K = new C1644x();
        this.f82629L = new C1644x();
        this.f82630M = new C1644x();
        this.f82631N = new C1644x();
        this.f82632O = new C1644x();
        this.f82633P = new C1644x();
        this.f82634Q = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ScaParamPair>()");
        this.f82635R = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<List<Long>>()");
        this.f82636S = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Long>()");
        this.f82637T = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<List<CardModel>>()");
        this.f82638U = h14;
        this.f82639V = new AtomicReference(-1L);
        C41205b F0 = C40749p.m118051n0(onInit().mo95026k0(new C37338w(C33970a.f82663d)), onRefresh().mo95026k0(new C37339x(C33971b.f82664d)), kVar.mo63917a().mo95026k0(new C37340y(C33972c.f82665d)), p0Var.mo92582b().mo95026k0(new C37341z(C33973d.f82666d))).mo94989L0(new C37305a0(new C33974e(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C37307b0(new C33977f(this, j)));
        C41536l.m120488h(F0, "merge(\n                o…accKey)\n                }");
        bindToLifecycle(F0);
        m99862Ex();
        m99880Nx();
        m99886Qx();
        m99872Jx();
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final C40754t m99854Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ax */
    public static final C38609c m99855Ax(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38609c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m99856Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cx */
    public final void m99858Cx() {
        BillInfo e;
        CreditCardAccount ox = m99908ox();
        if (ox != null && (e = ox.mo81945e()) != null) {
            mo82191ir().mo4823o(C32343x.m95466m(new C41224m(Long.valueOf(e.mo81906a()), Double.valueOf(e.mo81921p()))));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Dx */
    public final void m99860Dx(long j) {
        C34007l lVar;
        CreditCardAccount creditCardAccount;
        C34007l lVar2;
        List list;
        Object obj;
        boolean z;
        C1644x xVar = this.f82659w;
        C34007l lVar3 = (C34007l) xVar.mo4814f();
        C41224m mVar = null;
        if (lVar3 != null) {
            lVar = C34007l.m100026b(lVar3, (C33950d.C33967q) null, (C33950d.C33961k) null, (C33950d.C33951a) null, (C33950d.C33955e) null, (C33950d.C33966p) null, (C33950d.C33954d) null, (C33950d.C33952b) null, (List) null, (List) null, (Boolean) null, (Boolean) null, j, (C33950d.C33957g) null, 6143, (Object) null);
        } else {
            lVar = null;
        }
        xVar.mo4826r(lVar);
        C41224m mVar2 = this.f82657u;
        if (mVar2 == null) {
            C41536l.m120506z("accountsAndCards");
            mVar2 = null;
        }
        List a = ((C39948l) mVar2.mo95678e()).mo93735b().mo93700a();
        if (a != null) {
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((CreditCardAccount) obj).mo81941a() == j) {
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
            creditCardAccount = (CreditCardAccount) obj;
        } else {
            creditCardAccount = null;
        }
        C1644x xVar2 = this.f82659w;
        C34007l lVar4 = (C34007l) xVar2.mo4814f();
        if (lVar4 != null) {
            C38395a aVar = this.f82646j;
            if (creditCardAccount != null) {
                list = creditCardAccount.mo81952j();
            } else {
                list = null;
            }
            C33950d.C33961k d = aVar.mo91913d(list, j, this.f82658v, C20101a.f54724a.mo48499c(this.f82648l));
            C38395a aVar2 = this.f82646j;
            C41224m mVar3 = this.f82657u;
            if (mVar3 == null) {
                C41536l.m120506z("accountsAndCards");
                mVar3 = null;
            }
            C33950d.C33951a a2 = aVar2.mo91910a((List) ((C26766e) mVar3.mo95680f()).mo66048a().get(Long.valueOf(j)));
            C38395a aVar3 = this.f82646j;
            C41224m mVar4 = this.f82657u;
            if (mVar4 == null) {
                C41536l.m120506z("accountsAndCards");
                mVar4 = null;
            }
            lVar2 = C34007l.m100026b(lVar4, (C33950d.C33967q) null, d, a2, aVar3.mo91918l((List) ((C26766e) mVar4.mo95680f()).mo66048a().get(Long.valueOf(j))), this.f82646j.mo91916g(m99910px()), this.f82646j.mo91912c(m99910px()), this.f82646j.mo91911b(creditCardAccount, m99912qx(), m99914rx()), (List) null, (List) null, (Boolean) null, (Boolean) null, 0, (C33950d.C33957g) null, 8065, (Object) null);
        } else {
            lVar2 = null;
        }
        xVar2.mo4826r(lVar2);
        this.f82637T.onNext(Long.valueOf(j));
        this.f82636S.onNext(C41339p.m119900e(Long.valueOf(j)));
        C40767b bVar = this.f82638U;
        C41224m mVar5 = this.f82657u;
        if (mVar5 == null) {
            C41536l.m120506z("accountsAndCards");
        } else {
            mVar = mVar5;
        }
        List list2 = (List) ((C26766e) mVar.mo95680f()).mo66048a().get(Long.valueOf(j));
        if (list2 != null) {
            bVar.onNext(list2);
        }
    }

    /* renamed from: Ex */
    private final void m99862Ex() {
        C41205b G0 = this.f82635R.mo94998Q(new C37323j0(new C33984k(this))).mo95027o0(C40992a.m118827a()).mo94980F(new C37325k0(new C33985l(this))).mo94983G0(new C37327l0(new C33986m(this)), new C37336u(new C33987n(this)));
        C41536l.m120488h(G0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(G0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fx */
    public static final C40754t m99864Fx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gx */
    public static final void m99866Gx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hx */
    public static final void m99868Hx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ix */
    public static final void m99870Ix(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Jx */
    private final void m99872Jx() {
        C41205b F0 = this.f82638U.mo95026k0(new C37313e0(new C33988o(this.f82646j))).mo94989L0(new C37315f0(new C33989p(this))).mo94981F0(new C37317g0(new C33990q(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kx */
    public static final C40754t m99874Kx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lx */
    public static final void m99876Lx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mx */
    public static final List m99878Mx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: Nx */
    private final void m99880Nx() {
        C41205b F0 = this.f82637T.mo94998Q(new C37335t(new C33993r(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C37311d0(new C33995s(this)));
        C41536l.m120488h(F0, "private fun subscribeToL…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ox */
    public static final C40754t m99882Ox(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Px */
    public static final void m99884Px(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Qx */
    private final void m99886Qx() {
        Calendar instance = Calendar.getInstance();
        instance.add(2, -3);
        C41205b F0 = this.f82636S.mo94998Q(new C37319h0(new C33996t(this, instance))).mo95027o0(C40992a.m118827a()).mo94981F0(new C37321i0(new C33997u(this)));
        C41536l.m120488h(F0, "private fun subscribeToT…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rx */
    public static final C40754t m99888Rx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sx */
    public static final void m99890Sx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: bx */
    private final C38609c m99893bx(List list) {
        String str;
        String b;
        String str2;
        if (list.size() > 1) {
            int i = 0;
            String str3 = "";
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C41341q.m119917t();
                }
                C26375b bVar = (C26375b) next;
                if (list.size() - 1 == i) {
                    str2 = "";
                } else {
                    str2 = "\n\n";
                }
                str3 = str3 + "• " + C32343x.m95388F(bVar.mo65583b(), new Object[0]) + str2;
                i = i2;
            }
            return new C38609c.C38613d(str3);
        }
        C26375b bVar2 = C26375b.AMOUNT_FOUND;
        if (list.contains(bVar2)) {
            return new C38609c.C38614e(C32343x.m95388F(bVar2.mo65583b(), new Object[0]), m99906nx());
        }
        C26375b bVar3 = C26375b.GEN_COMMISSION;
        if (list.contains(bVar3)) {
            return new C38609c.C38610a(C32343x.m95388F(bVar3.mo65583b(), new Object[0]));
        }
        C26375b bVar4 = (C26375b) C41358y.m120009Y(list);
        if (bVar4 == null || (b = bVar4.mo65583b()) == null || (str = C32343x.m95388F(b, new Object[0])) == null) {
            str = C32343x.m95452h0(C36274h.f87576p, new Object[0]);
        }
        return new C38609c.C38611b(str);
    }

    /* renamed from: mx */
    private final C39938b0 m99904mx(long j, String str, String str2, String str3, String str4) {
        Object obj;
        boolean z;
        C41224m mVar = this.f82657u;
        if (mVar == null) {
            C41536l.m120506z("accountsAndCards");
            mVar = null;
        }
        List list = (List) ((C26766e) mVar.mo95680f()).mo66048a().get(m99906nx());
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C26765d) obj).mo66030j() == j) {
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
        C26765d dVar = (C26765d) obj;
        if (dVar == null) {
            return null;
        }
        return new C39938b0(BankApi.CARDS_GET_VIRTUAL_CARD_DETAILS, this.f82653q.mo66809a(new SCACardDetailsParams(String.valueOf(dVar.mo66030j()), dVar.mo66034n(), str, BankApi.CARDS_GET_VIRTUAL_CARD_DETAILS, str2, str3, str4)));
    }

    /* access modifiers changed from: private */
    /* renamed from: nx */
    public final Long m99906nx() {
        C34007l lVar = (C34007l) this.f82659w.mo4814f();
        if (lVar != null) {
            return Long.valueOf(lVar.mo82279o());
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ge.bog.mobilebank.products.domain.model.CreditCardAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ge.bog.mobilebank.products.domain.model.CreditCardAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.products.domain.model.CreditCardAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ge.bog.mobilebank.products.domain.model.CreditCardAccount} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ox */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.products.domain.model.CreditCardAccount m99908ox() {
        /*
            r7 = this;
            he1.m r0 = r7.f82657u
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "accountsAndCards"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            java.lang.Object r0 = r0.mo95678e()
            xy0.l r0 = (xy0.C39948l) r0
            xy0.f r0 = r0.mo93735b()
            java.util.List r0 = r0.mo93700a()
            if (r0 == 0) goto L_0x0047
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.products.domain.model.CreditCardAccount r3 = (p341ge.bog.mobilebank.products.domain.model.CreditCardAccount) r3
            long r3 = r3.mo81941a()
            java.lang.Long r5 = r7.m99906nx()
            if (r5 != 0) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0041
            r3 = 1
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            if (r3 == 0) goto L_0x001f
            r1 = r2
        L_0x0045:
            ge.bog.mobilebank.products.domain.model.CreditCardAccount r1 = (p341ge.bog.mobilebank.products.domain.model.CreditCardAccount) r1
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.creditcard.C33969f.m99908ox():ge.bog.mobilebank.products.domain.model.CreditCardAccount");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ge.bog.mobilebank.products.domain.model.BillInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ge.bog.mobilebank.products.domain.model.BillInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.products.domain.model.BillInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ge.bog.mobilebank.products.domain.model.BillInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: px */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.products.domain.model.BillInfo m99910px() {
        /*
            r7 = this;
            he1.m r0 = r7.f82657u
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "accountsAndCards"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            java.lang.Object r0 = r0.mo95678e()
            xy0.l r0 = (xy0.C39948l) r0
            java.util.List r0 = r0.mo93734a()
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.products.domain.model.BillInfo r3 = (p341ge.bog.mobilebank.products.domain.model.BillInfo) r3
            long r3 = r3.mo81906a()
            java.lang.Long r5 = r7.m99906nx()
            if (r5 != 0) goto L_0x0031
            goto L_0x003b
        L_0x0031:
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x003b
            r3 = 1
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            if (r3 == 0) goto L_0x0019
            r1 = r2
        L_0x003f:
            ge.bog.mobilebank.products.domain.model.BillInfo r1 = (p341ge.bog.mobilebank.products.domain.model.BillInfo) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.creditcard.C33969f.m99910px():ge.bog.mobilebank.products.domain.model.BillInfo");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: xy0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: xy0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: xy0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: xy0.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: qx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final xy0.C39946j m99912qx() {
        /*
            r7 = this;
            he1.m r0 = r7.f82657u
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "accountsAndCards"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            java.lang.Object r0 = r0.mo95678e()
            xy0.l r0 = (xy0.C39948l) r0
            java.util.List r0 = r0.mo93736c()
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r0.next()
            r3 = r2
            xy0.j r3 = (xy0.C39946j) r3
            long r3 = r3.mo93720a()
            java.lang.Long r5 = r7.m99906nx()
            if (r5 != 0) goto L_0x0031
            goto L_0x003b
        L_0x0031:
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x003b
            r3 = 1
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            if (r3 == 0) goto L_0x0019
            r1 = r2
        L_0x003f:
            xy0.j r1 = (xy0.C39946j) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.creditcard.C33969f.m99912qx():xy0.j");
    }

    /* renamed from: rx */
    private final List m99914rx() {
        C41224m mVar = this.f82657u;
        if (mVar == null) {
            C41536l.m120506z("accountsAndCards");
            mVar = null;
        }
        return (List) ((C26766e) mVar.mo95680f()).mo66048a().get(m99906nx());
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final Boolean m99919ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final Boolean m99920xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xx */
    public final C38609c m99921xx(C26374a aVar, C38609c cVar, C43064a aVar2) {
        if (!C41536l.m120484d(aVar.mo65578a(), "Y")) {
            return m99893bx(aVar.mo65579b());
        }
        if (aVar2 == null) {
            return cVar;
        }
        C41238w wVar = (C41238w) aVar2.invoke();
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final Boolean m99922yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* renamed from: yx */
    static /* synthetic */ C38609c m99923yx(C33969f fVar, C26374a aVar, C38609c cVar, C43064a aVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar2 = null;
        }
        return fVar.m99921xx(aVar, cVar, aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final Boolean m99924zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zx */
    public static final C38609c m99925zx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38609c) lVar.invoke(obj);
    }

    /* renamed from: Ak */
    public void mo82199Ak() {
        Long nx = m99906nx();
        if (nx != null) {
            mo82184Sq().mo4823o(C32343x.m95466m(Long.valueOf(nx.longValue())));
        }
        C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_requisites");
    }

    /* renamed from: Bb */
    public void mo38217Bb(long j, int i, int i2) {
        mo82185W0().mo4826r(C32343x.m95466m(new C38607a(j, i2, i)));
    }

    /* renamed from: Bx */
    public void mo82200Bx() {
        BillInfo px = m99910px();
        if (px != null) {
            mo82180B6().mo4823o(C32343x.m95466m(px));
        }
        C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_next_payment");
    }

    /* renamed from: D2 */
    public void mo82201D2(String str, String str2, String str3) {
        Object obj = this.f82639V.get();
        C41536l.m120488h(obj, "lastClickedCardId.get()");
        C39938b0 mx = m99904mx(((Number) obj).longValue(), C10146d0.C10177h.m37232a(), str, str2, str3);
        if (mx != null) {
            this.f82635R.onNext(mx);
        }
    }

    /* renamed from: Fp */
    public void mo82202Fp(long j) {
        C36852d.C36853a aVar = C36852d.C36853a.f88944f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        aVar.mo89778a(F);
        C40762x A = C32343x.m95465l1(this.f82651o.mo92824a(j)).mo95062A(new C37309c0(new C33981i(this, j)));
        C41536l.m120488h(A, "override fun onCloseAcco…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C31270e.m92880i(A, -1), mo82182O2()));
    }

    /* renamed from: G0 */
    public void mo82203G0() {
        C33950d.C33955e eVar;
        List a;
        CardInsSecCardModel d;
        C34007l lVar = (C34007l) this.f82659w.mo4814f();
        if (lVar != null) {
            eVar = lVar.mo82269f();
        } else {
            eVar = null;
        }
        if (eVar != null && (a = eVar.mo82152a()) != null) {
            if (a.size() > 1) {
                mo82188c0().mo4826r(C32343x.m95466m(eVar));
            } else if (a.size() == 1 && (d = ((CardUiModel) a.get(0)).mo82610d()) != null) {
                mo82195o().mo4826r(C32343x.m95466m(d));
            }
        }
    }

    /* renamed from: L9 */
    public void mo38227L9() {
    }

    /* renamed from: N7 */
    public void mo38230N7(AccountOperation accountOperation) {
        C41536l.m120489i(accountOperation, "accountOperation");
        mo82189c1().mo4826r(C32343x.m95466m(accountOperation));
    }

    /* renamed from: P9 */
    public void mo38232P9() {
        CreditCardAccount ox = m99908ox();
        if (ox != null) {
            mo82187Y().mo4823o(C32343x.m95466m(Long.valueOf(ox.mo81941a())));
        }
        C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_statement");
    }

    /* renamed from: Q0 */
    public void mo38233Q0(long j, int i) {
        C33950d.C33967q qVar;
        m99860Dx(j);
        C34007l lVar = (C34007l) this.f82659w.mo4814f();
        if (lVar != null) {
            qVar = lVar.mo82278n();
        } else {
            qVar = null;
        }
        if (qVar != null) {
            qVar.mo82178c(i);
        }
    }

    /* renamed from: Ss */
    public void mo70818Ss() {
        Long nx = m99906nx();
        if (nx != null) {
            mo82193l2().mo4826r(C32343x.m95466m(Long.valueOf(nx.longValue())));
        }
    }

    /* renamed from: Tl */
    public void mo70819Tl() {
        Long nx = m99906nx();
        if (nx != null) {
            this.f82636S.onNext(C41339p.m119900e(Long.valueOf(nx.longValue())));
        }
    }

    /* renamed from: Vw */
    public C1644x mo82193l2() {
        return this.f82628K;
    }

    /* renamed from: Ww */
    public C1644x mo82181M1() {
        return this.f82620C;
    }

    /* renamed from: Xt */
    public void mo82206Xt(long j) {
        C40762x A = C32343x.m95465l1(this.f82652p.mo92823a(j)).mo95062A(new C37337v(new C33982j(this)));
        C41536l.m120488h(A, "override fun onConfirmCl…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C31270e.m92880i(A, -1), mo82182O2()));
    }

    /* renamed from: Xw */
    public C1644x mo82198x2() {
        return this.f82621D;
    }

    /* renamed from: Yw */
    public C1644x mo82194n2() {
        return this.f82623F;
    }

    /* renamed from: Zm */
    public void mo82209Zm(String str, String str2) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        C41536l.m120489i(str2, "fileId");
        C1644x cx = mo82179A2();
        String rbMiddleware = this.f82654r.getRbMiddleware();
        String populateUrlWithExtraData = RetrofitClient.populateUrlWithExtraData(rbMiddleware + "?" + str);
        cx.mo4823o(C32343x.m95466m(C41233s.m119492a(populateUrlWithExtraData, "agreement-" + str2 + ".pdf")));
    }

    /* renamed from: Zw */
    public C1644x mo82186W2() {
        return this.f82622E;
    }

    /* renamed from: a1 */
    public void mo82211a1(long j) {
        Long nx = m99906nx();
        if (nx != null) {
            mo82198x2().mo4826r(new C37223a(new C41224m(Long.valueOf(j), Long.valueOf(nx.longValue()))));
        }
        C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_tab_cards_click_card");
    }

    /* renamed from: as */
    public void mo38239as() {
    }

    /* renamed from: ax */
    public C1644x mo82182O2() {
        return this.f82633P;
    }

    /* renamed from: be */
    public void mo82213be() {
        CreditCardAccount ox = m99908ox();
        if (ox != null) {
            mo82183Pg().mo4823o(C32343x.m95466m(ox.mo81949h()));
        }
    }

    /* renamed from: cn */
    public void mo82214cn() {
        C1644x gx = mo82196p2();
        Long nx = m99906nx();
        if (nx != null) {
            C37224b.m109965d(gx, Long.valueOf(nx.longValue()));
        }
    }

    /* renamed from: cx */
    public C1644x mo82179A2() {
        return this.f82626I;
    }

    /* renamed from: dx */
    public final C37334s mo82216dx() {
        return this.f82655s;
    }

    /* renamed from: ex */
    public C1644x mo82185W0() {
        return this.f82630M;
    }

    /* renamed from: fx */
    public C1644x mo82190e() {
        return this.f82632O;
    }

    /* renamed from: gx */
    public C1644x mo82196p2() {
        return this.f82631N;
    }

    /* renamed from: hx */
    public C1644x mo82195o() {
        return this.f82625H;
    }

    /* renamed from: ix */
    public C1644x mo82197q0() {
        return this.f82634Q;
    }

    /* renamed from: j */
    public LiveData mo82192j() {
        return this.f82660x;
    }

    /* renamed from: jx */
    public C1644x mo82189c1() {
        return this.f82629L;
    }

    /* renamed from: kx */
    public final C33968e mo82223kx() {
        return this.f82656t;
    }

    /* renamed from: l1 */
    public void mo82224l1(long j) {
        bindToLifecycle(this.f82644h.mo72084b(TMXFlags.TMX_FLAG_CARD_INFO_KEY));
        this.f82639V.set(Long.valueOf(j));
        C39938b0 mx = m99904mx(j, C10146d0.C10177h.m37232a(), (String) null, (String) null, (String) null);
        if (mx != null) {
            mo82186W2().mo4826r(new C37223a(mx));
        }
        C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_tab_cards_click_card_details");
    }

    /* renamed from: lx */
    public C1644x mo82184Sq() {
        return this.f82619B;
    }

    /* renamed from: m0 */
    public void mo82226m0() {
        String str;
        C32343x.m95501z0(this, "credit_cards_page", "", "select_p2p_topup");
        C1644x ix = mo82197q0();
        CreditCardAccount ox = m99908ox();
        if (ox != null) {
            str = ox.mo81949h();
        } else {
            str = null;
        }
        ix.mo4823o(new C37223a(str));
    }

    /* renamed from: n4 */
    public void mo82227n4() {
        BillInfo px = m99910px();
        if (px != null) {
            mo82180B6().mo4823o(C32343x.m95466m(px));
        }
        C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_fill_in");
    }

    /* renamed from: ne */
    public void mo38245ne() {
    }

    /* renamed from: nq */
    public void mo82228nq() {
        PreferencesApiManager preferencesApiManager = this.f82647k;
        Long nx = m99906nx();
        if (nx != null) {
            preferencesApiManager.setHideGooglePayBannerForAccount(Long.valueOf(nx.longValue()));
            C34007l lVar = (C34007l) this.f82659w.mo4814f();
            if (lVar != null) {
                this.f82659w.mo4826r(C34007l.m100026b(lVar, (C33950d.C33967q) null, (C33950d.C33961k) null, (C33950d.C33951a) null, (C33950d.C33955e) null, (C33950d.C33966p) null, (C33950d.C33954d) null, (C33950d.C33952b) null, (List) null, (List) null, (Boolean) null, (Boolean) null, 0, (C33950d.C33957g) null, C11051p3.f31758b, (Object) null));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: o70.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: o70.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: o70.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: o70.d} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r9 != null) goto L_0x005e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo82229p1(long r9) {
        /*
            r8 = this;
            java.lang.Long r0 = r8.m99906nx()
            if (r0 == 0) goto L_0x006a
            long r0 = r0.longValue()
            androidx.lifecycle.x r2 = r8.mo82181M1()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            he1.m r4 = r8.f82657u
            r5 = 0
            if (r4 != 0) goto L_0x001d
            java.lang.String r4 = "accountsAndCards"
            kotlin.jvm.internal.C41536l.m120506z(r4)
            r4 = r5
        L_0x001d:
            java.lang.Object r4 = r4.mo95680f()
            o70.e r4 = (o70.C26766e) r4
            java.util.Map r4 = r4.mo66048a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x005c
            java.util.Iterator r0 = r0.iterator()
        L_0x0037:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            r4 = r1
            o70.d r4 = (o70.C26765d) r4
            long r6 = r4.mo66030j()
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x004e
            r4 = 1
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r4 == 0) goto L_0x0037
            r5 = r1
        L_0x0052:
            o70.d r5 = (o70.C26765d) r5
            if (r5 == 0) goto L_0x005c
            java.lang.String r9 = r5.mo66034n()
            if (r9 != 0) goto L_0x005e
        L_0x005c:
            java.lang.String r9 = ""
        L_0x005e:
            he1.m r10 = new he1.m
            r10.<init>(r3, r9)
            m41.a r9 = g91.C32343x.m95466m(r10)
            r2.mo4826r(r9)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.creditcard.C33969f.mo82229p1(long):void");
    }

    /* renamed from: sx */
    public C1644x mo82183Pg() {
        return this.f82662z;
    }

    /* renamed from: tx */
    public C1644x mo82188c0() {
        return this.f82624G;
    }

    /* renamed from: ux */
    public C1644x mo82191ir() {
        return this.f82627J;
    }

    /* renamed from: vx */
    public C1644x mo82187Y() {
        return this.f82618A;
    }

    /* renamed from: wx */
    public C1644x mo82180B6() {
        return this.f82661y;
    }
}

package p341ge.bog.mobilebank.products.presentation.details.debitcard;

import a41.C30483b;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import ba1.C10146d0;
import bk0.C19393b;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import e41.C31658b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l70.C25846a;
import m41.C37223a;
import m41.C37224b;
import m50.C26145c;
import m70.C26148a;
import m70.C26150c;
import m70.C26153f;
import md0.C26186e;
import n70.C26374a;
import n70.C26375b;
import nz0.C37513a1;
import nz0.C37515b0;
import nz0.C37516b1;
import nz0.C37518c0;
import nz0.C37520d0;
import nz0.C37522e0;
import nz0.C37524f0;
import nz0.C37526g0;
import nz0.C37528h0;
import nz0.C37530i0;
import nz0.C37532j0;
import nz0.C37534k0;
import nz0.C37536l0;
import nz0.C37538m0;
import nz0.C37540n0;
import nz0.C37542o0;
import nz0.C37544p0;
import nz0.C37546q0;
import nz0.C37548r0;
import nz0.C37550s0;
import nz0.C37552t0;
import nz0.C37554u0;
import nz0.C37556v0;
import nz0.C37558w0;
import nz0.C37560x0;
import nz0.C37562y0;
import nz0.C37564z0;
import o70.C26763b;
import o70.C26764c;
import o70.C26765d;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.products.model.CardExtraDetailsUIModel;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.cards.DigitalCardInfo;
import p341ge.bog.mobilebank.products.data.model.ExtServiceStatusApiModel;
import p341ge.bog.mobilebank.products.data.model.SCACardDetailsParams;
import p341ge.bog.mobilebank.products.domain.model.CheckChildMBankActiveModel;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e;
import p341ge.bog.mobilebank.products.presentation.details.models.CardUiModel;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p380ck.C10457a;
import p738du.C20101a;
import p748eu.C20292b;
import p784hw.C25074c;
import p793iw.C25264c;
import p891su.C28261a;
import pc0.C27494a;
import r90.C27950a;
import rz0.C38399b;
import sz0.C38607a;
import sz0.C38609c;
import ty0.C38855d;
import ty0.C38862g0;
import ty0.C38864h;
import ty0.C38868i0;
import ty0.C38879n;
import ty0.C38883p;
import ty0.C38884p0;
import ty0.C38900x;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import uy0.C39177a;
import uy0.C39178b;
import vy0.C39497c;
import xs0.C39879r;
import xy0.C39938b0;
import zs0.C40252e;

/* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g */
public final class C34119g extends C21481a implements C34092d, C34118f {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f82876A;

    /* renamed from: B */
    private final C34092d f82877B = this;

    /* renamed from: C */
    private final C34118f f82878C = this;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C25846a f82879D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public List f82880E = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final List f82881F = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C1644x f82882G;

    /* renamed from: H */
    private final LiveData f82883H;

    /* renamed from: I */
    private final C1644x f82884I;

    /* renamed from: J */
    private final C1644x f82885J;

    /* renamed from: K */
    private final C1644x f82886K;

    /* renamed from: L */
    private final C1644x f82887L;

    /* renamed from: M */
    private final C1644x f82888M;

    /* renamed from: N */
    private final C1644x f82889N;

    /* renamed from: O */
    private final C1644x f82890O;

    /* renamed from: P */
    private final C1644x f82891P;

    /* renamed from: Q */
    private final C1644x f82892Q;

    /* renamed from: R */
    private final C1644x f82893R;

    /* renamed from: S */
    private final C1644x f82894S;

    /* renamed from: T */
    private final C1644x f82895T;

    /* renamed from: U */
    private final C1644x f82896U;

    /* renamed from: V */
    private final C1644x f82897V;

    /* renamed from: W */
    private final C1644x f82898W;

    /* renamed from: X */
    private final C1644x f82899X;

    /* renamed from: Y */
    private final C1644x f82900Y;

    /* renamed from: Z */
    private final C1644x f82901Z;

    /* renamed from: a0 */
    private final C1644x f82902a0;

    /* renamed from: b0 */
    private final C1644x f82903b0;

    /* renamed from: c0 */
    private final C1644x f82904c0;

    /* renamed from: d */
    private final C25352k f82905d;

    /* renamed from: d0 */
    private final C1644x f82906d0;

    /* renamed from: e */
    private final C38884p0 f82907e;

    /* renamed from: e0 */
    private final C1644x f82908e0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38864h f82909f;

    /* renamed from: f0 */
    private final C1644x f82910f0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C38868i0 f82911g;

    /* renamed from: g0 */
    private final C1644x f82912g0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C38862g0 f82913h;

    /* renamed from: h0 */
    private final C40767b f82914h0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C39879r f82915i;

    /* renamed from: i0 */
    private final C40767b f82916i0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C38879n f82917j;

    /* renamed from: j0 */
    private final C40767b f82918j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C38855d f82919k;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public final C40767b f82920k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C38900x f82921l;

    /* renamed from: l0 */
    private final C40767b f82922l0;

    /* renamed from: m */
    private final C31658b f82923m;

    /* renamed from: m0 */
    private final C40767b f82924m0;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C38399b f82925n;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public final C40767b f82926n0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C26145c f82927o;

    /* renamed from: o0 */
    private final C40767b f82928o0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C25074c f82929p;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public final AtomicReference f82930p0;

    /* renamed from: q */
    private final C20292b f82931q;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public final AtomicReference f82932q0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final PreferencesApiManager f82933r;

    /* renamed from: r0 */
    private String f82934r0;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C19393b f82935s;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public final HashMap f82936s0;

    /* renamed from: t */
    private final C39497c f82937t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C38883p f82938u;

    /* renamed from: v */
    private final C39178b f82939v;

    /* renamed from: w */
    private final C39177a f82940w;

    /* renamed from: x */
    private final C27494a f82941x;

    /* renamed from: y */
    private final TargetEnvironment f82942y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final long f82943z;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$a */
    static final class C34120a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34120a f82944d = new C34120a();

        C34120a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$a0 */
    static final class C34121a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34121a0(C34119g gVar) {
            super(1);
            this.f82945d = gVar;
        }

        /* renamed from: a */
        public final void mo82484a(List list) {
            C34165m mVar;
            C1644x gx = this.f82945d.f82882G;
            C34165m mVar2 = (C34165m) gx.mo4814f();
            if (mVar2 != null) {
                List list2 = list;
                C41536l.m120488h(list2, "linkedLoans");
                mVar = C34165m.m100546b(mVar2, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, list2, (List) null, (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, 0, 65471, (Object) null);
            } else {
                mVar = null;
            }
            gx.mo4826r(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82484a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$b */
    static final class C34122b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34122b f82946d = new C34122b();

        C34122b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Integer num) {
            boolean z;
            C41536l.m120489i(num, "it");
            if (num.intValue() == 6) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$b0 */
    static final class C34123b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82947d;

        /* renamed from: e */
        final /* synthetic */ Calendar f82948e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34123b0(C34119g gVar, Calendar calendar) {
            super(1);
            this.f82947d = gVar;
            this.f82948e = calendar;
        }

        /* renamed from: a */
        public final C40754t invoke(List list) {
            C41536l.m120489i(list, "accKeys");
            C40749p O = C25074c.m80040d(this.f82947d.f82929p, Long.valueOf(this.f82948e.getTimeInMillis()), Long.valueOf(Calendar.getInstance().getTimeInMillis()), (Integer) null, (Integer) null, 10, list, (List) null, (List) null, (String) null, (List) null, (List) null, false, (C28261a) null, false, 16332, (Object) null).mo95075O();
            C41536l.m120488h(O, "getTransactions(\n       …         ).toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$c */
    static final class C34124c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34124c f82949d = new C34124c();

        C34124c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$c0 */
    static final class C34125c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82950d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$c0$a */
        static final class C34126a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C1644x f82951d;

            /* renamed from: e */
            final /* synthetic */ C34165m f82952e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34126a(C1644x xVar, C34165m mVar) {
                super(1);
                this.f82951d = xVar;
                this.f82952e = mVar;
            }

            /* renamed from: a */
            public final void mo82489a(C25264c cVar) {
                C34165m mVar;
                C1644x xVar = this.f82951d;
                C34165m mVar2 = this.f82952e;
                if (mVar2 != null) {
                    mVar = C34165m.m100546b(mVar2, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, Boolean.TRUE, Boolean.FALSE, 0, 40959, (Object) null);
                } else {
                    mVar = null;
                }
                xVar.mo4826r(mVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82489a((C25264c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$c0$b */
        static final class C34127b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C1644x f82953d;

            /* renamed from: e */
            final /* synthetic */ C34165m f82954e;

            /* renamed from: f */
            final /* synthetic */ C34119g f82955f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34127b(C1644x xVar, C34165m mVar, C34119g gVar) {
                super(1);
                this.f82953d = xVar;
                this.f82954e = mVar;
                this.f82955f = gVar;
            }

            /* renamed from: a */
            public final void mo82490a(C25264c cVar) {
                C34165m mVar;
                C25264c cVar2 = cVar;
                C1644x xVar = this.f82953d;
                C34165m mVar2 = this.f82954e;
                if (mVar2 != null) {
                    C38399b dx = this.f82955f.f82925n;
                    C41536l.m120488h(cVar2, "it");
                    List c = dx.mo91923c(cVar2);
                    Boolean bool = Boolean.FALSE;
                    mVar = C34165m.m100546b(mVar2, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, (List) null, (List) null, (List) null, (List) null, c, (C34093e.C34100g) null, bool, bool, 0, 38911, (Object) null);
                } else {
                    mVar = null;
                }
                xVar.mo4826r(mVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82490a((C25264c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$c0$c */
        static final class C34128c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C1644x f82956d;

            /* renamed from: e */
            final /* synthetic */ C34165m f82957e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34128c(C1644x xVar, C34165m mVar) {
                super(1);
                this.f82956d = xVar;
                this.f82957e = mVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C1644x xVar = this.f82956d;
                C34165m mVar = this.f82957e;
                xVar.mo4826r(mVar != null ? C34165m.m100546b(mVar, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, Boolean.FALSE, Boolean.TRUE, 0, 40959, (Object) null) : null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34125c0(C34119g gVar) {
            super(1);
            this.f82950d = gVar;
        }

        /* renamed from: a */
        public final void mo82488a(C31128a aVar) {
            C1644x gx = this.f82950d.f82882G;
            C34119g gVar = this.f82950d;
            C34165m mVar = (C34165m) gx.mo4814f();
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C34126a(gx, mVar), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C34127b(gx, mVar, gVar), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34128c(gx, mVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82488a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$d */
    static final class C34129d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34129d f82958d = new C34129d();

        C34129d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$e */
    static final class C34130e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82959d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$e$a */
        static final class C34131a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C34131a f82960d = new C34131a();

            C34131a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C25846a aVar, List list) {
                C41536l.m120489i(aVar, "accountsAndCards");
                C41536l.m120489i(list, "closableAccounts");
                return C41233s.m119492a(aVar, list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34130e(C34119g gVar) {
            super(1);
            this.f82959d = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m100513c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Boolean bool) {
            boolean z;
            C41536l.m120489i(bool, "it");
            if (bool.booleanValue() || this.f82959d.f82876A) {
                z = true;
            } else {
                z = false;
            }
            return C40749p.m118037d1(C26186e.m81987e(this.f82959d.f82909f.mo63907a(z)), this.f82959d.f82938u.mo92580a(z), new C34159h(C34131a.f82960d));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$f */
    static final class C34132f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82961d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34132f(C34119g gVar) {
            super(1);
            this.f82961d = gVar;
        }

        /* renamed from: a */
        public final void mo82495a(C41224m mVar) {
            int i;
            Object obj;
            Integer num;
            long j;
            boolean z;
            C34119g gVar = this.f82961d;
            Object e = mVar.mo95678e();
            C41536l.m120488h(e, "responseWrapper.first");
            gVar.f82879D = (C25846a) e;
            C34119g gVar2 = this.f82961d;
            Object f = mVar.mo95680f();
            C41536l.m120488h(f, "responseWrapper.second");
            gVar2.f82880E = (List) f;
            this.f82961d.f82881F.clear();
            this.f82961d.f82920k0.onNext(C41238w.f97225a);
            C1644x gx = this.f82961d.f82882G;
            C34119g gVar3 = this.f82961d;
            C34165m mVar2 = (C34165m) gx.mo4814f();
            C38399b dx = gVar3.f82925n;
            C25846a Kw = gVar3.f82879D;
            C34165m mVar3 = null;
            if (Kw == null) {
                C41536l.m120506z("accountsAndCards");
                Kw = null;
            }
            List<C30483b> g = dx.mo91927g(Kw);
            for (C30483b bVar : g) {
                gVar3.f82936s0.put(Long.valueOf(bVar.mo70820a()), bVar.mo70822c());
            }
            Iterator it = C41358y.m119995F0(g).iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long a = ((C30483b) ((C41324h0) obj).mo95946d()).mo70820a();
                Long fx = gVar3.m100330Jx();
                if (fx != null && a == fx.longValue()) {
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
            if (mVar2 != null) {
                if (num != null) {
                    i = num.intValue();
                }
                mVar3 = C34165m.m100546b(mVar2, new C34093e.C34115v(g, i), (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, 0, 65534, (Object) null);
            }
            gx.mo4826r(mVar3);
            C34119g gVar4 = this.f82961d;
            Long fx2 = gVar4.m100330Jx();
            if (fx2 != null) {
                j = fx2.longValue();
            } else {
                j = this.f82961d.f82943z;
            }
            gVar4.m100349Wx(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82495a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$g */
    public interface C34133g {
        /* renamed from: a */
        C34119g mo32547a(long j, boolean z);
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$h */
    static final class C34134h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82962d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34134h(C34119g gVar) {
            super(1);
            this.f82962d = gVar;
        }

        /* renamed from: a */
        public final List invoke(C34165m mVar) {
            Long fx = this.f82962d.m100330Jx();
            if (fx != null) {
                C34119g gVar = this.f82962d;
                long longValue = fx.longValue();
                C1644x wx = gVar.mo82452tm();
                NewProductHeaderView.C13482a aVar = (NewProductHeaderView.C13482a) gVar.f82936s0.get(Long.valueOf(longValue));
                if (aVar != null) {
                    wx.mo4823o(aVar);
                }
            }
            C41536l.m120488h(mVar, "it");
            return C34162k.m100541c(mVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$i */
    static final class C34135i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82963d;

        /* renamed from: e */
        final /* synthetic */ long f82964e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34135i(C34119g gVar, long j) {
            super(1);
            this.f82963d = gVar;
            this.f82964e = j;
        }

        /* renamed from: a */
        public final C38609c invoke(C26374a aVar) {
            C41536l.m120489i(aVar, "it");
            return C34119g.m100341Sx(this.f82963d, aVar, new C38609c.C38615f(this.f82964e), (C43064a) null, 4, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$j */
    static final class C34136j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82965d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$j$a */
        static final class C34137a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C34119g f82966d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34137a(C34119g gVar) {
                super(0);
                this.f82966d = gVar;
            }

            public final void invoke() {
                this.f82966d.onRefresh(6);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34136j(C34119g gVar) {
            super(1);
            this.f82965d = gVar;
        }

        /* renamed from: a */
        public final C38609c invoke(C26374a aVar) {
            C41536l.m120489i(aVar, "it");
            C34119g gVar = this.f82965d;
            return gVar.m100339Rx(aVar, C38609c.C38612c.f92475a, new C34137a(gVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$k */
    static final class C34138k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82967d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34138k(C34119g gVar) {
            super(1);
            this.f82967d = gVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C39879r.m115658b(this.f82967d.f82915i, false, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$l */
    static final class C34139l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34139l(C34119g gVar) {
            super(1);
            this.f82968d = gVar;
        }

        /* renamed from: a */
        public final void mo82500a(C40252e eVar) {
            C34165m mVar;
            this.f82968d.f82881F.addAll(eVar.mo94232a());
            C34165m mVar2 = (C34165m) this.f82968d.f82882G.mo4814f();
            C1644x gx = this.f82968d.f82882G;
            if (mVar2 != null) {
                mVar = C34165m.m100546b(mVar2, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, this.f82968d.f82925n.mo91925e(this.f82968d.f82881F, this.f82968d.f82943z), (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, 0, 65407, (Object) null);
            } else {
                mVar = null;
            }
            gx.mo4826r(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82500a((C40252e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$m */
    static final class C34140m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34140m(C34119g gVar) {
            super(1);
            this.f82969d = gVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C39938b0 b0Var) {
            C41536l.m120489i(b0Var, "params");
            return this.f82969d.f82917j.mo92577a(b0Var.mo93673a()).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$n */
    static final class C34141n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82970d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34141n(C34119g gVar) {
            super(1);
            this.f82970d = gVar;
        }

        /* renamed from: a */
        public final void mo82502a(C41205b bVar) {
            this.f82970d.mo82447n2().mo4826r(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82502a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$o */
    static final class C34142o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82971d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34142o(C34119g gVar) {
            super(1);
            this.f82971d = gVar;
        }

        /* renamed from: a */
        public final void mo82503a(C26764c cVar) {
            C26765d dVar;
            String str;
            String c;
            Object obj;
            boolean z;
            C25846a Kw = this.f82971d.f82879D;
            if (Kw == null) {
                C41536l.m120506z("accountsAndCards");
                Kw = null;
            }
            List list = (List) Kw.mo64629b().mo66048a().get(this.f82971d.m100330Jx());
            if (list != null) {
                C34119g gVar = this.f82971d;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    long j = ((C26765d) obj).mo66030j();
                    Long l = (Long) gVar.f82930p0.get();
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
                this.f82971d.mo82447n2().mo4826r(new C31128a.C31129a(new Throwable(), 0, (Object) null, 6, (DefaultConstructorMarker) null));
                return;
            }
            C1644x qx = this.f82971d.mo82447n2();
            CardExtraDetailsUIModel a = this.f82971d.f82927o.mo65072a(cVar.mo65991a(), cVar.mo65992b());
            String d = C27950a.m86287d(dVar.mo65996A(), false, 2, (Object) null);
            String i = dVar.mo66029i();
            String N = dVar.mo66009N();
            String J = dVar.mo66005J();
            C26763b f = dVar.mo66025f();
            if (f == null || (c = f.mo65986c()) == null) {
                str = null;
            } else {
                str = C32289b0.m95091c(c);
            }
            qx.mo4826r(new C31128a.C31131c(new DigitalCardInfo(a, d, i, N, J, str), 0, 2, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82503a((C26764c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$p */
    static final class C34143p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82972d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34143p(C34119g gVar) {
            super(1);
            this.f82972d = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C1644x qx = this.f82972d.mo82447n2();
            C41536l.m120488h(th, "it");
            qx.mo4826r(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$q */
    /* synthetic */ class C34144q extends C41535k implements C43075l {
        C34144q(Object obj) {
            super(1, obj, C38399b.class, "generateTokenRequests", "generateTokenRequests(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C38399b) this.receiver).mo91928i(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$r */
    static final class C34145r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34145r(C34119g gVar) {
            super(1);
            this.f82973d = gVar;
        }

        /* renamed from: a */
        public final C40754t invoke(List list) {
            C41536l.m120489i(list, "requests");
            return C31270e.m92880i(C32343x.m95465l1(this.f82973d.f82935s.mo47614a(list)), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$s */
    static final class C34146s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82974d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$s$a */
        static final class C34147a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C34119g f82975d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34147a(C34119g gVar) {
                super(1);
                this.f82975d = gVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: ge.bog.mobilebank.products.presentation.details.debitcard.e$g} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo82508a(java.util.List r25) {
                /*
                    r24 = this;
                    r0 = r24
                    r1 = r25
                    java.lang.String r2 = "results"
                    kotlin.jvm.internal.C41536l.m120489i(r1, r2)
                    boolean r2 = r25.isEmpty()
                    r3 = 1
                    r2 = r2 ^ r3
                    r4 = 0
                    if (r2 == 0) goto L_0x0044
                    boolean r2 = r1 instanceof java.util.Collection
                    if (r2 == 0) goto L_0x001e
                    boolean r2 = r25.isEmpty()
                    if (r2 == 0) goto L_0x001e
                L_0x001c:
                    r1 = r4
                    goto L_0x0040
                L_0x001e:
                    java.util.Iterator r1 = r25.iterator()
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
                    ge.bog.mobilebank.products.presentation.details.debitcard.g r2 = r0.f82975d
                    boolean r2 = r2.m100343Tx()
                    if (r2 == 0) goto L_0x0062
                    ge.bog.mobilebank.products.presentation.details.debitcard.g r2 = r0.f82975d
                    ge.bog.mobilebank.rest.manager.PreferencesApiManager r2 = r2.f82933r
                    ge.bog.mobilebank.products.presentation.details.debitcard.g r5 = r0.f82975d
                    java.lang.Long r5 = r5.m100330Jx()
                    boolean r2 = r2.isGooglePayBannerHiddenForAccount(r5)
                    if (r2 != 0) goto L_0x0062
                    if (r1 == 0) goto L_0x0062
                    goto L_0x0063
                L_0x0062:
                    r3 = r4
                L_0x0063:
                    ge.bog.mobilebank.products.presentation.details.debitcard.g r1 = r0.f82975d
                    androidx.lifecycle.x r1 = r1.f82882G
                    ge.bog.mobilebank.products.presentation.details.debitcard.g r2 = r0.f82975d
                    androidx.lifecycle.x r2 = r2.f82882G
                    java.lang.Object r2 = r2.mo4814f()
                    r4 = r2
                    ge.bog.mobilebank.products.presentation.details.debitcard.m r4 = (p341ge.bog.mobilebank.products.presentation.details.debitcard.C34165m) r4
                    r2 = 0
                    if (r4 == 0) goto L_0x009b
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
                    if (r3 == 0) goto L_0x008a
                    ge.bog.mobilebank.products.presentation.details.debitcard.e$g r2 = p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e.C34100g.f82827a
                L_0x008a:
                    r17 = r2
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r22 = 61439(0xefff, float:8.6094E-41)
                    r23 = 0
                    ge.bog.mobilebank.products.presentation.details.debitcard.m r2 = p341ge.bog.mobilebank.products.presentation.details.debitcard.C34165m.m100546b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23)
                L_0x009b:
                    r1.mo4826r(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.debitcard.C34119g.C34146s.C34147a.mo82508a(java.util.List):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82508a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$s$b */
        static final class C34148b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C34119g f82976d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34148b(C34119g gVar) {
                super(1);
                this.f82976d = gVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C1644x gx = this.f82976d.f82882G;
                C34165m mVar = (C34165m) this.f82976d.f82882G.mo4814f();
                gx.mo4826r(mVar != null ? C34165m.m100546b(mVar, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, 0, 61439, (Object) null) : null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34146s(C34119g gVar) {
            super(1);
            this.f82974d = gVar;
        }

        /* renamed from: a */
        public final void mo82507a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34147a(this.f82974d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34148b(this.f82974d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82507a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$t */
    static final class C34149t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82977d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34149t(C34119g gVar) {
            super(1);
            this.f82977d = gVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "cardId");
            return this.f82977d.f82919k.mo92562a(l.longValue()).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$u */
    static final class C34150u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82978d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34150u(C34119g gVar) {
            super(1);
            this.f82978d = gVar;
        }

        /* renamed from: a */
        public final void mo82511a(CheckChildMBankActiveModel checkChildMBankActiveModel) {
            C34165m mVar;
            if (!checkChildMBankActiveModel.mo81929b()) {
                this.f82978d.f82932q0.set(checkChildMBankActiveModel);
                C34165m mVar2 = (C34165m) this.f82978d.f82882G.mo4814f();
                C1644x gx = this.f82978d.f82882G;
                if (mVar2 != null) {
                    mVar = C34165m.m100546b(mVar2, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, C34093e.C34098e.f82825a, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, 0, 65503, (Object) null);
                } else {
                    mVar = null;
                }
                gx.mo4826r(mVar);
                if (this.f82978d.f82876A) {
                    this.f82978d.f82876A = false;
                    this.f82978d.f82926n0.onNext("PARENT_PERMISSION");
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82511a((CheckChildMBankActiveModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$v */
    static final class C34151v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82979d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34151v(C34119g gVar) {
            super(1);
            this.f82979d = gVar;
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "serviceKey");
            C40749p O = this.f82979d.f82921l.mo92596a(str).mo95075O();
            C41536l.m120488h(O, "extServiceStatusUseCase(…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$w */
    static final class C34152w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82980d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$w$a */
        static final class C34153a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C34119g f82981d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34153a(C34119g gVar) {
                super(1);
                this.f82981d = gVar;
            }

            /* renamed from: a */
            public final void mo82514a(ExtServiceStatusApiModel extServiceStatusApiModel) {
                CheckChildMBankActiveModel checkChildMBankActiveModel = (CheckChildMBankActiveModel) this.f82981d.f82932q0.get();
                if (checkChildMBankActiveModel != null) {
                    C34119g gVar = this.f82981d;
                    if (C41536l.m120484d(extServiceStatusApiModel.getServiceStatus(), PensionStatusResult.STATUS_ACTIVE)) {
                        gVar.mo82434Us().mo4823o(C32343x.m95466m(checkChildMBankActiveModel));
                    } else if (C41536l.m120484d(extServiceStatusApiModel.getServiceStatus(), PensionStatusResult.STATUS_INACTIVE)) {
                        gVar.mo82431Gv().mo4823o(C32343x.m95466m(Long.valueOf(checkChildMBankActiveModel.mo81928a())));
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82514a((ExtServiceStatusApiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34152w(C34119g gVar) {
            super(1);
            this.f82980d = gVar;
        }

        /* renamed from: a */
        public final void mo82513a(C31128a aVar) {
            this.f82980d.mo82445lb().mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34153a(this.f82980d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82513a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$x */
    static final class C34154x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82982d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$x$a */
        static final class C34155a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C34119g f82983d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34155a(C34119g gVar) {
                super(1);
                this.f82983d = gVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                return this.f82983d.f82925n.mo91931o(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34154x(C34119g gVar) {
            super(1);
            this.f82982d = gVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "accKey");
            return C38862g0.m113673c(this.f82982d.f82913h, l.longValue(), false, 2, (Object) null).mo95075O().mo95026k0(new C34160i(new C34155a(this.f82982d)));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$y */
    static final class C34156y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34156y(C34119g gVar) {
            super(1);
            this.f82984d = gVar;
        }

        /* renamed from: a */
        public final void mo82517a(List list) {
            C34165m mVar;
            C1644x gx = this.f82984d.f82882G;
            C34165m mVar2 = (C34165m) gx.mo4814f();
            if (mVar2 != null) {
                List list2 = list;
                C41536l.m120488h(list2, "linkedDeposits");
                mVar = C34165m.m100546b(mVar2, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, (List) null, list2, (List) null, (List) null, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, 0, 65279, (Object) null);
            } else {
                mVar = null;
            }
            gx.mo4826r(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82517a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$z */
    static final class C34157z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34119g f82985d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.g$z$a */
        static final class C34158a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C34119g f82986d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34158a(C34119g gVar) {
                super(1);
                this.f82986d = gVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                return this.f82986d.f82925n.mo91932p(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34157z(C34119g gVar) {
            super(1);
            this.f82985d = gVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "accKey");
            return this.f82985d.f82911g.mo92568b(l.longValue()).mo95075O().mo95026k0(new C34161j(new C34158a(this.f82985d)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34119g(C25352k kVar, C38884p0 p0Var, C38864h hVar, C38868i0 i0Var, C38862g0 g0Var, C39879r rVar, C38879n nVar, C38855d dVar, C38900x xVar, C31658b bVar, C38399b bVar2, C26145c cVar, C25074c cVar2, C20292b bVar3, PreferencesApiManager preferencesApiManager, C19393b bVar4, C39497c cVar3, C38883p pVar, C39178b bVar5, C39177a aVar, C27494a aVar2, TargetEnvironment targetEnvironment, long j, boolean z) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C25352k kVar2 = kVar;
        C38884p0 p0Var2 = p0Var;
        C38864h hVar2 = hVar;
        C38868i0 i0Var2 = i0Var;
        C38862g0 g0Var2 = g0Var;
        C39879r rVar2 = rVar;
        C38879n nVar2 = nVar;
        C38855d dVar2 = dVar;
        C38900x xVar2 = xVar;
        C31658b bVar6 = bVar;
        C38399b bVar7 = bVar2;
        C26145c cVar4 = cVar;
        C25074c cVar5 = cVar2;
        C19393b bVar8 = bVar4;
        C41536l.m120489i(kVar2, "reloadProductsUseCase");
        C41536l.m120489i(p0Var2, "reloadCardsUseCase");
        C41536l.m120489i(hVar2, "getAccountsAndCardsUseCase");
        C41536l.m120489i(i0Var2, "getLinkedLoansByAccountKeyUseCase");
        C41536l.m120489i(g0Var2, "getLinkedDepositsByAccountKeyUseCase");
        C41536l.m120489i(rVar2, "getBonusesUseCase");
        C41536l.m120489i(nVar2, "getCardExtraDetailsUseCase");
        C41536l.m120489i(dVar2, "checkChildMBankActiveUseCase");
        C41536l.m120489i(xVar2, "extServiceStatusUseCase");
        C41536l.m120489i(bVar6, "startTMXProfilingUseCase");
        C41536l.m120489i(bVar7, "mapper");
        C41536l.m120489i(cVar4, "cardExtraDetailsModelMapper");
        C41536l.m120489i(cVar5, "getTransactions");
        C41536l.m120489i(bVar3, "getAppSettingByName");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(bVar4, "checkIfCardsAreAddedToWallet");
        C41536l.m120489i(cVar3, "cardsInsuranceBannerVisibilityUseCase");
        C41536l.m120489i(pVar, "getClosableAccountUseCase");
        C41536l.m120489i(bVar5, "getValidateAccountBeforeDeactivationUseCase");
        C41536l.m120489i(aVar, "getAccountDeactivationUseCase");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        C41536l.m120489i(targetEnvironment, "environment");
        this.f82905d = kVar2;
        this.f82907e = p0Var2;
        this.f82909f = hVar2;
        this.f82911g = i0Var2;
        this.f82913h = g0Var2;
        this.f82915i = rVar2;
        this.f82917j = nVar2;
        this.f82919k = dVar2;
        this.f82921l = xVar2;
        this.f82923m = bVar6;
        this.f82925n = bVar7;
        this.f82927o = cVar4;
        this.f82929p = cVar5;
        this.f82931q = bVar3;
        this.f82933r = preferencesApiManager;
        this.f82935s = bVar4;
        this.f82937t = cVar3;
        this.f82938u = pVar;
        this.f82939v = bVar5;
        this.f82940w = aVar;
        this.f82941x = aVar2;
        this.f82942y = targetEnvironment;
        this.f82943z = j;
        this.f82876A = z;
        C1644x xVar3 = new C1644x(new C34165m((C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, j, 32767, (DefaultConstructorMarker) null));
        this.f82882G = xVar3;
        this.f82883H = C1607m0.m5655c(xVar3, new C34134h(this));
        this.f82884I = new C1644x();
        this.f82885J = new C1644x();
        this.f82886K = new C1644x();
        this.f82887L = new C1644x();
        this.f82888M = new C1644x();
        this.f82889N = new C1644x();
        this.f82890O = new C1644x();
        this.f82891P = new C1644x();
        this.f82892Q = new C1644x();
        this.f82893R = new C1644x();
        this.f82894S = new C1644x();
        this.f82895T = new C1644x();
        this.f82896U = new C1644x();
        this.f82897V = new C1644x();
        this.f82898W = new C1644x();
        this.f82899X = new C1644x();
        this.f82900Y = new C1644x();
        this.f82901Z = new C1644x();
        this.f82902a0 = new C1644x();
        this.f82903b0 = new C1644x();
        this.f82904c0 = new C1644x();
        this.f82906d0 = new C1644x();
        this.f82908e0 = new C1644x();
        this.f82910f0 = new C1644x();
        this.f82912g0 = new C1644x(NewProductHeaderView.C13482a.COLOR);
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Long>()");
        this.f82914h0 = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Long>()");
        this.f82916i0 = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<ScaParamPair>()");
        this.f82918j0 = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Unit>()");
        this.f82920k0 = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<List<Long>>()");
        this.f82922l0 = h15;
        C40767b h16 = C40767b.m118210h1();
        C41536l.m120488h(h16, "create<Long>()");
        this.f82924m0 = h16;
        C40767b h17 = C40767b.m118210h1();
        C41536l.m120488h(h17, "create<String>()");
        this.f82926n0 = h17;
        C40767b h18 = C40767b.m118210h1();
        C41536l.m120488h(h18, "create<List<CardModel>>()");
        this.f82928o0 = h18;
        this.f82930p0 = new AtomicReference(-1L);
        this.f82932q0 = new AtomicReference();
        this.f82936s0 = new HashMap();
        C41205b F0 = C40749p.m118051n0(onInit().mo95026k0(new C37536l0(C34120a.f82944d)), onRefresh().mo95026k0(new C37540n0(C34122b.f82946d)), kVar.mo63917a().mo95026k0(new C37542o0(C34124c.f82949d)), p0Var.mo92582b().mo95026k0(new C37544p0(C34129d.f82958d))).mo94989L0(new C37546q0(new C34130e(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C37548r0(new C34132f(this)));
        C41536l.m120488h(F0, "merge(\n                o…accKey)\n                }");
        bindToLifecycle(F0);
        m100357ay();
        m100404ty();
        m100398qy();
        m100351Xx();
        m100411wy();
        m100384ky();
        m100392ny();
        m100372gy();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final Boolean m100323Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final Boolean m100324Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final Boolean m100325Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final Boolean m100326Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final C40754t m100327Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ix */
    private final C39938b0 m100328Ix(long j, String str, String str2, String str3, String str4) {
        Object obj;
        boolean z;
        C25846a aVar = this.f82879D;
        if (aVar == null) {
            C41536l.m120506z("accountsAndCards");
            aVar = null;
        }
        List list = (List) aVar.mo64629b().mo66048a().get(m100330Jx());
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
        return new C39938b0(BankApi.CARDS_GET_VIRTUAL_CARD_DETAILS, this.f82941x.mo66809a(new SCACardDetailsParams(String.valueOf(dVar.mo66030j()), dVar.mo66034n(), str, BankApi.CARDS_GET_VIRTUAL_CARD_DETAILS, str2, str3, str4)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Jx */
    public final Long m100330Jx() {
        C34165m mVar = (C34165m) this.f82882G.mo4814f();
        if (mVar != null) {
            return Long.valueOf(mVar.mo82537q());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: Rx */
    public final C38609c m100339Rx(C26374a aVar, C38609c cVar, C43064a aVar2) {
        if (!C41536l.m120484d(aVar.mo65578a(), "Y")) {
            return m100406ux(aVar.mo65579b());
        }
        if (aVar2 == null) {
            return cVar;
        }
        C41238w wVar = (C41238w) aVar2.invoke();
        return cVar;
    }

    /* renamed from: Sx */
    static /* synthetic */ C38609c m100341Sx(C34119g gVar, C26374a aVar, C38609c cVar, C43064a aVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar2 = null;
        }
        return gVar.m100339Rx(aVar, cVar, aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tx */
    public final boolean m100343Tx() {
        return this.f82933r.deviceCanSupportGooglePay() && C20101a.f54724a.mo48497a(this.f82931q);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ux */
    public static final C38609c m100345Ux(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38609c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vx */
    public static final C38609c m100347Vx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38609c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Wx */
    public final void m100349Wx(long j) {
        Object obj;
        Object obj2;
        C34093e.C34095b bVar;
        C26150c cVar;
        C1644x xVar;
        C34165m mVar;
        Object obj3;
        List list;
        double d;
        boolean z;
        C34093e.C34097d dVar;
        BigDecimal g;
        boolean z2;
        boolean z3;
        long j2 = j;
        C25846a aVar = this.f82879D;
        C25846a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("accountsAndCards");
            aVar = null;
        }
        Iterator it = aVar.mo64628a().mo65188a().mo65182a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C26148a) obj).mo65087b() == j2) {
                z3 = true;
                continue;
            } else {
                z3 = false;
                continue;
            }
            if (z3) {
                break;
            }
        }
        C26148a aVar3 = (C26148a) obj;
        C25846a aVar4 = this.f82879D;
        if (aVar4 == null) {
            C41536l.m120506z("accountsAndCards");
            aVar4 = null;
        }
        Iterator it2 = aVar4.mo64628a().mo65189b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((C26150c) obj2).mo65121b() == j2) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C41536l.m120486f(obj2);
        C26150c cVar2 = (C26150c) obj2;
        if (aVar3 != null) {
            bVar = new C34093e.C34095b(aVar3.mo65111w());
        } else {
            bVar = null;
        }
        C1644x xVar2 = this.f82882G;
        C34165m mVar2 = (C34165m) xVar2.mo4814f();
        if (mVar2 != null) {
            C38399b bVar2 = this.f82925n;
            if (aVar3 != null) {
                list = aVar3.mo65114z();
            } else {
                list = null;
            }
            if (aVar3 == null || (g = aVar3.mo65093g()) == null) {
                d = 0.0d;
            } else {
                d = g.doubleValue();
            }
            if (d > Utils.DOUBLE_EPSILON) {
                z = true;
            } else {
                z = false;
            }
            C34093e.C34108o b = bVar2.mo91922b(list, j, z, this.f82880E, C20101a.f54724a.mo48499c(this.f82931q));
            C38399b bVar3 = this.f82925n;
            C25846a aVar5 = this.f82879D;
            if (aVar5 == null) {
                C41536l.m120506z("accountsAndCards");
                aVar5 = null;
            }
            C34093e.C34094a a = bVar3.mo91921a((List) aVar5.mo64629b().mo66048a().get(Long.valueOf(j)));
            if (!this.f82937t.mo93142b(j2)) {
                C38399b bVar4 = this.f82925n;
                C25846a aVar6 = this.f82879D;
                if (aVar6 == null) {
                    C41536l.m120506z("accountsAndCards");
                    aVar6 = null;
                }
                dVar = bVar4.mo91930n((List) aVar6.mo64629b().mo66048a().get(Long.valueOf(j)));
            } else {
                dVar = null;
            }
            List q = this.f82925n.mo91933q(cVar2.mo65137p());
            C38399b bVar5 = this.f82925n;
            C25846a aVar7 = this.f82879D;
            if (aVar7 == null) {
                C41536l.m120506z("accountsAndCards");
                aVar7 = null;
            }
            cVar = cVar2;
            mVar = C34165m.m100546b(mVar2, (C34093e.C34115v) null, bVar, b, a, dVar, (C34093e.C34098e) null, (List) null, this.f82925n.mo91925e(this.f82881F, j2), (List) null, bVar5.mo91926f(aVar7.mo64628a().mo65190c(), cVar2), q, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, j, 6465, (Object) null);
            xVar = xVar2;
        } else {
            cVar = cVar2;
            xVar = xVar2;
            mVar = null;
        }
        xVar.mo4826r(mVar);
        C25846a aVar8 = this.f82879D;
        if (aVar8 == null) {
            C41536l.m120506z("accountsAndCards");
            aVar8 = null;
        }
        List list2 = (List) aVar8.mo64629b().mo66048a().get(m100330Jx());
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (((C26765d) obj3).mo66018W()) {
                    break;
                }
            }
            C26765d dVar2 = (C26765d) obj3;
            if (dVar2 != null) {
                this.f82924m0.onNext(Long.valueOf(dVar2.mo66030j()));
            }
        }
        this.f82914h0.onNext(Long.valueOf(j));
        this.f82916i0.onNext(Long.valueOf(j));
        if (!cVar.mo65143u()) {
            C40767b bVar6 = this.f82922l0;
            List<C26153f> q2 = cVar.mo65138q();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(q2, 10));
            for (C26153f a2 : q2) {
                arrayList.add(Long.valueOf(a2.mo65165a()));
            }
            bVar6.onNext(arrayList);
        }
        C40767b bVar7 = this.f82928o0;
        C25846a aVar9 = this.f82879D;
        if (aVar9 == null) {
            C41536l.m120506z("accountsAndCards");
        } else {
            aVar2 = aVar9;
        }
        List list3 = (List) aVar2.mo64629b().mo66048a().get(Long.valueOf(j));
        if (list3 == null) {
            list3 = C41341q.m119907j();
        }
        bVar7.onNext(list3);
        C1644x wx = mo82452tm();
        NewProductHeaderView.C13482a aVar10 = (NewProductHeaderView.C13482a) this.f82936s0.get(Long.valueOf(j));
        if (aVar10 != null) {
            wx.mo4823o(aVar10);
        }
    }

    /* renamed from: Xx */
    private final void m100351Xx() {
        C40749p Q = this.f82920k0.mo94998Q(new C37558w0(new C34138k(this)));
        C41536l.m120488h(Q, "private fun subscribeToB…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C37560x0(new C34139l(this)));
        C41536l.m120488h(F0, "private fun subscribeToB…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Yx */
    public static final C40754t m100353Yx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zx */
    public static final void m100355Zx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ay */
    private final void m100357ay() {
        C41205b G0 = this.f82918j0.mo94998Q(new C37513a1(new C34140m(this))).mo95027o0(C40992a.m118827a()).mo94980F(new C37516b1(new C34141n(this))).mo94983G0(new C37518c0(new C34142o(this)), new C37520d0(new C34143p(this)));
        C41536l.m120488h(G0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(G0);
    }

    /* access modifiers changed from: private */
    /* renamed from: cy */
    public static final C40754t m100360cy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: dy */
    public static final void m100363dy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ey */
    public static final void m100366ey(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: fy */
    public static final void m100369fy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: gy */
    private final void m100372gy() {
        C41205b F0 = this.f82928o0.mo95026k0(new C37522e0(new C34144q(this.f82925n))).mo94989L0(new C37524f0(new C34145r(this))).mo94981F0(new C37526g0(new C34146s(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: hy */
    public static final void m100375hy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iy */
    public static final List m100378iy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jy */
    public static final C40754t m100381jy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: ky */
    private final void m100384ky() {
        C40749p Q = this.f82924m0.mo94998Q(new C37554u0(new C34149t(this)));
        C41536l.m120488h(Q, "private fun subscribeToC…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C37556v0(new C34150u(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ly */
    public static final C40754t m100387ly(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: my */
    public static final void m100390my(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ny */
    private final void m100392ny() {
        C40749p Q = this.f82926n0.mo94998Q(new C37562y0(new C34151v(this)));
        C41536l.m120488h(Q, "private fun subscribeToE…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C37564z0(new C34152w(this)));
        C41536l.m120488h(F0, "private fun subscribeToE…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: oy */
    public static final C40754t m100394oy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: py */
    public static final void m100396py(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: qy */
    private final void m100398qy() {
        C41205b F0 = this.f82916i0.mo94998Q(new C37532j0(new C34154x(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C37534k0(new C34156y(this)));
        C41536l.m120488h(F0, "private fun subscribeToL…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ry */
    public static final C40754t m100400ry(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sy */
    public static final void m100402sy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ty */
    private final void m100404ty() {
        C41205b F0 = this.f82914h0.mo94998Q(new C37515b0(new C34157z(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C37538m0(new C34121a0(this)));
        C41536l.m120488h(F0, "private fun subscribeToL…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: ux */
    private final C38609c m100406ux(List list) {
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
            return new C38609c.C38614e(C32343x.m95388F(bVar2.mo65583b(), new Object[0]), m100330Jx());
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

    /* access modifiers changed from: private */
    /* renamed from: uy */
    public static final C40754t m100407uy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vy */
    public static final void m100409vy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: wy */
    private final void m100411wy() {
        Calendar instance = Calendar.getInstance();
        instance.add(2, -3);
        C41205b F0 = this.f82922l0.mo94998Q(new C37528h0(new C34123b0(this, instance))).mo95027o0(C40992a.m118827a()).mo94981F0(new C37530i0(new C34125c0(this)));
        C41536l.m120488h(F0, "private fun subscribeToT…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: xy */
    public static final C40754t m100413xy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yy */
    public static final void m100415yy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ax */
    public C1644x mo82430Fj() {
        return this.f82903b0;
    }

    /* renamed from: Bb */
    public void mo38217Bb(long j, int i, int i2) {
        mo82436W0().mo4826r(C32343x.m95466m(new C38607a(j, i2, i)));
    }

    /* renamed from: Bc */
    public void mo82359Bc() {
        Long Jx = m100330Jx();
        if (Jx != null) {
            C37224b.m109965d(mo82449p2(), Long.valueOf(Jx.longValue()));
        }
        C34162k.m100542d(C10457a.f29782c);
    }

    /* renamed from: Bx */
    public C1644x mo82449p2() {
        return this.f82906d0;
    }

    /* renamed from: Cx */
    public C1644x mo82448o() {
        return this.f82897V;
    }

    /* renamed from: D2 */
    public void mo82360D2(String str, String str2, String str3) {
        Object obj = this.f82930p0.get();
        C41536l.m120488h(obj, "lastClickedCardId.get()");
        C39938b0 Ix = m100328Ix(((Number) obj).longValue(), this.f82934r0, str, str2, str3);
        if (Ix != null) {
            this.f82918j0.onNext(Ix);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: m70.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: D9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo82361D9(long r10) {
        /*
            r9 = this;
            ck.g r0 = iu0.C36546y.m108282F()
            java.lang.String r1 = ""
            java.lang.String r2 = "others_account_transfer_click"
            java.lang.String r3 = "accounts_page"
            r0.mo27152s(r3, r1, r2)
            l70.a r0 = r9.f82879D
            r1 = 0
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "accountsAndCards"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x0018:
            m70.i r0 = r0.mo64628a()
            m70.h r0 = r0.mo65188a()
            java.util.List r0 = r0.mo65182a()
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r2 = r0.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r0.next()
            r5 = r2
            m70.a r5 = (m70.C26148a) r5
            long r5 = r5.mo65087b()
            java.lang.Long r7 = r9.m100330Jx()
            if (r7 != 0) goto L_0x0042
            goto L_0x004c
        L_0x0042:
            long r7 = r7.longValue()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x004c
            r5 = r3
            goto L_0x004d
        L_0x004c:
            r5 = r4
        L_0x004d:
            if (r5 == 0) goto L_0x0028
            r1 = r2
        L_0x0050:
            m70.a r1 = (m70.C26148a) r1
            if (r1 == 0) goto L_0x0063
            java.util.List r0 = r1.mo65114z()
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = "P2P_PAYMENT_O"
            boolean r0 = r0.contains(r1)
            if (r0 != r3) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r3 = r4
        L_0x0064:
            androidx.lifecycle.x r0 = r9.mo82443j6()
            he1.m r1 = new he1.m
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r1.<init>(r10, r11)
            m41.a r10 = g91.C32343x.m95466m(r1)
            r0.mo4826r(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.debitcard.C34119g.mo82361D9(long):void");
    }

    /* renamed from: Dx */
    public C1644x mo82450q0() {
        return this.f82910f0;
    }

    /* renamed from: Ei */
    public void mo82362Ei(long j) {
        C34165m mVar;
        C1644x xVar = this.f82882G;
        C34165m mVar2 = (C34165m) xVar.mo4814f();
        if (mVar2 != null) {
            mVar = C34165m.m100546b(mVar2, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, 0, 61439, (Object) null);
        } else {
            mVar = null;
        }
        xVar.mo4826r(mVar);
        this.f82933r.setHideGooglePayBannerForAccount(m100330Jx());
    }

    /* renamed from: Ex */
    public C1644x mo82435Vo() {
        return this.f82904c0;
    }

    /* renamed from: Fp */
    public void mo82459Fp(long j) {
        C40762x A = C32343x.m95465l1(this.f82939v.mo92824a(j)).mo95062A(new C37550s0(new C34135i(this, j)));
        C41536l.m120488h(A, "override fun onCloseAcco…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C31270e.m92880i(A, -1), mo82433O2()));
    }

    /* renamed from: Fx */
    public C1644x mo82440c1() {
        return this.f82896U;
    }

    /* renamed from: G0 */
    public void mo82363G0() {
        C34093e.C34097d dVar;
        List a;
        CardInsSecCardModel d;
        C36546y.m108282F().mo27152s("accounts_page", "", "card_insurance_offer_click");
        C34165m mVar = (C34165m) this.f82882G.mo4814f();
        if (mVar != null) {
            dVar = mVar.mo82523e();
        } else {
            dVar = null;
        }
        if (dVar != null && (a = dVar.mo82383a()) != null) {
            if (a.size() > 1) {
                mo82439c0().mo4826r(C32343x.m95466m(dVar));
            } else if (a.size() == 1 && (d = ((CardUiModel) a.get(0)).mo82610d()) != null) {
                mo82448o().mo4826r(C32343x.m95466m(d));
            }
        }
    }

    /* renamed from: Gx */
    public final C34118f mo82461Gx() {
        return this.f82878C;
    }

    /* renamed from: Hx */
    public C1644x mo82428Bl() {
        return this.f82887L;
    }

    /* renamed from: J8 */
    public void mo82364J8(NewProductHeaderView.C13482a aVar) {
        C41536l.m120489i(aVar, "headerType");
        Long Jx = m100330Jx();
        if (Jx != null) {
            this.f82936s0.put(Long.valueOf(Jx.longValue()), aVar);
            mo82452tm().mo4823o(aVar);
        }
    }

    /* renamed from: Jm */
    public void mo82365Jm(long j) {
        C36546y.m108282F().mo27152s("accounts_page", "", "Requisites_download_click");
        mo82428Bl().mo4826r(C32343x.m95466m(Long.valueOf(j)));
    }

    /* renamed from: Kx */
    public C1644x mo82434Us() {
        return this.f82901Z;
    }

    /* renamed from: L9 */
    public void mo38227L9() {
    }

    /* renamed from: Lx */
    public C1644x mo82431Gv() {
        return this.f82902a0;
    }

    /* renamed from: M7 */
    public void mo82366M7() {
        C34165m mVar;
        long j;
        C1644x xVar = this.f82882G;
        C34165m mVar2 = (C34165m) xVar.mo4814f();
        if (mVar2 != null) {
            mVar = C34165m.m100546b(mVar2, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, 0, 65519, (Object) null);
        } else {
            mVar = null;
        }
        xVar.mo4826r(mVar);
        C39497c cVar = this.f82937t;
        Long Jx = m100330Jx();
        if (Jx != null) {
            j = Jx.longValue();
        } else {
            j = this.f82943z;
        }
        cVar.mo93141a(j);
    }

    /* renamed from: Mx */
    public C1644x mo82439c0() {
        return this.f82889N;
    }

    /* renamed from: N7 */
    public void mo38230N7(AccountOperation accountOperation) {
        C41536l.m120489i(accountOperation, "accountOperation");
        mo82440c1().mo4826r(C32343x.m95466m(accountOperation));
    }

    /* renamed from: Nx */
    public C1644x mo82438Y() {
        return this.f82886K;
    }

    /* renamed from: Ox */
    public C1644x mo82451ss() {
        return this.f82898W;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: m70.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: P9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38232P9() {
        /*
            r7 = this;
            ck.g r0 = iu0.C36546y.m108282F()
            java.lang.String r1 = ""
            java.lang.String r2 = "statement_download_click"
            java.lang.String r3 = "accounts_page"
            r0.mo27152s(r3, r1, r2)
            l70.a r0 = r7.f82879D
            r1 = 0
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "accountsAndCards"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x0018:
            m70.i r0 = r0.mo64628a()
            m70.h r0 = r0.mo65188a()
            java.util.List r0 = r0.mo65182a()
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            r3 = r2
            m70.a r3 = (m70.C26148a) r3
            long r3 = r3.mo65087b()
            java.lang.Long r5 = r7.m100330Jx()
            if (r5 != 0) goto L_0x0040
            goto L_0x004a
        L_0x0040:
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x004a
            r3 = 1
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x0028
            r1 = r2
        L_0x004e:
            m70.a r1 = (m70.C26148a) r1
            if (r1 == 0) goto L_0x0065
            androidx.lifecycle.x r0 = r7.mo82438Y()
            long r1 = r1.mo65087b()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            m41.a r1 = g91.C32343x.m95466m(r1)
            r0.mo4826r(r1)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.debitcard.C34119g.mo38232P9():void");
    }

    /* renamed from: Px */
    public C1644x mo82446m4() {
        return this.f82884I;
    }

    /* renamed from: Q0 */
    public void mo38233Q0(long j, int i) {
        C34093e.C34115v vVar;
        m100349Wx(j);
        C34165m mVar = (C34165m) this.f82882G.mo4814f();
        if (mVar != null) {
            vVar = mVar.mo82536p();
        } else {
            vVar = null;
        }
        if (vVar != null) {
            vVar.mo82425c(i);
        }
    }

    /* renamed from: Qx */
    public C1644x mo82443j6() {
        return this.f82885J;
    }

    /* renamed from: Rm */
    public void mo82367Rm() {
        Long Jx = m100330Jx();
        if (Jx != null) {
            NewProductHeaderView.C13482a aVar = (NewProductHeaderView.C13482a) this.f82936s0.get(Long.valueOf(Jx.longValue()));
            if (aVar != null) {
                mo82452tm().mo4823o(aVar);
            }
        }
    }

    /* renamed from: Ss */
    public void mo70818Ss() {
        C34093e.C34115v p;
        List a;
        Iterable F0;
        Object obj;
        boolean z;
        C36546y.m108282F().mo27152s("accounts_page", "", "see_all_transactions_click");
        C34165m mVar = (C34165m) this.f82882G.mo4814f();
        if (mVar != null && (p = mVar.mo82536p()) != null && (a = p.mo82423a()) != null && (F0 = C41358y.m119995F0(a)) != null) {
            Iterator it = F0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long a2 = ((C30483b) ((C41324h0) obj).mo95946d()).mo70820a();
                Long Jx = m100330Jx();
                if (Jx != null && a2 == Jx.longValue()) {
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
                mo82444l2().mo4826r(C32343x.m95466m(Long.valueOf(((C30483b) h0Var.mo95946d()).mo70820a())));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: m70.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: m70.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: m70.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: m70.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Tl */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70819Tl() {
        /*
            r7 = this;
            l70.a r0 = r7.f82879D
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "accountsAndCards"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            m70.i r0 = r0.mo64628a()
            java.util.List r0 = r0.mo65189b()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r0.next()
            r3 = r2
            m70.c r3 = (m70.C26150c) r3
            long r3 = r3.mo65121b()
            java.lang.Long r5 = r7.m100330Jx()
            if (r5 != 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0039
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x0017
            r1 = r2
        L_0x003d:
            m70.c r1 = (m70.C26150c) r1
            if (r1 == 0) goto L_0x0071
            ee1.b r0 = r7.f82922l0
            java.util.List r1 = r1.mo65138q()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = ie1.C41343r.m119925u(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0056:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x006e
            java.lang.Object r3 = r1.next()
            m70.f r3 = (m70.C26153f) r3
            long r3 = r3.mo65165a()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.add(r3)
            goto L_0x0056
        L_0x006e:
            r0.onNext(r2)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.debitcard.C34119g.mo70819Tl():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: m70.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: m70.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: m70.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: m70.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Um */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo82368Um() {
        /*
            r7 = this;
            l70.a r0 = r7.f82879D
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "accountsAndCards"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            m70.i r0 = r0.mo64628a()
            java.util.List r0 = r0.mo65189b()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0034
            java.lang.Object r2 = r0.next()
            r3 = r2
            m70.c r3 = (m70.C26150c) r3
            long r3 = r3.mo65121b()
            long r5 = r7.f82943z
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x0017
            r1 = r2
        L_0x0034:
            m70.c r1 = (m70.C26150c) r1
            if (r1 == 0) goto L_0x0047
            androidx.lifecycle.x r0 = r7.mo82429F7()
            java.lang.String r1 = r1.mo65123d()
            m41.a r1 = g91.C32343x.m95466m(r1)
            r0.mo4826r(r1)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.debitcard.C34119g.mo82368Um():void");
    }

    /* renamed from: Xi */
    public void mo82369Xi() {
        CheckChildMBankActiveModel checkChildMBankActiveModel = (CheckChildMBankActiveModel) this.f82932q0.get();
        if (checkChildMBankActiveModel != null) {
            mo82434Us().mo4823o(C32343x.m95466m(checkChildMBankActiveModel));
        }
    }

    /* renamed from: Xt */
    public void mo82470Xt(long j) {
        C40762x A = C32343x.m95465l1(this.f82940w.mo92823a(j)).mo95062A(new C37552t0(new C34136j(this)));
        C41536l.m120488h(A, "override fun onConfirmCl…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C31270e.m92880i(A, -1), mo82433O2()));
    }

    /* renamed from: a1 */
    public void mo82370a1(long j) {
        C36546y.m108282F().mo27152s("accounts_page", "", "debit_card_click");
        Long Jx = m100330Jx();
        if (Jx != null) {
            mo82453x2().mo4826r(new C37223a(new C41224m(Long.valueOf(j), Long.valueOf(Jx.longValue()))));
        }
    }

    /* renamed from: as */
    public void mo38239as() {
    }

    /* renamed from: d1 */
    public void mo82371d1() {
        Long Jx = m100330Jx();
        if (Jx != null) {
            long longValue = Jx.longValue();
            C36546y.m108282F().mo27152s("accounts_page", "", "additional_functions_click");
            mo82441fk().mo4826r(C32343x.m95466m(Long.valueOf(longValue)));
        }
    }

    /* renamed from: j */
    public LiveData mo82442j() {
        return this.f82883H;
    }

    /* renamed from: l1 */
    public void mo82372l1(long j) {
        bindToLifecycle(this.f82923m.mo72084b(TMXFlags.TMX_FLAG_CARD_INFO_KEY));
        C36546y.m108282F().mo27152s("accounts_page", "", "debit_card_details_click");
        this.f82930p0.set(Long.valueOf(j));
        C39938b0 Ix = m100328Ix(j, C10146d0.C10177h.m37232a(), (String) null, (String) null, (String) null);
        if (Ix != null) {
            mo82437W2().mo4826r(new C37223a(Ix));
        }
    }

    /* renamed from: m0 */
    public void mo82373m0() {
        Object obj;
        boolean z;
        C32343x.m95501z0(this, "accounts_page", "", "select_p2p_topup");
        C25846a aVar = this.f82879D;
        String str = null;
        if (aVar == null) {
            C41536l.m120506z("accountsAndCards");
            aVar = null;
        }
        Iterator it = aVar.mo64628a().mo65188a().mo65182a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long b = ((C26148a) obj).mo65087b();
            Long Jx = m100330Jx();
            if (Jx != null && b == Jx.longValue()) {
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
        C26148a aVar2 = (C26148a) obj;
        C1644x Dx = mo82450q0();
        if (aVar2 != null) {
            str = aVar2.mo65111w();
        }
        Dx.mo4823o(new C37223a(str));
    }

    /* renamed from: mb */
    public void mo82374mb() {
        C34165m mVar;
        C34165m mVar2 = (C34165m) this.f82882G.mo4814f();
        C1644x xVar = this.f82882G;
        if (mVar2 != null) {
            mVar = C34165m.m100546b(mVar2, (C34093e.C34115v) null, (C34093e.C34095b) null, (C34093e.C34108o) null, (C34093e.C34094a) null, (C34093e.C34097d) null, (C34093e.C34098e) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (C34093e.C34100g) null, (Boolean) null, (Boolean) null, 0, 65503, (Object) null);
        } else {
            mVar = null;
        }
        xVar.mo4826r(mVar);
    }

    /* renamed from: ne */
    public void mo38245ne() {
    }

    /* renamed from: nx */
    public C1644x mo82444l2() {
        return this.f82895T;
    }

    /* renamed from: ol */
    public void mo82375ol(String str, String str2) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        C41536l.m120489i(str2, "fileId");
        C1644x Ex = mo82435Vo();
        String rbMiddleware = this.f82942y.getRbMiddleware();
        String populateUrlWithExtraData = RetrofitClient.populateUrlWithExtraData(rbMiddleware + "?" + str);
        C37224b.m109965d(Ex, C41233s.m119492a(populateUrlWithExtraData, "agreement-" + str2 + ".pdf"));
    }

    /* renamed from: ox */
    public C1644x mo82432M1() {
        return this.f82893R;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: o70.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: o70.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: o70.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: o70.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo82376p1(long r10) {
        /*
            r9 = this;
            ck.g r0 = iu0.C36546y.m108282F()
            java.lang.String r1 = "debit_card_activation_click"
            java.lang.String r2 = "accounts_page"
            java.lang.String r3 = ""
            r0.mo27152s(r2, r3, r1)
            java.lang.Long r0 = r9.m100330Jx()
            if (r0 == 0) goto L_0x0075
            long r0 = r0.longValue()
            androidx.lifecycle.x r2 = r9.mo82432M1()
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            l70.a r5 = r9.f82879D
            r6 = 0
            if (r5 != 0) goto L_0x002a
            java.lang.String r5 = "accountsAndCards"
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r5 = r6
        L_0x002a:
            o70.e r5 = r5.mo64629b()
            java.util.Map r5 = r5.mo66048a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r5.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0069
            java.util.Iterator r0 = r0.iterator()
        L_0x0042:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            r5 = r1
            o70.d r5 = (o70.C26765d) r5
            long r7 = r5.mo66030j()
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0059
            r5 = 1
            goto L_0x005a
        L_0x0059:
            r5 = 0
        L_0x005a:
            if (r5 == 0) goto L_0x0042
            r6 = r1
        L_0x005d:
            o70.d r6 = (o70.C26765d) r6
            if (r6 == 0) goto L_0x0069
            java.lang.String r10 = r6.mo66034n()
            if (r10 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r3 = r10
        L_0x0069:
            he1.m r10 = new he1.m
            r10.<init>(r4, r3)
            m41.a r10 = g91.C32343x.m95466m(r10)
            r2.mo4826r(r10)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.debitcard.C34119g.mo82376p1(long):void");
    }

    /* renamed from: px */
    public C1644x mo82453x2() {
        return this.f82891P;
    }

    /* renamed from: qk */
    public void mo82377qk() {
        this.f82926n0.onNext("PARENT_PERMISSION");
    }

    /* renamed from: qx */
    public C1644x mo82447n2() {
        return this.f82894S;
    }

    /* renamed from: rx */
    public C1644x mo82437W2() {
        return this.f82892Q;
    }

    /* renamed from: sx */
    public C1644x mo82445lb() {
        return this.f82900Y;
    }

    /* renamed from: tc */
    public void mo82378tc(long j, double d) {
        mo82451ss().mo4826r(C32343x.m95466m(new C41224m(Long.valueOf(j), String.valueOf(d))));
    }

    /* renamed from: tl */
    public void mo82379tl(long j) {
        C36546y.m108282F().mo27152s("accounts_page", "", "own_account_transfer_click");
        mo82446m4().mo4826r(C32343x.m95466m(Long.valueOf(j)));
    }

    /* renamed from: tx */
    public C1644x mo82433O2() {
        return this.f82908e0;
    }

    /* renamed from: vx */
    public C1644x mo82429F7() {
        return this.f82899X;
    }

    /* renamed from: wl */
    public void mo82380wl(C34093e.C34105l lVar) {
        C41536l.m120489i(lVar, "item");
        mo82430Fj().mo4823o(C32343x.m95466m(lVar));
    }

    /* renamed from: wx */
    public C1644x mo82452tm() {
        return this.f82912g0;
    }

    /* renamed from: xx */
    public final C34092d mo82480xx() {
        return this.f82877B;
    }

    /* renamed from: yx */
    public C1644x mo82436W0() {
        return this.f82888M;
    }

    /* renamed from: zx */
    public C1644x mo82441fk() {
        return this.f82890O;
    }
}

package oc0;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32303f;
import g91.C32319m;
import g91.C32343x;
import gc0.C20792a;
import gc0.C20794c;
import gc0.C20799d;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import ky0.C37015b;
import ky0.C37016c;
import ky0.C37017d;
import m41.C37224b;
import ny0.C37500b;
import ny0.C37505g;
import ny0.C37509j;
import o21.C37586a;
import p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalInsufficientAmountException;
import p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel;
import p603si.C17799b;
import ue1.C43075l;

/* renamed from: oc0.f */
public final class C26926f implements C26921a, C26922b {

    /* renamed from: A */
    private static final DecimalFormat f67679A;

    /* renamed from: y */
    public static final C26927a f67680y = new C26927a((DefaultConstructorMarker) null);

    /* renamed from: z */
    static final /* synthetic */ C40303i[] f67681z = {C41520a0.m120439e(new C41539o(C26926f.class, "inputData", "getInputData()Lge/bog/mobilebank/deposits/presentation/model/input/savinggoals/SavingGoalInput;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C37015b f67682d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C37017d f67683e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C37016c f67684f;

    /* renamed from: g */
    private final C41204a f67685g = new C41204a();

    /* renamed from: h */
    private final C26921a f67686h = this;

    /* renamed from: i */
    private final C26922b f67687i = this;

    /* renamed from: j */
    private final C1644x f67688j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f67689k = new C1644x();

    /* renamed from: l */
    private final C1644x f67690l = new C1644x();

    /* renamed from: m */
    private final C1644x f67691m = new C1644x();

    /* renamed from: n */
    private final C1644x f67692n = new C1644x();

    /* renamed from: o */
    private final C1644x f67693o = new C1644x();

    /* renamed from: p */
    private final C1644x f67694p = new C1644x();

    /* renamed from: q */
    private final C1644x f67695q = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1644x f67696r = new C1644x();

    /* renamed from: s */
    private final C41555e f67697s;

    /* renamed from: t */
    private final List f67698t;

    /* renamed from: u */
    private final List f67699u;

    /* renamed from: v */
    private final C40767b f67700v;

    /* renamed from: w */
    private final C40767b f67701w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C37500b f67702x;

    /* renamed from: oc0.f$a */
    public static final class C26927a {
        private C26927a() {
        }

        public /* synthetic */ C26927a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: oc0.f$b */
    public static final class C26928b extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C26926f f67703a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26928b(Object obj, C26926f fVar) {
            super(obj);
            this.f67703a = fVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C20799d dVar = (C20799d) obj;
            this.f67703a.m83729t((C20799d) obj2);
        }
    }

    /* renamed from: oc0.f$c */
    static final class C26929c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26926f f67704d;

        /* renamed from: oc0.f$c$a */
        static final class C26930a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26926f f67705d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26930a(C26926f fVar) {
                super(1);
                this.f67705d = fVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                this.f67705d.f67689k.mo4823o(new C20792a(this.f67705d.m83727r().mo49410g(), false, false, 6, (DefaultConstructorMarker) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26929c(C26926f fVar) {
            super(1);
            this.f67704d = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m83757d(C26926f fVar) {
            C41536l.m120489i(fVar, "this$0");
            C37224b.m109962a(fVar.f67696r);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m83758e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "it");
            C40734b p = this.f67704d.f67684f.mo89939a(l.longValue()).mo94902o(new C26934g(this.f67704d)).mo94903p(new C26935h(new C26930a(this.f67704d)));
            C41536l.m120488h(p, "private fun subscribeToD… .bindToLifecycle()\n    }");
            return C31270e.m92878g(p, -1);
        }
    }

    /* renamed from: oc0.f$d */
    static final class C26931d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26926f f67706d;

        /* renamed from: oc0.f$d$a */
        static final class C26932a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C37509j f67707d;

            /* renamed from: e */
            final /* synthetic */ C26926f f67708e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26932a(C37509j jVar, C26926f fVar) {
                super(1);
                this.f67707d = jVar;
                this.f67708e = fVar;
            }

            /* renamed from: a */
            public final void mo66223a(C41205b bVar) {
                Double c = this.f67707d.mo90731c();
                if (c != null) {
                    C26926f fVar = this.f67708e;
                    double doubleValue = c.doubleValue();
                    C37500b f = fVar.f67702x;
                    if (f != null && doubleValue <= f.mo90672g()) {
                        throw SavingGoalInsufficientAmountException.f60702d;
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo66223a((C41205b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: oc0.f$d$b */
        static final class C26933b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26926f f67709d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26933b(C26926f fVar) {
                super(1);
                this.f67709d = fVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                this.f67709d.f67689k.mo4823o(new C20792a(this.f67709d.m83727r().mo49410g(), false, false, 6, (DefaultConstructorMarker) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26931d(C26926f fVar) {
            super(1);
            this.f67706d = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final void m83764f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final void m83765g(C26926f fVar) {
            C41536l.m120489i(fVar, "this$0");
            C37224b.m109962a(fVar.f67696r);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final void m83766h(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final Boolean m83767i(C37509j jVar) {
            boolean z;
            C41536l.m120489i(jVar, "$params");
            if (jVar.mo90733e() == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: e */
        public final C40754t invoke(C37509j jVar) {
            C40734b bVar;
            C41536l.m120489i(jVar, "params");
            if (jVar.mo90733e() != null) {
                bVar = this.f67706d.f67683e.mo89940a(jVar.mo90733e(), jVar.mo90735f(), jVar.mo90731c(), jVar.mo90737h(), jVar.mo90732d(), jVar.mo90736g(), jVar.mo90729a(), jVar.mo90730b());
            } else {
                bVar = this.f67706d.f67682d.mo89938a(jVar.mo90739i(), jVar.mo90735f(), jVar.mo90731c(), jVar.mo90737h(), jVar.mo90732d(), jVar.mo90736g(), jVar.mo90729a(), jVar.mo90730b());
            }
            C40762x L = bVar.mo94904r(new C26936i(new C26932a(jVar, this.f67706d))).mo94902o(new C26937j(this.f67706d)).mo94903p(new C26938k(new C26933b(this.f67706d))).mo94892L(new C26939l(jVar));
            C41536l.m120488h(L, "private fun subscribeToS… .bindToLifecycle()\n    }");
            return C31270e.m92880i(L, -1);
        }
    }

    static {
        DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance();
        instance.setGroupingSeparator(',');
        instance.setDecimalSeparator('.');
        f67679A = new DecimalFormat("#.##", instance);
    }

    public C26926f(C37015b bVar, C37017d dVar, C37016c cVar) {
        C41536l.m120489i(bVar, "createSavingGoal");
        C41536l.m120489i(dVar, "editSavingGoal");
        C41536l.m120489i(cVar, "deleteSavingGoal");
        this.f67682d = bVar;
        this.f67683e = dVar;
        this.f67684f = cVar;
        C41551a aVar = C41551a.f97718a;
        this.f67697s = new C26928b(new C20799d((C20794c.C20798d) null, (C20794c.C20798d) null, (C20794c.C20795a) null, (C20794c.C20797c) null, 15, (DefaultConstructorMarker) null), this);
        this.f67698t = new ArrayList();
        this.f67699u = new ArrayList();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<SaveSavingGoalParams>()");
        this.f67700v = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Long>()");
        this.f67701w = h12;
    }

    /* renamed from: A */
    private final void m83711A() {
        C40749p L0 = this.f67700v.mo94989L0(new C26924d(new C26931d(this)));
        C41536l.m120488h(L0, "private fun subscribeToS… .bindToLifecycle()\n    }");
        m83725m(C31270e.m92876e(L0, this.f67695q));
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final C40754t m83712B(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: C */
    private final void m83713C() {
        m83711A();
        m83733y();
    }

    /* renamed from: m */
    private final void m83725m(C41205b bVar) {
        this.f67685g.mo95660b(bVar);
    }

    /* renamed from: n */
    private final String m83726n(Long l, Double d) {
        double d2;
        String str;
        if (d == null) {
            return null;
        }
        d.doubleValue();
        if (l == null) {
            return null;
        }
        l.longValue();
        double x = (double) C32319m.m95317x(System.currentTimeMillis(), l.longValue());
        double doubleValue = d.doubleValue();
        C37500b bVar = this.f67702x;
        double d3 = Utils.DOUBLE_EPSILON;
        if (bVar != null) {
            d2 = bVar.mo90669e();
        } else {
            d2 = 0.0d;
        }
        double d4 = doubleValue - d2;
        if (d4 > Utils.DOUBLE_EPSILON) {
            d3 = d4;
        }
        double d5 = d3 / (x + ((double) 1));
        C37500b bVar2 = this.f67702x;
        if (bVar2 == null || (str = bVar2.mo90671f()) == null) {
            str = "GEL";
        }
        return C32343x.m95410Q(d5, str, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final C20799d m83727r() {
        return (C20799d) this.f67697s.getValue(this, f67681z[0]);
    }

    /* renamed from: s */
    private final C37509j m83728s(C37500b bVar) {
        Double d;
        String str;
        Long l;
        Double d2;
        Long l2;
        String u;
        C37505g gVar = (C37505g) C41358y.m120009Y(bVar.mo90661B());
        String s = bVar.mo90685s();
        if (s == null) {
            s = C32343x.m95388F(bVar.mo90675i(), new Object[0]);
        }
        String str2 = s;
        String a = m83727r().mo49405c().mo49393a();
        if (a == null || (u = m83730u(a, bVar.mo90671f())) == null) {
            d = null;
        } else {
            d = C40437u.m117096h(u);
        }
        String o = C32319m.m95308o(C32319m.m95305l());
        Long a2 = m83727r().mo49409f().mo49388a();
        if (a2 != null) {
            str = C32319m.m95308o(a2.longValue());
        } else {
            str = null;
        }
        SavingGoalUiModel a3 = m83727r().mo49407e().mo49396a();
        if (a3 != null) {
            l = Long.valueOf(a3.mo57865d());
        } else {
            l = null;
        }
        Long w = bVar.mo90690w();
        long d3 = bVar.mo90668d();
        Number v = bVar.mo90689v();
        if (v != null) {
            d2 = Double.valueOf(v.doubleValue());
        } else {
            d2 = null;
        }
        if (gVar != null) {
            l2 = Long.valueOf(gVar.mo90711d());
        } else {
            l2 = null;
        }
        return new C37509j(str2, d, o, str, l, w, d3, d2, l2);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m83729t(C20799d dVar) {
        this.f67688j.mo4823o(dVar);
        this.f67689k.mo4823o(new C20792a(dVar.mo49410g(), false, false, 6, (DefaultConstructorMarker) null));
    }

    /* renamed from: u */
    private final String m83730u(String str, String str2) {
        String h = C32303f.m95197h(str2);
        return C40440x.m117173o0(str, " " + h);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m83731v(C26926f fVar) {
        C41536l.m120489i(fVar, "this$0");
        C37224b.m109965d(fVar.f67691m, fVar.f67698t);
    }

    /* renamed from: x */
    private final void m83732x(C20799d dVar) {
        this.f67697s.setValue(this, f67681z[0], dVar);
    }

    /* renamed from: y */
    private final void m83733y() {
        C40749p L0 = this.f67701w.mo94989L0(new C26923c(new C26929c(this)));
        C41536l.m120488h(L0, "private fun subscribeToD… .bindToLifecycle()\n    }");
        m83725m(C31270e.m92876e(L0, this.f67694p));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final C40754t m83734z(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: A3 */
    public void mo65722A3() {
        long j;
        boolean z;
        long W1 = C5023l.m19556W1();
        C1644x xVar = this.f67692n;
        CalendarConstraints.C4986b d = new CalendarConstraints.C4986b().mo16158e(DateValidatorPointForward.m19410a(W1)).mo16157d(W1);
        Long a = m83727r().mo49409f().mo49388a();
        if (a != null) {
            j = Math.max(a.longValue(), W1);
        } else {
            j = W1;
        }
        CalendarConstraints a2 = d.mo16156c(j).mo16154a();
        C41536l.m120488h(a2, "Builder()\n              …                 .build()");
        Long a3 = m83727r().mo49409f().mo49388a();
        Long a4 = m83727r().mo49409f().mo49388a();
        boolean z2 = false;
        if (a4 != null) {
            if (a4.longValue() < W1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = true;
            }
        }
        C37224b.m109965d(xVar, new C37586a(a2, (Long) C32343x.m95409P0(a3, !z2)));
    }

    /* renamed from: Cu */
    public LiveData mo65724Cu() {
        return this.f67692n;
    }

    /* renamed from: Dj */
    public LiveData mo65725Dj() {
        return this.f67689k;
    }

    /* renamed from: F0 */
    public LiveData mo65726F0() {
        return this.f67693o;
    }

    /* renamed from: Oi */
    public LiveData mo65727Oi() {
        return this.f67695q;
    }

    /* renamed from: Ot */
    public void mo65728Ot(String str) {
        String str2;
        C41536l.m120489i(str, "input");
        C37500b bVar = this.f67702x;
        if (bVar != null) {
            str2 = bVar.mo90671f();
        } else {
            str2 = null;
        }
        C41536l.m120486f(str2);
        m83732x(C20799d.m67300b(m83727r(), C20794c.C20798d.m67296e(m83727r().mo49405c(), str, false, false, (C17799b) null, 14, (Object) null), new C20794c.C20798d(m83726n(m83727r().mo49409f().mo49388a(), C40437u.m117096h(m83730u(str, str2))), false, false, (C17799b) null, 14, (DefaultConstructorMarker) null), (C20794c.C20795a) null, (C20794c.C20797c) null, 12, (Object) null));
    }

    /* renamed from: Wb */
    public void mo65729Wb(SavingGoalUiModel savingGoalUiModel) {
        C41536l.m120489i(savingGoalUiModel, "goal");
        m83732x(C20799d.m67300b(m83727r(), (C20794c.C20798d) null, (C20794c.C20798d) null, (C20794c.C20795a) null, new C20794c.C20797c(savingGoalUiModel, false, false, 6, (DefaultConstructorMarker) null), 7, (Object) null));
    }

    /* renamed from: Yg */
    public LiveData mo65730Yg() {
        return this.f67690l;
    }

    /* renamed from: bb */
    public void mo65731bb(long j) {
        String str;
        C20799d r = m83727r();
        C20794c.C20795a aVar = new C20794c.C20795a(Long.valueOf(j), false, false, 6, (DefaultConstructorMarker) null);
        Long valueOf = Long.valueOf(j);
        String a = m83727r().mo49405c().mo49393a();
        Double d = null;
        if (a != null) {
            C37500b bVar = this.f67702x;
            if (bVar != null) {
                str = bVar.mo90671f();
            } else {
                str = null;
            }
            C41536l.m120486f(str);
            String u = m83730u(a, str);
            if (u != null) {
                d = C40437u.m117096h(u);
            }
        }
        m83732x(C20799d.m67300b(r, (C20794c.C20798d) null, new C20794c.C20798d(m83726n(valueOf, d), false, false, (C17799b) null, 14, (DefaultConstructorMarker) null), aVar, (C20794c.C20797c) null, 9, (Object) null));
    }

    /* renamed from: da */
    public LiveData mo65732da() {
        return this.f67688j;
    }

    /* renamed from: gh */
    public void mo65733gh() {
        C40734b m = C40734b.m117918i().mo94900m(25, TimeUnit.MILLISECONDS);
        C41536l.m120488h(m, "complete().delay(25, TimeUnit.MILLISECONDS)");
        C32343x.m95411Q0(C32343x.m95450g1(m)).mo94902o(new C26925e(this)).mo94886E();
    }

    /* renamed from: o */
    public void mo66216o() {
        this.f67685g.mo95663e();
        m83732x(new C20799d((C20794c.C20798d) null, (C20794c.C20798d) null, (C20794c.C20795a) null, (C20794c.C20797c) null, 15, (DefaultConstructorMarker) null));
    }

    /* renamed from: p */
    public C26921a mo66217p() {
        return this.f67686h;
    }

    /* renamed from: pe */
    public LiveData mo65734pe() {
        return this.f67696r;
    }

    /* renamed from: pp */
    public LiveData mo65735pp() {
        return this.f67694p;
    }

    /* renamed from: q */
    public C26922b mo66218q() {
        return this.f67687i;
    }

    /* renamed from: qf */
    public void mo65736qf() {
        List B;
        C37505g gVar;
        C37500b bVar = this.f67702x;
        if (bVar != null && (B = bVar.mo90661B()) != null && (gVar = (C37505g) C41358y.m120009Y(B)) != null) {
            this.f67701w.onNext(Long.valueOf(gVar.mo90711d()));
        }
    }

    /* renamed from: s4 */
    public void mo65737s4() {
        C37500b bVar = this.f67702x;
        if (bVar != null) {
            this.f67700v.onNext(m83728s(bVar));
        }
    }

    /* renamed from: sq */
    public LiveData mo65738sq() {
        return this.f67691m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66219w(java.util.List r26, ny0.C37500b r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            java.lang.String r3 = "purposes"
            kotlin.jvm.internal.C41536l.m120489i(r1, r3)
            java.lang.String r3 = "deposit"
            kotlin.jvm.internal.C41536l.m120489i(r2, r3)
            java.util.List r3 = r0.f67698t
            g91.C32343x.m95475p(r3, r1)
            java.util.List r3 = r0.f67699u
            java.util.List r4 = r27.mo90661B()
            g91.C32343x.m95475p(r3, r4)
            r0.f67702x = r2
            androidx.lifecycle.x r3 = r0.f67693o
            r3.mo4823o(r2)
            androidx.lifecycle.x r3 = r0.f67690l
            gc0.a r10 = new gc0.a
            r5 = 1
            r6 = 0
            java.util.List r4 = r27.mo90661B()
            boolean r4 = r4.isEmpty()
            r11 = 1
            r7 = r4 ^ 1
            r8 = 2
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r3.mo4823o(r10)
            java.util.List r3 = r27.mo90661B()
            java.lang.Object r3 = ie1.C41358y.m120009Y(r3)
            ny0.g r3 = (ny0.C37505g) r3
            r4 = 0
            if (r3 == 0) goto L_0x0067
            double r5 = r3.mo90708a()
            java.text.DecimalFormat r7 = f67679A
            java.lang.String r12 = r7.format(r5)
            if (r12 == 0) goto L_0x0067
            java.lang.String r13 = " "
            java.lang.String r14 = ""
            r15 = 0
            r16 = 4
            r17 = 0
            java.lang.String r5 = cf1.C40439w.m117103B(r12, r13, r14, r15, r16, r17)
            r13 = r5
            goto L_0x0068
        L_0x0067:
            r13 = r4
        L_0x0068:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            gc0.c$d r5 = new gc0.c$d
            r12 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)
            gc0.c$a r6 = new gc0.c$a
            if (r3 == 0) goto L_0x0080
            java.lang.Long r7 = r3.mo90710c()
            if (r7 != 0) goto L_0x0084
        L_0x0080:
            java.lang.Long r7 = r27.mo90683q()
        L_0x0084:
            r20 = r7
            r21 = 0
            java.lang.Long r7 = r27.mo90683q()
            r8 = 0
            if (r7 != 0) goto L_0x0092
            r22 = r11
            goto L_0x0094
        L_0x0092:
            r22 = r8
        L_0x0094:
            r23 = 2
            r24 = 0
            r19 = r6
            r19.<init>(r20, r21, r22, r23, r24)
            java.util.Iterator r7 = r26.iterator()
        L_0x00a1:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00c2
            java.lang.Object r9 = r7.next()
            r10 = r9
            ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel r10 = (p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel) r10
            if (r3 == 0) goto L_0x00be
            long r12 = r10.mo57865d()
            long r14 = r3.mo90714f()
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x00be
            r10 = r11
            goto L_0x00bf
        L_0x00be:
            r10 = r8
        L_0x00bf:
            if (r10 == 0) goto L_0x00a1
            goto L_0x00c3
        L_0x00c2:
            r9 = r4
        L_0x00c3:
            ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel r9 = (p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel) r9
            if (r9 != 0) goto L_0x00ce
            java.lang.Object r1 = ie1.C41358y.m120020j0(r26)
            r9 = r1
            ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel r9 = (p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel) r9
        L_0x00ce:
            r11 = r9
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            gc0.c$c r1 = new gc0.c$c
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            gc0.c$d r7 = new gc0.c$d
            if (r3 == 0) goto L_0x00ec
            double r8 = r3.mo90712e()
            java.lang.String r10 = r27.mo90671f()
            r11 = 0
            r12 = 2
            r13 = 0
            java.lang.String r4 = g91.C32343x.m95410Q(r8, r10, r11, r12, r13)
        L_0x00ec:
            r17 = r4
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 14
            r22 = 0
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            gc0.d r2 = new gc0.d
            r2.<init>(r5, r7, r6, r1)
            r0.m83732x(r2)
            r25.m83713C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oc0.C26926f.mo66219w(java.util.List, ny0.b):void");
    }
}

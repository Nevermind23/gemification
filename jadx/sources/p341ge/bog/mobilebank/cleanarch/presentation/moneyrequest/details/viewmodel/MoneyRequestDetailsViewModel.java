package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40734b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p802jv.C25493a;
import p802jv.C25494b;
import p802jv.C25496d;
import p802jv.C25503h;
import p812kv.C25779b;
import p812kv.C25782e;
import ue1.C43075l;
import v20.C28983a;
import w20.C29192a;
import y20.C29889a;
import y20.C29890b;
import y20.C29891c;
import y20.C29892d;
import y20.C29893e;
import y20.C29894f;
import y20.C29895g;
import y20.C29896h;
import y20.C29897i;
import y20.C29898j;
import y20.C29899k;
import y20.C29900l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel */
public final class MoneyRequestDetailsViewModel extends C21481a {

    /* renamed from: d */
    private final C25503h f58252d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28983a f58253e;

    /* renamed from: f */
    private final C25493a f58254f;

    /* renamed from: g */
    private final C25494b f58255g;

    /* renamed from: h */
    private final C25496d f58256h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f58257i;

    /* renamed from: j */
    private final LiveData f58258j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f58259k;

    /* renamed from: l */
    private long f58260l;

    /* renamed from: m */
    private final LiveData f58261m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f58262n = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel$a */
    static final class C21850a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1639v f58263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21850a(C1639v vVar) {
            super(1);
            this.f58263d = vVar;
        }

        /* renamed from: a */
        public final void mo54444a(C37223a aVar) {
            boolean z;
            C21503d dVar = (C21503d) aVar.mo90299d();
            if (dVar instanceof C21503d.C21505b) {
                z = true;
            } else if (dVar instanceof C21503d.C21506c) {
                Object a = dVar.mo53701a();
                C41536l.m120486f(a);
                z = ((Boolean) a).booleanValue();
            } else {
                z = false;
            }
            boolean z2 = z;
            C29889a aVar2 = (C29889a) this.f58263d.mo4814f();
            if (aVar2 != null) {
                C1639v vVar = this.f58263d;
                if (aVar2.mo70167e() != z2) {
                    vVar.mo4826r(C29889a.m90703b(aVar2, (C25782e) null, (String) null, z2, 3, (Object) null));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54444a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel$b */
    static final class C21851b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1639v f58264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21851b(C1639v vVar) {
            super(1);
            this.f58264d = vVar;
        }

        /* renamed from: a */
        public final void mo54445a(C29890b bVar) {
            this.f58264d.mo4826r(bVar.mo70173b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54445a((C29890b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel$c */
    static final class C21852c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21852c f58265d = new C21852c();

        C21852c() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C29890b bVar) {
            C41536l.m120488h(bVar, "it");
            return C29891c.m90715a(bVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel$d */
    static final class C21853d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsViewModel f58266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21853d(MoneyRequestDetailsViewModel moneyRequestDetailsViewModel) {
            super(1);
            this.f58266d = moneyRequestDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo54447a(C41205b bVar) {
            C21484c.m69417i(this.f58266d.f58262n, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54447a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel$e */
    static final class C21854e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsViewModel f58267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21854e(MoneyRequestDetailsViewModel moneyRequestDetailsViewModel) {
            super(1);
            this.f58267d = moneyRequestDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo54448a(C25779b bVar) {
            C1644x mw = this.f58267d.f58257i;
            C28983a nw = this.f58267d.f58253e;
            C41536l.m120488h(bVar, "it");
            mw.mo4826r(nw.mo68823d(bVar));
            C21484c.m69418j(this.f58267d.f58262n, Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54448a((C25779b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel$f */
    static final class C21855f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsViewModel f58268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21855f(MoneyRequestDetailsViewModel moneyRequestDetailsViewModel) {
            super(1);
            this.f58268d = moneyRequestDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58268d.f58262n, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel$g */
    static final class C21856g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsViewModel f58269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21856g(MoneyRequestDetailsViewModel moneyRequestDetailsViewModel) {
            super(1);
            this.f58269d = moneyRequestDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo54450a(C25779b bVar) {
            C1644x mw = this.f58269d.f58257i;
            C28983a nw = this.f58269d.f58253e;
            C41536l.m120488h(bVar, "it");
            mw.mo4826r(nw.mo68823d(bVar));
            MoneyRequestDetailsViewModel moneyRequestDetailsViewModel = this.f58269d;
            MoneyRequestDetailsViewModel.m70768Hw(moneyRequestDetailsViewModel, moneyRequestDetailsViewModel.f58259k, false, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54450a((C25779b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel$h */
    static final class C21857h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsViewModel f58270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21857h(MoneyRequestDetailsViewModel moneyRequestDetailsViewModel) {
            super(1);
            this.f58270d = moneyRequestDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            MoneyRequestDetailsViewModel moneyRequestDetailsViewModel = this.f58270d;
            C1644x pw = moneyRequestDetailsViewModel.f58259k;
            C41536l.m120488h(th, "it");
            moneyRequestDetailsViewModel.m70766Ew(pw, th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel$i */
    static final class C21858i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsViewModel f58271d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21858i(MoneyRequestDetailsViewModel moneyRequestDetailsViewModel) {
            super(1);
            this.f58271d = moneyRequestDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo54452a(C41205b bVar) {
            this.f58271d.f58259k.mo4826r(C32343x.m95466m(new C21503d.C21505b((Object) null, 1, (DefaultConstructorMarker) null)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54452a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel$j */
    static final class C21859j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsViewModel f58272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21859j(MoneyRequestDetailsViewModel moneyRequestDetailsViewModel) {
            super(1);
            this.f58272d = moneyRequestDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            MoneyRequestDetailsViewModel moneyRequestDetailsViewModel = this.f58272d;
            C1644x pw = moneyRequestDetailsViewModel.f58259k;
            C41536l.m120488h(th, "it");
            moneyRequestDetailsViewModel.m70766Ew(pw, th);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoneyRequestDetailsViewModel(C25503h hVar, C28983a aVar, C25493a aVar2, C25494b bVar, C25496d dVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "getRequestById");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(aVar2, "cancelMoneyRequest");
        C41536l.m120489i(bVar, "completeMoneyRequest");
        C41536l.m120489i(dVar, "requestedAmountTransferred");
        this.f58252d = hVar;
        this.f58253e = aVar;
        this.f58254f = aVar2;
        this.f58255g = bVar;
        this.f58256h = dVar;
        C1644x xVar = new C1644x();
        this.f58257i = xVar;
        this.f58258j = C1607m0.m5655c(xVar, C21852c.f58265d);
        C1644x xVar2 = new C1644x();
        this.f58259k = xVar2;
        C1639v vVar = new C1639v();
        vVar.mo4956s(xVar2, new C21860a(new C21850a(vVar)));
        vVar.mo4956s(xVar, new C21860a(new C21851b(vVar)));
        this.f58261m = vVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m70763Aw(MoneyRequestDetailsViewModel moneyRequestDetailsViewModel) {
        C41536l.m120489i(moneyRequestDetailsViewModel, "this$0");
        C21484c.m69418j(moneyRequestDetailsViewModel.f58262n, Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m70764Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m70765Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public final void m70766Ew(C1644x xVar, Throwable th) {
        xVar.mo4826r(C32343x.m95466m(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
    }

    /* renamed from: Gw */
    private final void m70767Gw(C1644x xVar, boolean z) {
        xVar.mo4826r(C32343x.m95466m(new C21503d.C21506c(Boolean.valueOf(z))));
    }

    /* renamed from: Hw */
    static /* synthetic */ void m70768Hw(MoneyRequestDetailsViewModel moneyRequestDetailsViewModel, C1644x xVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        moneyRequestDetailsViewModel.m70767Gw(xVar, z);
    }

    /* renamed from: Iw */
    private final void m70769Iw(C40734b bVar) {
        C41205b G = bVar.mo94906z(C40992a.m118827a()).mo94904r(new C29892d(new C21858i(this))).mo94888G(new C29893e(this), new C29894f(new C21859j(this)));
        C41536l.m120488h(G, "private fun Completable.…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m70770Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public static final void m70771Kw(MoneyRequestDetailsViewModel moneyRequestDetailsViewModel) {
        C41536l.m120489i(moneyRequestDetailsViewModel, "this$0");
        moneyRequestDetailsViewModel.m70767Gw(moneyRequestDetailsViewModel.f58259k, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final void m70772Lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ww */
    private final void m70787ww() {
        C41205b v = this.f58252d.mo64054a(this.f58260l).mo94957s(C40992a.m118827a()).mo94950i(new C29897i(new C21853d(this))).mo94960v(new C29898j(new C21854e(this)), new C29899k(new C21855f(this)), new C29900l(this));
        C41536l.m120488h(v, "private fun loadMoneyReq…).bindToLifecycle()\n    }");
        bindToLifecycle(v);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m70788xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m70789yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m70790zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Bw */
    public final void mo54436Bw(C29192a.C29198f fVar) {
        C41536l.m120489i(fVar, "receiver");
        C41205b I = this.f58256h.mo64048c(this.f58260l, fVar.mo47349a()).mo95063B(C40992a.m118827a()).mo95070I(new C29895g(new C21856g(this)), new C29896h(new C21857h(this)));
        C41536l.m120488h(I, "fun markAsReceived(recei…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* renamed from: Fw */
    public final void mo54437Fw(long j) {
        this.f58260l = j;
        m70787ww();
    }

    /* renamed from: n3 */
    public final LiveData mo54438n3() {
        return this.f58258j;
    }

    /* renamed from: rw */
    public final void mo54439rw() {
        m70769Iw(this.f58254f.mo64046a(this.f58260l));
    }

    /* renamed from: sw */
    public final void mo54440sw() {
        m70769Iw(this.f58255g.mo64047a(this.f58260l));
    }

    /* renamed from: tw */
    public final LiveData mo54441tw() {
        return this.f58261m;
    }

    /* renamed from: uw */
    public final LiveData mo54442uw() {
        return this.f58262n;
    }

    /* renamed from: vw */
    public final LiveData mo54443vw() {
        return this.f58259k;
    }
}

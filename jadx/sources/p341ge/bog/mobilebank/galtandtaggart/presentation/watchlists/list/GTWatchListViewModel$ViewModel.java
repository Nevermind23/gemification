package p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list;

import androidx.lifecycle.C1644x;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import gd1.C40992a;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import we0.C29343k0;
import zg0.C30304g;
import zg0.C30305h;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.GTWatchListViewModel$ViewModel */
public final class GTWatchListViewModel$ViewModel extends C21481a implements C30304g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29343k0 f62326d;

    /* renamed from: e */
    private final C30304g f62327e = this;

    /* renamed from: f */
    private final C1644x f62328f = new C1644x();

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.GTWatchListViewModel$ViewModel$a */
    static final class C24014a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTWatchListViewModel$ViewModel f62329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24014a(GTWatchListViewModel$ViewModel gTWatchListViewModel$ViewModel) {
            super(1);
            this.f62329d = gTWatchListViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40749p O = this.f62329d.f62326d.mo69196a().mo95075O();
            C41536l.m120488h(O, "getWatchListsUseCase()\n …          .toObservable()");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTWatchListViewModel$ViewModel(C29343k0 k0Var) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(k0Var, "getWatchListsUseCase");
        this.f62326d = k0Var;
        C40749p o0 = onRefresh().mo94989L0(new C30305h(new C24014a(this))).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "onRefresh().switchMap { …dSchedulers.mainThread())");
        bindToLifecycle(C31270e.m92876e(o0, mo61015w()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m77464ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: gw */
    public final C30304g mo61013gw() {
        return this.f62327e;
    }

    /* renamed from: hw */
    public C1644x mo61015w() {
        return this.f62328f;
    }
}

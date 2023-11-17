package p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.create;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import we0.C29331f;
import wg0.C29384d;
import wg0.C29385e;
import wg0.C29386f;
import wg0.C29387g;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.create.GTCreateWatchListViewModel$ViewModel */
public final class GTCreateWatchListViewModel$ViewModel extends C21481a implements C29384d, C29385e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29331f f62267d;

    /* renamed from: e */
    private final C29384d f62268e = this;

    /* renamed from: f */
    private final C29385e f62269f = this;

    /* renamed from: g */
    private final C40767b f62270g;

    /* renamed from: h */
    private final C1644x f62271h;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.create.GTCreateWatchListViewModel$ViewModel$a */
    static final class C23983a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTCreateWatchListViewModel$ViewModel f62272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23983a(GTCreateWatchListViewModel$ViewModel gTCreateWatchListViewModel$ViewModel) {
            super(1);
            this.f62272d = gTCreateWatchListViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "name");
            C40749p O = this.f62272d.f62267d.mo69187a(str).mo95075O();
            C41536l.m120488h(O, "createWatchListUseCase(n…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.create.GTCreateWatchListViewModel$ViewModel$b */
    static final class C23984b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTCreateWatchListViewModel$ViewModel f62273d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23984b(GTCreateWatchListViewModel$ViewModel gTCreateWatchListViewModel$ViewModel) {
            super(1);
            this.f62273d = gTCreateWatchListViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60970a(C31128a aVar) {
            this.f62273d.mo60968r4().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60970a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTCreateWatchListViewModel$ViewModel(C29331f fVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(fVar, "createWatchListUseCase");
        this.f62267d = fVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f62270g = h1;
        this.f62271h = new C1644x();
        C41205b F0 = h1.mo94989L0(new C29386f(new C23983a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C29387g(new C23984b(this)));
        C41536l.m120488h(F0, "createWatchListSubject.s…ue(res)\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m77369fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m77370gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: I */
    public void mo60964I(String str) {
        C41536l.m120489i(str, "name");
        this.f62270g.onNext(str);
    }

    /* renamed from: iw */
    public C1644x mo60968r4() {
        return this.f62271h;
    }

    /* renamed from: jw */
    public final C29384d mo60966jw() {
        return this.f62268e;
    }

    /* renamed from: kw */
    public final C29385e mo60967kw() {
        return this.f62269f;
    }
}

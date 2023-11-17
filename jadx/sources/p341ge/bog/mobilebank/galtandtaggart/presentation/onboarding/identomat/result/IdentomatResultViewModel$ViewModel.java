package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result;

import af0.C19234a;
import androidx.lifecycle.C1644x;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import zf0.C30293c;
import zf0.C30294d;
import zf0.C30295e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultViewModel$ViewModel */
public final class IdentomatResultViewModel$ViewModel extends C21481a implements C30293c, C30294d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C19234a f61533d;

    /* renamed from: e */
    private final C30293c f61534e = this;

    /* renamed from: f */
    private final C30294d f61535f = this;

    /* renamed from: g */
    private final C40767b f61536g;

    /* renamed from: h */
    private final C1644x f61537h;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultViewModel$ViewModel$a */
    static final class C23577a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentomatResultViewModel$ViewModel f61538d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23577a(IdentomatResultViewModel$ViewModel identomatResultViewModel$ViewModel) {
            super(1);
            this.f61538d = identomatResultViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40749p O = this.f61538d.f61533d.mo47473a().mo95075O();
            C41536l.m120488h(O, "getDisclosureTypesUseCas…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IdentomatResultViewModel$ViewModel(C19234a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getDisclosureTypesUseCase");
        this.f61533d = aVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f61536g = h1;
        this.f61537h = new C1644x();
        C40749p o0 = h1.mo94989L0(new C30295e(new C23577a(this))).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "preloadDisclosureTypeSub…dSchedulers.mainThread())");
        bindToLifecycle(C31270e.m92876e(o0, mo60462D()));
        h1.onNext(C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m76262ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: gw */
    public C1644x mo60462D() {
        return this.f61537h;
    }

    /* renamed from: hw */
    public final C30294d mo60464hw() {
        return this.f61535f;
    }
}

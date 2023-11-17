package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector;

import ag0.C19240e;
import ag0.C19241f;
import ag0.C19242g;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import df0.C19995e;
import df0.C19996f;
import df0.C19997g;
import df0.C19998h;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.IdentomatTypeSelectorViewModel$ViewModel */
public final class IdentomatTypeSelectorViewModel$ViewModel extends C21481a implements C19240e, C19241f {

    /* renamed from: d */
    private final C19995e f61541d;

    /* renamed from: e */
    private final C19996f f61542e;

    /* renamed from: f */
    private final C19997g f61543f;

    /* renamed from: g */
    private final C19240e f61544g = this;

    /* renamed from: h */
    private final C19241f f61545h = this;

    /* renamed from: i */
    private final C40767b f61546i;

    /* renamed from: j */
    private final C1644x f61547j;

    /* renamed from: k */
    private final C1644x f61548k;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.IdentomatTypeSelectorViewModel$ViewModel$a */
    static final class C23580a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23580a f61549d = new C23580a();

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.IdentomatTypeSelectorViewModel$ViewModel$a$a */
        static final class C23581a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C23581a f61550d = new C23581a();

            C23581a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        C23580a() {
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m76283c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C19998h hVar) {
            C41536l.m120489i(hVar, "useCase");
            return hVar.mo48373a().mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C23599c(C23581a.f61550d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IdentomatTypeSelectorViewModel$ViewModel(C19995e eVar, C19996f fVar, C19997g gVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "startIdCardSessionUseCase");
        C41536l.m120489i(fVar, "startPassportSessionUseCase");
        C41536l.m120489i(gVar, "startResidenceSessionUseCase");
        this.f61541d = eVar;
        this.f61542e = fVar;
        this.f61543f = gVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<StartIdentomatSessionUseCase>()");
        this.f61546i = h1;
        this.f61547j = new C1644x();
        this.f61548k = new C1644x();
        C40749p o0 = h1.mo94989L0(new C19242g(C23580a.f61549d)).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "sessionStartSubject.swit…dSchedulers.mainThread())");
        bindToLifecycle(C31270e.m92876e(o0, mo47482Qb()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m76272ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: A4 */
    public void mo47478A4() {
        this.f61546i.onNext(this.f61543f);
    }

    /* renamed from: Go */
    public void mo47479Go() {
        C37224b.m109962a(this.f61548k);
    }

    /* renamed from: fw */
    public LiveData mo60466fw() {
        return this.f61548k;
    }

    /* renamed from: gw */
    public final C19240e mo60467gw() {
        return this.f61544g;
    }

    /* renamed from: hw */
    public final C19241f mo60468hw() {
        return this.f61545h;
    }

    /* renamed from: iw */
    public C1644x mo47482Qb() {
        return this.f61547j;
    }

    /* renamed from: ld */
    public void mo47480ld() {
        this.f61546i.onNext(this.f61542e);
    }

    /* renamed from: vc */
    public void mo47481vc() {
        this.f61546i.onNext(this.f61541d);
    }
}

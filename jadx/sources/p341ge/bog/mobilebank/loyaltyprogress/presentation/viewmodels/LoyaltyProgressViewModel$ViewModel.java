package p341ge.bog.mobilebank.loyaltyprogress.presentation.viewmodels;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import du0.C31607b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import eu0.C31814b;
import fu0.C32014c;
import g91.C32343x;
import gd1.C40992a;
import gu0.C36079a;
import hd1.C41204a;
import he1.C41224m;
import hu0.C36220a;
import hu0.C36221b;
import hu0.C36222c;
import hu0.C36223d;
import hu0.C36224e;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import ue1.C43080q;
import xt0.C39892b;
import xt0.C39896d;
import xt0.C39901f;
import xt0.C39905g;
import yt0.C40063d;

/* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.viewmodels.LoyaltyProgressViewModel$ViewModel */
public final class LoyaltyProgressViewModel$ViewModel extends C21481a implements C36220a, C36221b {

    /* renamed from: d */
    private final C39892b f81265d;

    /* renamed from: e */
    private final C31607b f81266e;

    /* renamed from: f */
    private final C36220a f81267f = this;

    /* renamed from: g */
    private final C36221b f81268g = this;

    /* renamed from: h */
    private final C1644x f81269h;

    /* renamed from: i */
    private final C1644x f81270i;

    /* renamed from: j */
    private final C1644x f81271j;

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.viewmodels.LoyaltyProgressViewModel$ViewModel$a */
    static final class C33174a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39905g f81272d;

        /* renamed from: e */
        final /* synthetic */ C39901f f81273e;

        /* renamed from: f */
        final /* synthetic */ C39896d f81274f;

        /* renamed from: g */
        final /* synthetic */ C36079a f81275g;

        /* renamed from: h */
        final /* synthetic */ C32014c f81276h;

        /* renamed from: i */
        final /* synthetic */ C31814b f81277i;

        /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.viewmodels.LoyaltyProgressViewModel$ViewModel$a$a */
        static final class C33175a extends C41537m implements C43080q {

            /* renamed from: d */
            final /* synthetic */ C36079a f81278d;

            /* renamed from: e */
            final /* synthetic */ C32014c f81279e;

            /* renamed from: f */
            final /* synthetic */ C31814b f81280f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33175a(C36079a aVar, C32014c cVar, C31814b bVar) {
                super(3);
                this.f81278d = aVar;
                this.f81279e = cVar;
                this.f81280f = bVar;
            }

            /* renamed from: a */
            public final C36222c invoke(C40063d dVar, List list, List list2) {
                C41536l.m120489i(dVar, "statusDetails");
                C41536l.m120489i(list, "statusBenefits");
                C41536l.m120489i(list2, "starsGuide");
                return new C36222c(this.f81278d.mo88800a(dVar), this.f81279e.mo72512a(list), this.f81280f.mo72254a(list2));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33174a(C39905g gVar, C39901f fVar, C39896d dVar, C36079a aVar, C32014c cVar, C31814b bVar) {
            super(1);
            this.f81272d = gVar;
            this.f81273e = fVar;
            this.f81274f = dVar;
            this.f81275g = aVar;
            this.f81276h = cVar;
            this.f81277i = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C36222c m97868c(C43080q qVar, Object obj, Object obj2, Object obj3) {
            C41536l.m120489i(qVar, "$tmp0");
            return (C36222c) qVar.invoke(obj, obj2, obj3);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p o0 = C40762x.m118153S(this.f81272d.mo93601a(), this.f81273e.mo93597b(), this.f81274f.mo93593b(), new C33177a(new C33175a(this.f81275g, this.f81276h, this.f81277i))).mo95075O().mo95027o0(C40992a.m118827a());
            C41536l.m120488h(o0, "statusBenefitsUiMapper: …dSchedulers.mainThread())");
            return C31270e.m92879h(o0, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.viewmodels.LoyaltyProgressViewModel$ViewModel$b */
    /* synthetic */ class C33176b extends C41535k implements C43075l {
        C33176b(Object obj) {
            super(1, obj, C31607b.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C31607b) this.receiver).mo72021a(list);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyProgressViewModel$ViewModel(C39901f fVar, C39905g gVar, C32014c cVar, C39896d dVar, C31814b bVar, C36079a aVar, C39892b bVar2, C31607b bVar3) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C39892b bVar4 = bVar2;
        C31607b bVar5 = bVar3;
        C41536l.m120489i(fVar, "getStatusBenefitsUseCase");
        C41536l.m120489i(gVar, "getStatusDetailsUseCase");
        C41536l.m120489i(cVar, "statusBenefitsUiMapper");
        C41536l.m120489i(dVar, "getStarsGuideUseCase");
        C31814b bVar6 = bVar;
        C41536l.m120489i(bVar6, "starsGuideUiMapper");
        C36079a aVar2 = aVar;
        C41536l.m120489i(aVar2, "statusDetailsUiMapper");
        C41536l.m120489i(bVar4, "getNewsKeysUseCase");
        C41536l.m120489i(bVar5, "newsKeyUiMapper");
        this.f81265d = bVar4;
        this.f81266e = bVar5;
        C1644x xVar = new C1644x();
        this.f81269h = xVar;
        this.f81270i = new C1644x();
        this.f81271j = new C1644x();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C36224e(new C33174a(gVar, fVar, dVar, aVar2, cVar, bVar6)));
        C41536l.m120488h(L0, "merge(\n                o…ervable(it)\n            }");
        C31270e.m92876e(L0, xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m97855fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final List m97856mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: Wp */
    public void mo75457Wp() {
        Object f = mo75464qu().mo4814f();
        C41536l.m120487g(f, "null cannot be cast to non-null type ge.bog.mobilebank.shared.requestedresult.RequestedResult.Success<ge.bog.mobilebank.loyaltyprogress.presentation.viewmodels.LoyaltyProgressViewModel.StatusPageModel>");
        C36222c cVar = (C36222c) ((C31128a.C31131c) f).mo71340a();
        this.f81270i.mo4826r(new C41224m(cVar.mo88965a(), Long.valueOf(cVar.mo88967c().mo88805e())));
    }

    /* renamed from: gw */
    public final C36220a mo75458gw() {
        return this.f81267f;
    }

    /* renamed from: hw */
    public C1644x mo75455Nq() {
        return this.f81271j;
    }

    /* renamed from: iw */
    public final C36221b mo75460iw() {
        return this.f81268g;
    }

    /* renamed from: jw */
    public C1644x mo75456Sj() {
        return this.f81270i;
    }

    /* renamed from: kw */
    public C1644x mo75464qu() {
        return this.f81269h;
    }

    /* renamed from: lw */
    public void mo75463lw() {
        C40749p O = this.f81265d.mo93590b().mo95075O();
        C41536l.m120488h(O, "getNewsKeysUseCase.invok…          .toObservable()");
        C40749p k0 = C32343x.m95413R0(O).mo95026k0(new C36223d(new C33176b(this.f81266e)));
        C41536l.m120488h(k0, "getNewsKeysUseCase.invok…newsKeyUiMapper::convert)");
        C31270e.m92876e(C31270e.m92879h(k0, 0), this.f81271j);
    }
}

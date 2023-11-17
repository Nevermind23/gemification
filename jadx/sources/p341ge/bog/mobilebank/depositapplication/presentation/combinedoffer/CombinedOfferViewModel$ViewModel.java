package p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import ja0.C25372h;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import pb0.C27493a;
import ta0.C28338b;
import ta0.C28339c;
import ta0.C28340d;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferViewModel$ViewModel */
public final class CombinedOfferViewModel$ViewModel extends C21481a implements C28338b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C25372h f60230d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C27493a f60231e;

    /* renamed from: f */
    private final C28338b f60232f = this;

    /* renamed from: g */
    private final C1644x f60233g = new C1644x();

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferViewModel$ViewModel$a */
    static final class C22855a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferViewModel$ViewModel f60234d;

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferViewModel$ViewModel$a$a */
        /* synthetic */ class C22856a extends C41535k implements C43075l {
            C22856a(Object obj) {
                super(1, obj, C27493a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C27493a) this.receiver).mo66807c(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22855a(CombinedOfferViewModel$ViewModel combinedOfferViewModel$ViewModel) {
            super(1);
            this.f60234d = combinedOfferViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p k0 = this.f60234d.f60230d.mo63959b().mo95075O().mo95026k0(new C22858a(new C22856a(this.f60234d.f60231e)));
            C41536l.m120488h(k0, "getDepositTypesUseCase.i…  .map(mapper::transform)");
            return C31270e.m92879h(k0, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferViewModel$ViewModel$b */
    static final class C22857b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferViewModel$ViewModel f60235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22857b(CombinedOfferViewModel$ViewModel combinedOfferViewModel$ViewModel) {
            super(1);
            this.f60235d = combinedOfferViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo56957a(C31128a aVar) {
            this.f60235d.mo56954jw().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56957a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedOfferViewModel$ViewModel(C25372h hVar, C27493a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "getDepositTypesUseCase");
        C41536l.m120489i(aVar, "mapper");
        this.f60230d = hVar;
        this.f60231e = aVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C28339c(new C22855a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ble(it)\n                }");
        C41205b F0 = C32343x.m95453h1(L0).mo94981F0(new C28340d(new C22857b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…lue(it)\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m74156fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m74157gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: jw */
    public C1644x mo56954jw() {
        return this.f60233g;
    }
}

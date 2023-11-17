package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard;

import androidx.lifecycle.C1644x;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p396dl.C12317c;
import p396dl.C12318d;
import p396dl.C12319e;
import p396dl.C12320f;
import p424fl.C12924a;
import p535nk.C17024f;
import p535nk.C17040r;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardViewModel$ViewModel */
public final class SelectInsuranceCardViewModel$ViewModel extends C21481a implements C12317c, C12318d {

    /* renamed from: d */
    private final C17040r f40964d;

    /* renamed from: e */
    private final C12317c f40965e = this;

    /* renamed from: f */
    private final C12318d f40966f = this;

    /* renamed from: g */
    private final C1644x f40967g = new C1644x();

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardViewModel$ViewModel$a */
    /* synthetic */ class C13743a extends C41535k implements C43075l {
        C13743a(Object obj) {
            super(1, obj, C12924a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C12924a) this.receiver).mo33677a(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardViewModel$ViewModel$b */
    static final class C13744b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectInsuranceCardViewModel$ViewModel f40968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13744b(SelectInsuranceCardViewModel$ViewModel selectInsuranceCardViewModel$ViewModel) {
            super(1);
            this.f40968d = selectInsuranceCardViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo37645a(List list) {
            this.f40968d.mo32908oq().mo4826r(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37645a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectInsuranceCardViewModel$ViewModel(C17040r rVar, C17024f fVar, C12924a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(rVar, "onInsuranceCardSelectedUseCase");
        C41536l.m120489i(fVar, "getLastLoadedInsuranceCardsUseCase");
        C41536l.m120489i(aVar, "mapper");
        this.f40964d = rVar;
        C40749p k0 = fVar.mo44219a().mo95026k0(new C12319e(new C13743a(aVar)));
        C41536l.m120488h(k0, "getLastLoadedInsuranceCa…    .map(mapper::convert)");
        C41205b F0 = C32343x.m95413R0(k0).mo94981F0(new C12320f(new C13744b(this)));
        C41536l.m120488h(F0, "getLastLoadedInsuranceCa…ue = it\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final List m51353fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m51354gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    public final C12317c mo37641hw() {
        return this.f40965e;
    }

    /* renamed from: iw */
    public C1644x mo32908oq() {
        return this.f40967g;
    }

    /* renamed from: j1 */
    public void mo32907j1(int i) {
        this.f40964d.mo44231a(i);
    }

    /* renamed from: jw */
    public final C12318d mo37643jw() {
        return this.f40966f;
    }
}

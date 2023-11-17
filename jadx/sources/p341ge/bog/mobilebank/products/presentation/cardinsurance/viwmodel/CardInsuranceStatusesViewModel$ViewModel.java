package p341ge.bog.mobilebank.products.presentation.cardinsurance.viwmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ez0.C31901f;
import fz0.C32038a;
import g91.C32343x;
import gz0.C36137y;
import gz0.C36138z;
import h21.C36143a;
import hd1.C41204a;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.model.CardInsuranceStatusUiModel;
import p380ck.C10463g;
import p843nw.C26633o;
import p863pw.C27637o;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.viwmodel.CardInsuranceStatusesViewModel$ViewModel */
public final class CardInsuranceStatusesViewModel$ViewModel extends C21481a implements C36137y {

    /* renamed from: j */
    public static final C33888b f82491j = new C33888b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C26633o f82492d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C32038a f82493e;

    /* renamed from: f */
    private final C1644x f82494f;

    /* renamed from: g */
    private final C1644x f82495g = new C1644x();

    /* renamed from: h */
    private final C1644x f82496h = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ArrayList f82497i = new ArrayList();

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.viwmodel.CardInsuranceStatusesViewModel$ViewModel$a */
    static final class C33886a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceStatusesViewModel$ViewModel f82498d;

        /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.viwmodel.CardInsuranceStatusesViewModel$ViewModel$a$a */
        static final class C33887a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CardInsuranceStatusesViewModel$ViewModel f82499d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33887a(CardInsuranceStatusesViewModel$ViewModel cardInsuranceStatusesViewModel$ViewModel) {
                super(1);
                this.f82499d = cardInsuranceStatusesViewModel$ViewModel;
            }

            /* renamed from: a */
            public final List invoke(C27637o oVar) {
                C41536l.m120489i(oVar, "cardsAndDetails");
                List c = this.f82499d.f82493e.mo72528c(oVar);
                C32343x.m95475p(this.f82499d.f82497i, c);
                return c;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33886a(CardInsuranceStatusesViewModel$ViewModel cardInsuranceStatusesViewModel$ViewModel) {
            super(1);
            this.f82498d = cardInsuranceStatusesViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            boolean z;
            C41536l.m120489i(num, "it");
            C26633o fw = this.f82498d.f82492d;
            if (num.intValue() == 2 || num.intValue() == 153 || num.intValue() == 6) {
                z = true;
            } else {
                z = false;
            }
            C40749p k0 = fw.mo65886c(z).mo95026k0(new C33889a(new C33887a(this.f82498d)));
            C41536l.m120488h(k0, "@HiltViewModel\n    class…RY = 0x99\n        }\n    }");
            return C31270e.m92879h(k0, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.viwmodel.CardInsuranceStatusesViewModel$ViewModel$b */
    public static final class C33888b {
        private C33888b() {
        }

        public /* synthetic */ C33888b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardInsuranceStatusesViewModel$ViewModel(C26633o oVar, C32038a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(oVar, "getCardsAndDetails");
        C41536l.m120489i(aVar, "insuranceMapper");
        this.f82492d = oVar;
        this.f82493e = aVar;
        C1644x xVar = new C1644x();
        this.f82494f = xVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C36138z(new C33886a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(it)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m99652ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Pl */
    public LiveData mo82081Pl() {
        return this.f82495g;
    }

    /* renamed from: So */
    public LiveData mo82082So() {
        return this.f82496h;
    }

    /* renamed from: iw */
    public final C36137y mo82083iw() {
        return this;
    }

    /* renamed from: jw */
    public void mo82084jw(long j) {
        Object obj;
        boolean z;
        Iterator it = C41356x.m119982J(this.f82497i, CardInsuranceStatusUiModel.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CardInsuranceStatusUiModel) obj).mo82055a() == j) {
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
        CardInsuranceStatusUiModel cardInsuranceStatusUiModel = (CardInsuranceStatusUiModel) obj;
        if (cardInsuranceStatusUiModel == null) {
            return;
        }
        if (cardInsuranceStatusUiModel.mo82062g() == C31901f.INSURED) {
            C37224b.m109965d(this.f82495g, cardInsuranceStatusUiModel);
            return;
        }
        C37224b.m109965d(this.f82496h, cardInsuranceStatusUiModel);
        C36143a.C36146c cVar = new C36143a.C36146c(cardInsuranceStatusUiModel.mo82057d());
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        cVar.mo88899c(F);
    }

    /* renamed from: rn */
    public LiveData mo82085rn() {
        return this.f82494f;
    }
}

package p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel;

import android.content.Context;
import androidx.lifecycle.C1644x;
import db0.C19957b;
import g91.C32343x;
import h91.C36162a;
import hd1.C41204a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ka0.C25695d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ob0.C26920a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositFeatureUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import p697zh.C19023a;
import p697zh.C19024b;
import p697zh.C19025c;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorRecommendationViewModel$ViewModel */
public final class DepositAdvisorRecommendationViewModel$ViewModel extends C21481a implements C19957b, C22947a {

    /* renamed from: d */
    private final Context f60344d;

    /* renamed from: e */
    private final C19957b f60345e = this;

    /* renamed from: f */
    private final C22947a f60346f = this;

    /* renamed from: g */
    private final C1644x f60347g = new C1644x();

    /* renamed from: h */
    private final C1644x f60348h = new C1644x();

    /* renamed from: i */
    private ArrayList f60349i;

    /* renamed from: j */
    private Long f60350j;

    /* renamed from: k */
    private String f60351k;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorRecommendationViewModel$ViewModel$a */
    public static final class C22935a {

        /* renamed from: a */
        private final ArrayList f60352a;

        /* renamed from: b */
        private final C25695d f60353b;

        /* renamed from: c */
        private final Long f60354c;

        public C22935a(ArrayList arrayList, C25695d dVar, Long l) {
            C41536l.m120489i(arrayList, "deposits");
            C41536l.m120489i(dVar, "selectedDepositType");
            this.f60352a = arrayList;
            this.f60353b = dVar;
            this.f60354c = l;
        }

        /* renamed from: a */
        public final ArrayList mo57066a() {
            return this.f60352a;
        }

        /* renamed from: b */
        public final C25695d mo57067b() {
            return this.f60353b;
        }

        /* renamed from: c */
        public final Long mo57068c() {
            return this.f60354c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22935a)) {
                return false;
            }
            C22935a aVar = (C22935a) obj;
            return C41536l.m120484d(this.f60352a, aVar.f60352a) && this.f60353b == aVar.f60353b && C41536l.m120484d(this.f60354c, aVar.f60354c);
        }

        public int hashCode() {
            int hashCode = ((this.f60352a.hashCode() * 31) + this.f60353b.hashCode()) * 31;
            Long l = this.f60354c;
            return hashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            ArrayList arrayList = this.f60352a;
            C25695d dVar = this.f60353b;
            Long l = this.f60354c;
            return "DepositAppNavConfig(deposits=" + arrayList + ", selectedDepositType=" + dVar + ", purpose=" + l + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorRecommendationViewModel$ViewModel$b */
    public static final class C22936b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Boolean.valueOf(((C19023a) obj2).mo47200g()), Boolean.valueOf(((C19023a) obj).mo47200g()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepositAdvisorRecommendationViewModel$ViewModel(Context context) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
        this.f60344d = context;
    }

    /* renamed from: iw */
    private final List m74334iw(ArrayList arrayList, C25695d dVar) {
        boolean z;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DepositTypeDetailsUiModel depositTypeDetailsUiModel = (DepositTypeDetailsUiModel) it.next();
            List<DepositFeatureUiModel> a = depositTypeDetailsUiModel.mo57214a();
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(a, i));
            for (DepositFeatureUiModel a2 : a) {
                arrayList3.add(new C19024b(C32343x.m95388F(a2.mo57204a(), new Object[0]), C19025c.C19026a.POSITIVE));
            }
            List<DepositFeatureUiModel> g = depositTypeDetailsUiModel.mo57221g();
            ArrayList arrayList4 = new ArrayList(C41343r.m119925u(g, i));
            for (DepositFeatureUiModel a3 : g) {
                arrayList4.add(new C19024b(C32343x.m95388F(a3.mo57204a(), new Object[0]), C19025c.C19026a.NEGATIVE));
            }
            String p = depositTypeDetailsUiModel.mo57229p();
            Image.Resource resource = new Image.Resource(C36162a.m107561b(depositTypeDetailsUiModel.mo57218e().name()), (Boolean) null, 2, (DefaultConstructorMarker) null);
            String F = C32343x.m95388F(depositTypeDetailsUiModel.mo57220f(), new Object[0]);
            if (depositTypeDetailsUiModel.mo57218e() == dVar) {
                z = true;
            } else {
                z = false;
            }
            C26920a aVar = C26920a.f67675a;
            arrayList2.add(new C19023a(p, resource, F, z, aVar.mo66215c(this.f60344d, C32343x.m95388F("applications.deposits.recommended.deposit.int.rate", new Object[0]), C32343x.m95388F(depositTypeDetailsUiModel.mo57225j(), new Object[0])), aVar.mo66215c(this.f60344d, C32343x.m95388F("applications.deposits.recommended.deposit.IRR.rate", new Object[0]), C32343x.m95388F(depositTypeDetailsUiModel.mo57222h(), new Object[0])), C41358y.m120023m0(arrayList3, arrayList4)));
            it = it;
            i = 10;
        }
        return arrayList2;
    }

    /* renamed from: Il */
    public void mo48330Il() {
        Object obj;
        ArrayList arrayList = this.f60349i;
        ArrayList arrayList2 = null;
        if (arrayList == null) {
            C41536l.m120506z("deposits");
            arrayList = null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((DepositTypeDetailsUiModel) obj).mo57229p(), this.f60351k)) {
                break;
            }
        }
        DepositTypeDetailsUiModel depositTypeDetailsUiModel = (DepositTypeDetailsUiModel) obj;
        if (depositTypeDetailsUiModel != null) {
            C1644x fw = mo57059A0();
            ArrayList arrayList3 = this.f60349i;
            if (arrayList3 == null) {
                C41536l.m120506z("deposits");
            } else {
                arrayList2 = arrayList3;
            }
            fw.mo4823o(C32343x.m95466m(new C22935a(arrayList2, depositTypeDetailsUiModel.mo57218e(), this.f60350j)));
        }
    }

    /* renamed from: M0 */
    public void mo48331M0(String str) {
        C41536l.m120489i(str, "id");
        this.f60351k = str;
    }

    /* renamed from: dw */
    public C1644x mo57064h0() {
        return this.f60347g;
    }

    /* renamed from: ew */
    public final C19957b mo57061ew() {
        return this.f60345e;
    }

    /* renamed from: fw */
    public C1644x mo57059A0() {
        return this.f60348h;
    }

    /* renamed from: gw */
    public final C22947a mo57063gw() {
        return this.f60346f;
    }

    /* renamed from: hw */
    public void mo57065hw(ArrayList arrayList, C25695d dVar, long j) {
        C41536l.m120489i(arrayList, "deposits");
        this.f60349i = arrayList;
        this.f60350j = Long.valueOf(j);
        mo57064h0().mo4826r(C41358y.m120030t0(m74334iw(arrayList, dVar), new C22936b()));
    }
}

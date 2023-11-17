package p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import hd1.C41204a;
import hv0.C36233f;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lv0.C37168k;
import lv0.C37169l;
import lv0.C37170m;
import mv0.C37267a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.openbanking.presentation.BankUiModel;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.SelectBankViewModel$ViewModel */
public final class SelectBankViewModel$ViewModel extends C21481a implements C37169l, C37168k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C36233f f81489d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C37267a f81490e;

    /* renamed from: f */
    private final C37169l f81491f = this;

    /* renamed from: g */
    private final C37168k f81492g = this;

    /* renamed from: h */
    private final C1644x f81493h;

    /* renamed from: i */
    private final C1644x f81494i;

    /* renamed from: j */
    private final C40767b f81495j;

    /* renamed from: k */
    private final C1644x f81496k;

    /* renamed from: l */
    private final C1644x f81497l;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.SelectBankViewModel$ViewModel$a */
    static final class C33351a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectBankViewModel$ViewModel f81498d;

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.SelectBankViewModel$ViewModel$a$a */
        /* synthetic */ class C33352a extends C41535k implements C43075l {
            C33352a(Object obj) {
                super(1, obj, C37267a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C37267a) this.receiver).mo90386a(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33351a(SelectBankViewModel$ViewModel selectBankViewModel$ViewModel) {
            super(1);
            this.f81498d = selectBankViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p k0 = this.f81498d.f81489d.mo88975a().mo95075O().mo95026k0(new C33385f(new C33352a(this.f81498d.f81490e)));
            C41536l.m120488h(k0, "getBankList().toObservable().map(mapper::convert)");
            return C31270e.m92879h(k0, num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectBankViewModel$ViewModel(C36233f fVar, C37267a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(fVar, "getBankList");
        C41536l.m120489i(aVar, "mapper");
        this.f81489d = fVar;
        this.f81490e = aVar;
        C1644x xVar = new C1644x();
        this.f81493h = xVar;
        this.f81494i = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.f81495j = h1;
        this.f81496k = new C1644x();
        this.f81497l = new C1644x();
        C40749p L0 = C40749p.m118047l0(h1, onRefresh()).mo94989L0(new C37170m(new C33351a(this)));
        C41536l.m120488h(L0, "merge(loadBankListSubjec…ervable(it)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m98050ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Qs */
    public void mo79174Qs(BankUiModel bankUiModel) {
        C41536l.m120489i(bankUiModel, "bank");
        mo79177h9().mo4826r(bankUiModel);
    }

    /* renamed from: g4 */
    public void mo79176g4() {
        mo79175Z7().mo4826r(mo79177h9().mo4814f());
    }

    /* renamed from: hw */
    public final C37168k mo79178hw() {
        return this.f81492g;
    }

    /* renamed from: iw */
    public C1644x mo79177h9() {
        return this.f81494i;
    }

    /* renamed from: jw */
    public C1644x mo79184t5() {
        return this.f81497l;
    }

    /* renamed from: kw */
    public C1644x mo79175Z7() {
        return this.f81496k;
    }

    /* renamed from: lw */
    public final C37169l mo79182lw() {
        return this.f81491f;
    }

    /* renamed from: oo */
    public LiveData mo79183oo() {
        return this.f81493h;
    }

    /* renamed from: uc */
    public void mo79185uc() {
        this.f81495j.onNext(1);
    }
}

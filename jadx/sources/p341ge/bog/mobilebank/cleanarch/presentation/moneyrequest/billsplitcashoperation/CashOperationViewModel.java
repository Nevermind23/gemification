package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation;

import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import com.github.mikephil.charting.utils.Utils;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41212c;
import he1.C41238w;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p773gv.C24788d;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation.CashOperationViewModel */
public final class CashOperationViewModel extends C21481a {

    /* renamed from: d */
    private final C24788d f58211d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1644x f58212e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f58213f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1639v f58214g;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation.CashOperationViewModel$a */
    static final class C21825a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CashOperationViewModel f58215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21825a(CashOperationViewModel cashOperationViewModel) {
            super(1);
            this.f58215d = cashOperationViewModel;
        }

        /* renamed from: a */
        public final void mo54415a(String str) {
            C1639v fw = this.f58215d.f58214g;
            CashOperationViewModel cashOperationViewModel = this.f58215d;
            C41536l.m120488h(str, "it");
            String str2 = (String) this.f58215d.f58213f.mo4814f();
            if (str2 == null) {
                str2 = "";
            }
            fw.mo4826r(Boolean.valueOf(cashOperationViewModel.m70717iw(str, str2)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54415a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation.CashOperationViewModel$b */
    static final class C21826b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CashOperationViewModel f58216d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21826b(CashOperationViewModel cashOperationViewModel) {
            super(1);
            this.f58216d = cashOperationViewModel;
        }

        /* renamed from: a */
        public final void mo54416a(String str) {
            C1639v fw = this.f58216d.f58214g;
            CashOperationViewModel cashOperationViewModel = this.f58216d;
            String str2 = (String) cashOperationViewModel.f58212e.mo4814f();
            if (str2 == null) {
                str2 = "";
            }
            C41536l.m120488h(str, "it");
            fw.mo4826r(Boolean.valueOf(cashOperationViewModel.m70717iw(str2, str)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54416a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation.CashOperationViewModel$c */
    static final class C21827c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58217a;

        C21827c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58217a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58217a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58217a.invoke(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CashOperationViewModel(C24788d dVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(dVar, "addCashOperation");
        this.f58211d = dVar;
        C1644x xVar = new C1644x("");
        this.f58212e = xVar;
        C1644x xVar2 = new C1644x("");
        this.f58213f = xVar2;
        C1639v vVar = new C1639v();
        vVar.mo4826r(Boolean.FALSE);
        this.f58214g = vVar;
        vVar.mo4956s(xVar, new C21827c(new C21825a(this)));
        vVar.mo4956s(xVar2, new C21827c(new C21826b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public final boolean m70717iw(String str, String str2) {
        if ((str.length() > 0) && Double.parseDouble(str) > Utils.DOUBLE_EPSILON) {
            if (str2.length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hw */
    public final void mo54411hw() {
        C24788d dVar = this.f58211d;
        Object f = this.f58213f.mo4814f();
        C41536l.m120486f(f);
        Object f2 = this.f58212e.mo4814f();
        C41536l.m120486f(f2);
        C41205b E = dVar.mo63206a((String) f, Double.parseDouble((String) f2)).mo94886E();
        C41536l.m120488h(E, "addCashOperation(_commen…             .subscribe()");
        addDisposable(E);
    }

    /* renamed from: jw */
    public final C1639v mo54412jw() {
        return this.f58214g;
    }

    /* renamed from: kw */
    public final void mo54413kw(String str) {
        C41536l.m120489i(str, "amount");
        this.f58212e.mo4826r(str);
    }

    /* renamed from: lw */
    public final void mo54414lw(String str) {
        C41536l.m120489i(str, "comment");
        this.f58213f.mo4826r(str);
    }
}

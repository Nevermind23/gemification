package is0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import is0.C36493b;
import is0.C36515j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.loans.presentation.renameloan.model.RenameLoanData;
import pr0.C37948d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: is0.d */
public final class C36497d extends C36492a {

    /* renamed from: Q */
    public static final C36498a f88000Q = new C36498a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C37948d f88001K;

    /* renamed from: L */
    private final C41217g f88002L = C41219i.m119470b(new C36500c(this));

    /* renamed from: M */
    private final C41217g f88003M = C41219i.m119470b(new C36499b(this));

    /* renamed from: N */
    public C36515j.C36517b f88004N;

    /* renamed from: O */
    private final C41217g f88005O;

    /* renamed from: P */
    private String f88006P;

    /* renamed from: is0.d$a */
    public static final class C36498a {
        private C36498a() {
        }

        public /* synthetic */ C36498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36497d mo89296a(RenameLoanData renameLoanData, String str) {
            C41536l.m120489i(renameLoanData, "renameLoanData");
            C41536l.m120489i(str, "currentLoanName");
            C36497d dVar = new C36497d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("RENAME_LOAN_DATA_KEY", renameLoanData), C41233s.m119492a("CURRENT_LOAN_NAME_KEY", str)));
            return dVar;
        }
    }

    /* renamed from: is0.d$b */
    static final class C36499b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36497d f88007d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36499b(C36497d dVar) {
            super(0);
            this.f88007d = dVar;
        }

        public final String invoke() {
            Bundle arguments = this.f88007d.getArguments();
            String string = arguments != null ? arguments.getString("CURRENT_LOAN_NAME_KEY") : null;
            C41536l.m120486f(string);
            return string;
        }
    }

    /* renamed from: is0.d$c */
    static final class C36500c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36497d f88008d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36500c(C36497d dVar) {
            super(0);
            this.f88008d = dVar;
        }

        /* renamed from: b */
        public final RenameLoanData invoke() {
            Bundle arguments = this.f88008d.getArguments();
            RenameLoanData renameLoanData = arguments != null ? (RenameLoanData) arguments.getParcelable("RENAME_LOAN_DATA_KEY") : null;
            C41536l.m120486f(renameLoanData);
            return renameLoanData;
        }
    }

    /* renamed from: is0.d$d */
    static final class C36501d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f88009a;

        C36501d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f88009a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f88009a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f88009a.invoke(obj);
        }
    }

    /* renamed from: is0.d$e */
    static final class C36502e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36497d f88010d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36502e(C36497d dVar) {
            super(1);
            this.f88010d = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f88010d.m108238i2().f91105f;
            C41536l.m120488h(bool, "loadingState");
            button.setLoading(bool.booleanValue());
            this.f88010d.mo4586v1(!bool.booleanValue());
        }
    }

    /* renamed from: is0.d$f */
    static final class C36503f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36497d f88011d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36503f(C36497d dVar) {
            super(1);
            this.f88011d = dVar;
        }

        /* renamed from: a */
        public final void mo89301a(C36493b bVar) {
            C41536l.m120489i(bVar, "event");
            if (bVar instanceof C36493b.C36494a) {
                this.f88011d.handleError(((C36493b.C36494a) bVar).mo89292a());
            } else if (bVar instanceof C36493b.C36495b) {
                this.f88011d.m108242n2((C36493b.C36495b) bVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89301a((C36493b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: is0.d$g */
    public static final class C36504g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f88012d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36504g(Fragment fragment) {
            super(0);
            this.f88012d = fragment;
        }

        public final Fragment invoke() {
            return this.f88012d;
        }
    }

    /* renamed from: is0.d$h */
    public static final class C36505h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f88013d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36505h(C43064a aVar) {
            super(0);
            this.f88013d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f88013d.invoke();
        }
    }

    /* renamed from: is0.d$i */
    public static final class C36506i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f88014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36506i(C41217g gVar) {
            super(0);
            this.f88014d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f88014d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: is0.d$j */
    public static final class C36507j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f88015d;

        /* renamed from: e */
        final /* synthetic */ C41217g f88016e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36507j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f88015d = aVar;
            this.f88016e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f88015d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f88016e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: is0.d$k */
    static final class C36508k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36497d f88017d;

        /* renamed from: is0.d$k$a */
        static final class C36509a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C36497d f88018d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36509a(C36497d dVar) {
                super(0);
                this.f88018d = dVar;
            }

            /* renamed from: b */
            public final C36515j invoke() {
                C36515j.C36517b l2 = this.f88018d.mo89295l2();
                RenameLoanData g2 = this.f88018d.m108240k2();
                C41536l.m120488h(g2, "data");
                return l2.mo32832a(g2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36508k(C36497d dVar) {
            super(0);
            this.f88017d = dVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C36509a(this.f88017d));
        }
    }

    public C36497d() {
        C36508k kVar = new C36508k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C36505h(new C36504g(this)));
        this.f88005O = C1514j0.m5374c(this, C41520a0.m120436b(C36515j.class), new C36506i(a), new C36507j((C43064a) null, a), kVar);
        this.f88006P = C32343x.m95388F("text.loans.change.name.action.sheet.header", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final C37948d m108238i2() {
        C37948d dVar = this.f88001K;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: j2 */
    private final String m108239j2() {
        return (String) this.f88003M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final RenameLoanData m108240k2() {
        return (RenameLoanData) this.f88002L.getValue();
    }

    /* renamed from: m2 */
    private final C36515j m108241m2() {
        return (C36515j) this.f88005O.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final void m108242n2(C36493b.C36495b bVar) {
        C1533o.m5445b(this, "INPUT_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("INPUT_KEY", bVar.mo89293a())));
        mo4577k1();
    }

    /* renamed from: o2 */
    private final void m108243o2() {
        C37948d i2 = m108238i2();
        i2.f91105f.setOnClickListener(new C36496c(this, i2));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m108244p2(C36497d dVar, C37948d dVar2, View view) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(dVar2, "$this_with");
        dVar.m108241m2().mo89306gw().mo89303ng(dVar2.f91104e.getInputText());
    }

    /* renamed from: q2 */
    private final void m108245q2() {
        C36513h hw = m108241m2().mo89307hw();
        hw.mo89304e().mo4819k(getViewLifecycleOwner(), new C36501d(new C36502e(this)));
        LiveData mi = hw.mo89305mi();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(mi, viewLifecycleOwner, new C36503f(this));
    }

    /* renamed from: r2 */
    private final void m108246r2() {
        C37948d i2 = m108238i2();
        Input input = i2.f91104e;
        String j2 = m108239j2();
        C41536l.m120488h(j2, "currentLoanName");
        input.setInputText(j2);
        i2.f91104e.getTextInput().setSelection(i2.f91104e.getInputText().length());
        i2.f91104e.setHintText((CharSequence) C32343x.m95388F("text.loans.change.name.action.sheet.label", new Object[0]));
        i2.f91105f.setButtonText(C32343x.m95388F("text.loans.change.name.action.sheet.button", new Object[0]));
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f88006P;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f88001K = C37948d.m111536d(layoutInflater, viewGroup, true);
    }

    /* renamed from: b */
    public void mo26371b() {
        if (!C41536l.m120484d(m108241m2().mo89304e().mo4814f(), Boolean.TRUE)) {
            super.mo26371b();
        }
    }

    /* renamed from: l2 */
    public final C36515j.C36517b mo89295l2() {
        C36515j.C36517b bVar = this.f88004N;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f88001K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m108238i2().f91104e.getTextInput().requestFocus();
        m108246r2();
        m108243o2();
        m108245q2();
    }
}

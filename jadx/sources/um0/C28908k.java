package um0;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import om0.C27051b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.junior.presentation.model.FinancialContactData;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p380ck.C10464h;
import p603si.C17799b;
import p725cr.C19788a;
import ue1.C43064a;
import ue1.C43075l;
import zm0.C30363j;
import zm0.C30365k;
import zm0.C30372r;

/* renamed from: um0.k */
public final class C28908k extends C19788a {

    /* renamed from: L */
    public static final C28909a f73761L = new C28909a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C27051b f73762H;

    /* renamed from: I */
    private final C41217g f73763I = C1514j0.m5374c(this, C41520a0.m120436b(C30372r.class), new C28921m(this), new C28922n((C43064a) null, this), new C28923o(this));

    /* renamed from: J */
    private final C41217g f73764J = C41219i.m119470b(new C28915g(this));

    /* renamed from: K */
    private final C41217g f73765K = C41219i.m119470b(new C28914f(this));

    /* renamed from: um0.k$a */
    public static final class C28909a {
        private C28909a() {
        }

        public /* synthetic */ C28909a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C28908k m88553b(C28909a aVar, NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow, FinancialContactData financialContactData, int i, Object obj) {
            if ((i & 2) != 0) {
                financialContactData = null;
            }
            return aVar.mo68666a(navigatorConstants$JuniorFlow, financialContactData);
        }

        /* renamed from: a */
        public final C28908k mo68666a(NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow, FinancialContactData financialContactData) {
            C41536l.m120489i(navigatorConstants$JuniorFlow, "flow");
            C28908k kVar = new C28908k();
            kVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_FLOW", navigatorConstants$JuniorFlow), C41233s.m119492a("DATA", financialContactData)));
            return kVar;
        }
    }

    /* renamed from: um0.k$b */
    public /* synthetic */ class C28910b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f73766a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow[] r0 = p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow r1 = p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow.FINANCIAL_NUMBER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow r1 = p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow.ACTIVATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f73766a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: um0.C28908k.C28910b.<clinit>():void");
        }
    }

    /* renamed from: um0.k$c */
    /* synthetic */ class C28911c extends C41535k implements C43075l {
        C28911c(Object obj) {
            super(1, obj, C28908k.class, "onValidateOtpResult", "onValidateOtpResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo68667b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C28908k) this.receiver).m88549r2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68667b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um0.k$d */
    static final class C28912d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28908k f73767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28912d(C28908k kVar) {
            super(1);
            this.f73767d = kVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f73767d.m88550s2(false);
            this.f73767d.handleError(th);
        }
    }

    /* renamed from: um0.k$e */
    static final class C28913e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28908k f73768d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28913e(C28908k kVar) {
            super(1);
            this.f73768d = kVar;
        }

        /* renamed from: a */
        public final void mo68669a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C28908k kVar = this.f73768d;
            C1533o.m5445b(kVar, "REQUEST_KEY_ONE_TIME_CODE", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_ONE_TIME_CODE", kVar.m88542k2().f67933h.getInputText())));
            this.f73768d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68669a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um0.k$f */
    static final class C28914f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C28908k f73769d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28914f(C28908k kVar) {
            super(0);
            this.f73769d = kVar;
        }

        /* renamed from: b */
        public final FinancialContactData invoke() {
            Bundle arguments = this.f73769d.getArguments();
            FinancialContactData financialContactData = arguments != null ? (FinancialContactData) arguments.getParcelable("DATA") : null;
            C41536l.m120486f(financialContactData);
            return financialContactData;
        }
    }

    /* renamed from: um0.k$g */
    static final class C28915g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C28908k f73770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28915g(C28908k kVar) {
            super(0);
            this.f73770d = kVar;
        }

        /* renamed from: b */
        public final NavigatorConstants$JuniorFlow invoke() {
            Bundle arguments = this.f73770d.getArguments();
            NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow = arguments != null ? (NavigatorConstants$JuniorFlow) arguments.getParcelable("ARG_FLOW") : null;
            C41536l.m120486f(navigatorConstants$JuniorFlow);
            return navigatorConstants$JuniorFlow;
        }
    }

    /* renamed from: um0.k$h */
    public static final class C28916h implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C27051b f73771d;

        public C28916h(C27051b bVar) {
            this.f73771d = bVar;
        }

        public void afterTextChanged(Editable editable) {
            C27051b bVar = this.f73771d;
            bVar.f67932g.setEnabled(bVar.f67933h.mo35918a());
            C27051b bVar2 = this.f73771d;
            bVar2.f67932g.setEnabled(bVar2.f67933h.mo35918a());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: um0.k$i */
    public static final class C28917i implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C27051b f73772d;

        public C28917i(C27051b bVar) {
            this.f73772d = bVar;
        }

        public void afterTextChanged(Editable editable) {
            C27051b bVar = this.f73772d;
            bVar.f67932g.setEnabled(bVar.f67933h.mo35918a());
            C27051b bVar2 = this.f73772d;
            bVar2.f67932g.setEnabled(bVar2.f67933h.mo35918a());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: um0.k$j */
    static final class C28918j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28908k f73773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28918j(C28908k kVar) {
            super(1);
            this.f73773d = kVar;
        }

        /* renamed from: a */
        public final void mo68678a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73773d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68678a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um0.k$k */
    static final class C28919k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28908k f73774d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28919k(C28908k kVar) {
            super(1);
            this.f73774d = kVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f73774d.handleError(th);
        }
    }

    /* renamed from: um0.k$l */
    static final class C28920l implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f73775a;

        C28920l(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f73775a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f73775a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f73775a.invoke(obj);
        }
    }

    /* renamed from: um0.k$m */
    public static final class C28921m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f73776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28921m(Fragment fragment) {
            super(0);
            this.f73776d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f73776d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: um0.k$n */
    public static final class C28922n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f73777d;

        /* renamed from: e */
        final /* synthetic */ Fragment f73778e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28922n(C43064a aVar, Fragment fragment) {
            super(0);
            this.f73777d = aVar;
            this.f73778e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f73777d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f73778e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: um0.k$o */
    public static final class C28923o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f73779d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28923o(Fragment fragment) {
            super(0);
            this.f73779d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f73779d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: j2 */
    private final void m88541j2() {
        C30365k Ew = m88545n2().mo70730Ew();
        Ew.mo70727xh().mo4819k(getViewLifecycleOwner(), new C28920l(new C28911c(this)));
        LiveData Lg = Ew.mo70708Lg();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Lg, viewLifecycleOwner, new C28912d(this));
        LiveData Q4 = Ew.mo70709Q4();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Q4, viewLifecycleOwner2, new C28913e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C27051b m88542k2() {
        C27051b bVar = this.f73762H;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: l2 */
    private final FinancialContactData m88543l2() {
        return (FinancialContactData) this.f73765K.getValue();
    }

    /* renamed from: m2 */
    private final NavigatorConstants$JuniorFlow m88544m2() {
        return (NavigatorConstants$JuniorFlow) this.f73764J.getValue();
    }

    /* renamed from: n2 */
    private final C30372r m88545n2() {
        return (C30372r) this.f73763I.getValue();
    }

    /* renamed from: o2 */
    private final void m88546o2(NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow) {
        C27051b k2 = m88542k2();
        k2.f67932g.setEnabled(false);
        int i = C28910b.f73766a[navigatorConstants$JuniorFlow.ordinal()];
        if (i == 1) {
            mo26370a2(C32343x.m95388F("child.financial.number.otp.actionsheet.header", new Object[0]));
            k2.f67931f.setTitle(C32343x.m95388F("child.financial.number.otp.actionsheet.title", new Object[0]));
            k2.f67931f.setText(C32343x.m95388F("child.financial.number.otp.actionsheet.description", new Object[0]));
            k2.f67932g.setButtonText(C32343x.m95388F("child.financial.number.otp.actionsheet.button", new Object[0]));
            k2.f67933h.setHintText((CharSequence) C32343x.m95388F("child.financial.number.otp.actionsheet.otp.desc", new Object[0]));
            Input input = k2.f67933h;
            C41536l.m120488h(input, "otpInput");
            Input.m50261f(input, new C17799b.C17801b(4, 0, 2, (DefaultConstructorMarker) null), false, false, false, 14, (Object) null);
            k2.f67933h.getTextInput().addTextChangedListener(new C28916h(k2));
            k2.f67932g.setOnClickListener(new C28906i(this));
        } else if (i == 2) {
            mo26370a2(C32343x.m95388F("text.junior.child.otp.popup.header", new Object[0]));
            k2.f67931f.setTitle(C32343x.m95388F("text.junior.child.otp.popup.title", new Object[0]));
            k2.f67931f.setText(C32343x.m95388F("text.junior.child.otp.popup.message", new Object[0]));
            k2.f67932g.setButtonText(C32343x.m95388F("text.junior.child.otp.popup.button", new Object[0]));
            k2.f67933h.setHintText((CharSequence) C32343x.m95388F("text.junior.child.otp.popup.hint", new Object[0]));
            Input input2 = k2.f67933h;
            C41536l.m120488h(input2, "otpInput");
            Input.m50261f(input2, new C17799b.C17801b(4, 0, 2, (DefaultConstructorMarker) null), false, false, false, 14, (Object) null);
            k2.f67933h.getTextInput().addTextChangedListener(new C28917i(k2));
            k2.f67932g.setOnClickListener(new C28907j(this, k2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m88547p2(C28908k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        C32343x.m95395I0(kVar, "sCool_number", (String) null, "parent_sca", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        C30363j.C30364a.m91548a(kVar.m88545n2().mo70728Cw(), kVar.m88543l2().mo63049b(), kVar.m88543l2().mo63048a(), kVar.m88542k2().f67933h.getInputText(), kVar.m88543l2().mo63050d(), (String) null, (String) null, (String) null, 112, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m88548q2(C28908k kVar, C27051b bVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(bVar, "$this_with");
        kVar.m88545n2().mo70728Cw().mo70696Wh(bVar.f67933h.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m88549r2(C31128a aVar) {
        m88550s2(aVar instanceof C31128a.C31130b);
        C31132b.m92648j(aVar, (int[]) null, new C28918j(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C28919k(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m88550s2(boolean z) {
        m88542k2().f67933h.setEnabled(!z);
        m88542k2().f67932g.setLoading(z);
    }

    /* renamed from: t2 */
    private final void m88551t2() {
        m88546o2(m88544m2());
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f73762H = C27051b.m83876d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f73762H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m88551t2();
        m88541j2();
    }
}

package wm0;

import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import cf1.C40419j;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import om0.C27053d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.junior.data.model.VerifyChildFinancialPhoneParams;
import p341ge.bog.mobilebank.junior.presentation.model.FinancialContactData;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p420fh.C12902d;
import p434gh.C15278a;
import p603si.C17799b;
import sm0.C28249a;
import ue1.C43064a;
import ue1.C43075l;
import um0.C28908k;
import zm0.C30363j;
import zm0.C30365k;
import zm0.C30372r;

/* renamed from: wm0.d */
public final class C29479d extends C35651n1 implements C41185v.C41186a {

    /* renamed from: h */
    public static final C29480a f74594h = new C29480a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f74595d = C1514j0.m5374c(this, C41520a0.m120436b(C30372r.class), new C29495p(this), new C29496q((C43064a) null, this), new C29497r(this));

    /* renamed from: e */
    private C27053d f74596e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f74597f = "";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f74598g;

    /* renamed from: wm0.d$a */
    public static final class C29480a {
        private C29480a() {
        }

        public /* synthetic */ C29480a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C29479d mo69340a() {
            return new C29479d();
        }
    }

    /* renamed from: wm0.d$b */
    static final class C29481b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29479d f74599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29481b(C29479d dVar) {
            super(1);
            this.f74599d = dVar;
        }

        /* renamed from: a */
        public final void mo69341a(C28249a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f74599d.f74597f = aVar.mo67778a();
            this.f74599d.m89605A1().mo70728Cw().mo70702qq();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69341a((C28249a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.d$c */
    static final class C29482c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29479d f74600d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29482c(C29479d dVar) {
            super(1);
            this.f74600d = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f74600d.handleError(th);
        }
    }

    /* renamed from: wm0.d$d */
    static final class C29483d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29479d f74601d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29483d(C29479d dVar) {
            super(1);
            this.f74601d = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f74601d.handleError(th);
        }
    }

    /* renamed from: wm0.d$e */
    static final class C29484e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29479d f74602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29484e(C29479d dVar) {
            super(1);
            this.f74602d = dVar;
        }

        /* renamed from: a */
        public final void mo69344a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f74602d.m89605A1().mo70728Cw().mo70698ei(this.f74602d.m89634z1().f67941h.getInputText());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69344a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.d$f */
    static final class C29485f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29479d f74603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29485f(C29479d dVar) {
            super(1);
            this.f74603d = dVar;
        }

        /* renamed from: a */
        public final void mo69345a(JuniorRequestDataUiModel juniorRequestDataUiModel) {
            long j;
            if (juniorRequestDataUiModel != null) {
                C29479d dVar = this.f74603d;
                Long b = juniorRequestDataUiModel.mo52340b();
                if (b != null) {
                    j = b.longValue();
                } else {
                    j = 0;
                }
                dVar.f74598g = j;
                Input input = dVar.m89634z1().f67940g;
                String d = juniorRequestDataUiModel.mo52341d();
                String e = juniorRequestDataUiModel.mo52343e();
                input.setInputText(d + " " + e);
                PageDescriptionView pageDescriptionView = dVar.m89634z1().f67943j;
                String d2 = juniorRequestDataUiModel.mo52341d();
                String e2 = juniorRequestDataUiModel.mo52343e();
                pageDescriptionView.setText(C32343x.m95388F("child.financial.number.page.agreement.text", d2 + " " + e2));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69345a((JuniorRequestDataUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.d$g */
    /* synthetic */ class C29486g extends C41535k implements C43075l {
        C29486g(Object obj) {
            super(1, obj, C29479d.class, "handleChildRequest", "handleChildRequest(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo69346b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C29479d) this.receiver).m89606B1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69346b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.d$h */
    static final class C29487h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29479d f74604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29487h(C29479d dVar) {
            super(1);
            this.f74604d = dVar;
        }

        /* renamed from: a */
        public final void mo69347a(C41238w wVar) {
            boolean z;
            C41536l.m120489i(wVar, "it");
            if (this.f74604d.f74597f.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C28908k.f73761L.mo68666a(NavigatorConstants$JuniorFlow.FINANCIAL_NUMBER, new FinancialContactData(this.f74604d.m89634z1().f67941h.getInputText(), this.f74604d.f74597f, this.f74604d.f74598g)).mo4576A1(this.f74604d.getChildFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69347a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.d$i */
    /* synthetic */ class C29488i extends C41535k implements C43075l {
        C29488i(Object obj) {
            super(1, obj, C29479d.class, "openSca", "openSca(Lge/bog/mobilebank/junior/data/model/VerifyChildFinancialPhoneParams;)V", 0);
        }

        /* renamed from: b */
        public final void mo69348b(VerifyChildFinancialPhoneParams verifyChildFinancialPhoneParams) {
            C41536l.m120489i(verifyChildFinancialPhoneParams, "p0");
            ((C29479d) this.receiver).m89611G1(verifyChildFinancialPhoneParams);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69348b((VerifyChildFinancialPhoneParams) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.d$j */
    /* synthetic */ class C29489j extends C41535k implements C43075l {
        C29489j(Object obj) {
            super(1, obj, C29479d.class, "handleVerifyChildFinancialPhoneResult", "handleVerifyChildFinancialPhoneResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo69349b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C29479d) this.receiver).m89607C1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69349b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.d$k */
    /* synthetic */ class C29490k extends C41535k implements C43075l {
        C29490k(Object obj) {
            super(1, obj, C29479d.class, "onConfirmationResult", "onConfirmationResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo69350b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C29479d) this.receiver).m89610F1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69350b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.d$l */
    static final class C29491l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29479d f74605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29491l(C29479d dVar) {
            super(1);
            this.f74605d = dVar;
        }

        /* renamed from: a */
        public final void mo69351a(boolean z) {
            if (z) {
                this.f74605d.m89616L1(C32343x.m95388F("text.junior.child.phone.validation.same.as.parent.error", new Object[0]));
            } else {
                this.f74605d.m89633y1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69351a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.d$m */
    static final class C29492m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29479d f74606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29492m(C29479d dVar) {
            super(1);
            this.f74606d = dVar;
        }

        /* renamed from: a */
        public final void mo69352a(C41238w wVar) {
            this.f74606d.m89634z1().f67939f.getButton().setLoading(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69352a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.d$n */
    static final class C29493n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29479d f74607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29493n(C29479d dVar) {
            super(1);
            this.f74607d = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f74607d.handleError(th);
            this.f74607d.m89634z1().f67939f.getButton().setLoading(false);
        }
    }

    /* renamed from: wm0.d$o */
    static final class C29494o implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f74608a;

        C29494o(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f74608a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f74608a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f74608a.invoke(obj);
        }
    }

    /* renamed from: wm0.d$p */
    public static final class C29495p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29495p(Fragment fragment) {
            super(0);
            this.f74609d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f74609d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: wm0.d$q */
    public static final class C29496q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74610d;

        /* renamed from: e */
        final /* synthetic */ Fragment f74611e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29496q(C43064a aVar, Fragment fragment) {
            super(0);
            this.f74610d = aVar;
            this.f74611e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f74610d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f74611e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: wm0.d$r */
    public static final class C29497r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74612d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29497r(Fragment fragment) {
            super(0);
            this.f74612d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f74612d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final C30372r m89605A1() {
        return (C30372r) this.f74595d.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m89606B1(C31128a aVar) {
        FixedButtonView fixedButtonView = m89634z1().f67939f;
        m89634z1().f67939f.getButton().setLoading(aVar instanceof C31128a.C31130b);
        C31132b.m92648j(aVar, (int[]) null, new C29481b(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C29482c(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final void m89607C1(C31128a aVar) {
        m89634z1().f67939f.getButton().setLoading(aVar instanceof C31128a.C31130b);
        C31132b.m92643e(aVar, (int[]) null, new C29483d(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C29484e(this), 1, (Object) null);
    }

    /* renamed from: D1 */
    private final void m89608D1() {
        IBinder iBinder;
        Object systemService = requireContext().getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View view = getView();
        if (view != null) {
            iBinder = view.getWindowToken();
        } else {
            iBinder = null;
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m89609E1(C29479d dVar, String str, String str2, String str3, String str4, Bundle bundle) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(str, "$operationReference");
        C41536l.m120489i(str2, "$operationId");
        C41536l.m120489i(str3, "$scaAuthCode");
        C41536l.m120489i(str4, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "data");
        C30363j Cw = dVar.m89605A1().mo70728Cw();
        String inputText = dVar.m89634z1().f67941h.getInputText();
        long j = dVar.f74598g;
        String string = bundle.getString("RESULT_KEY_ONE_TIME_CODE", "");
        C41536l.m120488h(string, "data.getString(RESULT_KEY_ONE_TIME_CODE, \"\")");
        Cw.mo70703uj(inputText, j, string, dVar.f74597f, str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final void m89610F1(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C29492m(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C29493n(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public final void m89611G1(VerifyChildFinancialPhoneParams verifyChildFinancialPhoneParams) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, verifyChildFinancialPhoneParams.getServiceId(), m89605A1().mo70729Dw(verifyChildFinancialPhoneParams), (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        e.mo4576A1(childFragmentManager, (String) null);
    }

    /* renamed from: H1 */
    private final void m89612H1() {
        m89634z1().f67939f.setOnClickListener(new C29477b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m89613I1(C29479d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m89605A1().mo70728Cw().mo70699fm(dVar.m89634z1().f67941h.getInputText());
    }

    /* renamed from: J1 */
    private final void m89614J1() {
        PageDescriptionView pageDescriptionView = m89634z1().f67938e;
        pageDescriptionView.setTitle(C32343x.m95388F("child.financial.number.page.title", new Object[0]));
        pageDescriptionView.setText(C32343x.m95388F("child.financial.number.page.description", new Object[0]));
        m89634z1().f67940g.setHintText((CharSequence) C32343x.m95388F("child.financial.number.page.name", new Object[0]));
        m89634z1().f67941h.setHintText((CharSequence) C32343x.m95388F("child.financial.number.page.phone", new Object[0]));
        m89634z1().f67939f.getButton().setButtonText(C32343x.m95388F("child.financial.number.page.button.next", new Object[0]));
        CheckboxView checkboxView = m89634z1().f67942i;
        C41536l.m120488h(checkboxView, "binding.termsCheckbox");
        CheckboxView.m49731h(checkboxView, C32343x.m95388F("child.financial.number.page.agree", new Object[0]), (String) null, 2, (Object) null);
    }

    /* renamed from: K1 */
    private final void m89615K1() {
        Input input = m89634z1().f67941h;
        C41536l.m120488h(input, "phoneInput");
        Input.m50261f(input, new C17799b.C17807h(new C40419j("^([0-9]{9}|[0-9]{12}|\\+[0-9]{12})$")), false, false, false, 14, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final void m89616L1(String str) {
        FragmentManager supportFragmentManager;
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_SINGLE_BUTTON);
        dVar.mo35639Q1(str);
        dVar.mo35644X1(C32343x.m95388F("text.junior.child.phone.validation.same.as.parent.error.dialog.button", new Object[0]));
        dVar.mo4586v1(false);
        dVar.mo35643V1(new C29476a(dVar));
        C1505h activity = dVar.getActivity();
        if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
            dVar.mo4576A1(supportFragmentManager, (String) null);
        }
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m89617M1(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    private final void observeData() {
        C30365k Ew = m89605A1().mo70730Ew();
        Ew.mo70717hq().mo4819k(getViewLifecycleOwner(), new C29494o(new C29485f(this)));
        Ew.mo70714c6().mo4819k(getViewLifecycleOwner(), new C29494o(new C29486g(this)));
        LiveData Vp = Ew.mo70712Vp();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Vp, viewLifecycleOwner, new C29487h(this));
        LiveData t = Ew.mo70723t();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(t, viewLifecycleOwner2, new C29488i(this));
        Ew.mo70710Qn().mo4819k(getViewLifecycleOwner(), new C29494o(new C29489j(this)));
        Ew.mo70719i0().mo4819k(getViewLifecycleOwner(), new C29494o(new C29490k(this)));
        LiveData eg = Ew.mo70715eg();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(eg, viewLifecycleOwner3, new C29491l(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m89633y1() {
        /*
            r18 = this;
            om0.d r0 = r18.m89634z1()
            r18.m89608D1()
            ge.bog.designsystem.components.input.Input r1 = r0.f67940g
            java.lang.String r1 = r1.getInputText()
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x0017
            r1 = r2
            goto L_0x0018
        L_0x0017:
            r1 = r3
        L_0x0018:
            if (r1 == 0) goto L_0x003d
            ge.bog.designsystem.components.input.Input r1 = r0.f67941h
            java.lang.String r1 = r1.getInputText()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0028
            r1 = r2
            goto L_0x0029
        L_0x0028:
            r1 = r3
        L_0x0029:
            if (r1 == 0) goto L_0x003d
            ge.bog.designsystem.components.checkbox.CheckboxView r1 = r0.f67942i
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x003d
            ge.bog.designsystem.components.input.Input r1 = r0.f67941h
            boolean r1 = r1.mo35918a()
            if (r1 == 0) goto L_0x003d
            r1 = r2
            goto L_0x003e
        L_0x003d:
            r1 = r3
        L_0x003e:
            om0.d r4 = r18.m89634z1()
            ge.bog.designsystem.components.input.Input r4 = r4.f67940g
            java.lang.String r4 = r4.getInputText()
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0050
            r4 = r2
            goto L_0x0051
        L_0x0050:
            r4 = r3
        L_0x0051:
            java.lang.String r5 = "child.financial.number.page.fill.empty.fields"
            if (r4 == 0) goto L_0x0065
            ge.bog.designsystem.components.input.Input r4 = r0.f67940g
            r4.mo35920c()
            ge.bog.designsystem.components.input.Input r4 = r0.f67940g
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r6 = g91.C32343x.m95388F(r5, r6)
            r4.setInfoText(r6)
        L_0x0065:
            ge.bog.designsystem.components.input.Input r4 = r0.f67941h
            java.lang.String r4 = r4.getInputText()
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r2 = r3
        L_0x0073:
            if (r2 == 0) goto L_0x0085
            ge.bog.designsystem.components.input.Input r2 = r0.f67941h
            r2.mo35920c()
            ge.bog.designsystem.components.input.Input r2 = r0.f67941h
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r4 = g91.C32343x.m95388F(r5, r4)
            r2.setInfoText(r4)
        L_0x0085:
            ge.bog.designsystem.components.input.Input r2 = r0.f67941h
            boolean r2 = r2.mo35918a()
            if (r2 != 0) goto L_0x009f
            ge.bog.designsystem.components.input.Input r2 = r0.f67941h
            r2.mo35920c()
            ge.bog.designsystem.components.input.Input r2 = r0.f67941h
            java.lang.String r4 = "child.financial.number.page.incorrect.mobile.number"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r4 = g91.C32343x.m95388F(r4, r5)
            r2.setInfoText(r4)
        L_0x009f:
            ge.bog.designsystem.components.checkbox.CheckboxView r2 = r0.f67942i
            boolean r2 = r2.isChecked()
            if (r2 != 0) goto L_0x00bf
            androidx.fragment.app.h r4 = r18.requireActivity()
            java.lang.String r2 = "requireActivity()"
            kotlin.jvm.internal.C41536l.m120488h(r4, r2)
            java.lang.String r2 = "child.financial.number.page.mark.checkbox"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = g91.C32343x.m95388F(r2, r3)
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            p420fh.C12910e.m48801s(r4, r5, r6, r7, r8, r9)
        L_0x00bf:
            if (r1 == 0) goto L_0x00f4
            java.lang.String r11 = "sCool_number"
            r12 = 0
            java.lang.String r13 = "kids_number_otp"
            ck.h$a r14 = p380ck.C10464h.C10465a.FACEBOOKANDFIREBASE
            r15 = 0
            r16 = 18
            r17 = 0
            r10 = r18
            g91.C32343x.m95395I0(r10, r11, r12, r13, r14, r15, r16, r17)
            r18.m89608D1()
            ge.bog.designsystem.components.input.Input r1 = r0.f67941h
            android.widget.EditText r1 = r1.getTextInput()
            r1.clearFocus()
            ge.bog.designsystem.components.input.Input r1 = r0.f67941h
            r1.clearFocus()
            zm0.r r1 = r18.m89605A1()
            zm0.j r1 = r1.mo70728Cw()
            ge.bog.designsystem.components.input.Input r0 = r0.f67941h
            java.lang.String r0 = r0.getInputText()
            r1.mo70691Ec(r0)
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wm0.C29479d.m89633y1():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public final C27053d m89634z1() {
        C27053d dVar = this.f74596e;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
        getChildFragmentManager().mo4367F1("REQUEST_KEY_ONE_TIME_CODE", getViewLifecycleOwner(), new C29478c(this, str2, str, str3));
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12902d.C12903a aVar = C12902d.f38098b;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null).mo33652k(str, C15278a.NEGATIVE, (C12902d.C12905b) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f74596e = C27053d.m83885d(getLayoutInflater());
        NestedScrollView c = m89634z1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f74596e = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m89614J1();
        observeData();
        m89612H1();
        m89615K1();
    }
}

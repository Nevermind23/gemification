package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import com.salesforce.marketingcloud.UrlHandler;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p202p0.C7556l;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.C13731a;
import p380ck.C10464h;
import p381cl.C10486c;
import p381cl.C10487d;
import p381cl.C10488e;
import p381cl.C10489f;
import p381cl.C10490g;
import p381cl.C10491h;
import p381cl.C10492i;
import p381cl.C10496l;
import p420fh.C12902d;
import p421fi.C12916b;
import p434gh.C15278a;
import p451hk.C15523a;
import p451hk.C15524b;
import p451hk.C15525c;
import p451hk.C15526d;
import p451hk.C15529g;
import p493kk.C16461o;
import p563pk.C17379i;
import p563pk.C17383m;
import p563pk.C17384n;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment */
public final class RegisterMtplPolicyFragment extends C13733b implements C41185v.C41186a {

    /* renamed from: o */
    public static final C13716a f40909o = new C13716a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C16461o f40910i;

    /* renamed from: j */
    private final C41217g f40911j;

    /* renamed from: k */
    private final C41217g f40912k = C41219i.m119470b(new C13720e(this));
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f40913l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f40914m;

    /* renamed from: n */
    private boolean f40915n;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$a */
    public static final class C13716a {
        private C13716a() {
        }

        public /* synthetic */ C13716a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$b */
    static final class C13717b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RegisterMtplPolicyFragment f40916d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13717b(RegisterMtplPolicyFragment registerMtplPolicyFragment) {
            super(1);
            this.f40916d = registerMtplPolicyFragment;
        }

        /* renamed from: a */
        public final void mo37618a(C10496l lVar) {
            RegisterMtplPolicyFragment registerMtplPolicyFragment = this.f40916d;
            C41536l.m120488h(lVar, "uiState");
            registerMtplPolicyFragment.m51280L1(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37618a((C10496l) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$c */
    static final class C13718c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RegisterMtplPolicyFragment f40917d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13718c(RegisterMtplPolicyFragment registerMtplPolicyFragment) {
            super(1);
            this.f40917d = registerMtplPolicyFragment;
        }

        /* renamed from: a */
        public final void mo37619a(C31128a aVar) {
            boolean z = false;
            if (this.f40917d.m51297v1().f46583g.isChecked()) {
                this.f40917d.f40913l = false;
            }
            if (aVar instanceof C31128a.C31131c) {
                if (this.f40917d.f40913l) {
                    this.f40917d.m51269A1("pay");
                }
                if (this.f40917d.f40914m) {
                    this.f40917d.m51269A1("payLater");
                }
                if (this.f40917d.m51297v1().f46583g.isChecked()) {
                    this.f40917d.m51269A1("buywithDD");
                }
                C7556l a = C8034d.m30522a(this.f40917d);
                int i = C15526d.action_registerMtplPolicyFragment_to_policyDownloadFragment;
                Bundle bundle = new Bundle();
                Boolean a2 = ((C17383m) ((C31128a.C31131c) aVar).mo71340a()).mo44887a();
                if (a2 != null) {
                    z = a2.booleanValue();
                }
                bundle.putBoolean("PAYMENT_RESULT_ARG", z);
                C41238w wVar = C41238w.f97225a;
                a.mo22118M(i, bundle);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f40917d.f40913l = false;
                this.f40917d.f40914m = false;
                this.f40917d.m51297v1().f46601y.setVisibility(8);
                C12902d.C12903a aVar2 = C12902d.f38098b;
                C1505h requireActivity = this.f40917d.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12902d e = C12902d.C12903a.m48771e(aVar2, requireActivity, false, 2, (Object) null);
                String string = this.f40917d.getString(C15529g.f44090o);
                C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
                e.mo33652k(string, C15278a.NEGATIVE, (C12902d.C12905b) null);
            } else if (aVar instanceof C31128a.C31130b) {
                this.f40917d.m51297v1().f46601y.setVisibility(0);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37619a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$d */
    static final class C13719d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RegisterMtplPolicyFragment f40918d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13719d(RegisterMtplPolicyFragment registerMtplPolicyFragment) {
            super(1);
            this.f40918d = registerMtplPolicyFragment;
        }

        /* renamed from: a */
        public final void mo37620a(C17384n nVar) {
            C41536l.m120489i(nVar, "params");
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, nVar.mo44890b(), nVar.mo44889a(), (C41143c) null, 4, (Object) null);
            FragmentManager childFragmentManager = this.f40918d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            e.mo4576A1(childFragmentManager, "SCA_TAG");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37620a((C17384n) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$e */
    static final class C13720e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ RegisterMtplPolicyFragment f40919d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13720e(RegisterMtplPolicyFragment registerMtplPolicyFragment) {
            super(0);
            this.f40919d = registerMtplPolicyFragment;
        }

        public final String invoke() {
            Bundle arguments = this.f40919d.getArguments();
            String string = arguments != null ? arguments.getString("selected_path") : null;
            C41536l.m120486f(string);
            return string;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$f */
    static final class C13721f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f40920a;

        C13721f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f40920a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f40920a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f40920a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$g */
    public static final class C13722g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40921d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13722g(Fragment fragment) {
            super(0);
            this.f40921d = fragment;
        }

        public final Fragment invoke() {
            return this.f40921d;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$h */
    public static final class C13723h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40922d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13723h(C43064a aVar) {
            super(0);
            this.f40922d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f40922d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$i */
    public static final class C13724i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f40923d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13724i(C41217g gVar) {
            super(0);
            this.f40923d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f40923d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$j */
    public static final class C13725j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40924d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40925e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13725j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f40924d = aVar;
            this.f40925e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40924d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f40925e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment$k */
    public static final class C13726k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40926d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40927e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13726k(Fragment fragment, C41217g gVar) {
            super(0);
            this.f40926d = fragment;
            this.f40927e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f40927e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f40926d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public RegisterMtplPolicyFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13723h(new C13722g(this)));
        this.f40911j = C1514j0.m5374c(this, C41520a0.m120436b(RegisterMtplPolicyViewModel$ViewModel.class), new C13724i(a), new C13725j((C43064a) null, a), new C13726k(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final void m51269A1(String str) {
        m51300z1(str, "conversion_mtpl_insurance");
        C32343x.m95395I0(this, "mtpl_insurance", "", "conversion_mtpl_insurance", C10464h.C10465a.FACEBOOK, (Bundle) null, 16, (Object) null);
    }

    /* renamed from: B1 */
    private final void m51270B1(String str) {
        m51300z1(str, "mtpl_insurance_register_policy");
    }

    /* renamed from: C1 */
    private final void m51271C1() {
        String str;
        if (m51297v1().f46583g.isChecked()) {
            m51299y1().mo37623lw().mo27220P1(C17379i.MONTHLY);
        } else if (this.f40915n) {
            m51299y1().mo37623lw().mo27220P1(C17379i.AUTOMATIC);
        } else {
            C13731a.C13732a aVar = C13731a.f40943C;
            C10496l lVar = (C10496l) m51299y1().mo37624mw().mo27223a().mo4814f();
            if (lVar == null || (str = lVar.mo27211d()) == null) {
                str = "";
            }
            aVar.mo37632a(str).mo4576A1(getChildFragmentManager(), (String) null);
        }
    }

    /* renamed from: D1 */
    private final void m51272D1() {
        m51297v1().f46586j.setOnClickListener(new C10486c(this));
        m51297v1().f46579B.setOnClickListener(new C10487d(this));
        m51297v1().f46597u.setOnClickListener(new C10488e(this));
        m51297v1().f46600x.getButton().setOnClickListener(new C10489f(this));
        m51297v1().f46600x.getAdditionalButton().setOnClickListener(new C10490g(this));
        m51297v1().f46583g.setOnTouchListener(new C10491h(this));
        getChildFragmentManager().mo4367F1("AUTOMATIC_CONFIRM_REQUEST_KEY", this, new C10492i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m51273E1(RegisterMtplPolicyFragment registerMtplPolicyFragment, View view) {
        C41536l.m120489i(registerMtplPolicyFragment, "this$0");
        C8034d.m30522a(registerMtplPolicyFragment).mo22117L(C15526d.action_registerMtplPolicyFragment_to_selectInsuranceCardActionSheet);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m51274F1(RegisterMtplPolicyFragment registerMtplPolicyFragment, View view) {
        C41536l.m120489i(registerMtplPolicyFragment, "this$0");
        registerMtplPolicyFragment.m51299y1().mo37623lw().mo27220P1(C17379i.ANNUAL);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m51275G1(RegisterMtplPolicyFragment registerMtplPolicyFragment, View view) {
        C41536l.m120489i(registerMtplPolicyFragment, "this$0");
        registerMtplPolicyFragment.m51299y1().mo37623lw().mo27220P1(C17379i.MONTHLY);
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m51276H1(RegisterMtplPolicyFragment registerMtplPolicyFragment, View view) {
        C41536l.m120489i(registerMtplPolicyFragment, "this$0");
        registerMtplPolicyFragment.f40913l = true;
        if (registerMtplPolicyFragment.m51297v1().f46583g.isChecked()) {
            registerMtplPolicyFragment.m51270B1("buywithDD");
        } else {
            registerMtplPolicyFragment.m51270B1("pay");
        }
        registerMtplPolicyFragment.m51299y1().mo37623lw().mo27218Am();
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m51277I1(RegisterMtplPolicyFragment registerMtplPolicyFragment, View view) {
        C41536l.m120489i(registerMtplPolicyFragment, "this$0");
        registerMtplPolicyFragment.f40914m = true;
        registerMtplPolicyFragment.m51270B1("payLater");
        registerMtplPolicyFragment.m51299y1().mo37623lw().mo27219Ff();
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final boolean m51278J1(RegisterMtplPolicyFragment registerMtplPolicyFragment, View view, MotionEvent motionEvent) {
        C41536l.m120489i(registerMtplPolicyFragment, "this$0");
        if (motionEvent.getAction() == 1) {
            registerMtplPolicyFragment.m51271C1();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m51279K1(RegisterMtplPolicyFragment registerMtplPolicyFragment, String str, Bundle bundle) {
        C41536l.m120489i(registerMtplPolicyFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "<anonymous parameter 1>");
        registerMtplPolicyFragment.f40915n = true;
        registerMtplPolicyFragment.m51299y1().mo37623lw().mo27220P1(C17379i.AUTOMATIC);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final void m51280L1(C10496l lVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        m51297v1().f46581e.setText(lVar.mo27208a());
        TextView textView = m51297v1().f46595s;
        C41536l.m120488h(textView, "binding.monthly");
        if (lVar.mo27209b() == null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(textView, z, false, 2, (Object) null);
        TextView textView2 = m51297v1().f46593q;
        C41536l.m120488h(textView2, "binding.labelMonthlyPayment");
        if (lVar.mo27209b() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32343x.m95483r1(textView2, z2, false, 2, (Object) null);
        TextView textView3 = m51297v1().f46591o;
        C41536l.m120488h(textView3, "binding.labelFirstPayment");
        if (lVar.mo27209b() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C32343x.m95483r1(textView3, z3, false, 2, (Object) null);
        InlineFeedback inlineFeedback = m51297v1().f46582f;
        C41536l.m120488h(inlineFeedback, "binding.automaticPaymentFeedback");
        if (lVar.mo27209b() != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        C32343x.m95483r1(inlineFeedback, z4, false, 2, (Object) null);
        if (lVar.mo27209b() != null) {
            m51297v1().f46598v.setText(lVar.mo27210c());
            m51297v1().f46585i.setText(lVar.mo27209b());
        } else {
            m51297v1().f46595s.setText(lVar.mo27210c());
        }
        CreditCardSmallPickerView.C13279b.C13281b f = lVar.mo27214f();
        if (f != null) {
            m51297v1().f46586j.setCreditCard(f);
        }
        C17379i e = lVar.mo27212e();
        C17379i iVar = C17379i.ANNUAL;
        if (e == iVar) {
            z5 = true;
        } else {
            z5 = false;
        }
        m51297v1().f46578A.setBadgeVisible(z5);
        m51297v1().f46579B.setSelected(z5);
        m51297v1().f46596t.setBadgeVisible(!z5);
        m51297v1().f46597u.setSelected(!z5);
        if (lVar.mo27212e() == C17379i.AUTOMATIC) {
            m51297v1().f46600x.getButton().setButtonText(getString(C15529g.choose_payment_method_button_buy));
            m51297v1().f46600x.setFixedButtonType(C12916b.EMPTY_BUTTON);
            m51297v1().f46583g.setChecked(true);
        } else {
            Button button = m51297v1().f46600x.getButton();
            String string = getString(C15529g.choose_payment_method_button_pay);
            if (lVar.mo27212e() == iVar) {
                str = lVar.mo27208a();
            } else {
                str = lVar.mo27209b();
                if (str == null) {
                    str = lVar.mo27210c();
                }
            }
            button.setButtonText(string + " (" + str + ")");
            m51297v1().f46600x.setFixedButtonType(C12916b.TEXT_BUTTON);
            m51297v1().f46583g.setChecked(false);
        }
        m51297v1().f46600x.getButton().setEnabled(lVar.mo27215g());
    }

    /* renamed from: M1 */
    private final void m51281M1(BadgeRelativeLayout badgeRelativeLayout) {
        NotificationBadgeView badgeView = badgeRelativeLayout.getBadgeView();
        badgeView.setBadge(new NotificationBadgeView.BadgeType.Icon(C15525c.f44044d, 0, 0, 0, 14, (DefaultConstructorMarker) null));
        badgeView.setBadgeColor(Integer.valueOf(C0767a.m2893c(badgeView.getContext(), C15523a.f44041c)));
        badgeView.setBorderColor(Integer.valueOf(C0767a.m2893c(badgeView.getContext(), C15523a.f44040b)));
        badgeRelativeLayout.setClickable(true);
        Resources resources = badgeRelativeLayout.getResources();
        int i = C15524b.f44042a;
        badgeRelativeLayout.setHorizontalOffset(-resources.getDimensionPixelSize(i));
        badgeRelativeLayout.setVerticalOffset(-badgeRelativeLayout.getResources().getDimensionPixelSize(i));
    }

    /* renamed from: N1 */
    private final void m51282N1() {
        PageDescriptionView pageDescriptionView = m51297v1().f46599w;
        pageDescriptionView.setTitle(C32343x.m95388F("rbc.insurance.choose.payment.method", new Object[0]));
        pageDescriptionView.setText(C32343x.m95388F("rbc.insurance.choose.payment.method.description", new Object[0]));
        BadgeRelativeLayout badgeRelativeLayout = m51297v1().f46578A;
        C41536l.m120488h(badgeRelativeLayout, "binding.yearlyBadgeLayout");
        m51281M1(badgeRelativeLayout);
        BadgeRelativeLayout badgeRelativeLayout2 = m51297v1().f46596t;
        C41536l.m120488h(badgeRelativeLayout2, "binding.monthlyBadgeLayout");
        m51281M1(badgeRelativeLayout2);
        m51297v1().f46582f.setTitleText(C32343x.m95388F("rbc.insurance.dd.payment.description", new Object[0]));
        m51297v1().f46600x.setAdditionalText(getString(C15529g.choose_payment_method_button_pay_later));
    }

    private final void observeData() {
        m51299y1().mo37624mw().mo27223a().mo4819k(getViewLifecycleOwner(), new C13721f(new C13717b(this)));
        m51299y1().mo37624mw().mo27224tb().mo4819k(getViewLifecycleOwner(), new C13721f(new C13718c(this)));
        LiveData J5 = m51299y1().mo37624mw().mo27222J5();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(J5, viewLifecycleOwner, new C13719d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final C16461o m51297v1() {
        C16461o oVar = this.f40910i;
        C41536l.m120486f(oVar);
        return oVar;
    }

    /* renamed from: x1 */
    private final String m51298x1() {
        return (String) this.f40912k.getValue();
    }

    /* renamed from: y1 */
    private final RegisterMtplPolicyViewModel$ViewModel m51299y1() {
        return (RegisterMtplPolicyViewModel$ViewModel) this.f40911j.getValue();
    }

    /* renamed from: z1 */
    private final void m51300z1(String str, String str2) {
        C32343x.m95387E0(this, "mtpl_insurance", "", "", C10464h.C10465a.FIREBASE, C0908e.m3336b(C41233s.m119492a("event_name", "mtpl_insurance"), C41233s.m119492a(UrlHandler.ACTION, str2), C41233s.m119492a("selected_path", m51298x1()), C41233s.m119492a("label", str)));
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        if (C41536l.m120484d(str4, "SCA_TAG")) {
            m51299y1().mo37623lw().mo27221h5(str, str2, str3);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v f0 = C32343x.m95446f0(childFragmentManager, "SCA_TAG");
        if (f0 != null) {
            f0.mo4577k1();
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12902d.C12903a aVar = C12902d.f38098b;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
        String string = getString(C15529g.f44090o);
        C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
        e.mo33652k(string, C15278a.NEGATIVE, (C12902d.C12905b) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f40910i = C16461o.m58650d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m51297v1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40910i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m51282N1();
        m51272D1();
        observeData();
    }
}

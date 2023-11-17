package p341ge.bog.mobilebank.loans.presentation.repaymentsuccess;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0152h;
import androidx.core.content.C0767a;
import androidx.core.widget.NestedScrollView;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37129d;
import lr0.C37133h;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p341ge.bog.mobilebank.loans.presentation.model.PaymentResultData;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import pr0.C37957h0;
import ps0.C37976a;
import q31.C38122f;
import q31.C38125h;
import qs0.C38241a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.loans.presentation.repaymentsuccess.RepaymentSuccessFragment */
public final class RepaymentSuccessFragment extends C32774a {

    /* renamed from: j */
    public static final C32771a f80594j = new C32771a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C37957h0 f80595g;

    /* renamed from: h */
    private final C38241a f80596h = new C38241a();

    /* renamed from: i */
    private final C41217g f80597i = C41219i.m119470b(new C32773c(this));

    /* renamed from: ge.bog.mobilebank.loans.presentation.repaymentsuccess.RepaymentSuccessFragment$a */
    public static final class C32771a {
        private C32771a() {
        }

        public /* synthetic */ C32771a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repaymentsuccess.RepaymentSuccessFragment$b */
    public static final class C32772b extends C0152h {

        /* renamed from: d */
        final /* synthetic */ RepaymentSuccessFragment f80598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32772b(RepaymentSuccessFragment repaymentSuccessFragment) {
            super(true);
            this.f80598d = repaymentSuccessFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            Context requireContext = this.f80598d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            Context requireContext2 = this.f80598d.requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            C38122f.C38123a.m112215k(c, requireContext2, (String) null, (Bundle) null, 6, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repaymentsuccess.RepaymentSuccessFragment$c */
    static final class C32773c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ RepaymentSuccessFragment f80599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32773c(RepaymentSuccessFragment repaymentSuccessFragment) {
            super(0);
            this.f80599d = repaymentSuccessFragment;
        }

        /* renamed from: b */
        public final PaymentResultData invoke() {
            Bundle arguments = this.f80599d.getArguments();
            PaymentResultData paymentResultData = arguments != null ? (PaymentResultData) arguments.getParcelable(this.f80599d.getString(C37133h.arg_payment_result_data)) : null;
            C41536l.m120486f(paymentResultData);
            return paymentResultData;
        }
    }

    /* renamed from: j1 */
    private final C37957h0 m96805j1() {
        C37957h0 h0Var = this.f80595g;
        C41536l.m120486f(h0Var);
        return h0Var;
    }

    /* renamed from: k1 */
    private final PaymentResultData m96806k1() {
        return (PaymentResultData) this.f80597i.getValue();
    }

    /* renamed from: l1 */
    private final void m96807l1() {
        requireActivity().getOnBackPressedDispatcher().mo342c(getViewLifecycleOwner(), new C32772b(this));
        m96805j1().f91204e.setOnClickListener(new C37976a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m96808m1(RepaymentSuccessFragment repaymentSuccessFragment, View view) {
        C41536l.m120489i(repaymentSuccessFragment, "this$0");
        Context requireContext = repaymentSuccessFragment.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        Context requireContext2 = repaymentSuccessFragment.requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        C38122f.C38123a.m112215k(c, requireContext2, (String) null, (Bundle) null, 6, (Object) null);
    }

    /* renamed from: n1 */
    private final void m96809n1() {
        m96805j1().f91207h.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C37129d.f89412v), true, false));
        m96805j1().f91207h.setAdapter(this.f80596h);
        this.f80596h.mo6029i(m96806k1().mo74345b());
    }

    /* renamed from: o1 */
    private final void m96810o1() {
        String str;
        C37957h0 j1 = m96805j1();
        if (m96806k1().mo74344a()) {
            str = "bnpl.loan.payment.result.success";
        } else {
            str = "loan.payment.result.success";
        }
        if (m96806k1().mo74346d()) {
            j1.f91206g.setPageStateType(new PageStateType.Warning((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null));
            j1.f91206g.setTitleText(C32343x.m95388F("loan.payment.result.pending", new Object[0]));
        } else {
            PageState pageState = j1.f91206g;
            String e = m96806k1().mo74348e();
            if (e != null) {
                str = e;
            }
            pageState.setTitleText(C32343x.m95388F(str, new Object[0]));
        }
        j1.f91208i.setTitleText(C32343x.m95388F("loan.payment.result.pending.banker.info", new Object[0]));
        InlineFeedback inlineFeedback = j1.f91208i;
        String e2 = m96806k1().mo74348e();
        if (e2 == null) {
            e2 = "result.rbc_lnd_int.repay_loan.1";
        }
        inlineFeedback.setCaptionText(C32343x.m95388F(e2, new Object[0]));
        InlineFeedback inlineFeedback2 = j1.f91208i;
        C41536l.m120488h(inlineFeedback2, "pendingFeedback");
        C32343x.m95483r1(inlineFeedback2, m96806k1().mo74346d(), false, 2, (Object) null);
        j1.f91204e.setButtonText(C32343x.m95388F("repay.loan.result.screen.home.button.label", new Object[0]));
        j1.f91209j.setTitle(C32343x.m95388F("loan.payment.result.details", new Object[0]));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80595g = C37957h0.m111574d(layoutInflater, viewGroup, false);
        NestedScrollView c = m96805j1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80595g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C34646b.m101752f(m96806k1().mo74350f(), (Context) null, 1, (Object) null));
        m96810o1();
        m96809n1();
        m96807l1();
    }
}

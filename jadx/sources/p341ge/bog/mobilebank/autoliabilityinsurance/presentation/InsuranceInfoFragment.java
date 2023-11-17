package p341ge.bog.mobilebank.autoliabilityinsurance.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import g91.C32343x;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7548i0;
import p341ge.bog.designsystem.components.common.Image;
import p380ck.C10464h;
import p451hk.C15526d;
import p451hk.C15528f;
import p493kk.C16457k;
import p577qk.C17524g;
import p577qk.C17525h;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.InsuranceInfoFragment */
public final class InsuranceInfoFragment extends Fragment {

    /* renamed from: d */
    private C16457k f40672d;

    /* renamed from: j1 */
    private final C16457k m50972j1() {
        C16457k kVar = this.f40672d;
        C41536l.m120486f(kVar);
        return kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m50973k1(InsuranceInfoFragment insuranceInfoFragment, View view) {
        C41536l.m120489i(insuranceInfoFragment, "this$0");
        C32343x.m95395I0(insuranceInfoFragment, "mtpl_insurance", (String) null, "mtpl_insurance_intro_page_activate_policy_button", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
        C41536l.m120488h(view, "it");
        C7548i0.m28680a(view).mo22117L(C15526d.action_insuranceInfoFragment_to_insuranceProviderListFragment);
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public static final void m50974l1(View view) {
        C36546y.m108282F().mo27152s("mtpl_insurance", (String) null, "activate_insurance_intro_see_details");
        C41536l.m120488h(view, "it");
        C7548i0.m28680a(view).mo22117L(C15526d.action_insuranceInfoFragment_to_insuranceConditionsFragment);
    }

    /* renamed from: m1 */
    private final void m50975m1() {
        m50972j1().f46527k.setImage(new Image.Animation.Raw(C15528f.f44089a, (Image.Animation.AnimationConfig) null, 2, (DefaultConstructorMarker) null));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f40672d = C16457k.m58633d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m50972j1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        m50975m1();
        C32343x.m95395I0(this, "mtpl_insurance", (String) null, "mtpl_insurance_intro_page", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        m50972j1().f46521e.setOnClickListener(new C17524g(this));
        m50972j1().f46526j.setOnClickListener(new C17525h());
        m50972j1().f46527k.setText(C32343x.m95388F("rbc.insurance.info.title", new Object[0]));
        m50972j1().f46522f.setText(C32343x.m95388F("rbc.insurance.info.title1", new Object[0]));
        m50972j1().f46524h.setText(C32343x.m95388F("rbc.insurance.info.title2", new Object[0]));
        m50972j1().f46521e.setButtonText(C32343x.m95388F("rbc.insurance.btn.buy.policy", new Object[0]));
        m50972j1().f46526j.setButtonText(C32343x.m95388F("rbc.insurance.btn.more.info", new Object[0]));
    }
}

package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormInsuranceProviderView;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormLoanDetailsView;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormRefinanceView;

/* renamed from: sp0.l */
public final class C38493l implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f92225d;

    /* renamed from: e */
    public final CreditCardSmallPickerView f92226e;

    /* renamed from: f */
    public final LayerView f92227f;

    /* renamed from: g */
    public final LinearLayout f92228g;

    /* renamed from: h */
    public final TextGroupView f92229h;

    /* renamed from: i */
    public final FrameLayout f92230i;

    /* renamed from: j */
    public final Button f92231j;

    /* renamed from: k */
    public final Button f92232k;

    /* renamed from: l */
    public final NestedScrollView f92233l;

    /* renamed from: m */
    public final FormInsuranceProviderView f92234m;

    /* renamed from: n */
    public final LayerView f92235n;

    /* renamed from: o */
    public final FormLoanDetailsView f92236o;

    /* renamed from: p */
    public final FormRefinanceView f92237p;

    private C38493l(ConstraintLayout constraintLayout, CreditCardSmallPickerView creditCardSmallPickerView, LayerView layerView, LinearLayout linearLayout, TextGroupView textGroupView, FrameLayout frameLayout, Button button, Button button2, NestedScrollView nestedScrollView, FormInsuranceProviderView formInsuranceProviderView, LayerView layerView2, FormLoanDetailsView formLoanDetailsView, FormRefinanceView formRefinanceView) {
        this.f92225d = constraintLayout;
        this.f92226e = creditCardSmallPickerView;
        this.f92227f = layerView;
        this.f92228g = linearLayout;
        this.f92229h = textGroupView;
        this.f92230i = frameLayout;
        this.f92231j = button;
        this.f92232k = button2;
        this.f92233l = nestedScrollView;
        this.f92234m = formInsuranceProviderView;
        this.f92235n = layerView2;
        this.f92236o = formLoanDetailsView;
        this.f92237p = formRefinanceView;
    }

    /* renamed from: a */
    public static C38493l m112986a(View view) {
        View view2 = view;
        int i = C37439e.f89997a;
        CreditCardSmallPickerView creditCardSmallPickerView = (CreditCardSmallPickerView) C6202b.m24689a(view2, i);
        if (creditCardSmallPickerView != null) {
            i = C37439e.f90003g;
            LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
            if (layerView != null) {
                i = C37439e.f89982F;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                if (linearLayout != null) {
                    i = C37439e.full_amount;
                    TextGroupView textGroupView = (TextGroupView) C6202b.m24689a(view2, i);
                    if (textGroupView != null) {
                        i = C37439e.f90005i0;
                        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view2, i);
                        if (frameLayout != null) {
                            i = C37439e.f89977B0;
                            Button button = (Button) C6202b.m24689a(view2, i);
                            if (button != null) {
                                i = C37439e.f89985G0;
                                Button button2 = (Button) C6202b.m24689a(view2, i);
                                if (button2 != null) {
                                    i = C37439e.f89988N0;
                                    NestedScrollView nestedScrollView = (NestedScrollView) C6202b.m24689a(view2, i);
                                    if (nestedScrollView != null) {
                                        i = C37439e.segment_insurance_provider;
                                        FormInsuranceProviderView formInsuranceProviderView = (FormInsuranceProviderView) C6202b.m24689a(view2, i);
                                        if (formInsuranceProviderView != null) {
                                            i = C37439e.segment_loan_amount;
                                            LayerView layerView2 = (LayerView) C6202b.m24689a(view2, i);
                                            if (layerView2 != null) {
                                                i = C37439e.segment_loan_details;
                                                FormLoanDetailsView formLoanDetailsView = (FormLoanDetailsView) C6202b.m24689a(view2, i);
                                                if (formLoanDetailsView != null) {
                                                    i = C37439e.segment_refinance_info;
                                                    FormRefinanceView formRefinanceView = (FormRefinanceView) C6202b.m24689a(view2, i);
                                                    if (formRefinanceView != null) {
                                                        return new C38493l((ConstraintLayout) view2, creditCardSmallPickerView, layerView, linearLayout, textGroupView, frameLayout, button, button2, nestedScrollView, formInsuranceProviderView, layerView2, formLoanDetailsView, formRefinanceView);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38493l m112987d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.fragment_activation_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112986a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f92225d;
    }
}

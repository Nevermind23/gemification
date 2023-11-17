package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.packagecard.PackageCardView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.o */
public final class C12760o implements C6201a {

    /* renamed from: d */
    private final StateView f37800d;

    /* renamed from: e */
    public final LinearLayout f37801e;

    /* renamed from: f */
    public final Button f37802f;

    /* renamed from: g */
    public final Button f37803g;

    /* renamed from: h */
    public final LinearLayout f37804h;

    /* renamed from: i */
    public final ConstraintLayout f37805i;

    /* renamed from: j */
    public final LinearLayout f37806j;

    /* renamed from: k */
    public final PackageCardView f37807k;

    /* renamed from: l */
    public final Button f37808l;

    /* renamed from: m */
    public final LoadingView f37809m;

    /* renamed from: n */
    public final StateView f37810n;

    private C12760o(StateView stateView, LinearLayout linearLayout, Button button, Button button2, LinearLayout linearLayout2, ConstraintLayout constraintLayout, LinearLayout linearLayout3, PackageCardView packageCardView, Button button3, LoadingView loadingView, StateView stateView2) {
        this.f37800d = stateView;
        this.f37801e = linearLayout;
        this.f37802f = button;
        this.f37803g = button2;
        this.f37804h = linearLayout2;
        this.f37805i = constraintLayout;
        this.f37806j = linearLayout3;
        this.f37807k = packageCardView;
        this.f37808l = button3;
        this.f37809m = loadingView;
        this.f37810n = stateView2;
    }

    /* renamed from: a */
    public static C12760o m48434a(View view) {
        int i = C10114f.f27921A;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C10114f.button_activate;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C10114f.f27925E;
                Button button2 = (Button) C6202b.m24689a(view, i);
                if (button2 != null) {
                    i = C10114f.f27928I;
                    LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout2 != null) {
                        i = C10114f.f27936Q;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                        if (constraintLayout != null) {
                            i = C10114f.f27951d0;
                            LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view, i);
                            if (linearLayout3 != null) {
                                i = C10114f.package_header;
                                PackageCardView packageCardView = (PackageCardView) C6202b.m24689a(view, i);
                                if (packageCardView != null) {
                                    i = C10114f.f27952d1;
                                    Button button3 = (Button) C6202b.m24689a(view, i);
                                    if (button3 != null) {
                                        i = C10114f.f27963l1;
                                        LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                                        if (loadingView != null) {
                                            StateView stateView = (StateView) view;
                                            return new C12760o(stateView, linearLayout, button, button2, linearLayout2, constraintLayout, linearLayout3, packageCardView, button3, loadingView, stateView);
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
    public static C12760o m48435d(LayoutInflater layoutInflater) {
        return m48436e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C12760o m48436e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_package_benefits_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48434a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f37800d;
    }
}

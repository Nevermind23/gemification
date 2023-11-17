package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.q */
public final class C12764q implements C6201a {

    /* renamed from: d */
    private final StateView f37823d;

    /* renamed from: e */
    public final Button f37824e;

    /* renamed from: f */
    public final Button f37825f;

    /* renamed from: g */
    public final ConstraintLayout f37826g;

    /* renamed from: h */
    public final LoadingView f37827h;

    /* renamed from: i */
    public final PageDescriptionView f37828i;

    /* renamed from: j */
    public final StateView f37829j;

    /* renamed from: k */
    public final TextView f37830k;

    /* renamed from: l */
    public final RadioGroup f37831l;

    private C12764q(StateView stateView, Button button, Button button2, ConstraintLayout constraintLayout, LoadingView loadingView, PageDescriptionView pageDescriptionView, StateView stateView2, TextView textView, RadioGroup radioGroup) {
        this.f37823d = stateView;
        this.f37824e = button;
        this.f37825f = button2;
        this.f37826g = constraintLayout;
        this.f37827h = loadingView;
        this.f37828i = pageDescriptionView;
        this.f37829j = stateView2;
        this.f37830k = textView;
        this.f37831l = radioGroup;
    }

    /* renamed from: a */
    public static C12764q m48452a(View view) {
        int i = C10114f.button_end;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10114f.button_skip;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C10114f.f27934P;
                ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                if (constraintLayout != null) {
                    i = C10114f.f27978y0;
                    LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                    if (loadingView != null) {
                        i = C10114f.f27931M0;
                        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                        if (pageDescriptionView != null) {
                            StateView stateView = (StateView) view;
                            i = C10114f.f27945Y0;
                            TextView textView = (TextView) C6202b.m24689a(view, i);
                            if (textView != null) {
                                i = C10114f.f27948a1;
                                RadioGroup radioGroup = (RadioGroup) C6202b.m24689a(view, i);
                                if (radioGroup != null) {
                                    return new C12764q(stateView, button, button2, constraintLayout, loadingView, pageDescriptionView, stateView, textView, radioGroup);
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
    public static C12764q m48453d(LayoutInflater layoutInflater) {
        return m48454e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C12764q m48454e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_package_cancel_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48452a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f37823d;
    }
}

package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.strength.StrengthView;

/* renamed from: ua1.n */
public final class C28663n implements C6201a {

    /* renamed from: d */
    private final ScrollView f72839d;

    /* renamed from: e */
    public final Button f72840e;

    /* renamed from: f */
    public final LinearLayout f72841f;

    /* renamed from: g */
    public final Input f72842g;

    /* renamed from: h */
    public final Input f72843h;

    /* renamed from: i */
    public final StrengthView f72844i;

    /* renamed from: j */
    public final ButtonListView f72845j;

    private C28663n(ScrollView scrollView, Button button, LinearLayout linearLayout, Input input, Input input2, StrengthView strengthView, ButtonListView buttonListView) {
        this.f72839d = scrollView;
        this.f72840e = button;
        this.f72841f = linearLayout;
        this.f72842g = input;
        this.f72843h = input2;
        this.f72844i = strengthView;
        this.f72845j = buttonListView;
    }

    /* renamed from: a */
    public static C28663n m87763a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.content_linear_layout;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C10216u.password_again_input;
                Input input = (Input) C6202b.m24689a(view, i);
                if (input != null) {
                    i = C10216u.password_input;
                    Input input2 = (Input) C6202b.m24689a(view, i);
                    if (input2 != null) {
                        i = C10216u.password_strength;
                        StrengthView strengthView = (StrengthView) C6202b.m24689a(view, i);
                        if (strengthView != null) {
                            i = C10216u.statement_category_view;
                            ButtonListView buttonListView = (ButtonListView) C6202b.m24689a(view, i);
                            if (buttonListView != null) {
                                return new C28663n((ScrollView) view, button, linearLayout, input, input2, strengthView, buttonListView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28663n m87764d(LayoutInflater layoutInflater) {
        return m87765e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28663n m87765e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_change_password_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87763a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f72839d;
    }
}

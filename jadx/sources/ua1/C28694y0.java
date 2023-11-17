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

/* renamed from: ua1.y0 */
public final class C28694y0 implements C6201a {

    /* renamed from: d */
    private final ScrollView f73056d;

    /* renamed from: e */
    public final Button f73057e;

    /* renamed from: f */
    public final LinearLayout f73058f;

    /* renamed from: g */
    public final ButtonListView f73059g;

    /* renamed from: h */
    public final Input f73060h;

    /* renamed from: i */
    public final StrengthView f73061i;

    private C28694y0(ScrollView scrollView, Button button, LinearLayout linearLayout, ButtonListView buttonListView, Input input, StrengthView strengthView) {
        this.f73056d = scrollView;
        this.f73057e = button;
        this.f73058f = linearLayout;
        this.f73059g = buttonListView;
        this.f73060h = input;
        this.f73061i = strengthView;
    }

    /* renamed from: a */
    public static C28694y0 m87895a(View view) {
        int i = C10216u.f28313Z;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.content_linear_layout;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C10216u.statement_category_view;
                ButtonListView buttonListView = (ButtonListView) C6202b.m24689a(view, i);
                if (buttonListView != null) {
                    i = C10216u.username_input;
                    Input input = (Input) C6202b.m24689a(view, i);
                    if (input != null) {
                        i = C10216u.username_strength;
                        StrengthView strengthView = (StrengthView) C6202b.m24689a(view, i);
                        if (strengthView != null) {
                            return new C28694y0((ScrollView) view, button, linearLayout, buttonListView, input, strengthView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28694y0 m87896d(LayoutInflater layoutInflater) {
        return m87897e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28694y0 m87897e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_update_username_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87895a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f73056d;
    }
}

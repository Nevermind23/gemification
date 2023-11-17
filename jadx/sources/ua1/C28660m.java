package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.strength.StrengthView;

/* renamed from: ua1.m */
public final class C28660m implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f72816d;

    /* renamed from: e */
    public final Button f72817e;

    /* renamed from: f */
    public final LinearLayout f72818f;

    /* renamed from: g */
    public final Input f72819g;

    /* renamed from: h */
    public final Input f72820h;

    /* renamed from: i */
    public final StrengthView f72821i;

    /* renamed from: j */
    public final NestedScrollView f72822j;

    private C28660m(NestedScrollView nestedScrollView, Button button, LinearLayout linearLayout, Input input, Input input2, StrengthView strengthView, NestedScrollView nestedScrollView2) {
        this.f72816d = nestedScrollView;
        this.f72817e = button;
        this.f72818f = linearLayout;
        this.f72819g = input;
        this.f72820h = input2;
        this.f72821i = strengthView;
        this.f72822j = nestedScrollView2;
    }

    /* renamed from: a */
    public static C28660m m87750a(View view) {
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
                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                            return new C28660m(nestedScrollView, button, linearLayout, input, input2, strengthView, nestedScrollView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28660m m87751d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_change_password_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87750a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f72816d;
    }
}

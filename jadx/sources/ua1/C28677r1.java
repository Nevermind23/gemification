package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.strength.StrengthView;

/* renamed from: ua1.r1 */
public final class C28677r1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72913d;

    /* renamed from: e */
    public final Button f72914e;

    /* renamed from: f */
    public final Input f72915f;

    /* renamed from: g */
    public final StrengthView f72916g;

    private C28677r1(LinearLayout linearLayout, Button button, Input input, StrengthView strengthView) {
        this.f72913d = linearLayout;
        this.f72914e = button;
        this.f72915f = input;
        this.f72916g = strengthView;
    }

    /* renamed from: a */
    public static C28677r1 m87823a(View view) {
        int i = C10216u.f28313Z;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.username_input;
            Input input = (Input) C6202b.m24689a(view, i);
            if (input != null) {
                i = C10216u.username_strength;
                StrengthView strengthView = (StrengthView) C6202b.m24689a(view, i);
                if (strengthView != null) {
                    return new C28677r1((LinearLayout) view, button, input, strengthView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28677r1 m87824d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.layout_username_input_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87823a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72913d;
    }
}

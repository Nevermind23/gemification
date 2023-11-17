package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.i3 */
public final class C9935i3 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27103d;

    /* renamed from: e */
    public final Button f27104e;

    /* renamed from: f */
    public final CheckboxView f27105f;

    private C9935i3(ConstraintLayout constraintLayout, Button button, CheckboxView checkboxView) {
        this.f27103d = constraintLayout;
        this.f27104e = button;
        this.f27105f = checkboxView;
    }

    /* renamed from: a */
    public static C9935i3 m36441a(View view) {
        int i = C17782g.f49680D0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C17782g.f49793t1;
            CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
            if (checkboxView != null) {
                return new C9935i3((ConstraintLayout) view, button, checkboxView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9935i3 m36442d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_fixed_button_checkbox, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36441a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27103d;
    }
}

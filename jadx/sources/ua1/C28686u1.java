package ua1;

import android.view.View;
import android.widget.LinearLayout;
import ba1.C10216u;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;

/* renamed from: ua1.u1 */
public final class C28686u1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73005d;

    /* renamed from: e */
    public final CheckboxView f73006e;

    /* renamed from: f */
    public final Button f73007f;

    private C28686u1(LinearLayout linearLayout, CheckboxView checkboxView, Button button) {
        this.f73005d = linearLayout;
        this.f73006e = checkboxView;
        this.f73007f = button;
    }

    /* renamed from: a */
    public static C28686u1 m87861a(View view) {
        int i = C10216u.save_me_checkbox;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C10216u.submit_button;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C28686u1((LinearLayout) view, checkboxView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73005d;
    }
}

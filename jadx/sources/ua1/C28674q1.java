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

/* renamed from: ua1.q1 */
public final class C28674q1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72897d;

    /* renamed from: e */
    public final Button f72898e;

    /* renamed from: f */
    public final Input f72899f;

    private C28674q1(LinearLayout linearLayout, Button button, Input input) {
        this.f72897d = linearLayout;
        this.f72898e = button;
        this.f72899f = input;
    }

    /* renamed from: a */
    public static C28674q1 m87810a(View view) {
        int i = C10216u.f28313Z;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.f28304S1;
            Input input = (Input) C6202b.m24689a(view, i);
            if (input != null) {
                return new C28674q1((LinearLayout) view, button, input);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28674q1 m87811d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.layout_phone_number_input_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87810a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72897d;
    }
}

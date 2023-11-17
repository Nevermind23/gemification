package br0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import xq0.C39835a;
import xq0.C39836b;

/* renamed from: br0.a */
public final class C31175a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f77439d;

    /* renamed from: e */
    public final Input f77440e;

    /* renamed from: f */
    public final Button f77441f;

    private C31175a(LinearLayout linearLayout, Input input, Button button) {
        this.f77439d = linearLayout;
        this.f77440e = input;
        this.f77441f = button;
    }

    /* renamed from: a */
    public static C31175a m92705a(View view) {
        int i = C39835a.cadastral_code_input;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C39835a.check_cadastral_code_button;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C31175a((LinearLayout) view, input, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31175a m92706d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39836b.action_sheet_add_loan_property, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92705a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f77439d;
    }
}

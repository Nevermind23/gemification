package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: iy0.u */
public final class C36638u implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88432d;

    /* renamed from: e */
    public final Button f88433e;

    /* renamed from: f */
    public final Input f88434f;

    private C36638u(ConstraintLayout constraintLayout, Button button, Input input) {
        this.f88432d = constraintLayout;
        this.f88433e = button;
        this.f88434f = input;
    }

    /* renamed from: a */
    public static C36638u m108687a(View view) {
        int i = C36271e.f87495O;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C36271e.f87548u1;
            Input input = (Input) C6202b.m24689a(view, i);
            if (input != null) {
                return new C36638u((ConstraintLayout) view, button, input);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36638u m108688d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.fragment_rename_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108687a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88432d;
    }
}

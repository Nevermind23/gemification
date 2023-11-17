package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.b */
public final class C17049b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f47557d;

    /* renamed from: e */
    public final Button f47558e;

    /* renamed from: f */
    public final Input f47559f;

    private C17049b(ConstraintLayout constraintLayout, Button button, Input input) {
        this.f47557d = constraintLayout;
        this.f47558e = button;
        this.f47559f = input;
    }

    /* renamed from: a */
    public static C17049b m59896a(View view) {
        int i = C16213d.f45752q;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C16213d.f45737X;
            Input input = (Input) C6202b.m24689a(view, i);
            if (input != null) {
                return new C17049b((ConstraintLayout) view, button, input);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17049b m59897d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.action_sheet_bnpl_rename, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59896a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f47557d;
    }
}

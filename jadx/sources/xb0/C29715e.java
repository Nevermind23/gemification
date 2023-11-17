package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.e */
public final class C29715e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f75003d;

    /* renamed from: e */
    public final Input f75004e;

    /* renamed from: f */
    public final Button f75005f;

    private C29715e(ConstraintLayout constraintLayout, Input input, Button button) {
        this.f75003d = constraintLayout;
        this.f75004e = input;
        this.f75005f = button;
    }

    /* renamed from: a */
    public static C29715e m90225a(View view) {
        int i = C27985d.f71251A0;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C27985d.f71269T0;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C29715e((ConstraintLayout) view, input, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29715e m90226d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.action_sheet_rename_deposit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90225a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f75003d;
    }
}

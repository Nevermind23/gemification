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

/* renamed from: iy0.e0 */
public final class C36591e0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88179d;

    /* renamed from: e */
    public final Button f88180e;

    private C36591e0(ConstraintLayout constraintLayout, Button button) {
        this.f88179d = constraintLayout;
        this.f88180e = button;
    }

    /* renamed from: a */
    public static C36591e0 m108490a(View view) {
        int i = C36271e.f87518g2;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C36591e0((ConstraintLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36591e0 m108491d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_all_operations_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108490a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88179d;
    }
}

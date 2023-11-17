package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: iy0.b1 */
public final class C36583b1 implements C6201a {

    /* renamed from: d */
    private final Button f88157d;

    private C36583b1(Button button) {
        this.f88157d = button;
    }

    /* renamed from: a */
    public static C36583b1 m108457a(View view) {
        if (view != null) {
            return new C36583b1((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36583b1 m108458d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_add_product_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108457a(inflate);
    }

    /* renamed from: c */
    public Button mo3946b() {
        return this.f88157d;
    }
}

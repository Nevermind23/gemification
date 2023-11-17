package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.a0 */
public final class C29708a0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f74973d;

    /* renamed from: e */
    public final Button f74974e;

    private C29708a0(FrameLayout frameLayout, Button button) {
        this.f74973d = frameLayout;
        this.f74974e = button;
    }

    /* renamed from: a */
    public static C29708a0 m90198a(View view) {
        int i = C27985d.all_operations_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C29708a0((FrameLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29708a0 m90199d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_view_all_operations, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90198a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f74973d;
    }
}

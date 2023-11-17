package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import rb0.C27986e;

/* renamed from: xb0.r */
public final class C29730r implements C6201a {

    /* renamed from: d */
    private final Button f75138d;

    private C29730r(Button button) {
        this.f75138d = button;
    }

    /* renamed from: a */
    public static C29730r m90285a(View view) {
        if (view != null) {
            return new C29730r((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C29730r m90286d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_break_dismiss, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90285a(inflate);
    }

    /* renamed from: c */
    public Button mo3946b() {
        return this.f75138d;
    }
}

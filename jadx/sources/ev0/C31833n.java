package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: ev0.n */
public final class C31833n implements C6201a {

    /* renamed from: d */
    private final Button f78532d;

    private C31833n(Button button) {
        this.f78532d = button;
    }

    /* renamed from: a */
    public static C31833n m94121a(View view) {
        if (view != null) {
            return new C31833n((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31833n m94122d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_add_account_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94121a(inflate);
    }

    /* renamed from: c */
    public Button mo3946b() {
        return this.f78532d;
    }
}

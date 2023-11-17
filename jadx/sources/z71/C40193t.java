package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import y71.C40031e;

/* renamed from: z71.t */
public final class C40193t implements C6201a {

    /* renamed from: d */
    private final Button f95572d;

    /* renamed from: e */
    public final Button f95573e;

    private C40193t(Button button, Button button2) {
        this.f95572d = button;
        this.f95573e = button2;
    }

    /* renamed from: a */
    public static C40193t m116479a(View view) {
        if (view != null) {
            Button button = (Button) view;
            return new C40193t(button, button);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C40193t m116480d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_secondary_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116479a(inflate);
    }

    /* renamed from: c */
    public Button mo3946b() {
        return this.f95572d;
    }
}

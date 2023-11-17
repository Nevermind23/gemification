package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;

/* renamed from: ev0.c0 */
public final class C31820c0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78469d;

    /* renamed from: e */
    public final Button f78470e;

    /* renamed from: f */
    public final InlineFeedback f78471f;

    private C31820c0(LinearLayout linearLayout, Button button, InlineFeedback inlineFeedback) {
        this.f78469d = linearLayout;
        this.f78470e = button;
        this.f78471f = inlineFeedback;
    }

    /* renamed from: a */
    public static C31820c0 m94066a(View view) {
        int i = C31204d.f77527c;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C31204d.f77540x;
            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
            if (inlineFeedback != null) {
                return new C31820c0((LinearLayout) view, button, inlineFeedback);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31820c0 m94067d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_products_expired, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94066a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78469d;
    }
}

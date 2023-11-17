package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: sp0.f */
public final class C38487f implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92183d;

    /* renamed from: e */
    public final Input f92184e;

    /* renamed from: f */
    public final Button f92185f;

    /* renamed from: g */
    public final Button f92186g;

    /* renamed from: h */
    public final InlineFeedback2 f92187h;

    private C38487f(LinearLayout linearLayout, Input input, Button button, Button button2, InlineFeedback2 inlineFeedback2) {
        this.f92183d = linearLayout;
        this.f92184e = input;
        this.f92185f = button;
        this.f92186g = button2;
        this.f92187h = inlineFeedback2;
    }

    /* renamed from: a */
    public static C38487f m112960a(View view) {
        int i = C37439e.f90001e;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C37439e.button_continue;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C37439e.button_reset;
                Button button2 = (Button) C6202b.m24689a(view, i);
                if (button2 != null) {
                    i = C37439e.f89984G;
                    InlineFeedback2 inlineFeedback2 = (InlineFeedback2) C6202b.m24689a(view, i);
                    if (inlineFeedback2 != null) {
                        return new C38487f((LinearLayout) view, input, button, button2, inlineFeedback2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38487f m112961d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.action_sheet_recommender, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112960a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92183d;
    }
}

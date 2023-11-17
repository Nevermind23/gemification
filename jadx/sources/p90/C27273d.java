package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.d */
public final class C27273d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68495d;

    /* renamed from: e */
    public final Input f68496e;

    /* renamed from: f */
    public final InlineFeedback f68497f;

    /* renamed from: g */
    public final Button f68498g;

    private C27273d(LinearLayout linearLayout, Input input, InlineFeedback inlineFeedback, Button button) {
        this.f68495d = linearLayout;
        this.f68496e = input;
        this.f68497f = inlineFeedback;
        this.f68498g = button;
    }

    /* renamed from: a */
    public static C27273d m84391a(View view) {
        int i = C10322k.f28861l1;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C10322k.decision_info_inline_feedback;
            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
            if (inlineFeedback != null) {
                i = C10322k.recalculate_button;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    return new C27273d((LinearLayout) view, input, inlineFeedback, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27273d m84392d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.action_sheet_loan_decision_change_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84391a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68495d;
    }
}

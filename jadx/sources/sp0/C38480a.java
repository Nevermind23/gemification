package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;

/* renamed from: sp0.a */
public final class C38480a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92158d;

    /* renamed from: e */
    public final Button f92159e;

    /* renamed from: f */
    public final TextView f92160f;

    /* renamed from: g */
    public final InlineFeedback f92161g;

    /* renamed from: h */
    public final LinearLayout f92162h;

    /* renamed from: i */
    public final ConstraintLayout f92163i;

    /* renamed from: j */
    public final TextView f92164j;

    /* renamed from: k */
    public final TextView f92165k;

    private C38480a(LinearLayout linearLayout, Button button, TextView textView, InlineFeedback inlineFeedback, LinearLayout linearLayout2, ConstraintLayout constraintLayout, TextView textView2, TextView textView3) {
        this.f92158d = linearLayout;
        this.f92159e = button;
        this.f92160f = textView;
        this.f92161g = inlineFeedback;
        this.f92162h = linearLayout2;
        this.f92163i = constraintLayout;
        this.f92164j = textView2;
        this.f92165k = textView3;
    }

    /* renamed from: a */
    public static C38480a m112932a(View view) {
        int i = C37439e.button_ok;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C37439e.caption_tv;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C37439e.down_payment_feedback;
                InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                if (inlineFeedback != null) {
                    i = C37439e.forgiven_funds_container;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout != null) {
                        i = C37439e.full_amount_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                        if (constraintLayout != null) {
                            i = C37439e.full_amount_label_tv;
                            TextView textView2 = (TextView) C6202b.m24689a(view, i);
                            if (textView2 != null) {
                                i = C37439e.full_amount_tv;
                                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                if (textView3 != null) {
                                    return new C38480a((LinearLayout) view, button, textView, inlineFeedback, linearLayout, constraintLayout, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38480a m112933d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.action_sheet_activation_conditions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112932a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92158d;
    }
}

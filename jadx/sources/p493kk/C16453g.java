package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.g */
public final class C16453g implements C6201a {

    /* renamed from: d */
    private final LinearLayout f46475d;

    /* renamed from: e */
    public final TextView f46476e;

    /* renamed from: f */
    public final FixedButtonView f46477f;

    /* renamed from: g */
    public final Input f46478g;

    /* renamed from: h */
    public final Input f46479h;

    /* renamed from: i */
    public final Input f46480i;

    /* renamed from: j */
    public final InlineFeedback f46481j;

    /* renamed from: k */
    public final PageDescriptionView f46482k;

    private C16453g(LinearLayout linearLayout, TextView textView, FixedButtonView fixedButtonView, Input input, Input input2, Input input3, InlineFeedback inlineFeedback, PageDescriptionView pageDescriptionView) {
        this.f46475d = linearLayout;
        this.f46476e = textView;
        this.f46477f = fixedButtonView;
        this.f46478g = input;
        this.f46479h = input2;
        this.f46480i = input3;
        this.f46481j = inlineFeedback;
        this.f46482k = pageDescriptionView;
    }

    /* renamed from: a */
    public static C16453g m58616a(View view) {
        int i = C15526d.contact_info_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C15526d.f44068e0;
            FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
            if (fixedButtonView != null) {
                i = C15526d.f44075m0;
                Input input = (Input) C6202b.m24689a(view, i);
                if (input != null) {
                    i = C15526d.insurance_start_date_input;
                    Input input2 = (Input) C6202b.m24689a(view, i);
                    if (input2 != null) {
                        i = C15526d.f44083r1;
                        Input input3 = (Input) C6202b.m24689a(view, i);
                        if (input3 != null) {
                            i = C15526d.start_date_feedback;
                            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                            if (inlineFeedback != null) {
                                i = C15526d.start_date_input_desc;
                                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                                if (pageDescriptionView != null) {
                                    return new C16453g((LinearLayout) view, textView, fixedButtonView, input, input2, input3, inlineFeedback, pageDescriptionView);
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
    public static C16453g m58617d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.fragment_activation_date_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58616a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f46475d;
    }
}

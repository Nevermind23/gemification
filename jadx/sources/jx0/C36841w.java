package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;

/* renamed from: jx0.w */
public final class C36841w implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88911d;

    /* renamed from: e */
    public final InlineFeedback2 f88912e;

    private C36841w(LinearLayout linearLayout, InlineFeedback2 inlineFeedback2) {
        this.f88911d = linearLayout;
        this.f88912e = inlineFeedback2;
    }

    /* renamed from: a */
    public static C36841w m109176a(View view) {
        int i = C32024d.f78833C;
        InlineFeedback2 inlineFeedback2 = (InlineFeedback2) C6202b.m24689a(view, i);
        if (inlineFeedback2 != null) {
            return new C36841w((LinearLayout) view, inlineFeedback2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36841w m109177d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_element_debt_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109176a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88911d;
    }
}

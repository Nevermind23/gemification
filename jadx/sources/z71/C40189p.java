package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import y71.C40031e;

/* renamed from: z71.p */
public final class C40189p implements C6201a {

    /* renamed from: d */
    private final InlineFeedback f95554d;

    /* renamed from: e */
    public final InlineFeedback f95555e;

    private C40189p(InlineFeedback inlineFeedback, InlineFeedback inlineFeedback2) {
        this.f95554d = inlineFeedback;
        this.f95555e = inlineFeedback2;
    }

    /* renamed from: a */
    public static C40189p m116463a(View view) {
        if (view != null) {
            InlineFeedback inlineFeedback = (InlineFeedback) view;
            return new C40189p(inlineFeedback, inlineFeedback);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C40189p m116464d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_insurance_details_contact_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116463a(inflate);
    }

    /* renamed from: c */
    public InlineFeedback mo3946b() {
        return this.f95554d;
    }
}

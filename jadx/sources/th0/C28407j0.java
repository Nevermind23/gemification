package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;

/* renamed from: th0.j0 */
public final class C28407j0 implements C6201a {

    /* renamed from: d */
    private final InlineFeedback2 f72073d;

    /* renamed from: e */
    public final InlineFeedback2 f72074e;

    private C28407j0(InlineFeedback2 inlineFeedback2, InlineFeedback2 inlineFeedback22) {
        this.f72073d = inlineFeedback2;
        this.f72074e = inlineFeedback22;
    }

    /* renamed from: a */
    public static C28407j0 m87149a(View view) {
        if (view != null) {
            InlineFeedback2 inlineFeedback2 = (InlineFeedback2) view;
            return new C28407j0(inlineFeedback2, inlineFeedback2);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28407j0 m87150d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_inline_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87149a(inflate);
    }

    /* renamed from: c */
    public InlineFeedback2 mo3946b() {
        return this.f72073d;
    }
}

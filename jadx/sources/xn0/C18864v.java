package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import sn0.C17902f;

/* renamed from: xn0.v */
public final class C18864v implements C6201a {

    /* renamed from: d */
    private final InlineFeedback2 f52785d;

    /* renamed from: e */
    public final InlineFeedback2 f52786e;

    private C18864v(InlineFeedback2 inlineFeedback2, InlineFeedback2 inlineFeedback22) {
        this.f52785d = inlineFeedback2;
        this.f52786e = inlineFeedback22;
    }

    /* renamed from: a */
    public static C18864v m63826a(View view) {
        if (view != null) {
            InlineFeedback2 inlineFeedback2 = (InlineFeedback2) view;
            return new C18864v(inlineFeedback2, inlineFeedback2);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C18864v m63827d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.section_home_chooser_popup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63826a(inflate);
    }

    /* renamed from: c */
    public InlineFeedback2 mo3946b() {
        return this.f52785d;
    }
}

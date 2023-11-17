package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;

/* renamed from: sp0.a0 */
public final class C38481a0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f92166d;

    /* renamed from: e */
    public final InlineFeedback f92167e;

    private C38481a0(FrameLayout frameLayout, InlineFeedback inlineFeedback) {
        this.f92166d = frameLayout;
        this.f92167e = inlineFeedback;
    }

    /* renamed from: a */
    public static C38481a0 m112936a(View view) {
        int i = C37439e.f89984G;
        InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
        if (inlineFeedback != null) {
            return new C38481a0((FrameLayout) view, inlineFeedback);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38481a0 m112937d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_refinance_info_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112936a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f92166d;
    }
}

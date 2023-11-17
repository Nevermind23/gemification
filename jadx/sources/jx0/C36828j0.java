package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fx0.C32025e;
import p086g1.C6201a;

/* renamed from: jx0.j0 */
public final class C36828j0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f88874d;

    private C36828j0(FrameLayout frameLayout) {
        this.f88874d = frameLayout;
    }

    /* renamed from: a */
    public static C36828j0 m109124a(View view) {
        if (view != null) {
            return new C36828j0((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36828j0 m109125d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.view_input_small_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109124a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f88874d;
    }
}

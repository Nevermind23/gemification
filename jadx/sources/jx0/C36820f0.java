package jx0;

import android.view.View;
import android.widget.LinearLayout;
import p086g1.C6201a;

/* renamed from: jx0.f0 */
public final class C36820f0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88854d;

    private C36820f0(LinearLayout linearLayout) {
        this.f88854d = linearLayout;
    }

    /* renamed from: a */
    public static C36820f0 m109094a(View view) {
        if (view != null) {
            return new C36820f0((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88854d;
    }
}

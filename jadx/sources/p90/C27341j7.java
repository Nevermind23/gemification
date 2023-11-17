package p90;

import android.view.View;
import android.widget.LinearLayout;
import p086g1.C6201a;

/* renamed from: p90.j7 */
public final class C27341j7 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69091d;

    private C27341j7(LinearLayout linearLayout) {
        this.f69091d = linearLayout;
    }

    /* renamed from: a */
    public static C27341j7 m84673a(View view) {
        if (view != null) {
            return new C27341j7((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69091d;
    }
}

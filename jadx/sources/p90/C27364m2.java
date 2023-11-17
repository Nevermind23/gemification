package p90;

import android.view.View;
import android.widget.LinearLayout;
import p086g1.C6201a;

/* renamed from: p90.m2 */
public final class C27364m2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69284d;

    private C27364m2(LinearLayout linearLayout) {
        this.f69284d = linearLayout;
    }

    /* renamed from: a */
    public static C27364m2 m84766a(View view) {
        if (view != null) {
            return new C27364m2((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69284d;
    }
}

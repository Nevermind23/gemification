package p90;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;

/* renamed from: p90.q1 */
public final class C27399q1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69584d;

    /* renamed from: e */
    public final ConstraintLayout f69585e;

    private C27399q1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f69584d = constraintLayout;
        this.f69585e = constraintLayout2;
    }

    /* renamed from: a */
    public static C27399q1 m84899a(View view) {
        if (view != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new C27399q1(constraintLayout, constraintLayout);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69584d;
    }
}

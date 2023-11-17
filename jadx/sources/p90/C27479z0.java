package p90;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p366bk.C10322k;

/* renamed from: p90.z0 */
public final class C27479z0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70323d;

    /* renamed from: e */
    public final BogProgressBar f70324e;

    /* renamed from: f */
    public final ConstraintLayout f70325f;

    private C27479z0(ConstraintLayout constraintLayout, BogProgressBar bogProgressBar, ConstraintLayout constraintLayout2) {
        this.f70323d = constraintLayout;
        this.f70324e = bogProgressBar;
        this.f70325f = constraintLayout2;
    }

    /* renamed from: a */
    public static C27479z0 m85223a(View view) {
        int i = C10322k.f28719Dq;
        BogProgressBar bogProgressBar = (BogProgressBar) C6202b.m24689a(view, i);
        if (bogProgressBar != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new C27479z0(constraintLayout, bogProgressBar, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f70323d;
    }
}

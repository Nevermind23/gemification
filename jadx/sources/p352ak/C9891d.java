package p352ak;

import android.view.View;
import android.widget.RelativeLayout;
import p086g1.C6201a;

/* renamed from: ak.d */
public final class C9891d implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f26875d;

    private C9891d(RelativeLayout relativeLayout) {
        this.f26875d = relativeLayout;
    }

    /* renamed from: a */
    public static C9891d m36278a(View view) {
        if (view != null) {
            return new C9891d((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f26875d;
    }
}

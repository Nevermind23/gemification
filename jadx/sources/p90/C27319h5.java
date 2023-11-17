package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.h5 */
public final class C27319h5 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68885d;

    private C27319h5(FrameLayout frameLayout) {
        this.f68885d = frameLayout;
    }

    /* renamed from: a */
    public static C27319h5 m84584a(View view) {
        if (view != null) {
            return new C27319h5((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27319h5 m84585d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bonus_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84584a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68885d;
    }
}

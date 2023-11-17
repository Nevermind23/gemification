package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.f5 */
public final class C27299f5 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68729d;

    private C27299f5(FrameLayout frameLayout) {
        this.f68729d = frameLayout;
    }

    /* renamed from: a */
    public static C27299f5 m84501a(View view) {
        if (view != null) {
            return new C27299f5((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27299f5 m84502d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_summary_small_separator, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84501a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68729d;
    }
}

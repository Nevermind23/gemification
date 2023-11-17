package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.z4 */
public final class C27483z4 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f70349d;

    private C27483z4(FrameLayout frameLayout) {
        this.f70349d = frameLayout;
    }

    /* renamed from: a */
    public static C27483z4 m85238a(View view) {
        if (view != null) {
            return new C27483z4((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27483z4 m85239d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_summary_big_separator, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85238a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f70349d;
    }
}

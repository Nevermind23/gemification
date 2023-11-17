package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import da0.C19952f;
import p086g1.C6201a;

/* renamed from: ha0.w */
public final class C24946w implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64259d;

    private C24946w(LinearLayout linearLayout) {
        this.f64259d = linearLayout;
    }

    /* renamed from: a */
    public static C24946w m79764a(View view) {
        if (view != null) {
            return new C24946w((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C24946w m79765d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.list_item_deposit_purpose, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79764a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64259d;
    }
}

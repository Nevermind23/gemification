package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.i6 */
public final class C27330i6 implements C6201a {

    /* renamed from: d */
    private final SwipeLayout f68992d;

    /* renamed from: e */
    public final SwipeLayout f68993e;

    private C27330i6(SwipeLayout swipeLayout, SwipeLayout swipeLayout2) {
        this.f68992d = swipeLayout;
        this.f68993e = swipeLayout2;
    }

    /* renamed from: a */
    public static C27330i6 m84629a(View view) {
        if (view != null) {
            SwipeLayout swipeLayout = (SwipeLayout) view;
            return new C27330i6(swipeLayout, swipeLayout);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27330i6 m84630d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_security_contact_swipeview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84629a(inflate);
    }

    /* renamed from: c */
    public SwipeLayout mo3946b() {
        return this.f68992d;
    }
}

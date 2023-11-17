package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import x11.C39772e;

/* renamed from: b31.j */
public final class C31121j implements C6201a {

    /* renamed from: d */
    private final NewProductHeaderView f77346d;

    /* renamed from: e */
    public final NewProductHeaderView f77347e;

    private C31121j(NewProductHeaderView newProductHeaderView, NewProductHeaderView newProductHeaderView2) {
        this.f77346d = newProductHeaderView;
        this.f77347e = newProductHeaderView2;
    }

    /* renamed from: a */
    public static C31121j m92603a(View view) {
        if (view != null) {
            NewProductHeaderView newProductHeaderView = (NewProductHeaderView) view;
            return new C31121j(newProductHeaderView, newProductHeaderView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31121j m92604d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.item_product_header_invert, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92603a(inflate);
    }

    /* renamed from: c */
    public NewProductHeaderView mo3946b() {
        return this.f77346d;
    }
}

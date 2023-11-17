package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productgroup.ProductGroupView;

/* renamed from: iy0.y */
public final class C36650y implements C6201a {

    /* renamed from: d */
    private final ProductGroupView f88462d;

    private C36650y(ProductGroupView productGroupView) {
        this.f88462d = productGroupView;
    }

    /* renamed from: a */
    public static C36650y m108735a(View view) {
        if (view != null) {
            return new C36650y((ProductGroupView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36650y m108736d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.grid_item_product_group_square, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108735a(inflate);
    }

    /* renamed from: c */
    public ProductGroupView mo3946b() {
        return this.f88462d;
    }
}

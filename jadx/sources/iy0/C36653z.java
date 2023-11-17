package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productgroup.ProductGroupView;

/* renamed from: iy0.z */
public final class C36653z implements C6201a {

    /* renamed from: d */
    private final ProductGroupView f88473d;

    private C36653z(ProductGroupView productGroupView) {
        this.f88473d = productGroupView;
    }

    /* renamed from: a */
    public static C36653z m108746a(View view) {
        if (view != null) {
            return new C36653z((ProductGroupView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36653z m108747d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.grid_item_product_group_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108746a(inflate);
    }

    /* renamed from: c */
    public ProductGroupView mo3946b() {
        return this.f88473d;
    }
}

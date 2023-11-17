package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import x11.C39772e;

/* renamed from: b31.k */
public final class C31122k implements C6201a {

    /* renamed from: d */
    private final NewProductHeaderView f77348d;

    /* renamed from: e */
    public final NewProductHeaderView f77349e;

    private C31122k(NewProductHeaderView newProductHeaderView, NewProductHeaderView newProductHeaderView2) {
        this.f77348d = newProductHeaderView;
        this.f77349e = newProductHeaderView2;
    }

    /* renamed from: a */
    public static C31122k m92607a(View view) {
        if (view != null) {
            NewProductHeaderView newProductHeaderView = (NewProductHeaderView) view;
            return new C31122k(newProductHeaderView, newProductHeaderView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31122k m92608d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.item_product_header_white, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92607a(inflate);
    }

    /* renamed from: c */
    public NewProductHeaderView mo3946b() {
        return this.f77348d;
    }
}

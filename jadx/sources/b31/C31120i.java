package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import x11.C39772e;

/* renamed from: b31.i */
public final class C31120i implements C6201a {

    /* renamed from: d */
    private final NewProductHeaderView f77344d;

    /* renamed from: e */
    public final NewProductHeaderView f77345e;

    private C31120i(NewProductHeaderView newProductHeaderView, NewProductHeaderView newProductHeaderView2) {
        this.f77344d = newProductHeaderView;
        this.f77345e = newProductHeaderView2;
    }

    /* renamed from: a */
    public static C31120i m92599a(View view) {
        if (view != null) {
            NewProductHeaderView newProductHeaderView = (NewProductHeaderView) view;
            return new C31120i(newProductHeaderView, newProductHeaderView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31120i m92600d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.item_product_header_black, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92599a(inflate);
    }

    /* renamed from: c */
    public NewProductHeaderView mo3946b() {
        return this.f77344d;
    }
}

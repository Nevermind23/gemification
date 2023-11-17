package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import rb0.C27986e;

/* renamed from: xb0.s */
public final class C29731s implements C6201a {

    /* renamed from: d */
    private final NewProductHeaderView f75139d;

    /* renamed from: e */
    public final NewProductHeaderView f75140e;

    private C29731s(NewProductHeaderView newProductHeaderView, NewProductHeaderView newProductHeaderView2) {
        this.f75139d = newProductHeaderView;
        this.f75140e = newProductHeaderView2;
    }

    /* renamed from: a */
    public static C29731s m90289a(View view) {
        if (view != null) {
            NewProductHeaderView newProductHeaderView = (NewProductHeaderView) view;
            return new C29731s(newProductHeaderView, newProductHeaderView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C29731s m90290d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_details_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90289a(inflate);
    }

    /* renamed from: c */
    public NewProductHeaderView mo3946b() {
        return this.f75139d;
    }
}

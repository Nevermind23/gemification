package il0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import el0.C20265c;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;

/* renamed from: il0.f */
public final class C25229f implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f64808d;

    /* renamed from: e */
    public final TextImageCardView f64809e;

    private C25229f(TextImageCardView textImageCardView, TextImageCardView textImageCardView2) {
        this.f64808d = textImageCardView;
        this.f64809e = textImageCardView2;
    }

    /* renamed from: a */
    public static C25229f m80313a(View view) {
        if (view != null) {
            TextImageCardView textImageCardView = (TextImageCardView) view;
            return new C25229f(textImageCardView, textImageCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C25229f m80314d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C20265c.item_insurance_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80313a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f64808d;
    }
}

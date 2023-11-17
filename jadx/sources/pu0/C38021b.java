package pu0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ku0.C36994d;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;

/* renamed from: pu0.b */
public final class C38021b implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f91360d;

    private C38021b(TextImageCardView textImageCardView) {
        this.f91360d = textImageCardView;
    }

    /* renamed from: a */
    public static C38021b m111794a(View view) {
        if (view != null) {
            return new C38021b((TextImageCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C38021b m111795d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36994d.item_nbo_card_caption, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111794a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f91360d;
    }
}

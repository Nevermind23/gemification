package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productcards.GaltCardView;

/* renamed from: iy0.m1 */
public final class C36616m1 implements C6201a {

    /* renamed from: d */
    private final GaltCardView f88329d;

    private C36616m1(GaltCardView galtCardView) {
        this.f88329d = galtCardView;
    }

    /* renamed from: a */
    public static C36616m1 m108597a(View view) {
        if (view != null) {
            return new C36616m1((GaltCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36616m1 m108598d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_galt_card_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108597a(inflate);
    }

    /* renamed from: c */
    public GaltCardView mo3946b() {
        return this.f88329d;
    }
}

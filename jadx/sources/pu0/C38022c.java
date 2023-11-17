package pu0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ku0.C36994d;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;

/* renamed from: pu0.c */
public final class C38022c implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f91361d;

    private C38022c(TextImageCardView textImageCardView) {
        this.f91361d = textImageCardView;
    }

    /* renamed from: a */
    public static C38022c m111798a(View view) {
        if (view != null) {
            return new C38022c((TextImageCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C38022c m111799d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36994d.item_nbo_card_highlight, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111798a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f91361d;
    }
}

package pu0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ku0.C36994d;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;

/* renamed from: pu0.d */
public final class C38023d implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f91362d;

    private C38023d(TextImageCardView textImageCardView) {
        this.f91362d = textImageCardView;
    }

    /* renamed from: a */
    public static C38023d m111802a(View view) {
        if (view != null) {
            return new C38023d((TextImageCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C38023d m111803d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36994d.item_nbo_card_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111802a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f91362d;
    }
}

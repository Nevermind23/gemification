package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p480jl.C16214e;

/* renamed from: nl.n */
public final class C17061n implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f47659d;

    /* renamed from: e */
    public final TextImageCardView f47660e;

    private C17061n(TextImageCardView textImageCardView, TextImageCardView textImageCardView2) {
        this.f47659d = textImageCardView;
        this.f47660e = textImageCardView2;
    }

    /* renamed from: a */
    public static C17061n m59950a(View view) {
        if (view != null) {
            TextImageCardView textImageCardView = (TextImageCardView) view;
            return new C17061n(textImageCardView, textImageCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C17061n m59951d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_offers_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59950a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f47659d;
    }
}

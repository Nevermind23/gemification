package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p480jl.C16214e;

/* renamed from: nl.j */
public final class C17057j implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f47642d;

    /* renamed from: e */
    public final TextImageCardView f47643e;

    private C17057j(TextImageCardView textImageCardView, TextImageCardView textImageCardView2) {
        this.f47642d = textImageCardView;
        this.f47643e = textImageCardView2;
    }

    /* renamed from: a */
    public static C17057j m59934a(View view) {
        if (view != null) {
            TextImageCardView textImageCardView = (TextImageCardView) view;
            return new C17057j(textImageCardView, textImageCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C17057j m59935d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_categories_merchant, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59934a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f47642d;
    }
}

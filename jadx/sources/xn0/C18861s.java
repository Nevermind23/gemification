package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import sn0.C17902f;

/* renamed from: xn0.s */
public final class C18861s implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f52775d;

    /* renamed from: e */
    public final TextImageCardView f52776e;

    private C18861s(TextImageCardView textImageCardView, TextImageCardView textImageCardView2) {
        this.f52775d = textImageCardView;
        this.f52776e = textImageCardView2;
    }

    /* renamed from: a */
    public static C18861s m63814a(View view) {
        if (view != null) {
            TextImageCardView textImageCardView = (TextImageCardView) view;
            return new C18861s(textImageCardView, textImageCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C18861s m63815d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.list_item_small_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63814a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f52775d;
    }
}

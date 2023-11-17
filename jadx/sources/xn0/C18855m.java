package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import sn0.C17902f;

/* renamed from: xn0.m */
public final class C18855m implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f52762d;

    /* renamed from: e */
    public final TextImageCardView f52763e;

    private C18855m(TextImageCardView textImageCardView, TextImageCardView textImageCardView2) {
        this.f52762d = textImageCardView;
        this.f52763e = textImageCardView2;
    }

    /* renamed from: a */
    public static C18855m m63790a(View view) {
        if (view != null) {
            TextImageCardView textImageCardView = (TextImageCardView) view;
            return new C18855m(textImageCardView, textImageCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C18855m m63791d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.list_item_big_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63790a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f52762d;
    }
}

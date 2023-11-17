package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import sn0.C17902f;

/* renamed from: xn0.n */
public final class C18856n implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f52764d;

    /* renamed from: e */
    public final TextImageCardView f52765e;

    private C18856n(TextImageCardView textImageCardView, TextImageCardView textImageCardView2) {
        this.f52764d = textImageCardView;
        this.f52765e = textImageCardView2;
    }

    /* renamed from: a */
    public static C18856n m63794a(View view) {
        if (view != null) {
            TextImageCardView textImageCardView = (TextImageCardView) view;
            return new C18856n(textImageCardView, textImageCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C18856n m63795d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.list_item_category, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63794a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f52764d;
    }
}

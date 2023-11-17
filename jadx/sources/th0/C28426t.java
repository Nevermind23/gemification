package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;

/* renamed from: th0.t */
public final class C28426t implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f72208d;

    /* renamed from: e */
    public final TextImageCardView f72209e;

    private C28426t(TextImageCardView textImageCardView, TextImageCardView textImageCardView2) {
        this.f72208d = textImageCardView;
        this.f72209e = textImageCardView2;
    }

    /* renamed from: a */
    public static C28426t m87225a(View view) {
        if (view != null) {
            TextImageCardView textImageCardView = (TextImageCardView) view;
            return new C28426t(textImageCardView, textImageCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28426t m87226d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_categories_text_image_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87225a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f72208d;
    }
}

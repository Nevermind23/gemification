package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;

/* renamed from: th0.s0 */
public final class C28425s0 implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f72206d;

    /* renamed from: e */
    public final TextImageCardView f72207e;

    private C28425s0(TextImageCardView textImageCardView, TextImageCardView textImageCardView2) {
        this.f72206d = textImageCardView;
        this.f72207e = textImageCardView2;
    }

    /* renamed from: a */
    public static C28425s0 m87221a(View view) {
        if (view != null) {
            TextImageCardView textImageCardView = (TextImageCardView) view;
            return new C28425s0(textImageCardView, textImageCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28425s0 m87222d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_offer_big, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87221a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f72206d;
    }
}

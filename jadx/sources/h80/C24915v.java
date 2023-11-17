package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import u70.C28607c;

/* renamed from: h80.v */
public final class C24915v implements C6201a {

    /* renamed from: d */
    private final TextImageCardView f64066d;

    /* renamed from: e */
    public final TextImageCardView f64067e;

    private C24915v(TextImageCardView textImageCardView, TextImageCardView textImageCardView2) {
        this.f64066d = textImageCardView;
        this.f64067e = textImageCardView2;
    }

    /* renamed from: a */
    public static C24915v m79645a(View view) {
        if (view != null) {
            TextImageCardView textImageCardView = (TextImageCardView) view;
            return new C24915v(textImageCardView, textImageCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C24915v m79646d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.item_result_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79645a(inflate);
    }

    /* renamed from: c */
    public TextImageCardView mo3946b() {
        return this.f64066d;
    }
}

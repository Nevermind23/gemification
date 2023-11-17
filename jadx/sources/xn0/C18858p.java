package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.imagecard.MediumTextImageCardView;
import sn0.C17902f;

/* renamed from: xn0.p */
public final class C18858p implements C6201a {

    /* renamed from: d */
    private final MediumTextImageCardView f52770d;

    private C18858p(MediumTextImageCardView mediumTextImageCardView) {
        this.f52770d = mediumTextImageCardView;
    }

    /* renamed from: a */
    public static C18858p m63802a(View view) {
        if (view != null) {
            return new C18858p((MediumTextImageCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C18858p m63803d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.list_item_chooser_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63802a(inflate);
    }

    /* renamed from: c */
    public MediumTextImageCardView mo3946b() {
        return this.f52770d;
    }
}

package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p601sg.C17783h;

/* renamed from: ak.b0 */
public final class C9876b0 implements C6201a {

    /* renamed from: d */
    private final TextProgressBarView f26790d;

    /* renamed from: e */
    public final TextProgressBarView f26791e;

    private C9876b0(TextProgressBarView textProgressBarView, TextProgressBarView textProgressBarView2) {
        this.f26790d = textProgressBarView;
        this.f26791e = textProgressBarView2;
    }

    /* renamed from: a */
    public static C9876b0 m36224a(View view) {
        if (view != null) {
            TextProgressBarView textProgressBarView = (TextProgressBarView) view;
            return new C9876b0(textProgressBarView, textProgressBarView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9876b0 m36225d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.layout_product_card_deposit_goal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36224a(inflate);
    }

    /* renamed from: c */
    public TextProgressBarView mo3946b() {
        return this.f26790d;
    }
}

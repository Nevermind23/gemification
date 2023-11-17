package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.c0 */
public final class C9884c0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f26832d;

    /* renamed from: e */
    public final TextBadgeView f26833e;

    /* renamed from: f */
    public final TextBadgeView f26834f;

    private C9884c0(ConstraintLayout constraintLayout, TextBadgeView textBadgeView, TextBadgeView textBadgeView2) {
        this.f26832d = constraintLayout;
        this.f26833e = textBadgeView;
        this.f26834f = textBadgeView2;
    }

    /* renamed from: a */
    public static C9884c0 m36253a(View view) {
        int i = C17782g.amount_badge;
        TextBadgeView textBadgeView = (TextBadgeView) C6202b.m24689a(view, i);
        if (textBadgeView != null) {
            i = C17782g.date_badge;
            TextBadgeView textBadgeView2 = (TextBadgeView) C6202b.m24689a(view, i);
            if (textBadgeView2 != null) {
                return new C9884c0((ConstraintLayout) view, textBadgeView, textBadgeView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9884c0 m36254d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.layout_product_card_galt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36253a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f26832d;
    }
}

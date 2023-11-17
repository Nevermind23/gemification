package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.p4 */
public final class C9992p4 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f27401d;

    /* renamed from: e */
    public final TextBadgeView f27402e;

    /* renamed from: f */
    public final TextBadgeView f27403f;

    private C9992p4(FrameLayout frameLayout, TextBadgeView textBadgeView, TextBadgeView textBadgeView2) {
        this.f27401d = frameLayout;
        this.f27402e = textBadgeView;
        this.f27403f = textBadgeView2;
    }

    /* renamed from: a */
    public static C9992p4 m36647a(View view) {
        int i = C17782g.pause_badge;
        TextBadgeView textBadgeView = (TextBadgeView) C6202b.m24689a(view, i);
        if (textBadgeView != null) {
            i = C17782g.transaction_badge;
            TextBadgeView textBadgeView2 = (TextBadgeView) C6202b.m24689a(view, i);
            if (textBadgeView2 != null) {
                return new C9992p4((FrameLayout) view, textBadgeView, textBadgeView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9992p4 m36648d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_piggy_bank_bottom_text_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36647a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f27401d;
    }
}

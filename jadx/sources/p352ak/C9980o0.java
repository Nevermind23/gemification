package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p601sg.C17783h;

/* renamed from: ak.o0 */
public final class C9980o0 implements C6201a {

    /* renamed from: d */
    private final InfoBadgeView f27338d;

    /* renamed from: e */
    public final InfoBadgeView f27339e;

    private C9980o0(InfoBadgeView infoBadgeView, InfoBadgeView infoBadgeView2) {
        this.f27338d = infoBadgeView;
        this.f27339e = infoBadgeView2;
    }

    /* renamed from: a */
    public static C9980o0 m36603a(View view) {
        if (view != null) {
            InfoBadgeView infoBadgeView = (InfoBadgeView) view;
            return new C9980o0(infoBadgeView, infoBadgeView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9980o0 m36604d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_account_card_amount_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36603a(inflate);
    }

    /* renamed from: c */
    public InfoBadgeView mo3946b() {
        return this.f27338d;
    }
}

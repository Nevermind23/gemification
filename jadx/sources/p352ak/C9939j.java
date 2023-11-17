package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p601sg.C17783h;

/* renamed from: ak.j */
public final class C9939j implements C6201a {

    /* renamed from: d */
    private final InfoBadgeView f27128d;

    /* renamed from: e */
    public final InfoBadgeView f27129e;

    private C9939j(InfoBadgeView infoBadgeView, InfoBadgeView infoBadgeView2) {
        this.f27128d = infoBadgeView;
        this.f27129e = infoBadgeView2;
    }

    /* renamed from: a */
    public static C9939j m36454a(View view) {
        if (view != null) {
            InfoBadgeView infoBadgeView = (InfoBadgeView) view;
            return new C9939j(infoBadgeView, infoBadgeView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9939j m36455d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_card_objective_merchants, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36454a(inflate);
    }

    /* renamed from: c */
    public InfoBadgeView mo3946b() {
        return this.f27128d;
    }
}

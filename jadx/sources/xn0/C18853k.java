package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.cardobjective.CardObjectiveView;
import sn0.C17902f;

/* renamed from: xn0.k */
public final class C18853k implements C6201a {

    /* renamed from: d */
    private final CardObjectiveView f52757d;

    /* renamed from: e */
    public final CardObjectiveView f52758e;

    private C18853k(CardObjectiveView cardObjectiveView, CardObjectiveView cardObjectiveView2) {
        this.f52757d = cardObjectiveView;
        this.f52758e = cardObjectiveView2;
    }

    /* renamed from: a */
    public static C18853k m63782a(View view) {
        if (view != null) {
            CardObjectiveView cardObjectiveView = (CardObjectiveView) view;
            return new C18853k(cardObjectiveView, cardObjectiveView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C18853k m63783d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.item_lifestyle_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63782a(inflate);
    }

    /* renamed from: c */
    public CardObjectiveView mo3946b() {
        return this.f52757d;
    }
}

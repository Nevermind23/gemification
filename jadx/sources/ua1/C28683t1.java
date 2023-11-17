package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ba1.C10217v;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.infocard.InfoCardView;

/* renamed from: ua1.t1 */
public final class C28683t1 implements C6201a {

    /* renamed from: d */
    private final InfoCardView f72950d;

    /* renamed from: e */
    public final InfoCardView f72951e;

    private C28683t1(InfoCardView infoCardView, InfoCardView infoCardView2) {
        this.f72950d = infoCardView;
        this.f72951e = infoCardView2;
    }

    /* renamed from: a */
    public static C28683t1 m87848a(View view) {
        if (view != null) {
            InfoCardView infoCardView = (InfoCardView) view;
            return new C28683t1(infoCardView, infoCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28683t1 m87849d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.onboarding_info_card_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87848a(inflate);
    }

    /* renamed from: c */
    public InfoCardView mo3946b() {
        return this.f72950d;
    }
}

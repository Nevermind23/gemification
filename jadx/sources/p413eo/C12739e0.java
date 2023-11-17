package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.packagecard.SoloCardView;
import p356ao.C10115g;

/* renamed from: eo.e0 */
public final class C12739e0 implements C6201a {

    /* renamed from: d */
    private final SoloCardView f37705d;

    /* renamed from: e */
    public final SoloCardView f37706e;

    private C12739e0(SoloCardView soloCardView, SoloCardView soloCardView2) {
        this.f37705d = soloCardView;
        this.f37706e = soloCardView2;
    }

    /* renamed from: a */
    public static C12739e0 m48349a(View view) {
        if (view != null) {
            SoloCardView soloCardView = (SoloCardView) view;
            return new C12739e0(soloCardView, soloCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C12739e0 m48350d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_become_solo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48349a(inflate);
    }

    /* renamed from: c */
    public SoloCardView mo3946b() {
        return this.f37705d;
    }
}

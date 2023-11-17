package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;

/* renamed from: ue0.q0 */
public final class C28747q0 implements C6201a {

    /* renamed from: d */
    private final EmptyWidget f73430d;

    private C28747q0(EmptyWidget emptyWidget) {
        this.f73430d = emptyWidget;
    }

    /* renamed from: a */
    public static C28747q0 m88114a(View view) {
        if (view != null) {
            return new C28747q0((EmptyWidget) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28747q0 m88115d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_gt_start_investing_detail_section_title, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88114a(inflate);
    }

    /* renamed from: c */
    public EmptyWidget mo3946b() {
        return this.f73430d;
    }
}

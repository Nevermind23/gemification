package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import fx0.C32025e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: jx0.x */
public final class C36842x implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88913d;

    /* renamed from: e */
    public final LayerView f88914e;

    /* renamed from: f */
    public final View f88915f;

    /* renamed from: g */
    public final LayerView f88916g;

    private C36842x(LinearLayout linearLayout, LayerView layerView, View view, LayerView layerView2) {
        this.f88913d = linearLayout;
        this.f88914e = layerView;
        this.f88915f = view;
        this.f88916g = layerView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = fx0.C32024d.middle_background;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static jx0.C36842x m109180a(android.view.View r4) {
        /*
            int r0 = fx0.C32024d.bottom_background
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            ge.bog.designsystem.components.layersandshadows.LayerView r1 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r1
            if (r1 == 0) goto L_0x0024
            int r0 = fx0.C32024d.middle_background
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            if (r2 == 0) goto L_0x0024
            int r0 = fx0.C32024d.top_background
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r0)
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r3
            if (r3 == 0) goto L_0x0024
            jx0.x r0 = new jx0.x
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x0024:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jx0.C36842x.m109180a(android.view.View):jx0.x");
    }

    /* renamed from: d */
    public static C36842x m109181d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_element_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109180a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88913d;
    }
}

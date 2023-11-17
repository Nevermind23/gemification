package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ue0.j */
public final class C28732j implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f73304d;

    /* renamed from: e */
    public final LayerView f73305e;

    /* renamed from: f */
    public final LinearLayoutCompat f73306f;

    /* renamed from: g */
    public final AppCompatImageView f73307g;

    /* renamed from: h */
    public final LayerView f73308h;

    /* renamed from: i */
    public final LinearLayoutCompat f73309i;

    /* renamed from: j */
    public final AppCompatImageView f73310j;

    /* renamed from: k */
    public final View f73311k;

    private C28732j(LinearLayoutCompat linearLayoutCompat, LayerView layerView, LinearLayoutCompat linearLayoutCompat2, AppCompatImageView appCompatImageView, LayerView layerView2, LinearLayoutCompat linearLayoutCompat3, AppCompatImageView appCompatImageView2, View view) {
        this.f73304d = linearLayoutCompat;
        this.f73305e = layerView;
        this.f73306f = linearLayoutCompat2;
        this.f73307g = appCompatImageView;
        this.f73308h = layerView2;
        this.f73309i = linearLayoutCompat3;
        this.f73310j = appCompatImageView2;
        this.f73311k = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = ie0.C25187g.f64673G3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28732j m88051a(android.view.View r11) {
        /*
            int r0 = ie0.C25187g.close_background_layer
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r4 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r4
            if (r4 == 0) goto L_0x0054
            int r0 = ie0.C25187g.close_container
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat r5 = (androidx.appcompat.widget.LinearLayoutCompat) r5
            if (r5 == 0) goto L_0x0054
            int r0 = ie0.C25187g.close_image
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            if (r6 == 0) goto L_0x0054
            int r0 = ie0.C25187g.faq_background_layer
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r7 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r7
            if (r7 == 0) goto L_0x0054
            int r0 = ie0.C25187g.faq_container
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            androidx.appcompat.widget.LinearLayoutCompat r8 = (androidx.appcompat.widget.LinearLayoutCompat) r8
            if (r8 == 0) goto L_0x0054
            int r0 = ie0.C25187g.f64709m1
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            if (r9 == 0) goto L_0x0054
            int r0 = ie0.C25187g.f64673G3
            android.view.View r10 = p086g1.C6202b.m24689a(r11, r0)
            if (r10 == 0) goto L_0x0054
            ue0.j r0 = new ue0.j
            r3 = r11
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0054:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28732j.m88051a(android.view.View):ue0.j");
    }

    /* renamed from: d */
    public static C28732j m88052d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_gt_more_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88051a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f73304d;
    }
}

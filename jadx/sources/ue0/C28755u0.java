package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ue0.u0 */
public final class C28755u0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73478d;

    /* renamed from: e */
    public final ImageView f73479e;

    /* renamed from: f */
    public final LayerView f73480f;

    /* renamed from: g */
    public final TextView f73481g;

    /* renamed from: h */
    public final TextView f73482h;

    /* renamed from: i */
    public final View f73483i;

    /* renamed from: j */
    public final TextView f73484j;

    /* renamed from: k */
    public final TextView f73485k;

    /* renamed from: l */
    public final TextView f73486l;

    private C28755u0(LinearLayout linearLayout, ImageView imageView, LayerView layerView, TextView textView, TextView textView2, View view, TextView textView3, TextView textView4, TextView textView5) {
        this.f73478d = linearLayout;
        this.f73479e = imageView;
        this.f73480f = layerView;
        this.f73481g = textView;
        this.f73482h = textView2;
        this.f73483i = view;
        this.f73484j = textView3;
        this.f73485k = textView4;
        this.f73486l = textView5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = ie0.C25187g.f64673G3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28755u0 m88150a(android.view.View r12) {
        /*
            int r0 = ie0.C25187g.f64681Q1
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x005f
            int r0 = ie0.C25187g.image_background_layer
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r5
            if (r5 == 0) goto L_0x005f
            int r0 = ie0.C25187g.right_bottom
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x005f
            int r0 = ie0.C25187g.right_top
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x005f
            int r0 = ie0.C25187g.f64673G3
            android.view.View r8 = p086g1.C6202b.m24689a(r12, r0)
            if (r8 == 0) goto L_0x005f
            int r0 = ie0.C25187g.tran_date
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x005f
            int r0 = ie0.C25187g.tran_share
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x005f
            int r0 = ie0.C25187g.tran_title
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x005f
            ue0.u0 r0 = new ue0.u0
            r3 = r12
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x005f:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28755u0.m88150a(android.view.View):ue0.u0");
    }

    /* renamed from: d */
    public static C28755u0 m88151d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_gt_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88150a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73478d;
    }
}

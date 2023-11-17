package p482jn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p426fn.C12930d;

/* renamed from: jn.d */
public final class C16251d implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f46043d;

    /* renamed from: e */
    public final TextView f46044e;

    /* renamed from: f */
    public final ImageView f46045f;

    /* renamed from: g */
    public final ImageView f46046g;

    /* renamed from: h */
    public final LayerView f46047h;

    /* renamed from: i */
    public final View f46048i;

    /* renamed from: j */
    public final TextView f46049j;

    /* renamed from: k */
    public final TextView f46050k;

    private C16251d(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, LayerView layerView, View view, TextView textView2, TextView textView3) {
        this.f46043d = constraintLayout;
        this.f46044e = textView;
        this.f46045f = imageView;
        this.f46046g = imageView2;
        this.f46047h = layerView;
        this.f46048i = view;
        this.f46049j = textView2;
        this.f46050k = textView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = p426fn.C12929c.f38177H;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p482jn.C16251d m57939a(android.view.View r11) {
        /*
            int r0 = p426fn.C12929c.active_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0054
            int r0 = p426fn.C12929c.f38188x
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x0054
            int r0 = p426fn.C12929c.f38189y
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0054
            int r0 = p426fn.C12929c.f38190z
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r7 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r7
            if (r7 == 0) goto L_0x0054
            int r0 = p426fn.C12929c.f38177H
            android.view.View r8 = p086g1.C6202b.m24689a(r11, r0)
            if (r8 == 0) goto L_0x0054
            int r0 = p426fn.C12929c.subtitle_caption
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0054
            int r0 = p426fn.C12929c.f38179K
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x0054
            jn.d r0 = new jn.d
            r3 = r11
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p482jn.C16251d.m57939a(android.view.View):jn.d");
    }

    /* renamed from: d */
    public static C16251d m57940d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12930d.item_card_additional_function, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57939a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f46043d;
    }
}

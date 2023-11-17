package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17783h;

/* renamed from: ak.i2 */
public final class C9934i2 implements C6201a {

    /* renamed from: d */
    private final View f27093d;

    /* renamed from: e */
    public final AppCompatImageView f27094e;

    /* renamed from: f */
    public final CheckboxView f27095f;

    /* renamed from: g */
    public final ConstraintLayout f27096g;

    /* renamed from: h */
    public final LinearLayout f27097h;

    /* renamed from: i */
    public final View f27098i;

    /* renamed from: j */
    public final AppCompatImageView f27099j;

    /* renamed from: k */
    public final LayerView f27100k;

    /* renamed from: l */
    public final AppCompatTextView f27101l;

    /* renamed from: m */
    public final AppCompatTextView f27102m;

    private C9934i2(View view, AppCompatImageView appCompatImageView, CheckboxView checkboxView, ConstraintLayout constraintLayout, LinearLayout linearLayout, View view2, AppCompatImageView appCompatImageView2, LayerView layerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27093d = view;
        this.f27094e = appCompatImageView;
        this.f27095f = checkboxView;
        this.f27096g = constraintLayout;
        this.f27097h = linearLayout;
        this.f27098i = view2;
        this.f27099j = appCompatImageView2;
        this.f27100k = layerView;
        this.f27101l = appCompatTextView;
        this.f27102m = appCompatTextView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = p601sg.C17782g.f49699K2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C9934i2 m36438a(android.view.View r13) {
        /*
            int r0 = p601sg.C17782g.f49720R
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            if (r4 == 0) goto L_0x0068
            int r0 = p601sg.C17782g.f49793t1
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            ge.bog.designsystem.components.checkbox.CheckboxView r5 = (p341ge.bog.designsystem.components.checkbox.CheckboxView) r5
            if (r5 == 0) goto L_0x0068
            int r0 = p601sg.C17782g.f49728T1
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            if (r6 == 0) goto L_0x0068
            int r0 = p601sg.C17782g.f49731U1
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x0068
            int r0 = p601sg.C17782g.f49699K2
            android.view.View r8 = p086g1.C6202b.m24689a(r13, r0)
            if (r8 == 0) goto L_0x0068
            int r0 = p601sg.C17782g.f49766j4
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            if (r9 == 0) goto L_0x0068
            int r0 = p601sg.C17782g.icon_image_frame
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r10 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r10
            if (r10 == 0) goto L_0x0068
            int r0 = p601sg.C17782g.sub_title
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            if (r11 == 0) goto L_0x0068
            int r0 = p601sg.C17782g.f49751c9
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r12 = r1
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            if (r12 == 0) goto L_0x0068
            ak.i2 r0 = new ak.i2
            r2 = r0
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0068:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C9934i2.m36438a(android.view.View):ak.i2");
    }

    /* renamed from: c */
    public static C9934i2 m36439c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_checkbox_accordion, viewGroup);
            return m36438a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27093d;
    }
}

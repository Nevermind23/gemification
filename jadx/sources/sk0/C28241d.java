package sk0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ok0.C27030f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: sk0.d */
public final class C28241d implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f71650d;

    /* renamed from: e */
    public final LinearLayout f71651e;

    /* renamed from: f */
    public final View f71652f;

    /* renamed from: g */
    public final LoadingView f71653g;

    /* renamed from: h */
    public final AppCompatImageView f71654h;

    /* renamed from: i */
    public final LayerView f71655i;

    /* renamed from: j */
    public final AppCompatTextView f71656j;

    /* renamed from: k */
    public final TextView f71657k;

    private C28241d(ConstraintLayout constraintLayout, LinearLayout linearLayout, View view, LoadingView loadingView, AppCompatImageView appCompatImageView, LayerView layerView, AppCompatTextView appCompatTextView, TextView textView) {
        this.f71650d = constraintLayout;
        this.f71651e = linearLayout;
        this.f71652f = view;
        this.f71653g = loadingView;
        this.f71654h = appCompatImageView;
        this.f71655i = layerView;
        this.f71656j = appCompatTextView;
        this.f71657k = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = ok0.C27029e.f67894p;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sk0.C28241d m86786a(android.view.View r11) {
        /*
            int r0 = ok0.C27029e.f67893n
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x0054
            int r0 = ok0.C27029e.f67894p
            android.view.View r5 = p086g1.C6202b.m24689a(r11, r0)
            if (r5 == 0) goto L_0x0054
            int r0 = ok0.C27029e.f67879E
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            ge.bog.designsystem.components.loading.LoadingView r6 = (p341ge.bog.designsystem.components.loading.LoadingView) r6
            if (r6 == 0) goto L_0x0054
            int r0 = ok0.C27029e.search_item_image
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            if (r7 == 0) goto L_0x0054
            int r0 = ok0.C27029e.search_item_image_layer
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r8 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r8
            if (r8 == 0) goto L_0x0054
            int r0 = ok0.C27029e.f67887b0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            if (r9 == 0) goto L_0x0054
            int r0 = ok0.C27029e.f67891h0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x0054
            sk0.d r0 = new sk0.d
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
        throw new UnsupportedOperationException("Method not decompiled: sk0.C28241d.m86786a(android.view.View):sk0.d");
    }

    /* renamed from: d */
    public static C28241d m86787d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27030f.item_list_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86786a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f71650d;
    }
}

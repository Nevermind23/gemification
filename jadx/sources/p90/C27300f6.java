package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p366bk.C10324m;

/* renamed from: p90.f6 */
public final class C27300f6 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68730d;

    /* renamed from: e */
    public final AppCompatImageView f68731e;

    /* renamed from: f */
    public final LayerView f68732f;

    /* renamed from: g */
    public final TextBadgeView f68733g;

    /* renamed from: h */
    public final View f68734h;

    /* renamed from: i */
    public final TextView f68735i;

    private C27300f6(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LayerView layerView, TextBadgeView textBadgeView, View view, TextView textView) {
        this.f68730d = constraintLayout;
        this.f68731e = appCompatImageView;
        this.f68732f = layerView;
        this.f68733g = textBadgeView;
        this.f68734h = view;
        this.f68735i = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p366bk.C10322k.f28729Eu;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27300f6 m84505a(android.view.View r9) {
        /*
            int r0 = p366bk.C10322k.f28822bh
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            if (r4 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.f28829eh
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r5
            if (r5 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.f28762Km
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            ge.bog.designsystem.components.textbadge.TextBadgeView r6 = (p341ge.bog.designsystem.components.textbadge.TextBadgeView) r6
            if (r6 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.f28729Eu
            android.view.View r7 = p086g1.C6202b.m24689a(r9, r0)
            if (r7 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.f28721Dx
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x003e
            p90.f6 r0 = new p90.f6
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x003e:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27300f6.m84505a(android.view.View):p90.f6");
    }

    /* renamed from: d */
    public static C27300f6 m84506d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_new_product_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84505a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68730d;
    }
}

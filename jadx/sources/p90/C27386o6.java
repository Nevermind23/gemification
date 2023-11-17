package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p366bk.C10324m;

/* renamed from: p90.o6 */
public final class C27386o6 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69474d;

    /* renamed from: e */
    public final BogImageView f69475e;

    /* renamed from: f */
    public final AppCompatTextView f69476f;

    /* renamed from: g */
    public final TwoLineReverseTextItem f69477g;

    /* renamed from: h */
    public final View f69478h;

    /* renamed from: i */
    public final FrameLayout f69479i;

    /* renamed from: j */
    public final ImageView f69480j;

    /* renamed from: k */
    public final LayerView f69481k;

    /* renamed from: l */
    public final BogImageView f69482l;

    private C27386o6(ConstraintLayout constraintLayout, BogImageView bogImageView, AppCompatTextView appCompatTextView, TwoLineReverseTextItem twoLineReverseTextItem, View view, FrameLayout frameLayout, ImageView imageView, LayerView layerView, BogImageView bogImageView2) {
        this.f69474d = constraintLayout;
        this.f69475e = bogImageView;
        this.f69476f = appCompatTextView;
        this.f69477g = twoLineReverseTextItem;
        this.f69478h = view;
        this.f69479i = frameLayout;
        this.f69480j = imageView;
        this.f69481k = layerView;
        this.f69482l = bogImageView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p366bk.C10322k.f28850jc;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27386o6 m84848a(android.view.View r12) {
        /*
            int r0 = p366bk.C10322k.contact_image
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.BogImageView r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView) r4
            if (r4 == 0) goto L_0x005f
            int r0 = p366bk.C10322k.contact_name
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L_0x005f
            int r0 = p366bk.C10322k.contact_name_and_nickname
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            ge.bog.designsystem.components.list.TwoLineReverseTextItem r6 = (p341ge.bog.designsystem.components.list.TwoLineReverseTextItem) r6
            if (r6 == 0) goto L_0x005f
            int r0 = p366bk.C10322k.f28850jc
            android.view.View r7 = p086g1.C6202b.m24689a(r12, r0)
            if (r7 == 0) goto L_0x005f
            int r0 = p366bk.C10322k.f28834fh
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x005f
            int r0 = p366bk.C10322k.transfer_others_btn
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L_0x005f
            int r0 = p366bk.C10322k.transfer_others_btn_layer
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r10 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r10
            if (r10 == 0) goto L_0x005f
            int r0 = p366bk.C10322k.verified_badge
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r11 = r1
            ge.bog.mobilebank.ui.views.widgets.BogImageView r11 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView) r11
            if (r11 == 0) goto L_0x005f
            p90.o6 r0 = new p90.o6
            r3 = r12
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p90.C27386o6.m84848a(android.view.View):p90.o6");
    }

    /* renamed from: d */
    public static C27386o6 m84849d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_transfer_contact_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84848a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69474d;
    }
}

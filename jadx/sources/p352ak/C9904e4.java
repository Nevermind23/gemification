package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.badgecontainer.BadgeContainer;
import p341ge.bog.designsystem.components.common.CropImageView;
import p341ge.bog.designsystem.components.interactiveamount.InteractiveAmountView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p601sg.C17783h;

/* renamed from: ak.e4 */
public final class C9904e4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f26940d;

    /* renamed from: e */
    public final CropImageView f26941e;

    /* renamed from: f */
    public final AppCompatImageView f26942f;

    /* renamed from: g */
    public final BadgeContainer f26943g;

    /* renamed from: h */
    public final AppCompatImageView f26944h;

    /* renamed from: i */
    public final View f26945i;

    /* renamed from: j */
    public final InteractiveAmountView f26946j;

    /* renamed from: k */
    public final View f26947k;

    /* renamed from: l */
    public final TextProgressBarView f26948l;

    /* renamed from: m */
    public final FrameLayout f26949m;

    /* renamed from: n */
    public final AppCompatImageView f26950n;

    /* renamed from: o */
    public final AppCompatImageView f26951o;

    /* renamed from: p */
    public final AppCompatTextView f26952p;

    private C9904e4(ConstraintLayout constraintLayout, CropImageView cropImageView, AppCompatImageView appCompatImageView, BadgeContainer badgeContainer, AppCompatImageView appCompatImageView2, View view, InteractiveAmountView interactiveAmountView, View view2, TextProgressBarView textProgressBarView, FrameLayout frameLayout, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView) {
        this.f26940d = constraintLayout;
        this.f26941e = cropImageView;
        this.f26942f = appCompatImageView;
        this.f26943g = badgeContainer;
        this.f26944h = appCompatImageView2;
        this.f26945i = view;
        this.f26946j = interactiveAmountView;
        this.f26947k = view2;
        this.f26948l = textProgressBarView;
        this.f26949m = frameLayout;
        this.f26950n = appCompatImageView3;
        this.f26951o = appCompatImageView4;
        this.f26952p = appCompatTextView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r1 = p601sg.C17782g.f49692I6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r1 = p601sg.C17782g.f49699K2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C9904e4 m36327a(android.view.View r17) {
        /*
            r0 = r17
            int r1 = p601sg.C17782g.f49733V
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.common.CropImageView r5 = (p341ge.bog.designsystem.components.common.CropImageView) r5
            if (r5 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.background_image_blur
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            if (r6 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.badgeContainer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.badgecontainer.BadgeContainer r7 = (p341ge.bog.designsystem.components.badgecontainer.BadgeContainer) r7
            if (r7 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.circular_image
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            if (r8 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.f49699K2
            android.view.View r9 = p086g1.C6202b.m24689a(r0, r1)
            if (r9 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.interactiveAmountView
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.interactiveamount.InteractiveAmountView r10 = (p341ge.bog.designsystem.components.interactiveamount.InteractiveAmountView) r10
            if (r10 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.f49692I6
            android.view.View r11 = p086g1.C6202b.m24689a(r0, r1)
            if (r11 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.f49722R6
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView r12 = (p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView) r12
            if (r12 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.right_image_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            if (r13 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.star
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.appcompat.widget.AppCompatImageView r14 = (androidx.appcompat.widget.AppCompatImageView) r14
            if (r14 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.thumbnail_image
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            androidx.appcompat.widget.AppCompatImageView r15 = (androidx.appcompat.widget.AppCompatImageView) r15
            if (r15 == 0) goto L_0x008b
            int r1 = p601sg.C17782g.f49745Y8
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.appcompat.widget.AppCompatTextView r16 = (androidx.appcompat.widget.AppCompatTextView) r16
            if (r16 == 0) goto L_0x008b
            ak.e4 r1 = new ak.e4
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x008b:
            android.content.res.Resources r0 = r17.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C9904e4.m36327a(android.view.View):ak.e4");
    }

    /* renamed from: d */
    public static C9904e4 m36328d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_new_product_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36327a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f26940d;
    }
}

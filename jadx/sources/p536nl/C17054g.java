package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chipsbadge.ChipsBadgeView;
import p341ge.bog.designsystem.components.imagecard.MediumTextImageCardView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p480jl.C16214e;

/* renamed from: nl.g */
public final class C17054g implements C6201a {

    /* renamed from: A */
    public final View f47600A;

    /* renamed from: d */
    private final FrameLayout f47601d;

    /* renamed from: e */
    public final View f47602e;

    /* renamed from: f */
    public final LinearLayout f47603f;

    /* renamed from: g */
    public final TextView f47604g;

    /* renamed from: h */
    public final LinearLayout f47605h;

    /* renamed from: i */
    public final TextView f47606i;

    /* renamed from: j */
    public final View f47607j;

    /* renamed from: k */
    public final ScrollView f47608k;

    /* renamed from: l */
    public final LinearLayout f47609l;

    /* renamed from: m */
    public final FrameLayout f47610m;

    /* renamed from: n */
    public final LayerView f47611n;

    /* renamed from: o */
    public final MediumTextImageCardView f47612o;

    /* renamed from: p */
    public final View f47613p;

    /* renamed from: q */
    public final View f47614q;

    /* renamed from: r */
    public final ChipsBadgeView f47615r;

    /* renamed from: s */
    public final BannerCard f47616s;

    /* renamed from: t */
    public final TextView f47617t;

    /* renamed from: u */
    public final ImageView f47618u;

    /* renamed from: v */
    public final TextView f47619v;

    /* renamed from: w */
    public final Button f47620w;

    /* renamed from: x */
    public final Button f47621x;

    /* renamed from: y */
    public final ConstraintLayout f47622y;

    /* renamed from: z */
    public final StateView f47623z;

    private C17054g(FrameLayout frameLayout, View view, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, View view2, ScrollView scrollView, LinearLayout linearLayout3, FrameLayout frameLayout2, LayerView layerView, MediumTextImageCardView mediumTextImageCardView, View view3, View view4, ChipsBadgeView chipsBadgeView, BannerCard bannerCard, TextView textView3, ImageView imageView, TextView textView4, Button button, Button button2, ConstraintLayout constraintLayout, StateView stateView, View view5) {
        this.f47601d = frameLayout;
        this.f47602e = view;
        this.f47603f = linearLayout;
        this.f47604g = textView;
        this.f47605h = linearLayout2;
        this.f47606i = textView2;
        this.f47607j = view2;
        this.f47608k = scrollView;
        this.f47609l = linearLayout3;
        this.f47610m = frameLayout2;
        this.f47611n = layerView;
        this.f47612o = mediumTextImageCardView;
        this.f47613p = view3;
        this.f47614q = view4;
        this.f47615r = chipsBadgeView;
        this.f47616s = bannerCard;
        this.f47617t = textView3;
        this.f47618u = imageView;
        this.f47619v = textView4;
        this.f47620w = button;
        this.f47621x = button2;
        this.f47622y = constraintLayout;
        this.f47623z = stateView;
        this.f47600A = view5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r1 = p480jl.C16213d.f45749n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r1 = p480jl.C16213d.loading_info;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r1 = p480jl.C16213d.loading_info2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        r1 = p480jl.C16213d.f45722C0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p536nl.C17054g m59919a(android.view.View r27) {
        /*
            r0 = r27
            int r1 = p480jl.C16213d.f45740c
            android.view.View r4 = p086g1.C6202b.m24689a(r0, r1)
            if (r4 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.bullet1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.bullet1_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.bullet2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.bullet2_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.f45749n
            android.view.View r9 = p086g1.C6202b.m24689a(r0, r1)
            if (r9 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.f45754r
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.ScrollView r10 = (android.widget.ScrollView) r10
            if (r10 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.f45763y
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r11 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.f45719A
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.f45733O
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r13 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r13
            if (r13 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.limit_banner
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.imagecard.MediumTextImageCardView r14 = (p341ge.bog.designsystem.components.imagecard.MediumTextImageCardView) r14
            if (r14 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.loading_info
            android.view.View r15 = p086g1.C6202b.m24689a(r0, r1)
            if (r15 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.loading_info2
            android.view.View r16 = p086g1.C6202b.m24689a(r0, r1)
            if (r16 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.offer_badge
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.chipsbadge.ChipsBadgeView r17 = (p341ge.bog.designsystem.components.chipsbadge.ChipsBadgeView) r17
            if (r17 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.offer_banner
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.bannercard.BannerCard r18 = (p341ge.bog.designsystem.components.bannercard.BannerCard) r18
            if (r18 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.offer_desc
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            android.widget.TextView r19 = (android.widget.TextView) r19
            if (r19 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.offer_image
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            if (r20 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.f45741c0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            android.widget.TextView r21 = (android.widget.TextView) r21
            if (r21 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.f45746l0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.designsystem.components.buttons.Button r22 = (p341ge.bog.designsystem.components.buttons.Button) r22
            if (r22 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.single_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            ge.bog.designsystem.components.buttons.Button r23 = (p341ge.bog.designsystem.components.buttons.Button) r23
            if (r23 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.f45761w0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            androidx.constraintlayout.widget.ConstraintLayout r24 = (androidx.constraintlayout.widget.ConstraintLayout) r24
            if (r24 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.f45762x0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r25 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r25
            if (r25 == 0) goto L_0x0103
            int r1 = p480jl.C16213d.f45722C0
            android.view.View r26 = p086g1.C6202b.m24689a(r0, r1)
            if (r26 == 0) goto L_0x0103
            nl.g r1 = new nl.g
            r2 = r1
            r3 = r0
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r1
        L_0x0103:
            android.content.res.Resources r0 = r27.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p536nl.C17054g.m59919a(android.view.View):nl.g");
    }

    /* renamed from: d */
    public static C17054g m59920d(LayoutInflater layoutInflater) {
        return m59921e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17054g m59921e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.activity_bnpl_offer_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59919a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f47601d;
    }
}

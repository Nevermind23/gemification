package p91;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import l91.C37117d;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.CropImageView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: p91.a */
public final class C37930a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f91031d;

    /* renamed from: e */
    public final AppBarLayout f91032e;

    /* renamed from: f */
    public final BannerCard f91033f;

    /* renamed from: g */
    public final FrameLayout f91034g;

    /* renamed from: h */
    public final Guideline f91035h;

    /* renamed from: i */
    public final ConstraintLayout f91036i;

    /* renamed from: j */
    public final StateView f91037j;

    /* renamed from: k */
    public final NestedScrollView f91038k;

    /* renamed from: l */
    public final Button f91039l;

    /* renamed from: m */
    public final C37933d f91040m;

    /* renamed from: n */
    public final Button f91041n;

    /* renamed from: o */
    public final LoadingView f91042o;

    /* renamed from: p */
    public final PageState f91043p;

    /* renamed from: q */
    public final ToolbarView f91044q;

    /* renamed from: r */
    public final CropImageView f91045r;

    /* renamed from: s */
    public final C37931b f91046s;

    /* renamed from: t */
    public final AppCompatImageView f91047t;

    /* renamed from: u */
    public final LayerView f91048u;

    /* renamed from: v */
    public final EmptyWidget f91049v;

    /* renamed from: w */
    public final AppCompatTextView f91050w;

    /* renamed from: x */
    public final AppCompatTextView f91051x;

    /* renamed from: y */
    public final LayerView f91052y;

    private C37930a(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, BannerCard bannerCard, FrameLayout frameLayout, Guideline guideline, ConstraintLayout constraintLayout2, StateView stateView, NestedScrollView nestedScrollView, Button button, C37933d dVar, Button button2, LoadingView loadingView, PageState pageState, ToolbarView toolbarView, CropImageView cropImageView, C37931b bVar, AppCompatImageView appCompatImageView, LayerView layerView, EmptyWidget emptyWidget, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LayerView layerView2) {
        this.f91031d = constraintLayout;
        this.f91032e = appBarLayout;
        this.f91033f = bannerCard;
        this.f91034g = frameLayout;
        this.f91035h = guideline;
        this.f91036i = constraintLayout2;
        this.f91037j = stateView;
        this.f91038k = nestedScrollView;
        this.f91039l = button;
        this.f91040m = dVar;
        this.f91041n = button2;
        this.f91042o = loadingView;
        this.f91043p = pageState;
        this.f91044q = toolbarView;
        this.f91045r = cropImageView;
        this.f91046s = bVar;
        this.f91047t = appCompatImageView;
        this.f91048u = layerView;
        this.f91049v = emptyWidget;
        this.f91050w = appCompatTextView;
        this.f91051x = appCompatTextView2;
        this.f91052y = layerView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r1 = l91.C37116c.prelogin_backgrounds_layer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        r1 = l91.C37116c.wish_campaign_text;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p91.C37930a m111475a(android.view.View r26) {
        /*
            r0 = r26
            int r1 = l91.C37116c.f89310a
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
            if (r5 == 0) goto L_0x00fe
            int r1 = l91.C37116c.deposit_banner
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.bannercard.BannerCard r6 = (p341ge.bog.designsystem.components.bannercard.BannerCard) r6
            if (r6 == 0) goto L_0x00fe
            int r1 = l91.C37116c.f89312g
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L_0x00fe
            int r1 = l91.C37116c.gd_toolbar
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.constraintlayout.widget.Guideline r8 = (androidx.constraintlayout.widget.Guideline) r8
            if (r8 == 0) goto L_0x00fe
            int r1 = l91.C37116c.f89315n
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            if (r9 == 0) goto L_0x00fe
            int r1 = l91.C37116c.f89316o
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r10 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r10
            if (r10 == 0) goto L_0x00fe
            int r1 = l91.C37116c.f89317p
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.core.widget.NestedScrollView r11 = (androidx.core.widget.NestedScrollView) r11
            if (r11 == 0) goto L_0x00fe
            int r1 = l91.C37116c.f89319r
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.buttons.Button r12 = (p341ge.bog.designsystem.components.buttons.Button) r12
            if (r12 == 0) goto L_0x00fe
            int r1 = l91.C37116c.prelogin_backgrounds_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00fe
            p91.d r13 = p91.C37933d.m111487a(r2)
            int r1 = l91.C37116c.f89320v
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.buttons.Button r14 = (p341ge.bog.designsystem.components.buttons.Button) r14
            if (r14 == 0) goto L_0x00fe
            int r1 = l91.C37116c.f89321w
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.loading.LoadingView r15 = (p341ge.bog.designsystem.components.loading.LoadingView) r15
            if (r15 == 0) goto L_0x00fe
            int r1 = l91.C37116c.f89322x
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.pagestate.PageState r16 = (p341ge.bog.designsystem.components.pagestate.PageState) r16
            if (r16 == 0) goto L_0x00fe
            int r1 = l91.C37116c.f89323y
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.toolbar.ToolbarView r17 = (p341ge.bog.designsystem.components.toolbar.ToolbarView) r17
            if (r17 == 0) goto L_0x00fe
            int r1 = l91.C37116c.wish_campaign_header_background
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.common.CropImageView r18 = (p341ge.bog.designsystem.components.common.CropImageView) r18
            if (r18 == 0) goto L_0x00fe
            int r1 = l91.C37116c.wish_campaign_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00fe
            p91.b r19 = p91.C37931b.m111480a(r2)
            int r1 = l91.C37116c.wish_card_background
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            androidx.appcompat.widget.AppCompatImageView r20 = (androidx.appcompat.widget.AppCompatImageView) r20
            if (r20 == 0) goto L_0x00fe
            int r1 = l91.C37116c.wish_card_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r21 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r21
            if (r21 == 0) goto L_0x00fe
            int r1 = l91.C37116c.wish_card_section_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r22 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r22
            if (r22 == 0) goto L_0x00fe
            int r1 = l91.C37116c.wish_card_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            androidx.appcompat.widget.AppCompatTextView r23 = (androidx.appcompat.widget.AppCompatTextView) r23
            if (r23 == 0) goto L_0x00fe
            int r1 = l91.C37116c.wish_card_type
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            androidx.appcompat.widget.AppCompatTextView r24 = (androidx.appcompat.widget.AppCompatTextView) r24
            if (r24 == 0) goto L_0x00fe
            int r1 = l91.C37116c.wish_header_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r25 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r25
            if (r25 == 0) goto L_0x00fe
            p91.a r1 = new p91.a
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L_0x00fe:
            android.content.res.Resources r0 = r26.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p91.C37930a.m111475a(android.view.View):p91.a");
    }

    /* renamed from: d */
    public static C37930a m111476d(LayoutInflater layoutInflater) {
        return m111477e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C37930a m111477e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37117d.activity_wish_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111475a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f91031d;
    }
}

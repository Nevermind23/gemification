package p482jn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;
import p426fn.C12930d;
import p90.C27272c8;

/* renamed from: jn.c */
public final class C16250c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f46025d;

    /* renamed from: e */
    public final LayerView f46026e;

    /* renamed from: f */
    public final TextView f46027f;

    /* renamed from: g */
    public final RecyclerView f46028g;

    /* renamed from: h */
    public final Button f46029h;

    /* renamed from: i */
    public final LayerView f46030i;

    /* renamed from: j */
    public final Button f46031j;

    /* renamed from: k */
    public final BannerCard f46032k;

    /* renamed from: l */
    public final LinearLayout f46033l;

    /* renamed from: m */
    public final BannerCard f46034m;

    /* renamed from: n */
    public final LinearLayout f46035n;

    /* renamed from: o */
    public final ViewPager2 f46036o;

    /* renamed from: p */
    public final Button f46037p;

    /* renamed from: q */
    public final FrameLayout f46038q;

    /* renamed from: r */
    public final LayerView f46039r;

    /* renamed from: s */
    public final RecyclerView f46040s;

    /* renamed from: t */
    public final ScrollingPagerIndicator f46041t;

    /* renamed from: u */
    public final C27272c8 f46042u;

    private C16250c(ConstraintLayout constraintLayout, LayerView layerView, TextView textView, RecyclerView recyclerView, Button button, LayerView layerView2, Button button2, BannerCard bannerCard, LinearLayout linearLayout, BannerCard bannerCard2, LinearLayout linearLayout2, ViewPager2 viewPager2, Button button3, FrameLayout frameLayout, LayerView layerView3, RecyclerView recyclerView2, ScrollingPagerIndicator scrollingPagerIndicator, C27272c8 c8Var) {
        this.f46025d = constraintLayout;
        this.f46026e = layerView;
        this.f46027f = textView;
        this.f46028g = recyclerView;
        this.f46029h = button;
        this.f46030i = layerView2;
        this.f46031j = button2;
        this.f46032k = bannerCard;
        this.f46033l = linearLayout;
        this.f46034m = bannerCard2;
        this.f46035n = linearLayout2;
        this.f46036o = viewPager2;
        this.f46037p = button3;
        this.f46038q = frameLayout;
        this.f46039r = layerView3;
        this.f46040s = recyclerView2;
        this.f46041t = scrollingPagerIndicator;
        this.f46042u = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r1 = p426fn.C12929c.f38180L;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p482jn.C16250c m57934a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = p426fn.C12929c.actions_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r5
            if (r5 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.activate_scoolapp_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.additional_functions_recycler
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.block_card
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.buttons.Button r8 = (p341ge.bog.designsystem.components.buttons.Button) r8
            if (r8 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.bottom_section
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r9 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r9
            if (r9 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.card_details_or_scoolcard_limit
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.buttons.Button r10 = (p341ge.bog.designsystem.components.buttons.Button) r10
            if (r10 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.contact_approval_banner
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.bannercard.BannerCard r11 = (p341ge.bog.designsystem.components.bannercard.BannerCard) r11
            if (r11 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.contact_approval_banner_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            if (r12 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.google_pay_banner
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.bannercard.BannerCard r13 = (p341ge.bog.designsystem.components.bannercard.BannerCard) r13
            if (r13 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.google_pay_banner_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            if (r14 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.f38187w
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            androidx.viewpager2.widget.ViewPager2 r15 = (androidx.viewpager2.widget.ViewPager2) r15
            if (r15 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.pin_change
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.buttons.Button r16 = (p341ge.bog.designsystem.components.buttons.Button) r16
            if (r16 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.f38175D
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.FrameLayout r17 = (android.widget.FrameLayout) r17
            if (r17 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.scool_activation_section
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r18 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r18
            if (r18 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.scool_recycler
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.recyclerview.widget.RecyclerView r19 = (androidx.recyclerview.widget.RecyclerView) r19
            if (r19 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.f38176G
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator r20 = (p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator) r20
            if (r20 == 0) goto L_0x00cd
            int r1 = p426fn.C12929c.f38180L
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00cd
            p90.c8 r21 = p90.C27272c8.m84388a(r2)
            jn.c r1 = new jn.c
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x00cd:
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p482jn.C16250c.m57934a(android.view.View):jn.c");
    }

    /* renamed from: d */
    public static C16250c m57935d(LayoutInflater layoutInflater) {
        return m57936e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C16250c m57936e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12930d.activity_card_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57934a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f46025d;
    }
}

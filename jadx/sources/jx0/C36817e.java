package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import fx0.C32025e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p90.C27272c8;

/* renamed from: jx0.e */
public final class C36817e implements C6201a {

    /* renamed from: A */
    public final Button f88823A;

    /* renamed from: B */
    public final C27272c8 f88824B;

    /* renamed from: d */
    private final LinearLayout f88825d;

    /* renamed from: e */
    public final HorizontalScrollView f88826e;

    /* renamed from: f */
    public final LayerView f88827f;

    /* renamed from: g */
    public final BannerCard f88828g;

    /* renamed from: h */
    public final Barrier f88829h;

    /* renamed from: i */
    public final Button f88830i;

    /* renamed from: j */
    public final Button f88831j;

    /* renamed from: k */
    public final Button f88832k;

    /* renamed from: l */
    public final Button f88833l;

    /* renamed from: m */
    public final TextView f88834m;

    /* renamed from: n */
    public final NestedScrollView f88835n;

    /* renamed from: o */
    public final LayerView f88836o;

    /* renamed from: p */
    public final PageState f88837p;

    /* renamed from: q */
    public final TextView f88838q;

    /* renamed from: r */
    public final TwoLineTextItem f88839r;

    /* renamed from: s */
    public final TwoLineTextItem f88840s;

    /* renamed from: t */
    public final ImageView f88841t;

    /* renamed from: u */
    public final TwoLineTextItem f88842u;

    /* renamed from: v */
    public final TwoLineTextItem f88843v;

    /* renamed from: w */
    public final ImageView f88844w;

    /* renamed from: x */
    public final TextView f88845x;

    /* renamed from: y */
    public final TextView f88846y;

    /* renamed from: z */
    public final TextView f88847z;

    private C36817e(LinearLayout linearLayout, HorizontalScrollView horizontalScrollView, LayerView layerView, BannerCard bannerCard, Barrier barrier, Button button, Button button2, Button button3, Button button4, TextView textView, NestedScrollView nestedScrollView, LayerView layerView2, PageState pageState, TextView textView2, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, ImageView imageView, TwoLineTextItem twoLineTextItem3, TwoLineTextItem twoLineTextItem4, ImageView imageView2, TextView textView3, TextView textView4, TextView textView5, Button button5, C27272c8 c8Var) {
        this.f88825d = linearLayout;
        this.f88826e = horizontalScrollView;
        this.f88827f = layerView;
        this.f88828g = bannerCard;
        this.f88829h = barrier;
        this.f88830i = button;
        this.f88831j = button2;
        this.f88832k = button3;
        this.f88833l = button4;
        this.f88834m = textView;
        this.f88835n = nestedScrollView;
        this.f88836o = layerView2;
        this.f88837p = pageState;
        this.f88838q = textView2;
        this.f88839r = twoLineTextItem;
        this.f88840s = twoLineTextItem2;
        this.f88841t = imageView;
        this.f88842u = twoLineTextItem3;
        this.f88843v = twoLineTextItem4;
        this.f88844w = imageView2;
        this.f88845x = textView3;
        this.f88846y = textView4;
        this.f88847z = textView5;
        this.f88823A = button5;
        this.f88824B = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010b, code lost:
        r1 = fx0.C32024d.f78856r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static jx0.C36817e m109082a(android.view.View r29) {
        /*
            r0 = r29
            int r1 = fx0.C32024d.action_buttons_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.HorizontalScrollView r5 = (android.widget.HorizontalScrollView) r5
            if (r5 == 0) goto L_0x0121
            int r1 = fx0.C32024d.all_buttons_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r6 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r6
            if (r6 == 0) goto L_0x0121
            int r1 = fx0.C32024d.banner
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.bannercard.BannerCard r7 = (p341ge.bog.designsystem.components.bannercard.BannerCard) r7
            if (r7 == 0) goto L_0x0121
            int r1 = fx0.C32024d.f78843d
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.constraintlayout.widget.Barrier r8 = (androidx.constraintlayout.widget.Barrier) r8
            if (r8 == 0) goto L_0x0121
            int r1 = fx0.C32024d.button_add_dd
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x0121
            int r1 = fx0.C32024d.button_add_template
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.buttons.Button r10 = (p341ge.bog.designsystem.components.buttons.Button) r10
            if (r10 == 0) goto L_0x0121
            int r1 = fx0.C32024d.button_home_page
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.buttons.Button r11 = (p341ge.bog.designsystem.components.buttons.Button) r11
            if (r11 == 0) goto L_0x0121
            int r1 = fx0.C32024d.button_receipt
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.buttons.Button r12 = (p341ge.bog.designsystem.components.buttons.Button) r12
            if (r12 == 0) goto L_0x0121
            int r1 = fx0.C32024d.customer_id
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x0121
            int r1 = fx0.C32024d.f78831A
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.core.widget.NestedScrollView r14 = (androidx.core.widget.NestedScrollView) r14
            if (r14 == 0) goto L_0x0121
            int r1 = fx0.C32024d.f78832B
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r15 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r15
            if (r15 == 0) goto L_0x0121
            int r1 = fx0.C32024d.f78840S
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.pagestate.PageState r16 = (p341ge.bog.designsystem.components.pagestate.PageState) r16
            if (r16 == 0) goto L_0x0121
            int r1 = fx0.C32024d.payment_amount
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.TextView r17 = (android.widget.TextView) r17
            if (r17 == 0) goto L_0x0121
            int r1 = fx0.C32024d.payment_details_amount
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r18 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r18
            if (r18 == 0) goto L_0x0121
            int r1 = fx0.C32024d.payment_details_card
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r19 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r19
            if (r19 == 0) goto L_0x0121
            int r1 = fx0.C32024d.payment_details_card_image
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            if (r20 == 0) goto L_0x0121
            int r1 = fx0.C32024d.payment_details_commission
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r21 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r21
            if (r21 == 0) goto L_0x0121
            int r1 = fx0.C32024d.payment_details_date
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r22 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r22
            if (r22 == 0) goto L_0x0121
            int r1 = fx0.C32024d.provider_image
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            android.widget.ImageView r23 = (android.widget.ImageView) r23
            if (r23 == 0) goto L_0x0121
            int r1 = fx0.C32024d.provider_name
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            android.widget.TextView r24 = (android.widget.TextView) r24
            if (r24 == 0) goto L_0x0121
            int r1 = fx0.C32024d.section_title_details
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            android.widget.TextView r25 = (android.widget.TextView) r25
            if (r25 == 0) goto L_0x0121
            int r1 = fx0.C32024d.section_title_services
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r26 = r2
            android.widget.TextView r26 = (android.widget.TextView) r26
            if (r26 == 0) goto L_0x0121
            int r1 = fx0.C32024d.single_button_home_page
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r27 = r2
            ge.bog.designsystem.components.buttons.Button r27 = (p341ge.bog.designsystem.components.buttons.Button) r27
            if (r27 == 0) goto L_0x0121
            int r1 = fx0.C32024d.f78856r0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x0121
            p90.c8 r28 = p90.C27272c8.m84388a(r2)
            jx0.e r1 = new jx0.e
            r3 = r1
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x0121:
            android.content.res.Resources r0 = r29.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jx0.C36817e.m109082a(android.view.View):jx0.e");
    }

    /* renamed from: d */
    public static C36817e m109083d(LayoutInflater layoutInflater) {
        return m109084e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36817e m109084e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.activity_payment_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109082a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88825d;
    }
}

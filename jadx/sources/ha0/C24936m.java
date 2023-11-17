package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import da0.C19952f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27486z7;

/* renamed from: ha0.m */
public final class C24936m implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f64201d;

    /* renamed from: e */
    public final FixedButtonCardSelectorView f64202e;

    /* renamed from: f */
    public final TwoLineTextItem f64203f;

    /* renamed from: g */
    public final TwoLineTextItem f64204g;

    /* renamed from: h */
    public final Input f64205h;

    /* renamed from: i */
    public final ListItem f64206i;

    /* renamed from: j */
    public final View f64207j;

    /* renamed from: k */
    public final TwoLineTextItem f64208k;

    /* renamed from: l */
    public final TwoLineTextItem f64209l;

    /* renamed from: m */
    public final View f64210m;

    /* renamed from: n */
    public final TwoLineTextItem f64211n;

    /* renamed from: o */
    public final TextView f64212o;

    /* renamed from: p */
    public final LayerView f64213p;

    /* renamed from: q */
    public final PageDescriptionView f64214q;

    /* renamed from: r */
    public final C24943t f64215r;

    /* renamed from: s */
    public final FrameLayout f64216s;

    /* renamed from: t */
    public final FrameLayout f64217t;

    /* renamed from: u */
    public final C27486z7 f64218u;

    /* renamed from: v */
    public final CardView f64219v;

    /* renamed from: w */
    public final NestedScrollView f64220w;

    /* renamed from: x */
    public final ViewPager2 f64221x;

    /* renamed from: y */
    public final TwoLineTextItem f64222y;

    private C24936m(ConstraintLayout constraintLayout, FixedButtonCardSelectorView fixedButtonCardSelectorView, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, Input input, ListItem listItem, View view, TwoLineTextItem twoLineTextItem3, TwoLineTextItem twoLineTextItem4, View view2, TwoLineTextItem twoLineTextItem5, TextView textView, LayerView layerView, PageDescriptionView pageDescriptionView, C24943t tVar, FrameLayout frameLayout, FrameLayout frameLayout2, C27486z7 z7Var, CardView cardView, NestedScrollView nestedScrollView, ViewPager2 viewPager2, TwoLineTextItem twoLineTextItem6) {
        this.f64201d = constraintLayout;
        this.f64202e = fixedButtonCardSelectorView;
        this.f64203f = twoLineTextItem;
        this.f64204g = twoLineTextItem2;
        this.f64205h = input;
        this.f64206i = listItem;
        this.f64207j = view;
        this.f64208k = twoLineTextItem3;
        this.f64209l = twoLineTextItem4;
        this.f64210m = view2;
        this.f64211n = twoLineTextItem5;
        this.f64212o = textView;
        this.f64213p = layerView;
        this.f64214q = pageDescriptionView;
        this.f64215r = tVar;
        this.f64216s = frameLayout;
        this.f64217t = frameLayout2;
        this.f64218u = z7Var;
        this.f64219v = cardView;
        this.f64220w = nestedScrollView;
        this.f64221x = viewPager2;
        this.f64222y = twoLineTextItem6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r1 = da0.C19951e.deposit_name_list_item_divider;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        r1 = da0.C19951e.deposit_term_divider;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        r1 = da0.C19951e.f54523b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        r1 = da0.C19951e.f54538t0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ha0.C24936m m79728a(android.view.View r26) {
        /*
            r0 = r26
            int r1 = da0.C19951e.continue_fixed_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView r5 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView) r5
            if (r5 == 0) goto L_0x00f7
            int r1 = da0.C19951e.deposit_amount_text_item
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r6 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r6
            if (r6 == 0) goto L_0x00f7
            int r1 = da0.C19951e.deposit_end_date_text_item
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r7 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r7
            if (r7 == 0) goto L_0x00f7
            int r1 = da0.C19951e.deposit_name_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.input.Input r8 = (p341ge.bog.designsystem.components.input.Input) r8
            if (r8 == 0) goto L_0x00f7
            int r1 = da0.C19951e.deposit_name_list_item
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.list.ListItem r9 = (p341ge.bog.designsystem.components.list.ListItem) r9
            if (r9 == 0) goto L_0x00f7
            int r1 = da0.C19951e.deposit_name_list_item_divider
            android.view.View r10 = p086g1.C6202b.m24689a(r0, r1)
            if (r10 == 0) goto L_0x00f7
            int r1 = da0.C19951e.deposit_name_text_item
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r11 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r11
            if (r11 == 0) goto L_0x00f7
            int r1 = da0.C19951e.deposit_start_date_text_item
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r12 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r12
            if (r12 == 0) goto L_0x00f7
            int r1 = da0.C19951e.deposit_term_divider
            android.view.View r13 = p086g1.C6202b.m24689a(r0, r1)
            if (r13 == 0) goto L_0x00f7
            int r1 = da0.C19951e.deposit_term_text_item
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r14 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r14
            if (r14 == 0) goto L_0x00f7
            int r1 = da0.C19951e.f54513I
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto L_0x00f7
            int r1 = da0.C19951e.f54520T
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r16 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r16
            if (r16 == 0) goto L_0x00f7
            int r1 = da0.C19951e.header_page_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r17 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r17
            if (r17 == 0) goto L_0x00f7
            int r1 = da0.C19951e.f54523b0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00f7
            ha0.t r18 = ha0.C24943t.m79753a(r2)
            int r1 = da0.C19951e.f54533m0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            android.widget.FrameLayout r19 = (android.widget.FrameLayout) r19
            if (r19 == 0) goto L_0x00f7
            int r1 = da0.C19951e.f54534p0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            android.widget.FrameLayout r20 = (android.widget.FrameLayout) r20
            if (r20 == 0) goto L_0x00f7
            int r1 = da0.C19951e.f54538t0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00f7
            p90.z7 r21 = p90.C27486z7.m85250a(r2)
            int r1 = da0.C19951e.f54539u0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            androidx.cardview.widget.CardView r22 = (androidx.cardview.widget.CardView) r22
            if (r22 == 0) goto L_0x00f7
            int r1 = da0.C19951e.f54541x0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            androidx.core.widget.NestedScrollView r23 = (androidx.core.widget.NestedScrollView) r23
            if (r23 == 0) goto L_0x00f7
            int r1 = da0.C19951e.f54514I0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            androidx.viewpager2.widget.ViewPager2 r24 = (androidx.viewpager2.widget.ViewPager2) r24
            if (r24 == 0) goto L_0x00f7
            int r1 = da0.C19951e.withdrawal_type_text_item
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r25 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r25
            if (r25 == 0) goto L_0x00f7
            ha0.m r1 = new ha0.m
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L_0x00f7:
            android.content.res.Resources r0 = r26.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C24936m.m79728a(android.view.View):ha0.m");
    }

    /* renamed from: d */
    public static C24936m m79729d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.fragment_combined_offer_second_step, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79728a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f64201d;
    }
}

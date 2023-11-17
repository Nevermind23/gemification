package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;

/* renamed from: th0.l */
public final class C28410l implements C6201a {

    /* renamed from: d */
    private final StateView f72108d;

    /* renamed from: e */
    public final TextView f72109e;

    /* renamed from: f */
    public final ConstraintLayout f72110f;

    /* renamed from: g */
    public final Button f72111g;

    /* renamed from: h */
    public final Button f72112h;

    /* renamed from: i */
    public final TextView f72113i;

    /* renamed from: j */
    public final EmptyWidget f72114j;

    /* renamed from: k */
    public final CheckboxView f72115k;

    /* renamed from: l */
    public final LayerView f72116l;

    /* renamed from: m */
    public final RecyclerView f72117m;

    /* renamed from: n */
    public final PageDescriptionView f72118n;

    /* renamed from: o */
    public final View f72119o;

    /* renamed from: p */
    public final ConstraintLayout f72120p;

    /* renamed from: q */
    public final StateView f72121q;

    /* renamed from: r */
    public final ConstraintLayout f72122r;

    /* renamed from: s */
    public final ViewPager2 f72123s;

    /* renamed from: t */
    public final LayerView f72124t;

    /* renamed from: u */
    public final Input f72125u;

    /* renamed from: v */
    public final ScrollView f72126v;

    /* renamed from: w */
    public final PageDescriptionView f72127w;

    /* renamed from: x */
    public final Button f72128x;

    /* renamed from: y */
    public final LoadingView f72129y;

    /* renamed from: z */
    public final ScrollingPagerIndicator f72130z;

    private C28410l(StateView stateView, TextView textView, ConstraintLayout constraintLayout, Button button, Button button2, TextView textView2, EmptyWidget emptyWidget, CheckboxView checkboxView, LayerView layerView, RecyclerView recyclerView, PageDescriptionView pageDescriptionView, View view, ConstraintLayout constraintLayout2, StateView stateView2, ConstraintLayout constraintLayout3, ViewPager2 viewPager2, LayerView layerView2, Input input, ScrollView scrollView, PageDescriptionView pageDescriptionView2, Button button3, LoadingView loadingView, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f72108d = stateView;
        this.f72109e = textView;
        this.f72110f = constraintLayout;
        this.f72111g = button;
        this.f72112h = button2;
        this.f72113i = textView2;
        this.f72114j = emptyWidget;
        this.f72115k = checkboxView;
        this.f72116l = layerView;
        this.f72117m = recyclerView;
        this.f72118n = pageDescriptionView;
        this.f72119o = view;
        this.f72120p = constraintLayout2;
        this.f72121q = stateView2;
        this.f72122r = constraintLayout3;
        this.f72123s = viewPager2;
        this.f72124t = layerView2;
        this.f72125u = input;
        this.f72126v = scrollView;
        this.f72127w = pageDescriptionView2;
        this.f72128x = button3;
        this.f72129y = loadingView;
        this.f72130z = scrollingPagerIndicator;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r1 = oh0.C27010e.fixed_button_bottom_divider;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static th0.C28410l m87161a(android.view.View r27) {
        /*
            r0 = r27
            int r1 = oh0.C27010e.animations_header_text_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.f67832s
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            if (r6 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.button_next
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.button_refresh
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.buttons.Button r8 = (p341ge.bog.designsystem.components.buttons.Button) r8
            if (r8 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.f67836w
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.f67838z
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r10 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r10
            if (r10 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.check_box_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.checkbox.CheckboxView r11 = (p341ge.bog.designsystem.components.checkbox.CheckboxView) r11
            if (r11 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.contact_layer_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r12 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r12
            if (r12 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.contacts_recycler_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            if (r13 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.f67819e0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r14 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r14
            if (r14 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.fixed_button_bottom_divider
            android.view.View r15 = p086g1.C6202b.m24689a(r0, r1)
            if (r15 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.fragment_gift_cards_contacts_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.constraintlayout.widget.ConstraintLayout r16 = (androidx.constraintlayout.widget.ConstraintLayout) r16
            if (r16 == 0) goto L_0x00fd
            r17 = r0
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r17 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r17
            int r1 = oh0.C27010e.gift_cards_error_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.constraintlayout.widget.ConstraintLayout r18 = (androidx.constraintlayout.widget.ConstraintLayout) r18
            if (r18 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.horizontal_animation_card
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.viewpager2.widget.ViewPager2 r19 = (androidx.viewpager2.widget.ViewPager2) r19
            if (r19 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.input_layer_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r20 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r20
            if (r20 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.f67821f1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.input.Input r21 = (p341ge.bog.designsystem.components.input.Input) r21
            if (r21 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.nested_scroll_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            android.widget.ScrollView r22 = (android.widget.ScrollView) r22
            if (r22 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.f67834t1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r23 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r23
            if (r23 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.f67804K1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            ge.bog.designsystem.components.buttons.Button r24 = (p341ge.bog.designsystem.components.buttons.Button) r24
            if (r24 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.state_view_loading
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            ge.bog.designsystem.components.loading.LoadingView r25 = (p341ge.bog.designsystem.components.loading.LoadingView) r25
            if (r25 == 0) goto L_0x00fd
            int r1 = oh0.C27010e.f67807Q1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r26 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator r26 = (p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator) r26
            if (r26 == 0) goto L_0x00fd
            th0.l r0 = new th0.l
            r3 = r0
            r4 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        L_0x00fd:
            android.content.res.Resources r0 = r27.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C28410l.m87161a(android.view.View):th0.l");
    }

    /* renamed from: d */
    public static C28410l m87162d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.fragment_gift_cards_choose_animation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87161a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f72108d;
    }
}

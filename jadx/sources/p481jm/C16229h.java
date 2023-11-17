package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p411em.C12489f;
import p90.C27272c8;

/* renamed from: jm.h */
public final class C16229h implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f45842d;

    /* renamed from: e */
    public final PageDescriptionView f45843e;

    /* renamed from: f */
    public final RecyclerView f45844f;

    /* renamed from: g */
    public final Group f45845g;

    /* renamed from: h */
    public final EmptyWidget f45846h;

    /* renamed from: i */
    public final ChipGroup f45847i;

    /* renamed from: j */
    public final EmptyWidget f45848j;

    /* renamed from: k */
    public final AppCompatTextView f45849k;

    /* renamed from: l */
    public final ConstraintLayout f45850l;

    /* renamed from: m */
    public final AppCompatTextView f45851m;

    /* renamed from: n */
    public final View f45852n;

    /* renamed from: o */
    public final Guideline f45853o;

    /* renamed from: p */
    public final Guideline f45854p;

    /* renamed from: q */
    public final Button f45855q;

    /* renamed from: r */
    public final InlineFeedback f45856r;

    /* renamed from: s */
    public final LinearLayoutCompat f45857s;

    /* renamed from: t */
    public final Button f45858t;

    /* renamed from: u */
    public final FrameLayout f45859u;

    /* renamed from: v */
    public final ViewPager2 f45860v;

    /* renamed from: w */
    public final C27272c8 f45861w;

    private C16229h(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, RecyclerView recyclerView, Group group, EmptyWidget emptyWidget, ChipGroup chipGroup, EmptyWidget emptyWidget2, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView2, View view, Guideline guideline, Guideline guideline2, Button button, InlineFeedback inlineFeedback, LinearLayoutCompat linearLayoutCompat, Button button2, FrameLayout frameLayout, ViewPager2 viewPager2, C27272c8 c8Var) {
        this.f45842d = constraintLayout;
        this.f45843e = pageDescriptionView;
        this.f45844f = recyclerView;
        this.f45845g = group;
        this.f45846h = emptyWidget;
        this.f45847i = chipGroup;
        this.f45848j = emptyWidget2;
        this.f45849k = appCompatTextView;
        this.f45850l = constraintLayout2;
        this.f45851m = appCompatTextView2;
        this.f45852n = view;
        this.f45853o = guideline;
        this.f45854p = guideline2;
        this.f45855q = button;
        this.f45856r = inlineFeedback;
        this.f45857s = linearLayoutCompat;
        this.f45858t = button2;
        this.f45859u = frameLayout;
        this.f45860v = viewPager2;
        this.f45861w = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r1 = p411em.C12488e.fixed_button_barrier;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        r1 = p411em.C12488e.f37198d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p481jm.C16229h m57844a(android.view.View r24) {
        /*
            r0 = r24
            int r1 = p411em.C12488e.advantages_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r5 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r5
            if (r5 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.card_terms_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.card_terms_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            androidx.constraintlayout.widget.Group r7 = (androidx.constraintlayout.widget.Group) r7
            if (r7 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.card_terms_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r8 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r8
            if (r8 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.card_type_chip_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.chips.ChipGroup r9 = (p341ge.bog.designsystem.components.chips.ChipGroup) r9
            if (r9 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.choose_card_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r10 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r10
            if (r10 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.choose_card_type_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            if (r11 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.f37218p0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            if (r12 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.f37221s0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            if (r13 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.fixed_button_barrier
            android.view.View r14 = p086g1.C6202b.m24689a(r0, r1)
            if (r14 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.f37174D0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            androidx.constraintlayout.widget.Guideline r15 = (androidx.constraintlayout.widget.Guideline) r15
            if (r15 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.f37176E0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.constraintlayout.widget.Guideline r16 = (androidx.constraintlayout.widget.Guideline) r16
            if (r16 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.go_to_order_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.buttons.Button r17 = (p341ge.bog.designsystem.components.buttons.Button) r17
            if (r17 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.info_box
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r18 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r18
            if (r18 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.f37204h1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.appcompat.widget.LinearLayoutCompat r19 = (androidx.appcompat.widget.LinearLayoutCompat) r19
            if (r19 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.f37188R1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.buttons.Button r20 = (p341ge.bog.designsystem.components.buttons.Button) r20
            if (r20 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.f37189S1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            android.widget.FrameLayout r21 = (android.widget.FrameLayout) r21
            if (r21 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.f37194W1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            androidx.viewpager2.widget.ViewPager2 r22 = (androidx.viewpager2.widget.ViewPager2) r22
            if (r22 == 0) goto L_0x00e2
            int r1 = p411em.C12488e.f37198d2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00e2
            p90.c8 r23 = p90.C27272c8.m84388a(r2)
            jm.h r1 = new jm.h
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
        L_0x00e2:
            android.content.res.Resources r0 = r24.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p481jm.C16229h.m57844a(android.view.View):jm.h");
    }

    /* renamed from: d */
    public static C16229h m57845d(LayoutInflater layoutInflater) {
        return m57846e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C16229h m57846e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.activity_card_order_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57844a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f45842d;
    }
}

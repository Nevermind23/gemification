package vt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.progressbar.ProgressBarView;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p90.C27251a7;
import p90.C27272c8;
import rt0.C38342d;

/* renamed from: vt0.c */
public final class C39466c implements C6201a {

    /* renamed from: A */
    public final LayerView f93863A;

    /* renamed from: B */
    public final C27272c8 f93864B;

    /* renamed from: C */
    public final C39471h f93865C;

    /* renamed from: d */
    private final FrameLayout f93866d;

    /* renamed from: e */
    public final TabsView f93867e;

    /* renamed from: f */
    public final ViewPager2 f93868f;

    /* renamed from: g */
    public final ButtonListLargeView f93869g;

    /* renamed from: h */
    public final LayerView f93870h;

    /* renamed from: i */
    public final ActionSheetTitle f93871i;

    /* renamed from: j */
    public final ProgressBarView f93872j;

    /* renamed from: k */
    public final AppCompatTextView f93873k;

    /* renamed from: l */
    public final AppCompatTextView f93874l;

    /* renamed from: m */
    public final AppCompatTextView f93875m;

    /* renamed from: n */
    public final AppCompatTextView f93876n;

    /* renamed from: o */
    public final AppCompatImageView f93877o;

    /* renamed from: p */
    public final C27251a7 f93878p;

    /* renamed from: q */
    public final FrameLayout f93879q;

    /* renamed from: r */
    public final PageDescriptionView f93880r;

    /* renamed from: s */
    public final FrameLayout f93881s;

    /* renamed from: t */
    public final Button f93882t;

    /* renamed from: u */
    public final LayerView f93883u;

    /* renamed from: v */
    public final ConstraintLayout f93884v;

    /* renamed from: w */
    public final ActionSheetTitle f93885w;

    /* renamed from: x */
    public final AppCompatImageView f93886x;

    /* renamed from: y */
    public final Button f93887y;

    /* renamed from: z */
    public final NestedScrollView f93888z;

    private C39466c(FrameLayout frameLayout, TabsView tabsView, ViewPager2 viewPager2, ButtonListLargeView buttonListLargeView, LayerView layerView, ActionSheetTitle actionSheetTitle, ProgressBarView progressBarView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView, C27251a7 a7Var, FrameLayout frameLayout2, PageDescriptionView pageDescriptionView, FrameLayout frameLayout3, Button button, LayerView layerView2, ConstraintLayout constraintLayout, ActionSheetTitle actionSheetTitle2, AppCompatImageView appCompatImageView2, Button button2, NestedScrollView nestedScrollView, LayerView layerView3, C27272c8 c8Var, C39471h hVar) {
        this.f93866d = frameLayout;
        this.f93867e = tabsView;
        this.f93868f = viewPager2;
        this.f93869g = buttonListLargeView;
        this.f93870h = layerView;
        this.f93871i = actionSheetTitle;
        this.f93872j = progressBarView;
        this.f93873k = appCompatTextView;
        this.f93874l = appCompatTextView2;
        this.f93875m = appCompatTextView3;
        this.f93876n = appCompatTextView4;
        this.f93877o = appCompatImageView;
        this.f93878p = a7Var;
        this.f93879q = frameLayout2;
        this.f93880r = pageDescriptionView;
        this.f93881s = frameLayout3;
        this.f93882t = button;
        this.f93883u = layerView2;
        this.f93884v = constraintLayout;
        this.f93885w = actionSheetTitle2;
        this.f93886x = appCompatImageView2;
        this.f93887y = button2;
        this.f93888z = nestedScrollView;
        this.f93863A = layerView3;
        this.f93864B = c8Var;
        this.f93865C = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r1 = rt0.C38341c.f91931p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010b, code lost:
        r1 = rt0.C38341c.f91930W;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vt0.C39466c m114719a(android.view.View r30) {
        /*
            r0 = r30
            int r1 = rt0.C38341c.benefits_tabs
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.tabs.TabsView r5 = (p341ge.bog.designsystem.components.tabs.TabsView) r5
            if (r5 == 0) goto L_0x012d
            int r1 = rt0.C38341c.benefits_view_pager
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            androidx.viewpager2.widget.ViewPager2 r6 = (androidx.viewpager2.widget.ViewPager2) r6
            if (r6 == 0) goto L_0x012d
            int r1 = rt0.C38341c.button_list_large
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.buttonlist.ButtonListLargeView r7 = (p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView) r7
            if (r7 == 0) goto L_0x012d
            int r1 = rt0.C38341c.curr_period_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r8 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r8
            if (r8 == 0) goto L_0x012d
            int r1 = rt0.C38341c.curr_period_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.actionsheet.ActionSheetTitle r9 = (p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle) r9
            if (r9 == 0) goto L_0x012d
            int r1 = rt0.C38341c.curr_progress_bar
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.progressbar.ProgressBarView r10 = (p341ge.bog.designsystem.components.progressbar.ProgressBarView) r10
            if (r10 == 0) goto L_0x012d
            int r1 = rt0.C38341c.curr_progress_bar_collected
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            if (r11 == 0) goto L_0x012d
            int r1 = rt0.C38341c.curr_progress_bar_max
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            if (r12 == 0) goto L_0x012d
            int r1 = rt0.C38341c.curr_progress_bar_next_status
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            if (r13 == 0) goto L_0x012d
            int r1 = rt0.C38341c.curr_progress_bar_stars
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
            if (r14 == 0) goto L_0x012d
            int r1 = rt0.C38341c.curr_status_badge
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            androidx.appcompat.widget.AppCompatImageView r15 = (androidx.appcompat.widget.AppCompatImageView) r15
            if (r15 == 0) goto L_0x012d
            int r1 = rt0.C38341c.f91931p
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x012d
            p90.a7 r16 = p90.C27251a7.m84303a(r2)
            int r1 = rt0.C38341c.f91932q
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.FrameLayout r17 = (android.widget.FrameLayout) r17
            if (r17 == 0) goto L_0x012d
            int r1 = rt0.C38341c.gold_achieved_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r18 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r18
            if (r18 == 0) goto L_0x012d
            int r1 = rt0.C38341c.f91933v
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            android.widget.FrameLayout r19 = (android.widget.FrameLayout) r19
            if (r19 == 0) goto L_0x012d
            int r1 = rt0.C38341c.next_period_info_icon
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.buttons.Button r20 = (p341ge.bog.designsystem.components.buttons.Button) r20
            if (r20 == 0) goto L_0x012d
            int r1 = rt0.C38341c.next_period_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r21 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r21
            if (r21 == 0) goto L_0x012d
            int r1 = rt0.C38341c.next_period_stats
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            androidx.constraintlayout.widget.ConstraintLayout r22 = (androidx.constraintlayout.widget.ConstraintLayout) r22
            if (r22 == 0) goto L_0x012d
            int r1 = rt0.C38341c.next_period_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            ge.bog.designsystem.components.actionsheet.ActionSheetTitle r23 = (p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle) r23
            if (r23 == 0) goto L_0x012d
            int r1 = rt0.C38341c.next_status_badge
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            androidx.appcompat.widget.AppCompatImageView r24 = (androidx.appcompat.widget.AppCompatImageView) r24
            if (r24 == 0) goto L_0x012d
            int r1 = rt0.C38341c.progress_guide_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            ge.bog.designsystem.components.buttons.Button r25 = (p341ge.bog.designsystem.components.buttons.Button) r25
            if (r25 == 0) goto L_0x012d
            int r1 = rt0.C38341c.status_page
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r26 = r2
            androidx.core.widget.NestedScrollView r26 = (androidx.core.widget.NestedScrollView) r26
            if (r26 == 0) goto L_0x012d
            int r1 = rt0.C38341c.status_preferences
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r27 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r27 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r27
            if (r27 == 0) goto L_0x012d
            int r1 = rt0.C38341c.f91930W
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x012d
            p90.c8 r28 = p90.C27272c8.m84388a(r2)
            int r1 = rt0.C38341c.welcome_page
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x012d
            vt0.h r29 = vt0.C39471h.m114740a(r2)
            vt0.c r1 = new vt0.c
            r3 = r1
            r4 = r0
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x012d:
            android.content.res.Resources r0 = r30.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vt0.C39466c.m114719a(android.view.View):vt0.c");
    }

    /* renamed from: d */
    public static C39466c m114720d(LayoutInflater layoutInflater) {
        return m114721e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C39466c m114721e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38342d.activity_loyalty_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114719a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f93866d;
    }
}

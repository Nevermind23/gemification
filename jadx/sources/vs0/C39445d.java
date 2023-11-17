package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p90.C27272c8;
import rs0.C38337d;

/* renamed from: vs0.d */
public final class C39445d implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93715d;

    /* renamed from: e */
    public final TabsView f93716e;

    /* renamed from: f */
    public final ViewPager2 f93717f;

    /* renamed from: g */
    public final LayerView f93718g;

    /* renamed from: h */
    public final ViewPager2 f93719h;

    /* renamed from: i */
    public final ProgressBar f93720i;

    /* renamed from: j */
    public final FrameLayout f93721j;

    /* renamed from: k */
    public final Button f93722k;

    /* renamed from: l */
    public final FrameLayout f93723l;

    /* renamed from: m */
    public final FrameLayout f93724m;

    /* renamed from: n */
    public final PageState f93725n;

    /* renamed from: o */
    public final C27272c8 f93726o;

    private C39445d(ConstraintLayout constraintLayout, TabsView tabsView, ViewPager2 viewPager2, LayerView layerView, ViewPager2 viewPager22, ProgressBar progressBar, FrameLayout frameLayout, Button button, FrameLayout frameLayout2, FrameLayout frameLayout3, PageState pageState, C27272c8 c8Var) {
        this.f93715d = constraintLayout;
        this.f93716e = tabsView;
        this.f93717f = viewPager2;
        this.f93718g = layerView;
        this.f93719h = viewPager22;
        this.f93720i = progressBar;
        this.f93721j = frameLayout;
        this.f93722k = button;
        this.f93723l = frameLayout2;
        this.f93724m = frameLayout3;
        this.f93725n = pageState;
        this.f93726o = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r0 = rs0.C38336c.f91897w1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vs0.C39445d m114631a(android.view.View r15) {
        /*
            int r0 = rs0.C38336c.details_history_tabs
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            ge.bog.designsystem.components.tabs.TabsView r4 = (p341ge.bog.designsystem.components.tabs.TabsView) r4
            if (r4 == 0) goto L_0x0084
            int r0 = rs0.C38336c.f91863X
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r5 = r1
            androidx.viewpager2.widget.ViewPager2 r5 = (androidx.viewpager2.widget.ViewPager2) r5
            if (r5 == 0) goto L_0x0084
            int r0 = rs0.C38336c.f91869c0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r6 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r6 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r6
            if (r6 == 0) goto L_0x0084
            int r0 = rs0.C38336c.f91871e0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r7 = r1
            androidx.viewpager2.widget.ViewPager2 r7 = (androidx.viewpager2.widget.ViewPager2) r7
            if (r7 == 0) goto L_0x0084
            int r0 = rs0.C38336c.f91876i1
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r8 = r1
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            if (r8 == 0) goto L_0x0084
            int r0 = rs0.C38336c.f91879k1
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r9 = r1
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            if (r9 == 0) goto L_0x0084
            int r0 = rs0.C38336c.f91881m1
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r10 = r1
            ge.bog.designsystem.components.buttons.Button r10 = (p341ge.bog.designsystem.components.buttons.Button) r10
            if (r10 == 0) goto L_0x0084
            int r0 = rs0.C38336c.f91884o1
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r11 = r1
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 == 0) goto L_0x0084
            int r0 = rs0.C38336c.f91891s1
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r12 = r1
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x0084
            int r0 = rs0.C38336c.f91893t1
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r13 = r1
            ge.bog.designsystem.components.pagestate.PageState r13 = (p341ge.bog.designsystem.components.pagestate.PageState) r13
            if (r13 == 0) goto L_0x0084
            int r0 = rs0.C38336c.f91897w1
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0084
            p90.c8 r14 = p90.C27272c8.m84388a(r1)
            vs0.d r0 = new vs0.d
            r3 = r15
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0084:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.C39445d.m114631a(android.view.View):vs0.d");
    }

    /* renamed from: d */
    public static C39445d m114632d(LayoutInflater layoutInflater) {
        return m114633e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C39445d m114633e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.activity_piggy_bank_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114631a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93715d;
    }
}

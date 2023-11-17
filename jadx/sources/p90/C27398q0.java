package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.p975ui.components.slidingmenu.SlidingUpPanelLayout;
import p366bk.C10324m;

/* renamed from: p90.q0 */
public final class C27398q0 implements C6201a {

    /* renamed from: d */
    private final SlidingUpPanelLayout f69566d;

    /* renamed from: e */
    public final RecyclerView f69567e;

    /* renamed from: f */
    public final ScrollView f69568f;

    /* renamed from: g */
    public final C27476y6 f69569g;

    /* renamed from: h */
    public final C27369m7 f69570h;

    /* renamed from: i */
    public final LinearLayout f69571i;

    /* renamed from: j */
    public final FrameLayout f69572j;

    /* renamed from: k */
    public final Button f69573k;

    /* renamed from: l */
    public final FrameLayout f69574l;

    /* renamed from: m */
    public final ImageView f69575m;

    /* renamed from: n */
    public final FrameLayout f69576n;

    /* renamed from: o */
    public final C27378n7 f69577o;

    /* renamed from: p */
    public final C27396p7 f69578p;

    /* renamed from: q */
    public final C27486z7 f69579q;

    /* renamed from: r */
    public final LinearLayout f69580r;

    /* renamed from: s */
    public final SlidingUpPanelLayout f69581s;

    /* renamed from: t */
    public final C27272c8 f69582t;

    /* renamed from: u */
    public final C27405q7 f69583u;

    private C27398q0(SlidingUpPanelLayout slidingUpPanelLayout, RecyclerView recyclerView, ScrollView scrollView, C27476y6 y6Var, C27369m7 m7Var, LinearLayout linearLayout, FrameLayout frameLayout, Button button, FrameLayout frameLayout2, ImageView imageView, FrameLayout frameLayout3, C27378n7 n7Var, C27396p7 p7Var, C27486z7 z7Var, LinearLayout linearLayout2, SlidingUpPanelLayout slidingUpPanelLayout2, C27272c8 c8Var, C27405q7 q7Var) {
        this.f69566d = slidingUpPanelLayout;
        this.f69567e = recyclerView;
        this.f69568f = scrollView;
        this.f69569g = y6Var;
        this.f69570h = m7Var;
        this.f69571i = linearLayout;
        this.f69572j = frameLayout;
        this.f69573k = button;
        this.f69574l = frameLayout2;
        this.f69575m = imageView;
        this.f69576n = frameLayout3;
        this.f69577o = n7Var;
        this.f69578p = p7Var;
        this.f69579q = z7Var;
        this.f69580r = linearLayout2;
        this.f69581s = slidingUpPanelLayout2;
        this.f69582t = c8Var;
        this.f69583u = q7Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r1 = p366bk.C10322k.object_atm_paybox_details_container;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r1 = p366bk.C10322k.filtration_view;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27398q0 m84894a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = p366bk.C10322k.content_recycler_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x00c7
            int r1 = p366bk.C10322k.f28803Wc
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.ScrollView r6 = (android.widget.ScrollView) r6
            if (r6 == 0) goto L_0x00c7
            int r1 = p366bk.C10322k.filtration_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00c7
            p90.y6 r7 = p90.C27476y6.m85212a(r2)
            int r1 = p366bk.C10322k.f28797Uj
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00c7
            p90.m7 r8 = p90.C27369m7.m84785a(r2)
            int r1 = p366bk.C10322k.f28751Ik
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L_0x00c7
            int r1 = p366bk.C10322k.map_directions_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            if (r10 == 0) goto L_0x00c7
            int r1 = p366bk.C10322k.map_filtration_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.buttons.Button r11 = (p341ge.bog.designsystem.components.buttons.Button) r11
            if (r11 == 0) goto L_0x00c7
            int r1 = p366bk.C10322k.map_my_location_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x00c7
            int r1 = p366bk.C10322k.map_style_imageview
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            if (r13 == 0) goto L_0x00c7
            int r1 = p366bk.C10322k.map_style_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            if (r14 == 0) goto L_0x00c7
            int r1 = p366bk.C10322k.object_atm_paybox_details_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00c7
            p90.n7 r15 = p90.C27378n7.m84818a(r2)
            int r1 = p366bk.C10322k.object_sc_details_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00c7
            p90.p7 r16 = p90.C27396p7.m84888a(r2)
            int r1 = p366bk.C10322k.f28793Ts
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00c7
            p90.z7 r17 = p90.C27486z7.m85250a(r2)
            int r1 = p366bk.C10322k.slide_view_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            if (r18 == 0) goto L_0x00c7
            r19 = r0
            ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout r19 = (p341ge.bog.mobilebank.p975ui.components.slidingmenu.SlidingUpPanelLayout) r19
            int r1 = p366bk.C10322k.f28730Ex
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00c7
            p90.c8 r20 = p90.C27272c8.m84388a(r2)
            int r1 = p366bk.C10322k.top_menu
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00c7
            p90.q7 r21 = p90.C27405q7.m84923a(r2)
            p90.q0 r0 = new p90.q0
            r3 = r0
            r4 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L_0x00c7:
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27398q0.m84894a(android.view.View):p90.q0");
    }

    /* renamed from: d */
    public static C27398q0 m84895d(LayoutInflater layoutInflater) {
        return m84896e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27398q0 m84896e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_map, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84894a(inflate);
    }

    /* renamed from: c */
    public SlidingUpPanelLayout mo3946b() {
        return this.f69566d;
    }
}

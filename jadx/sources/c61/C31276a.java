package c61;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import x51.C39793e;

/* renamed from: c61.a */
public final class C31276a implements C6201a {

    /* renamed from: d */
    private final FrameLayout f77652d;

    /* renamed from: e */
    public final StateView f77653e;

    /* renamed from: f */
    public final PageDescriptionView f77654f;

    /* renamed from: g */
    public final LinearLayoutCompat f77655g;

    /* renamed from: h */
    public final View f77656h;

    /* renamed from: i */
    public final FrameLayout f77657i;

    /* renamed from: j */
    public final ConstraintLayout f77658j;

    /* renamed from: k */
    public final ViewPager2 f77659k;

    private C31276a(FrameLayout frameLayout, StateView stateView, PageDescriptionView pageDescriptionView, LinearLayoutCompat linearLayoutCompat, View view, FrameLayout frameLayout2, ConstraintLayout constraintLayout, ViewPager2 viewPager2) {
        this.f77652d = frameLayout;
        this.f77653e = stateView;
        this.f77654f = pageDescriptionView;
        this.f77655g = linearLayoutCompat;
        this.f77656h = view;
        this.f77657i = frameLayout2;
        this.f77658j = constraintLayout;
        this.f77659k = viewPager2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = x51.C39792d.gesture_catcher;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static c61.C31276a m92893a(android.view.View r11) {
        /*
            int r0 = x51.C39792d.f94500g
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r4 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r4
            if (r4 == 0) goto L_0x0054
            int r0 = x51.C39792d.f94502i
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r5 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r5
            if (r5 == 0) goto L_0x0054
            int r0 = x51.C39792d.f94503j
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            androidx.appcompat.widget.LinearLayoutCompat r6 = (androidx.appcompat.widget.LinearLayoutCompat) r6
            if (r6 == 0) goto L_0x0054
            int r0 = x51.C39792d.gesture_catcher
            android.view.View r7 = p086g1.C6202b.m24689a(r11, r0)
            if (r7 == 0) goto L_0x0054
            int r0 = x51.C39792d.f94507q
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x0054
            int r0 = x51.C39792d.story_groups_container
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            if (r9 == 0) goto L_0x0054
            int r0 = x51.C39792d.story_groups_pager
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            androidx.viewpager2.widget.ViewPager2 r10 = (androidx.viewpager2.widget.ViewPager2) r10
            if (r10 == 0) goto L_0x0054
            c61.a r0 = new c61.a
            r3 = r11
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0054:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.C31276a.m92893a(android.view.View):c61.a");
    }

    /* renamed from: d */
    public static C31276a m92894d(LayoutInflater layoutInflater) {
        return m92895e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C31276a m92895e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39793e.activity_story_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92893a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f77652d;
    }
}

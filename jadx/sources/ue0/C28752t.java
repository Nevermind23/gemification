package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p90.C27272c8;

/* renamed from: ue0.t */
public final class C28752t implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73458d;

    /* renamed from: e */
    public final Button f73459e;

    /* renamed from: f */
    public final LinearLayoutCompat f73460f;

    /* renamed from: g */
    public final ViewPager2 f73461g;

    /* renamed from: h */
    public final FrameLayout f73462h;

    /* renamed from: i */
    public final C27272c8 f73463i;

    private C28752t(ConstraintLayout constraintLayout, Button button, LinearLayoutCompat linearLayoutCompat, ViewPager2 viewPager2, FrameLayout frameLayout, C27272c8 c8Var) {
        this.f73458d = constraintLayout;
        this.f73459e = button;
        this.f73460f = linearLayoutCompat;
        this.f73461g = viewPager2;
        this.f73462h = frameLayout;
        this.f73463i = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28752t m88136a(android.view.View r9) {
        /*
            int r0 = ie0.C25187g.f64705k
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0042
            int r0 = ie0.C25187g.f64715r1
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat r5 = (androidx.appcompat.widget.LinearLayoutCompat) r5
            if (r5 == 0) goto L_0x0042
            int r0 = ie0.C25187g.introduction_slider
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            androidx.viewpager2.widget.ViewPager2 r6 = (androidx.viewpager2.widget.ViewPager2) r6
            if (r6 == 0) goto L_0x0042
            int r0 = ie0.C25187g.f64726w3
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L_0x0042
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0042
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            ue0.t r0 = new ue0.t
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0042:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28752t.m88136a(android.view.View):ue0.t");
    }

    /* renamed from: d */
    public static C28752t m88137d(LayoutInflater layoutInflater) {
        return m88138e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28752t m88138e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_introduction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88136a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73458d;
    }
}

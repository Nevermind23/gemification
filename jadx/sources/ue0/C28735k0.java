package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27272c8;

/* renamed from: ue0.k0 */
public final class C28735k0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73335d;

    /* renamed from: e */
    public final PageDescriptionView f73336e;

    /* renamed from: f */
    public final View f73337f;

    /* renamed from: g */
    public final FixedButtonView f73338g;

    /* renamed from: h */
    public final NestedScrollView f73339h;

    /* renamed from: i */
    public final C27272c8 f73340i;

    private C28735k0(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, View view, FixedButtonView fixedButtonView, NestedScrollView nestedScrollView, C27272c8 c8Var) {
        this.f73335d = constraintLayout;
        this.f73336e = pageDescriptionView;
        this.f73337f = view;
        this.f73338g = fixedButtonView;
        this.f73339h = nestedScrollView;
        this.f73340i = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = ie0.C25187g.f64687Y0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28735k0 m88064a(android.view.View r9) {
        /*
            int r0 = ie0.C25187g.f64683T0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r4 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r4
            if (r4 == 0) goto L_0x003f
            int r0 = ie0.C25187g.f64687Y0
            android.view.View r5 = p086g1.C6202b.m24689a(r9, r0)
            if (r5 == 0) goto L_0x003f
            int r0 = ie0.C25187g.f64720u2
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r6 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r6
            if (r6 == 0) goto L_0x003f
            int r0 = ie0.C25187g.scroll
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            androidx.core.widget.NestedScrollView r7 = (androidx.core.widget.NestedScrollView) r7
            if (r7 == 0) goto L_0x003f
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x003f
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            ue0.k0 r0 = new ue0.k0
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x003f:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28735k0.m88064a(android.view.View):ue0.k0");
    }

    /* renamed from: d */
    public static C28735k0 m88065d(LayoutInflater layoutInflater) {
        return m88066e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28735k0 m88066e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_kyc_required, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88064a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73335d;
    }
}

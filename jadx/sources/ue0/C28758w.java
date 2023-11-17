package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27272c8;

/* renamed from: ue0.w */
public final class C28758w implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73494d;

    /* renamed from: e */
    public final PageDescriptionView f73495e;

    /* renamed from: f */
    public final Button f73496f;

    /* renamed from: g */
    public final OneTimePasswordView f73497g;

    /* renamed from: h */
    public final C27272c8 f73498h;

    private C28758w(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, Button button, OneTimePasswordView oneTimePasswordView, C27272c8 c8Var) {
        this.f73494d = constraintLayout;
        this.f73495e = pageDescriptionView;
        this.f73496f = button;
        this.f73497g = oneTimePasswordView;
        this.f73498h = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28758w m88163a(android.view.View r8) {
        /*
            int r0 = ie0.C25187g.gtDescription
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r4 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = ie0.C25187g.nextButton
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x0037
            int r0 = ie0.C25187g.f64667B2
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r6 = (p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView) r6
            if (r6 == 0) goto L_0x0037
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.c8 r7 = p90.C27272c8.m84388a(r1)
            ue0.w r0 = new ue0.w
            r3 = r8
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0037:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28758w.m88163a(android.view.View):ue0.w");
    }

    /* renamed from: d */
    public static C28758w m88164d(LayoutInflater layoutInflater) {
        return m88165e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28758w m88165e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_onboarding_email_validate, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88163a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73494d;
    }
}

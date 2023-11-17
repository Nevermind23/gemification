package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.messagingsteps.StepView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27272c8;

/* renamed from: ue0.y */
public final class C28762y implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73535d;

    /* renamed from: e */
    public final StepView f73536e;

    /* renamed from: f */
    public final PageDescriptionView f73537f;

    /* renamed from: g */
    public final StepView f73538g;

    /* renamed from: h */
    public final Button f73539h;

    /* renamed from: i */
    public final C27272c8 f73540i;

    private C28762y(ConstraintLayout constraintLayout, StepView stepView, PageDescriptionView pageDescriptionView, StepView stepView2, Button button, C27272c8 c8Var) {
        this.f73535d = constraintLayout;
        this.f73536e = stepView;
        this.f73537f = pageDescriptionView;
        this.f73538g = stepView2;
        this.f73539h = button;
        this.f73540i = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28762y m88181a(android.view.View r9) {
        /*
            int r0 = ie0.C25187g.back_id
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.designsystem.components.messagingsteps.StepView r4 = (p341ge.bog.designsystem.components.messagingsteps.StepView) r4
            if (r4 == 0) goto L_0x0042
            int r0 = ie0.C25187g.f64683T0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r5 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r5
            if (r5 == 0) goto L_0x0042
            int r0 = ie0.C25187g.front_id
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            ge.bog.designsystem.components.messagingsteps.StepView r6 = (p341ge.bog.designsystem.components.messagingsteps.StepView) r6
            if (r6 == 0) goto L_0x0042
            int r0 = ie0.C25187g.nextButton
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x0042
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0042
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            ue0.y r0 = new ue0.y
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
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28762y.m88181a(android.view.View):ue0.y");
    }

    /* renamed from: d */
    public static C28762y m88182d(LayoutInflater layoutInflater) {
        return m88183e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28762y m88183e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_onboarding_identomat_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88181a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73535d;
    }
}

package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27272c8;

/* renamed from: ue0.v */
public final class C28756v implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73487d;

    /* renamed from: e */
    public final Input f73488e;

    /* renamed from: f */
    public final Button f73489f;

    /* renamed from: g */
    public final PageDescriptionView f73490g;

    /* renamed from: h */
    public final C27272c8 f73491h;

    private C28756v(ConstraintLayout constraintLayout, Input input, Button button, PageDescriptionView pageDescriptionView, C27272c8 c8Var) {
        this.f73487d = constraintLayout;
        this.f73488e = input;
        this.f73489f = button;
        this.f73490g = pageDescriptionView;
        this.f73491h = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28756v m88154a(android.view.View r8) {
        /*
            int r0 = ie0.C25187g.gtInput
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.designsystem.components.input.Input r4 = (p341ge.bog.designsystem.components.input.Input) r4
            if (r4 == 0) goto L_0x0037
            int r0 = ie0.C25187g.nextButton
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x0037
            int r0 = ie0.C25187g.pageDesc
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r6 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r6
            if (r6 == 0) goto L_0x0037
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.c8 r7 = p90.C27272c8.m84388a(r1)
            ue0.v r0 = new ue0.v
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
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28756v.m88154a(android.view.View):ue0.v");
    }

    /* renamed from: d */
    public static C28756v m88155d(LayoutInflater layoutInflater) {
        return m88156e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28756v m88156e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_onboarding_email_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88154a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73487d;
    }
}

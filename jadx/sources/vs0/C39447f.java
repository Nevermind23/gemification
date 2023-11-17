package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p90.C27272c8;
import rs0.C38337d;

/* renamed from: vs0.f */
public final class C39447f implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93736d;

    /* renamed from: e */
    public final TextTypeView f93737e;

    /* renamed from: f */
    public final TextTypeView f93738f;

    /* renamed from: g */
    public final Guideline f93739g;

    /* renamed from: h */
    public final Guideline f93740h;

    /* renamed from: i */
    public final Guideline f93741i;

    /* renamed from: j */
    public final TextTypeView f93742j;

    /* renamed from: k */
    public final TextTypeView f93743k;

    /* renamed from: l */
    public final AppCompatTextView f93744l;

    /* renamed from: m */
    public final C27272c8 f93745m;

    /* renamed from: n */
    public final FixedButtonView f93746n;

    private C39447f(ConstraintLayout constraintLayout, TextTypeView textTypeView, TextTypeView textTypeView2, Guideline guideline, Guideline guideline2, Guideline guideline3, TextTypeView textTypeView3, TextTypeView textTypeView4, AppCompatTextView appCompatTextView, C27272c8 c8Var, FixedButtonView fixedButtonView) {
        this.f93736d = constraintLayout;
        this.f93737e = textTypeView;
        this.f93738f = textTypeView2;
        this.f93739g = guideline;
        this.f93740h = guideline2;
        this.f93741i = guideline3;
        this.f93742j = textTypeView3;
        this.f93743k = textTypeView4;
        this.f93744l = appCompatTextView;
        this.f93745m = c8Var;
        this.f93746n = fixedButtonView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0 = rs0.C38336c.f91897w1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vs0.C39447f m114641a(android.view.View r14) {
        /*
            int r0 = rs0.C38336c.beneficiary_name
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r4
            if (r4 == 0) goto L_0x0079
            int r0 = rs0.C38336c.f91853F
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r5
            if (r5 == 0) goto L_0x0079
            int r0 = rs0.C38336c.f91864Y
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            androidx.constraintlayout.widget.Guideline r6 = (androidx.constraintlayout.widget.Guideline) r6
            if (r6 == 0) goto L_0x0079
            int r0 = rs0.C38336c.f91865Z
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            androidx.constraintlayout.widget.Guideline r7 = (androidx.constraintlayout.widget.Guideline) r7
            if (r7 == 0) goto L_0x0079
            int r0 = rs0.C38336c.f91866a0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            androidx.constraintlayout.widget.Guideline r8 = (androidx.constraintlayout.widget.Guideline) r8
            if (r8 == 0) goto L_0x0079
            int r0 = rs0.C38336c.f91875h0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r9
            if (r9 == 0) goto L_0x0079
            int r0 = rs0.C38336c.points
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r10 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r10 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r10
            if (r10 == 0) goto L_0x0079
            int r0 = rs0.C38336c.text_transfer
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            if (r11 == 0) goto L_0x0079
            int r0 = rs0.C38336c.f91897w1
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            if (r1 == 0) goto L_0x0079
            p90.c8 r12 = p90.C27272c8.m84388a(r1)
            int r0 = rs0.C38336c.f91851A1
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r13 = r1
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r13 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r13
            if (r13 == 0) goto L_0x0079
            vs0.f r0 = new vs0.f
            r3 = r14
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0079:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.C39447f.m114641a(android.view.View):vs0.f");
    }

    /* renamed from: d */
    public static C39447f m114642d(LayoutInflater layoutInflater) {
        return m114643e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C39447f m114643e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.activity_plus_points_transfer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114641a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93736d;
    }
}

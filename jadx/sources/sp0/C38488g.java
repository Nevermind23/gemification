package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import np0.C37440f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.progressbar.ProgressBarView;
import p90.C27272c8;

/* renamed from: sp0.g */
public final class C38488g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f92188d;

    /* renamed from: e */
    public final ConstraintLayout f92189e;

    /* renamed from: f */
    public final FragmentContainerView f92190f;

    /* renamed from: g */
    public final ProgressBarView f92191g;

    /* renamed from: h */
    public final ProgressBarView f92192h;

    /* renamed from: i */
    public final FrameLayout f92193i;

    /* renamed from: j */
    public final C27272c8 f92194j;

    private C38488g(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FragmentContainerView fragmentContainerView, ProgressBarView progressBarView, ProgressBarView progressBarView2, FrameLayout frameLayout, C27272c8 c8Var) {
        this.f92188d = constraintLayout;
        this.f92189e = constraintLayout2;
        this.f92190f = fragmentContainerView;
        this.f92191g = progressBarView;
        this.f92192h = progressBarView2;
        this.f92193i = frameLayout;
        this.f92194j = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = np0.C37439e.f89996Z0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sp0.C38488g m112964a(android.view.View r10) {
        /*
            int r0 = np0.C37439e.activation_progress_container
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            if (r4 == 0) goto L_0x004d
            int r0 = np0.C37439e.f90008m0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            androidx.fragment.app.FragmentContainerView r5 = (androidx.fragment.app.FragmentContainerView) r5
            if (r5 == 0) goto L_0x004d
            int r0 = np0.C37439e.f90010o0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            ge.bog.designsystem.components.progressbar.ProgressBarView r6 = (p341ge.bog.designsystem.components.progressbar.ProgressBarView) r6
            if (r6 == 0) goto L_0x004d
            int r0 = np0.C37439e.f90012p0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            ge.bog.designsystem.components.progressbar.ProgressBarView r7 = (p341ge.bog.designsystem.components.progressbar.ProgressBarView) r7
            if (r7 == 0) goto L_0x004d
            int r0 = np0.C37439e.f89981D0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x004d
            int r0 = np0.C37439e.f89996Z0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004d
            p90.c8 r9 = p90.C27272c8.m84388a(r1)
            sp0.g r0 = new sp0.g
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004d:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sp0.C38488g.m112964a(android.view.View):sp0.g");
    }

    /* renamed from: d */
    public static C38488g m112965d(LayoutInflater layoutInflater) {
        return m112966e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C38488g m112966e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.activity_loan_activation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112964a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f92188d;
    }
}

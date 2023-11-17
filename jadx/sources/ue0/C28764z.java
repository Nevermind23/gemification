package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p90.C27272c8;

/* renamed from: ue0.z */
public final class C28764z implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73546d;

    /* renamed from: e */
    public final RecyclerView f73547e;

    /* renamed from: f */
    public final FixedButtonView f73548f;

    /* renamed from: g */
    public final ProgressBar f73549g;

    /* renamed from: h */
    public final C27272c8 f73550h;

    private C28764z(ConstraintLayout constraintLayout, RecyclerView recyclerView, FixedButtonView fixedButtonView, ProgressBar progressBar, C27272c8 c8Var) {
        this.f73546d = constraintLayout;
        this.f73547e = recyclerView;
        this.f73548f = fixedButtonView;
        this.f73549g = progressBar;
        this.f73550h = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28764z m88190a(android.view.View r8) {
        /*
            int r0 = ie0.C25187g.content_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = ie0.C25187g.f64720u2
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r5 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r5
            if (r5 == 0) goto L_0x0037
            int r0 = ie0.C25187g.f64685U2
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            if (r6 == 0) goto L_0x0037
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.c8 r7 = p90.C27272c8.m84388a(r1)
            ue0.z r0 = new ue0.z
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
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28764z.m88190a(android.view.View):ue0.z");
    }

    /* renamed from: d */
    public static C28764z m88191d(LayoutInflater layoutInflater) {
        return m88192e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28764z m88192e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_onboarding_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88190a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73546d;
    }
}

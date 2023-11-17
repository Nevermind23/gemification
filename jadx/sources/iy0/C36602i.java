package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p90.C27272c8;

/* renamed from: iy0.i */
public final class C36602i implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88258d;

    /* renamed from: e */
    public final LoadingView f88259e;

    /* renamed from: f */
    public final ConstraintLayout f88260f;

    /* renamed from: g */
    public final AppCompatTextView f88261g;

    /* renamed from: h */
    public final LoadingView f88262h;

    /* renamed from: i */
    public final RecyclerView f88263i;

    /* renamed from: j */
    public final Group f88264j;

    /* renamed from: k */
    public final Button f88265k;

    /* renamed from: l */
    public final SwipeRefreshLayout f88266l;

    /* renamed from: m */
    public final C27272c8 f88267m;

    private C36602i(ConstraintLayout constraintLayout, LoadingView loadingView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, LoadingView loadingView2, RecyclerView recyclerView, Group group, Button button, SwipeRefreshLayout swipeRefreshLayout, C27272c8 c8Var) {
        this.f88258d = constraintLayout;
        this.f88259e = loadingView;
        this.f88260f = constraintLayout2;
        this.f88261g = appCompatTextView;
        this.f88262h = loadingView2;
        this.f88263i = recyclerView;
        this.f88264j = group;
        this.f88265k = button;
        this.f88266l = swipeRefreshLayout;
        this.f88267m = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0 = hy0.C36271e.f87549u2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36602i m108536a(android.view.View r13) {
        /*
            int r0 = hy0.C36271e.cards_loader
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            ge.bog.designsystem.components.loading.LoadingView r4 = (p341ge.bog.designsystem.components.loading.LoadingView) r4
            if (r4 == 0) goto L_0x006e
            int r0 = hy0.C36271e.f87528k0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            if (r5 == 0) goto L_0x006e
            int r0 = hy0.C36271e.f87536n0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r6 == 0) goto L_0x006e
            int r0 = hy0.C36271e.f87486E0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            ge.bog.designsystem.components.loading.LoadingView r7 = (p341ge.bog.designsystem.components.loading.LoadingView) r7
            if (r7 == 0) goto L_0x006e
            int r0 = hy0.C36271e.insurance_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            if (r8 == 0) goto L_0x006e
            int r0 = hy0.C36271e.f87522i1
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            androidx.constraintlayout.widget.Group r9 = (androidx.constraintlayout.widget.Group) r9
            if (r9 == 0) goto L_0x006e
            int r0 = hy0.C36271e.f87509b2
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            ge.bog.designsystem.components.buttons.Button r10 = (p341ge.bog.designsystem.components.buttons.Button) r10
            if (r10 == 0) goto L_0x006e
            int r0 = hy0.C36271e.f87540p2
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r11 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r11
            if (r11 == 0) goto L_0x006e
            int r0 = hy0.C36271e.f87549u2
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            if (r1 == 0) goto L_0x006e
            p90.c8 r12 = p90.C27272c8.m84388a(r1)
            iy0.i r0 = new iy0.i
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006e:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36602i.m108536a(android.view.View):iy0.i");
    }

    /* renamed from: d */
    public static C36602i m108537d(LayoutInflater layoutInflater) {
        return m108538e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36602i m108538e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.activity_card_insurance_statuses, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108536a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88258d;
    }
}

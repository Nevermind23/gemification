package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.shared.view.ProgressAnimationView;
import p90.C27272c8;
import p90.C27486z7;
import u70.C28607c;

/* renamed from: h80.j */
public final class C24903j implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f63984d;

    /* renamed from: e */
    public final Button f63985e;

    /* renamed from: f */
    public final PageDescriptionView f63986f;

    /* renamed from: g */
    public final PageDescriptionView f63987g;

    /* renamed from: h */
    public final LinearLayout f63988h;

    /* renamed from: i */
    public final RecyclerView f63989i;

    /* renamed from: j */
    public final CardView f63990j;

    /* renamed from: k */
    public final CardView f63991k;

    /* renamed from: l */
    public final ProgressAnimationView f63992l;

    /* renamed from: m */
    public final C27486z7 f63993m;

    /* renamed from: n */
    public final CardView f63994n;

    /* renamed from: o */
    public final FixedButtonView f63995o;

    /* renamed from: p */
    public final C27272c8 f63996p;

    /* renamed from: q */
    public final FrameLayout f63997q;

    private C24903j(ConstraintLayout constraintLayout, Button button, PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2, LinearLayout linearLayout, RecyclerView recyclerView, CardView cardView, CardView cardView2, ProgressAnimationView progressAnimationView, C27486z7 z7Var, CardView cardView3, FixedButtonView fixedButtonView, C27272c8 c8Var, FrameLayout frameLayout) {
        this.f63984d = constraintLayout;
        this.f63985e = button;
        this.f63986f = pageDescriptionView;
        this.f63987g = pageDescriptionView2;
        this.f63988h = linearLayout;
        this.f63989i = recyclerView;
        this.f63990j = cardView;
        this.f63991k = cardView2;
        this.f63992l = progressAnimationView;
        this.f63993m = z7Var;
        this.f63994n = cardView3;
        this.f63995o = fixedButtonView;
        this.f63996p = c8Var;
        this.f63997q = frameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r1 = u70.C28606b.f72567A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        r1 = u70.C28606b.f72587Q0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h80.C24903j m79593a(android.view.View r18) {
        /*
            r0 = r18
            int r1 = u70.C28606b.f72592b
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x009e
            int r1 = u70.C28606b.f72566A
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r6 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r6
            if (r6 == 0) goto L_0x009e
            int r1 = u70.C28606b.incomes_empty_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r7 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r7
            if (r7 == 0) goto L_0x009e
            int r1 = u70.C28606b.incomes_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x009e
            int r1 = u70.C28606b.incomes_recycler
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            if (r9 == 0) goto L_0x009e
            int r1 = u70.C28606b.processing_progress_bar_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            if (r10 == 0) goto L_0x009e
            int r1 = u70.C28606b.f72608t0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
            if (r11 == 0) goto L_0x009e
            int r1 = u70.C28606b.f72611w0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.mobilebank.shared.view.ProgressAnimationView r12 = (p341ge.bog.mobilebank.shared.view.ProgressAnimationView) r12
            if (r12 == 0) goto L_0x009e
            int r1 = u70.C28606b.f72567A0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x009e
            p90.z7 r13 = p90.C27486z7.m85250a(r2)
            int r1 = u70.C28606b.f72569B0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.cardview.widget.CardView r14 = (androidx.cardview.widget.CardView) r14
            if (r14 == 0) goto L_0x009e
            int r1 = u70.C28606b.f72578J0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r15 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r15
            if (r15 == 0) goto L_0x009e
            int r1 = u70.C28606b.f72587Q0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x009e
            p90.c8 r16 = p90.C27272c8.m84388a(r2)
            int r1 = u70.C28606b.f72588R0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.FrameLayout r17 = (android.widget.FrameLayout) r17
            if (r17 == 0) goto L_0x009e
            h80.j r1 = new h80.j
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x009e:
            android.content.res.Resources r0 = r18.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h80.C24903j.m79593a(android.view.View):h80.j");
    }

    /* renamed from: d */
    public static C24903j m79594d(LayoutInflater layoutInflater) {
        return m79595e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C24903j m79595e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.activity_client_incomes, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79593a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f63984d;
    }
}

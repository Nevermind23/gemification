package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p356ao.C10115g;
import p90.C27486z7;

/* renamed from: eo.i */
public final class C12748i implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f37744d;

    /* renamed from: e */
    public final FixedButtonView f37745e;

    /* renamed from: f */
    public final FrameLayout f37746f;

    /* renamed from: g */
    public final RecyclerView f37747g;

    /* renamed from: h */
    public final C27486z7 f37748h;

    /* renamed from: i */
    public final CardView f37749i;

    private C12748i(ConstraintLayout constraintLayout, FixedButtonView fixedButtonView, FrameLayout frameLayout, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView) {
        this.f37744d = constraintLayout;
        this.f37745e = fixedButtonView;
        this.f37746f = frameLayout;
        this.f37747g = recyclerView;
        this.f37748h = z7Var;
        this.f37749i = cardView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p356ao.C10114f.f27955g1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p413eo.C12748i m48386a(android.view.View r9) {
        /*
            int r0 = p356ao.C10114f.f27937R
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r4 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r4
            if (r4 == 0) goto L_0x0042
            int r0 = p356ao.C10114f.f27943X0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x0042
            int r0 = p356ao.C10114f.f27950c1
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0042
            int r0 = p356ao.C10114f.f27955g1
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0042
            p90.z7 r7 = p90.C27486z7.m85250a(r1)
            int r0 = p356ao.C10114f.f27957h1
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            androidx.cardview.widget.CardView r8 = (androidx.cardview.widget.CardView) r8
            if (r8 == 0) goto L_0x0042
            eo.i r0 = new eo.i
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
        throw new UnsupportedOperationException("Method not decompiled: p413eo.C12748i.m48386a(android.view.View):eo.i");
    }

    /* renamed from: d */
    public static C12748i m48387d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_application_first_stage, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48386a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f37744d;
    }
}

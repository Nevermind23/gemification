package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p356ao.C10115g;
import p90.C27486z7;

/* renamed from: eo.e */
public final class C12738e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f37700d;

    /* renamed from: e */
    public final FrameLayout f37701e;

    /* renamed from: f */
    public final RecyclerView f37702f;

    /* renamed from: g */
    public final C27486z7 f37703g;

    /* renamed from: h */
    public final CardView f37704h;

    private C12738e(ConstraintLayout constraintLayout, FrameLayout frameLayout, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView) {
        this.f37700d = constraintLayout;
        this.f37701e = frameLayout;
        this.f37702f = recyclerView;
        this.f37703g = z7Var;
        this.f37704h = cardView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = p356ao.C10114f.f27955g1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p413eo.C12738e m48345a(android.view.View r8) {
        /*
            int r0 = p356ao.C10114f.f27943X0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x0037
            int r0 = p356ao.C10114f.f27950c1
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0037
            int r0 = p356ao.C10114f.f27955g1
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.z7 r6 = p90.C27486z7.m85250a(r1)
            int r0 = p356ao.C10114f.f27957h1
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0037
            eo.e r0 = new eo.e
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
        throw new UnsupportedOperationException("Method not decompiled: p413eo.C12738e.m48345a(android.view.View):eo.e");
    }

    /* renamed from: d */
    public static C12738e m48346d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.action_sheet_solo_lounge_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48345a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f37700d;
    }
}

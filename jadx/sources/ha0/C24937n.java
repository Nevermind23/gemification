package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import da0.C19952f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27486z7;

/* renamed from: ha0.n */
public final class C24937n implements C6201a {

    /* renamed from: d */
    private final ScrollView f64223d;

    /* renamed from: e */
    public final PageDescriptionView f64224e;

    /* renamed from: f */
    public final FrameLayout f64225f;

    /* renamed from: g */
    public final RecyclerView f64226g;

    /* renamed from: h */
    public final C27486z7 f64227h;

    /* renamed from: i */
    public final CardView f64228i;

    private C24937n(ScrollView scrollView, PageDescriptionView pageDescriptionView, FrameLayout frameLayout, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView) {
        this.f64223d = scrollView;
        this.f64224e = pageDescriptionView;
        this.f64225f = frameLayout;
        this.f64226g = recyclerView;
        this.f64227h = z7Var;
        this.f64228i = cardView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = da0.C19951e.f54538t0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ha0.C24937n m79732a(android.view.View r9) {
        /*
            int r0 = da0.C19951e.f54530k0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r4 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r4
            if (r4 == 0) goto L_0x0042
            int r0 = da0.C19951e.f54534p0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x0042
            int r0 = da0.C19951e.f54536r0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0042
            int r0 = da0.C19951e.f54538t0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0042
            p90.z7 r7 = p90.C27486z7.m85250a(r1)
            int r0 = da0.C19951e.f54539u0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            androidx.cardview.widget.CardView r8 = (androidx.cardview.widget.CardView) r8
            if (r8 == 0) goto L_0x0042
            ha0.n r0 = new ha0.n
            r3 = r9
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
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
        throw new UnsupportedOperationException("Method not decompiled: ha0.C24937n.m79732a(android.view.View):ha0.n");
    }

    /* renamed from: d */
    public static C24937n m79733d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.fragment_deposit_advisor, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79732a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f64223d;
    }
}

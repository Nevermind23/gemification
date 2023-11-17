package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.search.SearchView;
import p90.C27272c8;

/* renamed from: ue0.d0 */
public final class C28719d0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73163d;

    /* renamed from: e */
    public final LinearLayout f73164e;

    /* renamed from: f */
    public final RecyclerView f73165f;

    /* renamed from: g */
    public final SearchView f73166g;

    /* renamed from: h */
    public final C27272c8 f73167h;

    private C28719d0(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, SearchView searchView, C27272c8 c8Var) {
        this.f73163d = linearLayout;
        this.f73164e = linearLayout2;
        this.f73165f = recyclerView;
        this.f73166g = searchView;
        this.f73167h = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28719d0 m87994a(android.view.View r6) {
        /*
            r2 = r6
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r0 = ie0.C25187g.f64703j3
            android.view.View r1 = p086g1.C6202b.m24689a(r6, r0)
            r3 = r1
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            if (r3 == 0) goto L_0x002d
            int r0 = ie0.C25187g.f64729x3
            android.view.View r1 = p086g1.C6202b.m24689a(r6, r0)
            r4 = r1
            ge.bog.designsystem.components.search.SearchView r4 = (p341ge.bog.designsystem.components.search.SearchView) r4
            if (r4 == 0) goto L_0x002d
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r6, r0)
            if (r1 == 0) goto L_0x002d
            p90.c8 r5 = p90.C27272c8.m84388a(r1)
            ue0.d0 r6 = new ue0.d0
            r0 = r6
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x002d:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28719d0.m87994a(android.view.View):ue0.d0");
    }

    /* renamed from: d */
    public static C28719d0 m87995d(LayoutInflater layoutInflater) {
        return m87996e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28719d0 m87996e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_search_symbol, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87994a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73163d;
    }
}

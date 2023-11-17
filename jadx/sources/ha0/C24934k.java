package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import da0.C19952f;
import p086g1.C6201a;
import p90.C27272c8;
import p90.C27364m2;
import p90.C27486z7;

/* renamed from: ha0.k */
public final class C24934k implements C6201a {

    /* renamed from: d */
    private final CoordinatorLayout f64177d;

    /* renamed from: e */
    public final C27364m2 f64178e;

    /* renamed from: f */
    public final RecyclerView f64179f;

    /* renamed from: g */
    public final C27486z7 f64180g;

    /* renamed from: h */
    public final FrameLayout f64181h;

    /* renamed from: i */
    public final C27272c8 f64182i;

    private C24934k(CoordinatorLayout coordinatorLayout, C27364m2 m2Var, RecyclerView recyclerView, C27486z7 z7Var, FrameLayout frameLayout, C27272c8 c8Var) {
        this.f64177d = coordinatorLayout;
        this.f64178e = m2Var;
        this.f64179f = recyclerView;
        this.f64180g = z7Var;
        this.f64181h = frameLayout;
        this.f64182i = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = da0.C19951e.f54537s0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0 = da0.C19951e.f54510G0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ha0.C24934k m79719a(android.view.View r9) {
        /*
            int r0 = da0.C19951e.f54519S
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0044
            p90.m2 r4 = p90.C27364m2.m84766a(r1)
            int r0 = da0.C19951e.f54536r0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0044
            int r0 = da0.C19951e.f54537s0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0044
            p90.z7 r6 = p90.C27486z7.m85250a(r1)
            int r0 = da0.C19951e.f54539u0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L_0x0044
            int r0 = da0.C19951e.f54510G0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0044
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            ha0.k r0 = new ha0.k
            r3 = r9
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0044:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C24934k.m79719a(android.view.View):ha0.k");
    }

    /* renamed from: d */
    public static C24934k m79720d(LayoutInflater layoutInflater) {
        return m79721e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C24934k m79721e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.activity_deposit_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79719a(inflate);
    }

    /* renamed from: c */
    public CoordinatorLayout mo3946b() {
        return this.f64177d;
    }
}

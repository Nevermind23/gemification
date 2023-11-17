package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import da0.C19952f;
import p086g1.C6201a;
import p90.C27272c8;

/* renamed from: ha0.f */
public final class C24929f implements C6201a {

    /* renamed from: d */
    private final CoordinatorLayout f64113d;

    /* renamed from: e */
    public final FragmentContainerView f64114e;

    /* renamed from: f */
    public final C27272c8 f64115f;

    private C24929f(CoordinatorLayout coordinatorLayout, FragmentContainerView fragmentContainerView, C27272c8 c8Var) {
        this.f64113d = coordinatorLayout;
        this.f64114e = fragmentContainerView;
        this.f64115f = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = da0.C19951e.f54510G0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ha0.C24929f m79694a(android.view.View r3) {
        /*
            int r0 = da0.C19951e.f54518R
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = da0.C19951e.f54510G0
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            ha0.f r2 = new ha0.f
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r2.<init>(r3, r1, r0)
            return r2
        L_0x001e:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C24929f.m79694a(android.view.View):ha0.f");
    }

    /* renamed from: d */
    public static C24929f m79695d(LayoutInflater layoutInflater) {
        return m79696e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C24929f m79696e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.activity_deposit_advisor, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79694a(inflate);
    }

    /* renamed from: c */
    public CoordinatorLayout mo3946b() {
        return this.f64113d;
    }
}

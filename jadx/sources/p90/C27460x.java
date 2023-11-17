package p90;

import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: p90.x */
public final class C27460x implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70185d;

    /* renamed from: e */
    public final ConstraintLayout f70186e;

    /* renamed from: f */
    public final SearchView f70187f;

    /* renamed from: g */
    public final StateView f70188g;

    /* renamed from: h */
    public final C27272c8 f70189h;

    private C27460x(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, SearchView searchView, StateView stateView, C27272c8 c8Var) {
        this.f70185d = constraintLayout;
        this.f70186e = constraintLayout2;
        this.f70187f = searchView;
        this.f70188g = stateView;
        this.f70189h = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27460x m85146a(android.view.View r6) {
        /*
            r2 = r6
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            int r0 = p366bk.C10322k.f28765Kt
            android.view.View r1 = p086g1.C6202b.m24689a(r6, r0)
            r3 = r1
            ge.bog.designsystem.components.search.SearchView r3 = (p341ge.bog.designsystem.components.search.SearchView) r3
            if (r3 == 0) goto L_0x002d
            int r0 = p366bk.C10322k.f28746Hv
            android.view.View r1 = p086g1.C6202b.m24689a(r6, r0)
            r4 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r4 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r4
            if (r4 == 0) goto L_0x002d
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r6, r0)
            if (r1 == 0) goto L_0x002d
            p90.c8 r5 = p90.C27272c8.m84388a(r1)
            p90.x r6 = new p90.x
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
        throw new UnsupportedOperationException("Method not decompiled: p90.C27460x.m85146a(android.view.View):p90.x");
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f70185d;
    }
}

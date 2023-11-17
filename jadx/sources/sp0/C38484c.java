package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import np0.C37440f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p90.C27486z7;

/* renamed from: sp0.c */
public final class C38484c implements C6201a {

    /* renamed from: d */
    private final FrameLayout f92173d;

    /* renamed from: e */
    public final LoadingView f92174e;

    /* renamed from: f */
    public final RecyclerView f92175f;

    /* renamed from: g */
    public final C27486z7 f92176g;

    /* renamed from: h */
    public final CardView f92177h;

    private C38484c(FrameLayout frameLayout, LoadingView loadingView, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView) {
        this.f92173d = frameLayout;
        this.f92174e = loadingView;
        this.f92175f = recyclerView;
        this.f92176g = z7Var;
        this.f92177h = cardView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = np0.C37439e.f89986K0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sp0.C38484c m112948a(android.view.View r8) {
        /*
            int r0 = np0.C37439e.f90005i0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.designsystem.components.loading.LoadingView r4 = (p341ge.bog.designsystem.components.loading.LoadingView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = np0.C37439e.f89983F0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0037
            int r0 = np0.C37439e.f89986K0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.z7 r6 = p90.C27486z7.m85250a(r1)
            int r0 = np0.C37439e.f89987L0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0037
            sp0.c r0 = new sp0.c
            r3 = r8
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: sp0.C38484c.m112948a(android.view.View):sp0.c");
    }

    /* renamed from: d */
    public static C38484c m112949d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.action_sheet_loan_account_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112948a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f92173d;
    }
}

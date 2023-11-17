package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p90.C27486z7;
import x11.C39772e;

/* renamed from: b31.g */
public final class C31118g implements C6201a {

    /* renamed from: d */
    private final FrameLayout f77336d;

    /* renamed from: e */
    public final LoadingView f77337e;

    /* renamed from: f */
    public final RecyclerView f77338f;

    /* renamed from: g */
    public final C27486z7 f77339g;

    /* renamed from: h */
    public final CardView f77340h;

    private C31118g(FrameLayout frameLayout, LoadingView loadingView, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView) {
        this.f77336d = frameLayout;
        this.f77337e = loadingView;
        this.f77338f = recyclerView;
        this.f77339g = z7Var;
        this.f77340h = cardView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = x11.C39771d.f94479t;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b31.C31118g m92591a(android.view.View r8) {
        /*
            int r0 = x11.C39771d.f94473m
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.designsystem.components.loading.LoadingView r4 = (p341ge.bog.designsystem.components.loading.LoadingView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = x11.C39771d.f94478s
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0037
            int r0 = x11.C39771d.f94479t
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.z7 r6 = p90.C27486z7.m85250a(r1)
            int r0 = x11.C39771d.f94480u
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0037
            b31.g r0 = new b31.g
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
        throw new UnsupportedOperationException("Method not decompiled: b31.C31118g.m92591a(android.view.View):b31.g");
    }

    /* renamed from: d */
    public static C31118g m92592d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.fragment_domestic_account_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92591a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f77336d;
    }
}

package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27486z7;

/* renamed from: pr0.g */
public final class C37954g implements C6201a {

    /* renamed from: d */
    private final StateView f91136d;

    /* renamed from: e */
    public final LoadingView f91137e;

    /* renamed from: f */
    public final RecyclerView f91138f;

    /* renamed from: g */
    public final C27486z7 f91139g;

    /* renamed from: h */
    public final CardView f91140h;

    /* renamed from: i */
    public final StateView f91141i;

    private C37954g(StateView stateView, LoadingView loadingView, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView, StateView stateView2) {
        this.f91136d = stateView;
        this.f91137e = loadingView;
        this.f91138f = recyclerView;
        this.f91139g = z7Var;
        this.f91140h = cardView;
        this.f91141i = stateView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = lr0.C37130e.f89437n1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static pr0.C37954g m111561a(android.view.View r9) {
        /*
            int r0 = lr0.C37130e.f89429d0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.designsystem.components.loading.LoadingView r4 = (p341ge.bog.designsystem.components.loading.LoadingView) r4
            if (r4 == 0) goto L_0x0038
            int r0 = lr0.C37130e.f89431e1
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0038
            int r0 = lr0.C37130e.f89437n1
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0038
            p90.z7 r6 = p90.C27486z7.m85250a(r1)
            int r0 = lr0.C37130e.f89439o1
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0038
            r8 = r9
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r8 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r8
            pr0.g r9 = new pr0.g
            r2 = r9
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0038:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.C37954g.m111561a(android.view.View):pr0.g");
    }

    /* renamed from: d */
    public static C37954g m111562d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.fragment_repayment_account_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111561a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f91136d;
    }
}

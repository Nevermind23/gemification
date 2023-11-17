package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27486z7;
import y71.C40031e;

/* renamed from: z71.a */
public final class C40174a implements C6201a {

    /* renamed from: d */
    private final StateView f95447d;

    /* renamed from: e */
    public final LoadingView f95448e;

    /* renamed from: f */
    public final RecyclerView f95449f;

    /* renamed from: g */
    public final C27486z7 f95450g;

    /* renamed from: h */
    public final CardView f95451h;

    /* renamed from: i */
    public final StateView f95452i;

    private C40174a(StateView stateView, LoadingView loadingView, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView, StateView stateView2) {
        this.f95447d = stateView;
        this.f95448e = loadingView;
        this.f95449f = recyclerView;
        this.f95450g = z7Var;
        this.f95451h = cardView;
        this.f95452i = stateView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = y71.C40030d.f95109n0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z71.C40174a m116402a(android.view.View r9) {
        /*
            int r0 = y71.C40030d.f95095T
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.designsystem.components.loading.LoadingView r4 = (p341ge.bog.designsystem.components.loading.LoadingView) r4
            if (r4 == 0) goto L_0x0038
            int r0 = y71.C40030d.f95107l0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0038
            int r0 = y71.C40030d.f95109n0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0038
            p90.z7 r6 = p90.C27486z7.m85250a(r1)
            int r0 = y71.C40030d.f95110o0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0038
            r8 = r9
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r8 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r8
            z71.a r9 = new z71.a
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
        throw new UnsupportedOperationException("Method not decompiled: z71.C40174a.m116402a(android.view.View):z71.a");
    }

    /* renamed from: d */
    public static C40174a m116403d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.action_sheet_insurance_accounts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116402a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f95447d;
    }
}

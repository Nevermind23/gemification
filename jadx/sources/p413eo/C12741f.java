package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.drilldown.DrilldownView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p356ao.C10115g;
import p90.C27486z7;

/* renamed from: eo.f */
public final class C12741f implements C6201a {

    /* renamed from: d */
    private final StateView f37709d;

    /* renamed from: e */
    public final NestedScrollView f37710e;

    /* renamed from: f */
    public final TextView f37711f;

    /* renamed from: g */
    public final DrilldownView f37712g;

    /* renamed from: h */
    public final FrameLayout f37713h;

    /* renamed from: i */
    public final RecyclerView f37714i;

    /* renamed from: j */
    public final C27486z7 f37715j;

    /* renamed from: k */
    public final CardView f37716k;

    /* renamed from: l */
    public final StateView f37717l;

    private C12741f(StateView stateView, NestedScrollView nestedScrollView, TextView textView, DrilldownView drilldownView, FrameLayout frameLayout, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView, StateView stateView2) {
        this.f37709d = stateView;
        this.f37710e = nestedScrollView;
        this.f37711f = textView;
        this.f37712g = drilldownView;
        this.f37713h = frameLayout;
        this.f37714i = recyclerView;
        this.f37715j = z7Var;
        this.f37716k = cardView;
        this.f37717l = stateView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = p356ao.C10114f.f27955g1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p413eo.C12741f m48357a(android.view.View r12) {
        /*
            int r0 = p356ao.C10114f.f27934P
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            if (r4 == 0) goto L_0x0059
            int r0 = p356ao.C10114f.f27940U
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0059
            int r0 = p356ao.C10114f.drilldown
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            ge.bog.designsystem.components.drilldown.DrilldownView r6 = (p341ge.bog.designsystem.components.drilldown.DrilldownView) r6
            if (r6 == 0) goto L_0x0059
            int r0 = p356ao.C10114f.f27943X0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L_0x0059
            int r0 = p356ao.C10114f.f27950c1
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            if (r8 == 0) goto L_0x0059
            int r0 = p356ao.C10114f.f27955g1
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0059
            p90.z7 r9 = p90.C27486z7.m85250a(r1)
            int r0 = p356ao.C10114f.f27957h1
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            if (r10 == 0) goto L_0x0059
            r11 = r12
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r11 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r11
            eo.f r12 = new eo.f
            r2 = r12
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        L_0x0059:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p413eo.C12741f.m48357a(android.view.View):eo.f");
    }

    /* renamed from: d */
    public static C12741f m48358d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.action_sheet_statistics, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48357a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f37709d;
    }
}

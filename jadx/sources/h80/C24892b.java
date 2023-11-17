package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.search.SearchView;
import p90.C27486z7;
import u70.C28607c;

/* renamed from: h80.b */
public final class C24892b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f63884d;

    /* renamed from: e */
    public final CardView f63885e;

    /* renamed from: f */
    public final RecyclerView f63886f;

    /* renamed from: g */
    public final C27486z7 f63887g;

    /* renamed from: h */
    public final CardView f63888h;

    /* renamed from: i */
    public final SearchView f63889i;

    private C24892b(ConstraintLayout constraintLayout, CardView cardView, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView2, SearchView searchView) {
        this.f63884d = constraintLayout;
        this.f63885e = cardView;
        this.f63886f = recyclerView;
        this.f63887g = z7Var;
        this.f63888h = cardView2;
        this.f63889i = searchView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = u70.C28606b.f72567A0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h80.C24892b m79549a(android.view.View r9) {
        /*
            int r0 = u70.C28606b.f72609u0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            androidx.cardview.widget.CardView r4 = (androidx.cardview.widget.CardView) r4
            if (r4 == 0) goto L_0x0042
            int r0 = u70.C28606b.f72613x0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0042
            int r0 = u70.C28606b.f72567A0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0042
            p90.z7 r6 = p90.C27486z7.m85250a(r1)
            int r0 = u70.C28606b.f72569B0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0042
            int r0 = u70.C28606b.f72575G0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            ge.bog.designsystem.components.search.SearchView r8 = (p341ge.bog.designsystem.components.search.SearchView) r8
            if (r8 == 0) goto L_0x0042
            h80.b r0 = new h80.b
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: h80.C24892b.m79549a(android.view.View):h80.b");
    }

    /* renamed from: d */
    public static C24892b m79550d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.action_sheet_income_country, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79549a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f63884d;
    }
}

package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.search.SearchView;
import p90.C27486z7;
import u70.C28607c;

/* renamed from: h80.f */
public final class C24899f implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f63926d;

    /* renamed from: e */
    public final PageDescriptionView f63927e;

    /* renamed from: f */
    public final CardView f63928f;

    /* renamed from: g */
    public final RecyclerView f63929g;

    /* renamed from: h */
    public final C27486z7 f63930h;

    /* renamed from: i */
    public final CardView f63931i;

    /* renamed from: j */
    public final SearchView f63932j;

    private C24899f(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, CardView cardView, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView2, SearchView searchView) {
        this.f63926d = constraintLayout;
        this.f63927e = pageDescriptionView;
        this.f63928f = cardView;
        this.f63929g = recyclerView;
        this.f63930h = z7Var;
        this.f63931i = cardView2;
        this.f63932j = searchView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = u70.C28606b.f72567A0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h80.C24899f m79577a(android.view.View r10) {
        /*
            int r0 = u70.C28606b.empty_hint
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r4 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r4
            if (r4 == 0) goto L_0x004d
            int r0 = u70.C28606b.f72609u0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            if (r5 == 0) goto L_0x004d
            int r0 = u70.C28606b.f72613x0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x004d
            int r0 = u70.C28606b.f72567A0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004d
            p90.z7 r7 = p90.C27486z7.m85250a(r1)
            int r0 = u70.C28606b.f72569B0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            androidx.cardview.widget.CardView r8 = (androidx.cardview.widget.CardView) r8
            if (r8 == 0) goto L_0x004d
            int r0 = u70.C28606b.f72575G0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            ge.bog.designsystem.components.search.SearchView r9 = (p341ge.bog.designsystem.components.search.SearchView) r9
            if (r9 == 0) goto L_0x004d
            h80.f r0 = new h80.f
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004d:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h80.C24899f.m79577a(android.view.View):h80.f");
    }

    /* renamed from: d */
    public static C24899f m79578d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.action_sheet_job_position, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79577a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f63926d;
    }
}

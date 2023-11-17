package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p480jl.C16214e;
import p90.C27272c8;

/* renamed from: nl.h */
public final class C17055h implements C6201a {

    /* renamed from: d */
    private final LinearLayout f47624d;

    /* renamed from: e */
    public final Button f47625e;

    /* renamed from: f */
    public final DynamicThumbnailCardView f47626f;

    /* renamed from: g */
    public final StateView f47627g;

    /* renamed from: h */
    public final RecyclerView f47628h;

    /* renamed from: i */
    public final LoadingView f47629i;

    /* renamed from: j */
    public final SearchView f47630j;

    /* renamed from: k */
    public final PageDescriptionView f47631k;

    /* renamed from: l */
    public final C27272c8 f47632l;

    private C17055h(LinearLayout linearLayout, Button button, DynamicThumbnailCardView dynamicThumbnailCardView, StateView stateView, RecyclerView recyclerView, LoadingView loadingView, SearchView searchView, PageDescriptionView pageDescriptionView, C27272c8 c8Var) {
        this.f47624d = linearLayout;
        this.f47625e = button;
        this.f47626f = dynamicThumbnailCardView;
        this.f47627g = stateView;
        this.f47628h = recyclerView;
        this.f47629i = loadingView;
        this.f47630j = searchView;
        this.f47631k = pageDescriptionView;
        this.f47632l = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = p480jl.C16213d.f45723D0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p536nl.C17055h m59924a(android.view.View r12) {
        /*
            int r0 = p480jl.C16213d.f45745l
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45720B
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView r5 = (p341ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView) r5
            if (r5 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45736U
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r6 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r6
            if (r6 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45743j0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45744k0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            ge.bog.designsystem.components.loading.LoadingView r8 = (p341ge.bog.designsystem.components.loading.LoadingView) r8
            if (r8 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45753q0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            ge.bog.designsystem.components.search.SearchView r9 = (p341ge.bog.designsystem.components.search.SearchView) r9
            if (r9 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.search_failed
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r10 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r10
            if (r10 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45723D0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0063
            p90.c8 r11 = p90.C27272c8.m84388a(r1)
            nl.h r0 = new nl.h
            r3 = r12
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0063:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p536nl.C17055h.m59924a(android.view.View):nl.h");
    }

    /* renamed from: d */
    public static C17055h m59925d(LayoutInflater layoutInflater) {
        return m59926e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17055h m59926e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.activity_bnpl_offers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59924a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f47624d;
    }
}

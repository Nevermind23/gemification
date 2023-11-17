package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p90.C27272c8;
import p90.C27486z7;
import sn0.C17902f;

/* renamed from: xn0.e */
public final class C18847e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f52703d;

    /* renamed from: e */
    public final TabsView f52704e;

    /* renamed from: f */
    public final PageState f52705f;

    /* renamed from: g */
    public final LayerView f52706g;

    /* renamed from: h */
    public final LayerView f52707h;

    /* renamed from: i */
    public final RecyclerView f52708i;

    /* renamed from: j */
    public final C27486z7 f52709j;

    /* renamed from: k */
    public final CardView f52710k;

    /* renamed from: l */
    public final C27272c8 f52711l;

    /* renamed from: m */
    public final FrameLayout f52712m;

    private C18847e(ConstraintLayout constraintLayout, TabsView tabsView, PageState pageState, LayerView layerView, LayerView layerView2, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView, C27272c8 c8Var, FrameLayout frameLayout) {
        this.f52703d = constraintLayout;
        this.f52704e = tabsView;
        this.f52705f = pageState;
        this.f52706g = layerView;
        this.f52707h = layerView2;
        this.f52708i = recyclerView;
        this.f52709j = z7Var;
        this.f52710k = cardView;
        this.f52711l = c8Var;
        this.f52712m = frameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = sn0.C17901e.f50963d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r0 = sn0.C17901e.f50979n0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xn0.C18847e m63754a(android.view.View r13) {
        /*
            int r0 = sn0.C17901e.f50972j
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            ge.bog.designsystem.components.tabs.TabsView r4 = (p341ge.bog.designsystem.components.tabs.TabsView) r4
            if (r4 == 0) goto L_0x006f
            int r0 = sn0.C17901e.category_not_found_state
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            ge.bog.designsystem.components.pagestate.PageState r5 = (p341ge.bog.designsystem.components.pagestate.PageState) r5
            if (r5 == 0) goto L_0x006f
            int r0 = sn0.C17901e.f50947C
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r6 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r6
            if (r6 == 0) goto L_0x006f
            int r0 = sn0.C17901e.f50954K
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r7 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r7
            if (r7 == 0) goto L_0x006f
            int r0 = sn0.C17901e.offers_recycler_view
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            if (r8 == 0) goto L_0x006f
            int r0 = sn0.C17901e.f50963d0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            if (r1 == 0) goto L_0x006f
            p90.z7 r9 = p90.C27486z7.m85250a(r1)
            int r0 = sn0.C17901e.f50964e0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            if (r10 == 0) goto L_0x006f
            int r0 = sn0.C17901e.f50979n0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            if (r1 == 0) goto L_0x006f
            p90.c8 r11 = p90.C27272c8.m84388a(r1)
            int r0 = sn0.C17901e.f50980o0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r12 = r1
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x006f
            xn0.e r0 = new xn0.e
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006f:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xn0.C18847e.m63754a(android.view.View):xn0.e");
    }

    /* renamed from: d */
    public static C18847e m63755d(LayoutInflater layoutInflater) {
        return m63756e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C18847e m63756e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.activity_lifestyle_offers_by_category, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63754a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f52703d;
    }
}

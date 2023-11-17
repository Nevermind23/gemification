package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p90.C27272c8;
import rb0.C27986e;

/* renamed from: xb0.g */
public final class C29719g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f75040d;

    /* renamed from: e */
    public final EmptyWidget f75041e;

    /* renamed from: f */
    public final LayerView f75042f;

    /* renamed from: g */
    public final RecyclerView f75043g;

    /* renamed from: h */
    public final PageState f75044h;

    /* renamed from: i */
    public final Button f75045i;

    /* renamed from: j */
    public final C27272c8 f75046j;

    private C29719g(ConstraintLayout constraintLayout, EmptyWidget emptyWidget, LayerView layerView, RecyclerView recyclerView, PageState pageState, Button button, C27272c8 c8Var) {
        this.f75040d = constraintLayout;
        this.f75041e = emptyWidget;
        this.f75042f = layerView;
        this.f75043g = recyclerView;
        this.f75044h = pageState;
        this.f75045i = button;
        this.f75046j = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = rb0.C27985d.f71292r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xb0.C29719g m90240a(android.view.View r10) {
        /*
            int r0 = rb0.C27985d.break_details_header
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r4 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r4
            if (r4 == 0) goto L_0x004d
            int r0 = rb0.C27985d.description_container
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r5
            if (r5 == 0) goto L_0x004d
            int r0 = rb0.C27985d.details_items
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x004d
            int r0 = rb0.C27985d.f71259F0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            ge.bog.designsystem.components.pagestate.PageState r7 = (p341ge.bog.designsystem.components.pagestate.PageState) r7
            if (r7 == 0) goto L_0x004d
            int r0 = rb0.C27985d.return_button
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            ge.bog.designsystem.components.buttons.Button r8 = (p341ge.bog.designsystem.components.buttons.Button) r8
            if (r8 == 0) goto L_0x004d
            int r0 = rb0.C27985d.f71292r1
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004d
            p90.c8 r9 = p90.C27272c8.m84388a(r1)
            xb0.g r0 = new xb0.g
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
        throw new UnsupportedOperationException("Method not decompiled: xb0.C29719g.m90240a(android.view.View):xb0.g");
    }

    /* renamed from: d */
    public static C29719g m90241d(LayoutInflater layoutInflater) {
        return m90242e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C29719g m90242e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.activity_break_deposit_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90240a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f75040d;
    }
}

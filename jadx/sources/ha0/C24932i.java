package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import da0.C19952f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p90.C27272c8;

/* renamed from: ha0.i */
public final class C24932i implements C6201a {

    /* renamed from: d */
    private final CoordinatorLayout f64136d;

    /* renamed from: e */
    public final LayerView f64137e;

    /* renamed from: f */
    public final RecyclerView f64138f;

    /* renamed from: g */
    public final EmptyWidget f64139g;

    /* renamed from: h */
    public final Button f64140h;

    /* renamed from: i */
    public final PageState f64141i;

    /* renamed from: j */
    public final LinearLayout f64142j;

    /* renamed from: k */
    public final C27272c8 f64143k;

    private C24932i(CoordinatorLayout coordinatorLayout, LayerView layerView, RecyclerView recyclerView, EmptyWidget emptyWidget, Button button, PageState pageState, LinearLayout linearLayout, C27272c8 c8Var) {
        this.f64136d = coordinatorLayout;
        this.f64137e = layerView;
        this.f64138f = recyclerView;
        this.f64139g = emptyWidget;
        this.f64140h = button;
        this.f64141i = pageState;
        this.f64142j = linearLayout;
        this.f64143k = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = da0.C19951e.f54510G0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ha0.C24932i m79709a(android.view.View r11) {
        /*
            int r0 = da0.C19951e.f54507F
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r4 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r4
            if (r4 == 0) goto L_0x0058
            int r0 = da0.C19951e.f54509G
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0058
            int r0 = da0.C19951e.f54511H
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r6 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r6
            if (r6 == 0) goto L_0x0058
            int r0 = da0.C19951e.f54528i0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x0058
            int r0 = da0.C19951e.f54532l0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            ge.bog.designsystem.components.pagestate.PageState r8 = (p341ge.bog.designsystem.components.pagestate.PageState) r8
            if (r8 == 0) goto L_0x0058
            int r0 = da0.C19951e.f54542y0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L_0x0058
            int r0 = da0.C19951e.f54510G0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0058
            p90.c8 r10 = p90.C27272c8.m84388a(r1)
            ha0.i r0 = new ha0.i
            r3 = r11
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0058:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C24932i.m79709a(android.view.View):ha0.i");
    }

    /* renamed from: d */
    public static C24932i m79710d(LayoutInflater layoutInflater) {
        return m79711e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C24932i m79711e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.activity_deposit_application_result_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79709a(inflate);
    }

    /* renamed from: c */
    public CoordinatorLayout mo3946b() {
        return this.f64136d;
    }
}

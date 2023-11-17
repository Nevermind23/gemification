package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10217v;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;

/* renamed from: ua1.b */
public final class C28627b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72654d;

    /* renamed from: e */
    public final LayerView f72655e;

    /* renamed from: f */
    public final RecyclerView f72656f;

    /* renamed from: g */
    public final C28686u1 f72657g;

    /* renamed from: h */
    public final ToolbarView f72658h;

    private C28627b(LinearLayout linearLayout, LayerView layerView, RecyclerView recyclerView, C28686u1 u1Var, ToolbarView toolbarView) {
        this.f72654d = linearLayout;
        this.f72655e = layerView;
        this.f72656f = recyclerView;
        this.f72657g = u1Var;
        this.f72658h = toolbarView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = ba1.C10216u.sign_in_bottom_layout;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ua1.C28627b m87603a(android.view.View r8) {
        /*
            int r0 = ba1.C10216u.f28294D
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r4 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = ba1.C10216u.f28332j2
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0037
            int r0 = ba1.C10216u.sign_in_bottom_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            ua1.u1 r6 = ua1.C28686u1.m87861a(r1)
            int r0 = ba1.C10216u.f28327g3
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            ge.bog.designsystem.components.toolbar.ToolbarView r7 = (p341ge.bog.designsystem.components.toolbar.ToolbarView) r7
            if (r7 == 0) goto L_0x0037
            ua1.b r0 = new ua1.b
            r3 = r8
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: ua1.C28627b.m87603a(android.view.View):ua1.b");
    }

    /* renamed from: d */
    public static C28627b m87604d(LayoutInflater layoutInflater) {
        return m87605e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28627b m87605e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.activity_choose_company, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87603a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72654d;
    }
}

package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.j */
public final class C27333j implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69003d;

    /* renamed from: e */
    public final BogButton f69004e;

    /* renamed from: f */
    public final LinearLayout f69005f;

    /* renamed from: g */
    public final BogTextView f69006g;

    /* renamed from: h */
    public final RecyclerView f69007h;

    /* renamed from: i */
    public final FrameLayout f69008i;

    /* renamed from: j */
    public final C27341j7 f69009j;

    /* renamed from: k */
    public final C27272c8 f69010k;

    private C27333j(FrameLayout frameLayout, BogButton bogButton, LinearLayout linearLayout, BogTextView bogTextView, RecyclerView recyclerView, FrameLayout frameLayout2, C27341j7 j7Var, C27272c8 c8Var) {
        this.f69003d = frameLayout;
        this.f69004e = bogButton;
        this.f69005f = linearLayout;
        this.f69006g = bogTextView;
        this.f69007h = recyclerView;
        this.f69008i = frameLayout2;
        this.f69009j = j7Var;
        this.f69010k = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = p366bk.C10322k.template_loading_view;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27333j m84640a(android.view.View r11) {
        /*
            int r0 = p366bk.C10322k.add_template_add_button
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.BogButton r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogButton) r4
            if (r4 == 0) goto L_0x0059
            int r0 = p366bk.C10322k.add_template_create_button
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0059
            int r0 = p366bk.C10322k.add_template_mark_all_button
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r6
            if (r6 == 0) goto L_0x0059
            int r0 = p366bk.C10322k.add_template_recycler_view
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x0059
            int r0 = p366bk.C10322k.template_add_container
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x0059
            int r0 = p366bk.C10322k.template_loading_view
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0059
            p90.j7 r9 = p90.C27341j7.m84673a(r1)
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0059
            p90.c8 r10 = p90.C27272c8.m84388a(r1)
            p90.j r0 = new p90.j
            r3 = r11
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0059:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27333j.m84640a(android.view.View):p90.j");
    }

    /* renamed from: d */
    public static C27333j m84641d(LayoutInflater layoutInflater) {
        return m84642e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27333j m84642e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_add_template, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84640a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69003d;
    }
}

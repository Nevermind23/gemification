package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p366bk.C10324m;

/* renamed from: p90.m */
public final class C27361m implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69258d;

    /* renamed from: e */
    public final RecyclerView f69259e;

    /* renamed from: f */
    public final BigDividerView f69260f;

    /* renamed from: g */
    public final C27272c8 f69261g;

    private C27361m(LinearLayout linearLayout, RecyclerView recyclerView, BigDividerView bigDividerView, C27272c8 c8Var) {
        this.f69258d = linearLayout;
        this.f69259e = recyclerView;
        this.f69260f = bigDividerView;
        this.f69261g = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27361m m84753a(android.view.View r4) {
        /*
            int r0 = p366bk.C10322k.applications
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L_0x0028
            int r0 = p366bk.C10322k.bigDivider1
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            ge.bog.mobilebank.ui.views.widgets.BigDividerView r2 = (p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView) r2
            if (r2 == 0) goto L_0x0028
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r0)
            if (r3 == 0) goto L_0x0028
            p90.c8 r0 = p90.C27272c8.m84388a(r3)
            p90.m r3 = new p90.m
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.<init>(r4, r1, r2, r0)
            return r3
        L_0x0028:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27361m.m84753a(android.view.View):p90.m");
    }

    /* renamed from: d */
    public static C27361m m84754d(LayoutInflater layoutInflater) {
        return m84755e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27361m m84755e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_applications_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84753a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69258d;
    }
}

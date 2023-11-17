package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p366bk.C10324m;

/* renamed from: p90.d2 */
public final class C27276d2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68513d;

    /* renamed from: e */
    public final RelativeLayout f68514e;

    /* renamed from: f */
    public final View f68515f;

    /* renamed from: g */
    public final BogProgressBar f68516g;

    /* renamed from: h */
    public final RecyclerView f68517h;

    /* renamed from: i */
    public final LinearLayout f68518i;

    /* renamed from: j */
    public final SwipeRefreshLayout f68519j;

    /* renamed from: k */
    public final C27272c8 f68520k;

    /* renamed from: l */
    public final C27477y7 f68521l;

    private C27276d2(LinearLayout linearLayout, RelativeLayout relativeLayout, View view, BogProgressBar bogProgressBar, RecyclerView recyclerView, LinearLayout linearLayout2, SwipeRefreshLayout swipeRefreshLayout, C27272c8 c8Var, C27477y7 y7Var) {
        this.f68513d = linearLayout;
        this.f68514e = relativeLayout;
        this.f68515f = view;
        this.f68516g = bogProgressBar;
        this.f68517h = recyclerView;
        this.f68518i = linearLayout2;
        this.f68519j = swipeRefreshLayout;
        this.f68520k = c8Var;
        this.f68521l = y7Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = p366bk.C10322k.focusable_view;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27276d2 m84403a(android.view.View r12) {
        /*
            int r0 = p366bk.C10322k.f28883q9
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            if (r4 == 0) goto L_0x0057
            int r0 = p366bk.C10322k.focusable_view
            android.view.View r5 = p086g1.C6202b.m24689a(r12, r0)
            if (r5 == 0) goto L_0x0057
            int r0 = p366bk.C10322k.f28719Dq
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            ge.bog.mobilebank.ui.components.BogProgressBar r6 = (p341ge.bog.mobilebank.p975ui.components.BogProgressBar) r6
            if (r6 == 0) goto L_0x0057
            int r0 = p366bk.C10322k.f28712Br
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x0057
            r8 = r12
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            int r0 = p366bk.C10322k.f28739Gw
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r9 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r9
            if (r9 == 0) goto L_0x0057
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0057
            p90.c8 r10 = p90.C27272c8.m84388a(r1)
            int r0 = p366bk.C10322k.total_payment_wrapper
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0057
            p90.y7 r11 = p90.C27477y7.m85215a(r1)
            p90.d2 r12 = new p90.d2
            r2 = r12
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        L_0x0057:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27276d2.m84403a(android.view.View):p90.d2");
    }

    /* renamed from: d */
    public static C27276d2 m84404d(LayoutInflater layoutInflater) {
        return m84405e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27276d2 m84405e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_template_basket_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84403a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68513d;
    }
}

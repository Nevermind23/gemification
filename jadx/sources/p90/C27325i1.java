package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.i1 */
public final class C27325i1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68940d;

    /* renamed from: e */
    public final C27364m2 f68941e;

    /* renamed from: f */
    public final BogImageView f68942f;

    /* renamed from: g */
    public final BogTextView f68943g;

    /* renamed from: h */
    public final RecyclerView f68944h;

    /* renamed from: i */
    public final C27272c8 f68945i;

    private C27325i1(LinearLayout linearLayout, C27364m2 m2Var, BogImageView bogImageView, BogTextView bogTextView, RecyclerView recyclerView, C27272c8 c8Var) {
        this.f68940d = linearLayout;
        this.f68941e = m2Var;
        this.f68942f = bogImageView;
        this.f68943g = bogTextView;
        this.f68944h = recyclerView;
        this.f68945i = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27325i1 m84606a(android.view.View r9) {
        /*
            int r0 = p366bk.C10322k.f28784Qe
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0043
            p90.m2 r4 = p90.C27364m2.m84766a(r1)
            int r0 = p366bk.C10322k.payment_status_iv
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.BogImageView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView) r5
            if (r5 == 0) goto L_0x0043
            int r0 = p366bk.C10322k.payment_status_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r6
            if (r6 == 0) goto L_0x0043
            int r0 = p366bk.C10322k.success_payments_rv
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x0043
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0043
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            p90.i1 r0 = new p90.i1
            r3 = r9
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0043:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27325i1.m84606a(android.view.View):p90.i1");
    }

    /* renamed from: d */
    public static C27325i1 m84607d(LayoutInflater layoutInflater) {
        return m84608e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27325i1 m84608e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_payment_result_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84606a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68940d;
    }
}

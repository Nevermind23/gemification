package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: iy0.r1 */
public final class C36631r1 implements C6201a {

    /* renamed from: d */
    private final ListItem f88408d;

    /* renamed from: e */
    public final TextView f88409e;

    /* renamed from: f */
    public final View f88410f;

    /* renamed from: g */
    public final ImageView f88411g;

    /* renamed from: h */
    public final TextView f88412h;

    private C36631r1(ListItem listItem, TextView textView, View view, ImageView imageView, TextView textView2) {
        this.f88408d = listItem;
        this.f88409e = textView;
        this.f88410f = view;
        this.f88411g = imageView;
        this.f88412h = textView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = hy0.C36271e.f87516f0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36631r1 m108659a(android.view.View r8) {
        /*
            int r0 = hy0.C36271e.f87527k
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0033
            int r0 = hy0.C36271e.f87516f0
            android.view.View r5 = p086g1.C6202b.m24689a(r8, r0)
            if (r5 == 0) goto L_0x0033
            int r0 = hy0.C36271e.f87489H0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0033
            int r0 = hy0.C36271e.f87542r2
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0033
            iy0.r1 r0 = new iy0.r1
            r3 = r8
            ge.bog.designsystem.components.list.ListItem r3 = (p341ge.bog.designsystem.components.list.ListItem) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0033:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36631r1.m108659a(android.view.View):iy0.r1");
    }

    /* renamed from: d */
    public static C36631r1 m108660d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_loan_overdue_liability, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108659a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f88408d;
    }
}

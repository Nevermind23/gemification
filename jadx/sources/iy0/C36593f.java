package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: iy0.f */
public final class C36593f implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88182d;

    /* renamed from: e */
    public final LinearLayout f88183e;

    /* renamed from: f */
    public final View f88184f;

    /* renamed from: g */
    public final View f88185g;

    /* renamed from: h */
    public final ListItem f88186h;

    /* renamed from: i */
    public final ListItem f88187i;

    /* renamed from: j */
    public final SingleLineTextItem f88188j;

    /* renamed from: k */
    public final SingleLineTextItem f88189k;

    /* renamed from: l */
    public final ListItem f88190l;

    /* renamed from: m */
    public final SingleLineTextItem f88191m;

    private C36593f(LinearLayout linearLayout, LinearLayout linearLayout2, View view, View view2, ListItem listItem, ListItem listItem2, SingleLineTextItem singleLineTextItem, SingleLineTextItem singleLineTextItem2, ListItem listItem3, SingleLineTextItem singleLineTextItem3) {
        this.f88182d = linearLayout;
        this.f88183e = linearLayout2;
        this.f88184f = view;
        this.f88185g = view2;
        this.f88186h = listItem;
        this.f88187i = listItem2;
        this.f88188j = singleLineTextItem;
        this.f88189k = singleLineTextItem2;
        this.f88190l = listItem3;
        this.f88191m = singleLineTextItem3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = hy0.C36271e.f87519h0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36593f m108498a(android.view.View r11) {
        /*
            r2 = r11
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r0 = hy0.C36271e.f87516f0
            android.view.View r3 = p086g1.C6202b.m24689a(r11, r0)
            if (r3 == 0) goto L_0x005d
            int r0 = hy0.C36271e.f87519h0
            android.view.View r4 = p086g1.C6202b.m24689a(r11, r0)
            if (r4 == 0) goto L_0x005d
            int r0 = hy0.C36271e.full_payment
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            ge.bog.designsystem.components.list.ListItem r5 = (p341ge.bog.designsystem.components.list.ListItem) r5
            if (r5 == 0) goto L_0x005d
            int r0 = hy0.C36271e.full_payment_due
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            ge.bog.designsystem.components.list.ListItem r6 = (p341ge.bog.designsystem.components.list.ListItem) r6
            if (r6 == 0) goto L_0x005d
            int r0 = hy0.C36271e.full_payment_due_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            ge.bog.designsystem.components.list.SingleLineTextItem r7 = (p341ge.bog.designsystem.components.list.SingleLineTextItem) r7
            if (r7 == 0) goto L_0x005d
            int r0 = hy0.C36271e.full_payment_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            ge.bog.designsystem.components.list.SingleLineTextItem r8 = (p341ge.bog.designsystem.components.list.SingleLineTextItem) r8
            if (r8 == 0) goto L_0x005d
            int r0 = hy0.C36271e.minimum_payment
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            ge.bog.designsystem.components.list.ListItem r9 = (p341ge.bog.designsystem.components.list.ListItem) r9
            if (r9 == 0) goto L_0x005d
            int r0 = hy0.C36271e.minimum_payment_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            ge.bog.designsystem.components.list.SingleLineTextItem r10 = (p341ge.bog.designsystem.components.list.SingleLineTextItem) r10
            if (r10 == 0) goto L_0x005d
            iy0.f r11 = new iy0.f
            r0 = r11
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L_0x005d:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36593f.m108498a(android.view.View):iy0.f");
    }

    /* renamed from: d */
    public static C36593f m108499d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.action_sheet_fill_credit_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108498a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88182d;
    }
}

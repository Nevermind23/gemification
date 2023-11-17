package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.StatusListItem;

/* renamed from: iy0.q */
public final class C36626q implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88378d;

    /* renamed from: e */
    public final Button f88379e;

    /* renamed from: f */
    public final TextView f88380f;

    /* renamed from: g */
    public final View f88381g;

    /* renamed from: h */
    public final View f88382h;

    /* renamed from: i */
    public final StatusListItem f88383i;

    /* renamed from: j */
    public final StatusListItem f88384j;

    /* renamed from: k */
    public final ListItem f88385k;

    /* renamed from: l */
    public final ListItem f88386l;

    /* renamed from: m */
    public final ListItem f88387m;

    private C36626q(ConstraintLayout constraintLayout, Button button, TextView textView, View view, View view2, StatusListItem statusListItem, StatusListItem statusListItem2, ListItem listItem, ListItem listItem2, ListItem listItem3) {
        this.f88378d = constraintLayout;
        this.f88379e = button;
        this.f88380f = textView;
        this.f88381g = view;
        this.f88382h = view2;
        this.f88383i = statusListItem;
        this.f88384j = statusListItem2;
        this.f88385k = listItem;
        this.f88386l = listItem2;
        this.f88387m = listItem3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = hy0.C36271e.divider1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = hy0.C36271e.f87519h0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36626q m108639a(android.view.View r13) {
        /*
            int r0 = hy0.C36271e.default_button
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0067
            int r0 = hy0.C36271e.default_text
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0067
            int r0 = hy0.C36271e.divider1
            android.view.View r6 = p086g1.C6202b.m24689a(r13, r0)
            if (r6 == 0) goto L_0x0067
            int r0 = hy0.C36271e.f87519h0
            android.view.View r7 = p086g1.C6202b.m24689a(r13, r0)
            if (r7 == 0) goto L_0x0067
            int r0 = hy0.C36271e.favorite_status
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            ge.bog.designsystem.components.list.StatusListItem r8 = (p341ge.bog.designsystem.components.list.StatusListItem) r8
            if (r8 == 0) goto L_0x0067
            int r0 = hy0.C36271e.hide_status
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            ge.bog.designsystem.components.list.StatusListItem r9 = (p341ge.bog.designsystem.components.list.StatusListItem) r9
            if (r9 == 0) goto L_0x0067
            int r0 = hy0.C36271e.item_favorite
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            ge.bog.designsystem.components.list.ListItem r10 = (p341ge.bog.designsystem.components.list.ListItem) r10
            if (r10 == 0) goto L_0x0067
            int r0 = hy0.C36271e.item_hide
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r11 = r1
            ge.bog.designsystem.components.list.ListItem r11 = (p341ge.bog.designsystem.components.list.ListItem) r11
            if (r11 == 0) goto L_0x0067
            int r0 = hy0.C36271e.item_rename
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r12 = r1
            ge.bog.designsystem.components.list.ListItem r12 = (p341ge.bog.designsystem.components.list.ListItem) r12
            if (r12 == 0) goto L_0x0067
            iy0.q r0 = new iy0.q
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0067:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36626q.m108639a(android.view.View):iy0.q");
    }

    /* renamed from: d */
    public static C36626q m108640d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.fragment_additional_functions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108639a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88378d;
    }
}

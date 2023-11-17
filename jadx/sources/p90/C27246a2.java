package p90;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;

/* renamed from: p90.a2 */
public final class C27246a2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68286d;

    /* renamed from: e */
    public final ImageView f68287e;

    /* renamed from: f */
    public final EmptyWidget f68288f;

    /* renamed from: g */
    public final ListItem f68289g;

    /* renamed from: h */
    public final LinearLayout f68290h;

    /* renamed from: i */
    public final ListItem f68291i;

    /* renamed from: j */
    public final ListItem f68292j;

    /* renamed from: k */
    public final View f68293k;

    /* renamed from: l */
    public final C27272c8 f68294l;

    /* renamed from: m */
    public final TwoLineReverseTextItem f68295m;

    /* renamed from: n */
    public final TwoLineReverseTextItem f68296n;

    /* renamed from: o */
    public final TwoLineReverseTextItem f68297o;

    private C27246a2(LinearLayout linearLayout, ImageView imageView, EmptyWidget emptyWidget, ListItem listItem, LinearLayout linearLayout2, ListItem listItem2, ListItem listItem3, View view, C27272c8 c8Var, TwoLineReverseTextItem twoLineReverseTextItem, TwoLineReverseTextItem twoLineReverseTextItem2, TwoLineReverseTextItem twoLineReverseTextItem3) {
        this.f68286d = linearLayout;
        this.f68287e = imageView;
        this.f68288f = emptyWidget;
        this.f68289g = listItem;
        this.f68290h = linearLayout2;
        this.f68291i = listItem2;
        this.f68292j = listItem3;
        this.f68293k = view;
        this.f68294l = c8Var;
        this.f68295m = twoLineReverseTextItem;
        this.f68296n = twoLineReverseTextItem2;
        this.f68297o = twoLineReverseTextItem3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        r0 = p366bk.C10322k.separator_split_money;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27246a2 m84288a(android.view.View r15) {
        /*
            int r0 = p366bk.C10322k.badge_new
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x0077
            int r0 = p366bk.C10322k.empty_widget_select_request_type
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r5 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r5 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r5
            if (r5 == 0) goto L_0x0077
            int r0 = p366bk.C10322k.select_bill_split_method
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r6 = r1
            ge.bog.designsystem.components.list.ListItem r6 = (p341ge.bog.designsystem.components.list.ListItem) r6
            if (r6 == 0) goto L_0x0077
            r7 = r15
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            int r0 = p366bk.C10322k.select_money_request_method
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r8 = r1
            ge.bog.designsystem.components.list.ListItem r8 = (p341ge.bog.designsystem.components.list.ListItem) r8
            if (r8 == 0) goto L_0x0077
            int r0 = p366bk.C10322k.select_p2p_link_sharing
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r9 = r1
            ge.bog.designsystem.components.list.ListItem r9 = (p341ge.bog.designsystem.components.list.ListItem) r9
            if (r9 == 0) goto L_0x0077
            int r0 = p366bk.C10322k.separator_split_money
            android.view.View r10 = p086g1.C6202b.m24689a(r15, r0)
            if (r10 == 0) goto L_0x0077
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0077
            p90.c8 r11 = p90.C27272c8.m84388a(r1)
            int r0 = p366bk.C10322k.two_line_text_concrete_request_money
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r12 = r1
            ge.bog.designsystem.components.list.TwoLineReverseTextItem r12 = (p341ge.bog.designsystem.components.list.TwoLineReverseTextItem) r12
            if (r12 == 0) goto L_0x0077
            int r0 = p366bk.C10322k.two_line_text_link_request
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r13 = r1
            ge.bog.designsystem.components.list.TwoLineReverseTextItem r13 = (p341ge.bog.designsystem.components.list.TwoLineReverseTextItem) r13
            if (r13 == 0) goto L_0x0077
            int r0 = p366bk.C10322k.two_line_text_splitting_money
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r14 = r1
            ge.bog.designsystem.components.list.TwoLineReverseTextItem r14 = (p341ge.bog.designsystem.components.list.TwoLineReverseTextItem) r14
            if (r14 == 0) goto L_0x0077
            p90.a2 r15 = new p90.a2
            r2 = r15
            r3 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
        L_0x0077:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27246a2.m84288a(android.view.View):p90.a2");
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68286d;
    }
}

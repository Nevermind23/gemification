package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;

/* renamed from: pr0.t */
public final class C37969t implements C6201a {

    /* renamed from: d */
    private final LayerView f91258d;

    /* renamed from: e */
    public final ListItem f91259e;

    /* renamed from: f */
    public final View f91260f;

    /* renamed from: g */
    public final TwoLineReverseTextItem f91261g;

    /* renamed from: h */
    public final ImageView f91262h;

    /* renamed from: i */
    public final TextView f91263i;

    /* renamed from: j */
    public final TextView f91264j;

    private C37969t(LayerView layerView, ListItem listItem, View view, TwoLineReverseTextItem twoLineReverseTextItem, ImageView imageView, TextView textView, TextView textView2) {
        this.f91258d = layerView;
        this.f91259e = listItem;
        this.f91260f = view;
        this.f91261g = twoLineReverseTextItem;
        this.f91262h = imageView;
        this.f91263i = textView;
        this.f91264j = textView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = lr0.C37130e.loan_divider_view;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static pr0.C37969t m111621a(android.view.View r10) {
        /*
            int r0 = lr0.C37130e.list_item_header_container
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.list.ListItem r4 = (p341ge.bog.designsystem.components.list.ListItem) r4
            if (r4 == 0) goto L_0x0049
            int r0 = lr0.C37130e.loan_divider_view
            android.view.View r5 = p086g1.C6202b.m24689a(r10, r0)
            if (r5 == 0) goto L_0x0049
            int r0 = lr0.C37130e.loan_header_text
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            ge.bog.designsystem.components.list.TwoLineReverseTextItem r6 = (p341ge.bog.designsystem.components.list.TwoLineReverseTextItem) r6
            if (r6 == 0) goto L_0x0049
            int r0 = lr0.C37130e.loan_start_icon_image
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x0049
            int r0 = lr0.C37130e.loans_details_amount_text
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0049
            int r0 = lr0.C37130e.loans_details_text
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0049
            pr0.t r0 = new pr0.t
            r3 = r10
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0049:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.C37969t.m111621a(android.view.View):pr0.t");
    }

    /* renamed from: d */
    public static C37969t m111622d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_pln_history_first, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111621a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91258d;
    }
}

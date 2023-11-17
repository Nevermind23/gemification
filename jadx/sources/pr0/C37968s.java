package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: pr0.s */
public final class C37968s implements C6201a {

    /* renamed from: d */
    private final LayerView f91252d;

    /* renamed from: e */
    public final ListItem f91253e;

    /* renamed from: f */
    public final View f91254f;

    /* renamed from: g */
    public final TextView f91255g;

    /* renamed from: h */
    public final TextView f91256h;

    /* renamed from: i */
    public final TextView f91257i;

    private C37968s(LayerView layerView, ListItem listItem, View view, TextView textView, TextView textView2, TextView textView3) {
        this.f91252d = layerView;
        this.f91253e = listItem;
        this.f91254f = view;
        this.f91255g = textView;
        this.f91256h = textView2;
        this.f91257i = textView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = lr0.C37130e.loan_divider;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static pr0.C37968s m111617a(android.view.View r9) {
        /*
            int r0 = lr0.C37130e.list_item_container_header
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.designsystem.components.list.ListItem r4 = (p341ge.bog.designsystem.components.list.ListItem) r4
            if (r4 == 0) goto L_0x003e
            int r0 = lr0.C37130e.loan_divider
            android.view.View r5 = p086g1.C6202b.m24689a(r9, r0)
            if (r5 == 0) goto L_0x003e
            int r0 = lr0.C37130e.loans_details_amount_text
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x003e
            int r0 = lr0.C37130e.loans_details_date_text
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x003e
            int r0 = lr0.C37130e.loans_details_text
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x003e
            pr0.s r0 = new pr0.s
            r3 = r9
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x003e:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.C37968s.m111617a(android.view.View):pr0.s");
    }

    /* renamed from: d */
    public static C37968s m111618d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_pln_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111617a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91252d;
    }
}

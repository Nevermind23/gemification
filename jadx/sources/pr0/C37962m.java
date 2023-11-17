package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: pr0.m */
public final class C37962m implements C6201a {

    /* renamed from: d */
    private final LayerView f91227d;

    /* renamed from: e */
    public final ListItem f91228e;

    /* renamed from: f */
    public final View f91229f;

    /* renamed from: g */
    public final AppCompatImageView f91230g;

    /* renamed from: h */
    public final TextView f91231h;

    /* renamed from: i */
    public final TextView f91232i;

    /* renamed from: j */
    public final RecyclerView f91233j;

    private C37962m(LayerView layerView, ListItem listItem, View view, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, RecyclerView recyclerView) {
        this.f91227d = layerView;
        this.f91228e = listItem;
        this.f91229f = view;
        this.f91230g = appCompatImageView;
        this.f91231h = textView;
        this.f91232i = textView2;
        this.f91233j = recyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = lr0.C37130e.loan_divider;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static pr0.C37962m m111593a(android.view.View r10) {
        /*
            int r0 = lr0.C37130e.list_item_container_header
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.list.ListItem r4 = (p341ge.bog.designsystem.components.list.ListItem) r4
            if (r4 == 0) goto L_0x0049
            int r0 = lr0.C37130e.loan_divider
            android.view.View r5 = p086g1.C6202b.m24689a(r10, r0)
            if (r5 == 0) goto L_0x0049
            int r0 = lr0.C37130e.loan_end_icon_image
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            if (r6 == 0) goto L_0x0049
            int r0 = lr0.C37130e.loans_details_amount_text
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0049
            int r0 = lr0.C37130e.loans_details_date_text
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0049
            int r0 = lr0.C37130e.loans_left_items_recycler_view
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            if (r9 == 0) goto L_0x0049
            pr0.m r0 = new pr0.m
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
        throw new UnsupportedOperationException("Method not decompiled: pr0.C37962m.m111593a(android.view.View):pr0.m");
    }

    /* renamed from: d */
    public static C37962m m111594d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_history_schedule, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111593a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91227d;
    }
}

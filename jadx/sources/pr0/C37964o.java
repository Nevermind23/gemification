package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;

/* renamed from: pr0.o */
public final class C37964o implements C6201a {

    /* renamed from: d */
    private final LayerView f91236d;

    /* renamed from: e */
    public final RecyclerView f91237e;

    /* renamed from: f */
    public final ListItem f91238f;

    /* renamed from: g */
    public final View f91239g;

    /* renamed from: h */
    public final AppCompatImageView f91240h;

    /* renamed from: i */
    public final TwoLineReverseTextItem f91241i;

    /* renamed from: j */
    public final ImageView f91242j;

    /* renamed from: k */
    public final TextView f91243k;

    private C37964o(LayerView layerView, RecyclerView recyclerView, ListItem listItem, View view, AppCompatImageView appCompatImageView, TwoLineReverseTextItem twoLineReverseTextItem, ImageView imageView, TextView textView) {
        this.f91236d = layerView;
        this.f91237e = recyclerView;
        this.f91238f = listItem;
        this.f91239g = view;
        this.f91240h = appCompatImageView;
        this.f91241i = twoLineReverseTextItem;
        this.f91242j = imageView;
        this.f91243k = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = lr0.C37130e.loan_divider_view;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static pr0.C37964o m111601a(android.view.View r11) {
        /*
            int r0 = lr0.C37130e.first_item_details_recycler_view
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            if (r4 == 0) goto L_0x0054
            int r0 = lr0.C37130e.list_item_header_container
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            ge.bog.designsystem.components.list.ListItem r5 = (p341ge.bog.designsystem.components.list.ListItem) r5
            if (r5 == 0) goto L_0x0054
            int r0 = lr0.C37130e.loan_divider_view
            android.view.View r6 = p086g1.C6202b.m24689a(r11, r0)
            if (r6 == 0) goto L_0x0054
            int r0 = lr0.C37130e.loan_end_icon_image
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            if (r7 == 0) goto L_0x0054
            int r0 = lr0.C37130e.loan_header_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            ge.bog.designsystem.components.list.TwoLineReverseTextItem r8 = (p341ge.bog.designsystem.components.list.TwoLineReverseTextItem) r8
            if (r8 == 0) goto L_0x0054
            int r0 = lr0.C37130e.loan_start_icon_image
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L_0x0054
            int r0 = lr0.C37130e.loans_details_amount_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x0054
            pr0.o r0 = new pr0.o
            r3 = r11
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0054:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.C37964o.m111601a(android.view.View):pr0.o");
    }

    /* renamed from: d */
    public static C37964o m111602d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_history_schedule_first, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111601a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91236d;
    }
}

package p90;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;

/* renamed from: p90.g7 */
public final class C27311g7 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68826d;

    /* renamed from: e */
    public final TextView f68827e;

    /* renamed from: f */
    public final ConstraintLayout f68828f;

    /* renamed from: g */
    public final RecyclerView f68829g;

    /* renamed from: h */
    public final View f68830h;

    /* renamed from: i */
    public final Group f68831i;

    /* renamed from: j */
    public final TextView f68832j;

    /* renamed from: k */
    public final TextView f68833k;

    private C27311g7(FrameLayout frameLayout, TextView textView, ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, Group group, TextView textView2, TextView textView3) {
        this.f68826d = frameLayout;
        this.f68827e = textView;
        this.f68828f = constraintLayout;
        this.f68829g = recyclerView;
        this.f68830h = view;
        this.f68831i = group;
        this.f68832j = textView2;
        this.f68833k = textView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p366bk.C10322k.f28729Eu;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27311g7 m84552a(android.view.View r11) {
        /*
            int r0 = p366bk.C10322k.add_cash_operation
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.selected_operations_list_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            if (r5 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.selected_operations_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.f28729Eu
            android.view.View r7 = p086g1.C6202b.m24689a(r11, r0)
            if (r7 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.total_amount_group
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            androidx.constraintlayout.widget.Group r8 = (androidx.constraintlayout.widget.Group) r8
            if (r8 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.total_amount_label_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.total_amount_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x0054
            p90.g7 r0 = new p90.g7
            r3 = r11
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p90.C27311g7.m84552a(android.view.View):p90.g7");
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68826d;
    }
}

package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27272c8;
import p90.C27486z7;
import sn0.C17902f;

/* renamed from: xn0.b */
public final class C18844b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f52661d;

    /* renamed from: e */
    public final TextView f52662e;

    /* renamed from: f */
    public final ListItem f52663f;

    /* renamed from: g */
    public final SingleLineTextItem f52664g;

    /* renamed from: h */
    public final LinearLayout f52665h;

    /* renamed from: i */
    public final FrameLayout f52666i;

    /* renamed from: j */
    public final PageDescriptionView f52667j;

    /* renamed from: k */
    public final FrameLayout f52668k;

    /* renamed from: l */
    public final RecyclerView f52669l;

    /* renamed from: m */
    public final C27486z7 f52670m;

    /* renamed from: n */
    public final CardView f52671n;

    /* renamed from: o */
    public final C27272c8 f52672o;

    private C18844b(ConstraintLayout constraintLayout, TextView textView, ListItem listItem, SingleLineTextItem singleLineTextItem, LinearLayout linearLayout, FrameLayout frameLayout, PageDescriptionView pageDescriptionView, FrameLayout frameLayout2, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView, C27272c8 c8Var) {
        this.f52661d = constraintLayout;
        this.f52662e = textView;
        this.f52663f = listItem;
        this.f52664g = singleLineTextItem;
        this.f52665h = linearLayout;
        this.f52666i = frameLayout;
        this.f52667j = pageDescriptionView;
        this.f52668k = frameLayout2;
        this.f52669l = recyclerView;
        this.f52670m = z7Var;
        this.f52671n = cardView;
        this.f52672o = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0 = sn0.C17901e.f50963d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        r0 = sn0.C17901e.f50979n0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xn0.C18844b m63739a(android.view.View r15) {
        /*
            int r0 = sn0.C17901e.chosen_category_count
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0085
            int r0 = sn0.C17901e.chosen_category_list_item
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r5 = r1
            ge.bog.designsystem.components.list.ListItem r5 = (p341ge.bog.designsystem.components.list.ListItem) r5
            if (r5 == 0) goto L_0x0085
            int r0 = sn0.C17901e.chosen_category_text
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r6 = r1
            ge.bog.designsystem.components.list.SingleLineTextItem r6 = (p341ge.bog.designsystem.components.list.SingleLineTextItem) r6
            if (r6 == 0) goto L_0x0085
            int r0 = sn0.C17901e.fixed_header
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r7 = r1
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x0085
            int r0 = sn0.C17901e.f50954K
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x0085
            int r0 = sn0.C17901e.max_interest_hint
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r9 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r9 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r9
            if (r9 == 0) goto L_0x0085
            int r0 = sn0.C17901e.f50959Z
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r10 = r1
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            if (r10 == 0) goto L_0x0085
            int r0 = sn0.C17901e.f50961b0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r11 = r1
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            if (r11 == 0) goto L_0x0085
            int r0 = sn0.C17901e.f50963d0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0085
            p90.z7 r12 = p90.C27486z7.m85250a(r1)
            int r0 = sn0.C17901e.f50964e0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r13 = r1
            androidx.cardview.widget.CardView r13 = (androidx.cardview.widget.CardView) r13
            if (r13 == 0) goto L_0x0085
            int r0 = sn0.C17901e.f50979n0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0085
            p90.c8 r14 = p90.C27272c8.m84388a(r1)
            xn0.b r0 = new xn0.b
            r3 = r15
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0085:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xn0.C18844b.m63739a(android.view.View):xn0.b");
    }

    /* renamed from: d */
    public static C18844b m63740d(LayoutInflater layoutInflater) {
        return m63741e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C18844b m63741e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.activity_lifestyle_chooser, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63739a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f52661d;
    }
}

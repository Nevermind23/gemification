package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.cardobjective.CardObjectiveView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p90.C27272c8;
import p90.C27486z7;
import sn0.C17902f;

/* renamed from: xn0.h */
public final class C18850h implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f52738d;

    /* renamed from: e */
    public final LoadingView f52739e;

    /* renamed from: f */
    public final TextView f52740f;

    /* renamed from: g */
    public final EmptyWidget f52741g;

    /* renamed from: h */
    public final CardObjectiveView f52742h;

    /* renamed from: i */
    public final LinearLayout f52743i;

    /* renamed from: j */
    public final LinearLayout f52744j;

    /* renamed from: k */
    public final EmptyWidget f52745k;

    /* renamed from: l */
    public final C27486z7 f52746l;

    /* renamed from: m */
    public final CardView f52747m;

    /* renamed from: n */
    public final C27272c8 f52748n;

    private C18850h(ConstraintLayout constraintLayout, LoadingView loadingView, TextView textView, EmptyWidget emptyWidget, CardObjectiveView cardObjectiveView, LinearLayout linearLayout, LinearLayout linearLayout2, EmptyWidget emptyWidget2, C27486z7 z7Var, CardView cardView, C27272c8 c8Var) {
        this.f52738d = constraintLayout;
        this.f52739e = loadingView;
        this.f52740f = textView;
        this.f52741g = emptyWidget;
        this.f52742h = cardObjectiveView;
        this.f52743i = linearLayout;
        this.f52744j = linearLayout2;
        this.f52745k = emptyWidget2;
        this.f52746l = z7Var;
        this.f52747m = cardView;
        this.f52748n = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = sn0.C17901e.f50963d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r0 = sn0.C17901e.f50979n0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xn0.C18850h m63769a(android.view.View r14) {
        /*
            int r0 = sn0.C17901e.f50969h
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.designsystem.components.loading.LoadingView r4 = (p341ge.bog.designsystem.components.loading.LoadingView) r4
            if (r4 == 0) goto L_0x007a
            int r0 = sn0.C17901e.f50983s
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x007a
            int r0 = sn0.C17901e.f50949E
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r6 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r6
            if (r6 == 0) goto L_0x007a
            int r0 = sn0.C17901e.info_card
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            ge.bog.designsystem.components.cardobjective.CardObjectiveView r7 = (p341ge.bog.designsystem.components.cardobjective.CardObjectiveView) r7
            if (r7 == 0) goto L_0x007a
            int r0 = sn0.C17901e.f50953J
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x007a
            int r0 = sn0.C17901e.merchants_container
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L_0x007a
            int r0 = sn0.C17901e.merchants_title
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r10 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r10 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r10
            if (r10 == 0) goto L_0x007a
            int r0 = sn0.C17901e.f50963d0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            if (r1 == 0) goto L_0x007a
            p90.z7 r11 = p90.C27486z7.m85250a(r1)
            int r0 = sn0.C17901e.f50964e0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r12 = r1
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            if (r12 == 0) goto L_0x007a
            int r0 = sn0.C17901e.f50979n0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            if (r1 == 0) goto L_0x007a
            p90.c8 r13 = p90.C27272c8.m84388a(r1)
            xn0.h r0 = new xn0.h
            r3 = r14
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x007a:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xn0.C18850h.m63769a(android.view.View):xn0.h");
    }

    /* renamed from: d */
    public static C18850h m63770d(LayoutInflater layoutInflater) {
        return m63771e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C18850h m63771e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.activity_lifestyle_progress_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63769a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f52738d;
    }
}

package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import np0.C37440f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;

/* renamed from: sp0.n */
public final class C38495n implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f92243d;

    /* renamed from: e */
    public final FrameLayout f92244e;

    /* renamed from: f */
    public final Button f92245f;

    /* renamed from: g */
    public final ConstraintLayout f92246g;

    /* renamed from: h */
    public final TextView f92247h;

    /* renamed from: i */
    public final TextView f92248i;

    /* renamed from: j */
    public final View f92249j;

    /* renamed from: k */
    public final View f92250k;

    /* renamed from: l */
    public final TextGroupView f92251l;

    /* renamed from: m */
    public final LayerView f92252m;

    /* renamed from: n */
    public final ConstraintLayout f92253n;

    /* renamed from: o */
    public final TextView f92254o;

    /* renamed from: p */
    public final TextView f92255p;

    /* renamed from: q */
    public final RecyclerView f92256q;

    /* renamed from: r */
    public final ConstraintLayout f92257r;

    /* renamed from: s */
    public final TextView f92258s;

    /* renamed from: t */
    public final TextView f92259t;

    private C38495n(ConstraintLayout constraintLayout, FrameLayout frameLayout, Button button, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, View view, View view2, TextGroupView textGroupView, LayerView layerView, ConstraintLayout constraintLayout3, TextView textView3, TextView textView4, RecyclerView recyclerView, ConstraintLayout constraintLayout4, TextView textView5, TextView textView6) {
        this.f92243d = constraintLayout;
        this.f92244e = frameLayout;
        this.f92245f = button;
        this.f92246g = constraintLayout2;
        this.f92247h = textView;
        this.f92248i = textView2;
        this.f92249j = view;
        this.f92250k = view2;
        this.f92251l = textGroupView;
        this.f92252m = layerView;
        this.f92253n = constraintLayout3;
        this.f92254o = textView3;
        this.f92255p = textView4;
        this.f92256q = recyclerView;
        this.f92257r = constraintLayout4;
        this.f92258s = textView5;
        this.f92259t = textView6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r1 = np0.C37439e.f89978C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r1 = np0.C37439e.f89980D;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sp0.C38495n m112994a(android.view.View r21) {
        /*
            r0 = r21
            int r1 = np0.C37439e.f90003g
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x00bb
            int r1 = np0.C37439e.f90013q
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.buttons.Button r6 = (p341ge.bog.designsystem.components.buttons.Button) r6
            if (r6 == 0) goto L_0x00bb
            int r1 = np0.C37439e.disbursement_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            if (r7 == 0) goto L_0x00bb
            int r1 = np0.C37439e.disbursement_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x00bb
            int r1 = np0.C37439e.disbursement_value
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x00bb
            int r1 = np0.C37439e.f89978C
            android.view.View r10 = p086g1.C6202b.m24689a(r0, r1)
            if (r10 == 0) goto L_0x00bb
            int r1 = np0.C37439e.f89980D
            android.view.View r11 = p086g1.C6202b.m24689a(r0, r1)
            if (r11 == 0) goto L_0x00bb
            int r1 = np0.C37439e.full_amount
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.textgroup.TextGroupView r12 = (p341ge.bog.designsystem.components.textgroup.TextGroupView) r12
            if (r12 == 0) goto L_0x00bb
            int r1 = np0.C37439e.full_amount_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r13 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r13
            if (r13 == 0) goto L_0x00bb
            int r1 = np0.C37439e.keep_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            if (r14 == 0) goto L_0x00bb
            int r1 = np0.C37439e.keep_container_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto L_0x00bb
            int r1 = np0.C37439e.keep_container_value
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            android.widget.TextView r16 = (android.widget.TextView) r16
            if (r16 == 0) goto L_0x00bb
            int r1 = np0.C37439e.f89983F0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.recyclerview.widget.RecyclerView r17 = (androidx.recyclerview.widget.RecyclerView) r17
            if (r17 == 0) goto L_0x00bb
            int r1 = np0.C37439e.repayment_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.constraintlayout.widget.ConstraintLayout r18 = (androidx.constraintlayout.widget.ConstraintLayout) r18
            if (r18 == 0) goto L_0x00bb
            int r1 = np0.C37439e.repayment_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            android.widget.TextView r19 = (android.widget.TextView) r19
            if (r19 == 0) goto L_0x00bb
            int r1 = np0.C37439e.repayment_value
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            android.widget.TextView r20 = (android.widget.TextView) r20
            if (r20 == 0) goto L_0x00bb
            sp0.n r1 = new sp0.n
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x00bb:
            android.content.res.Resources r0 = r21.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sp0.C38495n.m112994a(android.view.View):sp0.n");
    }

    /* renamed from: d */
    public static C38495n m112995d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.fragment_loan_activation_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112994a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f92243d;
    }
}

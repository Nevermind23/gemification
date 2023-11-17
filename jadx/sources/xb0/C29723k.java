package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.input.Input;
import p90.C27486z7;
import rb0.C27986e;

/* renamed from: xb0.k */
public final class C29723k implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f75092d;

    /* renamed from: e */
    public final LinearLayoutCompat f75093e;

    /* renamed from: f */
    public final EmptyWidget f75094f;

    /* renamed from: g */
    public final LinearLayoutCompat f75095g;

    /* renamed from: h */
    public final ChipGroup f75096h;

    /* renamed from: i */
    public final Button f75097i;

    /* renamed from: j */
    public final C29722j f75098j;

    /* renamed from: k */
    public final C29725m f75099k;

    /* renamed from: l */
    public final InlineFeedback2 f75100l;

    /* renamed from: m */
    public final C29716e0 f75101m;

    /* renamed from: n */
    public final C29718f0 f75102n;

    /* renamed from: o */
    public final FrameLayout f75103o;

    /* renamed from: p */
    public final C27486z7 f75104p;

    /* renamed from: q */
    public final CardView f75105q;

    /* renamed from: r */
    public final LinearLayoutCompat f75106r;

    /* renamed from: s */
    public final Input f75107s;

    /* renamed from: t */
    public final EmptyWidget f75108t;

    /* renamed from: u */
    public final Input f75109u;

    private C29723k(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, EmptyWidget emptyWidget, LinearLayoutCompat linearLayoutCompat2, ChipGroup chipGroup, Button button, C29722j jVar, C29725m mVar, InlineFeedback2 inlineFeedback2, C29716e0 e0Var, C29718f0 f0Var, FrameLayout frameLayout, C27486z7 z7Var, CardView cardView, LinearLayoutCompat linearLayoutCompat3, Input input, EmptyWidget emptyWidget2, Input input2) {
        this.f75092d = constraintLayout;
        this.f75093e = linearLayoutCompat;
        this.f75094f = emptyWidget;
        this.f75095g = linearLayoutCompat2;
        this.f75096h = chipGroup;
        this.f75097i = button;
        this.f75098j = jVar;
        this.f75099k = mVar;
        this.f75100l = inlineFeedback2;
        this.f75101m = e0Var;
        this.f75102n = f0Var;
        this.f75103o = frameLayout;
        this.f75104p = z7Var;
        this.f75105q = cardView;
        this.f75106r = linearLayoutCompat3;
        this.f75107s = input;
        this.f75108t = emptyWidget2;
        this.f75109u = input2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r1 = rb0.C27985d.deposit_prolongation_interests_layout;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        r1 = rb0.C27985d.lower_than_initial_amount_layout;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        r1 = rb0.C27985d.f71266O0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xb0.C29723k m90258a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = rb0.C27985d.amount_block_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            androidx.appcompat.widget.LinearLayoutCompat r5 = (androidx.appcompat.widget.LinearLayoutCompat) r5
            if (r5 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.amount_block_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r6 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r6
            if (r6 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.f71250A
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            androidx.appcompat.widget.LinearLayoutCompat r7 = (androidx.appcompat.widget.LinearLayoutCompat) r7
            if (r7 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.f71255D
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.chips.ChipGroup r8 = (p341ge.bog.designsystem.components.chips.ChipGroup) r8
            if (r8 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.f71260G
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.deposit_prolongation_interests_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00d1
            xb0.j r10 = xb0.C29722j.m90255a(r2)
            int r1 = rb0.C27985d.initial_amount_with_interest_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00d1
            xb0.m r11 = xb0.C29725m.m90266a(r2)
            int r1 = rb0.C27985d.f71289q0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2 r12 = (p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2) r12
            if (r12 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.lower_than_initial_amount_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00d1
            xb0.e0 r13 = xb0.C29716e0.m90229a(r2)
            int r1 = rb0.C27985d.only_initial_amount_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00d1
            xb0.f0 r14 = xb0.C29718f0.m90237a(r2)
            int r1 = rb0.C27985d.f71261I0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            android.widget.FrameLayout r15 = (android.widget.FrameLayout) r15
            if (r15 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.f71266O0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00d1
            p90.z7 r16 = p90.C27486z7.m85250a(r2)
            int r1 = rb0.C27985d.f71267P0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.cardview.widget.CardView r17 = (androidx.cardview.widget.CardView) r17
            if (r17 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.term_block_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.appcompat.widget.LinearLayoutCompat r18 = (androidx.appcompat.widget.LinearLayoutCompat) r18
            if (r18 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.f71288n1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.input.Input r19 = (p341ge.bog.designsystem.components.input.Input) r19
            if (r19 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.terms_block_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r20 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r20
            if (r20 == 0) goto L_0x00d1
            int r1 = rb0.C27985d.f71303z1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.input.Input r21 = (p341ge.bog.designsystem.components.input.Input) r21
            if (r21 == 0) goto L_0x00d1
            xb0.k r1 = new xb0.k
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x00d1:
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xb0.C29723k.m90258a(android.view.View):xb0.k");
    }

    /* renamed from: d */
    public static C29723k m90259d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.fragment_deposit_prolongation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90258a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f75092d;
    }
}

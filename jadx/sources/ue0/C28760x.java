package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p90.C27272c8;

/* renamed from: ue0.x */
public final class C28760x implements C6201a {

    /* renamed from: A */
    public final LayerView f73503A;

    /* renamed from: B */
    public final TextView f73504B;

    /* renamed from: C */
    public final TextView f73505C;

    /* renamed from: D */
    public final LayerView f73506D;

    /* renamed from: E */
    public final TextView f73507E;

    /* renamed from: F */
    public final Input f73508F;

    /* renamed from: d */
    private final ConstraintLayout f73509d;

    /* renamed from: e */
    public final TextView f73510e;

    /* renamed from: f */
    public final Barrier f73511f;

    /* renamed from: g */
    public final Input f73512g;

    /* renamed from: h */
    public final Group f73513h;

    /* renamed from: i */
    public final Input f73514i;

    /* renamed from: j */
    public final Input f73515j;

    /* renamed from: k */
    public final Input f73516k;

    /* renamed from: l */
    public final Input f73517l;

    /* renamed from: m */
    public final Button f73518m;

    /* renamed from: n */
    public final ProgressBar f73519n;

    /* renamed from: o */
    public final ScrollView f73520o;

    /* renamed from: p */
    public final View f73521p;

    /* renamed from: q */
    public final Group f73522q;

    /* renamed from: r */
    public final Input f73523r;

    /* renamed from: s */
    public final LayerView f73524s;

    /* renamed from: t */
    public final TextView f73525t;

    /* renamed from: u */
    public final Input f73526u;

    /* renamed from: v */
    public final TextView f73527v;

    /* renamed from: w */
    public final LayerView f73528w;

    /* renamed from: x */
    public final TextView f73529x;

    /* renamed from: y */
    public final C27272c8 f73530y;

    /* renamed from: z */
    public final InlineFeedback f73531z;

    private C28760x(ConstraintLayout constraintLayout, TextView textView, Barrier barrier, Input input, Group group, Input input2, Input input3, Input input4, Input input5, Button button, ProgressBar progressBar, ScrollView scrollView, View view, Group group2, Input input6, LayerView layerView, TextView textView2, Input input7, TextView textView3, LayerView layerView2, TextView textView4, C27272c8 c8Var, InlineFeedback inlineFeedback, LayerView layerView3, TextView textView5, TextView textView6, LayerView layerView4, TextView textView7, Input input8) {
        this.f73509d = constraintLayout;
        this.f73510e = textView;
        this.f73511f = barrier;
        this.f73512g = input;
        this.f73513h = group;
        this.f73514i = input2;
        this.f73515j = input3;
        this.f73516k = input4;
        this.f73517l = input5;
        this.f73518m = button;
        this.f73519n = progressBar;
        this.f73520o = scrollView;
        this.f73521p = view;
        this.f73522q = group2;
        this.f73523r = input6;
        this.f73524s = layerView;
        this.f73525t = textView2;
        this.f73526u = input7;
        this.f73527v = textView3;
        this.f73528w = layerView2;
        this.f73529x = textView4;
        this.f73530y = c8Var;
        this.f73531z = inlineFeedback;
        this.f73503A = layerView3;
        this.f73504B = textView5;
        this.f73505C = textView6;
        this.f73506D = layerView4;
        this.f73507E = textView7;
        this.f73508F = input8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r1 = ie0.C25187g.f64673G3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        r1 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28760x m88172a(android.view.View r33) {
        /*
            r0 = r33
            int r1 = ie0.C25187g.aboutYouTitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x014d
            int r1 = ie0.C25187g.barrier2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            androidx.constraintlayout.widget.Barrier r6 = (androidx.constraintlayout.widget.Barrier) r6
            if (r6 == 0) goto L_0x014d
            int r1 = ie0.C25187g.employer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.input.Input r7 = (p341ge.bog.designsystem.components.input.Input) r7
            if (r7 == 0) goto L_0x014d
            int r1 = ie0.C25187g.employmentGroup
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.constraintlayout.widget.Group r8 = (androidx.constraintlayout.widget.Group) r8
            if (r8 == 0) goto L_0x014d
            int r1 = ie0.C25187g.employmentPosition
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.input.Input r9 = (p341ge.bog.designsystem.components.input.Input) r9
            if (r9 == 0) goto L_0x014d
            int r1 = ie0.C25187g.employmentStatus
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.input.Input r10 = (p341ge.bog.designsystem.components.input.Input) r10
            if (r10 == 0) goto L_0x014d
            int r1 = ie0.C25187g.employmentType
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.input.Input r11 = (p341ge.bog.designsystem.components.input.Input) r11
            if (r11 == 0) goto L_0x014d
            int r1 = ie0.C25187g.incomeSource
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.input.Input r12 = (p341ge.bog.designsystem.components.input.Input) r12
            if (r12 == 0) goto L_0x014d
            int r1 = ie0.C25187g.nextButton
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.buttons.Button r13 = (p341ge.bog.designsystem.components.buttons.Button) r13
            if (r13 == 0) goto L_0x014d
            int r1 = ie0.C25187g.f64685U2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            android.widget.ProgressBar r14 = (android.widget.ProgressBar) r14
            if (r14 == 0) goto L_0x014d
            int r1 = ie0.C25187g.f64719t3
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            android.widget.ScrollView r15 = (android.widget.ScrollView) r15
            if (r15 == 0) goto L_0x014d
            int r1 = ie0.C25187g.f64673G3
            android.view.View r16 = p086g1.C6202b.m24689a(r0, r1)
            if (r16 == 0) goto L_0x014d
            int r1 = ie0.C25187g.shareInCompanyGroup
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.constraintlayout.widget.Group r17 = (androidx.constraintlayout.widget.Group) r17
            if (r17 == 0) goto L_0x014d
            int r1 = ie0.C25187g.shareInCompanyName
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.input.Input r18 = (p341ge.bog.designsystem.components.input.Input) r18
            if (r18 == 0) goto L_0x014d
            int r1 = ie0.C25187g.shareInCompanyNo
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r19 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r19
            if (r19 == 0) goto L_0x014d
            int r1 = ie0.C25187g.shareInCompanyNoText
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            android.widget.TextView r20 = (android.widget.TextView) r20
            if (r20 == 0) goto L_0x014d
            int r1 = ie0.C25187g.shareInCompanyTag
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.input.Input r21 = (p341ge.bog.designsystem.components.input.Input) r21
            if (r21 == 0) goto L_0x014d
            int r1 = ie0.C25187g.shareInCompanyTitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            android.widget.TextView r22 = (android.widget.TextView) r22
            if (r22 == 0) goto L_0x014d
            int r1 = ie0.C25187g.shareInCompanyYes
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r23 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r23
            if (r23 == 0) goto L_0x014d
            int r1 = ie0.C25187g.shareInCompanyYesText
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            android.widget.TextView r24 = (android.widget.TextView) r24
            if (r24 == 0) goto L_0x014d
            int r1 = ie0.C25187g.f64733z4
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x014d
            p90.c8 r25 = p90.C27272c8.m84388a(r2)
            int r1 = ie0.C25187g.usa_connection_warning
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r26 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r26 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r26
            if (r26 == 0) goto L_0x014d
            int r1 = ie0.C25187g.usaMarketNo
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r27 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r27 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r27
            if (r27 == 0) goto L_0x014d
            int r1 = ie0.C25187g.usaMarketNoText
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r28 = r2
            android.widget.TextView r28 = (android.widget.TextView) r28
            if (r28 == 0) goto L_0x014d
            int r1 = ie0.C25187g.usaMarketTitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r29 = r2
            android.widget.TextView r29 = (android.widget.TextView) r29
            if (r29 == 0) goto L_0x014d
            int r1 = ie0.C25187g.usaMarketYes
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r30 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r30 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r30
            if (r30 == 0) goto L_0x014d
            int r1 = ie0.C25187g.usaMarketYesText
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r31 = r2
            android.widget.TextView r31 = (android.widget.TextView) r31
            if (r31 == 0) goto L_0x014d
            int r1 = ie0.C25187g.yearlyIncome
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r32 = r2
            ge.bog.designsystem.components.input.Input r32 = (p341ge.bog.designsystem.components.input.Input) r32
            if (r32 == 0) goto L_0x014d
            ue0.x r1 = new ue0.x
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r1
        L_0x014d:
            android.content.res.Resources r0 = r33.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28760x.m88172a(android.view.View):ue0.x");
    }

    /* renamed from: d */
    public static C28760x m88173d(LayoutInflater layoutInflater) {
        return m88174e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28760x m88174e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_onboarding_employment_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88172a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73509d;
    }
}

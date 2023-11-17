package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: ue0.c0 */
public final class C28716c0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73148d;

    /* renamed from: e */
    public final StateView f73149e;

    /* renamed from: f */
    public final TwoLineTextItem f73150f;

    /* renamed from: g */
    public final ActionSheetTitle f73151g;

    /* renamed from: h */
    public final Button f73152h;

    /* renamed from: i */
    public final LinearLayoutCompat f73153i;

    /* renamed from: j */
    public final View f73154j;

    /* renamed from: k */
    public final LoadingView f73155k;

    /* renamed from: l */
    public final LinearLayoutCompat f73156l;

    /* renamed from: m */
    public final C27272c8 f73157m;

    private C28716c0(ConstraintLayout constraintLayout, StateView stateView, TwoLineTextItem twoLineTextItem, ActionSheetTitle actionSheetTitle, Button button, LinearLayoutCompat linearLayoutCompat, View view, LoadingView loadingView, LinearLayoutCompat linearLayoutCompat2, C27272c8 c8Var) {
        this.f73148d = constraintLayout;
        this.f73149e = stateView;
        this.f73150f = twoLineTextItem;
        this.f73151g = actionSheetTitle;
        this.f73152h = button;
        this.f73153i = linearLayoutCompat;
        this.f73154j = view;
        this.f73155k = loadingView;
        this.f73156l = linearLayoutCompat2;
        this.f73157m = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = ie0.C25187g.f64687Y0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28716c0 m87981a(android.view.View r13) {
        /*
            int r0 = ie0.C25187g.accountNumberState
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r4 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r4
            if (r4 == 0) goto L_0x006b
            int r0 = ie0.C25187g.f64696f
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r5 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r5
            if (r5 == 0) goto L_0x006b
            int r0 = ie0.C25187g.f64707l
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            ge.bog.designsystem.components.actionsheet.ActionSheetTitle r6 = (p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle) r6
            if (r6 == 0) goto L_0x006b
            int r0 = ie0.C25187g.f64717s0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x006b
            int r0 = ie0.C25187g.f64670E0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            androidx.appcompat.widget.LinearLayoutCompat r8 = (androidx.appcompat.widget.LinearLayoutCompat) r8
            if (r8 == 0) goto L_0x006b
            int r0 = ie0.C25187g.f64687Y0
            android.view.View r9 = p086g1.C6202b.m24689a(r13, r0)
            if (r9 == 0) goto L_0x006b
            int r0 = ie0.C25187g.f64710m2
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            ge.bog.designsystem.components.loading.LoadingView r10 = (p341ge.bog.designsystem.components.loading.LoadingView) r10
            if (r10 == 0) goto L_0x006b
            int r0 = ie0.C25187g.parameters_container
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r11 = r1
            androidx.appcompat.widget.LinearLayoutCompat r11 = (androidx.appcompat.widget.LinearLayoutCompat) r11
            if (r11 == 0) goto L_0x006b
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            if (r1 == 0) goto L_0x006b
            p90.c8 r12 = p90.C27272c8.m84388a(r1)
            ue0.c0 r0 = new ue0.c0
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006b:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28716c0.m87981a(android.view.View):ue0.c0");
    }

    /* renamed from: d */
    public static C28716c0 m87982d(LayoutInflater layoutInflater) {
        return m87983e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28716c0 m87983e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_parameters_investment_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87981a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73148d;
    }
}

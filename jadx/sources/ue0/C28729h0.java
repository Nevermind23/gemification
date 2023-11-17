package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: ue0.h0 */
public final class C28729h0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73269d;

    /* renamed from: e */
    public final Button f73270e;

    /* renamed from: f */
    public final ActionSheetTitle f73271f;

    /* renamed from: g */
    public final TwoLineTextItem f73272g;

    /* renamed from: h */
    public final TwoLineTextItem f73273h;

    /* renamed from: i */
    public final ConstraintLayout f73274i;

    /* renamed from: j */
    public final InlineFeedback f73275j;

    /* renamed from: k */
    public final InlineFeedback f73276k;

    /* renamed from: l */
    public final LoadingView f73277l;

    /* renamed from: m */
    public final TwoLineTextItem f73278m;

    /* renamed from: n */
    public final View f73279n;

    /* renamed from: o */
    public final View f73280o;

    /* renamed from: p */
    public final View f73281p;

    /* renamed from: q */
    public final View f73282q;

    /* renamed from: r */
    public final StateView f73283r;

    /* renamed from: s */
    public final TwoLineTextItem f73284s;

    /* renamed from: t */
    public final C27272c8 f73285t;

    /* renamed from: u */
    public final TwoLineTextItem f73286u;

    private C28729h0(ConstraintLayout constraintLayout, Button button, ActionSheetTitle actionSheetTitle, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, ConstraintLayout constraintLayout2, InlineFeedback inlineFeedback, InlineFeedback inlineFeedback2, LoadingView loadingView, TwoLineTextItem twoLineTextItem3, View view, View view2, View view3, View view4, StateView stateView, TwoLineTextItem twoLineTextItem4, C27272c8 c8Var, TwoLineTextItem twoLineTextItem5) {
        this.f73269d = constraintLayout;
        this.f73270e = button;
        this.f73271f = actionSheetTitle;
        this.f73272g = twoLineTextItem;
        this.f73273h = twoLineTextItem2;
        this.f73274i = constraintLayout2;
        this.f73275j = inlineFeedback;
        this.f73276k = inlineFeedback2;
        this.f73277l = loadingView;
        this.f73278m = twoLineTextItem3;
        this.f73279n = view;
        this.f73280o = view2;
        this.f73281p = view3;
        this.f73282q = view4;
        this.f73283r = stateView;
        this.f73284s = twoLineTextItem4;
        this.f73285t = c8Var;
        this.f73286u = twoLineTextItem5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r1 = ie0.C25187g.sep1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r1 = ie0.C25187g.sep2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r1 = ie0.C25187g.sep3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r1 = ie0.C25187g.sep4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        r1 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28729h0 m88037a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = ie0.C25187g.f64700i
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.actionSheetTitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.actionsheet.ActionSheetTitle r6 = (p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle) r6
            if (r6 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.amountInfo
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r7 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r7
            if (r7 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.commissionInfo
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r8 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r8
            if (r8 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.f64670E0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            if (r9 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.infoClosedMarket
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r10 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r10
            if (r10 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.infoCommission
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r11 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r11
            if (r11 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.f64702j2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.loading.LoadingView r12 = (p341ge.bog.designsystem.components.loading.LoadingView) r12
            if (r12 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.quantityInfo
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r13 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r13
            if (r13 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.sep1
            android.view.View r14 = p086g1.C6202b.m24689a(r0, r1)
            if (r14 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.sep2
            android.view.View r15 = p086g1.C6202b.m24689a(r0, r1)
            if (r15 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.sep3
            android.view.View r16 = p086g1.C6202b.m24689a(r0, r1)
            if (r16 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.sep4
            android.view.View r17 = p086g1.C6202b.m24689a(r0, r1)
            if (r17 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.f64690Z3
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r18 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r18
            if (r18 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.tickerInfo
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r19 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r19
            if (r19 == 0) goto L_0x00bf
            int r1 = ie0.C25187g.f64733z4
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00bf
            p90.c8 r20 = p90.C27272c8.m84388a(r2)
            int r1 = ie0.C25187g.totalAmount
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r21 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r21
            if (r21 == 0) goto L_0x00bf
            ue0.h0 r1 = new ue0.h0
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x00bf:
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28729h0.m88037a(android.view.View):ue0.h0");
    }

    /* renamed from: d */
    public static C28729h0 m88038d(LayoutInflater layoutInflater) {
        return m88039e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28729h0 m88039e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_share_trade_review, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88037a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73269d;
    }
}

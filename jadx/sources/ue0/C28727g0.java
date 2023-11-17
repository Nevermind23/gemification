package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p90.C27272c8;

/* renamed from: ue0.g0 */
public final class C28727g0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73256d;

    /* renamed from: e */
    public final TwoLineTextItem f73257e;

    /* renamed from: f */
    public final TwoLineTextItem f73258f;

    /* renamed from: g */
    public final InlineFeedback f73259g;

    /* renamed from: h */
    public final LayerView f73260h;

    /* renamed from: i */
    public final PageState f73261i;

    /* renamed from: j */
    public final TwoLineTextItem f73262j;

    /* renamed from: k */
    public final TwoLineTextItem f73263k;

    /* renamed from: l */
    public final C27272c8 f73264l;

    /* renamed from: m */
    public final TwoLineTextItem f73265m;

    private C28727g0(ConstraintLayout constraintLayout, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, InlineFeedback inlineFeedback, LayerView layerView, PageState pageState, TwoLineTextItem twoLineTextItem3, TwoLineTextItem twoLineTextItem4, C27272c8 c8Var, TwoLineTextItem twoLineTextItem5) {
        this.f73256d = constraintLayout;
        this.f73257e = twoLineTextItem;
        this.f73258f = twoLineTextItem2;
        this.f73259g = inlineFeedback;
        this.f73260h = layerView;
        this.f73261i = pageState;
        this.f73262j = twoLineTextItem3;
        this.f73263k = twoLineTextItem4;
        this.f73264l = c8Var;
        this.f73265m = twoLineTextItem5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28727g0 m88028a(android.view.View r13) {
        /*
            int r0 = ie0.C25187g.amountInfo
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r4 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r4
            if (r4 == 0) goto L_0x006e
            int r0 = ie0.C25187g.commissionInfo
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r5 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r5
            if (r5 == 0) goto L_0x006e
            int r0 = ie0.C25187g.delay_description
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r6 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r6
            if (r6 == 0) goto L_0x006e
            int r0 = ie0.C25187g.layerView2
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r7 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r7
            if (r7 == 0) goto L_0x006e
            int r0 = ie0.C25187g.pageState
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            ge.bog.designsystem.components.pagestate.PageState r8 = (p341ge.bog.designsystem.components.pagestate.PageState) r8
            if (r8 == 0) goto L_0x006e
            int r0 = ie0.C25187g.quantityInfo
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r9 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r9
            if (r9 == 0) goto L_0x006e
            int r0 = ie0.C25187g.tickerInfo
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r10 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r10
            if (r10 == 0) goto L_0x006e
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            if (r1 == 0) goto L_0x006e
            p90.c8 r11 = p90.C27272c8.m84388a(r1)
            int r0 = ie0.C25187g.totalInfo
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r12 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r12 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r12
            if (r12 == 0) goto L_0x006e
            ue0.g0 r0 = new ue0.g0
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006e:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28727g0.m88028a(android.view.View):ue0.g0");
    }

    /* renamed from: d */
    public static C28727g0 m88029d(LayoutInflater layoutInflater) {
        return m88030e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28727g0 m88030e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_share_tade_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88028a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73256d;
    }
}

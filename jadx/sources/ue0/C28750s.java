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

/* renamed from: ue0.s */
public final class C28750s implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73449d;

    /* renamed from: e */
    public final TwoLineTextItem f73450e;

    /* renamed from: f */
    public final TwoLineTextItem f73451f;

    /* renamed from: g */
    public final InlineFeedback f73452g;

    /* renamed from: h */
    public final LayerView f73453h;

    /* renamed from: i */
    public final PageState f73454i;

    /* renamed from: j */
    public final C27272c8 f73455j;

    private C28750s(ConstraintLayout constraintLayout, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, InlineFeedback inlineFeedback, LayerView layerView, PageState pageState, C27272c8 c8Var) {
        this.f73449d = constraintLayout;
        this.f73450e = twoLineTextItem;
        this.f73451f = twoLineTextItem2;
        this.f73452g = inlineFeedback;
        this.f73453h = layerView;
        this.f73454i = pageState;
        this.f73455j = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28750s m88127a(android.view.View r10) {
        /*
            int r0 = ie0.C25187g.accountTV
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r4 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r4
            if (r4 == 0) goto L_0x004d
            int r0 = ie0.C25187g.f64712o
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r5 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r5
            if (r5 == 0) goto L_0x004d
            int r0 = ie0.C25187g.delay_description
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r6 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r6
            if (r6 == 0) goto L_0x004d
            int r0 = ie0.C25187g.layerView2
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r7 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r7
            if (r7 == 0) goto L_0x004d
            int r0 = ie0.C25187g.pageState
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            ge.bog.designsystem.components.pagestate.PageState r8 = (p341ge.bog.designsystem.components.pagestate.PageState) r8
            if (r8 == 0) goto L_0x004d
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004d
            p90.c8 r9 = p90.C27272c8.m84388a(r1)
            ue0.s r0 = new ue0.s
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004d:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28750s.m88127a(android.view.View):ue0.s");
    }

    /* renamed from: d */
    public static C28750s m88128d(LayoutInflater layoutInflater) {
        return m88129e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28750s m88129e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_exchange_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88127a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73449d;
    }
}

package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p90.C27272c8;

/* renamed from: pr0.e */
public final class C37950e implements C6201a {

    /* renamed from: d */
    private final LinearLayout f91108d;

    /* renamed from: e */
    public final Button f91109e;

    /* renamed from: f */
    public final TwoLineTextItem f91110f;

    /* renamed from: g */
    public final LayerView f91111g;

    /* renamed from: h */
    public final PageState f91112h;

    /* renamed from: i */
    public final EmptyWidget f91113i;

    /* renamed from: j */
    public final LayerView f91114j;

    /* renamed from: k */
    public final FrameLayout f91115k;

    /* renamed from: l */
    public final C27272c8 f91116l;

    private C37950e(LinearLayout linearLayout, Button button, TwoLineTextItem twoLineTextItem, LayerView layerView, PageState pageState, EmptyWidget emptyWidget, LayerView layerView2, FrameLayout frameLayout, C27272c8 c8Var) {
        this.f91108d = linearLayout;
        this.f91109e = button;
        this.f91110f = twoLineTextItem;
        this.f91111g = layerView;
        this.f91112h = pageState;
        this.f91113i = emptyWidget;
        this.f91114j = layerView2;
        this.f91115k = frameLayout;
        this.f91116l = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = lr0.C37130e.f89452x1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static pr0.C37950e m111543a(android.view.View r12) {
        /*
            int r0 = lr0.C37130e.button_back
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0063
            int r0 = lr0.C37130e.cancellation_installment_text
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r5 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r5
            if (r5 == 0) goto L_0x0063
            int r0 = lr0.C37130e.f89418D
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r6 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r6
            if (r6 == 0) goto L_0x0063
            int r0 = lr0.C37130e.f89415B0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            ge.bog.designsystem.components.pagestate.PageState r7 = (p341ge.bog.designsystem.components.pagestate.PageState) r7
            if (r7 == 0) goto L_0x0063
            int r0 = lr0.C37130e.result_details_text
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r8 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r8
            if (r8 == 0) goto L_0x0063
            int r0 = lr0.C37130e.result_view
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r9 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r9
            if (r9 == 0) goto L_0x0063
            int r0 = lr0.C37130e.tool_bar_container
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            if (r10 == 0) goto L_0x0063
            int r0 = lr0.C37130e.f89452x1
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0063
            p90.c8 r11 = p90.C27272c8.m84388a(r1)
            pr0.e r0 = new pr0.e
            r3 = r12
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0063:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.C37950e.m111543a(android.view.View):pr0.e");
    }

    /* renamed from: d */
    public static C37950e m111544d(LayoutInflater layoutInflater) {
        return m111545e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C37950e m111545e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.activity_loan_installment_reversal_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111543a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f91108d;
    }
}

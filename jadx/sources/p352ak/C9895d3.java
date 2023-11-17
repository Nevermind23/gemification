package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.rateview.RateStarView;
import p601sg.C17783h;

/* renamed from: ak.d3 */
public final class C9895d3 implements C6201a {

    /* renamed from: d */
    private final LayerView f26886d;

    /* renamed from: e */
    public final View f26887e;

    /* renamed from: f */
    public final ConstraintLayout f26888f;

    /* renamed from: g */
    public final View f26889g;

    /* renamed from: h */
    public final View f26890h;

    /* renamed from: i */
    public final Button f26891i;

    /* renamed from: j */
    public final PageDescriptionView f26892j;

    /* renamed from: k */
    public final Button f26893k;

    /* renamed from: l */
    public final RateStarView f26894l;

    /* renamed from: m */
    public final C10050y f26895m;

    /* renamed from: n */
    public final View f26896n;

    private C9895d3(LayerView layerView, View view, ConstraintLayout constraintLayout, View view2, View view3, Button button, PageDescriptionView pageDescriptionView, Button button2, RateStarView rateStarView, C10050y yVar, View view4) {
        this.f26886d = layerView;
        this.f26887e = view;
        this.f26888f = constraintLayout;
        this.f26889g = view2;
        this.f26890h = view3;
        this.f26891i = button;
        this.f26892j = pageDescriptionView;
        this.f26893k = button2;
        this.f26894l = rateStarView;
        this.f26895m = yVar;
        this.f26896n = view4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r0 = p601sg.C17782g.title_with_close;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = p601sg.C17782g.divider_bottom;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r0 = p601sg.C17782g.divider_top;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C9895d3 m36293a(android.view.View r13) {
        /*
            int r0 = p601sg.C17782g.f49811y0
            android.view.View r3 = p086g1.C6202b.m24689a(r13, r0)
            if (r3 == 0) goto L_0x006d
            int r0 = p601sg.C17782g.f49713O0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            if (r4 == 0) goto L_0x006d
            int r0 = p601sg.C17782g.divider_bottom
            android.view.View r5 = p086g1.C6202b.m24689a(r13, r0)
            if (r5 == 0) goto L_0x006d
            int r0 = p601sg.C17782g.divider_top
            android.view.View r6 = p086g1.C6202b.m24689a(r13, r0)
            if (r6 == 0) goto L_0x006d
            int r0 = p601sg.C17782g.f49739W5
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x006d
            int r0 = p601sg.C17782g.f49810x6
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r8 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r8
            if (r8 == 0) goto L_0x006d
            int r0 = p601sg.C17782g.f49706M6
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x006d
            int r0 = p601sg.C17782g.rate_star_view
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            ge.bog.designsystem.components.rateview.RateStarView r10 = (p341ge.bog.designsystem.components.rateview.RateStarView) r10
            if (r10 == 0) goto L_0x006d
            int r0 = p601sg.C17782g.title_with_close
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            if (r1 == 0) goto L_0x006d
            ak.y r11 = p352ak.C10050y.m36862a(r1)
            int r0 = p601sg.C17782g.f49800u9
            android.view.View r12 = p086g1.C6202b.m24689a(r13, r0)
            if (r12 == 0) goto L_0x006d
            ak.d3 r0 = new ak.d3
            r2 = r13
            ge.bog.designsystem.components.layersandshadows.LayerView r2 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r2
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006d:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C9895d3.m36293a(android.view.View):ak.d3");
    }

    /* renamed from: d */
    public static C9895d3 m36294d(LayoutInflater layoutInflater) {
        return m36295e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C9895d3 m36295e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36293a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f26886d;
    }
}

package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10324m;

/* renamed from: p90.k1 */
public final class C27345k1 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69112d;

    /* renamed from: e */
    public final LayerView f69113e;

    /* renamed from: f */
    public final TextTypeView f69114f;

    /* renamed from: g */
    public final FixedButtonView f69115g;

    /* renamed from: h */
    public final TextTypeView f69116h;

    /* renamed from: i */
    public final TextTypeView f69117i;

    /* renamed from: j */
    public final TextTypeView f69118j;

    /* renamed from: k */
    public final TextTypeView f69119k;

    /* renamed from: l */
    public final FrameLayout f69120l;

    /* renamed from: m */
    public final C27272c8 f69121m;

    private C27345k1(FrameLayout frameLayout, LayerView layerView, TextTypeView textTypeView, FixedButtonView fixedButtonView, TextTypeView textTypeView2, TextTypeView textTypeView3, TextTypeView textTypeView4, TextTypeView textTypeView5, FrameLayout frameLayout2, C27272c8 c8Var) {
        this.f69112d = frameLayout;
        this.f69113e = layerView;
        this.f69114f = textTypeView;
        this.f69115g = fixedButtonView;
        this.f69116h = textTypeView2;
        this.f69117i = textTypeView3;
        this.f69118j = textTypeView4;
        this.f69119k = textTypeView5;
        this.f69120l = frameLayout2;
        this.f69121m = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27345k1 m84688a(android.view.View r13) {
        /*
            int r0 = p366bk.C10322k.details_card
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r4 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r4
            if (r4 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.f28814Zg
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r5
            if (r5 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.invite_button
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r6 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r6
            if (r6 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.person_first_name
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r7
            if (r7 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.person_last_name
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r8 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r8
            if (r8 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.f28900up
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r9
            if (r9 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.product_view
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r10 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r10
            if (r10 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.f28719Dq
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r11 = r1
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            if (r1 == 0) goto L_0x006e
            p90.c8 r12 = p90.C27272c8.m84388a(r1)
            p90.k1 r0 = new p90.k1
            r3 = r13
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p90.C27345k1.m84688a(android.view.View):p90.k1");
    }

    /* renamed from: d */
    public static C27345k1 m84689d(LayoutInflater layoutInflater) {
        return m84690e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27345k1 m84690e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_plus_invitation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84688a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69112d;
    }
}

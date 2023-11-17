package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.CustomCheckBox;
import p341ge.bog.mobilebank.p975ui.views.widgets.CustomSwitch;
import p366bk.C10324m;

/* renamed from: p90.i */
public final class C27323i implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68900d;

    /* renamed from: e */
    public final CustomCheckBox f68901e;

    /* renamed from: f */
    public final LayerView f68902f;

    /* renamed from: g */
    public final LayerView f68903g;

    /* renamed from: h */
    public final CustomSwitch f68904h;

    /* renamed from: i */
    public final Input f68905i;

    /* renamed from: j */
    public final Input f68906j;

    /* renamed from: k */
    public final FrameLayout f68907k;

    /* renamed from: l */
    public final Button f68908l;

    /* renamed from: m */
    public final LinearLayout f68909m;

    /* renamed from: n */
    public final BogTextView f68910n;

    /* renamed from: o */
    public final C27272c8 f68911o;

    private C27323i(LinearLayout linearLayout, CustomCheckBox customCheckBox, LayerView layerView, LayerView layerView2, CustomSwitch customSwitch, Input input, Input input2, FrameLayout frameLayout, Button button, LinearLayout linearLayout2, BogTextView bogTextView, C27272c8 c8Var) {
        this.f68900d = linearLayout;
        this.f68901e = customCheckBox;
        this.f68902f = layerView;
        this.f68903g = layerView2;
        this.f68904h = customSwitch;
        this.f68905i = input;
        this.f68906j = input2;
        this.f68907k = frameLayout;
        this.f68908l = button;
        this.f68909m = linearLayout2;
        this.f68910n = bogTextView;
        this.f68911o = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27323i m84598a(android.view.View r15) {
        /*
            int r0 = p366bk.C10322k.agreement_checkbox
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.CustomCheckBox r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.CustomCheckBox) r4
            if (r4 == 0) goto L_0x0084
            int r0 = p366bk.C10322k.details_card
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r5 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r5
            if (r5 == 0) goto L_0x0084
            int r0 = p366bk.C10322k.digipass_card
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r6 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r6 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r6
            if (r6 == 0) goto L_0x0084
            int r0 = p366bk.C10322k.digipass_switch
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.CustomSwitch r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.CustomSwitch) r7
            if (r7 == 0) goto L_0x0084
            int r0 = p366bk.C10322k.language
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r8 = r1
            ge.bog.designsystem.components.input.Input r8 = (p341ge.bog.designsystem.components.input.Input) r8
            if (r8 == 0) goto L_0x0084
            int r0 = p366bk.C10322k.f28743Hl
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r9 = r1
            ge.bog.designsystem.components.input.Input r9 = (p341ge.bog.designsystem.components.input.Input) r9
            if (r9 == 0) goto L_0x0084
            int r0 = p366bk.C10322k.f28719Dq
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r10 = r1
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            if (r10 == 0) goto L_0x0084
            int r0 = p366bk.C10322k.f28914yt
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r11 = r1
            ge.bog.designsystem.components.buttons.Button r11 = (p341ge.bog.designsystem.components.buttons.Button) r11
            if (r11 == 0) goto L_0x0084
            int r0 = p366bk.C10322k.thee_d_security_agreement_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r12 = r1
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            if (r12 == 0) goto L_0x0084
            int r0 = p366bk.C10322k.three_d_security_conditions_btn
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r13 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r13
            if (r13 == 0) goto L_0x0084
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0084
            p90.c8 r14 = p90.C27272c8.m84388a(r1)
            p90.i r0 = new p90.i
            r3 = r15
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0084:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27323i.m84598a(android.view.View):p90.i");
    }

    /* renamed from: d */
    public static C27323i m84599d(LayoutInflater layoutInflater) {
        return m84600e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27323i m84600e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_3d_security, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84598a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68900d;
    }
}

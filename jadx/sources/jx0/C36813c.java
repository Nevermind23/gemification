package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import fx0.C32025e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.payments.presentation.form.base.FormLayout;
import p90.C27272c8;

/* renamed from: jx0.c */
public final class C36813c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88805d;

    /* renamed from: e */
    public final ConstraintLayout f88806e;

    /* renamed from: f */
    public final C36819f f88807f;

    /* renamed from: g */
    public final FormLayout f88808g;

    /* renamed from: h */
    public final StateView f88809h;

    /* renamed from: i */
    public final Button f88810i;

    /* renamed from: j */
    public final LayerView f88811j;

    /* renamed from: k */
    public final C36822g0 f88812k;

    /* renamed from: l */
    public final C27272c8 f88813l;

    private C36813c(LinearLayout linearLayout, ConstraintLayout constraintLayout, C36819f fVar, FormLayout formLayout, StateView stateView, Button button, LayerView layerView, C36822g0 g0Var, C27272c8 c8Var) {
        this.f88805d = linearLayout;
        this.f88806e = constraintLayout;
        this.f88807f = fVar;
        this.f88808g = formLayout;
        this.f88809h = stateView;
        this.f88810i = button;
        this.f88811j = layerView;
        this.f88812k = g0Var;
        this.f88813l = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r0 = fx0.C32024d.f78847k0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = fx0.C32024d.f78858u;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static jx0.C36813c m109064a(android.view.View r12) {
        /*
            int r0 = fx0.C32024d.f78853q
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            if (r4 == 0) goto L_0x0065
            int r0 = fx0.C32024d.f78858u
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0065
            jx0.f r5 = jx0.C36819f.m109091a(r1)
            int r0 = fx0.C32024d.form_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            ge.bog.mobilebank.payments.presentation.form.base.FormLayout r6 = (p341ge.bog.mobilebank.payments.presentation.form.base.FormLayout) r6
            if (r6 == 0) goto L_0x0065
            int r0 = fx0.C32024d.form_state_view
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r7 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r7
            if (r7 == 0) goto L_0x0065
            int r0 = fx0.C32024d.f78836F
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            ge.bog.designsystem.components.buttons.Button r8 = (p341ge.bog.designsystem.components.buttons.Button) r8
            if (r8 == 0) goto L_0x0065
            int r0 = fx0.C32024d.main_button_container
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r9 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r9
            if (r9 == 0) goto L_0x0065
            int r0 = fx0.C32024d.f78847k0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0065
            jx0.g0 r10 = jx0.C36822g0.m109101a(r1)
            int r0 = fx0.C32024d.f78856r0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0065
            p90.c8 r11 = p90.C27272c8.m84388a(r1)
            jx0.c r0 = new jx0.c
            r3 = r12
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0065:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jx0.C36813c.m109064a(android.view.View):jx0.c");
    }

    /* renamed from: d */
    public static C36813c m109065d(LayoutInflater layoutInflater) {
        return m109066e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36813c m109066e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.activity_payment_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109064a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88805d;
    }
}

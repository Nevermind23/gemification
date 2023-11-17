package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p411em.C12489f;
import p90.C27272c8;

/* renamed from: jm.m */
public final class C16234m implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f45910d;

    /* renamed from: e */
    public final LinearLayoutCompat f45911e;

    /* renamed from: f */
    public final PageState f45912f;

    /* renamed from: g */
    public final Input f45913g;

    /* renamed from: h */
    public final Input f45914h;

    /* renamed from: i */
    public final Input f45915i;

    /* renamed from: j */
    public final LinearLayoutCompat f45916j;

    /* renamed from: k */
    public final PageDescriptionView f45917k;

    /* renamed from: l */
    public final FixedButtonView f45918l;

    /* renamed from: m */
    public final EmptyWidget f45919m;

    /* renamed from: n */
    public final Button f45920n;

    /* renamed from: o */
    public final LoadingView f45921o;

    /* renamed from: p */
    public final C27272c8 f45922p;

    private C16234m(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, PageState pageState, Input input, Input input2, Input input3, LinearLayoutCompat linearLayoutCompat2, PageDescriptionView pageDescriptionView, FixedButtonView fixedButtonView, EmptyWidget emptyWidget, Button button, LoadingView loadingView, C27272c8 c8Var) {
        this.f45910d = constraintLayout;
        this.f45911e = linearLayoutCompat;
        this.f45912f = pageState;
        this.f45913g = input;
        this.f45914h = input2;
        this.f45915i = input3;
        this.f45916j = linearLayoutCompat2;
        this.f45917k = pageDescriptionView;
        this.f45918l = fixedButtonView;
        this.f45919m = emptyWidget;
        this.f45920n = button;
        this.f45921o = loadingView;
        this.f45922p = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r1 = p411em.C12488e.f37198d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p481jm.C16234m m57869a(android.view.View r17) {
        /*
            r0 = r17
            int r1 = p411em.C12488e.f37218p0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            androidx.appcompat.widget.LinearLayoutCompat r5 = (androidx.appcompat.widget.LinearLayoutCompat) r5
            if (r5 == 0) goto L_0x0091
            int r1 = p411em.C12488e.f37219q0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.pagestate.PageState r6 = (p341ge.bog.designsystem.components.pagestate.PageState) r6
            if (r6 == 0) goto L_0x0091
            int r1 = p411em.C12488e.input_address
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.input.Input r7 = (p341ge.bog.designsystem.components.input.Input) r7
            if (r7 == 0) goto L_0x0091
            int r1 = p411em.C12488e.input_country
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.input.Input r8 = (p341ge.bog.designsystem.components.input.Input) r8
            if (r8 == 0) goto L_0x0091
            int r1 = p411em.C12488e.input_service_center
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.input.Input r9 = (p341ge.bog.designsystem.components.input.Input) r9
            if (r9 == 0) goto L_0x0091
            int r1 = p411em.C12488e.inputs
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            androidx.appcompat.widget.LinearLayoutCompat r10 = (androidx.appcompat.widget.LinearLayoutCompat) r10
            if (r10 == 0) goto L_0x0091
            int r1 = p411em.C12488e.instant_card_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r11 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r11
            if (r11 == 0) goto L_0x0091
            int r1 = p411em.C12488e.order_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r12 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r12
            if (r12 == 0) goto L_0x0091
            int r1 = p411em.C12488e.order_details_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r13 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r13
            if (r13 == 0) goto L_0x0091
            int r1 = p411em.C12488e.f37188R1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.buttons.Button r14 = (p341ge.bog.designsystem.components.buttons.Button) r14
            if (r14 == 0) goto L_0x0091
            int r1 = p411em.C12488e.f37193V1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.loading.LoadingView r15 = (p341ge.bog.designsystem.components.loading.LoadingView) r15
            if (r15 == 0) goto L_0x0091
            int r1 = p411em.C12488e.f37198d2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x0091
            p90.c8 r16 = p90.C27272c8.m84388a(r2)
            jm.m r1 = new jm.m
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x0091:
            android.content.res.Resources r0 = r17.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p481jm.C16234m.m57869a(android.view.View):jm.m");
    }

    /* renamed from: d */
    public static C16234m m57870d(LayoutInflater layoutInflater) {
        return m57871e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C16234m m57871e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.activity_order_instant_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57869a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f45910d;
    }
}

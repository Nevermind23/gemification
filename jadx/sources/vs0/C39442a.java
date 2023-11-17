package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;
import rs0.C38337d;

/* renamed from: vs0.a */
public final class C39442a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93662d;

    /* renamed from: e */
    public final PageDescriptionView f93663e;

    /* renamed from: f */
    public final Input f93664f;

    /* renamed from: g */
    public final ChipGroup f93665g;

    /* renamed from: h */
    public final PageDescriptionView f93666h;

    /* renamed from: i */
    public final FrameLayout f93667i;

    /* renamed from: j */
    public final Guideline f93668j;

    /* renamed from: k */
    public final Guideline f93669k;

    /* renamed from: l */
    public final Guideline f93670l;

    /* renamed from: m */
    public final View f93671m;

    /* renamed from: n */
    public final LinearLayoutCompat f93672n;

    /* renamed from: o */
    public final StateView f93673o;

    /* renamed from: p */
    public final PageDescriptionView f93674p;

    /* renamed from: q */
    public final Button f93675q;

    /* renamed from: r */
    public final FixedButtonView f93676r;

    /* renamed from: s */
    public final LoadingView f93677s;

    /* renamed from: t */
    public final PageState f93678t;

    /* renamed from: u */
    public final C27272c8 f93679u;

    private C39442a(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, Input input, ChipGroup chipGroup, PageDescriptionView pageDescriptionView2, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, View view, LinearLayoutCompat linearLayoutCompat, StateView stateView, PageDescriptionView pageDescriptionView3, Button button, FixedButtonView fixedButtonView, LoadingView loadingView, PageState pageState, C27272c8 c8Var) {
        this.f93662d = constraintLayout;
        this.f93663e = pageDescriptionView;
        this.f93664f = input;
        this.f93665g = chipGroup;
        this.f93666h = pageDescriptionView2;
        this.f93667i = frameLayout;
        this.f93668j = guideline;
        this.f93669k = guideline2;
        this.f93670l = guideline3;
        this.f93671m = view;
        this.f93672n = linearLayoutCompat;
        this.f93673o = stateView;
        this.f93674p = pageDescriptionView3;
        this.f93675q = button;
        this.f93676r = fixedButtonView;
        this.f93677s = loadingView;
        this.f93678t = pageState;
        this.f93679u = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r1 = rs0.C38336c.f91883o0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r1 = rs0.C38336c.f91897w1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vs0.C39442a m114616a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = rs0.C38336c.account_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r5 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r5
            if (r5 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91867b
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.input.Input r6 = (p341ge.bog.designsystem.components.input.Input) r6
            if (r6 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.amount_chip_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.chips.ChipGroup r7 = (p341ge.bog.designsystem.components.chips.ChipGroup) r7
            if (r7 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.amount_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r8 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r8
            if (r8 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91859P
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            if (r9 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91864Y
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            androidx.constraintlayout.widget.Guideline r10 = (androidx.constraintlayout.widget.Guideline) r10
            if (r10 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91865Z
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.constraintlayout.widget.Guideline r11 = (androidx.constraintlayout.widget.Guideline) r11
            if (r11 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91866a0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.constraintlayout.widget.Guideline r12 = (androidx.constraintlayout.widget.Guideline) r12
            if (r12 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91883o0
            android.view.View r13 = p086g1.C6202b.m24689a(r0, r1)
            if (r13 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91885p0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.appcompat.widget.LinearLayoutCompat r14 = (androidx.appcompat.widget.LinearLayoutCompat) r14
            if (r14 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91888q0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r15 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r15
            if (r15 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.piggy_bank_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r16 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r16
            if (r16 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91881m1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.buttons.Button r17 = (p341ge.bog.designsystem.components.buttons.Button) r17
            if (r17 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91882n1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r18 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r18
            if (r18 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91886p1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.loading.LoadingView r19 = (p341ge.bog.designsystem.components.loading.LoadingView) r19
            if (r19 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91893t1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.pagestate.PageState r20 = (p341ge.bog.designsystem.components.pagestate.PageState) r20
            if (r20 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91897w1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00ca
            p90.c8 r21 = p90.C27272c8.m84388a(r2)
            vs0.a r1 = new vs0.a
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x00ca:
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.C39442a.m114616a(android.view.View):vs0.a");
    }

    /* renamed from: d */
    public static C39442a m114617d(LayoutInflater layoutInflater) {
        return m114618e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C39442a m114618e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.activity_create_cas, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114616a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93662d;
    }
}

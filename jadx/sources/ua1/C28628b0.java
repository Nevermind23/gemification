package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import ba1.C10217v;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.b0 */
public final class C28628b0 implements C6201a {

    /* renamed from: d */
    private final ScrollView f72659d;

    /* renamed from: e */
    public final AppCompatTextView f72660e;

    /* renamed from: f */
    public final PageDescriptionView f72661f;

    /* renamed from: g */
    public final InlineFeedback f72662g;

    /* renamed from: h */
    public final Input f72663h;

    /* renamed from: i */
    public final Guideline f72664i;

    /* renamed from: j */
    public final Input f72665j;

    /* renamed from: k */
    public final Input f72666k;

    /* renamed from: l */
    public final View f72667l;

    /* renamed from: m */
    public final Guideline f72668m;

    /* renamed from: n */
    public final ConstraintLayout f72669n;

    /* renamed from: o */
    public final Group f72670o;

    /* renamed from: p */
    public final Group f72671p;

    /* renamed from: q */
    public final AppCompatTextView f72672q;

    /* renamed from: r */
    public final FrameLayout f72673r;

    /* renamed from: s */
    public final Button f72674s;

    /* renamed from: t */
    public final LinearLayoutCompat f72675t;

    /* renamed from: u */
    public final CheckboxView f72676u;

    /* renamed from: v */
    public final Button f72677v;

    /* renamed from: w */
    public final Guideline f72678w;

    /* renamed from: x */
    public final Guideline f72679x;

    private C28628b0(ScrollView scrollView, AppCompatTextView appCompatTextView, PageDescriptionView pageDescriptionView, InlineFeedback inlineFeedback, Input input, Guideline guideline, Input input2, Input input3, View view, Guideline guideline2, ConstraintLayout constraintLayout, Group group, Group group2, AppCompatTextView appCompatTextView2, FrameLayout frameLayout, Button button, LinearLayoutCompat linearLayoutCompat, CheckboxView checkboxView, Button button2, Guideline guideline3, Guideline guideline4) {
        this.f72659d = scrollView;
        this.f72660e = appCompatTextView;
        this.f72661f = pageDescriptionView;
        this.f72662g = inlineFeedback;
        this.f72663h = input;
        this.f72664i = guideline;
        this.f72665j = input2;
        this.f72666k = input3;
        this.f72667l = view;
        this.f72668m = guideline2;
        this.f72669n = constraintLayout;
        this.f72670o = group;
        this.f72671p = group2;
        this.f72672q = appCompatTextView2;
        this.f72673r = frameLayout;
        this.f72674s = button;
        this.f72675t = linearLayoutCompat;
        this.f72676u = checkboxView;
        this.f72677v = button2;
        this.f72678w = guideline3;
        this.f72679x = guideline4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r1 = ba1.C10216u.f28340u0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ua1.C28628b0 m87608a(android.view.View r25) {
        /*
            r0 = r25
            int r1 = ba1.C10216u.actual_address_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.address_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r6 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r6
            if (r6 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.address_feedback_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r7 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r7
            if (r7 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.address_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.input.Input r8 = (p341ge.bog.designsystem.components.input.Input) r8
            if (r8 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.f28291C
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.constraintlayout.widget.Guideline r9 = (androidx.constraintlayout.widget.Guideline) r9
            if (r9 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.city_select_box
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.input.Input r10 = (p341ge.bog.designsystem.components.input.Input) r10
            if (r10 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.country_select_box
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.input.Input r11 = (p341ge.bog.designsystem.components.input.Input) r11
            if (r11 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.f28340u0
            android.view.View r12 = p086g1.C6202b.m24689a(r0, r1)
            if (r12 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.f28292C0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.constraintlayout.widget.Guideline r13 = (androidx.constraintlayout.widget.Guideline) r13
            if (r13 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.form_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            if (r14 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.form_inputs
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            androidx.constraintlayout.widget.Group r15 = (androidx.constraintlayout.widget.Group) r15
            if (r15 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.legal_address_elements
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.constraintlayout.widget.Group r16 = (androidx.constraintlayout.widget.Group) r16
            if (r16 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.legal_address_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.appcompat.widget.AppCompatTextView r17 = (androidx.appcompat.widget.AppCompatTextView) r17
            if (r17 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.f28316a2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            android.widget.FrameLayout r18 = (android.widget.FrameLayout) r18
            if (r18 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.f28336o2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.buttons.Button r19 = (p341ge.bog.designsystem.components.buttons.Button) r19
            if (r19 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.retry_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            androidx.appcompat.widget.LinearLayoutCompat r20 = (androidx.appcompat.widget.LinearLayoutCompat) r20
            if (r20 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.same_address_checkbox
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.checkbox.CheckboxView r21 = (p341ge.bog.designsystem.components.checkbox.CheckboxView) r21
            if (r21 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.f28341u2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.designsystem.components.buttons.Button r22 = (p341ge.bog.designsystem.components.buttons.Button) r22
            if (r22 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.f28302Q2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            androidx.constraintlayout.widget.Guideline r23 = (androidx.constraintlayout.widget.Guideline) r23
            if (r23 == 0) goto L_0x00ee
            int r1 = ba1.C10216u.f28330h3
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            androidx.constraintlayout.widget.Guideline r24 = (androidx.constraintlayout.widget.Guideline) r24
            if (r24 == 0) goto L_0x00ee
            ua1.b0 r1 = new ua1.b0
            r3 = r1
            r4 = r0
            android.widget.ScrollView r4 = (android.widget.ScrollView) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r1
        L_0x00ee:
            android.content.res.Resources r0 = r25.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ua1.C28628b0.m87608a(android.view.View):ua1.b0");
    }

    /* renamed from: d */
    public static C28628b0 m87609d(LayoutInflater layoutInflater) {
        return m87610e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28628b0 m87610e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_onboarding_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87608a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f72659d;
    }
}

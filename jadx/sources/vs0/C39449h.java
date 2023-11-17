package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import rs0.C38337d;

/* renamed from: vs0.h */
public final class C39449h implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93766d;

    /* renamed from: e */
    public final Input f93767e;

    /* renamed from: f */
    public final AppCompatTextView f93768f;

    /* renamed from: g */
    public final Barrier f93769g;

    /* renamed from: h */
    public final LoadingView f93770h;

    /* renamed from: i */
    public final Button f93771i;

    /* renamed from: j */
    public final PageDescriptionView f93772j;

    /* renamed from: k */
    public final View f93773k;

    /* renamed from: l */
    public final Guideline f93774l;

    /* renamed from: m */
    public final Guideline f93775m;

    /* renamed from: n */
    public final Guideline f93776n;

    private C39449h(ConstraintLayout constraintLayout, Input input, AppCompatTextView appCompatTextView, Barrier barrier, LoadingView loadingView, Button button, PageDescriptionView pageDescriptionView, View view, Guideline guideline, Guideline guideline2, Guideline guideline3) {
        this.f93766d = constraintLayout;
        this.f93767e = input;
        this.f93768f = appCompatTextView;
        this.f93769g = barrier;
        this.f93770h = loadingView;
        this.f93771i = button;
        this.f93772j = pageDescriptionView;
        this.f93773k = view;
        this.f93774l = guideline;
        this.f93775m = guideline2;
        this.f93776n = guideline3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = rs0.C38336c.f91857L;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vs0.C39449h m114651a(android.view.View r14) {
        /*
            int r0 = rs0.C38336c.f91872f
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.designsystem.components.input.Input r4 = (p341ge.bog.designsystem.components.input.Input) r4
            if (r4 == 0) goto L_0x0075
            int r0 = rs0.C38336c.f91880m
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L_0x0075
            int r0 = rs0.C38336c.amount_barrier
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            androidx.constraintlayout.widget.Barrier r6 = (androidx.constraintlayout.widget.Barrier) r6
            if (r6 == 0) goto L_0x0075
            int r0 = rs0.C38336c.amount_loader
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            ge.bog.designsystem.components.loading.LoadingView r7 = (p341ge.bog.designsystem.components.loading.LoadingView) r7
            if (r7 == 0) goto L_0x0075
            int r0 = rs0.C38336c.f91902z
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            ge.bog.designsystem.components.buttons.Button r8 = (p341ge.bog.designsystem.components.buttons.Button) r8
            if (r8 == 0) goto L_0x0075
            int r0 = rs0.C38336c.f91854G
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r9 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r9
            if (r9 == 0) goto L_0x0075
            int r0 = rs0.C38336c.f91857L
            android.view.View r10 = p086g1.C6202b.m24689a(r14, r0)
            if (r10 == 0) goto L_0x0075
            int r0 = rs0.C38336c.f91864Y
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r11 = r1
            androidx.constraintlayout.widget.Guideline r11 = (androidx.constraintlayout.widget.Guideline) r11
            if (r11 == 0) goto L_0x0075
            int r0 = rs0.C38336c.f91865Z
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r12 = r1
            androidx.constraintlayout.widget.Guideline r12 = (androidx.constraintlayout.widget.Guideline) r12
            if (r12 == 0) goto L_0x0075
            int r0 = rs0.C38336c.f91866a0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r13 = r1
            androidx.constraintlayout.widget.Guideline r13 = (androidx.constraintlayout.widget.Guideline) r13
            if (r13 == 0) goto L_0x0075
            vs0.h r0 = new vs0.h
            r3 = r14
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0075:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.C39449h.m114651a(android.view.View):vs0.h");
    }

    /* renamed from: d */
    public static C39449h m114652d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.fragment_close_piggy_bank, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114651a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93766d;
    }
}

package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p411em.C12489f;
import p90.C27272c8;

/* renamed from: jm.g */
public final class C16228g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f45831d;

    /* renamed from: e */
    public final EmptyWidget f45832e;

    /* renamed from: f */
    public final RecyclerView f45833f;

    /* renamed from: g */
    public final LoadingView f45834g;

    /* renamed from: h */
    public final ConstraintLayout f45835h;

    /* renamed from: i */
    public final AppCompatTextView f45836i;

    /* renamed from: j */
    public final Guideline f45837j;

    /* renamed from: k */
    public final Guideline f45838k;

    /* renamed from: l */
    public final FrameLayout f45839l;

    /* renamed from: m */
    public final Button f45840m;

    /* renamed from: n */
    public final C27272c8 f45841n;

    private C16228g(ConstraintLayout constraintLayout, EmptyWidget emptyWidget, RecyclerView recyclerView, LoadingView loadingView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, Guideline guideline, Guideline guideline2, FrameLayout frameLayout, Button button, C27272c8 c8Var) {
        this.f45831d = constraintLayout;
        this.f45832e = emptyWidget;
        this.f45833f = recyclerView;
        this.f45834g = loadingView;
        this.f45835h = constraintLayout2;
        this.f45836i = appCompatTextView;
        this.f45837j = guideline;
        this.f45838k = guideline2;
        this.f45839l = frameLayout;
        this.f45840m = button;
        this.f45841n = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r0 = p411em.C12488e.f37198d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p481jm.C16228g m57839a(android.view.View r14) {
        /*
            int r0 = p411em.C12488e.f37222t
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r4 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r4
            if (r4 == 0) goto L_0x0079
            int r0 = p411em.C12488e.cards_list
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0079
            int r0 = p411em.C12488e.cards_list_loader
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            ge.bog.designsystem.components.loading.LoadingView r6 = (p341ge.bog.designsystem.components.loading.LoadingView) r6
            if (r6 == 0) goto L_0x0079
            int r0 = p411em.C12488e.f37218p0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            if (r7 == 0) goto L_0x0079
            int r0 = p411em.C12488e.f37221s0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L_0x0079
            int r0 = p411em.C12488e.f37174D0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            androidx.constraintlayout.widget.Guideline r9 = (androidx.constraintlayout.widget.Guideline) r9
            if (r9 == 0) goto L_0x0079
            int r0 = p411em.C12488e.f37176E0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r10 = r1
            androidx.constraintlayout.widget.Guideline r10 = (androidx.constraintlayout.widget.Guideline) r10
            if (r10 == 0) goto L_0x0079
            int r0 = p411em.C12488e.f37184L1
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r11 = r1
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 == 0) goto L_0x0079
            int r0 = p411em.C12488e.f37188R1
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r12 = r1
            ge.bog.designsystem.components.buttons.Button r12 = (p341ge.bog.designsystem.components.buttons.Button) r12
            if (r12 == 0) goto L_0x0079
            int r0 = p411em.C12488e.f37198d2
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            if (r1 == 0) goto L_0x0079
            p90.c8 r13 = p90.C27272c8.m84388a(r1)
            jm.g r0 = new jm.g
            r3 = r14
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0079:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p481jm.C16228g.m57839a(android.view.View):jm.g");
    }

    /* renamed from: d */
    public static C16228g m57840d(LayoutInflater layoutInflater) {
        return m57841e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C16228g m57841e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.activity_card_application_types, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57839a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f45831d;
    }
}

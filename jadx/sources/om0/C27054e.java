package om0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import km0.C25746d;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: om0.e */
public final class C27054e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f67944d;

    /* renamed from: e */
    public final PageDescriptionView f67945e;

    /* renamed from: f */
    public final Button f67946f;

    /* renamed from: g */
    public final Input f67947g;

    /* renamed from: h */
    public final Button f67948h;

    /* renamed from: i */
    public final LinearLayout f67949i;

    /* renamed from: j */
    public final View f67950j;

    /* renamed from: k */
    public final Input f67951k;

    /* renamed from: l */
    public final Guideline f67952l;

    /* renamed from: m */
    public final Guideline f67953m;

    /* renamed from: n */
    public final Input f67954n;

    /* renamed from: o */
    public final Input f67955o;

    /* renamed from: p */
    public final ProgressBar f67956p;

    /* renamed from: q */
    public final FrameLayout f67957q;

    /* renamed from: r */
    public final Input f67958r;

    /* renamed from: s */
    public final NestedScrollView f67959s;

    private C27054e(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, Button button, Input input, Button button2, LinearLayout linearLayout, View view, Input input2, Guideline guideline, Guideline guideline2, Input input3, Input input4, ProgressBar progressBar, FrameLayout frameLayout, Input input5, NestedScrollView nestedScrollView) {
        this.f67944d = constraintLayout;
        this.f67945e = pageDescriptionView;
        this.f67946f = button;
        this.f67947g = input;
        this.f67948h = button2;
        this.f67949i = linearLayout;
        this.f67950j = view;
        this.f67951k = input2;
        this.f67952l = guideline;
        this.f67953m = guideline2;
        this.f67954n = input3;
        this.f67955o = input4;
        this.f67956p = progressBar;
        this.f67957q = frameLayout;
        this.f67958r = input5;
        this.f67959s = nestedScrollView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r1 = km0.C25745c.f65525l;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static om0.C27054e m83889a(android.view.View r20) {
        /*
            r0 = r20
            int r1 = km0.C25745c.activation_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r5 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r5
            if (r5 == 0) goto L_0x00b2
            int r1 = km0.C25745c.approve_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.buttons.Button r6 = (p341ge.bog.designsystem.components.buttons.Button) r6
            if (r6 == 0) goto L_0x00b2
            int r1 = km0.C25745c.birth_day_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.input.Input r7 = (p341ge.bog.designsystem.components.input.Input) r7
            if (r7 == 0) goto L_0x00b2
            int r1 = km0.C25745c.button_reject
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.buttons.Button r8 = (p341ge.bog.designsystem.components.buttons.Button) r8
            if (r8 == 0) goto L_0x00b2
            int r1 = km0.C25745c.f65524j
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L_0x00b2
            int r1 = km0.C25745c.f65525l
            android.view.View r10 = p086g1.C6202b.m24689a(r0, r1)
            if (r10 == 0) goto L_0x00b2
            int r1 = km0.C25745c.first_name_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.input.Input r11 = (p341ge.bog.designsystem.components.input.Input) r11
            if (r11 == 0) goto L_0x00b2
            int r1 = km0.C25745c.f65528p
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.constraintlayout.widget.Guideline r12 = (androidx.constraintlayout.widget.Guideline) r12
            if (r12 == 0) goto L_0x00b2
            int r1 = km0.C25745c.f65529q
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.constraintlayout.widget.Guideline r13 = (androidx.constraintlayout.widget.Guideline) r13
            if (r13 == 0) goto L_0x00b2
            int r1 = km0.C25745c.id_number_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.input.Input r14 = (p341ge.bog.designsystem.components.input.Input) r14
            if (r14 == 0) goto L_0x00b2
            int r1 = km0.C25745c.last_name_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.input.Input r15 = (p341ge.bog.designsystem.components.input.Input) r15
            if (r15 == 0) goto L_0x00b2
            int r1 = km0.C25745c.loader_progress
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            android.widget.ProgressBar r16 = (android.widget.ProgressBar) r16
            if (r16 == 0) goto L_0x00b2
            int r1 = km0.C25745c.f65532y
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.FrameLayout r17 = (android.widget.FrameLayout) r17
            if (r17 == 0) goto L_0x00b2
            int r1 = km0.C25745c.f65519E
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.input.Input r18 = (p341ge.bog.designsystem.components.input.Input) r18
            if (r18 == 0) goto L_0x00b2
            int r1 = km0.C25745c.scrolling_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.core.widget.NestedScrollView r19 = (androidx.core.widget.NestedScrollView) r19
            if (r19 == 0) goto L_0x00b2
            om0.e r1 = new om0.e
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x00b2:
            android.content.res.Resources r0 = r20.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: om0.C27054e.m83889a(android.view.View):om0.e");
    }

    /* renamed from: d */
    public static C27054e m83890d(LayoutInflater layoutInflater) {
        return m83891e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27054e m83891e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25746d.fragment_junior_child_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m83889a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f67944d;
    }
}

package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p356ao.C10115g;

/* renamed from: eo.g */
public final class C12744g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f37725d;

    /* renamed from: e */
    public final Button f37726e;

    /* renamed from: f */
    public final Button f37727f;

    /* renamed from: g */
    public final View f37728g;

    /* renamed from: h */
    public final PageDescriptionView f37729h;

    /* renamed from: i */
    public final FrameLayout f37730i;

    /* renamed from: j */
    public final InlineFeedback f37731j;

    private C12744g(ConstraintLayout constraintLayout, Button button, Button button2, View view, PageDescriptionView pageDescriptionView, FrameLayout frameLayout, InlineFeedback inlineFeedback) {
        this.f37725d = constraintLayout;
        this.f37726e = button;
        this.f37727f = button2;
        this.f37728g = view;
        this.f37729h = pageDescriptionView;
        this.f37730i = frameLayout;
        this.f37731j = inlineFeedback;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = p356ao.C10114f.f27944Y;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p413eo.C12744g m48369a(android.view.View r10) {
        /*
            int r0 = p356ao.C10114f.f27956h
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0049
            int r0 = p356ao.C10114f.f27929K
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x0049
            int r0 = p356ao.C10114f.f27944Y
            android.view.View r6 = p086g1.C6202b.m24689a(r10, r0)
            if (r6 == 0) goto L_0x0049
            int r0 = p356ao.C10114f.page_description2
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r7 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r7
            if (r7 == 0) goto L_0x0049
            int r0 = p356ao.C10114f.f27943X0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x0049
            int r0 = p356ao.C10114f.visa_feedback
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r9 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r9
            if (r9 == 0) goto L_0x0049
            eo.g r0 = new eo.g
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0049:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p413eo.C12744g.m48369a(android.view.View):eo.g");
    }

    /* renamed from: d */
    public static C12744g m48370d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.action_sheet_visa_concierge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48369a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f37725d;
    }
}

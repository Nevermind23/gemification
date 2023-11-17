package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: th0.o */
public final class C28416o implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72151d;

    /* renamed from: e */
    public final Input f72152e;

    /* renamed from: f */
    public final FixedButtonView f72153f;

    /* renamed from: g */
    public final PageDescriptionView f72154g;

    /* renamed from: h */
    public final FlexboxLayout f72155h;

    /* renamed from: i */
    public final TextView f72156i;

    /* renamed from: j */
    public final C28437y0 f72157j;

    private C28416o(ConstraintLayout constraintLayout, Input input, FixedButtonView fixedButtonView, PageDescriptionView pageDescriptionView, FlexboxLayout flexboxLayout, TextView textView, C28437y0 y0Var) {
        this.f72151d = constraintLayout;
        this.f72152e = input;
        this.f72153f = fixedButtonView;
        this.f72154g = pageDescriptionView;
        this.f72155h = flexboxLayout;
        this.f72156i = textView;
        this.f72157j = y0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = oh0.C27010e.templates_skeleton;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static th0.C28416o m87185a(android.view.View r10) {
        /*
            int r0 = oh0.C27010e.f67817c1
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.input.Input r4 = (p341ge.bog.designsystem.components.input.Input) r4
            if (r4 == 0) goto L_0x004d
            int r0 = oh0.C27010e.f67829l1
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r5 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r5
            if (r5 == 0) goto L_0x004d
            int r0 = oh0.C27010e.nomination_desc
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r6 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r6
            if (r6 == 0) goto L_0x004d
            int r0 = oh0.C27010e.templates_container
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            com.google.android.flexbox.FlexboxLayout r7 = (com.google.android.flexbox.FlexboxLayout) r7
            if (r7 == 0) goto L_0x004d
            int r0 = oh0.C27010e.templates_hint
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x004d
            int r0 = oh0.C27010e.templates_skeleton
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004d
            th0.y0 r9 = th0.C28437y0.m87271a(r1)
            th0.o r0 = new th0.o
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004d:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C28416o.m87185a(android.view.View):th0.o");
    }

    /* renamed from: d */
    public static C28416o m87186d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.fragment_gift_cards_nomination, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87185a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72151d;
    }
}

package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import rs0.C38337d;

/* renamed from: vs0.j */
public final class C39451j implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93787d;

    /* renamed from: e */
    public final Button f93788e;

    /* renamed from: f */
    public final View f93789f;

    /* renamed from: g */
    public final Guideline f93790g;

    /* renamed from: h */
    public final Guideline f93791h;

    /* renamed from: i */
    public final Guideline f93792i;

    /* renamed from: j */
    public final PageState f93793j;

    private C39451j(ConstraintLayout constraintLayout, Button button, View view, Guideline guideline, Guideline guideline2, Guideline guideline3, PageState pageState) {
        this.f93787d = constraintLayout;
        this.f93788e = button;
        this.f93789f = view;
        this.f93790g = guideline;
        this.f93791h = guideline2;
        this.f93792i = guideline3;
        this.f93793j = pageState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = rs0.C38336c.f91857L;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vs0.C39451j m114659a(android.view.View r10) {
        /*
            int r0 = rs0.C38336c.f91902z
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0049
            int r0 = rs0.C38336c.f91857L
            android.view.View r5 = p086g1.C6202b.m24689a(r10, r0)
            if (r5 == 0) goto L_0x0049
            int r0 = rs0.C38336c.f91864Y
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            androidx.constraintlayout.widget.Guideline r6 = (androidx.constraintlayout.widget.Guideline) r6
            if (r6 == 0) goto L_0x0049
            int r0 = rs0.C38336c.f91865Z
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            androidx.constraintlayout.widget.Guideline r7 = (androidx.constraintlayout.widget.Guideline) r7
            if (r7 == 0) goto L_0x0049
            int r0 = rs0.C38336c.f91866a0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            androidx.constraintlayout.widget.Guideline r8 = (androidx.constraintlayout.widget.Guideline) r8
            if (r8 == 0) goto L_0x0049
            int r0 = rs0.C38336c.request_state
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            ge.bog.designsystem.components.pagestate.PageState r9 = (p341ge.bog.designsystem.components.pagestate.PageState) r9
            if (r9 == 0) goto L_0x0049
            vs0.j r0 = new vs0.j
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
        throw new UnsupportedOperationException("Method not decompiled: vs0.C39451j.m114659a(android.view.View):vs0.j");
    }

    /* renamed from: d */
    public static C39451j m114660d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.fragment_close_piggy_bank_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114659a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93787d;
    }
}

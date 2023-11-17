package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import rs0.C38337d;

/* renamed from: vs0.t */
public final class C39461t implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93845d;

    /* renamed from: e */
    public final ChipGroup f93846e;

    /* renamed from: f */
    public final FixedButtonView f93847f;

    /* renamed from: g */
    public final PageDescriptionView f93848g;

    /* renamed from: h */
    public final View f93849h;

    private C39461t(ConstraintLayout constraintLayout, ChipGroup chipGroup, FixedButtonView fixedButtonView, PageDescriptionView pageDescriptionView, View view) {
        this.f93845d = constraintLayout;
        this.f93846e = chipGroup;
        this.f93847f = fixedButtonView;
        this.f93848g = pageDescriptionView;
        this.f93849h = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = rs0.C38336c.f91857L;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vs0.C39461t m114699a(android.view.View r8) {
        /*
            int r0 = rs0.C38336c.f91900y
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.designsystem.components.chips.ChipGroup r4 = (p341ge.bog.designsystem.components.chips.ChipGroup) r4
            if (r4 == 0) goto L_0x0033
            int r0 = rs0.C38336c.f91902z
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r5 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r5
            if (r5 == 0) goto L_0x0033
            int r0 = rs0.C38336c.f91854G
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r6 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r6
            if (r6 == 0) goto L_0x0033
            int r0 = rs0.C38336c.f91857L
            android.view.View r7 = p086g1.C6202b.m24689a(r8, r0)
            if (r7 == 0) goto L_0x0033
            vs0.t r0 = new vs0.t
            r3 = r8
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0033:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.C39461t.m114699a(android.view.View):vs0.t");
    }

    /* renamed from: d */
    public static C39461t m114700d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.layout_chip_group_selector_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114699a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93845d;
    }
}

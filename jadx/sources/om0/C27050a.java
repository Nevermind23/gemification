package om0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import km0.C25746d;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;

/* renamed from: om0.a */
public final class C27050a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f67919d;

    /* renamed from: e */
    public final AppCompatTextView f67920e;

    /* renamed from: f */
    public final CheckboxView f67921f;

    /* renamed from: g */
    public final CheckboxView f67922g;

    /* renamed from: h */
    public final Button f67923h;

    /* renamed from: i */
    public final View f67924i;

    /* renamed from: j */
    public final Guideline f67925j;

    /* renamed from: k */
    public final Guideline f67926k;

    /* renamed from: l */
    public final NestedScrollView f67927l;

    /* renamed from: m */
    public final AppCompatTextView f67928m;

    private C27050a(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, CheckboxView checkboxView, CheckboxView checkboxView2, Button button, View view, Guideline guideline, Guideline guideline2, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView2) {
        this.f67919d = constraintLayout;
        this.f67920e = appCompatTextView;
        this.f67921f = checkboxView;
        this.f67922g = checkboxView2;
        this.f67923h = button;
        this.f67924i = view;
        this.f67925j = guideline;
        this.f67926k = guideline2;
        this.f67927l = nestedScrollView;
        this.f67928m = appCompatTextView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = km0.C25745c.f65525l;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static om0.C27050a m83871a(android.view.View r13) {
        /*
            int r0 = km0.C25745c.activation_page_agree_terms_link
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L_0x006a
            int r0 = km0.C25745c.agree_review_info_checkbox
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            ge.bog.designsystem.components.checkbox.CheckboxView r5 = (p341ge.bog.designsystem.components.checkbox.CheckboxView) r5
            if (r5 == 0) goto L_0x006a
            int r0 = km0.C25745c.agree_terms_checkbox
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            ge.bog.designsystem.components.checkbox.CheckboxView r6 = (p341ge.bog.designsystem.components.checkbox.CheckboxView) r6
            if (r6 == 0) goto L_0x006a
            int r0 = km0.C25745c.approve_button
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x006a
            int r0 = km0.C25745c.f65525l
            android.view.View r8 = p086g1.C6202b.m24689a(r13, r0)
            if (r8 == 0) goto L_0x006a
            int r0 = km0.C25745c.f65528p
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            androidx.constraintlayout.widget.Guideline r9 = (androidx.constraintlayout.widget.Guideline) r9
            if (r9 == 0) goto L_0x006a
            int r0 = km0.C25745c.f65529q
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            androidx.constraintlayout.widget.Guideline r10 = (androidx.constraintlayout.widget.Guideline) r10
            if (r10 == 0) goto L_0x006a
            int r0 = km0.C25745c.f65520F
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r11 = r1
            androidx.core.widget.NestedScrollView r11 = (androidx.core.widget.NestedScrollView) r11
            if (r11 == 0) goto L_0x006a
            int r0 = km0.C25745c.terms_info_text
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r12 = r1
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            if (r12 == 0) goto L_0x006a
            om0.a r0 = new om0.a
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006a:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: om0.C27050a.m83871a(android.view.View):om0.a");
    }

    /* renamed from: d */
    public static C27050a m83872d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25746d.actionsheet_junior_terms, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m83871a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f67919d;
    }
}

package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import da0.C19952f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27486z7;

/* renamed from: ha0.a */
public final class C24923a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f64082d;

    /* renamed from: e */
    public final FixedButtonCardSelectorView f64083e;

    /* renamed from: f */
    public final FlexboxLayout f64084f;

    /* renamed from: g */
    public final Button f64085g;

    /* renamed from: h */
    public final TextView f64086h;

    /* renamed from: i */
    public final PageDescriptionView f64087i;

    /* renamed from: j */
    public final FrameLayout f64088j;

    /* renamed from: k */
    public final C27486z7 f64089k;

    /* renamed from: l */
    public final CardView f64090l;

    private C24923a(ConstraintLayout constraintLayout, FixedButtonCardSelectorView fixedButtonCardSelectorView, FlexboxLayout flexboxLayout, Button button, TextView textView, PageDescriptionView pageDescriptionView, FrameLayout frameLayout, C27486z7 z7Var, CardView cardView) {
        this.f64082d = constraintLayout;
        this.f64083e = fixedButtonCardSelectorView;
        this.f64084f = flexboxLayout;
        this.f64085g = button;
        this.f64086h = textView;
        this.f64087i = pageDescriptionView;
        this.f64088j = frameLayout;
        this.f64089k = z7Var;
        this.f64090l = cardView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = da0.C19951e.f54538t0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ha0.C24923a m79670a(android.view.View r12) {
        /*
            int r0 = da0.C19951e.card_selector
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView r4 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView) r4
            if (r4 == 0) goto L_0x0063
            int r0 = da0.C19951e.chip_container
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            com.google.android.flexbox.FlexboxLayout r5 = (com.google.android.flexbox.FlexboxLayout) r5
            if (r5 == 0) goto L_0x0063
            int r0 = da0.C19951e.deactivation_button
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            ge.bog.designsystem.components.buttons.Button r6 = (p341ge.bog.designsystem.components.buttons.Button) r6
            if (r6 == 0) goto L_0x0063
            int r0 = da0.C19951e.main_text
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0063
            int r0 = da0.C19951e.f54530k0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r8 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r8
            if (r8 == 0) goto L_0x0063
            int r0 = da0.C19951e.f54534p0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            if (r9 == 0) goto L_0x0063
            int r0 = da0.C19951e.f54538t0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0063
            p90.z7 r10 = p90.C27486z7.m85250a(r1)
            int r0 = da0.C19951e.f54539u0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r11 = r1
            androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
            if (r11 == 0) goto L_0x0063
            ha0.a r0 = new ha0.a
            r3 = r12
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0063:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C24923a.m79670a(android.view.View):ha0.a");
    }

    /* renamed from: d */
    public static C24923a m79671d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.accumulate_on_payment_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79670a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f64082d;
    }
}

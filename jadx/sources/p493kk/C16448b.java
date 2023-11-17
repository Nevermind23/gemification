package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.b */
public final class C16448b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f46460d;

    /* renamed from: e */
    public final FixedButtonCheckboxView f46461e;

    /* renamed from: f */
    public final PageDescriptionView f46462f;

    private C16448b(LinearLayout linearLayout, FixedButtonCheckboxView fixedButtonCheckboxView, PageDescriptionView pageDescriptionView) {
        this.f46460d = linearLayout;
        this.f46461e = fixedButtonCheckboxView;
        this.f46462f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C16448b m58595a(View view) {
        int i = C15526d.f44065a0;
        FixedButtonCheckboxView fixedButtonCheckboxView = (FixedButtonCheckboxView) C6202b.m24689a(view, i);
        if (fixedButtonCheckboxView != null) {
            i = C15526d.f44078n1;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                return new C16448b((LinearLayout) view, fixedButtonCheckboxView, pageDescriptionView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16448b m58596d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.action_sheet_confirm_automatic_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58595a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f46460d;
    }
}

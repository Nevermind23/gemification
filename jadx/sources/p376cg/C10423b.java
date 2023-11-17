package p376cg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p653wf.C18588q;
import p653wf.C18589r;

/* renamed from: cg.b */
public final class C10423b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f29635d;

    /* renamed from: e */
    public final FixedButtonCheckboxView f29636e;

    /* renamed from: f */
    public final PageDescriptionView f29637f;

    private C10423b(LinearLayout linearLayout, FixedButtonCheckboxView fixedButtonCheckboxView, PageDescriptionView pageDescriptionView) {
        this.f29635d = linearLayout;
        this.f29636e = fixedButtonCheckboxView;
        this.f29637f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C10423b m37857a(View view) {
        int i = C18588q.f52152I;
        FixedButtonCheckboxView fixedButtonCheckboxView = (FixedButtonCheckboxView) C6202b.m24689a(view, i);
        if (fixedButtonCheckboxView != null) {
            i = C18588q.text_pd;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                return new C10423b((LinearLayout) view, fixedButtonCheckboxView, pageDescriptionView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10423b m37858d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18589r.actionsheet_chat_privacy_policy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37857a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f29635d;
    }
}

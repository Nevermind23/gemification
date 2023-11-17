package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ue0.f */
public final class C28724f implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73221d;

    /* renamed from: e */
    public final Button f73222e;

    /* renamed from: f */
    public final PageDescriptionView f73223f;

    private C28724f(ConstraintLayout constraintLayout, Button button, PageDescriptionView pageDescriptionView) {
        this.f73221d = constraintLayout;
        this.f73222e = button;
        this.f73223f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28724f m88015a(View view) {
        int i = C25187g.buttonNext;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C25187g.pageDescriptionView2;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                return new C28724f((ConstraintLayout) view, button, pageDescriptionView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28724f m88016d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_gt_add_funds, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88015a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73221d;
    }
}

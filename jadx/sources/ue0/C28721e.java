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

/* renamed from: ue0.e */
public final class C28721e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73177d;

    /* renamed from: e */
    public final Button f73178e;

    /* renamed from: f */
    public final PageDescriptionView f73179f;

    private C28721e(ConstraintLayout constraintLayout, Button button, PageDescriptionView pageDescriptionView) {
        this.f73177d = constraintLayout;
        this.f73178e = button;
        this.f73179f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28721e m88002a(View view) {
        int i = C25187g.buttonOrder;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C25187g.f64669D2;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                return new C28721e((ConstraintLayout) view, button, pageDescriptionView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28721e m88003d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_gt_account_selector_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88002a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73177d;
    }
}

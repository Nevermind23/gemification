package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ue0.c */
public final class C28715c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73143d;

    /* renamed from: e */
    public final Button f73144e;

    /* renamed from: f */
    public final Button f73145f;

    /* renamed from: g */
    public final Guideline f73146g;

    /* renamed from: h */
    public final PageDescriptionView f73147h;

    private C28715c(ConstraintLayout constraintLayout, Button button, Button button2, Guideline guideline, PageDescriptionView pageDescriptionView) {
        this.f73143d = constraintLayout;
        this.f73144e = button;
        this.f73145f = button2;
        this.f73146g = guideline;
        this.f73147h = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28715c m87977a(View view) {
        int i = C25187g.f64694e0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C25187g.f64717s0;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C25187g.f64666B1;
                Guideline guideline = (Guideline) C6202b.m24689a(view, i);
                if (guideline != null) {
                    i = C25187g.page_desc;
                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                    if (pageDescriptionView != null) {
                        return new C28715c((ConstraintLayout) view, button, button2, guideline, pageDescriptionView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28715c m87978d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_close_gt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87977a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73143d;
    }
}

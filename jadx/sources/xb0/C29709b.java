package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.b */
public final class C29709b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f74975d;

    /* renamed from: e */
    public final PageDescriptionView f74976e;

    /* renamed from: f */
    public final RecyclerView f74977f;

    /* renamed from: g */
    public final PageDescriptionView f74978g;

    private C29709b(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, RecyclerView recyclerView, PageDescriptionView pageDescriptionView2) {
        this.f74975d = constraintLayout;
        this.f74976e = pageDescriptionView;
        this.f74977f = recyclerView;
        this.f74978g = pageDescriptionView2;
    }

    /* renamed from: a */
    public static C29709b m90202a(View view) {
        int i = C27985d.additional_feedback;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C27985d.deposit_break_options;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C27985d.deposit_break_options_description;
                PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView2 != null) {
                    return new C29709b((ConstraintLayout) view, pageDescriptionView, recyclerView, pageDescriptionView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29709b m90203d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.action_sheet_deposit_break_options, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90202a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f74975d;
    }
}

package vt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import rt0.C38341c;
import rt0.C38342d;

/* renamed from: vt0.b */
public final class C39465b implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f93859d;

    /* renamed from: e */
    public final RecyclerView f93860e;

    /* renamed from: f */
    public final PageDescriptionView f93861f;

    /* renamed from: g */
    public final InlineFeedback f93862g;

    private C39465b(NestedScrollView nestedScrollView, RecyclerView recyclerView, PageDescriptionView pageDescriptionView, InlineFeedback inlineFeedback) {
        this.f93859d = nestedScrollView;
        this.f93860e = recyclerView;
        this.f93861f = pageDescriptionView;
        this.f93862g = inlineFeedback;
    }

    /* renamed from: a */
    public static C39465b m114715a(View view) {
        int i = C38341c.guides_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C38341c.how_to_collect_description;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C38341c.product_feedback;
                InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                if (inlineFeedback != null) {
                    return new C39465b((NestedScrollView) view, recyclerView, pageDescriptionView, inlineFeedback);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39465b m114716d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38342d.action_sheet_stars_guide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114715a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f93859d;
    }
}

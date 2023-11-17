package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: pr0.n */
public final class C37963n implements C6201a {

    /* renamed from: d */
    private final LinearLayout f91234d;

    /* renamed from: e */
    public final PageDescriptionView f91235e;

    private C37963n(LinearLayout linearLayout, PageDescriptionView pageDescriptionView) {
        this.f91234d = linearLayout;
        this.f91235e = pageDescriptionView;
    }

    /* renamed from: a */
    public static C37963n m111597a(View view) {
        int i = C37130e.pageDescriptionState;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            return new C37963n((LinearLayout) view, pageDescriptionView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37963n m111598d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_history_schedule_data_not_found, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111597a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f91234d;
    }
}

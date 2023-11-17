package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.i */
public final class C40182i implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f95522d;

    /* renamed from: e */
    public final Button f95523e;

    /* renamed from: f */
    public final RecyclerView f95524f;

    /* renamed from: g */
    public final PageDescriptionView f95525g;

    private C40182i(NestedScrollView nestedScrollView, Button button, RecyclerView recyclerView, PageDescriptionView pageDescriptionView) {
        this.f95522d = nestedScrollView;
        this.f95523e = button;
        this.f95524f = recyclerView;
        this.f95525g = pageDescriptionView;
    }

    /* renamed from: a */
    public static C40182i m116435a(View view) {
        int i = C40030d.button_choose_policy;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C40030d.insurance_list_recycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C40030d.travel_insurance_page_description;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    return new C40182i((NestedScrollView) view, button, recyclerView, pageDescriptionView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40182i m116436d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.fragment_travel_insurance_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116435a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f95522d;
    }
}

package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.search.SearchView;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.d */
public final class C24896d implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f63912d;

    /* renamed from: e */
    public final PageDescriptionView f63913e;

    /* renamed from: f */
    public final CardView f63914f;

    /* renamed from: g */
    public final RecyclerView f63915g;

    /* renamed from: h */
    public final SearchView f63916h;

    private C24896d(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, CardView cardView, RecyclerView recyclerView, SearchView searchView) {
        this.f63912d = constraintLayout;
        this.f63913e = pageDescriptionView;
        this.f63914f = cardView;
        this.f63915g = recyclerView;
        this.f63916h = searchView;
    }

    /* renamed from: a */
    public static C24896d m79565a(View view) {
        int i = C28606b.empty_hint;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C28606b.f72609u0;
            CardView cardView = (CardView) C6202b.m24689a(view, i);
            if (cardView != null) {
                i = C28606b.f72613x0;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    i = C28606b.f72575G0;
                    SearchView searchView = (SearchView) C6202b.m24689a(view, i);
                    if (searchView != null) {
                        return new C24896d((ConstraintLayout) view, pageDescriptionView, cardView, recyclerView, searchView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24896d m79566d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.action_sheet_income_organization, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79565a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f63912d;
    }
}

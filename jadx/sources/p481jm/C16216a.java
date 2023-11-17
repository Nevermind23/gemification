package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.a */
public final class C16216a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f45766d;

    /* renamed from: e */
    public final RecyclerView f45767e;

    /* renamed from: f */
    public final PageDescriptionView f45768f;

    private C16216a(ConstraintLayout constraintLayout, RecyclerView recyclerView, PageDescriptionView pageDescriptionView) {
        this.f45766d = constraintLayout;
        this.f45767e = recyclerView;
        this.f45768f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C16216a m57792a(View view) {
        int i = C12488e.renewal_card_list;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C12488e.renewal_description;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                return new C16216a((ConstraintLayout) view, recyclerView, pageDescriptionView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16216a m57793d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.action_sheet_card_renewal_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57792a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f45766d;
    }
}

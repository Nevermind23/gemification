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

/* renamed from: jm.e */
public final class C16224e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f45791d;

    /* renamed from: e */
    public final PageDescriptionView f45792e;

    /* renamed from: f */
    public final RecyclerView f45793f;

    private C16224e(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, RecyclerView recyclerView) {
        this.f45791d = constraintLayout;
        this.f45792e = pageDescriptionView;
        this.f45793f = recyclerView;
    }

    /* renamed from: a */
    public static C16224e m57824a(View view) {
        int i = C12488e.information_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C12488e.owner_list;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C16224e((ConstraintLayout) view, pageDescriptionView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16224e m57825d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.action_sheet_scool_card_owner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57824a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f45791d;
    }
}

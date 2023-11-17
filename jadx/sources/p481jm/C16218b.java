package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.search.SearchView;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.b */
public final class C16218b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f45770d;

    /* renamed from: e */
    public final RecyclerView f45771e;

    /* renamed from: f */
    public final AppCompatImageView f45772f;

    /* renamed from: g */
    public final AppCompatTextView f45773g;

    /* renamed from: h */
    public final Group f45774h;

    /* renamed from: i */
    public final SearchView f45775i;

    private C16218b(ConstraintLayout constraintLayout, RecyclerView recyclerView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Group group, SearchView searchView) {
        this.f45770d = constraintLayout;
        this.f45771e = recyclerView;
        this.f45772f = appCompatImageView;
        this.f45773g = appCompatTextView;
        this.f45774h = group;
        this.f45775i = searchView;
    }

    /* renamed from: a */
    public static C16218b m57800a(View view) {
        int i = C12488e.addresses;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C12488e.f37182J0;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C12488e.only_tbilisi_hint;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C12488e.only_tbilisi_info;
                    Group group = (Group) C6202b.m24689a(view, i);
                    if (group != null) {
                        i = C12488e.f37190T1;
                        SearchView searchView = (SearchView) C6202b.m24689a(view, i);
                        if (searchView != null) {
                            return new C16218b((ConstraintLayout) view, recyclerView, appCompatImageView, appCompatTextView, group, searchView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16218b m57801d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.action_sheet_choose_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57800a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f45770d;
    }
}

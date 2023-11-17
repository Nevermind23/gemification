package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: iy0.a */
public final class C36578a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88137d;

    /* renamed from: e */
    public final RecyclerView f88138e;

    private C36578a(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f88137d = constraintLayout;
        this.f88138e = recyclerView;
    }

    /* renamed from: a */
    public static C36578a m108437a(View view) {
        int i = C36271e.account_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C36578a((ConstraintLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36578a m108438d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.action_sheet_account_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108437a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88137d;
    }
}

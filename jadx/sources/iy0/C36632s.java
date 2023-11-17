package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hy0.C36272f;
import p086g1.C6201a;

/* renamed from: iy0.s */
public final class C36632s implements C6201a {

    /* renamed from: d */
    private final RecyclerView f88413d;

    /* renamed from: e */
    public final RecyclerView f88414e;

    private C36632s(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f88413d = recyclerView;
        this.f88414e = recyclerView2;
    }

    /* renamed from: a */
    public static C36632s m108663a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C36632s(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36632s m108664d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.fragment_loan_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108663a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f88413d;
    }
}

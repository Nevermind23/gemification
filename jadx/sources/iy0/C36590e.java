package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hy0.C36272f;
import p086g1.C6201a;

/* renamed from: iy0.e */
public final class C36590e implements C6201a {

    /* renamed from: d */
    private final RecyclerView f88177d;

    /* renamed from: e */
    public final RecyclerView f88178e;

    private C36590e(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f88177d = recyclerView;
        this.f88178e = recyclerView2;
    }

    /* renamed from: a */
    public static C36590e m108486a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C36590e(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36590e m108487d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.action_sheet_choose_card_for_insurance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108486a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f88177d;
    }
}

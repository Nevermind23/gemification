package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import rb0.C27986e;

/* renamed from: xb0.a */
public final class C29707a implements C6201a {

    /* renamed from: d */
    private final RecyclerView f74972d;

    private C29707a(RecyclerView recyclerView) {
        this.f74972d = recyclerView;
    }

    /* renamed from: a */
    public static C29707a m90194a(View view) {
        if (view != null) {
            return new C29707a((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C29707a m90195d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.action_sheet_choose_saving_goal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90194a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f74972d;
    }
}
